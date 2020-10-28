package com.student.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.student.exception.StudentNotFoundException;
import com.student.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student,Integer>
{

    List<Student> getStudentByCity(String city) throws StudentNotFoundException;
    List<Student> getStudentByDept(String dept) throws StudentNotFoundException;
  
    //jpql
    @Query("{'title': ?0}")
    List<Student> findByAge(Integer age);

}
