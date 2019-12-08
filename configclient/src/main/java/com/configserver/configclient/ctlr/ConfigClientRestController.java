package com.configserver.configclient.ctlr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigClientRestController {

	@Value("${message: Default Message}")
	private String message="Hi";
	
	@RequestMapping("/message")
	public String getMessage() {
		return message;
	}
	
	@Value("${user.role: Default Role}")
	private String role;
	
	@RequestMapping("/whoami")
	public String whoami(String name) {
		
		return "You are "+name+" and your role is " + role;
	}
}
