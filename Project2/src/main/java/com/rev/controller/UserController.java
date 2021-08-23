package com.rev.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

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

	@GetMapping(path="/{id}", produces="application/json")
	public User getUser(@PathVariable int id){
		return manager.findById(id);
	}

	@PostMapping(path="/login", produces="application/json")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempUsername = user.getUsername();
		String tempPassword = user.getUserpassword();
		User result = null;
		if(tempUsername != null && tempPassword != null) {
			//result = manager.findByUsernameAndPassword(tempUsername, tempPassword);
			result = manager.login(tempUsername, tempPassword);
		}

		// You can remove the exception throw and handle it in Angular
		if(result == null) {
			throw new Exception("Invalid Login");
		}
		return result;
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(
			MethodArgumentNotValidException ex) {
		Map<String, String> errors = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			String fieldName = ((FieldError) error).getField();
			String errorMessage = error.getDefaultMessage();
			errors.put(fieldName, errorMessage);
		});
		return errors;
	}


}
