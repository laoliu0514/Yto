package com.dl.pojo;

public class ResponseOrderResponse {
	
	private String ClientID;
	private String LogisticProviderID;
	private String OrderID;
	private String ResultFlag;
	private String ErrCode;
	private String ErrMsg;
	@Override
	public String toString() {
		return "ResponseOrderResponse [ClientID=" + ClientID + ", LogisticProviderID=" + LogisticProviderID
				+ ", OrderID=" + OrderID + ", ResultFlag=" + ResultFlag + ", ErrCode=" + ErrCode + ", ErrMsg=" + ErrMsg
				+ "]";
	}
	public String getClientID() {
		return ClientID;
	}
	public void setClientID(String clientID) {
		ClientID = clientID;
	}
	public String getLogisticProviderID() {
		return LogisticProviderID;
	}
	public void setLogisticProviderID(String logisticProviderID) {
		LogisticProviderID = logisticProviderID;
	}
	public String getOrderID() {
		return OrderID;
	}
	public void setOrderID(String orderID) {
		OrderID = orderID;
	}
	public String getResultFlag() {
		return ResultFlag;
	}
	public void setResultFlag(String resultFlag) {
		ResultFlag = resultFlag;
	}
	public String getErrCode() {
		return ErrCode;
	}
	public void setErrCode(String errCode) {
		ErrCode = errCode;
	}
	public String getErrMsg() {
		return ErrMsg;
	}
	public void setErrMsg(String errMsg) {
		ErrMsg = errMsg;
	}
	
	
	
}
