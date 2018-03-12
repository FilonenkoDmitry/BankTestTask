package com.mydnb.model;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;




/**
 * CardInvoice
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class CardInvoice   {
  private Card card = null;

  private String year = null;

  private String month = null;

  private BigDecimal amount = null;

  private LocalDate dueDate = null;

  private String accountNumber = null;

  private String KID = null;

  private List<Transaction> transactions = new ArrayList<Transaction>();

  public CardInvoice card(Card card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(required = true, value = "")
  public Card getCard() {
    return card;
  }

  public void setCard(Card card) {
    this.card = card;
  }

  public CardInvoice year(String year) {
    this.year = year;
    return this;
  }

   /**
   * YYYY
   * @return year
  **/
  @ApiModelProperty(example = "2018", required = true, value = "YYYY")
  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public CardInvoice month(String month) {
    this.month = month;
    return this;
  }

   /**
   * MM, where January is 01
   * @return month
  **/
  @ApiModelProperty(example = "01", required = true, value = "MM, where January is 01")
  public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public CardInvoice amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "100.0", required = true, value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public CardInvoice dueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @ApiModelProperty(example = "2018-12-31", required = true, value = "")
  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public CardInvoice accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Account to pay to. 11 digits.
   * @return accountNumber
  **/
  @ApiModelProperty(example = "12345678901", required = true, value = "Account to pay to. 11 digits.")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public CardInvoice KID(String KID) {
    this.KID = KID;
    return this;
  }

   /**
   * 2-25 digits
   * @return KID
  **/
  @ApiModelProperty(example = "42", value = "2-25 digits")
  public String getKID() {
    return KID;
  }

  public void setKID(String KID) {
    this.KID = KID;
  }

  public CardInvoice transactions(List<Transaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public CardInvoice addTransactionsItem(Transaction transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Transaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<Transaction> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardInvoice cardInvoice = (CardInvoice) o;
    return Objects.equals(this.card, cardInvoice.card) &&
        Objects.equals(this.year, cardInvoice.year) &&
        Objects.equals(this.month, cardInvoice.month) &&
        Objects.equals(this.amount, cardInvoice.amount) &&
        Objects.equals(this.dueDate, cardInvoice.dueDate) &&
        Objects.equals(this.accountNumber, cardInvoice.accountNumber) &&
        Objects.equals(this.KID, cardInvoice.KID) &&
        Objects.equals(this.transactions, cardInvoice.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, year, month, amount, dueDate, accountNumber, KID, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardInvoice {\n");
    
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    KID: ").append(toIndentedString(KID)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

