package com.dl.pojo;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import com.dl.http.HttpClientService;
import com.dl.util.SendContent;

public class YtoUtils {
	
	private static String xmlPath="order.xml";
	private static String key="INTERFACESTANDARDENCRYPTKEY2014";//测试密钥
	private static String partnered="TESTSTD";//测试
	private static String clientID="TESTSTD";//测试
	private static String YtoUrl="http://180.153.190.90/globalunion/outcall/blcWayBill";//测试地址
	
	
	public static void pushOrderMsgHttp(Message message){
		//1.生成发送给圆通的XML文件
		Element root=DocumentHelper.createElement("Message");
		Document document=DocumentHelper.createDocument(root);
		//1.2给root节点添加子节点
		Element header=root.addElement("Header");
		createXml(message.getHeader(), header);
		Element requestOrder=root.addElement("RequestOrder");
		createXml(message.getRequestOrder(), requestOrder);
		//1.3生成xml文件存放在硬盘上
		OutputFormat outputFormat=new OutputFormat("",false);
		outputFormat.setEncoding("utf-8");
		try {
			XMLWriter writer= new XMLWriter(new FileOutputStream(xmlPath), outputFormat);
			writer.write(document);;
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//2.加密xml
		try {
			
			
			//3.发送post请求
			//创建SAXReader对象  
	        SAXReader reader = new SAXReader();  
	        //读取文件 转换成Document  
	        Document document1 = reader.read(new File(xmlPath));  
	        //document转换为String字符串  
	        String documentStr = document1.asXML();  
			
	        String logistics_interface = SendContent.encryptSendData(key, documentStr);
			String data_digest = SendContent.signuatureSendData(partnered, logistics_interface);
			Map<String, String> params=new  HashMap<>();
			params.put("logistics_interface", logistics_interface);
			params.put("data_digest", data_digest);
			params.put("clientID", clientID);
	        
			String response=HttpClientService.doPost(YtoUrl, params,"UTF-8");
			
			//4.解析发送数据返回的xml
			MessageResponse messageResponse=parseXmlStr(response);
			
			String success=messageResponse.getHeaderResponse().getSuccess();
			if(success.equals("true")){
				//发送成功
				System.out.println(messageResponse);
			}else{
				//发送失败
				System.out.println(messageResponse);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	/**
	 * 解析xml
	 * @param response
	 * @throws DocumentException 
	 */
	private static MessageResponse parseXmlStr(String response) throws DocumentException {
		//将字符串转换为XML
		Document document=DocumentHelper.parseText(response);
		//获取根节点
		Element root=document.getRootElement();
		//获取根节点的子节点header
		Iterator<?> iterator=root.elementIterator("Header");
		MessageResponse messageResponse=new MessageResponse();
		HeaderResponse headerResponse=new HeaderResponse();
		while(iterator.hasNext()){
			Element recordEle=(Element) iterator.next();
			String SeqNo=recordEle.elementTextTrim("SeqNo");
			headerResponse.setSeqNo(SeqNo);
			String SendTimeStamp=recordEle.elementTextTrim("SendTimeStamp");
			headerResponse.setSendTimeStamp(SendTimeStamp);
			String success=recordEle.elementTextTrim("success");
			headerResponse.setSuccess(success);
		}
		Iterator<?> iterator2=root.elementIterator("ResponseOrder");
		
		ResponseOrderResponse orderResponse=new ResponseOrderResponse();
		while(iterator2.hasNext()){
			Element recordEle=(Element) iterator2.next();
			String ClientID=recordEle.elementTextTrim("ClientID");
			orderResponse.setClientID(ClientID);
			String LogisticProviderID=recordEle.elementTextTrim("LogisticProviderID");
			orderResponse.setLogisticProviderID(LogisticProviderID);
			String OrderID=recordEle.elementTextTrim("OrderID");
			orderResponse.setOrderID(OrderID);
			String ResultFlag=recordEle.elementTextTrim("ResultFlag");
			orderResponse.setResultFlag(ResultFlag);
			String ErrCode=recordEle.elementTextTrim("ErrCode");
			orderResponse.setErrCode(ErrCode);
			String ErrMsg=recordEle.elementTextTrim("ErrMsg");
			orderResponse.setErrMsg(ErrMsg);
		}
		
		messageResponse.setHeaderResponse(headerResponse);
		messageResponse.setOrderResponse(orderResponse);
		
		return messageResponse;
	}

	public static void createXml(Object object,Element element)  {
		String fieldName = "";
		Object value;
		try {
			// 获取object的类型
			Class<? extends Object> clazz = object.getClass();
			// 获取该类型声明的成员
			Field[] fields = clazz.getDeclaredFields();
			// 遍历属性
			for (Field field : fields) {
				fieldName = field.getName();
				// 对于private私有化的成员变量，通过setAccessible来修改器访问权限
				field.setAccessible(true);
				//获取属性值
				value=field.get(object);
				if(value==null){
					element.addElement(fieldName).addText("");
				}else{
					element.addElement(fieldName).addText(value.toString());
					
				}
				// 重新设置会私有权限
				field.setAccessible(false);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		Message message=new Message();
		Header header=new Header();
		header.setSeqNo("123121312");
		header.setSendTimeStamp(new Date().toString());
		message.setHeader(header);
		RequestOrder order=new RequestOrder();
		order.setClientID("TESTSTD");
		order.setLogisticProviderID("YTO");
		order.setCustomsID("TESTSTD");
		order.setDataType("BL");
		order.setLogisticsCode("L0007");
		order.setLogisticsName("河南圆通速递有限公司");
		order.setLogisticsCodeCiq("U00000568");
//		order.setLogisticsNameCiq("国检备案物流企业名称");
		order.setLogisticsNo("DD07153125");
		order.setOrderNo("SO17102400067593");
		order.setPlatformCode("D00001");
//		order.setPlatformName("测试电商平台名称");
//		order.setPlatformCodeCiq("国检备案的电商平台代码");
//		order.setPlatformNameCiq("国检备案的电商平台名称");
		order.setShipping("刘冬冬");
		order.setShippingAddress("澳大利亚新西兰");
		order.setShippingCountryCiq("036"); 
		order.setShippingCountryCus("601");
		order.setConsignee("杨健");
		order.setConsigneeAddress("浙江省杭州市江干区白杨街道");
		order.setConsigneeTelephone("13511111111");
		order.setConsigneeZipCode("642185");
		order.setConsigneeCountryCiq("156");
		order.setConsigneeCountryCus("142");
		order.setIdType("1");
		order.setIdNumber("511027198901021458423");
		order.setWorth("30.51");
		order.setGrossWeight("1.00");
		order.setPackageTypeCiq("4M");
		order.setNetWeight("0.6");
		order.setGoodsName("衣物");
		order.setTransportationMethod("7");
		order.setShipCode("50");
		order.setIeType("I");
		order.setStockFlag("1");
		order.setBatchNumbers("12345698732");
		order.setTradeCountryCiq("036");
//		order.setAgentCodeCiq("国检备案的代理企业代码");
//		order.setAgentName("国检备案的代理企业名称");
		order.setBillType("3");
		order.setModifyMark("1");
		
		message.setRequestOrder(order);
		pushOrderMsgHttp(message);
	}
}
