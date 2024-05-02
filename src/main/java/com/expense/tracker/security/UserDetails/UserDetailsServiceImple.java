package com.expense.tracker.security.UserDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.expense.tracker.Exception.UserNotFoundException;
import com.expense.tracker.Repository.userRepository;

public class UserDetailsServiceImple implements UserDetailsConfig {

	@Autowired
	private userRepository uRepository;
	
	@Override
	public UserDetailsService userDetailsService() {
		return new UserDetailsService() {

			@Override
			public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
				
				return uRepository.findByEmail(username)
						          .orElseThrow(()-> new UserNotFoundException("user not found !",username));
			}
			
		};
	}

}
