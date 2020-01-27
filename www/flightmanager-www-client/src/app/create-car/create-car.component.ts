import { CarService } from './../car.service';
import { Component, OnInit } from '@angular/core';
import { Car } from '../car';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-car',
  templateUrl: './create-car.component.html',
  styleUrls: ['./create-car.component.css']
})
export class CreateCarComponent implements OnInit {

  car: Car = new Car();

  constructor(private carService: CarService,
    private router: Router) { }

  ngOnInit() {
  }

  onCreateCar() {
    this.carService.createCar(this.car)
      .subscribe(data => console.log(data), error => console.log(error), () => this.gotoCarsList());
  }

  gotoCarsList() {
    this.router.navigate(['/cars']);
  }
}
