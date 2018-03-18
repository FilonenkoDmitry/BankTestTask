import { Component, OnDestroy, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators } from "@angular/forms";
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {CustomersService} from "../customers.service";
import {Customer} from "../Customer";
import {ActivatedRoute, Router} from '@angular/router';
import { Address } from '../Address';

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css'],
  providers: [CustomersService]
})
export class CustomerEditComponent implements OnInit, OnDestroy {

  id: string;
  customer: Customer;
  accounts: string[];
 
  customerForm: FormGroup;
  private sub: any;
  
  constructor(private route: ActivatedRoute,
    private router: Router,
    private customersService: CustomersService) { }

  ngOnInit() {
    this.sub = this.route.params.subscribe(params => {
      this.id = params['id'];
    });

    this.customerForm = new FormGroup({
      firstName: new FormControl('', Validators.required),
      lastName: new FormControl('', Validators.required),
      postalAddressLine1: new FormControl('', Validators.required),
      postCity: new FormControl('', Validators.required),
      postCode: new FormControl('', Validators.required),
      postCountry: new FormControl('', Validators.required),
      companyName: new FormControl('', Validators.required),
      email: new FormControl('', [
        Validators.required,
        Validators.pattern("[^ @]*@[^ @]*")
      ])
    });

    if (this.id) { //edit form
      this.customersService.findById(this.id).subscribe(
        customer => {
            this.id = customer.customerId;
            this.customerForm.patchValue({
            firstName: customer.firstName,
            lastName: customer.lastName,
            postalAddressLine1: customer.address.postalAddressLine1,
            postCity: customer.address.postCity,
            postCode: customer.address.postCode,
            postCountry: customer.address.postCountry,
            companyName: customer.companyName, 
            email: customer.email,
          });
         },error => {
          console.log(error);
         }
      );
      
      this.customersService.findCustomerAccounts(this.id).subscribe(
        accNumbers => {
          this.accounts = accNumbers;
        }
        ,error => {
          console.log(error);
         }
      )
    }
  }

  ngOnDestroy(): void {
    this.sub.unsubscribe();
  }
 
  onSubmit() {
    if (this.customerForm.valid) { 
        if (this.id) {
          let customer: Customer = new Customer(this.id,
            this.customerForm.controls['firstName'].value,
            this.customerForm.controls['lastName'].value,
            this.customerForm.controls['companyName'].value,
            new Address(this.customerForm.controls['postalAddressLine1'].value, 
                        null, 
                        null, 
                        this.customerForm.controls['postCode'].value, 
                        this.customerForm.controls['postCity'].value, 
                        this.customerForm.controls['postCountry'].value),
                        this.customerForm.controls['email'].value);
          this.customersService.updateCustomer(customer).subscribe();
        } 
     }
      this.customerForm.reset();
      this.router.navigate(['/customers']);
  }
 
  redirectCustomerPage() {
    this.router.navigate(['/customers']);
 
  }

  openAccountPage(accountId) {
    this.router.navigate([`/accounts/${accountId}`]);
  }

}
