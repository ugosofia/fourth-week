import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { MatToolbarModule } from '@angular/material/toolbar';


@NgModule({
  imports: [CommonModule, MatToolbarModule],
  exports:[CommonModule, MatToolbarModule],

})
export class MaterialModule { }
