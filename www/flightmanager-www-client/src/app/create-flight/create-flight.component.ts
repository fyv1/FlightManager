import { Component, OnInit, Input } from '@angular/core';
import { Flight } from '../flight';
import { FlightService } from '../flight.service';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Client } from 'src/app/client';
import { ClientService } from 'src/app/client.service';

@Component({
  selector: 'app-create-flight',
  templateUrl: './create-flight.component.html',
  styleUrls: ['./create-flight.component.css']
})
export class CreateFlightComponent implements OnInit {

  flight: Flight = new Flight();
  clients: Observable<Client[]>;
  submitted = false;

  constructor(private flightService: FlightService,
              private clientService: ClientService,
              private router: Router
  ) { }

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.clients = this.clientService.getClientList();
  }

  newFlight(): void {
    this.submitted = false;
    this.flight = new Flight();
  }
  save() {
    this.flightService.createFlight(this.flight)
      .subscribe(data => console.log(data), error => console.log(error));
    this.flight = new Flight();
    this.gotoFlightList();
  }
  onSubmit() {
    this.submitted = true;
    this.save();
  }

  gotoFlightList() {
    this.router.navigate(['/flights']);
  }


}
