package com.anuwk.controz.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anuwk.controz.enums.ECommand;
import com.anuwk.controz.enums.EResponseInfo;
import com.anuwk.controz.model.ResponseData;
import com.anuwk.controz.utils.StampLogUtils;


@RestController
public class BatchControllerImpl implements IBatchController{
	
	private static final Logger Logger = LogManager.getLogger(BatchControllerImpl.class);
	
	ResponseData responseData;
	

	@Override
	@GetMapping("/billUserList/execute")
	public ResponseData executeBillUserList() throws Exception {
		Logger.info(StampLogUtils.printLog(ECommand.CMD_BILL_USER_LIST));
		responseData = new ResponseData(EResponseInfo.SUCCESS.getResultCode(),EResponseInfo.SUCCESS.getResultDescription());
		return responseData;
	}

	@Override
	@GetMapping("/billPayment/execute")
	public ResponseData executeBillPayment() throws Exception {
		Logger.info(StampLogUtils.printLog(ECommand.CMD_BILL_PAYMENT));	
		responseData = new ResponseData(EResponseInfo.SUCCESS.getResultCode(),EResponseInfo.SUCCESS.getResultDescription());
		return responseData;
	}

	@Override
	@GetMapping("/billPaymentclearTerminate/execute")
	public ResponseData executeBillPaymentclearTerminate() throws Exception {
		Logger.info(StampLogUtils.printLog(ECommand.CMD_BILL_PAYMENT_CLEAR_TERMINATE));	
		responseData = new ResponseData(EResponseInfo.SUCCESS.getResultCode(),EResponseInfo.SUCCESS.getResultDescription());
		return responseData;
		
	}

	@Override
	@GetMapping("/mPAY/execute")
	public ResponseData executeGenCdrMPayDaily() throws Exception {
		Logger.info(StampLogUtils.printLog(ECommand.CMD_GEN_CDR_MAPY_DAILY));	
		responseData = new ResponseData(EResponseInfo.SUCCESS.getResultCode(),EResponseInfo.SUCCESS.getResultDescription());
		return responseData;
		
	}

	@Override
	@GetMapping("/doExecuteJobConfirm/execute")
	public ResponseData executeAutoConfirmJob() throws Exception {
		Logger.info(StampLogUtils.printLog(ECommand.CMD_AUTO_CONFIRM_JOB));	
		responseData = new ResponseData(EResponseInfo.SUCCESS.getResultCode(),EResponseInfo.SUCCESS.getResultDescription());
		return responseData;
		
	}

	@Override
	@GetMapping("/doExecuteJobRelease/execute")
	public ResponseData executeAutoReleaseJob() throws Exception {
		Logger.info(StampLogUtils.printLog(ECommand.CMD_AUTO_RELEASE_JOB));	
		responseData = new ResponseData(EResponseInfo.SUCCESS.getResultCode(),EResponseInfo.SUCCESS.getResultDescription());
		return responseData;
		
	}

	@Override
	@GetMapping("/executeListMsisdnCreditLimit/execute")
	public ResponseData executeMsisdnCreditLimitList() throws Exception {
		Logger.info(StampLogUtils.printLog(ECommand.CMD_MSISDN_CREDIT_LIMIT_LIST));	
		responseData = new ResponseData(EResponseInfo.SUCCESS.getResultCode(),EResponseInfo.SUCCESS.getResultDescription());
		return responseData;
		
	}

	@Override
	@GetMapping("/houseKeeper/execute")
	public ResponseData executehouseKeeper() throws Exception {
		Logger.info(StampLogUtils.printLog(ECommand.CMD_HOUSEKEEPER));	
		responseData = new ResponseData(EResponseInfo.SUCCESS.getResultCode(),EResponseInfo.SUCCESS.getResultDescription());
		return responseData;
		
	}
	
	
	

}
