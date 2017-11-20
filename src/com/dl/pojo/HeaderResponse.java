package com.dl.pojo;

public class HeaderResponse {
	
	private String SeqNo;
	private String SendTimeStamp;
	private String success;
	public String getSeqNo() {
		return SeqNo;
	}
	public void setSeqNo(String seqNo) {
		SeqNo = seqNo;
	}
	public String getSendTimeStamp() {
		return SendTimeStamp;
	}
	public void setSendTimeStamp(String sendTimeStamp) {
		SendTimeStamp = sendTimeStamp;
	}
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	@Override
	public String toString() {
		return "HeaderResponse [SeqNo=" + SeqNo + ", SendTimeStamp=" + SendTimeStamp + ", success=" + success + "]";
	}
	
	
}
