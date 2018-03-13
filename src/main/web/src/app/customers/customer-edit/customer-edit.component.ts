import { Component, OnDestroy, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {CustomersService} from "../customers.service";
import {Customer} from "../Customer";
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css'],
  providers: [CustomersService]
})
export class CustomerEditComponent implements OnInit, OnDestroy {

  id: string;
  customer: Customer;
 
  customerForm: FormGroup;
  
  constructor(private route: ActivatedRoute,
    private router: Router,
    private customersService: CustomersService) { }

  ngOnInit() {
    this.customerForm = new FormGroup({
      firstName: new FormControl('', Validators.required),
      lastName: new FormControl('', Validators.required),
      email: new FormControl('', [
        Validators.required,
        Validators.pattern("[^ @]*@[^ @]*")
      ])
    });
  }

  ngOnDestroy(): void {
  }
 
  onSubmit() {
    if (this.customerForm.valid) {
 
        let customer: Customer = new Customer(null,
        this.customerForm.controls['firstName'].value,
        this.customerForm.controls['lastName'].value,
        this.customerForm.controls['email'].value);
        this.customersService.saveCustomer(customer).subscribe();
 
     }
      this.customerForm.reset();
      this.router.navigate(['/customer']);
  }
 
  redirectCustomerPage() {
    this.router.navigate(['/customer']);
 
  }

}
