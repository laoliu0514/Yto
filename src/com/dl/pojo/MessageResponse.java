package com.dl.pojo;

public class MessageResponse {
	
	private HeaderResponse headerResponse;
	private ResponseOrderResponse orderResponse;
	public HeaderResponse getHeaderResponse() {
		return headerResponse;
	}
	public void setHeaderResponse(HeaderResponse headerResponse) {
		this.headerResponse = headerResponse;
	}
	public ResponseOrderResponse getOrderResponse() {
		return orderResponse;
	}
	public void setOrderResponse(ResponseOrderResponse orderResponse) {
		this.orderResponse = orderResponse;
	}
	@Override
	public String toString() {
		return "MessageResponse [headerResponse=" + headerResponse + ", orderResponse=" + orderResponse + "]";
	}
	
	
}
