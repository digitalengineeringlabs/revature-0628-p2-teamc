package dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import model.Ticket;

@Repository
public class TicketDaoImpl implements TicketDao {

	@Override
	public List<Ticket> findAll() {
		List<Ticket> tickets = new ArrayList<Ticket>();
		tickets.add(new Ticket());
		return tickets;
	}

}
