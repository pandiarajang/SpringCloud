package com.histrix.histrixconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@Service
public class GreetingService {

	@Autowired
	EurekaClient eurekaClient;
	
	@Autowired
	private RestTemplateBuilder restTemplateBuilder;
	
	@HystrixCommand(fallbackMethod = "defaultGreeting") // If this method fails calling program make a call to defaultGrettings. 
	public String getGreeting(String username) {
		RestTemplate restTemplate=restTemplateBuilder.build();
		InstanceInfo instanceInfo=eurekaClient.getNextServerFromEureka("hystrix-service-app", false);
		String baseUrl=instanceInfo.getHomePageUrl();
		String apiUrl=baseUrl+"/greet?username="+username;
		return restTemplate.getForObject(apiUrl, String.class);
	}
	
	private String defaultGreeting(String username) {
		return "Hello User "+username;
	}
}
