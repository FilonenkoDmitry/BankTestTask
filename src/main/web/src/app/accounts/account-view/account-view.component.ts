import { Component, OnInit } from '@angular/core';
import { AccountDetails } from "../AccountDetails"
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
 
    }
  }
}
