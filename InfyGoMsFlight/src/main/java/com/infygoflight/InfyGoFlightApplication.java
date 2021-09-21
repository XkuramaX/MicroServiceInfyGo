package com.infygoflight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
public class InfyGoFlightApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfyGoFlightApplication.class, args);
	}

}
