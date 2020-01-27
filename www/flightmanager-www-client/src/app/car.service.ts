import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CarService {

  private url = 'https://simpleflight.herokuapp.com/api/car';

  constructor(private http: HttpClient) { }

  getCar(id: number): Observable<any> {
    return this.http.get(`${this.url}/${id}`);
  }

  createCar(car: Object): Observable<Object> {
    return this.http.post(`${this.url}`, car);
  }

  updateCar(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.url}/${id}`, value);
  }

  deleteCar(id: number): Observable<any> {
    return this.http.delete(`${this.url}/${id}`, { responseType: 'text' });
  }

  getCarList(): Observable<any> {
    return this.http.get(`${this.url}s`);
  }

}
