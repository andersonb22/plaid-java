/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.44.0
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
 * An identifier classifying the transaction type.  This field is only populated for European institutions. For institutions in the US and Canada, this field is set to &#x60;null&#x60;.  &#x60;adjustment:&#x60; Bank adjustment  &#x60;atm:&#x60; Cash deposit or withdrawal via an automated teller machine  &#x60;bank charge:&#x60; Charge or fee levied by the institution  &#x60;bill payment&#x60;: Payment of a bill  &#x60;cash:&#x60; Cash deposit or withdrawal  &#x60;cashback:&#x60; Cash withdrawal while making a debit card purchase  &#x60;cheque:&#x60; Document ordering the payment of money to another person or organization  &#x60;direct debit:&#x60; Automatic withdrawal of funds initiated by a third party at a regular interval  &#x60;interest:&#x60; Interest earned or incurred  &#x60;purchase:&#x60; Purchase made with a debit or credit card  &#x60;standing order:&#x60; Payment instructed by the account holder to a third party at a regular interval  &#x60;transfer:&#x60; Transfer of money between accounts
 */
@JsonAdapter(TransactionCode.Adapter.class)
public enum TransactionCode {
  
  ADJUSTMENT("adjustment"),
  
  ATM("atm"),
  
  BANK_CHARGE("bank charge"),
  
  BILL_PAYMENT("bill payment"),
  
  CASH("cash"),
  
  CASHBACK("cashback"),
  
  CHEQUE("cheque"),
  
  DIRECT_DEBIT("direct debit"),
  
  INTEREST("interest"),
  
  PURCHASE("purchase"),
  
  STANDING_ORDER("standing order"),
  
  TRANSFER("transfer"),
  
  NULL("null"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TransactionCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransactionCode fromValue(String value) {
    for (TransactionCode b : TransactionCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<TransactionCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransactionCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransactionCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransactionCode.fromValue(value);
    }
  }
}

