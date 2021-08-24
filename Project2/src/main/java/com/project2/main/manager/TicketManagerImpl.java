package com.project2.main.manager;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


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

	@Override
	public List<Ticket> findAllAssociatedTickets() {
	
		return StreamSupport.stream(dao.findAll().spliterator(), false)
				.collect(Collectors.toList());
	}

		
	@Override
	public List<Ticket> findAllAssociatedTicketsById(int user_id) {
		
		return dao.getEmployeeTicketsById(user_id);
	}
}
