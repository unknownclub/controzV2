package com.anuwk.controz.utils;

import com.anuwk.controz.constant.CustomConstant;
import com.anuwk.controz.enums.ECommand;

public class StampLogUtils {
	
	
	public static String printLog(ECommand eCommand){
		return "CALLING Command:"
		.concat(CustomConstant.SPACE)
		.concat(eCommand.getCommand())
		.concat(CustomConstant.SPACE)
		.concat("IN URL:").concat(CustomConstant.SPACE)
		.concat(eCommand.getUri());
	}

}
