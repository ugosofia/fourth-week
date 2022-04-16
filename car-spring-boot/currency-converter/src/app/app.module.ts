import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { SpinnerComponent } from './spinner/spinner.component';
import { MoneyComponent } from './money/money.component';
import { CurrencySelectorComponent } from './currency-selector/currency-selector.component';
import { CurrencyListComponent } from './currency-list/currency-list.component';
import { CurrencyListItemComponent } from './currency-list-item/currency-list-item.component';

@NgModule({
  declarations: [
    AppComponent,
    SpinnerComponent,
    MoneyComponent,
    CurrencySelectorComponent,
    CurrencyListComponent,
    CurrencyListItemComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
