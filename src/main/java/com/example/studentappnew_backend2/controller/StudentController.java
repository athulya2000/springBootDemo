package com.example.studentappnew_backend2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
   @GetMapping("/")
    public String Homepage(){
        return "Welcome to my website";
    }
}
