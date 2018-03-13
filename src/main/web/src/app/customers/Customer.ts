import { Address } from "./Address";

export class Customer { 
  firstName: string;
  lastName: string;
  companyName: string;
  address: Address;
  email: string;
 
  constructor(firstName: string, lastName: string, companyName: string, address: Address, email: string) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.companyName = companyName;
    this.address = address;
    this.email = email;
  }
 
}