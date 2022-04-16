import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-toolbar',
  template: './toolbar.component.html',
  styleUrls: ['./toolbar.component.css']
})
export class ToolbarComponent  {
 
  setClasses() {
    const obj =  {
      backgroundColor: 'red',
      color: 'blues',
    };
    return obj;
  }
}
