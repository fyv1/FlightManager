import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HotelService {

  private url = 'https://simpleflight.herokuapp.com/api/hotel';

  constructor(private http: HttpClient) { }

  getHotel(id: number): Observable<any> {
    return this.http.get(`${this.url}/${id}`);
  }

  createHotel(hotel: Object): Observable<Object> {
    return this.http.post(`${this.url}`, hotel);
  }

  updateHotel(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.url}/${id}`, value);
  }

  deleteHotel(id: number): Observable<any> {
    return this.http.delete(`${this.url}/${id}`, { responseType: 'text' });
  }

  getHotelList(): Observable<any> {
    return this.http.get(`${this.url}s`);
  }

}
