package com.project2.main.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.project2.main.Project2;
import com.project2.main.manager.TicketManager;
import com.project2.main.model.Ticket;

@RestController
@RequestMapping(path="/ticket")
public class TicketController {
	private static final Logger logger=LoggerFactory.getLogger(Project2.class);
	
	@Autowired
	private TicketManager manager;
	
	@PostMapping(consumes="application/json", produces="application/json")
	public Ticket create(@Valid @RequestBody Ticket t) {
		logger.info("Creating new ticket");
		return  manager.create(t);
	}

	//below will be a test
	@GetMapping(produces = "application/json")
	public List<Ticket> getAllAssociatedTickets() {
		logger.info("Getting all tickets ticket");
		return manager.findAllAssociatedTickets();
	}

	//when I want to find it by id explicitly 
	@GetMapping(path = "/{id}", produces="application/json")
	public List<Ticket> getAllAssociatedTicketsById(@PathVariable int id) {
		logger.info("Retrieving tickets...");
		return manager.findAllAssociatedTicketsById(id);
		
	}

	//something here is wrong fix later
	@GetMapping(path = "/id",produces="application/json")
	public List<Ticket> getAllAssociatedTicketsById1(@RequestBody int ticketnumber) {
		
		return manager.findAllAssociatedTicketsById(ticketnumber);
	public List<Ticket> getAllAssociatedTicketsById1(@RequestBody int ticketNumber) {
		logger.info("Retrieving tickets...");
		return manager.findAllAssociatedTicketsById(ticketNumber);
		
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
	        logger.warn("An error has occured: " + errorMessage);
	    });
	    return errors;
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(ConstraintViolationException.class)
	public Map<String, String> handleConstraintViolationExceptions(
			ConstraintViolationException ex) {
	    Map<String, String> errors = new HashMap<>();
	    errors.put("message",ex.getCause().getLocalizedMessage());
	    logger.warn("An error has occured: " + ex.getCause().getLocalizedMessage());
	    return errors;
	}
	
}
