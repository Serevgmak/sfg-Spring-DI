package com.example.springframework.sfgSpringDI.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {

	public PrototypeBean() {
		super();
		System.out.println("Creating Prototype bean!!!!!!!!!!!!!!");
	}

	public String getMyScope() {
		return "I'm a Prototype";
	}

}
