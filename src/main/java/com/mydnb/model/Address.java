package com.mydnb.model;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Corresponds with address fields used internally in DNB. 
 **/

/**
 * Corresponds with address fields used internally in DNB. 
 */
@ApiModel(description = "Corresponds with address fields used internally in DNB. ")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class Address   {
  private String postalAddressLine1 = null;

  private String postalAddressLine2 = null;

  private String postalAddressLine3 = null;

  private String postCode = null;

  private String postCity = null;

  private String postCountry = null;

  public Address postalAddressLine1(String postalAddressLine1) {
    this.postalAddressLine1 = postalAddressLine1;
    return this;
  }

   /**
   * Street name and number
   * @return postalAddressLine1
  **/
  @ApiModelProperty(example = "Dronning Eufemias gate 30", value = "Street name and number")
  public String getPostalAddressLine1() {
    return postalAddressLine1;
  }

  public void setPostalAddressLine1(String postalAddressLine1) {
    this.postalAddressLine1 = postalAddressLine1;
  }

  public Address postalAddressLine2(String postalAddressLine2) {
    this.postalAddressLine2 = postalAddressLine2;
    return this;
  }

   /**
   * Get postalAddressLine2
   * @return postalAddressLine2
  **/
  @ApiModelProperty(example = "c/o CEO office", value = "")
  public String getPostalAddressLine2() {
    return postalAddressLine2;
  }

  public void setPostalAddressLine2(String postalAddressLine2) {
    this.postalAddressLine2 = postalAddressLine2;
  }

  public Address postalAddressLine3(String postalAddressLine3) {
    this.postalAddressLine3 = postalAddressLine3;
    return this;
  }

   /**
   * Get postalAddressLine3
   * @return postalAddressLine3
  **/
  @ApiModelProperty(value = "")
  public String getPostalAddressLine3() {
    return postalAddressLine3;
  }

  public void setPostalAddressLine3(String postalAddressLine3) {
    this.postalAddressLine3 = postalAddressLine3;
  }

  public Address postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

   /**
   * Norwegian postcode only (for now).
   * @return postCode
  **/
  @ApiModelProperty(example = "0191", required = true, value = "Norwegian postcode only (for now).")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public Address postCity(String postCity) {
    this.postCity = postCity;
    return this;
  }

   /**
   * Get postCity
   * @return postCity
  **/
  @ApiModelProperty(example = "Oslo", required = true, value = "")
  public String getPostCity() {
    return postCity;
  }

  public void setPostCity(String postCity) {
    this.postCity = postCity;
  }

  public Address postCountry(String postCountry) {
    this.postCountry = postCountry;
    return this;
  }

   /**
   * ISO 3166-1 alpha-2: https://www.iso.org/standard/63546.html
   * @return postCountry
  **/
  @ApiModelProperty(example = "NO", required = true, value = "ISO 3166-1 alpha-2: https://www.iso.org/standard/63546.html")
  public String getPostCountry() {
    return postCountry;
  }

  public void setPostCountry(String postCountry) {
    this.postCountry = postCountry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.postalAddressLine1, address.postalAddressLine1) &&
        Objects.equals(this.postalAddressLine2, address.postalAddressLine2) &&
        Objects.equals(this.postalAddressLine3, address.postalAddressLine3) &&
        Objects.equals(this.postCode, address.postCode) &&
        Objects.equals(this.postCity, address.postCity) &&
        Objects.equals(this.postCountry, address.postCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postalAddressLine1, postalAddressLine2, postalAddressLine3, postCode, postCity, postCountry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    postalAddressLine1: ").append(toIndentedString(postalAddressLine1)).append("\n");
    sb.append("    postalAddressLine2: ").append(toIndentedString(postalAddressLine2)).append("\n");
    sb.append("    postalAddressLine3: ").append(toIndentedString(postalAddressLine3)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    postCity: ").append(toIndentedString(postCity)).append("\n");
    sb.append("    postCountry: ").append(toIndentedString(postCountry)).append("\n");
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

