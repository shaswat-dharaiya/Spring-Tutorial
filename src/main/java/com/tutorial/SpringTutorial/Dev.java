package com.tutorial.SpringTutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Component annotation is used to flag a class to be part of the ApplicationContext.
// Or in simple words, spring tells JVM to include this class in the IoC Container.
// And thus creates an object for this class which is eventually accessible via ApplicationContext.

//Reason being that there might 100s or 1000s of class in a Project which will overburden the JVM.
//We flag only those that are actually needed.

//This Design Pattern is called as Dependency Injection, where we injecting a dependency in the spring boot.
@Component
public class Dev {

//  @Autowired annotation is used to access an object from IoC Container or ApplicationContext outside the Main class.

//   Normally, we would have created an object of Laptop class like this
//  private Laptop laptop = new laptop;

//  But spring IoC container has already created the object of Laptop class, and we just need to access it.
//  @Autowired annotation allows us to access this object.

//  This is known as Field Injection.

    @Autowired
    private Computer computer;

    private Computer computer_constructor, computer_setter;

// Spring sees the
// If you dont want to use Autowired annotation, then you can use the following method to access object from IoC container.
// In backend spring will pass the required class in the constructor call.
// This is known as constructor injection
    public  Dev(Computer computer){
        this.computer_constructor = computer;
    }

// This is setter injection. As per my understanding of the Spring so far, setter and constructor injection are better.
    @Autowired
    public void setLaptop(Computer computer){
        this.computer_setter = computer;
    }

//  Now instead of using Laptop class, we use Computer Interface.
//  Spring will automatically be able to wire Laptop via Computer in the Dev class.

    public void build(){
        computer.compile("Field Injection");
        computer_constructor.compile("Constructor Injection");
        computer_setter.compile("Setter Injection");
        System.out.println("Dev Class inside IoC container");
    }
}
