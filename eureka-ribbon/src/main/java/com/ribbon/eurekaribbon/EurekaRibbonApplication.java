package com.ribbon.eurekaribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaRibbonApplication.class, args);
	}

}
