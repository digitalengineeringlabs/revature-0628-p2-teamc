import { Component, OnInit } from '@angular/core';
import { TicketasscmessageService } from '../ticketasscmessage.service';

@Component({
  selector: 'app-ticketasscmessages',
  templateUrl: './ticketasscmessages.component.html',
  styleUrls: ['./ticketasscmessages.component.css']
})
export class TicketasscmessagesComponent implements OnInit {

  constructor(public ticketasscmessService: TicketasscmessageService) { }

  ngOnInit(): void {
  }

}
