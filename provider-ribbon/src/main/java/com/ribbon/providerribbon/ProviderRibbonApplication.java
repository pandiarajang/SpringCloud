package com.ribbon.providerribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProviderRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderRibbonApplication.class, args);
	}

}
