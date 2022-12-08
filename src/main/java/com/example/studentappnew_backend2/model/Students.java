package com.example.studentappnew_backend2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Students {

    @Id
    @GeneratedValue
    private int id;
    private  String name;
    private String rollNo;
    private String admissionNumber;
    private String college;

    public Students() {
    }

    public Students(int id, String name, String rollNo, String admissionNumber, String college) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.admissionNumber = admissionNumber;
        this.college = college;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(String admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}

