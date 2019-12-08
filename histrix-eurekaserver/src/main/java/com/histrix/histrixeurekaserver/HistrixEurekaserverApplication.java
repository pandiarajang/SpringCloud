package com.histrix.histrixeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HistrixEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(HistrixEurekaserverApplication.class, args);
	}

}
