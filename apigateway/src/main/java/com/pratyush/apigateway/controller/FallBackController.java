package com.pratyush.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

	@GetMapping("/userServiceFallBack")
	public String userServiceFallBack() {
	return "user service is down";	
	}
	
	@GetMapping("/contactServiceFallBack")
	public String contactServiceFallBack() {
	return "contact service is down";	
	}
}
