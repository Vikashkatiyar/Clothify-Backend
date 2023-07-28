package com.shopping.service;

import com.shopping.exception.UserException;
import com.shopping.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

}
