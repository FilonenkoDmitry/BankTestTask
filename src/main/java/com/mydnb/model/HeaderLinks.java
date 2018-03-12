package com.mydnb.model;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * URIs for previous, this and next. Only this (self) is required, as previous and next may not exist).  See also global headers for pagination: &#x60;&#x60;&#x60;pageNumber&#x60;&#x60;&#x60;and &#x60;&#x60;&#x60;pageSize&#x60;&#x60;&#x60;.
 **/

/**
 * URIs for previous, this and next. Only this (self) is required, as previous and next may not exist).  See also global headers for pagination: &#x60;&#x60;&#x60;pageNumber&#x60;&#x60;&#x60;and &#x60;&#x60;&#x60;pageSize&#x60;&#x60;&#x60;.
 */
@ApiModel(description = "URIs for previous, this and next. Only this (self) is required, as previous and next may not exist).  See also global headers for pagination: ```pageNumber```and ```pageSize```.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class HeaderLinks   {
  private String first = null;

  private String self = null;

  private String previous = null;

  private String next = null;

  public HeaderLinks first(String first) {
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @ApiModelProperty(example = "https://api.example.com/something-first", required = true, value = "")
  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public HeaderLinks self(String self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(example = "https://api.example.com/something", required = true, value = "")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public HeaderLinks previous(String previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Get previous
   * @return previous
  **/
  @ApiModelProperty(example = "https://api.example.com/something-previous", value = "")
  public String getPrevious() {
    return previous;
  }

  public void setPrevious(String previous) {
    this.previous = previous;
  }

  public HeaderLinks next(String next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(example = "https://api.example.com/something-next", value = "")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaderLinks headerLinks = (HeaderLinks) o;
    return Objects.equals(this.first, headerLinks.first) &&
        Objects.equals(this.self, headerLinks.self) &&
        Objects.equals(this.previous, headerLinks.previous) &&
        Objects.equals(this.next, headerLinks.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, self, previous, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderLinks {\n");
    
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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

