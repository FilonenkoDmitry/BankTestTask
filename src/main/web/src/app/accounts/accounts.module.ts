import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AccountsRoutingModule } from './accounts-routing.module';
import { AccountViewComponent } from './account-view/account-view.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { NgbDatepickerModule } from '@ng-bootstrap/ng-bootstrap';

@NgModule({
  imports: [
    CommonModule,
    AccountsRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    NgbDatepickerModule
  ],
  declarations: [AccountViewComponent]
})
export class AccountsModule { }
