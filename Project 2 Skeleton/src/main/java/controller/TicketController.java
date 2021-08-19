package controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import manager.TicketManager;
import model.Ticket;

@RestController
@RequestMapping(path="/accounts")
public class TicketController {
	
	@Autowired
	private TicketManager manager;

	@GetMapping(produces = "application/json")
	public List<Ticket> getTickets(){
		return manager.findAll();
	}

	@GetMapping(path="/{id}", produces = "application/json")
	public Ticket getTicket(@PathVariable int id){
		return new Ticket("Checking "+id);
	}
	
	@PostMapping(consumes = "application/json")
	public ResponseEntity<Object> addTicket(@RequestBody Ticket ticket){
		System.out.println(ticket.getID());
		
		 URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                 .path("/{id}")
                 .buildAndExpand(1) //should be replaced with db serial
                 .toUri();

		 return ResponseEntity.created(location).build();
	}
	
	
}
