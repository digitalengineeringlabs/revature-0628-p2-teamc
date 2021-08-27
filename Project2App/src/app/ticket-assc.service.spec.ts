import { TestBed } from '@angular/core/testing';

import { TicketAsscService } from './ticket-assc.service';

describe('TicketAsscService', () => {
  let service: TicketAsscService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TicketAsscService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
