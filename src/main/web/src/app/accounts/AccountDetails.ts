export class AccountDetails {
    IBAN: string;
    BIC: string;
    currency: string;
    created: Date;
    updated: Date;

    constructor(IBAN: string, BIC: string, currency: string, created: Date, updated: Date) {
        this.IBAN = IBAN;
        this.BIC = BIC;
        this.currency = currency;
        this.created = created;
        this.updated = updated;
    }
}