export class Payment {
    paymentId: string;
    debitAccount: string;
    creditAcount: string;
    amount: string;

    constructor(paymentId: string, debitAccount: string, creditAcount: string, amount: string) {
        this.paymentId = paymentId;
        this.debitAccount = debitAccount;
        this.creditAcount = creditAcount;
        this.amount = amount;
    }
}