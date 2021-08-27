import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TicketassociationComponent } from './ticketassociation/ticketassociation.component';
const routes: Routes=[
  {path: 'tickets', component: TicketassociationComponent},
];

@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
