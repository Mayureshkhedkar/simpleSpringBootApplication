package com.example.simpleSpringBootApplication.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class homeController {
    @RequestMapping("/Home")
    public String greeting(){
        return "Welcome to my Spring boot application";
    }
    @RequestMapping("/about")
    public String aboutPage(){
        return "Hey this app is made by"+" Mayuresh Khedkar";
    }
}
