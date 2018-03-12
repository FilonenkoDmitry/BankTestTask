package com.mydnb.model;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;




/**
 * DepositAccountAccumulators
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class DepositAccountAccumulators   {
  private BigDecimal debitInterestPreviousYear = null;

  private BigDecimal debitInterestThisYear = null;

  private BigDecimal feesThisMonth = null;

  private BigDecimal feesThisYear = null;

  private BigDecimal creditInterestThisYear = null;

  private BigDecimal creditInterestPreviousYear = null;

  private BigDecimal creditNegativeInterestPreviousYear = null;

  private BigDecimal withdrawalFeesPreviousMonth = null;

  private BigDecimal withdrawalFeesPreviousYear = null;

  public DepositAccountAccumulators debitInterestPreviousYear(BigDecimal debitInterestPreviousYear) {
    this.debitInterestPreviousYear = debitInterestPreviousYear;
    return this;
  }

   /**
   * Get debitInterestPreviousYear
   * @return debitInterestPreviousYear
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDebitInterestPreviousYear() {
    return debitInterestPreviousYear;
  }

  public void setDebitInterestPreviousYear(BigDecimal debitInterestPreviousYear) {
    this.debitInterestPreviousYear = debitInterestPreviousYear;
  }

  public DepositAccountAccumulators debitInterestThisYear(BigDecimal debitInterestThisYear) {
    this.debitInterestThisYear = debitInterestThisYear;
    return this;
  }

   /**
   * Get debitInterestThisYear
   * @return debitInterestThisYear
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDebitInterestThisYear() {
    return debitInterestThisYear;
  }

  public void setDebitInterestThisYear(BigDecimal debitInterestThisYear) {
    this.debitInterestThisYear = debitInterestThisYear;
  }

  public DepositAccountAccumulators feesThisMonth(BigDecimal feesThisMonth) {
    this.feesThisMonth = feesThisMonth;
    return this;
  }

   /**
   * Get feesThisMonth
   * @return feesThisMonth
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getFeesThisMonth() {
    return feesThisMonth;
  }

  public void setFeesThisMonth(BigDecimal feesThisMonth) {
    this.feesThisMonth = feesThisMonth;
  }

  public DepositAccountAccumulators feesThisYear(BigDecimal feesThisYear) {
    this.feesThisYear = feesThisYear;
    return this;
  }

   /**
   * Get feesThisYear
   * @return feesThisYear
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getFeesThisYear() {
    return feesThisYear;
  }

  public void setFeesThisYear(BigDecimal feesThisYear) {
    this.feesThisYear = feesThisYear;
  }

  public DepositAccountAccumulators creditInterestThisYear(BigDecimal creditInterestThisYear) {
    this.creditInterestThisYear = creditInterestThisYear;
    return this;
  }

   /**
   * Get creditInterestThisYear
   * @return creditInterestThisYear
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCreditInterestThisYear() {
    return creditInterestThisYear;
  }

  public void setCreditInterestThisYear(BigDecimal creditInterestThisYear) {
    this.creditInterestThisYear = creditInterestThisYear;
  }

  public DepositAccountAccumulators creditInterestPreviousYear(BigDecimal creditInterestPreviousYear) {
    this.creditInterestPreviousYear = creditInterestPreviousYear;
    return this;
  }

   /**
   * Get creditInterestPreviousYear
   * @return creditInterestPreviousYear
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCreditInterestPreviousYear() {
    return creditInterestPreviousYear;
  }

  public void setCreditInterestPreviousYear(BigDecimal creditInterestPreviousYear) {
    this.creditInterestPreviousYear = creditInterestPreviousYear;
  }

  public DepositAccountAccumulators creditNegativeInterestPreviousYear(BigDecimal creditNegativeInterestPreviousYear) {
    this.creditNegativeInterestPreviousYear = creditNegativeInterestPreviousYear;
    return this;
  }

   /**
   * Get creditNegativeInterestPreviousYear
   * @return creditNegativeInterestPreviousYear
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCreditNegativeInterestPreviousYear() {
    return creditNegativeInterestPreviousYear;
  }

  public void setCreditNegativeInterestPreviousYear(BigDecimal creditNegativeInterestPreviousYear) {
    this.creditNegativeInterestPreviousYear = creditNegativeInterestPreviousYear;
  }

  public DepositAccountAccumulators withdrawalFeesPreviousMonth(BigDecimal withdrawalFeesPreviousMonth) {
    this.withdrawalFeesPreviousMonth = withdrawalFeesPreviousMonth;
    return this;
  }

   /**
   * Get withdrawalFeesPreviousMonth
   * @return withdrawalFeesPreviousMonth
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getWithdrawalFeesPreviousMonth() {
    return withdrawalFeesPreviousMonth;
  }

  public void setWithdrawalFeesPreviousMonth(BigDecimal withdrawalFeesPreviousMonth) {
    this.withdrawalFeesPreviousMonth = withdrawalFeesPreviousMonth;
  }

  public DepositAccountAccumulators withdrawalFeesPreviousYear(BigDecimal withdrawalFeesPreviousYear) {
    this.withdrawalFeesPreviousYear = withdrawalFeesPreviousYear;
    return this;
  }

   /**
   * Get withdrawalFeesPreviousYear
   * @return withdrawalFeesPreviousYear
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getWithdrawalFeesPreviousYear() {
    return withdrawalFeesPreviousYear;
  }

  public void setWithdrawalFeesPreviousYear(BigDecimal withdrawalFeesPreviousYear) {
    this.withdrawalFeesPreviousYear = withdrawalFeesPreviousYear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositAccountAccumulators depositAccountAccumulators = (DepositAccountAccumulators) o;
    return Objects.equals(this.debitInterestPreviousYear, depositAccountAccumulators.debitInterestPreviousYear) &&
        Objects.equals(this.debitInterestThisYear, depositAccountAccumulators.debitInterestThisYear) &&
        Objects.equals(this.feesThisMonth, depositAccountAccumulators.feesThisMonth) &&
        Objects.equals(this.feesThisYear, depositAccountAccumulators.feesThisYear) &&
        Objects.equals(this.creditInterestThisYear, depositAccountAccumulators.creditInterestThisYear) &&
        Objects.equals(this.creditInterestPreviousYear, depositAccountAccumulators.creditInterestPreviousYear) &&
        Objects.equals(this.creditNegativeInterestPreviousYear, depositAccountAccumulators.creditNegativeInterestPreviousYear) &&
        Objects.equals(this.withdrawalFeesPreviousMonth, depositAccountAccumulators.withdrawalFeesPreviousMonth) &&
        Objects.equals(this.withdrawalFeesPreviousYear, depositAccountAccumulators.withdrawalFeesPreviousYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(debitInterestPreviousYear, debitInterestThisYear, feesThisMonth, feesThisYear, creditInterestThisYear, creditInterestPreviousYear, creditNegativeInterestPreviousYear, withdrawalFeesPreviousMonth, withdrawalFeesPreviousYear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositAccountAccumulators {\n");
    
    sb.append("    debitInterestPreviousYear: ").append(toIndentedString(debitInterestPreviousYear)).append("\n");
    sb.append("    debitInterestThisYear: ").append(toIndentedString(debitInterestThisYear)).append("\n");
    sb.append("    feesThisMonth: ").append(toIndentedString(feesThisMonth)).append("\n");
    sb.append("    feesThisYear: ").append(toIndentedString(feesThisYear)).append("\n");
    sb.append("    creditInterestThisYear: ").append(toIndentedString(creditInterestThisYear)).append("\n");
    sb.append("    creditInterestPreviousYear: ").append(toIndentedString(creditInterestPreviousYear)).append("\n");
    sb.append("    creditNegativeInterestPreviousYear: ").append(toIndentedString(creditNegativeInterestPreviousYear)).append("\n");
    sb.append("    withdrawalFeesPreviousMonth: ").append(toIndentedString(withdrawalFeesPreviousMonth)).append("\n");
    sb.append("    withdrawalFeesPreviousYear: ").append(toIndentedString(withdrawalFeesPreviousYear)).append("\n");
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

