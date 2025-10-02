package com.sec.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthJwtApp {

	public static void main(String[] args) {

		SpringApplication.run(AuthJwtApp.class, args);
		System.out.println("Jwt Application is Running");
		System.out.println("Modified the Application ");
		System.out.println("Target is Deleted.");
	}

}
