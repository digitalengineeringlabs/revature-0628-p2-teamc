package manager;

import dao.TicketDAO;
import model.Ticket;

public class TicketManager {
	private TicketDAO dao;

	public Ticket create(Ticket t) {
		
		return dao.save(t);
	}
	
	
}
