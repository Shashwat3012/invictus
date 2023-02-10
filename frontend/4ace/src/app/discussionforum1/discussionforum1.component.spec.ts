import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Discussionforum1Component } from './discussionforum1.component';

describe('Discussionforum1Component', () => {
  let component: Discussionforum1Component;
  let fixture: ComponentFixture<Discussionforum1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Discussionforum1Component ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(Discussionforum1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
