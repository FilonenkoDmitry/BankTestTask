import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomersListComponent } from './customers-list.component';
import { CustomersService } from '../customers.service';
import { Observable } from 'rxjs/Observable';
import { Customer } from '../Customer';
import { Address } from '../Address';
import { RouterTestingModule } from '@angular/router/testing';
import { By } from '@angular/platform-browser';

describe('CustomersListComponent', () => {
  let customersService: CustomersService;
  let component: CustomersListComponent;
  let fixture: ComponentFixture<CustomersListComponent>;

  const stubCustomersService = jasmine.createSpyObj('CustomersService', ['findAll']);
    stubCustomersService.findAll.and.returnValue(Observable.of([
      new Customer("111", "John", "Lennon", "The Beatles", new Address("Penny Lane 23", null, null, "123", "Liverpool", "UK"), "lennon@beatles.com"),
      new Customer("222", "Fyodor", "Dostoevsky", "Tolstoy & Co", new Address("Gorohovaya 23", null, null, "123456", "St.Petersburg", "Russia"), "idiot@karamazovy.ru")]));

  beforeEach(async(() => {   

    TestBed.configureTestingModule({
      imports: [ RouterTestingModule.withRoutes([]) ],
      declarations: [ CustomersListComponent ],
      providers: [{provide: CustomersService, useValue: stubCustomersService}]
    })
    .overrideComponent(CustomersListComponent, {set: { providers: [
      { provide: CustomersService, useValue: stubCustomersService}
    ]}})
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomersListComponent);
    component = fixture.componentInstance;
    customersService = TestBed.get(CustomersService);
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it ('should populate the table of customers', () => {
    component.ngOnInit();

    var rows = fixture.nativeElement.querySelectorAll('tr');

    expect(rows.length).toBe(3);
    ["111", "John", "Lennon", "Liverpool", "lennon@beatles.com"].forEach(element => {
      expect(rows[1].innerHTML).toContain(element);  
    });

    ["222", "Fyodor", "Dostoevsky", "St.Petersburg", "idiot@karamazovy.ru"].forEach(element => {
      expect(rows[2].innerHTML).toContain(element);  
    });
  });
});
