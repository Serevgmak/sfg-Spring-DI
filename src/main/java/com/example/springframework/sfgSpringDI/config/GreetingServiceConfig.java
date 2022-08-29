package com.example.springframework.sfgSpringDI.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.example.pets.PetService;
import com.example.pets.PetServiceFactory;
import com.example.springframework.sfgSpringDI.datasource.FakeDataSource;
import com.example.springframework.sfgSpringDI.repositories.EnglishGreetingRepository;
import com.example.springframework.sfgSpringDI.repositories.EnglishGreetingRepositoryImpl;
import com.example.springframework.sfgSpringDI.services.ConstructorGreetingService;
import com.example.springframework.sfgSpringDI.services.I18nEnglishGreetingService;
import com.example.springframework.sfgSpringDI.services.I18nSpanishGreetingService;
import com.example.springframework.sfgSpringDI.services.PrimaryGreetingService;
import com.example.springframework.sfgSpringDI.services.PropertyInjectedGreetingService;
import com.example.springframework.sfgSpringDI.services.SetterInjectedGreetingService;

//@PropertySource("classpath:datasource.properties")
@ImportResource("classpath:sfgSpringDIConfig.xml")
@Configuration
public class GreetingServiceConfig {

	@Bean
	FakeDataSource fakeDataSource(@Value("${guru.username}") String username,
			@Value("${guru.password}") String password, @Value("${guru.jdbcurl}") String jdbcurl) {

		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUsername(username);
		fakeDataSource.setPassword(password);
		fakeDataSource.setJdbcurl(jdbcurl);

		return fakeDataSource;

	}

	@Bean
	PetServiceFactory petServiceFactory() {
		return new PetServiceFactory();
	}

	@Profile("dog")
	@Bean
	PetService dogPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("dog");
	}

	@Profile({ "cat", "default" })
	@Bean
	PetService catPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("cat");
	}

	@Profile("ES")
	@Bean("i18nService") // name of the Bean
	I18nSpanishGreetingService i18nSpanishGreetingService() {
		return new I18nSpanishGreetingService();
	}

	@Bean
	EnglishGreetingRepository englishGreetingRepository() {
		return new EnglishGreetingRepositoryImpl();
	}

	@Profile("EN")
	@Bean
	I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository) {
		return new I18nEnglishGreetingService(englishGreetingRepository);
	}

	@Primary
	@Bean
	PrimaryGreetingService primaryGreetingService() {
		return new PrimaryGreetingService();
	}

	// That bean will be configuered in xml config file
	// @Bean
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
