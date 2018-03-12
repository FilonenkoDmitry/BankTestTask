package com.mydnb.model;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;




/**
 * DepositAccountCreditLimits
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class DepositAccountCreditLimits   {
  private BigDecimal creditLimit = null;

  private String creditLimitExpiryDate = null;

  private BigDecimal creditLimitInterestRate = null;

  public DepositAccountCreditLimits creditLimit(BigDecimal creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

   /**
   * Get creditLimit
   * @return creditLimit
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(BigDecimal creditLimit) {
    this.creditLimit = creditLimit;
  }

  public DepositAccountCreditLimits creditLimitExpiryDate(String creditLimitExpiryDate) {
    this.creditLimitExpiryDate = creditLimitExpiryDate;
    return this;
  }

   /**
   * Get creditLimitExpiryDate
   * @return creditLimitExpiryDate
  **/
  @ApiModelProperty(value = "")
  public String getCreditLimitExpiryDate() {
    return creditLimitExpiryDate;
  }

  public void setCreditLimitExpiryDate(String creditLimitExpiryDate) {
    this.creditLimitExpiryDate = creditLimitExpiryDate;
  }

  public DepositAccountCreditLimits creditLimitInterestRate(BigDecimal creditLimitInterestRate) {
    this.creditLimitInterestRate = creditLimitInterestRate;
    return this;
  }

   /**
   * Get creditLimitInterestRate
   * @return creditLimitInterestRate
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCreditLimitInterestRate() {
    return creditLimitInterestRate;
  }

  public void setCreditLimitInterestRate(BigDecimal creditLimitInterestRate) {
    this.creditLimitInterestRate = creditLimitInterestRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositAccountCreditLimits depositAccountCreditLimits = (DepositAccountCreditLimits) o;
    return Objects.equals(this.creditLimit, depositAccountCreditLimits.creditLimit) &&
        Objects.equals(this.creditLimitExpiryDate, depositAccountCreditLimits.creditLimitExpiryDate) &&
        Objects.equals(this.creditLimitInterestRate, depositAccountCreditLimits.creditLimitInterestRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditLimit, creditLimitExpiryDate, creditLimitInterestRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositAccountCreditLimits {\n");
    
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    creditLimitExpiryDate: ").append(toIndentedString(creditLimitExpiryDate)).append("\n");
    sb.append("    creditLimitInterestRate: ").append(toIndentedString(creditLimitInterestRate)).append("\n");
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

