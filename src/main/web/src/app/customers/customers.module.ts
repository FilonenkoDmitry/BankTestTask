import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CustomersRoutingModule } from './customers-routing.module';
import { CustomersListComponent } from './customers-list/customers-list.component';
import { CustomerEditComponent } from './customer-edit/customer-edit.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
  imports: [
    CommonModule,
    CustomersRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  declarations: [CustomersListComponent, CustomerEditComponent]
})
export class CustomersModule { }
