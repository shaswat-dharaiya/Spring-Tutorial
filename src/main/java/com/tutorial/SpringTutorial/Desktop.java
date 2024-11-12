package com.tutorial.SpringTutorial;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    @Override
    public void compile(String injection_method){
        System.out.format("Compiling %s on Desktop\n",injection_method);
    }
}
