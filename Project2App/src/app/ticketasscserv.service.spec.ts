import { TestBed } from '@angular/core/testing';

import { TicketasscservService } from './ticketasscserv.service';

describe('TicketasscservService', () => {
  let service: TicketasscservService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TicketasscservService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
