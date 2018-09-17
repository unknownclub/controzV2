package com.anuwk.controz.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.anuwk.controz.enums.EResponseInfo;
import com.anuwk.controz.model.ResponseData;



@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ResponseData> handleAllException
	(Exception ex, WebRequest request) throws Exception {
		
		ResponseData exce =  new ResponseData(EResponseInfo.INTERNAL_ERROR.getResultCode(),EResponseInfo.INTERNAL_ERROR.getResultDescription());
		
		return new ResponseEntity<>(exce,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
//	@Override
//	protected ResponseEntity<Object> handleNoHandlerFoundException(
//	  NoHandlerFoundException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
//		ResponseData exce =  new ResponseData(EResponseInfo.URL_NOT_FOUND.getResultCode(),EResponseInfo.URL_NOT_FOUND.getResultDescription());
//		
//		return new ResponseEntity<>(exce,HttpStatus.NOT_FOUND);
//	}
//
//	@SuppressWarnings("deprecation")
//	@Override
//	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(
//			HttpRequestMethodNotSupportedException ex, HttpHeaders headers,
//			HttpStatus status, WebRequest request) {
//	ResponseData exce =  new ResponseData(EResponseInfo.METHOD_NOT_SUPPORT.getResultCode(),EResponseInfo.METHOD_NOT_SUPPORT.getResultDescription());
//		
//		return new ResponseEntity<>(exce,HttpStatus.METHOD_FAILURE);
//	}
//	
	
	


	
	
	

	
	

}