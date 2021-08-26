import { Component, OnInit } from '@angular/core';
import { Users } from '../users';
import { Router } from '@angular/router';
import { UsersService } from '../users.service';
import { NgForm } from '@angular/forms';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  users: Users[] = [];
  user: Users = {
    userid: 1,
    username: '',
    password: '',
    manager: false,
  }
  

  constructor(private router:Router, private ticketService: UsersService,
              private http:HttpClient) { }

              public _url = "http://localhost:8080/createuser"
  ngOnInit(): void {
  }


  onSubmit(form:NgForm){
      const httpOptions = {
        headers: new HttpHeaders({
          'Content-Type': 'application/json'
        })
      }
    console.log(form.value.userid)
    console.log(form.value.username)
    console.log(form.value.password)
    console.log(form.value.manager)
    this.http.post(this._url, 
                    JSON.stringify({
                    user_id: form.value.userid, 
                    username: form.value.username,
                    userpassword: form.value.password,
                    manager: form.value.manager}),httpOptions
                    )
                    .subscribe({
                      next: (data:any)=>{
                      if(data.status === 'success'){
                        this.router.navigate(['users'])
                      }
                    }})
  }

}
