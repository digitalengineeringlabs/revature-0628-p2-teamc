import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { TicketassociationComponent } from './ticketassociation/ticketassociation.component';
import { TicketasscDetailsComponent } from './ticketassc-details/ticketassc-details.component';
import { TicketasscmessagesComponent } from './ticketasscmessages/ticketasscmessages.component';
import { AppRoutingModule } from './app-routing.module';
import { DashboardComponent } from './dashboard/dashboard.component';

@NgModule({
  declarations: [
    AppComponent,
    TicketassociationComponent,
    TicketasscDetailsComponent,
    TicketasscmessagesComponent,
    DashboardComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
