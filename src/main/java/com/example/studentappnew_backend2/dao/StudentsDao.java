package com.example.studentappnew_backend2.dao;

import com.example.studentappnew_backend2.model.Students;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentsDao extends CrudRepository<Students,Integer> {
    @Query(value="SELECT `id`, `admission_number`, `college`, `name`, `roll_no` FROM `students` WHERE `admission_number`= :admissionNumber",nativeQuery = true)
    List<Students> SearchStudent(@Param("admissionNumber") String admissionNumber);
}
