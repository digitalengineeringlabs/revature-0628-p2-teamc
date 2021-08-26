import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TicketsComponent } from './tickets/tickets.component';


const routes: Routes = [
  {path: 'newticket', component: TicketsComponent}
//   ,
//   {path: '', redirectTo: '/ticketcreation', pathMatch: 'full'}
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }