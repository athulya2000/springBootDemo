package com.example.studentappnew_backend2.dao;

import com.example.studentappnew_backend2.model.Students;
import org.springframework.data.repository.CrudRepository;

public interface StudentsDao extends CrudRepository<Students,Integer> {
}
