package com.mydnb.model;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Data object for physical location based on GPS coordinates. May be used for something that does not have a specific address, or somethjing that needs a more specific than an address provides, such as an &#x60;&#x60;&#x60;ATM&#x60;&#x60;&#x60; at a train station. A &#x60;&#x60;&#x60;location&#x60;&#x60;&#x60; may be used in addition to an &#x60;&#x60;&#x60;address&#x60;&#x60;&#x60;. 
 **/

/**
 * Data object for physical location based on GPS coordinates. May be used for something that does not have a specific address, or somethjing that needs a more specific than an address provides, such as an &#x60;&#x60;&#x60;ATM&#x60;&#x60;&#x60; at a train station. A &#x60;&#x60;&#x60;location&#x60;&#x60;&#x60; may be used in addition to an &#x60;&#x60;&#x60;address&#x60;&#x60;&#x60;. 
 */
@ApiModel(description = "Data object for physical location based on GPS coordinates. May be used for something that does not have a specific address, or somethjing that needs a more specific than an address provides, such as an ```ATM``` at a train station. A ```location``` may be used in addition to an ```address```. ")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class Location   {
  private String id = null;

  private String friendlyName = null;

  private String latitude = null;

  private String longditude = null;

  private String description = null;

  public Location id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Internal id
   * @return id
  **/
  @ApiModelProperty(example = "12345", required = true, value = "Internal id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Location friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

   /**
   * Descriptive name
   * @return friendlyName
  **/
  @ApiModelProperty(example = "DNB headquarters", value = "Descriptive name")
  public String getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  public Location latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(example = "59.9075823", required = true, value = "")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public Location longditude(String longditude) {
    this.longditude = longditude;
    return this;
  }

   /**
   * Get longditude
   * @return longditude
  **/
  @ApiModelProperty(example = "10.760133399999972", required = true, value = "")
  public String getLongditude() {
    return longditude;
  }

  public void setLongditude(String longditude) {
    this.longditude = longditude;
  }

  public Location description(String description) {
    this.description = description;
    return this;
  }

   /**
   * May be used for large areas like airports, train stations, stadiums, etc.
   * @return description
  **/
  @ApiModelProperty(example = "Lobby", value = "May be used for large areas like airports, train stations, stadiums, etc.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.id, location.id) &&
        Objects.equals(this.friendlyName, location.friendlyName) &&
        Objects.equals(this.latitude, location.latitude) &&
        Objects.equals(this.longditude, location.longditude) &&
        Objects.equals(this.description, location.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, friendlyName, latitude, longditude, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longditude: ").append(toIndentedString(longditude)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

