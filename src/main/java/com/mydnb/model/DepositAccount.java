package com.mydnb.model;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;



/**
 * Generate from JSON example in Shared Service Layer. 
 **/

/**
 * Generate from JSON example in Shared Service Layer. 
 */
@ApiModel(description = "Generate from JSON example in Shared Service Layer. ")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class DepositAccount   {
  private String accountNumber = null;

  private String accountCurrency = null;

  private String iban = null;

  private String bic = null;

  private String openingDate = null;

  private String lastTransactionDate = null;

  private String sourceProductId = null;

  private String sourceProductSystem = null;

  private String sourceAgreementId = null;

  private String salesProductId = null;

  private String salesProductName = null;

  private DepositAccountDepositInterestRates depositInterestRates = null;

  private DepositAccountTransactionRestrictions transactionRestrictions = null;

  private List<DepositAccountAccountUserRoles> accountUserRoles = new ArrayList<DepositAccountAccountUserRoles>();

  private List<DepositAccountCreditLimits> creditLimits = new ArrayList<DepositAccountCreditLimits>();

  private DepositAccountAccumulators accumulators = null;

  private DepositAccountBsuInformation bsuInformation = null;

  private DepositAccountFixedDepositRates fixedDepositRates = null;

  public DepositAccount accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(value = "")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public DepositAccount accountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
    return this;
  }

   /**
   * Get accountCurrency
   * @return accountCurrency
  **/
  @ApiModelProperty(value = "")
  public String getAccountCurrency() {
    return accountCurrency;
  }

  public void setAccountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
  }

  public DepositAccount iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * Get iban
   * @return iban
  **/
  @ApiModelProperty(value = "")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public DepositAccount bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * Get bic
   * @return bic
  **/
  @ApiModelProperty(value = "")
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public DepositAccount openingDate(String openingDate) {
    this.openingDate = openingDate;
    return this;
  }

   /**
   * Get openingDate
   * @return openingDate
  **/
  @ApiModelProperty(value = "")
  public String getOpeningDate() {
    return openingDate;
  }

  public void setOpeningDate(String openingDate) {
    this.openingDate = openingDate;
  }

  public DepositAccount lastTransactionDate(String lastTransactionDate) {
    this.lastTransactionDate = lastTransactionDate;
    return this;
  }

   /**
   * Get lastTransactionDate
   * @return lastTransactionDate
  **/
  @ApiModelProperty(value = "")
  public String getLastTransactionDate() {
    return lastTransactionDate;
  }

  public void setLastTransactionDate(String lastTransactionDate) {
    this.lastTransactionDate = lastTransactionDate;
  }

  public DepositAccount sourceProductId(String sourceProductId) {
    this.sourceProductId = sourceProductId;
    return this;
  }

   /**
   * Get sourceProductId
   * @return sourceProductId
  **/
  @ApiModelProperty(value = "")
  public String getSourceProductId() {
    return sourceProductId;
  }

  public void setSourceProductId(String sourceProductId) {
    this.sourceProductId = sourceProductId;
  }

  public DepositAccount sourceProductSystem(String sourceProductSystem) {
    this.sourceProductSystem = sourceProductSystem;
    return this;
  }

   /**
   * Get sourceProductSystem
   * @return sourceProductSystem
  **/
  @ApiModelProperty(value = "")
  public String getSourceProductSystem() {
    return sourceProductSystem;
  }

  public void setSourceProductSystem(String sourceProductSystem) {
    this.sourceProductSystem = sourceProductSystem;
  }

  public DepositAccount sourceAgreementId(String sourceAgreementId) {
    this.sourceAgreementId = sourceAgreementId;
    return this;
  }

   /**
   * Get sourceAgreementId
   * @return sourceAgreementId
  **/
  @ApiModelProperty(value = "")
  public String getSourceAgreementId() {
    return sourceAgreementId;
  }

  public void setSourceAgreementId(String sourceAgreementId) {
    this.sourceAgreementId = sourceAgreementId;
  }

  public DepositAccount salesProductId(String salesProductId) {
    this.salesProductId = salesProductId;
    return this;
  }

   /**
   * Get salesProductId
   * @return salesProductId
  **/
  @ApiModelProperty(value = "")
  public String getSalesProductId() {
    return salesProductId;
  }

  public void setSalesProductId(String salesProductId) {
    this.salesProductId = salesProductId;
  }

  public DepositAccount salesProductName(String salesProductName) {
    this.salesProductName = salesProductName;
    return this;
  }

   /**
   * Get salesProductName
   * @return salesProductName
  **/
  @ApiModelProperty(value = "")
  public String getSalesProductName() {
    return salesProductName;
  }

  public void setSalesProductName(String salesProductName) {
    this.salesProductName = salesProductName;
  }

  public DepositAccount depositInterestRates(DepositAccountDepositInterestRates depositInterestRates) {
    this.depositInterestRates = depositInterestRates;
    return this;
  }

   /**
   * Get depositInterestRates
   * @return depositInterestRates
  **/
  @ApiModelProperty(value = "")
  public DepositAccountDepositInterestRates getDepositInterestRates() {
    return depositInterestRates;
  }

  public void setDepositInterestRates(DepositAccountDepositInterestRates depositInterestRates) {
    this.depositInterestRates = depositInterestRates;
  }

  public DepositAccount transactionRestrictions(DepositAccountTransactionRestrictions transactionRestrictions) {
    this.transactionRestrictions = transactionRestrictions;
    return this;
  }

   /**
   * Get transactionRestrictions
   * @return transactionRestrictions
  **/
  @ApiModelProperty(value = "")
  public DepositAccountTransactionRestrictions getTransactionRestrictions() {
    return transactionRestrictions;
  }

  public void setTransactionRestrictions(DepositAccountTransactionRestrictions transactionRestrictions) {
    this.transactionRestrictions = transactionRestrictions;
  }

  public DepositAccount accountUserRoles(List<DepositAccountAccountUserRoles> accountUserRoles) {
    this.accountUserRoles = accountUserRoles;
    return this;
  }

  public DepositAccount addAccountUserRolesItem(DepositAccountAccountUserRoles accountUserRolesItem) {
    this.accountUserRoles.add(accountUserRolesItem);
    return this;
  }

   /**
   * Get accountUserRoles
   * @return accountUserRoles
  **/
  @ApiModelProperty(value = "")
  public List<DepositAccountAccountUserRoles> getAccountUserRoles() {
    return accountUserRoles;
  }

  public void setAccountUserRoles(List<DepositAccountAccountUserRoles> accountUserRoles) {
    this.accountUserRoles = accountUserRoles;
  }

  public DepositAccount creditLimits(List<DepositAccountCreditLimits> creditLimits) {
    this.creditLimits = creditLimits;
    return this;
  }

  public DepositAccount addCreditLimitsItem(DepositAccountCreditLimits creditLimitsItem) {
    this.creditLimits.add(creditLimitsItem);
    return this;
  }

   /**
   * Get creditLimits
   * @return creditLimits
  **/
  @ApiModelProperty(value = "")
  public List<DepositAccountCreditLimits> getCreditLimits() {
    return creditLimits;
  }

  public void setCreditLimits(List<DepositAccountCreditLimits> creditLimits) {
    this.creditLimits = creditLimits;
  }

  public DepositAccount accumulators(DepositAccountAccumulators accumulators) {
    this.accumulators = accumulators;
    return this;
  }

   /**
   * Get accumulators
   * @return accumulators
  **/
  @ApiModelProperty(value = "")
  public DepositAccountAccumulators getAccumulators() {
    return accumulators;
  }

  public void setAccumulators(DepositAccountAccumulators accumulators) {
    this.accumulators = accumulators;
  }

  public DepositAccount bsuInformation(DepositAccountBsuInformation bsuInformation) {
    this.bsuInformation = bsuInformation;
    return this;
  }

   /**
   * Get bsuInformation
   * @return bsuInformation
  **/
  @ApiModelProperty(value = "")
  public DepositAccountBsuInformation getBsuInformation() {
    return bsuInformation;
  }

  public void setBsuInformation(DepositAccountBsuInformation bsuInformation) {
    this.bsuInformation = bsuInformation;
  }

  public DepositAccount fixedDepositRates(DepositAccountFixedDepositRates fixedDepositRates) {
    this.fixedDepositRates = fixedDepositRates;
    return this;
  }

   /**
   * Get fixedDepositRates
   * @return fixedDepositRates
  **/
  @ApiModelProperty(value = "")
  public DepositAccountFixedDepositRates getFixedDepositRates() {
    return fixedDepositRates;
  }

  public void setFixedDepositRates(DepositAccountFixedDepositRates fixedDepositRates) {
    this.fixedDepositRates = fixedDepositRates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositAccount depositAccount = (DepositAccount) o;
    return Objects.equals(this.accountNumber, depositAccount.accountNumber) &&
        Objects.equals(this.accountCurrency, depositAccount.accountCurrency) &&
        Objects.equals(this.iban, depositAccount.iban) &&
        Objects.equals(this.bic, depositAccount.bic) &&
        Objects.equals(this.openingDate, depositAccount.openingDate) &&
        Objects.equals(this.lastTransactionDate, depositAccount.lastTransactionDate) &&
        Objects.equals(this.sourceProductId, depositAccount.sourceProductId) &&
        Objects.equals(this.sourceProductSystem, depositAccount.sourceProductSystem) &&
        Objects.equals(this.sourceAgreementId, depositAccount.sourceAgreementId) &&
        Objects.equals(this.salesProductId, depositAccount.salesProductId) &&
        Objects.equals(this.salesProductName, depositAccount.salesProductName) &&
        Objects.equals(this.depositInterestRates, depositAccount.depositInterestRates) &&
        Objects.equals(this.transactionRestrictions, depositAccount.transactionRestrictions) &&
        Objects.equals(this.accountUserRoles, depositAccount.accountUserRoles) &&
        Objects.equals(this.creditLimits, depositAccount.creditLimits) &&
        Objects.equals(this.accumulators, depositAccount.accumulators) &&
        Objects.equals(this.bsuInformation, depositAccount.bsuInformation) &&
        Objects.equals(this.fixedDepositRates, depositAccount.fixedDepositRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountCurrency, iban, bic, openingDate, lastTransactionDate, sourceProductId, sourceProductSystem, sourceAgreementId, salesProductId, salesProductName, depositInterestRates, transactionRestrictions, accountUserRoles, creditLimits, accumulators, bsuInformation, fixedDepositRates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositAccount {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountCurrency: ").append(toIndentedString(accountCurrency)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    openingDate: ").append(toIndentedString(openingDate)).append("\n");
    sb.append("    lastTransactionDate: ").append(toIndentedString(lastTransactionDate)).append("\n");
    sb.append("    sourceProductId: ").append(toIndentedString(sourceProductId)).append("\n");
    sb.append("    sourceProductSystem: ").append(toIndentedString(sourceProductSystem)).append("\n");
    sb.append("    sourceAgreementId: ").append(toIndentedString(sourceAgreementId)).append("\n");
    sb.append("    salesProductId: ").append(toIndentedString(salesProductId)).append("\n");
    sb.append("    salesProductName: ").append(toIndentedString(salesProductName)).append("\n");
    sb.append("    depositInterestRates: ").append(toIndentedString(depositInterestRates)).append("\n");
    sb.append("    transactionRestrictions: ").append(toIndentedString(transactionRestrictions)).append("\n");
    sb.append("    accountUserRoles: ").append(toIndentedString(accountUserRoles)).append("\n");
    sb.append("    creditLimits: ").append(toIndentedString(creditLimits)).append("\n");
    sb.append("    accumulators: ").append(toIndentedString(accumulators)).append("\n");
    sb.append("    bsuInformation: ").append(toIndentedString(bsuInformation)).append("\n");
    sb.append("    fixedDepositRates: ").append(toIndentedString(fixedDepositRates)).append("\n");
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

