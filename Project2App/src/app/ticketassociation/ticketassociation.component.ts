import { Component, OnInit } from '@angular/core';
import { Ticket } from '../ticket';
import { TICKETS } from '../mock-tickets';
@Component({
  selector: 'app-ticketassociation',
  templateUrl: './ticketassociation.component.html',
  styleUrls: ['./ticketassociation.component.css']
})
export class TicketassociationComponent implements OnInit {

  tickets=TICKETS;
  selectedTicket?: Ticket;

  constructor() { }

  ngOnInit(): void {
  }
  onSelect(ticket: Ticket): void{
    this.selectedTicket=ticket;
  }

}
