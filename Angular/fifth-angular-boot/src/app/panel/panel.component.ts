import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';


@Component({
  selector: 'app-panel',
  templateUrl: './panel.component.html',
  styleUrls: ['./panel.component.css']
})
export class PanelComponent{
  panelOpenState = false;

  students: any[] = [];
  department: any[] = [];

  constructor(private httpClient: HttpClient) {
    this.httpClient.get<any>('http://localhost:8080/api/v1/')
    .subscribe((student) =>  { console.log(student)
    this.students = student
    
  })

  this.httpClient.get<any>('http://localhost:8080/api/v2/')
  .subscribe((dep) =>  { console.log(dep)
  this.department = dep
  })

  }
}