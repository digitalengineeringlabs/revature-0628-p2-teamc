import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {AppComponent} from "./app.component";
import {Routes, RouterModule} from "@angular/router";
import {LoginComponent} from "./login/login.component";

const routes: Routes = [
  {path: '', component: LoginComponent}
]


@NgModule({
  declarations: [AppComponent],
  imports: [RouterModule.forRoot(routes),
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  exports: [RouterModule]
})

// @ts-ignore
export class AppModule {
}
