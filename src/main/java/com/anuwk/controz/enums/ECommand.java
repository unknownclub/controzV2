package com.anuwk.controz.enums;

public enum ECommand {
	
CMD_BILL_USER_LIST("billUserList","/billUserList/execute"),
CMD_BILL_PAYMENT("billPayment","/billPayment/execute"), 
CMD_BILL_PAYMENT_CLEAR_TERMINATE("","/billPaymentclearTerminate/execute"), 
CMD_GEN_CDR_MAPY_DAILY("mPAY","/mPAY/execute"),
CMD_AUTO_CONFIRM_JOB("doExecuteJobConfirm","/doExecuteJobConfirm/execute"), 
CMD_AUTO_RELEASE_JOB("doExecuteJobRelease","/doExecuteJobRelease/execute"),
CMD_MSISDN_CREDIT_LIMIT_LIST("executeListMsisdnCreditLimit","/executeListMsisdnCreditLimit/execute"), 
CMD_HOUSEKEEPER("houseKeeper","/houseKeeper/execute");
	
	
	private final String command;
	private final String uri;
	
	
	private ECommand(String command, String uri) {
		this.command = command;
		this.uri = uri;
	}


	public String getCommand() {
		return command;
	}


	public String getUri() {
		return uri;
	}
	
	
	
	

}
