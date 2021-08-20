package com.project_2.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project_2.main.model.Ticket;

public interface TicketDAO extends JpaRepository<Ticket, Integer>{


}
