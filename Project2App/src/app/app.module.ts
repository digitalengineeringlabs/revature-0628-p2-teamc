import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
<<<<<<< HEAD
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { TicketassociationComponent } from './ticketassociation/ticketassociation.component';
import { AppRoutingModule } from './app-routing.module';
import {HttpClientModule} from '@angular/common/http';
=======
import { AppComponent } from './app.component';
import { TicketsComponent } from './tickets/tickets.component';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { UsersComponent } from './users/users.component';
import {Routes, RouterModule} from "@angular/router";
import {LoginComponent} from "./login/login.component";

const routes: Routes = [
  {path: '', component: LoginComponent}
]
>>>>>>> main

@NgModule({
  declarations: [
    AppComponent,
<<<<<<< HEAD
    TicketassociationComponent,
=======
    TicketsComponent,
    UsersComponent,
    LoginComponent
>>>>>>> main
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  exports: [RouterModule]
})

// @ts-ignore
export class AppModule {
}
