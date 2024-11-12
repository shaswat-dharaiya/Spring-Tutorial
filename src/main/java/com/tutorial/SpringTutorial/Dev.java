package com.tutorial.SpringTutorial;

import org.springframework.stereotype.Component;

// @Component annotation is used to flag a class to be part of the ApplicationContext.
// Or in simple words, spring tells JVM to include this class in the IoC Container.
// And thus creates an object for this class which is eventually accessible via ApplicationContext.

//Reason being that there might 100s or 1000s of class in a Project which will overburden the JVM.
//We flag only those that are actually needed.

//This Design Pattern is called as Dependency Injection, where we injecting a dependency in the spring boot.
@Component
public class Dev {
    public void build(){
        System.out.println("Dev Class inside IoC container");
    }
}
