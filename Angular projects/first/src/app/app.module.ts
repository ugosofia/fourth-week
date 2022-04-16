import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { SpinnerComponent } from './spinner/spinner.component';
import { MaterialModule } from 'src/app/spinner/material.module';
import { ToolbarComponent } from './toolbar/toolbar.component';

@NgModule({
  declarations: [
    AppComponent,
    SpinnerComponent,
    ToolbarComponent
  ],
  imports: [
    BrowserModule,
    MaterialModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
