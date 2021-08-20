package com.project_2.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project_2.main.manager.TicketManager;
import com.project_2.main.model.Ticket;

@RestController
@RequestMapping(path="/ticket")
public class TicketController {
	
	@Autowired
	private TicketManager manager;
	
	@PostMapping(consumes="application/json", produces="application/json")
	public Ticket create(@RequestBody Ticket t) {
		return  manager.create(t);
	}
}
