import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Student } from './model/student';

const ELEMENT_DATA: Student[] = [
  {id: '1', nome: 'marco', cognome: 'sss', età: 20, email: ""},
  {id: '2', nome: 'andrea', cognome: 'aaa', età: 23, email: ""},
  {id: '3', nome: 'giovanni', cognome: 'ddd', età: 22, email: ""},
];

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'student-angular-boot';

  students: any[] = [];
  displayedColumns: string[] = ['id', 'nome', 'cognome', 'età', 'email'];
  
  constructor(private httpClient: HttpClient) {
    this.httpClient.get<any>('http://localhost:8080/api/v1/student')
    .subscribe((element) =>  { console.log(element)
    this.students = element;
    
    })
}
}
