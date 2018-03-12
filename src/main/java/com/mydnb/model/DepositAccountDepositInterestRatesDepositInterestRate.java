package com.mydnb.model;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;




/**
 * DepositAccountDepositInterestRatesDepositInterestRate
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class DepositAccountDepositInterestRatesDepositInterestRate   {
  private BigDecimal depositRate = null;

  private BigDecimal depositThreshold = null;

  public DepositAccountDepositInterestRatesDepositInterestRate depositRate(BigDecimal depositRate) {
    this.depositRate = depositRate;
    return this;
  }

   /**
   * Get depositRate
   * @return depositRate
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDepositRate() {
    return depositRate;
  }

  public void setDepositRate(BigDecimal depositRate) {
    this.depositRate = depositRate;
  }

  public DepositAccountDepositInterestRatesDepositInterestRate depositThreshold(BigDecimal depositThreshold) {
    this.depositThreshold = depositThreshold;
    return this;
  }

   /**
   * Get depositThreshold
   * @return depositThreshold
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDepositThreshold() {
    return depositThreshold;
  }

  public void setDepositThreshold(BigDecimal depositThreshold) {
    this.depositThreshold = depositThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositAccountDepositInterestRatesDepositInterestRate depositAccountDepositInterestRatesDepositInterestRate = (DepositAccountDepositInterestRatesDepositInterestRate) o;
    return Objects.equals(this.depositRate, depositAccountDepositInterestRatesDepositInterestRate.depositRate) &&
        Objects.equals(this.depositThreshold, depositAccountDepositInterestRatesDepositInterestRate.depositThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositRate, depositThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositAccountDepositInterestRatesDepositInterestRate {\n");
    
    sb.append("    depositRate: ").append(toIndentedString(depositRate)).append("\n");
    sb.append("    depositThreshold: ").append(toIndentedString(depositThreshold)).append("\n");
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

