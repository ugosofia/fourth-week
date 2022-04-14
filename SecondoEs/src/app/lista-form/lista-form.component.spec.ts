import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaFormComponent } from './lista-form.component';

describe('ListaFormComponent', () => {
  let component: ListaFormComponent;
  let fixture: ComponentFixture<ListaFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListaFormComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListaFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
