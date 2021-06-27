package com.application.springbootdockerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.application.springbootdockerapp.controller"})
public class SpringbootDockerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerAppApplication.class, args);
	}

}
