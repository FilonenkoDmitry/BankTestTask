export class Customer { 
  firstName: string;
  lastName: string;
  companyName: string;
  address: string;
  email: string;
 
  constructor(firstName: string, lastName: string, companyName: string, address: string, email: string) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.companyName = companyName;
    this.address = address;
    this.email = email;
  }
 
}