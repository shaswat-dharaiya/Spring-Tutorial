package com.tutorial.SpringTutorial;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// In case of confusion or multiple classes implementing an interface such as Computer.
// We need to use @Primary annotation that will clear out the confusion.
// If you mention @Primary on more than 1 class, that too will create confusion.
@Primary
@Component
public class Laptop implements Computer {

    @Override
    public void compile(String injection_method){
        System.out.format("Compiling %s on Laptop\n",injection_method);
    }
}
