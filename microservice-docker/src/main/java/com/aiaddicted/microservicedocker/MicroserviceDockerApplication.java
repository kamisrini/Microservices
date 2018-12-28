package com.aiaddicted.microservicedocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroserviceDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDockerApplication.class, args);
	}

	@RequestMapping("/")
	public String message() {
		return "My First Dockerized Microservice";
	}

}

