import { Flight } from './flight';

export class Client {
    id: number;
    firstName: string;
    lastName: string;
    sex: string;
    country: string;
    notes: string;
    birthdate: Date;
    flightList: Array<Flight>;
}