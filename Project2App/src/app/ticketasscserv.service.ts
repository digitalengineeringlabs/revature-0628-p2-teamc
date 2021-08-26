import { Injectable } from '@angular/core';
import { Ticket } from './ticket';
import { TICKETS } from './mock-tickets';
import { Observable, of } from 'rxjs';
import { TicketasscmessageService } from './ticketasscmessage.service';

@Injectable({
  providedIn: 'root'
})
export class TicketasscservService {

  getTickets(): Observable<Ticket[]>{
    const tickets = of(TICKETS);
    this.ticketasscmessService.add('Ticket Assc Service: fetched tickets');
    return tickets;
  }
  constructor(private ticketasscmessService: TicketasscmessageService) { }

}
