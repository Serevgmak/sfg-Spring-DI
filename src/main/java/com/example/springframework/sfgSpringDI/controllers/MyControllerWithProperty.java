package com.example.springframework.sfgSpringDI.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.springframework.sfgSpringDI.services.GreetingService;

@Controller
public class MyControllerWithProperty {

	private final GreetingService greetingService;

	public MyControllerWithProperty(@Qualifier("myGreetingServiceWithProperty") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
