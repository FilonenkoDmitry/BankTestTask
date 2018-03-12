package com.mydnb.model;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;




/**
 * DepositAccountFixedDepositRates
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class DepositAccountFixedDepositRates   {
  private BigDecimal debitBasisRate = null;

  private String fixedRateEndDate = null;

  private BigDecimal creditBasisRate = null;

  public DepositAccountFixedDepositRates debitBasisRate(BigDecimal debitBasisRate) {
    this.debitBasisRate = debitBasisRate;
    return this;
  }

   /**
   * Get debitBasisRate
   * @return debitBasisRate
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDebitBasisRate() {
    return debitBasisRate;
  }

  public void setDebitBasisRate(BigDecimal debitBasisRate) {
    this.debitBasisRate = debitBasisRate;
  }

  public DepositAccountFixedDepositRates fixedRateEndDate(String fixedRateEndDate) {
    this.fixedRateEndDate = fixedRateEndDate;
    return this;
  }

   /**
   * Get fixedRateEndDate
   * @return fixedRateEndDate
  **/
  @ApiModelProperty(value = "")
  public String getFixedRateEndDate() {
    return fixedRateEndDate;
  }

  public void setFixedRateEndDate(String fixedRateEndDate) {
    this.fixedRateEndDate = fixedRateEndDate;
  }

  public DepositAccountFixedDepositRates creditBasisRate(BigDecimal creditBasisRate) {
    this.creditBasisRate = creditBasisRate;
    return this;
  }

   /**
   * Get creditBasisRate
   * @return creditBasisRate
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCreditBasisRate() {
    return creditBasisRate;
  }

  public void setCreditBasisRate(BigDecimal creditBasisRate) {
    this.creditBasisRate = creditBasisRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositAccountFixedDepositRates depositAccountFixedDepositRates = (DepositAccountFixedDepositRates) o;
    return Objects.equals(this.debitBasisRate, depositAccountFixedDepositRates.debitBasisRate) &&
        Objects.equals(this.fixedRateEndDate, depositAccountFixedDepositRates.fixedRateEndDate) &&
        Objects.equals(this.creditBasisRate, depositAccountFixedDepositRates.creditBasisRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(debitBasisRate, fixedRateEndDate, creditBasisRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositAccountFixedDepositRates {\n");
    
    sb.append("    debitBasisRate: ").append(toIndentedString(debitBasisRate)).append("\n");
    sb.append("    fixedRateEndDate: ").append(toIndentedString(fixedRateEndDate)).append("\n");
    sb.append("    creditBasisRate: ").append(toIndentedString(creditBasisRate)).append("\n");
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

