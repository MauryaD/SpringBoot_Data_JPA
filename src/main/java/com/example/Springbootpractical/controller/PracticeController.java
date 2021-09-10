package com.example.Springbootpractical.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController {

    @GetMapping("/practice/springJPA")
    public String start(){
        return "Hello, Welcome to Spring JPA.";
    }
}
