package com.eureka.eurekaconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
public class EurekaConsumerRestController {

	// private String baseUrl="http://localhost:8091/greet";
	
	@Autowired
	private EurekaClient eurekaClient;
	
	@Autowired
	private RestTemplateBuilder restTemplateBuilder;
	
	@RequestMapping("/greet")
	public String greet() {
		RestTemplate restTemplate=restTemplateBuilder.build();
		
		InstanceInfo instanceInfo=eurekaClient.getNextServerFromEureka("eureka-service-app", false);
		String baseUrl=instanceInfo.getHomePageUrl();
		String apiUrl=baseUrl+"/greet";		
		return restTemplate.getForObject(apiUrl, String.class);
	}
}
