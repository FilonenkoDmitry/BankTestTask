package com.mydnb.model;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;



/**
 * Details for an &#x60;&#x60;&#x60;account&#x60;&#x60;&#x60;, with optional reference to &#x60;&#x60;&#x60;accountDetails&#x60;&#x60;&#x60;.  IBAN help: http://www.xe.com/ibancalculator/sample/?ibancountry&#x3D;norway  Possible regex for IBAN:
 **/

/**
 * Details for an &#x60;&#x60;&#x60;account&#x60;&#x60;&#x60;, with optional reference to &#x60;&#x60;&#x60;accountDetails&#x60;&#x60;&#x60;.  IBAN help: http://www.xe.com/ibancalculator/sample/?ibancountry&#x3D;norway  Possible regex for IBAN:
 */
@ApiModel(description = "Details for an ```account```, with optional reference to ```accountDetails```.  IBAN help: http://www.xe.com/ibancalculator/sample/?ibancountry=norway  Possible regex for IBAN:")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class AccountDetails   {
  private String IBAN = null;

  private String BIC = null;

  private String currency = null;

  private DateTime created = null;

  private DateTime updated = null;

  private AccountInterestDetails accountInterestDetails = null;

  public AccountDetails IBAN(String IBAN) {
    this.IBAN = IBAN;
    return this;
  }

   /**
   * ISO 13616:2007: https://www.iso.org/standard/41031.html No whitespace. Enjoy the regex.
   * @return IBAN
  **/
  @ApiModelProperty(example = "NO9386011117947", required = true, value = "ISO 13616:2007: https://www.iso.org/standard/41031.html No whitespace. Enjoy the regex.")
  public String getIBAN() {
    return IBAN;
  }

  public void setIBAN(String IBAN) {
    this.IBAN = IBAN;
  }

  public AccountDetails BIC(String BIC) {
    this.BIC = BIC;
    return this;
  }

   /**
   * ISO 9362: https://en.wikipedia.org/wiki/ISO_9362
   * @return BIC
  **/
  @ApiModelProperty(example = "DNBANOKKXXX", required = true, value = "ISO 9362: https://en.wikipedia.org/wiki/ISO_9362")
  public String getBIC() {
    return BIC;
  }

  public void setBIC(String BIC) {
    this.BIC = BIC;
  }

  public AccountDetails currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency: ISO 4217: alpha 3-letter upcase. https://www.iso.org/iso-4217-currency-codes.html
   * @return currency
  **/
  @ApiModelProperty(example = "NOK", required = true, value = "Currency: ISO 4217: alpha 3-letter upcase. https://www.iso.org/iso-4217-currency-codes.html")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public AccountDetails created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Time of account creation.
   * @return created
  **/
  @ApiModelProperty(example = "2018-12-31T23:59:59+01", required = true, value = "Time of account creation.")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public AccountDetails updated(DateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Time of last update.
   * @return updated
  **/
  @ApiModelProperty(example = "2018-12-31T23:59:59+01", required = true, value = "Time of last update.")
  public DateTime getUpdated() {
    return updated;
  }

  public void setUpdated(DateTime updated) {
    this.updated = updated;
  }

  public AccountDetails accountInterestDetails(AccountInterestDetails accountInterestDetails) {
    this.accountInterestDetails = accountInterestDetails;
    return this;
  }

   /**
   * Get accountInterestDetails
   * @return accountInterestDetails
  **/
  @ApiModelProperty(value = "")
  public AccountInterestDetails getAccountInterestDetails() {
    return accountInterestDetails;
  }

  public void setAccountInterestDetails(AccountInterestDetails accountInterestDetails) {
    this.accountInterestDetails = accountInterestDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDetails accountDetails = (AccountDetails) o;
    return Objects.equals(this.IBAN, accountDetails.IBAN) &&
        Objects.equals(this.BIC, accountDetails.BIC) &&
        Objects.equals(this.currency, accountDetails.currency) &&
        Objects.equals(this.created, accountDetails.created) &&
        Objects.equals(this.updated, accountDetails.updated) &&
        Objects.equals(this.accountInterestDetails, accountDetails.accountInterestDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(IBAN, BIC, currency, created, updated, accountInterestDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDetails {\n");
    
    sb.append("    IBAN: ").append(toIndentedString(IBAN)).append("\n");
    sb.append("    BIC: ").append(toIndentedString(BIC)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    accountInterestDetails: ").append(toIndentedString(accountInterestDetails)).append("\n");
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

