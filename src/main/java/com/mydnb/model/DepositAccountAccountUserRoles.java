package com.mydnb.model;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;




/**
 * DepositAccountAccountUserRoles
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class DepositAccountAccountUserRoles   {
  private String roleType = null;

  private String roleOwnerId = null;

  private String roleOwnerName = null;

  public DepositAccountAccountUserRoles roleType(String roleType) {
    this.roleType = roleType;
    return this;
  }

   /**
   * Get roleType
   * @return roleType
  **/
  @ApiModelProperty(value = "")
  public String getRoleType() {
    return roleType;
  }

  public void setRoleType(String roleType) {
    this.roleType = roleType;
  }

  public DepositAccountAccountUserRoles roleOwnerId(String roleOwnerId) {
    this.roleOwnerId = roleOwnerId;
    return this;
  }

   /**
   * Get roleOwnerId
   * @return roleOwnerId
  **/
  @ApiModelProperty(value = "")
  public String getRoleOwnerId() {
    return roleOwnerId;
  }

  public void setRoleOwnerId(String roleOwnerId) {
    this.roleOwnerId = roleOwnerId;
  }

  public DepositAccountAccountUserRoles roleOwnerName(String roleOwnerName) {
    this.roleOwnerName = roleOwnerName;
    return this;
  }

   /**
   * Get roleOwnerName
   * @return roleOwnerName
  **/
  @ApiModelProperty(value = "")
  public String getRoleOwnerName() {
    return roleOwnerName;
  }

  public void setRoleOwnerName(String roleOwnerName) {
    this.roleOwnerName = roleOwnerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositAccountAccountUserRoles depositAccountAccountUserRoles = (DepositAccountAccountUserRoles) o;
    return Objects.equals(this.roleType, depositAccountAccountUserRoles.roleType) &&
        Objects.equals(this.roleOwnerId, depositAccountAccountUserRoles.roleOwnerId) &&
        Objects.equals(this.roleOwnerName, depositAccountAccountUserRoles.roleOwnerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleType, roleOwnerId, roleOwnerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositAccountAccountUserRoles {\n");
    
    sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
    sb.append("    roleOwnerId: ").append(toIndentedString(roleOwnerId)).append("\n");
    sb.append("    roleOwnerName: ").append(toIndentedString(roleOwnerName)).append("\n");
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

