package com.shopping.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
