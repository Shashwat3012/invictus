import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Marketplace1Component } from './marketplace1.component';

describe('Marketplace1Component', () => {
  let component: Marketplace1Component;
  let fixture: ComponentFixture<Marketplace1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Marketplace1Component ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(Marketplace1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
