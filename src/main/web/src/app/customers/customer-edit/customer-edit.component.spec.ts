import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CustomerEditComponent } from './customer-edit.component';
import { CustomersService } from '../customers.service';
import {ActivatedRoute} from '@angular/router';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/observable/of';

class MockCustomersService {};

describe('CustomerEditComponent', () => {
  let component: CustomerEditComponent;
  let fixture: ComponentFixture<CustomerEditComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [
        ReactiveFormsModule,
        RouterTestingModule.withRoutes([])
      ],
      declarations: [ CustomerEditComponent ],
      providers: [CustomerEditComponent, {provide: CustomersService, useClass: MockCustomersService}, {provide: ActivatedRoute,
        useValue: {
          params: Observable.of({id: 123})
        }}]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    // fixture = TestBed.createComponent(CustomerEditComponent);
    // component = fixture.componentInstance;
    // fixture.detectChanges();
    component = TestBed.get(CustomerEditComponent);
    // customersService = TestBed.get(CustomersService);
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
