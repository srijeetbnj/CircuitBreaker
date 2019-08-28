package com.circuitbreaker.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@ComponentScan(basePackages={"com.circuitbreaker"})
public class CircuitBreakerMainApp {

	public static void main(String[] args) {

		SpringApplication.run(CircuitBreakerMainApp.class, args);
	}

}
