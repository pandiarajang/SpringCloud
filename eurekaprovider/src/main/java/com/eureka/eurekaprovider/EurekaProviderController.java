package com.eureka.eurekaprovider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaProviderController {

	@RequestMapping("greet")
	public String greet() {
		
		return "Hello Everyone!!!";

	}
}