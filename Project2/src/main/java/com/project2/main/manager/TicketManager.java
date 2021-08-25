package com.project2.main.manager;

import com.project2.main.model.Ticket;
import java.util.List;

public interface TicketManager {
	
	public Ticket create(Ticket t);
	List<Ticket> findAllAssociatedTickets();
	List<Ticket> findAllAssociatedTicketsById(int user_id);
}
