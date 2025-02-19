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
import com.plaid.client.model.LinkDeliverySessionStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * LinkDeliveryGetRequest defines the response schema for &#x60;/link_delivery/get&#x60;
 */
@ApiModel(description = "LinkDeliveryGetRequest defines the response schema for `/link_delivery/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-20T20:43:44.520784Z[Etc/UTC]")
public class LinkDeliveryGetResponse {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private LinkDeliverySessionStatus status;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_PUBLIC_TOKENS = "public_tokens";
  @SerializedName(SERIALIZED_NAME_PUBLIC_TOKENS)
  private List<String> publicTokens = null;

  public static final String SERIALIZED_NAME_COMPLETED_AT = "completed_at";
  @SerializedName(SERIALIZED_NAME_COMPLETED_AT)
  private OffsetDateTime completedAt;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public LinkDeliveryGetResponse status(LinkDeliverySessionStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public LinkDeliverySessionStatus getStatus() {
    return status;
  }


  public void setStatus(LinkDeliverySessionStatus status) {
    this.status = status;
  }


  public LinkDeliveryGetResponse createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (&#x60;YYYY-MM-DDTHH:mm:ssZ&#x60;) indicating the time the given Link Delivery Session was created at
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "Timestamp in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (`YYYY-MM-DDTHH:mm:ssZ`) indicating the time the given Link Delivery Session was created at")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public LinkDeliveryGetResponse publicTokens(List<String> publicTokens) {
    
    this.publicTokens = publicTokens;
    return this;
  }

  public LinkDeliveryGetResponse addPublicTokensItem(String publicTokensItem) {
    if (this.publicTokens == null) {
      this.publicTokens = new ArrayList<>();
    }
    this.publicTokens.add(publicTokensItem);
    return this;
  }

   /**
   * The public tokens returned by the Link session upon completion
   * @return publicTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The public tokens returned by the Link session upon completion")

  public List<String> getPublicTokens() {
    return publicTokens;
  }


  public void setPublicTokens(List<String> publicTokens) {
    this.publicTokens = publicTokens;
  }


  public LinkDeliveryGetResponse completedAt(OffsetDateTime completedAt) {
    
    this.completedAt = completedAt;
    return this;
  }

   /**
   * Timestamp in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (&#x60;YYYY-MM-DDTHH:mm:ssZ&#x60;) indicating the time the given Link Delivery Session was completed at
   * @return completedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (`YYYY-MM-DDTHH:mm:ssZ`) indicating the time the given Link Delivery Session was completed at")

  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }


  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }


  public LinkDeliveryGetResponse requestId(String requestId) {
    
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
    LinkDeliveryGetResponse linkDeliveryGetResponse = (LinkDeliveryGetResponse) o;
    return Objects.equals(this.status, linkDeliveryGetResponse.status) &&
        Objects.equals(this.createdAt, linkDeliveryGetResponse.createdAt) &&
        Objects.equals(this.publicTokens, linkDeliveryGetResponse.publicTokens) &&
        Objects.equals(this.completedAt, linkDeliveryGetResponse.completedAt) &&
        Objects.equals(this.requestId, linkDeliveryGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, createdAt, publicTokens, completedAt, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkDeliveryGetResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    publicTokens: ").append(toIndentedString(publicTokens)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
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

