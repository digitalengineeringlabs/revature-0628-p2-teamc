import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TicketasscmessagesComponent } from './ticketasscmessages.component';

describe('TicketasscmessagesComponent', () => {
  let component: TicketasscmessagesComponent;
  let fixture: ComponentFixture<TicketasscmessagesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TicketasscmessagesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TicketasscmessagesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
