import { Component, OnInit } from '@angular/core';
import { Ticket } from '../ticket';
import { TicketasscservService } from '../ticketasscserv.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  tickets: Ticket[]=[];
  constructor(private ticketasscservService: TicketasscservService) { }

  getTickets(): void{
    this.ticketasscservService.getTickets()
      .subscribe(tickets => this.tickets = tickets.slice(1,3));
  }
  ngOnInit(): void {
    this.getTickets();
  }

}
