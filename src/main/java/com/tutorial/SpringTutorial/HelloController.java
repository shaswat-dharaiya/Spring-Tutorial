package com.tutorial.SpringTutorial;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    StudentController sc = new StudentController();

    @GetMapping("/")
    public String greet(HttpServletRequest request){
        System.out.println("Greeted");
        return  "Welcome to Security" + request.getSession().getId();
    }
}
