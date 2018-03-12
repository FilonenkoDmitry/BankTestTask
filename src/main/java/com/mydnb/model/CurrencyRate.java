package com.mydnb.model;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * Used by &#x60;&#x60;&#x60;/currencies/list/{base}&#x60;&#x60;&#x60; for a response similar to:  &#x60;&#x60;&#x60; {     timestamp: 1504548341,     base: \&quot;NOK\&quot;,     rates: {         AED: 3.672538,         AFN: 66.809999,         ALL: 125.716501,         AMD: 484.902502,         ANG: 1.788575,         AOA: 135.295998,         ARS: 9.750101,         AUD: 1.390866,         /_* ... *_/     } } &#x60;&#x60;&#x60;
 **/

/**
 * Used by &#x60;&#x60;&#x60;/currencies/list/{base}&#x60;&#x60;&#x60; for a response similar to:  &#x60;&#x60;&#x60; {     timestamp: 1504548341,     base: \&quot;NOK\&quot;,     rates: {         AED: 3.672538,         AFN: 66.809999,         ALL: 125.716501,         AMD: 484.902502,         ANG: 1.788575,         AOA: 135.295998,         ARS: 9.750101,         AUD: 1.390866,         /_* ... *_/     } } &#x60;&#x60;&#x60;
 */
@ApiModel(description = "Used by ```/currencies/list/{base}``` for a response similar to:  ``` {     timestamp: 1504548341,     base: \"NOK\",     rates: {         AED: 3.672538,         AFN: 66.809999,         ALL: 125.716501,         AMD: 484.902502,         ANG: 1.788575,         AOA: 135.295998,         ARS: 9.750101,         AUD: 1.390866,         /_* ... *_/     } } ```")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class CurrencyRate   {
  private String currency = "NOK";

  private BigDecimal currencyRate = null;

  public CurrencyRate currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * ISO 4217: alpha 3-letter upcase: https://www.iso.org/iso-4217-currency-codes.html
   * @return currency
  **/
  @ApiModelProperty(example = "NOK", required = true, value = "ISO 4217: alpha 3-letter upcase: https://www.iso.org/iso-4217-currency-codes.html")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public CurrencyRate currencyRate(BigDecimal currencyRate) {
    this.currencyRate = currencyRate;
    return this;
  }

   /**
   * Get currencyRate
   * @return currencyRate
  **/
  @ApiModelProperty(example = "123.45", required = true, value = "")
  public BigDecimal getCurrencyRate() {
    return currencyRate;
  }

  public void setCurrencyRate(BigDecimal currencyRate) {
    this.currencyRate = currencyRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyRate currencyRate = (CurrencyRate) o;
    return Objects.equals(this.currency, currencyRate.currency) &&
        Objects.equals(this.currencyRate, currencyRate.currencyRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, currencyRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyRate {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    currencyRate: ").append(toIndentedString(currencyRate)).append("\n");
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

