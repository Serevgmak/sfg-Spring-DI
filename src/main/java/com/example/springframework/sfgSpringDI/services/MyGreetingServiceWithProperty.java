package com.example.springframework.sfgSpringDI.services;

import org.springframework.stereotype.Service;

@Service
public class MyGreetingServiceWithProperty implements GreetingService {

	private String stringToAdd = "";

	public void setStringToAdd(String stringToAdd) {
		this.stringToAdd = stringToAdd;
	}

	@Override
	public String sayGreeting() {
		return "Hello World! " + stringToAdd;
	}

}
