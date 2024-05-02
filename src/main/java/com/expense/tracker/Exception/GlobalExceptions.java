package com.expense.tracker.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.expense.tracker.DTO.ApiResponse;

@RestControllerAdvice
public class GlobalExceptions {
	
	@ExceptionHandler({UsernameNotFoundException.class})
	public ResponseEntity<ApiResponse> usernameNotFoundException(UsernameNotFoundException ex){
		String message = ex.getMessage();
		ApiResponse response = new ApiResponse(message,false);
		return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
	}

}
