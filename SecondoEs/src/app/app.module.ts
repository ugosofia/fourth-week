import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { MatToolbarModule } from "@angular/material/toolbar";
import {MatListModule} from '@angular/material/list';
import {MatFormFieldModule} from '@angular/material/form-field';
import { MatFormField } from "@angular/material/form-field";


import { AppComponent } from './app.component';
import { ToolbarComponent } from './toolbar/toolbar.component';
import { FooterComponent } from './footer/footer.component';
import { ImageComponent } from './image/image.component';
import { ListaFormComponent } from './lista-form/lista-form.component';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';


@NgModule({
  declarations: [
    AppComponent,
    ToolbarComponent,
    FooterComponent,
    ImageComponent,
    ListaFormComponent,
  
    
  ],
  imports: [
    BrowserModule, MatListModule, BrowserAnimationsModule, MatToolbarModule, MatFormFieldModule,MatFormField
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
