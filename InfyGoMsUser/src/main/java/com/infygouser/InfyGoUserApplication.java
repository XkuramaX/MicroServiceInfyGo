package com.infygouser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InfyGoUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfyGoUserApplication.class, args);
	}

}
