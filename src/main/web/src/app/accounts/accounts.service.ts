import { Injectable } from '@angular/core';
import { AccountDetails } from "./AccountDetails";
import { AccountBalance } from "./AccountBalance";
import { Http, Response } from "@angular/http";
import 'rxjs/add/operator/map'
import 'rxjs/add/operator/catch';
import { Observable } from "rxjs/Observable";
import { environment } from '../../environments/environment';
import { Payment } from './Payment';

@Injectable()
export class AccountsService {

  constructor(private http: Http) { }

  findDetailsById(id: string): Observable<AccountDetails> {
    return this.http.get(environment.backendUrl + `/accounts/${id}`)
      .map((res:Response) => res.json())
      .catch((error:any) => Observable.throw(error.json().error || 'Server error'));
  }

  findBalanceById(id: string): Observable<AccountBalance> {
    return this.http.get(environment.backendUrl + `/accounts/${id}/balance`)
      .map((res:Response) => res.json())
      .catch((error:any) => Observable.throw(error.json().error || 'Server error'));
  }

  getDuePayments(id:string, from: Date, to: Date): Observable<Payment[]> {
    return this.http.get(environment.backendUrl + `/accounts/${id}/payments?startDate=${this.dateToString(from)}&stopDate=${this.dateToString(to)}`)
      .map((res:Response) => res.json())
      .catch((error:any) => Observable.throw(error.json().error || 'Server error'));
  }

  private dateToString(date: Date): string {
    return date.getFullYear() + "-" + date.getMonth() + "-" + date.getDate();
  }
}
