import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";
import { MatSlideToggleModule } from '@angular/material/slide-toggle';
import { RadioButtonComponent } from './radio-button/radio-button.component';


@NgModule ( {
    imports: [CommonModule, MatSlideToggleModule, RadioButtonComponent ],
    exports: [CommonModule, MatSlideToggleModule, RadioButtonComponent]
})
export class MaterialModule {}