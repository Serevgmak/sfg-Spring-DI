package com.example.springframework.sfgSpringDI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.springframework.sfgSpringDI.controllers.ConstructorInjectedController;
import com.example.springframework.sfgSpringDI.controllers.I18nController;
import com.example.springframework.sfgSpringDI.controllers.MyController;
import com.example.springframework.sfgSpringDI.controllers.MyControllerWithProperty;
import com.example.springframework.sfgSpringDI.controllers.PetController;
import com.example.springframework.sfgSpringDI.controllers.PropertyInjectedController;
import com.example.springframework.sfgSpringDI.controllers.SetterInjectedController;
import com.example.springframework.sfgSpringDI.services.PrototypeBean;
import com.example.springframework.sfgSpringDI.services.SingletonBean;

// By default Spring Component Scan search Bean Stereotype Annotations
// inside main package, but with this annotation below
// we can show him where to search beans

//@ComponentScan(basePackages = { "com.example.springframework.sfgSpringDI", "com.example.pets" })
@SpringBootApplication
public class SfgSpringDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SfgSpringDiApplication.class, args);

		PetController petController = (PetController) ctx.getBean("petController");
		System.out.println("\n---------Dogs or Cats?--------");
		System.out.println(petController.whichPetIsTheBest());

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

		System.out.println("\n-----------Bean Scopes-----------------");
		SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean1.getMyScope());
		SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean2.getMyScope());
		SingletonBean singletonBean3 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean3.getMyScope());

		PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getMyScope());
		PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getMyScope());
		PrototypeBean prototypeBean3 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean3.getMyScope());

	}

}
