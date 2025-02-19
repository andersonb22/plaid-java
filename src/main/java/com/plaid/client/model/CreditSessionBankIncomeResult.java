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
import com.plaid.client.model.CreditSessionBankIncomeStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The details of a bank income verification in link
 */
@ApiModel(description = "The details of a bank income verification in link")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-20T20:43:44.520784Z[Etc/UTC]")
public class CreditSessionBankIncomeResult {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private CreditSessionBankIncomeStatus status;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;


  public CreditSessionBankIncomeResult status(CreditSessionBankIncomeStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreditSessionBankIncomeStatus getStatus() {
    return status;
  }


  public void setStatus(CreditSessionBankIncomeStatus status) {
    this.status = status;
  }


  public CreditSessionBankIncomeResult itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public CreditSessionBankIncomeResult institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * Get institutionId
   * @return institutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditSessionBankIncomeResult creditSessionBankIncomeResult = (CreditSessionBankIncomeResult) o;
    return Objects.equals(this.status, creditSessionBankIncomeResult.status) &&
        Objects.equals(this.itemId, creditSessionBankIncomeResult.itemId) &&
        Objects.equals(this.institutionId, creditSessionBankIncomeResult.institutionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, itemId, institutionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditSessionBankIncomeResult {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
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

