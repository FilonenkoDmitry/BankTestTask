package com.mydnb.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;

import java.util.ArrayList;


/**
 * Opening times for a &#x60;&#x60;&#x60;branch&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;ATM&#x60;&#x60;&#x60;, or something else.  If open 24 hours, use \&quot;00:00\&quot; both for &#x60;&#x60;&#x60;openingTime&#x60;&#x60;&#x60; and &#x60;&#x60;&#x60;closingTime&#x60;&#x60;&#x60;.
 **/

/**
 * Opening times for a &#x60;&#x60;&#x60;branch&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;ATM&#x60;&#x60;&#x60;, or something else.  If open 24 hours, use \&quot;00:00\&quot; both for &#x60;&#x60;&#x60;openingTime&#x60;&#x60;&#x60; and &#x60;&#x60;&#x60;closingTime&#x60;&#x60;&#x60;.
 */
@ApiModel(description = "Opening times for a ```branch```, ```ATM```, or something else.  If open 24 hours, use \"00:00\" both for ```openingTime``` and ```closingTime```.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class OpeningTimes extends ArrayList<OpeningTimesInner>  {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpeningTimes {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

