export class Address {
    postalAddressLine1: string;
    postalAddressLine2: string;
    postalAddressLine3: string;
    postCode: string;
    postCity: string;
    postCountry: string;

    constructor(postalAddressLine1: string,
        postalAddressLine2: string,
        postalAddressLine3: string,
        postCode: string,
        postCity: string,
        postCountry: string) {
            this.postalAddressLine1 = postalAddressLine1;
            this.postalAddressLine2 = postalAddressLine2;
            this.postalAddressLine3 = postalAddressLine3;
            this.postCode = postCode;
            this.postCity = postCity;
            this.postCountry = postCountry;
        }
}