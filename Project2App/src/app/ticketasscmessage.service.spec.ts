import { TestBed } from '@angular/core/testing';

import { TicketasscmessageService } from './ticketasscmessage.service';

describe('TicketasscmessageService', () => {
  let service: TicketasscmessageService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TicketasscmessageService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
