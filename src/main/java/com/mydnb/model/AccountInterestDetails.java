package com.mydnb.model;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Details about an the interest for an &#x60;&#x60;&#x60;account&#x60;&#x60;&#x60;.
 **/

/**
 * Details about an the interest for an &#x60;&#x60;&#x60;account&#x60;&#x60;&#x60;.
 */
@ApiModel(description = "Details about an the interest for an ```account```.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class AccountInterestDetails   {
  private BigDecimal interestRate = null;

  private BigDecimal earnedInterestToDate = null;

  private BigDecimal accruedInterestAndFeesToDate = null;

  private BigDecimal feesToDate = null;

  private BigDecimal accruedInterestFromLastYear = null;

  public AccountInterestDetails interestRate(BigDecimal interestRate) {
    this.interestRate = interestRate;
    return this;
  }

   /**
   * Get interestRate
   * @return interestRate
  **/
  @ApiModelProperty(example = "2.01", required = true, value = "")
  public BigDecimal getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(BigDecimal interestRate) {
    this.interestRate = interestRate;
  }

  public AccountInterestDetails earnedInterestToDate(BigDecimal earnedInterestToDate) {
    this.earnedInterestToDate = earnedInterestToDate;
    return this;
  }

   /**
   * Get earnedInterestToDate
   * @return earnedInterestToDate
  **/
  @ApiModelProperty(example = "100.01", required = true, value = "")
  public BigDecimal getEarnedInterestToDate() {
    return earnedInterestToDate;
  }

  public void setEarnedInterestToDate(BigDecimal earnedInterestToDate) {
    this.earnedInterestToDate = earnedInterestToDate;
  }

  public AccountInterestDetails accruedInterestAndFeesToDate(BigDecimal accruedInterestAndFeesToDate) {
    this.accruedInterestAndFeesToDate = accruedInterestAndFeesToDate;
    return this;
  }

   /**
   * Get accruedInterestAndFeesToDate
   * @return accruedInterestAndFeesToDate
  **/
  @ApiModelProperty(example = "1.01", required = true, value = "")
  public BigDecimal getAccruedInterestAndFeesToDate() {
    return accruedInterestAndFeesToDate;
  }

  public void setAccruedInterestAndFeesToDate(BigDecimal accruedInterestAndFeesToDate) {
    this.accruedInterestAndFeesToDate = accruedInterestAndFeesToDate;
  }

  public AccountInterestDetails feesToDate(BigDecimal feesToDate) {
    this.feesToDate = feesToDate;
    return this;
  }

   /**
   * Get feesToDate
   * @return feesToDate
  **/
  @ApiModelProperty(example = "5.01", required = true, value = "")
  public BigDecimal getFeesToDate() {
    return feesToDate;
  }

  public void setFeesToDate(BigDecimal feesToDate) {
    this.feesToDate = feesToDate;
  }

  public AccountInterestDetails accruedInterestFromLastYear(BigDecimal accruedInterestFromLastYear) {
    this.accruedInterestFromLastYear = accruedInterestFromLastYear;
    return this;
  }

   /**
   * Get accruedInterestFromLastYear
   * @return accruedInterestFromLastYear
  **/
  @ApiModelProperty(example = "500.01", value = "")
  public BigDecimal getAccruedInterestFromLastYear() {
    return accruedInterestFromLastYear;
  }

  public void setAccruedInterestFromLastYear(BigDecimal accruedInterestFromLastYear) {
    this.accruedInterestFromLastYear = accruedInterestFromLastYear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountInterestDetails accountInterestDetails = (AccountInterestDetails) o;
    return Objects.equals(this.interestRate, accountInterestDetails.interestRate) &&
        Objects.equals(this.earnedInterestToDate, accountInterestDetails.earnedInterestToDate) &&
        Objects.equals(this.accruedInterestAndFeesToDate, accountInterestDetails.accruedInterestAndFeesToDate) &&
        Objects.equals(this.feesToDate, accountInterestDetails.feesToDate) &&
        Objects.equals(this.accruedInterestFromLastYear, accountInterestDetails.accruedInterestFromLastYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestRate, earnedInterestToDate, accruedInterestAndFeesToDate, feesToDate, accruedInterestFromLastYear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountInterestDetails {\n");
    
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    earnedInterestToDate: ").append(toIndentedString(earnedInterestToDate)).append("\n");
    sb.append("    accruedInterestAndFeesToDate: ").append(toIndentedString(accruedInterestAndFeesToDate)).append("\n");
    sb.append("    feesToDate: ").append(toIndentedString(feesToDate)).append("\n");
    sb.append("    accruedInterestFromLastYear: ").append(toIndentedString(accruedInterestFromLastYear)).append("\n");
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

