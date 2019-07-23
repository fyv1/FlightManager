import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ClientService {

  private url = 'http://localhost:8080/api/clients';

  constructor(private http: HttpClient) { }

  getClient(id: number): Observable<any> {
    return this.http.get(`${this.url}/${id}`);
  }

  createClient(client: Object): Observable<Object> {
    return this.http.post(`${this.url}`, client);
  }

  updateClient(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.url}/${id}`, value);
  }

  deleteClient(id: number): Observable<any> {
    return this.http.delete(`${this.url}/${id}`, { responseType: 'text' });
  }

  getClientList(): Observable<any> {
    return this.http.get(`${this.url}`);
  }

}
