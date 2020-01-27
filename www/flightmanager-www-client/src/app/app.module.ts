import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http'; 

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateClientComponent } from './create-client/create-client.component';
import { CreateFlightComponent } from './create-flight/create-flight.component';
import { ClientDetailsComponent } from './client-details/client-details.component';
import { FlightDetailsComponent } from './flight-details/flight-details.component';
import { ClientListComponent } from './client-list/client-list.component';
import { FlightListComponent } from './flight-list/flight-list.component';
import { CreateCarComponent } from './create-car/create-car.component';
import { CarListComponent } from './car-list/car-list.component';
import { HotelListComponent } from './hotel-list/hotel-list.component';
import { CreateHotelComponent } from './create-hotel/create-hotel.component';

@NgModule({
  declarations: [
    AppComponent,
    CreateClientComponent,
    CreateFlightComponent,
    ClientDetailsComponent,
    FlightDetailsComponent,
    ClientListComponent,
    FlightListComponent,
    CreateCarComponent,
    CarListComponent,
    HotelListComponent,
    CreateHotelComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
