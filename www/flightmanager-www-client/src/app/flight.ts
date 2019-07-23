import { Client } from './client';

export class Flight {
    id: number;
    departurePlace: string;
    arrivalPlace: string;
    deparatureTime: Date;
    arrivalTime: Date;
    freeSeats: number;
    clientList: Array<Client>;
    price: number;
}