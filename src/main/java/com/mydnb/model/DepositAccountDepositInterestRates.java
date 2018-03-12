package com.mydnb.model;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;




/**
 * DepositAccountDepositInterestRates
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class DepositAccountDepositInterestRates   {
  private String interestCalculationMethod = null;

  private BigDecimal overdraftInterestRate = null;

  private List<DepositAccountDepositInterestRatesDepositInterestRate> depositInterestRate = new ArrayList<DepositAccountDepositInterestRatesDepositInterestRate>();

  public DepositAccountDepositInterestRates interestCalculationMethod(String interestCalculationMethod) {
    this.interestCalculationMethod = interestCalculationMethod;
    return this;
  }

   /**
   * Get interestCalculationMethod
   * @return interestCalculationMethod
  **/
  @ApiModelProperty(value = "")
  public String getInterestCalculationMethod() {
    return interestCalculationMethod;
  }

  public void setInterestCalculationMethod(String interestCalculationMethod) {
    this.interestCalculationMethod = interestCalculationMethod;
  }

  public DepositAccountDepositInterestRates overdraftInterestRate(BigDecimal overdraftInterestRate) {
    this.overdraftInterestRate = overdraftInterestRate;
    return this;
  }

   /**
   * Get overdraftInterestRate
   * @return overdraftInterestRate
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOverdraftInterestRate() {
    return overdraftInterestRate;
  }

  public void setOverdraftInterestRate(BigDecimal overdraftInterestRate) {
    this.overdraftInterestRate = overdraftInterestRate;
  }

  public DepositAccountDepositInterestRates depositInterestRate(List<DepositAccountDepositInterestRatesDepositInterestRate> depositInterestRate) {
    this.depositInterestRate = depositInterestRate;
    return this;
  }

  public DepositAccountDepositInterestRates addDepositInterestRateItem(DepositAccountDepositInterestRatesDepositInterestRate depositInterestRateItem) {
    this.depositInterestRate.add(depositInterestRateItem);
    return this;
  }

   /**
   * Get depositInterestRate
   * @return depositInterestRate
  **/
  @ApiModelProperty(value = "")
  public List<DepositAccountDepositInterestRatesDepositInterestRate> getDepositInterestRate() {
    return depositInterestRate;
  }

  public void setDepositInterestRate(List<DepositAccountDepositInterestRatesDepositInterestRate> depositInterestRate) {
    this.depositInterestRate = depositInterestRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositAccountDepositInterestRates depositAccountDepositInterestRates = (DepositAccountDepositInterestRates) o;
    return Objects.equals(this.interestCalculationMethod, depositAccountDepositInterestRates.interestCalculationMethod) &&
        Objects.equals(this.overdraftInterestRate, depositAccountDepositInterestRates.overdraftInterestRate) &&
        Objects.equals(this.depositInterestRate, depositAccountDepositInterestRates.depositInterestRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestCalculationMethod, overdraftInterestRate, depositInterestRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositAccountDepositInterestRates {\n");
    
    sb.append("    interestCalculationMethod: ").append(toIndentedString(interestCalculationMethod)).append("\n");
    sb.append("    overdraftInterestRate: ").append(toIndentedString(overdraftInterestRate)).append("\n");
    sb.append("    depositInterestRate: ").append(toIndentedString(depositInterestRate)).append("\n");
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

