import { Injectable } from '@angular/core';
import { Customer } from "./Customer";
import { Http, Response } from "@angular/http";
import 'rxjs/add/operator/map'
import 'rxjs/add/operator/catch';
import { Observable } from "rxjs/Observable";
import { environment } from '../../environments/environment';

@Injectable()
export class CustomersService {

  constructor(private http: Http) { }

  findAll(): Observable<Customer[]>  {
    return this.http.get(environment.backendUrl + '/customers')
      .map((res:Response) => res.json())
      .catch((error:any) => Observable.throw(error.json().error || 'Server error'));
  }

  findById(id: string): Observable<Customer> {
    return this.http.get(environment.backendUrl + `/customers/${id}`)
      .map((res:Response) => res.json())
      .catch((error:any) => Observable.throw(error.json().error || 'Server error'));
  }
 
  updateCustomer(customer: Customer): Observable<Customer> {
    return this.http.put(environment.backendUrl + `/customers/${customer.customerId}`, customer)
      .catch((error:any) => Observable.throw(error.json().error || 'Server error'));
  }
}
