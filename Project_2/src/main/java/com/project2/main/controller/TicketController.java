package com.project2.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project2.main.manager.TicketManager;
import com.project2.main.model.Ticket;

@RestController
@RequestMapping(path="/ticket")
public class TicketController {
	
	@Autowired
	private TicketManager manager;
	
	@PostMapping(consumes="application/json", produces="application/json")
	public Ticket create(@RequestBody Ticket t) {
		return  manager.create(t);
	}
	@GetMapping(produces="application/json")
	public List<Ticket> findAll(){
		return null;
	}
}
