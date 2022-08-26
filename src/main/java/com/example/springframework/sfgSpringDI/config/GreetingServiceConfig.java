package com.example.springframework.sfgSpringDI.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springframework.sfgSpringDI.services.ConstructorGreetingService;
import com.example.springframework.sfgSpringDI.services.PropertyInjectedGreetingService;
import com.example.springframework.sfgSpringDI.services.SetterInjectedGreetingService;

@Configuration
public class GreetingServiceConfig {

	@Bean
	ConstructorGreetingService constructorGreetingService() {
		return new ConstructorGreetingService();
	}

	@Bean
	PropertyInjectedGreetingService propertyInjectedGreetingService() { // name of the method = name of the bean for
																		// qualifiers
		return new PropertyInjectedGreetingService();
	}

	@Bean
	SetterInjectedGreetingService setterInjectedGreetingService() {
		return new SetterInjectedGreetingService();
	}

}
