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
  { path: 'client/:id', component: ClientDetailsComponent},
  { path: 'flight/:id', component: FlightDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
