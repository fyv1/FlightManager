import { Component, OnInit } from '@angular/core';
import { CarService } from '../car.service';
import { Car } from '../car';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

@Component({
  selector: 'app-car-list',
  templateUrl: './car-list.component.html',
  styleUrls: ['./car-list.component.css']
})
export class CarListComponent implements OnInit {

  cars: Observable<Car[]>;

  constructor(private carService: CarService,
    private router: Router) { }

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.cars = this.carService.getCarList();
  }

  deleteCar(id: number) {
    this.carService.deleteCar(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));

  }

  carDetails(id: number) {
    this.router.navigate(['car', id]);
  }
}
