package com.example.springframework.sfgSpringDI.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Default GreetingService Bean if no Profile specified in
 * application.properties
 * 
 * @author Sergei
 *
 */
@Profile({ "bin", "default" })
@Service("i18nService")
public class I18nDefaultGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "1101110";
	}

}
