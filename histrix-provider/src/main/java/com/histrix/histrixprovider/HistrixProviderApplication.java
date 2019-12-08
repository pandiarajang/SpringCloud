package com.histrix.histrixprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class HistrixProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(HistrixProviderApplication.class, args);
	}
	
	@RequestMapping("/greet")
	public String greet(String username) {
		return "Hello "+username;
	}

}
