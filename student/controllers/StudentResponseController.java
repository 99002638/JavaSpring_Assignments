package com.student.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.exception.StudentNotFoundException;
import com.student.model.Student;
import com.student.service.StudentService;

 

@RestController
@RequestMapping("/student-api")
public class StudentResponseController {
    
    @Autowired
    StudentService studentService;

 

    @PostMapping("/students")
    ResponseEntity<Student> addStudent(@RequestBody Student student) {
        Student nstudent = studentService.addStudent(student);
        return ResponseEntity.ok(nstudent);
    }
    
    
    
    @DeleteMapping("/students/delete-one/{studentId}")
    
    	ResponseEntity<Void> deleteStudent(@PathVariable("studentId")Integer studentid) throws StudentNotFoundException{
    	studentService.deleteStudent(studentid);
    	return ResponseEntity.status(HttpStatus.OK).build();
    }
    
 
 
    @GetMapping("/students/city/{city}")
    ResponseEntity<List<Student>> getStudentByCity(@PathVariable("city")String city) throws StudentNotFoundException{
        List<Student> studentList =   studentService.getStudentByCity(city);
        return ResponseEntity.ok(studentList);
    }
    
    @GetMapping("/students/dept/{dept}")
    ResponseEntity<List<Student>> getStudentByDept(@PathVariable("dept")String dept) throws StudentNotFoundException{
        List<Student> studentList =   studentService.getStudentByDept(dept);
        return ResponseEntity.ok(studentList);
    }
    
  
    @GetMapping("/students/age/{age}")
    public ResponseEntity<List<Student>> findByAge(@PathVariable("age")Integer age) {
        List<Student> studentList = studentService.findByAge(age);
        return ResponseEntity.ok(studentList);
    }

}