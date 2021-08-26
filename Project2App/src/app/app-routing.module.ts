import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TicketsComponent } from './tickets/tickets.component';
import { UsersComponent } from './users/users.component';


const routes: Routes = [
  {path: 'newticket', component: TicketsComponent},
  {path: 'newuser', component: UsersComponent}
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }