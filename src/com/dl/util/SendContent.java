package com.dl.util;

import java.security.MessageDigest;

import org.apache.commons.codec.binary.Base64;

public class SendContent {
	
	//logistics_interface报文DES+Base64
	public static String encryptSendData(String key, String data){
		if(key == null || data == null){
			return data;
		}
		
		String encryptData = getEncString(key, data);
		encryptData = new String(Base64.encodeBase64(encryptData.getBytes()));
		return encryptData;
	}
	
	public static String getEncString(String publicKey, String data){
		return new Des(publicKey).getEncString(data);
	} 
	
	//data_digest报文MD5
	public static String signuatureSendData(String companyCode, String encryptData){
		if (companyCode == null || encryptData == null){
			return encryptData;
		}
		try {
			MessageDigest messagedigest = MessageDigest.getInstance("MD5");
			messagedigest.update((companyCode + encryptData + companyCode).getBytes("UTF-8"));
			byte[] digestData = messagedigest.digest();
			String encodeData = new String(Base64.encodeBase64(digestData));
			return encodeData;
		} catch (Exception e) {}
		return encryptData;
	}
	
	//发送报文，打印返回信息
//	public static void sendAndGetStr(String apiUrl, String data){
//		try {
//			URL url = new URL(apiUrl);
//			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//			connection.setDoOutput(true);
//			connection.setRequestMethod("POST");
//			OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
//			
//			long a = System.currentTimeMillis();
//			
//			out.write(data);
//			out.flush();
//			out.close();
//			
//			String responseString = "";
//			String strLine = "";
//			InputStream in = connection.getInputStream();
//			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//			while ((strLine = reader.readLine()) != null ){
//				responseString += strLine + "\n";
//			}
//			
//			in.close();
//			
//			long b = System.currentTimeMillis();
//			
//			long c = b - a;
//			System.err.println("时间：\t\t" + c + "ms");
//			
//			System.err.println("返回信息：" + "\n" + responseString);
//		} catch (Exception e){
//			e.printStackTrace();
//		}
//	}
	
}
