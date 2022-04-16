import { NgIf } from '@angular/common';
import { Component, OnInit, ViewEncapsulation } from '@angular/core';

@Component({
  selector: 'app-slide',
  templateUrl: './slide.component.html',
  styleUrls: ['./slide.component.css'],
  encapsulation: ViewEncapsulation.None,
})
export class SlideComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
