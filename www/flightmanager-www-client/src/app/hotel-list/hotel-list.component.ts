import { Component, OnInit } from '@angular/core';
import { Hotel } from '../hotel';
import { Observable } from 'rxjs';
import { HotelService } from '../hotel.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-hotel-list',
  templateUrl: './hotel-list.component.html',
  styleUrls: ['./hotel-list.component.css']
})
export class HotelListComponent implements OnInit {

  hotels: Observable<Hotel[]>;

  constructor(private hotelService: HotelService,
    private router: Router) { }

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.hotels = this.hotelService.getHotelList();
  }

  deleteHotel(id: number) {
    this.hotelService.deleteHotel(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));

  }

  hotelDetails(id: number) {
    this.router.navigate(['hotel', id]);
  }
}
