import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { APP_BASE_HREF } from '@angular/common';


import { AppComponent } from './app.component';
import { CreditoComponent } from './credito/credito.component';


@NgModule({
  declarations: [
    AppComponent,
    CreditoComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule],
  bootstrap: [AppComponent]
})
export class AppModule { }
