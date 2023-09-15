package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
   List<Student> getAllStudents();
	Student saveStudent(Student s);
	Student updatestudent(Student s);
	Student getById(Long id);
	void deleteById(Long id);
}
