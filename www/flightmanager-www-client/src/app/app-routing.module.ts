import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ClientListComponent } from './client-list/client-list.component';
import { CreateClientComponent } from './create-client/create-client.component';
import { FlightListComponent } from './flight-list/flight-list.component';
import { CreateFlightComponent } from './create-flight/create-flight.component';


const routes: Routes = [
  { path: '', redirectTo: 'flight', pathMatch: 'full' },
  { path: 'clients', component: ClientListComponent },
  { path: 'clients/add', component: CreateClientComponent },
  { path: 'flights', component: FlightListComponent },
  { path: 'flights/add', component: CreateFlightComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
