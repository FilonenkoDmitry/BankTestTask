package com.mydnb.model;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;




/**
 * CardStatus
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-03-11T21:49:00.724+01:00")

public class CardStatus   {
  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    NOT_BLOCKED("Not blocked"),
    
    CARD_BLOCKED_BY_CUSTOMER_CARD_IS_ALLOWED_TO_UNBLOCK("Card blocked by customer - card is allowed to unblock"),
    
    CARD_BLOCKED_BY_CUSTOMER_CARD_IS_NOT_ALLOWED_TO_UNBLOCK("Card blocked by customer - card is not allowed to unblock"),
    
    CARD_BLOCKED_FOR_E_COMMERCE_BY_CUSTOMER_SERVICE("Card blocked for e-commerce by customer service"),
    
    CARD_BLOCKED_FOR_E_COMMERCE_BY_CUSTOMER("Card blocked for e-commerce by customer");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  private StatusEnum status = StatusEnum.NOT_BLOCKED;

  /**
   * Gets or Sets blockingType
   */
  public enum BlockingTypeEnum {
    CARD("Card"),
    
    E_COMMERCE("E-commerce");

    private String value;

    BlockingTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  private BlockingTypeEnum blockingType = BlockingTypeEnum.CARD;

  public CardStatus status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "Not blocked", value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CardStatus blockingType(BlockingTypeEnum blockingType) {
    this.blockingType = blockingType;
    return this;
  }

   /**
   * Get blockingType
   * @return blockingType
  **/
  @ApiModelProperty(value = "")
  public BlockingTypeEnum getBlockingType() {
    return blockingType;
  }

  public void setBlockingType(BlockingTypeEnum blockingType) {
    this.blockingType = blockingType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardStatus cardStatus = (CardStatus) o;
    return Objects.equals(this.status, cardStatus.status) &&
        Objects.equals(this.blockingType, cardStatus.blockingType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, blockingType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardStatus {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    blockingType: ").append(toIndentedString(blockingType)).append("\n");
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

