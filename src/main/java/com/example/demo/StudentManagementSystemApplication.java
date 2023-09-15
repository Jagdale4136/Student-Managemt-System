package com.example.demo;

// 50 minutes

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
		System.out.println("Application Started ============================================================================================");
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	public void run(String... args)throws Exception{
//		Student s1= new Student("Pravin","Nemane","pravin123@gmail.com"); 
//		studentRepository.save(s1);
//		
//		Student s2= new Student("Dipak","Jagdale","Jagdaled45@gmail.com"); 
//		studentRepository.save(s2);
//		
//		Student s3= new Student("Sachin","Jagdale","JagdaleS45@gmail.com"); 
//		studentRepository.save(s3);
		
	}

}
