package com.project_2.main.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project_2.main.model.Ticket;

public interface TicketDAO extends JpaRepository<Ticket, Integer>{


}
