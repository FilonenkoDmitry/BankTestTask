package com.mydnb.model;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * More details about a payment. Some payment types have more data than others.
 **/

/**
 * More details about a payment. Some payment types have more data than others.
 */
@ApiModel(description = "More details about a payment. Some payment types have more data than others.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class PaymentDetails   {
  private String invoiceReference = null;

  public PaymentDetails invoiceReference(String invoiceReference) {
    this.invoiceReference = invoiceReference;
    return this;
  }

   /**
   * Used for eFaktura
   * @return invoiceReference
  **/
  @ApiModelProperty(example = "12345678901", value = "Used for eFaktura")
  public String getInvoiceReference() {
    return invoiceReference;
  }

  public void setInvoiceReference(String invoiceReference) {
    this.invoiceReference = invoiceReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentDetails paymentDetails = (PaymentDetails) o;
    return Objects.equals(this.invoiceReference, paymentDetails.invoiceReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDetails {\n");
    
    sb.append("    invoiceReference: ").append(toIndentedString(invoiceReference)).append("\n");
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

