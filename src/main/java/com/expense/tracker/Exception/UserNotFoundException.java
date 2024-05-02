package com.expense.tracker.Exception;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserNotFoundException extends RuntimeException{
	
	private String message;
	
	private String username;
	
	public UserNotFoundException(String message,String username) {
		super(String.format("User not found with user name: %s ",username));
		this.message = message;
		this.username = username;
	}
	
	
	

}
