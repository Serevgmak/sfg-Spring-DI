package com.example.springframework.sfgSpringDI.services;

//@Primary
//@Service
public class PrimaryGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello World - From the PRIMARY Bean";
	}

}
