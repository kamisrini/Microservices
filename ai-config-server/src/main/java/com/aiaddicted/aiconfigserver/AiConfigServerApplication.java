package com.aiaddicted.aiconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class AiConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiConfigServerApplication.class, args);
	}

}

