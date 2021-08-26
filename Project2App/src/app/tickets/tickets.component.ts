import { Component, OnInit } from '@angular/core';
import { Tickets } from '../tickets';
import { Router } from '@angular/router';
import { TicketsService } from '../tickets.service';
import { NgForm } from '@angular/forms';
import { HttpClient, HttpHeaders } from '@angular/common/http';


@Component({
  selector: 'app-tickets',
  templateUrl: './tickets.component.html',
  styleUrls: ['./tickets.component.css']
})

export class TicketsComponent implements OnInit {

  tickets: Tickets[] = [];
  ticket: Tickets = {
    userid: 1,
    ticketnumber: 0,
    tickettype: '',
    ticketvalue: 0.0,
    ticketcomment: ''
    // status: ''
  }
  

  constructor(private router:Router, private ticketService: TicketsService,
              private http:HttpClient) { }

              public _url = "http://localhost:8080/ticket"
  ngOnInit(): void {
  }


  onSubmit(form:NgForm){
      const httpOptions = {
        headers: new HttpHeaders({
          'Content-Type': 'application/json'
        })
      }
    console.log(form.value.userid)
    console.log(form.value.ticketvalue)
    console.log(form.value.ticketcomment)
    console.log(form.value.tickettype)
    this.http.post(this._url, 
                    JSON.stringify({
                    user_id: form.value.userid, 
                    ticketcomments: form.value.ticketcomment,
                    tickettype: form.value.tickettype,
                    ticketvalue: form.value.ticketvalue}),httpOptions
                    )
                    .subscribe({
                      next: (data:any)=>{
                      if(data.status === 'success'){
                        this.router.navigate(['tickets'])
                      }
                    }})
  }

}

