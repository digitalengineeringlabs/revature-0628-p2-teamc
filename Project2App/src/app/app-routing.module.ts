import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TicketassociationComponent } from './ticketassociation/ticketassociation.component';
import { TicketsComponent } from './tickets/tickets.component';
import { UsersComponent } from './users/users.component';
import {LoginComponent} from "./login/login.component";

@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})



const routes: Routes = [
  {path: 'tickets', component: TicketassociationComponent},
  {path: 'newticket', component: TicketsComponent},
  {path: 'newuser', component: UsersComponent},
  {path: 'login', component: LoginComponent},
  {path: '', redirectTo: '/login', pathMatch: 'full'}
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }
