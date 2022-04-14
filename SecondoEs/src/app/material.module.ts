import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";
import { MatToolbarModule } from "@angular/material/toolbar";
import {MatListModule} from '@angular/material/list';
import { MatButtonModule } from '@angular/material/button';
import {MatFormFieldModule} from '@angular/material/form-field';
import { MatFormField } from "@angular/material/form-field";



@NgModule ( {
    imports: [CommonModule, MatToolbarModule, MatButtonModule, MatListModule, MatFormFieldModule, MatFormField],
    exports: [CommonModule, MatToolbarModule, MatButtonModule, MatListModule, MatFormFieldModule,MatFormField]
})
export class MaterialModule {}