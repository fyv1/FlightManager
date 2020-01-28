import { Component, OnInit } from '@angular/core';
import { Hotel } from '../hotel';
import { ActivatedRoute, Router } from '@angular/router';
import { HotelService } from '../hotel.service';

@Component({
  selector: 'app-hotel-details',
  templateUrl: './hotel-details.component.html',
  styleUrls: ['./hotel-details.component.css']
})
export class HotelDetailsComponent implements OnInit {

  hotel: Hotel = new Hotel();

  constructor(private route: ActivatedRoute, private hotelService: HotelService, private router: Router) { }

  ngOnInit() {
    this.hotelService.getHotel(this.route.snapshot.params.id).subscribe((data) => {
      this.hotel = data;
    });
  }

  onUpdateHotel() {
    this.hotelService.updateHotel(this.hotel.id, this.hotel)
    .subscribe(
      data => {
        console.log(data);
      },
      error => console.log(error),
      () => this.router.navigate(['/hotels']));
  }
}
