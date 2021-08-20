package com.project_2.main.manager;

import com.project_2.main.dao.TicketDAO;
import com.project_2.main.model.Ticket;

public class TicketManager {
	private TicketDAO dao;

	public Ticket create(Ticket t) {
		
		return dao.save(t);
	}
	
	
}
