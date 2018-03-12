package com.mydnb.model;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.joda.time.DateTime;



/**
 * Three types of payments * KID: Customer Identification (2-25 digits, including control digit) * Message: Text message describing the payment  Not including the \&quot;straksbetaling\&quot; (imediate payment) flag, as this will be the default.  Payment initiator: Part of the contxt object, but kept here too for reference. 
 **/

/**
 * Three types of payments * KID: Customer Identification (2-25 digits, including control digit) * Message: Text message describing the payment  Not including the \&quot;straksbetaling\&quot; (imediate payment) flag, as this will be the default.  Payment initiator: Part of the contxt object, but kept here too for reference. 
 */
@ApiModel(description = "Three types of payments * KID: Customer Identification (2-25 digits, including control digit) * Message: Text message describing the payment  Not including the \"straksbetaling\" (imediate payment) flag, as this will be the default.  Payment initiator: Part of the contxt object, but kept here too for reference. ")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class PaymentInitiation   {
  /**
   * KID, message (and transfer?)
   */
  public enum TypeEnum {
    KID("KID"),
    
    MESSAGE("MESSAGE"),
    
    TRANSFER("TRANSFER");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TypeEnum type = TypeEnum.KID;

  private String debitAccountNumber = null;

  private String creditAccountNumber = null;

  private BigDecimal amount = null;

  private DateTime paymentDate = null;

  private String message = null;

  private String initiator = null;

  public PaymentInitiation type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * KID, message (and transfer?)
   * @return type
  **/
  @ApiModelProperty(example = "KID", required = true, value = "KID, message (and transfer?)")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PaymentInitiation debitAccountNumber(String debitAccountNumber) {
    this.debitAccountNumber = debitAccountNumber;
    return this;
  }

   /**
   * Get debitAccountNumber
   * @return debitAccountNumber
  **/
  @ApiModelProperty(example = "12345678901", required = true, value = "")
  public String getDebitAccountNumber() {
    return debitAccountNumber;
  }

  public void setDebitAccountNumber(String debitAccountNumber) {
    this.debitAccountNumber = debitAccountNumber;
  }

  public PaymentInitiation creditAccountNumber(String creditAccountNumber) {
    this.creditAccountNumber = creditAccountNumber;
    return this;
  }

   /**
   * Get creditAccountNumber
   * @return creditAccountNumber
  **/
  @ApiModelProperty(example = "12345678901", required = true, value = "")
  public String getCreditAccountNumber() {
    return creditAccountNumber;
  }

  public void setCreditAccountNumber(String creditAccountNumber) {
    this.creditAccountNumber = creditAccountNumber;
  }

  public PaymentInitiation amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "1500.0", required = true, value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public PaymentInitiation paymentDate(DateTime paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

   /**
   * Get paymentDate
   * @return paymentDate
  **/
  @ApiModelProperty(example = "2018-12-31T23:59:59+01:00", required = true, value = "")
  public DateTime getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(DateTime paymentDate) {
    this.paymentDate = paymentDate;
  }

  public PaymentInitiation message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Used for both KID and Message, based on Type.
   * @return message
  **/
  @ApiModelProperty(example = "35298562958265982749", value = "Used for both KID and Message, based on Type.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public PaymentInitiation initiator(String initiator) {
    this.initiator = initiator;
    return this;
  }

   /**
   * Nu phone who dis?
   * @return initiator
  **/
  @ApiModelProperty(example = "DNB", required = true, value = "Nu phone who dis?")
  public String getInitiator() {
    return initiator;
  }

  public void setInitiator(String initiator) {
    this.initiator = initiator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitiation paymentInitiation = (PaymentInitiation) o;
    return Objects.equals(this.type, paymentInitiation.type) &&
        Objects.equals(this.debitAccountNumber, paymentInitiation.debitAccountNumber) &&
        Objects.equals(this.creditAccountNumber, paymentInitiation.creditAccountNumber) &&
        Objects.equals(this.amount, paymentInitiation.amount) &&
        Objects.equals(this.paymentDate, paymentInitiation.paymentDate) &&
        Objects.equals(this.message, paymentInitiation.message) &&
        Objects.equals(this.initiator, paymentInitiation.initiator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, debitAccountNumber, creditAccountNumber, amount, paymentDate, message, initiator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiation {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    debitAccountNumber: ").append(toIndentedString(debitAccountNumber)).append("\n");
    sb.append("    creditAccountNumber: ").append(toIndentedString(creditAccountNumber)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
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

