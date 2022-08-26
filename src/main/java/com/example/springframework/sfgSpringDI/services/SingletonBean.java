package com.example.springframework.sfgSpringDI.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

	public SingletonBean() {
		super();
		System.out.println("Creating Singleton bean!");
	}

	public String getMyScope() {
		return "I'm a Singleton";
	}

}
