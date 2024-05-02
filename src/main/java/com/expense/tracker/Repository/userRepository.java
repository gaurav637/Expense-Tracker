package com.expense.tracker.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expense.tracker.Model.USER_ROLES;
import com.expense.tracker.Model.User;

public interface userRepository extends JpaRepository<User, Long>{

	public User findByRoles(USER_ROLES roles);

	public Optional<User> findByEmail(String username);
}
