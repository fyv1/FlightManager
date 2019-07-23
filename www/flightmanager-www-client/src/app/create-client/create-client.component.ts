import { Component, OnInit } from '@angular/core';
import { Client } from '../client';
import { ClientService } from '../client.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-client',
  templateUrl: './create-client.component.html',
  styleUrls: ['./create-client.component.css']
})
export class CreateClientComponent implements OnInit {

  client: Client = new Client();
  submitted = false;

  constructor(private clientService: ClientService,
    private router: Router) { }

  ngOnInit() {
  }

  newClient(): void {
    this.submitted = false;
    this.client = new Client();
  }
  save() {
    this.clientService.createClient(this.client)
      .subscribe(data => console.log(data), error => console.log(error));
      this.client = new Client();
      this.gotoClientList();
  }
  onSubmit() {
    this.submitted = true;
    this.save();
  }

  gotoClientList() {
    this.router.navigate(['/clients']);
  }

}
