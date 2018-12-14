package com.aiaddicted.aimainapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AiMainAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiMainAppApplication.class, args);
	}

}

@RefreshScope
@RestController
class MessageRestController {

	@Value("${message:Hello from local}")
	private String message;

	@RequestMapping("/message")
	String getMessage() {
		return this.message;
	}
}