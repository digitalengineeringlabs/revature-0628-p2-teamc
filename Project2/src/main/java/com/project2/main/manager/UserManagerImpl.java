package com.project2.main.manager;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.project2.main.Project2;
import com.project2.main.dao.UserDAO;
import com.project2.main.model.User;



@Service
public class UserManagerImpl implements UserManager {
	
	private static final Logger logger=LoggerFactory.getLogger(Project2.class);
	@Autowired
	private UserDAO dao;
	
	@Override
	public User create(User u) {
		
		return dao.save(u);
	}
	
	@Override
//	public List<User> findAll() {
//		return dao.findAll().stream()
//				.collect(Collectors.toList());
//	}
	public List<User> findAll() {
		logger.info("Getting list of users");
		return StreamSupport.stream(dao.findAll().spliterator(), false)
				.collect(Collectors.toList());
	}

	@Override
	public List<User> findAll(int startIndex, int count) {
		Pageable pageable = PageRequest.of(startIndex, count);

		return StreamSupport.stream(dao.findAll(pageable).spliterator(), false)
				.collect(Collectors.toList());
	}

	@Override
	public User findById(int id) {
		return dao.findById(Integer.valueOf(id)).get();
	}

	@Override
	public User login(String username, String password) {
		logger.info("Attempting to log in with " + username + " and " + password);
		return dao.findByUsernameAndUserpassword(username, password);
	}
}
