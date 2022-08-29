/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.170.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.BankTransferEventListBankTransferType;
import com.plaid.client.model.BankTransferEventListDirection;
import com.plaid.client.model.BankTransferEventType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines the request schema for &#x60;/bank_transfer/event/list&#x60;
 */
@ApiModel(description = "Defines the request schema for `/bank_transfer/event/list`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T18:41:42.227025Z[Etc/UTC]")
public class BankTransferEventListRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_BANK_TRANSFER_ID = "bank_transfer_id";
  @SerializedName(SERIALIZED_NAME_BANK_TRANSFER_ID)
  private String bankTransferId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_BANK_TRANSFER_TYPE = "bank_transfer_type";
  @SerializedName(SERIALIZED_NAME_BANK_TRANSFER_TYPE)
  private BankTransferEventListBankTransferType bankTransferType;

  public static final String SERIALIZED_NAME_EVENT_TYPES = "event_types";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPES)
  private List<BankTransferEventType> eventTypes = null;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count = 25;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset = 0;

  public static final String SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID = "origination_account_id";
  @SerializedName(SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID)
  private String originationAccountId;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private BankTransferEventListDirection direction;


  public BankTransferEventListRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public BankTransferEventListRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public BankTransferEventListRequest startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start datetime of bank transfers to list. This should be in RFC 3339 format (i.e. &#x60;2019-12-06T22:35:49Z&#x60;)
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start datetime of bank transfers to list. This should be in RFC 3339 format (i.e. `2019-12-06T22:35:49Z`)")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public BankTransferEventListRequest endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The end datetime of bank transfers to list. This should be in RFC 3339 format (i.e. &#x60;2019-12-06T22:35:49Z&#x60;)
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end datetime of bank transfers to list. This should be in RFC 3339 format (i.e. `2019-12-06T22:35:49Z`)")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public BankTransferEventListRequest bankTransferId(String bankTransferId) {
    
    this.bankTransferId = bankTransferId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a bank transfer.
   * @return bankTransferId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Plaid’s unique identifier for a bank transfer.")

  public String getBankTransferId() {
    return bankTransferId;
  }


  public void setBankTransferId(String bankTransferId) {
    this.bankTransferId = bankTransferId;
  }


  public BankTransferEventListRequest accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID to get events for all transactions to/from an account.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account ID to get events for all transactions to/from an account.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public BankTransferEventListRequest bankTransferType(BankTransferEventListBankTransferType bankTransferType) {
    
    this.bankTransferType = bankTransferType;
    return this;
  }

   /**
   * Get bankTransferType
   * @return bankTransferType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BankTransferEventListBankTransferType getBankTransferType() {
    return bankTransferType;
  }


  public void setBankTransferType(BankTransferEventListBankTransferType bankTransferType) {
    this.bankTransferType = bankTransferType;
  }


  public BankTransferEventListRequest eventTypes(List<BankTransferEventType> eventTypes) {
    
    this.eventTypes = eventTypes;
    return this;
  }

  public BankTransferEventListRequest addEventTypesItem(BankTransferEventType eventTypesItem) {
    if (this.eventTypes == null) {
      this.eventTypes = new ArrayList<>();
    }
    this.eventTypes.add(eventTypesItem);
    return this;
  }

   /**
   * Filter events by event type.
   * @return eventTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter events by event type.")

  public List<BankTransferEventType> getEventTypes() {
    return eventTypes;
  }


  public void setEventTypes(List<BankTransferEventType> eventTypes) {
    this.eventTypes = eventTypes;
  }


  public BankTransferEventListRequest count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * The maximum number of bank transfer events to return. If the number of events matching the above parameters is greater than &#x60;count&#x60;, the most recent events will be returned.
   * minimum: 1
   * maximum: 25
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of bank transfer events to return. If the number of events matching the above parameters is greater than `count`, the most recent events will be returned.")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public BankTransferEventListRequest offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * The offset into the list of bank transfer events. When &#x60;count&#x60;&#x3D;25 and &#x60;offset&#x60;&#x3D;0, the first 25 events will be returned. When &#x60;count&#x60;&#x3D;25 and &#x60;offset&#x60;&#x3D;25, the next 25 bank transfer events will be returned.
   * minimum: 0
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The offset into the list of bank transfer events. When `count`=25 and `offset`=0, the first 25 events will be returned. When `count`=25 and `offset`=25, the next 25 bank transfer events will be returned.")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public BankTransferEventListRequest originationAccountId(String originationAccountId) {
    
    this.originationAccountId = originationAccountId;
    return this;
  }

   /**
   * The origination account ID to get events for transfers from a specific origination account.
   * @return originationAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The origination account ID to get events for transfers from a specific origination account.")

  public String getOriginationAccountId() {
    return originationAccountId;
  }


  public void setOriginationAccountId(String originationAccountId) {
    this.originationAccountId = originationAccountId;
  }


  public BankTransferEventListRequest direction(BankTransferEventListDirection direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BankTransferEventListDirection getDirection() {
    return direction;
  }


  public void setDirection(BankTransferEventListDirection direction) {
    this.direction = direction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransferEventListRequest bankTransferEventListRequest = (BankTransferEventListRequest) o;
    return Objects.equals(this.clientId, bankTransferEventListRequest.clientId) &&
        Objects.equals(this.secret, bankTransferEventListRequest.secret) &&
        Objects.equals(this.startDate, bankTransferEventListRequest.startDate) &&
        Objects.equals(this.endDate, bankTransferEventListRequest.endDate) &&
        Objects.equals(this.bankTransferId, bankTransferEventListRequest.bankTransferId) &&
        Objects.equals(this.accountId, bankTransferEventListRequest.accountId) &&
        Objects.equals(this.bankTransferType, bankTransferEventListRequest.bankTransferType) &&
        Objects.equals(this.eventTypes, bankTransferEventListRequest.eventTypes) &&
        Objects.equals(this.count, bankTransferEventListRequest.count) &&
        Objects.equals(this.offset, bankTransferEventListRequest.offset) &&
        Objects.equals(this.originationAccountId, bankTransferEventListRequest.originationAccountId) &&
        Objects.equals(this.direction, bankTransferEventListRequest.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, startDate, endDate, bankTransferId, accountId, bankTransferType, eventTypes, count, offset, originationAccountId, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransferEventListRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    bankTransferId: ").append(toIndentedString(bankTransferId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bankTransferType: ").append(toIndentedString(bankTransferType)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    originationAccountId: ").append(toIndentedString(originationAccountId)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

