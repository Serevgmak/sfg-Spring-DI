package com.example.springframework.sfgSpringDI.services;

import org.springframework.stereotype.Service;

@Service
public class MyGreetingServiceWithProperty implements GreetingService {

	private final String suffix = "";

	@Override
	public String sayGreeting() {
		return "Hello World! - suffix:" + suffix;
	}

}
