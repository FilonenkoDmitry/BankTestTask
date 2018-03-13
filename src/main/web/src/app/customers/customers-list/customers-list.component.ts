import { Component, OnInit } from '@angular/core';
import { Customer } from "../Customer";
import { CustomersService } from "../customers.service";
import { Router } from '@angular/router';

@Component({
  selector: 'app-customers-list',
  templateUrl: './customers-list.component.html',
  styleUrls: ['./customers-list.component.css'],
  providers: [CustomersService]
})
export class CustomersListComponent implements OnInit {

  private customers: Customer[];

  constructor(private customersService: CustomersService) { }

  ngOnInit() {
    this.getAllCustomers();
  }

  getAllCustomers() {
    this.customersService.findAll().subscribe(
      customers => {
        this.customers = customers;
      },
      err => {
        console.log(err);
      }
 
    );
  }

  editCustomerPage(customer: Customer) {
    if (customer) {
      this.router.navigate(['/customers/edit', customer.customerId]);
    }
  }
}
