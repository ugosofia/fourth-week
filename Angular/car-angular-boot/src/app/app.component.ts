import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'car-angular-boot';

  vehicles: any[] = []
  
  constructor(private httpClient: HttpClient) {
    this.httpClient.get<any>('http://localhost:8080/api/v2/')
    .subscribe((obs) =>  { console.log(obs)
    this.vehicles = obs;
    });
  }
}
