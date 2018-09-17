package com.anuwk.controz.enums;

public enum EResponseInfo {
	
	SUCCESS("20000","Success"),
	URL_NOT_FOUND("40000","Url Not Found"),
	INTERNAL_ERROR("50000","Internal Error"),
	METHOD_NOT_SUPPORT("40500","Method Not Support");
	
	
	private final String resultCode;
	private final String resultDescription;
	
	
	private EResponseInfo(String resultCode, String resultDescription) {
		this.resultCode = resultCode;
		this.resultDescription = resultDescription;
	}
	
	
	public String getResultCode() {
		return resultCode;
	}
	public String getResultDescription() {
		return resultDescription;
	}	
	
	

}
