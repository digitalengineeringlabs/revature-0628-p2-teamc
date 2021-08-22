package com.rev.manager;

import java.util.List;

import com.rev.model.User;

public interface UserManager {
	
	User create(User u);
	public List<User> findAll();

}
