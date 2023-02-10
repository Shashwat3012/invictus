import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IdeaWallComponent } from './idea-wall.component';

describe('IdeaWallComponent', () => {
  let component: IdeaWallComponent;
  let fixture: ComponentFixture<IdeaWallComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ IdeaWallComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(IdeaWallComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
