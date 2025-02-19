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
import com.plaid.client.model.CreditSessionBankIncomeResult;
import com.plaid.client.model.CreditSessionItemAddResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The set of results for a link session
 */
@ApiModel(description = "The set of results for a link session")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-20T20:43:44.520784Z[Etc/UTC]")
public class CreditSessionResults {
  public static final String SERIALIZED_NAME_ITEM_ADD_RESULTS = "item_add_results";
  @SerializedName(SERIALIZED_NAME_ITEM_ADD_RESULTS)
  private List<CreditSessionItemAddResult> itemAddResults = null;

  public static final String SERIALIZED_NAME_BANK_INCOME_RESULTS = "bank_income_results";
  @SerializedName(SERIALIZED_NAME_BANK_INCOME_RESULTS)
  private List<CreditSessionBankIncomeResult> bankIncomeResults = null;


  public CreditSessionResults itemAddResults(List<CreditSessionItemAddResult> itemAddResults) {
    
    this.itemAddResults = itemAddResults;
    return this;
  }

  public CreditSessionResults addItemAddResultsItem(CreditSessionItemAddResult itemAddResultsItem) {
    if (this.itemAddResults == null) {
      this.itemAddResults = new ArrayList<>();
    }
    this.itemAddResults.add(itemAddResultsItem);
    return this;
  }

   /**
   * Get itemAddResults
   * @return itemAddResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CreditSessionItemAddResult> getItemAddResults() {
    return itemAddResults;
  }


  public void setItemAddResults(List<CreditSessionItemAddResult> itemAddResults) {
    this.itemAddResults = itemAddResults;
  }


  public CreditSessionResults bankIncomeResults(List<CreditSessionBankIncomeResult> bankIncomeResults) {
    
    this.bankIncomeResults = bankIncomeResults;
    return this;
  }

  public CreditSessionResults addBankIncomeResultsItem(CreditSessionBankIncomeResult bankIncomeResultsItem) {
    if (this.bankIncomeResults == null) {
      this.bankIncomeResults = new ArrayList<>();
    }
    this.bankIncomeResults.add(bankIncomeResultsItem);
    return this;
  }

   /**
   * Get bankIncomeResults
   * @return bankIncomeResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CreditSessionBankIncomeResult> getBankIncomeResults() {
    return bankIncomeResults;
  }


  public void setBankIncomeResults(List<CreditSessionBankIncomeResult> bankIncomeResults) {
    this.bankIncomeResults = bankIncomeResults;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditSessionResults creditSessionResults = (CreditSessionResults) o;
    return Objects.equals(this.itemAddResults, creditSessionResults.itemAddResults) &&
        Objects.equals(this.bankIncomeResults, creditSessionResults.bankIncomeResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemAddResults, bankIncomeResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditSessionResults {\n");
    sb.append("    itemAddResults: ").append(toIndentedString(itemAddResults)).append("\n");
    sb.append("    bankIncomeResults: ").append(toIndentedString(bankIncomeResults)).append("\n");
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

