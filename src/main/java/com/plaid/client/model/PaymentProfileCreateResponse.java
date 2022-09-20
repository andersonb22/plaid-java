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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentProfileCreateResponse defines the response schema for &#x60;/payment_profile/create&#x60;
 */
@ApiModel(description = "PaymentProfileCreateResponse defines the response schema for `/payment_profile/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-20T20:43:44.520784Z[Etc/UTC]")
public class PaymentProfileCreateResponse {
  public static final String SERIALIZED_NAME_PAYMENT_PROFILE_ID = "payment_profile_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_PROFILE_ID)
  private String paymentProfileId;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public PaymentProfileCreateResponse paymentProfileId(String paymentProfileId) {
    
    this.paymentProfileId = paymentProfileId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a payment profile.
   * @return paymentProfileId
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for a payment profile.")

  public String getPaymentProfileId() {
    return paymentProfileId;
  }


  public void setPaymentProfileId(String paymentProfileId) {
    this.paymentProfileId = paymentProfileId;
  }


  public PaymentProfileCreateResponse requestId(String requestId) {
    
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
    PaymentProfileCreateResponse paymentProfileCreateResponse = (PaymentProfileCreateResponse) o;
    return Objects.equals(this.paymentProfileId, paymentProfileCreateResponse.paymentProfileId) &&
        Objects.equals(this.requestId, paymentProfileCreateResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentProfileId, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProfileCreateResponse {\n");
    sb.append("    paymentProfileId: ").append(toIndentedString(paymentProfileId)).append("\n");
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

