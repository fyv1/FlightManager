import { Component, OnInit } from '@angular/core';
import { Client } from '../client';
import { ActivatedRoute } from '@angular/router';
import { ClientService } from '../client.service';

@Component({
  selector: 'app-client-details',
  templateUrl: './client-details.component.html',
  styleUrls: ['./client-details.component.css']
})
export class ClientDetailsComponent implements OnInit {

  client: Client = new Client();

  constructor(private route: ActivatedRoute, private clientService: ClientService) { }

  ngOnInit() {
    this.clientService.getClient(this.route.snapshot.params.id).subscribe((data) => {
      this.client = data;
    });
  }

  updateUser() {
    this.clientService.updateClient(this.client.id, this.client)
    .subscribe(
      data => {
        console.log(data);
      },
      error => console.log(error));
  }
}
