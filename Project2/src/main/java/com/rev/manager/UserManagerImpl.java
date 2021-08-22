package com.rev.manager;

import java.util.stream.StreamSupport;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rev.dao.UserDAO;
import com.rev.model.User;


@Service
public class UserManagerImpl implements UserManager {
	
	@Autowired
	private UserDAO dao;
	
	@Override
	public User create(User u) {
		
		return dao.save(u);
	}
	
	@Override
	public List<User> findAll() {
		
		return StreamSupport.stream(dao.findAll().spliterator(), false)
				.collect(Collectors.toList());
	}

}
