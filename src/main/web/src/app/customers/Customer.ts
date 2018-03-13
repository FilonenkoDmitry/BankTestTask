import { Address } from "./Address";

export class Customer { 
  customerId: string;
  firstName: string;
  lastName: string;
  companyName: string;
  address: Address;
  email: string;
 
  constructor(customerId: string, firstName: string, lastName: string, companyName: string, address: Address, email: string) {
    this.customerId = customerId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.companyName = companyName;
    this.address = address;
    this.email = email;
  }
 
}