package com.rev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rev.manager.UserManager;
import com.rev.model.User;



@RestController
@RequestMapping(path="/createuser")
public class UserController {
	
	@Autowired
	private UserManager manager;
	
	@PostMapping(consumes="application/json", produces="application/json")
	public User create( @RequestBody User u){
		return manager.create(u);
	}
	
	@GetMapping(produces="application/json")
	public List<User> findAll(){
		return manager.findAll();
	}
}
