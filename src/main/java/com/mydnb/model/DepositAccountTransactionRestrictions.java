package com.mydnb.model;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;




/**
 * DepositAccountTransactionRestrictions
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class DepositAccountTransactionRestrictions   {
  private String blockingRestriction = null;

  private BigDecimal restrictedWithdrawalAmount = null;

  private BigDecimal freeWithdrawals = null;

  private BigDecimal remainingFreeWithdrawals = null;

  public DepositAccountTransactionRestrictions blockingRestriction(String blockingRestriction) {
    this.blockingRestriction = blockingRestriction;
    return this;
  }

   /**
   * Get blockingRestriction
   * @return blockingRestriction
  **/
  @ApiModelProperty(value = "")
  public String getBlockingRestriction() {
    return blockingRestriction;
  }

  public void setBlockingRestriction(String blockingRestriction) {
    this.blockingRestriction = blockingRestriction;
  }

  public DepositAccountTransactionRestrictions restrictedWithdrawalAmount(BigDecimal restrictedWithdrawalAmount) {
    this.restrictedWithdrawalAmount = restrictedWithdrawalAmount;
    return this;
  }

   /**
   * Get restrictedWithdrawalAmount
   * @return restrictedWithdrawalAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRestrictedWithdrawalAmount() {
    return restrictedWithdrawalAmount;
  }

  public void setRestrictedWithdrawalAmount(BigDecimal restrictedWithdrawalAmount) {
    this.restrictedWithdrawalAmount = restrictedWithdrawalAmount;
  }

  public DepositAccountTransactionRestrictions freeWithdrawals(BigDecimal freeWithdrawals) {
    this.freeWithdrawals = freeWithdrawals;
    return this;
  }

   /**
   * Get freeWithdrawals
   * @return freeWithdrawals
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getFreeWithdrawals() {
    return freeWithdrawals;
  }

  public void setFreeWithdrawals(BigDecimal freeWithdrawals) {
    this.freeWithdrawals = freeWithdrawals;
  }

  public DepositAccountTransactionRestrictions remainingFreeWithdrawals(BigDecimal remainingFreeWithdrawals) {
    this.remainingFreeWithdrawals = remainingFreeWithdrawals;
    return this;
  }

   /**
   * Get remainingFreeWithdrawals
   * @return remainingFreeWithdrawals
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRemainingFreeWithdrawals() {
    return remainingFreeWithdrawals;
  }

  public void setRemainingFreeWithdrawals(BigDecimal remainingFreeWithdrawals) {
    this.remainingFreeWithdrawals = remainingFreeWithdrawals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositAccountTransactionRestrictions depositAccountTransactionRestrictions = (DepositAccountTransactionRestrictions) o;
    return Objects.equals(this.blockingRestriction, depositAccountTransactionRestrictions.blockingRestriction) &&
        Objects.equals(this.restrictedWithdrawalAmount, depositAccountTransactionRestrictions.restrictedWithdrawalAmount) &&
        Objects.equals(this.freeWithdrawals, depositAccountTransactionRestrictions.freeWithdrawals) &&
        Objects.equals(this.remainingFreeWithdrawals, depositAccountTransactionRestrictions.remainingFreeWithdrawals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockingRestriction, restrictedWithdrawalAmount, freeWithdrawals, remainingFreeWithdrawals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositAccountTransactionRestrictions {\n");
    
    sb.append("    blockingRestriction: ").append(toIndentedString(blockingRestriction)).append("\n");
    sb.append("    restrictedWithdrawalAmount: ").append(toIndentedString(restrictedWithdrawalAmount)).append("\n");
    sb.append("    freeWithdrawals: ").append(toIndentedString(freeWithdrawals)).append("\n");
    sb.append("    remainingFreeWithdrawals: ").append(toIndentedString(remainingFreeWithdrawals)).append("\n");
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

