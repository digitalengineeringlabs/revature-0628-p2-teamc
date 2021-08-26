package com.project2.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project2.main.model.Ticket;

public interface TicketDAO extends JpaRepository<Ticket, Integer>{

	@Query("select t from tickets t where t.ticketnumber = ?1")
	public List<Ticket> getEmployeeTicketsById(@Param("ticketnumber") int ticketnumber);

}
