package com.anuwk.controz.controller;

import com.anuwk.controz.model.ResponseData;

public interface IBatchController {
	
	public ResponseData executeBillUserList() throws Exception;

	public ResponseData executeBillPayment() throws Exception;
	
	public ResponseData executeBillPaymentclearTerminate() throws Exception;
	
	public ResponseData executeGenCdrMPayDaily() throws Exception;
	
	public ResponseData executeAutoConfirmJob() throws Exception;
	
	public ResponseData executeAutoReleaseJob() throws Exception;
	
	public ResponseData executeMsisdnCreditLimitList() throws Exception;
	
	public ResponseData executehouseKeeper() throws Exception;

}
