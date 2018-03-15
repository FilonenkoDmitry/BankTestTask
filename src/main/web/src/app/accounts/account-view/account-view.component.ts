import { Component, OnInit } from '@angular/core';
import { AccountDetails } from "../AccountDetails"
import { AccountBalance } from "../AccountBalance"
import { AccountsService } from "../accounts.service"
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-account-view',
  templateUrl: './account-view.component.html',
  styleUrls: ['./account-view.component.css'],
  providers: [AccountsService]
})
export class AccountViewComponent implements OnInit {

  private id: string;
  private account: AccountDetails;
  private balance: AccountBalance;

  private sub: any;

  constructor(private route: ActivatedRoute, private router: Router, private accountsService: AccountsService) { }

  ngOnInit() {
    this.sub = this.route.params.subscribe(params => {
      this.id = params['id'];
    });

    if (this.id) {
      this.accountsService.findDetailsById(this.id).subscribe(
        details => {
            this.account = details;          
         },error => {
          console.log(error);
         }
      ); 

      this.accountsService.findBalanceById(this.id).subscribe(
        balance => {
            this.balance = balance;
         },error => {
          console.log(error);
         }
      );
    }
  }

  ngOnDestroy(): void {
    this.sub.unsubscribe();
  }

  formatDate(dateStr): string {
    var date = new Date(dateStr);
    return ("0" + date.getUTCDate()).slice(-2) + "." +
           ("0" + (date.getUTCMonth()+1)).slice(-2) + "." +
            date.getUTCFullYear() + " " +
           ("0" + date.getUTCHours()).slice(-2) + ":" +
           ("0" + date.getUTCMinutes()).slice(-2);   
  }
}
