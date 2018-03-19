import { Component, OnInit } from '@angular/core';
import { AccountDetails } from "../AccountDetails"
import { AccountBalance } from "../AccountBalance"
import { AccountsService } from "../accounts.service"
import { ActivatedRoute, Router } from '@angular/router';
import { NgbModule, NgbDateStruct } from '@ng-bootstrap/ng-bootstrap';
import { Payment } from '../Payment';

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
  private payments: Payment[];

  fromDate: NgbDateStruct;
  toDate: NgbDateStruct;
  date: {year: number, month: number};

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

    this.initDuePeriod();
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

  initDuePeriod() {
    var now = new Date(Date.now());
    this.fromDate = {year: now.getFullYear(), month: now.getMonth(), day: now.getDate()};
    this.toDate = {year: now.getFullYear(), month: now.getMonth() + 1, day: now.getDate()};
  }

  showPayments() {
    this.accountsService.getDuePayments(this.id, 
      new Date(this.fromDate.year, this.fromDate.month, this.fromDate.day), 
      new Date(this.toDate.year, this.toDate.month, this.toDate.day)).subscribe(
      payments => {
        this.payments = payments;
     },error => {
      console.log(error);
     }
    );
  }
}
