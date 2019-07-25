import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FlightService {
  
  private url = 'http://localhost:8080/api/flights';

  constructor(private http: HttpClient) { }

  getFlight(id: number): Observable<any> {
    return this.http.get(`${this.url}/${id}`);
  }

  createFlight(flight: Object): Observable<Object> {
    return this.http.post(`${this.url}`, flight);
  }

  updateFlight(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.url}/${id}`, value);
  }

  deleteFlight(id: number): Observable<any> {
    return this.http.delete(`${this.url}/${id}`, { responseType: 'text' });
  }

  getFlightsList(): Observable<any> {
    return this.http.get(`${this.url}`);
  }
}
