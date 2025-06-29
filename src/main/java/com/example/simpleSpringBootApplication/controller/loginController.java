package com.example.simpleSpringBootApplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {
    @RequestMapping("/loginpage")
    public String login(){
        return "This is a login page";
    }
}
