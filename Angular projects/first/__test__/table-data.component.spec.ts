import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TableDataComponent } from '../src/app/table-data/table-data.component';

describe('TableDataComponent', () => {
  let component: TableDataComponent;
  let fixture: ComponentFixture<TableDataComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TableDataComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TableDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
