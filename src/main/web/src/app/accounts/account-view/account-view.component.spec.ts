import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AccountViewComponent } from './account-view.component';
import { AccountsService } from '../accounts.service';
import { RouterTestingModule } from '@angular/router/testing';

describe('AccountViewComponent', () => {
  let accountsService: AccountsService;
  let component: AccountViewComponent;
  let fixture: ComponentFixture<AccountViewComponent>;

  const stubAccountsService = jasmine.createSpyObj('AccountsService', ['findDetailsById', 'findBalanceById']);

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [ RouterTestingModule.withRoutes([]) ],
      declarations: [ AccountViewComponent ],
      providers: [{provide: AccountsService, useValue: stubAccountsService}]
    })
    .overrideComponent(AccountViewComponent, {set: { providers: [
      { provide: AccountsService, useValue: stubAccountsService}
    ]}})
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AccountViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
