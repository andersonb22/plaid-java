/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.115.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The status of the refund.  &#x60;PROCESSING&#x60;: The refund is currently being processed. The refund will automatically exit this state when processing is complete.  &#x60;INITIATED&#x60;: The refund has been successfully initiated.  &#x60;EXECUTED&#x60;: Indicates that the refund has been successfully executed.  &#x60;FAILED&#x60;: The refund has failed to be executed. This error is retryable once the root cause is resolved.
 */
@JsonAdapter(PaymentInitiationRefundStatus.Adapter.class)
public enum PaymentInitiationRefundStatus {
  
  PROCESSING("PROCESSING"),
  
  EXECUTED("EXECUTED"),
  
  INITIATED("INITIATED"),
  
  FAILED("FAILED"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  PaymentInitiationRefundStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentInitiationRefundStatus fromValue(String value) {
    for (PaymentInitiationRefundStatus b : PaymentInitiationRefundStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return PaymentInitiationRefundStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<PaymentInitiationRefundStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentInitiationRefundStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaymentInitiationRefundStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentInitiationRefundStatus.fromValue(value);
    }
  }
}

