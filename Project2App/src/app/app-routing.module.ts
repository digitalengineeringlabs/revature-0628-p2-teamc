import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TicketassociationComponent } from './ticketassociation/ticketassociation.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { TicketasscDetailsComponent } from './ticketassc-details/ticketassc-details.component';

const routes: Routes=[
  {path: '', redirectTo: '/dashboard', pathMatch: 'full'},
  {path: 'dashboard', component: DashboardComponent},
  {path: 'detail/:id', component: TicketasscDetailsComponent},
  {path: 'tickets', component: TicketassociationComponent},
];

@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
