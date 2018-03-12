package com.mydnb.model;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;



/**
 * One common &#x60;&#x60;&#x60;customer&#x60;&#x60;&#x60;data object for all kinds of customers: Private customers, business customers, and others.  Please note: * Some updates may be required. * Should be aligned with Shared Services Layer: https://shasl.restlet.io/#type_customer * Should be aligned with CIM, while still hiding internal complexity and making it easy to understand and use.
 **/

/**
 * One common &#x60;&#x60;&#x60;customer&#x60;&#x60;&#x60;data object for all kinds of customers: Private customers, business customers, and others.  Please note: * Some updates may be required. * Should be aligned with Shared Services Layer: https://shasl.restlet.io/#type_customer * Should be aligned with CIM, while still hiding internal complexity and making it easy to understand and use.
 */
@ApiModel(description = "One common ```customer```data object for all kinds of customers: Private customers, business customers, and others.  Please note: * Some updates may be required. * Should be aligned with Shared Services Layer: https://shasl.restlet.io/#type_customer * Should be aligned with CIM, while still hiding internal complexity and making it easy to understand and use.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class Customer   {
  private String customerId = null;

  /**
   * ```PERSON```, ```COMPANY```
   */
  public enum CustomerTypeEnum {
    PERSON("PERSON"),
    
    COMPANY("COMPANY");

    private String value;

    CustomerTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  private CustomerTypeEnum customerType = CustomerTypeEnum.PERSON;

  private String firstName = null;

  private String lastName = null;

  private String companyName = null;

  private Address address = null;

  private String email = null;

  private String phone = null;

  private String countryOfBirth = null;

  private List<String> countryCitizenships = new ArrayList<String>();

  private List<String> countryTax = new ArrayList<String>();

  private List<CustomerEngagement> customerEngagement = new ArrayList<CustomerEngagement>();

  public Customer customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * SSN (11 digits) or organization number (9 digits).
   * @return customerId
  **/
  @ApiModelProperty(example = "12345678901", required = true, value = "SSN (11 digits) or organization number (9 digits).")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Customer customerType(CustomerTypeEnum customerType) {
    this.customerType = customerType;
    return this;
  }

   /**
   * ```PERSON```, ```COMPANY```
   * @return customerType
  **/
  @ApiModelProperty(example = "PERSON", required = true, value = "```PERSON```, ```COMPANY```")
  public CustomerTypeEnum getCustomerType() {
    return customerType;
  }

  public void setCustomerType(CustomerTypeEnum customerType) {
    this.customerType = customerType;
  }

  public Customer firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name. May be used for the contact person if type is ```COMPANY```.
   * @return firstName
  **/
  @ApiModelProperty(example = "Rune", value = "First name. May be used for the contact person if type is ```COMPANY```.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Customer lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Surname. May be used for the contact person if type is ```COMPANY```.
   * @return lastName
  **/
  @ApiModelProperty(example = "Bjerke", value = "Surname. May be used for the contact person if type is ```COMPANY```.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Customer companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Company name, if type is ```COMPANY```.
   * @return companyName
  **/
  @ApiModelProperty(example = "DNB", value = "Company name, if type is ```COMPANY```.")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Customer address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Customer email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address. RFC 5322.
   * @return email
  **/
  @ApiModelProperty(example = "example@example.com", value = "Email address. RFC 5322.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Customer phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Including \"+\" and international prefix. E.164: https://www.twilio.com/docs/glossary/what-e164 Whitespace and dashes are stripped.
   * @return phone
  **/
  @ApiModelProperty(example = "+4791504800", value = "Including \"+\" and international prefix. E.164: https://www.twilio.com/docs/glossary/what-e164 Whitespace and dashes are stripped.")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Customer countryOfBirth(String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
    return this;
  }

   /**
   * ISO 3166-1 alpha-2: https://www.iso.org/standard/63546.html
   * @return countryOfBirth
  **/
  @ApiModelProperty(example = "NO", value = "ISO 3166-1 alpha-2: https://www.iso.org/standard/63546.html")
  public String getCountryOfBirth() {
    return countryOfBirth;
  }

  public void setCountryOfBirth(String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
  }

  public Customer countryCitizenships(List<String> countryCitizenships) {
    this.countryCitizenships = countryCitizenships;
    return this;
  }

  public Customer addCountryCitizenshipsItem(String countryCitizenshipsItem) {
    this.countryCitizenships.add(countryCitizenshipsItem);
    return this;
  }

   /**
   * ISO 3166-1 alpha-2: https://www.iso.org/standard/63546.html
   * @return countryCitizenships
  **/
  @ApiModelProperty(value = "ISO 3166-1 alpha-2: https://www.iso.org/standard/63546.html")
  public List<String> getCountryCitizenships() {
    return countryCitizenships;
  }

  public void setCountryCitizenships(List<String> countryCitizenships) {
    this.countryCitizenships = countryCitizenships;
  }

  public Customer countryTax(List<String> countryTax) {
    this.countryTax = countryTax;
    return this;
  }

  public Customer addCountryTaxItem(String countryTaxItem) {
    this.countryTax.add(countryTaxItem);
    return this;
  }

   /**
   * ISO 3166-1 alpha-2: https://www.iso.org/standard/63546.html
   * @return countryTax
  **/
  @ApiModelProperty(required = true, value = "ISO 3166-1 alpha-2: https://www.iso.org/standard/63546.html")
  public List<String> getCountryTax() {
    return countryTax;
  }

  public void setCountryTax(List<String> countryTax) {
    this.countryTax = countryTax;
  }

  public Customer customerEngagement(List<CustomerEngagement> customerEngagement) {
    this.customerEngagement = customerEngagement;
    return this;
  }

  public Customer addCustomerEngagementItem(CustomerEngagement customerEngagementItem) {
    this.customerEngagement.add(customerEngagementItem);
    return this;
  }

   /**
   * One or more engagements
   * @return customerEngagement
  **/
  @ApiModelProperty(value = "One or more engagements")
  public List<CustomerEngagement> getCustomerEngagement() {
    return customerEngagement;
  }

  public void setCustomerEngagement(List<CustomerEngagement> customerEngagement) {
    this.customerEngagement = customerEngagement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.customerId, customer.customerId) &&
        Objects.equals(this.customerType, customer.customerType) &&
        Objects.equals(this.firstName, customer.firstName) &&
        Objects.equals(this.lastName, customer.lastName) &&
        Objects.equals(this.companyName, customer.companyName) &&
        Objects.equals(this.address, customer.address) &&
        Objects.equals(this.email, customer.email) &&
        Objects.equals(this.phone, customer.phone) &&
        Objects.equals(this.countryOfBirth, customer.countryOfBirth) &&
        Objects.equals(this.countryCitizenships, customer.countryCitizenships) &&
        Objects.equals(this.countryTax, customer.countryTax) &&
        Objects.equals(this.customerEngagement, customer.customerEngagement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, customerType, firstName, lastName, companyName, address, email, phone, countryOfBirth, countryCitizenships, countryTax, customerEngagement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    countryOfBirth: ").append(toIndentedString(countryOfBirth)).append("\n");
    sb.append("    countryCitizenships: ").append(toIndentedString(countryCitizenships)).append("\n");
    sb.append("    countryTax: ").append(toIndentedString(countryTax)).append("\n");
    sb.append("    customerEngagement: ").append(toIndentedString(customerEngagement)).append("\n");
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

