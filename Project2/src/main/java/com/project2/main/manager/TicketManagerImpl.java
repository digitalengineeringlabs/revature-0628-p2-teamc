package com.project2.main.manager;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.project2.main.Project2;
import com.project2.main.dao.TicketDAO;
import com.project2.main.model.Ticket;

@Service
public class TicketManagerImpl implements TicketManager {
	private static final Logger logger=LoggerFactory.getLogger(Project2.class);
	
	@Autowired
	private TicketDAO dao;

	public Ticket create(Ticket t) {
		logger.info("Inserting new ticket into database...");
		return dao.save(t);
	}

	@Override
	public List<Ticket> findAllAssociatedTickets() {
		logger.info("Collecting tickets associated with user");
		return StreamSupport.stream(dao.findAll().spliterator(), false)
				.collect(Collectors.toList());
	}

		
	@Override
	public List<Ticket> findAllAssociatedTicketsById(int user_id) {
		logger.info("Finding all tickets assciated to user " + user_id);
		return dao.getEmployeeTicketsById(user_id);
	}
}
