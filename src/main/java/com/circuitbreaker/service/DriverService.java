package com.circuitbreaker.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class DriverService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="displayMessage")
	public Integer fetchDriverID () {

		URI uri = URI.create("http://localhost:8010/service/driverDetails/fetchDriverID");
		return this.restTemplate.getForObject(uri, Integer.class);
		
	}

	public Integer displayMessage () {
		return 0;
	}
}
