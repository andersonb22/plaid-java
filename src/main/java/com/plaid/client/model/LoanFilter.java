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
import com.plaid.client.model.LoanAccountSubtype;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A filter to apply to &#x60;loan&#x60;-type accounts
 */
@ApiModel(description = "A filter to apply to `loan`-type accounts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-20T20:08:02.399975Z[Etc/UTC]")
public class LoanFilter {
  public static final String SERIALIZED_NAME_ACCOUNT_SUBTYPES = "account_subtypes";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SUBTYPES)
  private List<LoanAccountSubtype> accountSubtypes = new ArrayList<>();


  public LoanFilter accountSubtypes(List<LoanAccountSubtype> accountSubtypes) {
    
    this.accountSubtypes = accountSubtypes;
    return this;
  }

  public LoanFilter addAccountSubtypesItem(LoanAccountSubtype accountSubtypesItem) {
    this.accountSubtypes.add(accountSubtypesItem);
    return this;
  }

   /**
   * An array of account subtypes to display in Link. If not specified, all account subtypes will be shown. For a full list of valid types and subtypes, see the [Account schema](https://plaid.com/docs/api/accounts#account-type-schema). 
   * @return accountSubtypes
  **/
  @ApiModelProperty(required = true, value = "An array of account subtypes to display in Link. If not specified, all account subtypes will be shown. For a full list of valid types and subtypes, see the [Account schema](https://plaid.com/docs/api/accounts#account-type-schema). ")

  public List<LoanAccountSubtype> getAccountSubtypes() {
    return accountSubtypes;
  }


  public void setAccountSubtypes(List<LoanAccountSubtype> accountSubtypes) {
    this.accountSubtypes = accountSubtypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanFilter loanFilter = (LoanFilter) o;
    return Objects.equals(this.accountSubtypes, loanFilter.accountSubtypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSubtypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanFilter {\n");
    sb.append("    accountSubtypes: ").append(toIndentedString(accountSubtypes)).append("\n");
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

