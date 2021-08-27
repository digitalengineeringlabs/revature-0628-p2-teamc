import { Component, Input, OnInit } from '@angular/core';
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
    userid: 0,
    ticketnumber: 0,
    tickettype: '',
    ticketvalue: 0.0,
    ticketcomment: '',
    status: '',
    ticketdate: ''
  }
  

  constructor(private router:Router, private ticketService: TicketsService,
              private http:HttpClient) { }

              public _url = "http://localhost:8080/ticket"
  ngOnInit(): void {
  }

  logout(){
    localStorage.clear()
    this.router.navigate(['login'])
  }


  onSubmit(form:NgForm){
    var loginId = localStorage.getItem("id");
      const httpOptions = {
        headers: new HttpHeaders({
          'Content-Type': 'application/json'
        })
      }
    console.log(form.value.ticketvalue)
    console.log(form.value.ticketcomment)
    console.log(form.value.tickettype)
    console.log(loginId)
    this.http.post(this._url, 
                    JSON.stringify({
                    user_id: loginId, 
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

