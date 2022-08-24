package com.example.springframework.sfgSpringDI.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.springframework.sfgSpringDI.services.ConstructorGreetingService;

class SetterInjectedControllerTest {

	SetterInjectedController controller;

	@BeforeEach
	void setUp() {

		controller = new SetterInjectedController();

		controller.setGreetingService(new ConstructorGreetingService());

	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
		// fail("Not yet implemented");
	}

}
