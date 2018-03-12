package com.mydnb.model;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.joda.time.LocalDate;



/**
 * A &#x60;&#x60;&#x60;transaction&#x60;&#x60;&#x60; is a completed operation, in contrast to &#x60;&#x60;&#x60;payment&#x60;&#x60;&#x60;, which is planned, but not completed.  The same &#x60;&#x60;&#x60;transaction&#x60;&#x60;&#x60; is used for all types of transactions: DNB-only account transactions, domestic transactions, international transactions, card transactions, etc. Some transaction types have more fields and data than others. A developer does not need to know about different transaction types when retrieving them, this is .  Should have enough data to be useful both for presenting information to an end user, and for data analysis. Mey be extended, possibly to include &#x60;&#x60;&#x60;merchantId&#x60;&#x60;&#x60;with a reference to more details about merchant, as well as &#x60;&#x60;&#x60;location&#x60;&#x60;&#x60;data, etc.  MCC codes: https://github.com/greggles/mcc-codes Example for a hotel: &#x60;&#x60;&#x60; {     \&quot;mcc\&quot;: \&quot;3514\&quot;,     \&quot;edited_description\&quot;: \&quot;Hotels/Motels/Inns/Resorts\&quot;,     \&quot;combined_description\&quot;: \&quot;Hotels/Motels/Inns/Resorts\&quot;,     \&quot;usda_description\&quot;: \&quot;\&quot;,     \&quot;irs_description\&quot;: \&quot;Hotels/Motels/Inns/Resorts\&quot;,     \&quot;irs_reportable\&quot;: \&quot;Yes\&quot;,     \&quot;id\&quot;: 418 } &#x60;&#x60;&#x60;
 **/

/**
 * A &#x60;&#x60;&#x60;transaction&#x60;&#x60;&#x60; is a completed operation, in contrast to &#x60;&#x60;&#x60;payment&#x60;&#x60;&#x60;, which is planned, but not completed.  The same &#x60;&#x60;&#x60;transaction&#x60;&#x60;&#x60; is used for all types of transactions: DNB-only account transactions, domestic transactions, international transactions, card transactions, etc. Some transaction types have more fields and data than others. A developer does not need to know about different transaction types when retrieving them, this is .  Should have enough data to be useful both for presenting information to an end user, and for data analysis. Mey be extended, possibly to include &#x60;&#x60;&#x60;merchantId&#x60;&#x60;&#x60;with a reference to more details about merchant, as well as &#x60;&#x60;&#x60;location&#x60;&#x60;&#x60;data, etc.  MCC codes: https://github.com/greggles/mcc-codes Example for a hotel: &#x60;&#x60;&#x60; {     \&quot;mcc\&quot;: \&quot;3514\&quot;,     \&quot;edited_description\&quot;: \&quot;Hotels/Motels/Inns/Resorts\&quot;,     \&quot;combined_description\&quot;: \&quot;Hotels/Motels/Inns/Resorts\&quot;,     \&quot;usda_description\&quot;: \&quot;\&quot;,     \&quot;irs_description\&quot;: \&quot;Hotels/Motels/Inns/Resorts\&quot;,     \&quot;irs_reportable\&quot;: \&quot;Yes\&quot;,     \&quot;id\&quot;: 418 } &#x60;&#x60;&#x60;
 */
@ApiModel(description = "A ```transaction``` is a completed operation, in contrast to ```payment```, which is planned, but not completed.  The same ```transaction``` is used for all types of transactions: DNB-only account transactions, domestic transactions, international transactions, card transactions, etc. Some transaction types have more fields and data than others. A developer does not need to know about different transaction types when retrieving them, this is .  Should have enough data to be useful both for presenting information to an end user, and for data analysis. Mey be extended, possibly to include ```merchantId```with a reference to more details about merchant, as well as ```location```data, etc.  MCC codes: https://github.com/greggles/mcc-codes Example for a hotel: ``` {     \"mcc\": \"3514\",     \"edited_description\": \"Hotels/Motels/Inns/Resorts\",     \"combined_description\": \"Hotels/Motels/Inns/Resorts\",     \"usda_description\": \"\",     \"irs_description\": \"Hotels/Motels/Inns/Resorts\",     \"irs_reportable\": \"Yes\",     \"id\": 418 } ```")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class Transaction   {
  private String transactionId = null;

  private BigDecimal amount = null;

  private BigDecimal currencyValue = null;

  private String currency = "NOK";

  private LocalDate dateBooking = null;

  private LocalDate dateValue = null;

  private String description = null;

  /**
   * Booked, reserved, and, if this is to be merged with ```payment```: Completed (or something similar, to indicate that this has, in fact, been processed and finalized)
   */
  public enum StatusEnum {
    BOOKED("BOOKED"),
    
    RESERVED("RESERVED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  private StatusEnum status = StatusEnum.BOOKED;

  private String merchantName = null;

  private String MCC = null;

  public Transaction transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @ApiModelProperty(example = "12345", required = true, value = "")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public Transaction amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * minimum: 0.0
   * @return amount
  **/
  @ApiModelProperty(example = "1500.0", required = true, value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Transaction currencyValue(BigDecimal currencyValue) {
    this.currencyValue = currencyValue;
    return this;
  }

   /**
   * Amount in foreign currency (if relevant)
   * @return currencyValue
  **/
  @ApiModelProperty(example = "90.0", value = "Amount in foreign currency (if relevant)")
  public BigDecimal getCurrencyValue() {
    return currencyValue;
  }

  public void setCurrencyValue(BigDecimal currencyValue) {
    this.currencyValue = currencyValue;
  }

  public Transaction currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * If not the currency of the account/card.
   * @return currency
  **/
  @ApiModelProperty(example = "NOK", value = "If not the currency of the account/card.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Transaction dateBooking(LocalDate dateBooking) {
    this.dateBooking = dateBooking;
    return this;
  }

   /**
   * Get dateBooking
   * @return dateBooking
  **/
  @ApiModelProperty(example = "2018-12-31", required = true, value = "")
  public LocalDate getDateBooking() {
    return dateBooking;
  }

  public void setDateBooking(LocalDate dateBooking) {
    this.dateBooking = dateBooking;
  }

  public Transaction dateValue(LocalDate dateValue) {
    this.dateValue = dateValue;
    return this;
  }

   /**
   * Get dateValue
   * @return dateValue
  **/
  @ApiModelProperty(example = "2018-12-31", value = "")
  public LocalDate getDateValue() {
    return dateValue;
  }

  public void setDateValue(LocalDate dateValue) {
    this.dateValue = dateValue;
  }

  public Transaction description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Descriptive text for the transaction.
   * @return description
  **/
  @ApiModelProperty(example = "Lunch at The Restaurant at the End of the Universe", value = "Descriptive text for the transaction.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Transaction status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Booked, reserved, and, if this is to be merged with ```payment```: Completed (or something similar, to indicate that this has, in fact, been processed and finalized)
   * @return status
  **/
  @ApiModelProperty(example = "BOOKED", required = true, value = "Booked, reserved, and, if this is to be merged with ```payment```: Completed (or something similar, to indicate that this has, in fact, been processed and finalized)")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Transaction merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

   /**
   * Name of merchant. With a merhant register, this could be replaced with a (for now, non-existant) ```merchantId```.
   * @return merchantName
  **/
  @ApiModelProperty(example = "Coffee Shop ChainName, shop number 10", value = "Name of merchant. With a merhant register, this could be replaced with a (for now, non-existant) ```merchantId```.")
  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  public Transaction MCC(String MCC) {
    this.MCC = MCC;
    return this;
  }

   /**
   * MCC: Number and \"combined description\". ISO 18245: https://www.iso.org/standard/33365.html
   * @return MCC
  **/
  @ApiModelProperty(example = "3514: Hotels/Motels/Inns/Resorts", value = "MCC: Number and \"combined description\". ISO 18245: https://www.iso.org/standard/33365.html")
  public String getMCC() {
    return MCC;
  }

  public void setMCC(String MCC) {
    this.MCC = MCC;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.transactionId, transaction.transactionId) &&
        Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.currencyValue, transaction.currencyValue) &&
        Objects.equals(this.currency, transaction.currency) &&
        Objects.equals(this.dateBooking, transaction.dateBooking) &&
        Objects.equals(this.dateValue, transaction.dateValue) &&
        Objects.equals(this.description, transaction.description) &&
        Objects.equals(this.status, transaction.status) &&
        Objects.equals(this.merchantName, transaction.merchantName) &&
        Objects.equals(this.MCC, transaction.MCC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, amount, currencyValue, currency, dateBooking, dateValue, description, status, merchantName, MCC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyValue: ").append(toIndentedString(currencyValue)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dateBooking: ").append(toIndentedString(dateBooking)).append("\n");
    sb.append("    dateValue: ").append(toIndentedString(dateValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    MCC: ").append(toIndentedString(MCC)).append("\n");
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

