import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs/internal/BehaviorSubject';
import { Client } from 'src/app/client';

@Injectable()
export class ClientListService {

    private clientsSource = new BehaviorSubject<Client[]>(Client[]);
    
    

}