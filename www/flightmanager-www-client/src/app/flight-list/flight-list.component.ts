import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Flight } from 'src/app/flight';
import { FlightService } from '../flight.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-flight-list',
  templateUrl: './flight-list.component.html',
  styleUrls: ['./flight-list.component.css']
})
export class FlightListComponent implements OnInit {
  
  flights: Observable<Flight[]>;  

  constructor(private flightService: FlightService,
    private router: Router) { }

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.flights = this.flightService.getFlightsList();
  }

  deleteFlight(id: number) {
    this.flightService.deleteFlight(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
      
  }

  flightDetails(id: number) {
    this.router.navigate(['flight-details', id]);
  }

}
