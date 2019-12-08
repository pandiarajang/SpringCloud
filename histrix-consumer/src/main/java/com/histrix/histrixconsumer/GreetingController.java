package com.histrix.histrixconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Autowired
	private GreetingService greetingService;
	
	@RequestMapping("/get-greeting")
	public String getGreeting(String username) {
		
		return greetingService.getGreeting(username);
	}
	
}
