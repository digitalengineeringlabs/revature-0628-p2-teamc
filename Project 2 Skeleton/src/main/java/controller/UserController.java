package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import manager.UserManager;
import model.User;

@RestController
@RequestMapping(path="/users")
public class UserController {
	
	@Autowired
	private UserManager manager;

	@GetMapping(produces="application/json")
	public List<User> getAllUsers(){
		return manager.findAll();
	}
	

	@GetMapping(path="/{id}", produces="application/json")
	public User getUser(@PathVariable int id){
		return manager.findById(id);
	}
	
	@PostMapping(consumes="application/json", produces="application/json")
	public User create(@RequestBody User e){
		return manager.create(e);
	}

}
