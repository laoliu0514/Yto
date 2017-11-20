package com.dl.pojo;

public class Header {
	
	private String seqNo;
	private String sendTimeStamp;
	public String getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}
	public String getSendTimeStamp() {
		return sendTimeStamp;
	}
	public void setSendTimeStamp(String sendTimeStamp) {
		this.sendTimeStamp = sendTimeStamp;
	}
	@Override
	public String toString() {
		return "Header [seqNo=" + seqNo + ", sendTimeStamp=" + sendTimeStamp + "]";
	}
	
	
}
