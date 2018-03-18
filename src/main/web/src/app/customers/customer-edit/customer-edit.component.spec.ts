import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CustomerEditComponent } from './customer-edit.component';
import { CustomersService } from '../customers.service';
import {ActivatedRoute} from '@angular/router';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/observable/of';
import { Customer } from '../Customer';
import { Address } from '../Address';

describe('CustomerEditComponent', () => {
  let customersService: CustomersService;
  let component: CustomerEditComponent;
  let fixture: ComponentFixture<CustomerEditComponent>;

  beforeEach(async(() => {
  const stubCustomer = new Customer("111", "John", "Lennon", "The Beatles", new Address("Penny Lane 23", null, null, "123", "Liverpool", "UK"), "lennon@beatles.com");
  const stubCustomersService = jasmine.createSpyObj('CustomersService', ['findById', 'findCustomerAccounts', 'updateCustomer']);
  stubCustomersService.findById.and.returnValue(Observable.of(stubCustomer));
  stubCustomersService.findCustomerAccounts.and.returnValue(Observable.of(['999']));
  stubCustomersService.updateCustomer.and.returnValue(Observable.of(stubCustomer));

    TestBed.configureTestingModule({
      imports: [
        ReactiveFormsModule,
        RouterTestingModule.withRoutes([])
      ],
      declarations: [ CustomerEditComponent ],
      providers: [CustomerEditComponent, 
                  {provide: CustomersService, useValue: stubCustomersService}, 
                  {provide: ActivatedRoute, useValue: {params: Observable.of({id: "123"})}}]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    // fixture = TestBed.createComponent(CustomerEditComponent);
    // component = fixture.componentInstance;
    // fixture.detectChanges();
    component = TestBed.get(CustomerEditComponent);
    customersService = TestBed.get(CustomersService);
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should populate form', () => {
    customersService.findById('123')
    component.ngOnInit();

    expect(component.customerForm.value['firstName']).toEqual("John");
    expect(component.customerForm.value['lastName']).toEqual("Lennon");
    expect(component.customerForm.value['companyName']).toEqual("The Beatles");
    expect(component.customerForm.value['postalAddressLine1']).toEqual("Penny Lane 23");
    expect(component.customerForm.value['postCode']).toEqual("123");
    expect(component.customerForm.value['postCity']).toEqual("Liverpool");
    expect(component.customerForm.value['postCountry']).toEqual("UK");
    expect(component.customerForm.value['email']).toEqual("lennon@beatles.com");
  });

  it('on submit should push form content to backend', () => {
    component.ngOnInit();

    component.customerForm.value['firstName'] = "Fyodor";
    component.customerForm.value['lastName'] = "Dostoevsky";
    component.customerForm.value['companyName'] = "Tolstoy & Co";
    component.customerForm.value['postalAddressLine1'] = "Gorohovaya 23";
    component.customerForm.value['postCode'] = "123456";
    component.customerForm.value['postCity'] = "St.Petersburg";
    component.customerForm.value['postCountry'] = "Russia";
    component.customerForm.value['email'] = "idiot@karamazovy.ru";
    
    component.onSubmit();    

    expect(customersService.updateCustomer).toHaveBeenCalledWith(new Customer("111", "Fyodor", "Dostoevsky", "Tolstoy & Co", new Address("Gorohovaya 23", null, null, "123456", "St.Petersburg", "Russia"), "idiot@karamazovy.ru"));
  });
});
