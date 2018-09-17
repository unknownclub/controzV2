package com.anuwk.controz.model;

public class ResponseData {
	
	private String resultCode;
	private String developerMessage;
	
	
	
	public ResponseData(String resultCode, String developerMessage) {
		this.resultCode = resultCode;
		this.developerMessage = developerMessage;
	}
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getDeveloperMessage() {
		return developerMessage;
	}
	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}
	
	
	
	

}
