package com.mydnb.model;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;




/**
 * OpeningTimesInner
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class OpeningTimesInner   {
  private Integer day = null;

  private String openingTime = null;

  private String closingTime = null;

  public OpeningTimesInner day(Integer day) {
    this.day = day;
    return this;
  }

   /**
   * 1: Monday, 2: Tuesday, etc
   * minimum: 1.0
   * maximum: 7.0
   * @return day
  **/
  @ApiModelProperty(example = "1", value = "1: Monday, 2: Tuesday, etc")
  public Integer getDay() {
    return day;
  }

  public void setDay(Integer day) {
    this.day = day;
  }

  public OpeningTimesInner openingTime(String openingTime) {
    this.openingTime = openingTime;
    return this;
  }

   /**
   * HH:MM
   * @return openingTime
  **/
  @ApiModelProperty(example = "09:00", required = true, value = "HH:MM")
  public String getOpeningTime() {
    return openingTime;
  }

  public void setOpeningTime(String openingTime) {
    this.openingTime = openingTime;
  }

  public OpeningTimesInner closingTime(String closingTime) {
    this.closingTime = closingTime;
    return this;
  }

   /**
   * HH:MM
   * @return closingTime
  **/
  @ApiModelProperty(example = "16:00", required = true, value = "HH:MM")
  public String getClosingTime() {
    return closingTime;
  }

  public void setClosingTime(String closingTime) {
    this.closingTime = closingTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpeningTimesInner openingTimesInner = (OpeningTimesInner) o;
    return Objects.equals(this.day, openingTimesInner.day) &&
        Objects.equals(this.openingTime, openingTimesInner.openingTime) &&
        Objects.equals(this.closingTime, openingTimesInner.closingTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, openingTime, closingTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpeningTimesInner {\n");
    
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    openingTime: ").append(toIndentedString(openingTime)).append("\n");
    sb.append("    closingTime: ").append(toIndentedString(closingTime)).append("\n");
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

