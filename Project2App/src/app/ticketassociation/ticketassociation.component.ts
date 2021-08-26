import { Component, OnInit } from '@angular/core';
import { Ticket } from '../ticket';
import { TICKETS } from '../mock-tickets';
import { TicketasscservService } from '../ticketasscserv.service';
import { TicketasscmessageService } from '../ticketasscmessage.service';

@Component({
  selector: 'app-ticketassociation',
  templateUrl: './ticketassociation.component.html',
  styleUrls: ['./ticketassociation.component.css']
})
export class TicketassociationComponent implements OnInit {

  tickets: Ticket[]=[];
  selectedTicket?: Ticket;

  constructor(private ticketasscservService: TicketasscservService, 
    private ticketasscmessService: TicketasscmessageService) { }

  ngOnInit(): void {
    this.getTickets();
  }

  getTickets(): void {
    this.ticketasscservService.getTickets()
      .subscribe(tickets => this.tickets = tickets);
  }

  onSelect(ticket: Ticket): void{
    this.selectedTicket=ticket;
    this.ticketasscmessService.add(`TicketAssociationComponent:
    Selected user id=${ticket.user_id}`);
  }

}
