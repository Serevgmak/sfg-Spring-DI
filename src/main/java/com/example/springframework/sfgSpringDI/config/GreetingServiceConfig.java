package com.example.springframework.sfgSpringDI.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.example.springframework.sfgSpringDI.services.ConstructorGreetingService;
import com.example.springframework.sfgSpringDI.services.I18nEnglishGreetingService;
import com.example.springframework.sfgSpringDI.services.I18nSpanishGreetingService;
import com.example.springframework.sfgSpringDI.services.PrimaryGreetingService;
import com.example.springframework.sfgSpringDI.services.PropertyInjectedGreetingService;
import com.example.springframework.sfgSpringDI.services.SetterInjectedGreetingService;

@Configuration
public class GreetingServiceConfig {

	@Profile("ES")
	@Bean("i18nService") // name of the Bean
	I18nSpanishGreetingService i18nSpanishGreetingService() {
		return new I18nSpanishGreetingService();
	}

	@Profile("EN")
	@Bean
	I18nEnglishGreetingService i18nService() {
		return new I18nEnglishGreetingService();
	}

	@Primary
	@Bean
	PrimaryGreetingService primaryGreetingService() {
		return new PrimaryGreetingService();
	}

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
