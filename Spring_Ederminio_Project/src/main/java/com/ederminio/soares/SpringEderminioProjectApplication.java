package com.ederminio.soares;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringEderminioProjectApplication {

	public static void main(String[] args) {
		System.out.println("Starting API...");
		SpringApplication.run(SpringEderminioProjectApplication.class, args);
		System.out.println("API started");
		System.out.println("Waiting for request...");
	}

}
