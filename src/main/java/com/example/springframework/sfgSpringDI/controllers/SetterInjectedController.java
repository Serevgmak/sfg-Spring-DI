package com.example.springframework.sfgSpringDI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.springframework.sfgSpringDI.services.GreetingService;

@Controller
public class SetterInjectedController {

	private GreetingService greetingService;

	public String getGreeting() {
		return greetingService.sayGreeting();
	}

	public GreetingService getGreetingService() {
		return greetingService;
	}

	@Qualifier("setterInjectedGreetingService")
	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

}
