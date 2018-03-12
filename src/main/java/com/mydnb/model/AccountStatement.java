package com.mydnb.model;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;



/**
 * Monthly &#x60;&#x60;&#x60;account&#x60;&#x60;&#x60; statement. 
 **/

/**
 * Monthly &#x60;&#x60;&#x60;account&#x60;&#x60;&#x60; statement. 
 */
@ApiModel(description = "Monthly ```account``` statement. ")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class AccountStatement   {
  private String accountNumber = null;

  private String year = null;

  private String month = null;

  private List<Transaction> transactions = new ArrayList<Transaction>();

  public AccountStatement accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(example = "12345678901", required = true, value = "")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public AccountStatement year(String year) {
    this.year = year;
    return this;
  }

   /**
   * YYYY
   * @return year
  **/
  @ApiModelProperty(example = "1990", required = true, value = "YYYY")
  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public AccountStatement month(String month) {
    this.month = month;
    return this;
  }

   /**
   * MM, January: 01
   * @return month
  **/
  @ApiModelProperty(example = "01", required = true, value = "MM, January: 01")
  public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public AccountStatement transactions(List<Transaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public AccountStatement addTransactionsItem(Transaction transactionsItem) {
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
    AccountStatement accountStatement = (AccountStatement) o;
    return Objects.equals(this.accountNumber, accountStatement.accountNumber) &&
        Objects.equals(this.year, accountStatement.year) &&
        Objects.equals(this.month, accountStatement.month) &&
        Objects.equals(this.transactions, accountStatement.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, year, month, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountStatement {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
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

