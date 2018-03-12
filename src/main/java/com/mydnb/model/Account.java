package com.mydnb.model;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;



/**
 * Same &#x60;&#x60;&#x60;account&#x60;&#x60;&#x60; data object is used for all types of accounts. The &#x60;&#x60;&#x60;type&#x60;&#x60;&#x60; property determines the type.   An &#x60;&#x60;&#x60;account&#x60;&#x60;&#x60; may have &#x60;&#x60;&#x60;accountDetails&#x60;&#x60;&#x60;, which may again have &#x60;&#x60;&#x60;accountBalance&#x60;&#x60;&#x60; and  &#x60;&#x60;&#x60;accountInterestDetails&#x60;&#x60;&#x60;.  A Norwegian &#x60;&#x60;&#x60;account&#x60;&#x60;&#x60;has three groups: xxxx yy zzzzc. * xxxx: Bank register number, identifying bank and branch.  * yy: Account group.  * zzzz: Customer account number.   * c: Control digit, modulo 11 with weight number 5432765432.
 **/

/**
 * Same &#x60;&#x60;&#x60;account&#x60;&#x60;&#x60; data object is used for all types of accounts. The &#x60;&#x60;&#x60;type&#x60;&#x60;&#x60; property determines the type.   An &#x60;&#x60;&#x60;account&#x60;&#x60;&#x60; may have &#x60;&#x60;&#x60;accountDetails&#x60;&#x60;&#x60;, which may again have &#x60;&#x60;&#x60;accountBalance&#x60;&#x60;&#x60; and  &#x60;&#x60;&#x60;accountInterestDetails&#x60;&#x60;&#x60;.  A Norwegian &#x60;&#x60;&#x60;account&#x60;&#x60;&#x60;has three groups: xxxx yy zzzzc. * xxxx: Bank register number, identifying bank and branch.  * yy: Account group.  * zzzz: Customer account number.   * c: Control digit, modulo 11 with weight number 5432765432.
 */
@ApiModel(description = "Same ```account``` data object is used for all types of accounts. The ```type``` property determines the type.   An ```account``` may have ```accountDetails```, which may again have ```accountBalance``` and  ```accountInterestDetails```.  A Norwegian ```account```has three groups: xxxx yy zzzzc. * xxxx: Bank register number, identifying bank and branch.  * yy: Account group.  * zzzz: Customer account number.   * c: Control digit, modulo 11 with weight number 5432765432.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class Account   {
  private String accountNumber = null;

  /**
   * Any type of account.
   */
  public enum TypeEnum {
    DEPOSIT("DEPOSIT"),
    
    CREDITCARD("CREDITCARD"),
    
    ASK("ASK"),
    
    BSU("BSU");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TypeEnum type = TypeEnum.DEPOSIT;

  private String accountName = null;

  private BigDecimal balanceAvailable = null;

  private AccountDetails accountDetails = null;

  public Account accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * 11 digits. Bank, etc can be determined from this: https://no.wikipedia.org/wiki/Kontonummer
   * @return accountNumber
  **/
  @ApiModelProperty(example = "12345678901", required = true, value = "11 digits. Bank, etc can be determined from this: https://no.wikipedia.org/wiki/Kontonummer")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Account type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Any type of account.
   * @return type
  **/
  @ApiModelProperty(example = "DEPOSIT", required = true, value = "Any type of account.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Account accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Friendly name for the account:
   * @return accountName
  **/
  @ApiModelProperty(example = "Standard account", value = "Friendly name for the account:")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public Account balanceAvailable(BigDecimal balanceAvailable) {
    this.balanceAvailable = balanceAvailable;
    return this;
  }

   /**
   * Get balanceAvailable
   * @return balanceAvailable
  **/
  @ApiModelProperty(example = "100.01", required = true, value = "")
  public BigDecimal getBalanceAvailable() {
    return balanceAvailable;
  }

  public void setBalanceAvailable(BigDecimal balanceAvailable) {
    this.balanceAvailable = balanceAvailable;
  }

  public Account accountDetails(AccountDetails accountDetails) {
    this.accountDetails = accountDetails;
    return this;
  }

   /**
   * Get accountDetails
   * @return accountDetails
  **/
  @ApiModelProperty(value = "")
  public AccountDetails getAccountDetails() {
    return accountDetails;
  }

  public void setAccountDetails(AccountDetails accountDetails) {
    this.accountDetails = accountDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.accountNumber, account.accountNumber) &&
        Objects.equals(this.type, account.type) &&
        Objects.equals(this.accountName, account.accountName) &&
        Objects.equals(this.balanceAvailable, account.balanceAvailable) &&
        Objects.equals(this.accountDetails, account.accountDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, type, accountName, balanceAvailable, accountDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    balanceAvailable: ").append(toIndentedString(balanceAvailable)).append("\n");
    sb.append("    accountDetails: ").append(toIndentedString(accountDetails)).append("\n");
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

