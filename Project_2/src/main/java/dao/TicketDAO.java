package dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Ticket;

public interface TicketDAO extends JpaRepository<Ticket, Integer>{


}
