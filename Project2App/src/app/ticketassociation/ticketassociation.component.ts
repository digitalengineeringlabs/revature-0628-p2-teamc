import { Component, OnInit } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Data, Router } from '@angular/router';
import { NgForm } from '@angular/forms';


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
  selectedData?: Data;
  
  public _url="http://localhost:8080/ticket";

  constructor(
    private router: Router,
    private http: HttpClient
  ){ }

    fetchTickets(){
      this.http.get(this._url)
        .subscribe(data => {
          console.log(data);
          this.data=data;
        },error=>console.error(error));
    }

  ngOnInit(): void {
    this.fetchTickets();
  }
  onSelect(data: Data): void{
    this.selectedData=data;
  }
  logout(){
    localStorage.clear()
    this.router.navigate(['login'])
  }

}
