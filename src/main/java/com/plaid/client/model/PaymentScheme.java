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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Payment scheme. If not specified - the default in the region will be used (e.g. &#x60;SEPA_CREDIT_TRANSFER&#x60; for EU). Using unsupported values will result in a failed payment.  &#x60;FASTER_PAYMENTS&#x60;: Enables payments to move quickly between UK bank accounts. Default value in the UK.  &#x60;SEPA_CREDIT_TRANSFER&#x60;: The standard payment to a beneficiary within the SEPA area.  &#x60;SEPA_CREDIT_TRANSFER_INSTANT&#x60;: Instant payment within the SEPA area. May involve additional fees and may not be available at some banks.
 */
@JsonAdapter(PaymentScheme.Adapter.class)
public enum PaymentScheme {
  
  NULL("null"),
  
  FASTER_PAYMENTS("FASTER_PAYMENTS"),
  
  SEPA_CREDIT_TRANSFER("SEPA_CREDIT_TRANSFER"),
  
  SEPA_CREDIT_TRANSFER_INSTANT("SEPA_CREDIT_TRANSFER_INSTANT"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  PaymentScheme(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentScheme fromValue(String value) {
    for (PaymentScheme b : PaymentScheme.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<PaymentScheme> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentScheme enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaymentScheme read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentScheme.fromValue(value);
    }
  }
}

