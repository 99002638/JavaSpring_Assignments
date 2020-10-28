package com.student.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
@TypeAlias("Student")

public class Student {
    @Id
	Integer studentId;
	String name;
	String dept;
	Integer age;
	String city;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer studentId, String name, String dept, Integer age, String city) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.dept = dept;
		this.age = age;
		this.city = city;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", dept=" + dept + ", age=" + age + ", city="
				+ city + "]";
	}

	
	
	
}
	
	
	
	
	
	
	
	
	