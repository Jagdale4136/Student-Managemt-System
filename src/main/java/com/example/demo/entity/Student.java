package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Students")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Student {
 public Student(String firstName, String lastName, String email) {
		// TODO Auto-generated constructor stub
	 this.firstName=firstName;
	 this.lastName=lastName;
	 this.email=email;
	}

@Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
 
 @Column(name= "First_Name", nullable=false)
  private String firstName;
 
 @Column(name= "Last_Name")
  private String lastName;
 
 @Column(name= "email")
  private String email;
	
}
