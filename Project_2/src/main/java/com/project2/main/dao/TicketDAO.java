package com.project2.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project2.main.model.Ticket;

public interface TicketDAO extends JpaRepository<Ticket, Integer>{


}
