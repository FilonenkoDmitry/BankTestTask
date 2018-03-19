import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AccountViewComponent } from './account-view/account-view.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
 
const routes: Routes = [
  {path: 'accounts/:id', component: AccountViewComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes), NgbModule],
  exports: [RouterModule]
})
export class AccountsRoutingModule { }
