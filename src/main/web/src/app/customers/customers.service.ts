import { Injectable } from '@angular/core';
import { Customer } from "./Customer";
import { Http, Response } from "@angular/http";
import 'rxjs/add/operator/map'
import 'rxjs/add/operator/catch';
import { Observable } from "rxjs/Observable";

@Injectable()
export class CustomersService {

  private apiUrl = 'http://localhost:8080/customers';
  
  constructor(private http: Http) { }

  findAll(): Observable<Customer[]>  {
    return this.http.get(this.apiUrl)
      .map((res:Response) => res.json())
      .catch((error:any) => Observable.throw(error.json().error || 'Server error'));
  }

  findById(id: number): Observable<Customer> {
    return null;
  }
 
  updateCustomer(customer: Customer): Observable<Customer> {
    return null;
  }
}
