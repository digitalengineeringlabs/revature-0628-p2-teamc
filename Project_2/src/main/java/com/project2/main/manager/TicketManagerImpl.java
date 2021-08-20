package com.project2.main.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project2.main.dao.TicketDAO;
import com.project2.main.model.Ticket;

@Service
public class TicketManagerImpl implements TicketManager {
	
	@Autowired
	private TicketDAO dao;

	public Ticket create(Ticket t) {	
		return dao.save(t);
	}
	
	
}
