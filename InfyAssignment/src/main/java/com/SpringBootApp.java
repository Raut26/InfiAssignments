package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Entry point for spring boot
 *
 */
@SpringBootApplication(scanBasePackages = "com")
public class SpringBootApp {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootApp.class, args);

	}

}
