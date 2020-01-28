import { Component, OnInit } from '@angular/core';
import { Car } from '../car';
import { CarService } from '../car.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-car-details',
  templateUrl: './car-details.component.html',
  styleUrls: ['./car-details.component.css']
})
export class CarDetailsComponent implements OnInit {

  car: Car = new Car();

  constructor(private route: ActivatedRoute, private carService: CarService, private router: Router) { }

  ngOnInit() {
    this.carService.getCar(this.route.snapshot.params.id).subscribe((data) => {
      this.car = data;
    });
  }

  updateCar() {
    this.carService.updateCar(this.car.id, this.car)
    .subscribe(
      data => {
        console.log(data);
      },
      error => console.log(error),
      () => this.router.navigate(['/cars']));
  }
}
