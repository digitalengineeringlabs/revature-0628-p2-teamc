import { Component, OnInit } from '@angular/core';
import { Tickets } from '../tickets';
import { HttpClient} from '@angular/common/http';
import { TicketAsscService } from '../ticket-assc.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-ticketassociation',
  templateUrl: './ticketassociation.component.html',
  styleUrls: ['./ticketassociation.component.css']
})
export class TicketassociationComponent implements OnInit {

  title='Associated Tickets'
  /*tickets: Tickets[]=[];
  ticket: Tickets={
    userid:1,
    ticketnumber:1,
    ticketype:'',
    ticketvalue: 0,
    ticketcomment: '',
    ticketdate: '',
    ticketstatus: ''
  };*/
  data: any=[];//should work
  constructor(
    private router: Router,
    private ticketasscService: TicketAsscService,
    private http: HttpClient
    ) { }

    fetchTickets(){
      this.http.get('http://localhost:8080/Project2/ticket')
        .subscribe(data => {
          this.data.push(data);
          console.log(this.data);
        },error=>console.error(error));
    }

  ngOnInit(): void {
  }

}
