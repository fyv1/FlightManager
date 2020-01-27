import { CreateHotelComponent } from './create-hotel/create-hotel.component';
import { HotelListComponent } from './hotel-list/hotel-list.component';
import { CarListComponent } from './car-list/car-list.component';
import { CreateCarComponent } from './create-car/create-car.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ClientListComponent } from './client-list/client-list.component';
import { CreateClientComponent } from './create-client/create-client.component';
import { FlightListComponent } from './flight-list/flight-list.component';
import { CreateFlightComponent } from './create-flight/create-flight.component';
import { ClientDetailsComponent } from './client-details/client-details.component';
import { FlightDetailsComponent } from './flight-details/flight-details.component';


const routes: Routes = [
  { path: '', redirectTo: 'flights', pathMatch: 'full' },
  { path: 'clients', component: ClientListComponent },
  { path: 'client/add', component: CreateClientComponent },
  { path: 'flights', component: FlightListComponent },
  { path: 'flight/add', component: CreateFlightComponent},
  { path: 'cars', component: CarListComponent },
  { path: 'car/add', component: CreateCarComponent},
  { path: 'hotels', component: HotelListComponent },
  { path: 'hotel/add', component: CreateHotelComponent},
  { path: 'client/:id', component: ClientDetailsComponent},
  { path: 'flight/:id', component: FlightDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
