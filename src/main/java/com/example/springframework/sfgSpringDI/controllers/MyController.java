package com.example.springframework.sfgSpringDI.controllers;

import org.springframework.stereotype.Controller;

import com.example.springframework.sfgSpringDI.services.GreetingService;

@Controller
public class MyController {

	private final GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String sayHello() {
		// System.out.println("Hello world!");

		return greetingService.sayGreeting();
	}

}
