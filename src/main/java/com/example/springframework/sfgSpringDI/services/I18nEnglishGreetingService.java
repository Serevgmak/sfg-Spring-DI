package com.example.springframework.sfgSpringDI.services;

import com.example.springframework.sfgSpringDI.repositories.EnglishGreetingRepository;

//@Profile("EN")
//@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {

	private final EnglishGreetingRepository englishGreetingRepository;

	public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
		super();
		this.englishGreetingRepository = englishGreetingRepository;
	}

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello World - EN";
	}

}
