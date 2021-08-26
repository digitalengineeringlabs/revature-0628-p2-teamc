import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {NgForm} from "@angular/forms";
import {Route, Router} from "@angular/router";


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginUrl = "http://localhost:8080/createuser/login"
  invalid: boolean = false;

  constructor(private http: HttpClient, private router: Router) {
  }

  ngOnInit(): void {
  }

  onSubmit(form: NgForm) {
    console.log(JSON.stringify({username: form.value.username, userpassword: form.value.password}))
    this.http.post(this.loginUrl, {username: form.value.username, userpassword: form.value.password})
      .subscribe({
        next: (data: any) => {
          if (data != null) {
            localStorage.setItem("id", data.userid);
            localStorage.setItem("manager", data.manager);
            this.router.navigate(['newticket']);
            console.log("Login Worked");
          } else {
            this.invalid = true;
            console.log("Login Did Not Work");
          }
        }

      })
  }

}
