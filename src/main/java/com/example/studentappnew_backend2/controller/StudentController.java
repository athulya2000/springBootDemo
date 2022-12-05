package com.example.studentappnew_backend2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
   @GetMapping("/")
    public String Homepage(){
        return "Welcome to my website";

    }


    @GetMapping("/contact")
    public String Contactpage(){
       return "Welcome to my contact page";
    }

    @GetMapping("/gallery")
    public String Gallerypage(){
       return  "Welcome to my gallery";
    }

    @GetMapping("/home")
    public  String Home(){
       return "Welcome to home";
    }


}
