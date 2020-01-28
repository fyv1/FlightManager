import { Hotel } from './../hotel';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HotelService } from '../hotel.service';

@Component({
  selector: 'app-create-hotel',
  templateUrl: './create-hotel.component.html',
  styleUrls: ['./create-hotel.component.css']
})
export class CreateHotelComponent implements OnInit {

  hotel: Hotel = new Hotel();

  constructor(private hotelService: HotelService,
    private router: Router) { }

  ngOnInit() {
  }

  onCreateHotel() {
    this.hotelService.createHotel(this.hotel)
      .subscribe(
        data => console.log(data),
        error => console.log(error),
        () => this.gotoHotelsList());
  }

  gotoHotelsList() {
    this.router.navigate(['/hotels']);
  }
}
