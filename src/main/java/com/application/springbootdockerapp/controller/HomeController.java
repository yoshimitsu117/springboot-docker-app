package com.application.springbootdockerapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
	@GetMapping("/home")
	public String Hello()
	{
		return "Hello from Springboot Docker Application";
	}

}