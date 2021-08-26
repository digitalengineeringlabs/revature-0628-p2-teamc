package com.project2.main.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project2.main.Project2;
import com.project2.main.manager.UserManager;
import com.project2.main.model.User;



	@RestController
	@RequestMapping(path="/createuser")
	public class UserController {
		
		private static final Logger logger=LoggerFactory.getLogger(Project2.class);
		
		@Autowired
		private UserManager manager;
		
		@PostMapping(consumes="application/json", produces="application/json")
		public User create( @RequestBody User u){
			logger.info("Creating new user");
			return manager.create(u);
		}
		
		@GetMapping(produces="application/json")
		public List<User> findAll(){
			logger.info("Collecting user data");
			return manager.findAll();
		}

		@GetMapping(path="/{id}", produces="application/json")
		public User getUser(@PathVariable int id){
			logger.info("Getting user..");
			return manager.findById(id);
		}

		@PostMapping(path="/login", produces="application/json")
		public User loginUser(@RequestBody User user){
//		public User loginUser(@RequestBody User user) throws Exception {
			String tempUsername = user.getUsername();
			String tempPassword = user.getUserpassword();
			User result = null;
			if(tempUsername != null && tempPassword != null) {
				//result = manager.findByUsernameAndPassword(tempUsername, tempPassword);
				result = manager.login(tempUsername, tempPassword);
			}

//			// You can remove the exception throw and handle it in Angular
//			if(result == null) {
//				throw new Exception("Invalid Login");
//			}
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

