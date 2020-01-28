import { FlightService } from './../flight.service';
import { Flight } from './../flight';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Client } from '../client';
import { ClientService } from '../client.service';

@Component({
  selector: 'app-flight-details',
  templateUrl: './flight-details.component.html',
  styleUrls: ['./flight-details.component.css']
})
export class FlightDetailsComponent implements OnInit {

  flight: Flight = new Flight();
  clients: Observable<Client[]>;

  constructor(private route: ActivatedRoute,
    private clientService: ClientService, private flightService: FlightService, private router: Router) { }

  ngOnInit() {
    this.flightService.getFlight(this.route.snapshot.params.id).subscribe((data) => {
      this.flight = data;
    });
    this.clients = this.clientService.getClientList();
  }

  updateFlight() {
    this.flightService.updateFlight(this.flight.id, this.flight)
    .subscribe(
      data => {
        console.log(data);
      },
      error => console.log(error),
      () => this.router.navigate(['/flights']));
  }
}
