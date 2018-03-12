package com.mydnb.model;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Used with &#x60;&#x60;&#x60;customer&#x60;&#x60;&#x60;.   Work in progress. See https://shasl.restlet.io/#type_engagement
 **/

/**
 * Used with &#x60;&#x60;&#x60;customer&#x60;&#x60;&#x60;.   Work in progress. See https://shasl.restlet.io/#type_engagement
 */
@ApiModel(description = "Used with ```customer```.   Work in progress. See https://shasl.restlet.io/#type_engagement")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class CustomerEngagement   {
  private String engagementId = null;

  /**
   * Types of engagements: To be determined. Needs to be aligned with DNB CIM, without exposing internal complexity.
   */
  public enum EngagementTypeEnum {
    DEPOSIT("DEPOSIT"),
    
    CREDITCARD("CREDITCARD"),
    
    MORTGAGE("MORTGAGE");

    private String value;

    EngagementTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  private EngagementTypeEnum engagementType = EngagementTypeEnum.DEPOSIT;

  private String accountNumber = null;

  private String friendlyName = null;

  private Boolean corporate = false;

  public CustomerEngagement engagementId(String engagementId) {
    this.engagementId = engagementId;
    return this;
  }

   /**
   * Get engagementId
   * @return engagementId
  **/
  @ApiModelProperty(example = "12345", required = true, value = "")
  public String getEngagementId() {
    return engagementId;
  }

  public void setEngagementId(String engagementId) {
    this.engagementId = engagementId;
  }

  public CustomerEngagement engagementType(EngagementTypeEnum engagementType) {
    this.engagementType = engagementType;
    return this;
  }

   /**
   * Types of engagements: To be determined. Needs to be aligned with DNB CIM, without exposing internal complexity.
   * @return engagementType
  **/
  @ApiModelProperty(example = "DEPOSIT", value = "Types of engagements: To be determined. Needs to be aligned with DNB CIM, without exposing internal complexity.")
  public EngagementTypeEnum getEngagementType() {
    return engagementType;
  }

  public void setEngagementType(EngagementTypeEnum engagementType) {
    this.engagementType = engagementType;
  }

  public CustomerEngagement accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(example = "12345678901", value = "")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public CustomerEngagement friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

   /**
   * Get friendlyName
   * @return friendlyName
  **/
  @ApiModelProperty(example = "SAGA MasterCard", value = "")
  public String getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  public CustomerEngagement corporate(Boolean corporate) {
    this.corporate = corporate;
    return this;
  }

   /**
   * Get corporate
   * @return corporate
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean getCorporate() {
    return corporate;
  }

  public void setCorporate(Boolean corporate) {
    this.corporate = corporate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerEngagement customerEngagement = (CustomerEngagement) o;
    return Objects.equals(this.engagementId, customerEngagement.engagementId) &&
        Objects.equals(this.engagementType, customerEngagement.engagementType) &&
        Objects.equals(this.accountNumber, customerEngagement.accountNumber) &&
        Objects.equals(this.friendlyName, customerEngagement.friendlyName) &&
        Objects.equals(this.corporate, customerEngagement.corporate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engagementId, engagementType, accountNumber, friendlyName, corporate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerEngagement {\n");
    
    sb.append("    engagementId: ").append(toIndentedString(engagementId)).append("\n");
    sb.append("    engagementType: ").append(toIndentedString(engagementType)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    corporate: ").append(toIndentedString(corporate)).append("\n");
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

