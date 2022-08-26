package com.example.springframework.sfgSpringDI.services;

//@Profile("EN")
//@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello World - EN";
	}

}
