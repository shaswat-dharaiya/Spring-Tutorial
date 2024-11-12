package com.tutorial.SpringTutorial;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    public void compile(String injection_method){
        System.out.format("Compiling %s\n",injection_method);
    }
}
