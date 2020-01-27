import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BookingService {

  private url = 'https://simpleflight.herokuapp.com/api/booking';

  constructor(private http: HttpClient) { }

  getBooking(id: number): Observable<any> {
    return this.http.get(`${this.url}/${id}`);
  }

  createBooking(booking: Object): Observable<Object> {
    return this.http.post(`${this.url}`, booking);
  }

  updateBooking(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.url}/${id}`, value);
  }

  deleteBooking(id: number): Observable<any> {
    return this.http.delete(`${this.url}/${id}`, { responseType: 'text' });
  }

  getBookingList(): Observable<any> {
    return this.http.get(`${this.url}s`);
  }

}
