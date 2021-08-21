package com.project2.main.manager;

import java.util.List;

import com.project2.main.model.Ticket;

public interface TicketManager {
	
	public Ticket create(Ticket t);
	public List<Ticket> findAll();
}
