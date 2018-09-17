package com.anuwk.controz.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/jobs")
public class TestController {
	
	@GetMapping("/test")
	public String getTest(){
		return "This is fucking awesome response .Time >> " + new Date();
	}

}


