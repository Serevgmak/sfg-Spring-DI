package com.example.springframework.sfgSpringDI.services;

//@Profile("ES")
//@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hola Mundo - ES";
	}

}
