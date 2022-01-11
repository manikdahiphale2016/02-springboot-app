package com.manikit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	private String REST_URL = "https://www.google.com";
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
