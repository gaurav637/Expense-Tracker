package com.expense.tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.expense.tracker.Model.USER_ROLES;
import com.expense.tracker.Model.User;
import com.expense.tracker.Repository.userRepository;

@SpringBootApplication
public class ExpenseTrackerAppApplication implements CommandLineRunner {
	
	@Autowired
	private userRepository uRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrackerAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User adminAccount = uRepository.findByRoles(USER_ROLES.OWNER);
		if(adminAccount==null) {
			User owner = new User();
			owner.setEmail("NegiOwner2004@gmail.com");
			owner.setPassword(passwordEncoder.encode("negiOwner2004"));
			owner.setFirstName(null);
			owner.setRole(USER_ROLES.OWNER);
			uRepository.save(owner);
		}
	}
}
