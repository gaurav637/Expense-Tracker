package com.expense.tracker.security.UserDetails;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserDetailsConfig {
	
	UserDetailsService userDetailsService();

}
