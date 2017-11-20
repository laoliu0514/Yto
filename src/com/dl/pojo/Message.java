package com.dl.pojo;

public class Message {
	
	private Header header;
	private RequestOrder requestOrder;
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public RequestOrder getRequestOrder() {
		return requestOrder;
	}
	public void setRequestOrder(RequestOrder requestOrder) {
		this.requestOrder = requestOrder;
	}
	@Override
	public String toString() {
		return "Message [header=" + header + ", requestOrder=" + requestOrder + "]";
	}
	
	
}
