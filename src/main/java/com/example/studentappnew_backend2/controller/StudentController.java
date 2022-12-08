package com.example.studentappnew_backend2.controller;

import com.example.studentappnew_backend2.dao.StudentsDao;
import com.example.studentappnew_backend2.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentsDao dao;
    @CrossOrigin(origins = "*")
   @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String AddStudents(@RequestBody Students s){
       System.out.println(s.getName().toString());
       System.out.println(s.getRollNo().toString());
       System.out.println(s.getAdmissionNumber().toString());
       System.out.println(s.getCollege().toString());
       dao.save(s);
        return "Welcome to my website";

    }


    }




