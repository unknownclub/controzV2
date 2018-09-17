package com.anuwk.controz.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class ApplicationProperties {


	public static String CUSTOMLOGPATH;

	@Value("${customLogPath}")
	public void setCustomLogPath(String customLogPath) {
	CUSTOMLOGPATH = customLogPath;
	}
	
	
	
	
	
}
