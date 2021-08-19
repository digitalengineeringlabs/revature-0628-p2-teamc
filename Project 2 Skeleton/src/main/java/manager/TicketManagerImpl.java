package manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.TicketDao;
import model.Ticket;

@Service
public class TicketManagerImpl implements TicketManager {

	@Autowired
	private TicketDao dao;
	
	@Override
	public List<Ticket> findAll() {
		return dao.findAll();
	}

}
