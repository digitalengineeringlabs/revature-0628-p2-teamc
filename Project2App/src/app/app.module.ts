<<<<<<< HEAD
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { TicketsComponent } from './tickets/tickets.component';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { UsersComponent } from './users/users.component';
=======
import {Routes, RouterModule} from "@angular/router";
import {LoginComponent} from "./login/login.component";

const routes: Routes = [
  {path: '', component: LoginComponent}
]

>>>>>>> frontend-login

@NgModule({
  declarations: [
    AppComponent,
<<<<<<< HEAD
    TicketsComponent,
    UsersComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
=======
    LoginComponent
  ],
  imports: [
    RouterModule.forRoot(routes),
    BrowserModule,
    FormsModule,
>>>>>>> frontend-login
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  exports: [RouterModule]
})

// @ts-ignore
export class AppModule {
}
