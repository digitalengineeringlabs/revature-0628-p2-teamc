package com.rev.manager;

import java.util.stream.StreamSupport;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
//	public List<User> findAll() {
//		return dao.findAll().stream()
//				.collect(Collectors.toList());
//	}
	public List<User> findAll() {
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
		return dao.findByUsernameAndUserpassword(username, password);
	}
}
