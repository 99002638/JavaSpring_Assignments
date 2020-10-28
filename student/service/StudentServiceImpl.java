package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.student.dao.StudentRepository;
import com.student.exception.StudentNotFoundException;
import com.student.model.Student;

@Service

public class StudentServiceImpl implements StudentService {
    @Autowired
	StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {
		Student newStudent = studentRepository.save(student);
		return newStudent;
	}

	@Override
	public Student getStudentById(Integer studentid) throws StudentNotFoundException {
		return studentRepository.findById(studentid)
				.orElseThrow(()-> new StudentNotFoundException("id not available"));
	}

	@Override
	public boolean deleteStudent(Integer studentid) {
		studentRepository.deleteById(studentid);
		return true;
	}

	@Override
	public List<Student> getStudentByCity(String city) throws StudentNotFoundException {
		List<Student> studentlist = studentRepository.getStudentByCity(city);
		if( studentRepository.getStudentByCity(city).isEmpty()) {
			throw new StudentNotFoundException("student not available");
		}
		return studentlist;
	}

	@Override
	public List<Student> getStudentByDept(String dept) throws StudentNotFoundException {
		List<Student> studentlist = studentRepository.getStudentByDept(dept);
		if( studentRepository.getStudentByDept(dept).isEmpty()) {
			throw new StudentNotFoundException("department not available");
		}
		return studentlist;
				
	}

	@Override
	public List<Student> findByAge(Integer age) {
		return studentRepository.findByAge(age);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
