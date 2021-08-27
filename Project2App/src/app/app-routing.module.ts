import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
<<<<<<< HEAD
import { TicketassociationComponent } from './ticketassociation/ticketassociation.component';
const routes: Routes=[
  {path: 'tickets', component: TicketassociationComponent},
];

@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
=======
import { TicketsComponent } from './tickets/tickets.component';
import { UsersComponent } from './users/users.component';
import {LoginComponent} from "./login/login.component";


const routes: Routes = [
  {path: 'newticket', component: TicketsComponent},
  {path: 'newuser', component: UsersComponent},
  {path: 'login', component: LoginComponent},
  {path: '', redirectTo: '/login', pathMatch: 'full'}
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
>>>>>>> main
})
export class AppRoutingModule { }
