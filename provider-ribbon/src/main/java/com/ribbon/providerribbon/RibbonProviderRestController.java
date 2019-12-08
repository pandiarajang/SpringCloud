package com.ribbon.providerribbon;



import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonProviderRestController {

	@Value("${server.port}")
	private int port;
	
	@RequestMapping("/")
	public String home() {
		return "Hello";
	}
	
	@RequestMapping("/message")
	public String serverMsg() {
		List<String> messages=Arrays.asList("AngularJS","NodeJS","Express","MongoDB","React");
		Random random=new Random();
		int randomInt=random.nextInt(messages.size());
		return messages.get(randomInt)+" -@"+ port;
	}
	
}
