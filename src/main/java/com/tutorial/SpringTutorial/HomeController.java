package com.tutorial.SpringTutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String greet(){
        return "Welcome to my home page";
    }

    @RequestMapping("/about")
    @ResponseBody
    public String about(){
        return "Welcome to my about page";
    }
}
