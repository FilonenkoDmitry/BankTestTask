export class AccountBalance {
    accountNumber: string;
    amountAvailable: string;
    amountBooked: string;
    timeStamp: Date;    

    constructor(accountNumber: string, amountAvailable: string, amountBooked: string, timeStamp: Date) {
        this.accountNumber = accountNumber;
        this.amountAvailable = amountAvailable;
        this.amountBooked = amountBooked;
        this.timeStamp = timeStamp;
    }
}