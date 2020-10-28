package com.student.controllers;

 

import java.util.List;

 

import org.springframework.beans.factory.annotation.Autowired;
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

 

//@RestController
//@RequestMapping("/student-api")
public class StudentController {

 

@Autowired
StudentService studentService;

@PostMapping("/students")
Student addStudent(@RequestBody Student student) {
return studentService.addStudent(student);
}

@DeleteMapping("/students/delete-one/{studentId}")
boolean deleteStudent(@PathVariable("studentId")Integer studentId) throws StudentNotFoundException {
return studentService.deleteStudent(studentId);
}

@GetMapping("/students/city/{city}")
List<Student> getStudentByCity(@PathVariable("city")String city) throws StudentNotFoundException{
return studentService.getStudentByCity(city);
}

@GetMapping("/students/dept/{dept}")
List<Student> getStudentByDept(@PathVariable("dept")String dept) throws StudentNotFoundException{
return studentService.getStudentByDept(dept);
}

@GetMapping("/students/age/{age}")
public List<Student> findByAge(@PathVariable("age")Integer age){
return studentService.findByAge(age);
}

}