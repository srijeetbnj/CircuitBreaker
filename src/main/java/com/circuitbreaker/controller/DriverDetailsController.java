package com.circuitbreaker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.circuitbreaker.service.DriverService;

@RestController
@RequestMapping(value="/controller")
public class DriverDetailsController {

	@Bean
	public RestTemplate rest(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Autowired
	private DriverService driverService;

	@RequestMapping(value="/fetchDriverID")
	public String fetchDriverID() {
		
		Integer driverID = driverService.fetchDriverID();
		if(driverID == 0)
			return "Service unavailable";
		else
			return String.valueOf(driverID);
	}
}
