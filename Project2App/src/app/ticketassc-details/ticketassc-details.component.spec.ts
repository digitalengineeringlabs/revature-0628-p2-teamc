import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TicketasscDetailsComponent } from './ticketassc-details.component';

describe('TicketasscDetailsComponent', () => {
  let component: TicketasscDetailsComponent;
  let fixture: ComponentFixture<TicketasscDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TicketasscDetailsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TicketasscDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
