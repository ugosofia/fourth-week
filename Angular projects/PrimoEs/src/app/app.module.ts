import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { MatSlideToggleModule } from '@angular/material/slide-toggle'; 
import { AppComponent } from './app.component';
import { SlideComponent } from './slide/slide.component';
import { RadioButtonComponent } from './radio-button/radio-button.component';
import { MaterialModule } from './material.module';
import { MatSliderModule } from '@angular/material/slider';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@NgModule({
  declarations: [
    AppComponent,
    SlideComponent,
    RadioButtonComponent,
    
  ],
  imports: [BrowserModule, MaterialModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }


