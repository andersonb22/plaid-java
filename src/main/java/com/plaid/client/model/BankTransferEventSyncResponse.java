/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.181.1
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
import com.plaid.client.model.BankTransferEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines the response schema for &#x60;/bank_transfer/event/sync&#x60;
 */
@ApiModel(description = "Defines the response schema for `/bank_transfer/event/sync`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-20T20:43:44.520784Z[Etc/UTC]")
public class BankTransferEventSyncResponse {
  public static final String SERIALIZED_NAME_BANK_TRANSFER_EVENTS = "bank_transfer_events";
  @SerializedName(SERIALIZED_NAME_BANK_TRANSFER_EVENTS)
  private List<BankTransferEvent> bankTransferEvents = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public BankTransferEventSyncResponse bankTransferEvents(List<BankTransferEvent> bankTransferEvents) {
    
    this.bankTransferEvents = bankTransferEvents;
    return this;
  }

  public BankTransferEventSyncResponse addBankTransferEventsItem(BankTransferEvent bankTransferEventsItem) {
    this.bankTransferEvents.add(bankTransferEventsItem);
    return this;
  }

   /**
   * Get bankTransferEvents
   * @return bankTransferEvents
  **/
  @ApiModelProperty(required = true, value = "")

  public List<BankTransferEvent> getBankTransferEvents() {
    return bankTransferEvents;
  }


  public void setBankTransferEvents(List<BankTransferEvent> bankTransferEvents) {
    this.bankTransferEvents = bankTransferEvents;
  }


  public BankTransferEventSyncResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransferEventSyncResponse bankTransferEventSyncResponse = (BankTransferEventSyncResponse) o;
    return Objects.equals(this.bankTransferEvents, bankTransferEventSyncResponse.bankTransferEvents) &&
        Objects.equals(this.requestId, bankTransferEventSyncResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankTransferEvents, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransferEventSyncResponse {\n");
    sb.append("    bankTransferEvents: ").append(toIndentedString(bankTransferEvents)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

