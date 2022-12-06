package com.example.studentappnew_backend2.controller;

import com.example.studentappnew_backend2.model.Students;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
   @GetMapping("/")
    public String Homepage(){
        return "Welcome to my website";

    }
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String StudentAdd(@RequestBody Students s){
        System.out.println(s.getName().toString());
        return "Student added successfully";

    }



}
