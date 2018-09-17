package com.anuwk.controz;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.anuwk.controz.properties.ApplicationProperties;

@SpringBootApplication
public class ControzApplication implements CommandLineRunner {

	public static void main(String[] args) throws Exception {
		//Locale.setDefault(Locale.US); 
		SpringApplication.run(ControzApplication.class, args);

	}

	// access command line arguments
	@Override
	public void run(String... args) throws Exception {

		LoggerContext context = (org.apache.logging.log4j.core.LoggerContext) LogManager
				.getContext(false);

		File file = new File(ApplicationProperties.CUSTOMLOGPATH);

		context.setConfigLocation(file.toURI());

	}

}