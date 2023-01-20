package com.ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@GetMapping("/welcome")
	public String welocmeMsg() {
		return "Welcome to Deployement of Maven-Web-App using Jenkins(Build & Automation Tool) in Tomcat Server.";
	}
}
