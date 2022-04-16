import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";
import { MatToolbarModule } from "@angular/material/toolbar";
import { MatIconModule } from '@angular/material/icon';
import { MatButtonModule } from '@angular/material/button';



@NgModule ( {
    imports: [CommonModule, MatToolbarModule, MatIconModule, MatButtonModule],
    exports: [CommonModule, MatToolbarModule, MatIconModule, MatButtonModule]
})
export class MaterialModule {}