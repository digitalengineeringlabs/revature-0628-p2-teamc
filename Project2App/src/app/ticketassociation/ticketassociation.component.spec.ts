import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TicketassociationComponent } from './ticketassociation.component';

describe('TicketassociationComponent', () => {
  let component: TicketassociationComponent;
  let fixture: ComponentFixture<TicketassociationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TicketassociationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TicketassociationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
