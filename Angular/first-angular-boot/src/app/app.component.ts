import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  title = 'first-angular-boot';

  students: any[] = [];
  displayedColumns: string[] = ['id', 'nome', 'cognome', 'età', 'email'];

  constructor(private httpClient: HttpClient) {
    this.httpClient.get<any>('http://localhost:8080/api/v1/student')
    .subscribe((element) =>  { console.log(element)
    this.students = element;
    
    })
    
}

}

