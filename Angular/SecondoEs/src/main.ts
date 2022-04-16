import { enableProdMode } from '@angular/core';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { AppModule } from './app/app.module';
import { environment } from './environments/environment';

if (environment.production) {
  enableProdMode();
}

platformBrowserDynamic().bootstrapModule(AppModule)
  .catch(err => console.error(err));


  /**
   * in cima toolbar
immagine con width 100% height 250px
4 icone con chi siamo, contatti, 
lista a sx, form a destra con select e submit
footer
   */