package com.expense.tracker.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String email;
	
	private String firstName;
	
	private String lastName;
	
	private String password;
	
	private String description;
	
	private String profilePicture;
	
	private String gender;
	
	private String DOB;
	
	private String address;
	
	private String contact;
	
}
