package com.example.studentappnew_backend2.controller;

import com.example.studentappnew_backend2.dao.StudentsDao;
import com.example.studentappnew_backend2.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {
    @Autowired
    private StudentsDao dao;
    @CrossOrigin(origins = "*")
   @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public Map<String,String> AddStudents(@RequestBody Students s){
       System.out.println(s.getName().toString());
       System.out.println(s.getRollNo().toString());
       System.out.println(s.getAdmissionNumber().toString());
       System.out.println(s.getCollege().toString());
       dao.save(s);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;

    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Students> View(){
        return(List<Students>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/search",consumes = "application/json",produces = "application/json")
    public List<Students> Search(@RequestBody Students s){
        String admissionNumber=s.getAdmissionNumber();
        System.out.println(admissionNumber);
        return (List<Students>) dao.SearchStudent(s.getAdmissionNumber());
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/delete",consumes = "application/json",produces = "application/json")
    public Map<String,String> Delete(@RequestBody Students s){
        String id=String.valueOf(s.getId());
        dao.deleteStudent(s.getId());
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }


    }




