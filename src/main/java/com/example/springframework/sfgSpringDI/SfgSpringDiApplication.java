package com.example.springframework.sfgSpringDI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.springframework.sfgSpringDI.controllers.ConstructorInjectedController;
import com.example.springframework.sfgSpringDI.controllers.I18nController;
import com.example.springframework.sfgSpringDI.controllers.MyController;
import com.example.springframework.sfgSpringDI.controllers.MyControllerWithProperty;
import com.example.springframework.sfgSpringDI.controllers.PropertyInjectedController;
import com.example.springframework.sfgSpringDI.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgSpringDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SfgSpringDiApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println("\n---------I18nController + Profiles--------");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("\n---------Primary Bean--------");
		System.out.println(myController.sayHello());

		System.out.println("\n---------Property---------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx
				.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("\n---------Setter---------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx
				.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("\n---------Constructor---------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx
				.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("\n---------My with Property---------");
		MyControllerWithProperty myControllerWithProperty = (MyControllerWithProperty) ctx
				.getBean("myControllerWithProperty");
		System.out.println(myControllerWithProperty.getGreeting());
	}

}
