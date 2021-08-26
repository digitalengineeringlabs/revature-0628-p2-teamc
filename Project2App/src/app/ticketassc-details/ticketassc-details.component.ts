import { Component, OnInit, Input } from '@angular/core';
import { Ticket } from '../ticket';

import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';
import { TicketasscservService } from '../ticketasscserv.service';

@Component({
  selector: 'app-ticketassc-details',
  templateUrl: './ticketassc-details.component.html',
  styleUrls: ['./ticketassc-details.component.css']
})
export class TicketasscDetailsComponent implements OnInit {

  @Input() ticket?: Ticket;
  constructor(
    private route: ActivatedRoute,
    private ticketasscservService: TicketasscservService,
    private location: Location
  ) { }

  ngOnInit(): void {
  }

  goBack(): void{
    this.location.back();
  }

}
