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

    expect(component.customerForm.controls.firstName.value).toEqual("John");
    expect(component.customerForm.controls.lastName.value).toEqual("Lennon");
    expect(component.customerForm.controls.companyName.value).toEqual("The Beatles");
    expect(component.customerForm.controls.postalAddressLine1.value).toEqual("Penny Lane 23");
    expect(component.customerForm.controls.postCode.value).toEqual("123");
    expect(component.customerForm.controls.postCity.value).toEqual("Liverpool");
    expect(component.customerForm.controls.postCountry.value).toEqual("UK");
    expect(component.customerForm.controls.email.value).toEqual("lennon@beatles.com");
  });

  it('on submit should push form content to backend', () => {
    component.ngOnInit();

    component.customerForm.controls.firstName.setValue("Fyodor");
    component.customerForm.controls.lastName.setValue("Dostoevsky");
    component.customerForm.controls.companyName.setValue("Tolstoy & Co");
    component.customerForm.controls.postalAddressLine1.setValue("Gorohovaya 23");
    component.customerForm.controls.postCode.setValue("123456");
    component.customerForm.controls.postCity.setValue("St.Petersburg");
    component.customerForm.controls.postCountry.setValue("Russia");
    component.customerForm.controls.email.setValue("idiot@karamazovy.ru");

    component.onSubmit();    

    expect(customersService.updateCustomer).toHaveBeenCalledWith(new Customer("111", "Fyodor", "Dostoevsky", "Tolstoy & Co", new Address("Gorohovaya 23", null, null, "123456", "St.Petersburg", "Russia"), "idiot@karamazovy.ru"));
  });
});
