package com.example.springframework.sfgSpringDI.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.springframework.sfgSpringDI.services.ConstructorGreetingService;

class ConstructorInjectedControllerTest {

	public ConstructorInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {

		controller = new ConstructorInjectedController(new ConstructorGreetingService());
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
		// fail("Not yet implemented");
	}

}
