/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.177.1
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * BankTransferSweepListRequest defines the request schema for &#x60;/bank_transfer/sweep/list&#x60;
 */
@ApiModel(description = "BankTransferSweepListRequest defines the request schema for `/bank_transfer/sweep/list`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-20T20:08:02.399975Z[Etc/UTC]")
public class BankTransferSweepListRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID = "origination_account_id";
  @SerializedName(SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID)
  private String originationAccountId;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count = 25;


  public BankTransferSweepListRequest clientId(String clientId) {
    
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


  public BankTransferSweepListRequest secret(String secret) {
    
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


  public BankTransferSweepListRequest originationAccountId(String originationAccountId) {
    
    this.originationAccountId = originationAccountId;
    return this;
  }

   /**
   * If multiple origination accounts are available, &#x60;origination_account_id&#x60; must be used to specify the account that the sweeps belong to.
   * @return originationAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If multiple origination accounts are available, `origination_account_id` must be used to specify the account that the sweeps belong to.")

  public String getOriginationAccountId() {
    return originationAccountId;
  }


  public void setOriginationAccountId(String originationAccountId) {
    this.originationAccountId = originationAccountId;
  }


  public BankTransferSweepListRequest startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * The start datetime of sweeps to return (RFC 3339 format).
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start datetime of sweeps to return (RFC 3339 format).")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public BankTransferSweepListRequest endTime(OffsetDateTime endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * The end datetime of sweeps to return (RFC 3339 format).
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end datetime of sweeps to return (RFC 3339 format).")

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public BankTransferSweepListRequest count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * The maximum number of sweeps to return.
   * minimum: 1
   * maximum: 25
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of sweeps to return.")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransferSweepListRequest bankTransferSweepListRequest = (BankTransferSweepListRequest) o;
    return Objects.equals(this.clientId, bankTransferSweepListRequest.clientId) &&
        Objects.equals(this.secret, bankTransferSweepListRequest.secret) &&
        Objects.equals(this.originationAccountId, bankTransferSweepListRequest.originationAccountId) &&
        Objects.equals(this.startTime, bankTransferSweepListRequest.startTime) &&
        Objects.equals(this.endTime, bankTransferSweepListRequest.endTime) &&
        Objects.equals(this.count, bankTransferSweepListRequest.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, originationAccountId, startTime, endTime, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransferSweepListRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    originationAccountId: ").append(toIndentedString(originationAccountId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

