package com.tutorial.SpringTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTutorialApplication {

	public static void main(String[] args) {
//		1.
//		run method creates the IoC container
//		SpringApplication.run(SpringTutorialApplication.class, args);

//		2.
//		Manually creating an object, and managing the lifecycle of the object ourselves.
//		Dev obj = new Dev();
//		obj.build();

//		3.
//		Assume that spring is creating object in the backend, you just have to use it.
//		object of Dev class is already created in the container, you just talk to the container to access it ( which is with the JVM )
//		So we will get hold of the Container, which of type Context, specifically ApplicationContext.
		ApplicationContext context = SpringApplication.run(SpringTutorialApplication.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.build();


	}

}
