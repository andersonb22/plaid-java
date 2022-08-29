/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.170.0
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
import com.plaid.client.model.UserStatedIncomeSourceCategory;
import com.plaid.client.model.UserStatedIncomeSourceFrequency;
import com.plaid.client.model.UserStatedIncomeSourcePayType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Specifies user stated income sources for the Income product
 */
@ApiModel(description = "Specifies user stated income sources for the Income product")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T18:41:42.227025Z[Etc/UTC]")
public class LinkTokenCreateRequestUserStatedIncomeSource {
  public static final String SERIALIZED_NAME_EMPLOYER = "employer";
  @SerializedName(SERIALIZED_NAME_EMPLOYER)
  private String employer;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private UserStatedIncomeSourceCategory category;

  public static final String SERIALIZED_NAME_PAY_PER_CYCLE = "pay_per_cycle";
  @SerializedName(SERIALIZED_NAME_PAY_PER_CYCLE)
  private Double payPerCycle;

  public static final String SERIALIZED_NAME_PAY_ANNUAL = "pay_annual";
  @SerializedName(SERIALIZED_NAME_PAY_ANNUAL)
  private Double payAnnual;

  public static final String SERIALIZED_NAME_PAY_TYPE = "pay_type";
  @SerializedName(SERIALIZED_NAME_PAY_TYPE)
  private UserStatedIncomeSourcePayType payType;

  public static final String SERIALIZED_NAME_PAY_FREQUENCY = "pay_frequency";
  @SerializedName(SERIALIZED_NAME_PAY_FREQUENCY)
  private UserStatedIncomeSourceFrequency payFrequency;


  public LinkTokenCreateRequestUserStatedIncomeSource employer(String employer) {
    
    this.employer = employer;
    return this;
  }

   /**
   * The employer corresponding to an income source specified by the user
   * @return employer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The employer corresponding to an income source specified by the user")

  public String getEmployer() {
    return employer;
  }


  public void setEmployer(String employer) {
    this.employer = employer;
  }


  public LinkTokenCreateRequestUserStatedIncomeSource category(UserStatedIncomeSourceCategory category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserStatedIncomeSourceCategory getCategory() {
    return category;
  }


  public void setCategory(UserStatedIncomeSourceCategory category) {
    this.category = category;
  }


  public LinkTokenCreateRequestUserStatedIncomeSource payPerCycle(Double payPerCycle) {
    
    this.payPerCycle = payPerCycle;
    return this;
  }

   /**
   * The income amount paid per cycle for a specified income source
   * @return payPerCycle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The income amount paid per cycle for a specified income source")

  public Double getPayPerCycle() {
    return payPerCycle;
  }


  public void setPayPerCycle(Double payPerCycle) {
    this.payPerCycle = payPerCycle;
  }


  public LinkTokenCreateRequestUserStatedIncomeSource payAnnual(Double payAnnual) {
    
    this.payAnnual = payAnnual;
    return this;
  }

   /**
   * The income amount paid annually for a specified income source
   * @return payAnnual
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The income amount paid annually for a specified income source")

  public Double getPayAnnual() {
    return payAnnual;
  }


  public void setPayAnnual(Double payAnnual) {
    this.payAnnual = payAnnual;
  }


  public LinkTokenCreateRequestUserStatedIncomeSource payType(UserStatedIncomeSourcePayType payType) {
    
    this.payType = payType;
    return this;
  }

   /**
   * Get payType
   * @return payType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserStatedIncomeSourcePayType getPayType() {
    return payType;
  }


  public void setPayType(UserStatedIncomeSourcePayType payType) {
    this.payType = payType;
  }


  public LinkTokenCreateRequestUserStatedIncomeSource payFrequency(UserStatedIncomeSourceFrequency payFrequency) {
    
    this.payFrequency = payFrequency;
    return this;
  }

   /**
   * Get payFrequency
   * @return payFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserStatedIncomeSourceFrequency getPayFrequency() {
    return payFrequency;
  }


  public void setPayFrequency(UserStatedIncomeSourceFrequency payFrequency) {
    this.payFrequency = payFrequency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateRequestUserStatedIncomeSource linkTokenCreateRequestUserStatedIncomeSource = (LinkTokenCreateRequestUserStatedIncomeSource) o;
    return Objects.equals(this.employer, linkTokenCreateRequestUserStatedIncomeSource.employer) &&
        Objects.equals(this.category, linkTokenCreateRequestUserStatedIncomeSource.category) &&
        Objects.equals(this.payPerCycle, linkTokenCreateRequestUserStatedIncomeSource.payPerCycle) &&
        Objects.equals(this.payAnnual, linkTokenCreateRequestUserStatedIncomeSource.payAnnual) &&
        Objects.equals(this.payType, linkTokenCreateRequestUserStatedIncomeSource.payType) &&
        Objects.equals(this.payFrequency, linkTokenCreateRequestUserStatedIncomeSource.payFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employer, category, payPerCycle, payAnnual, payType, payFrequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateRequestUserStatedIncomeSource {\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    payPerCycle: ").append(toIndentedString(payPerCycle)).append("\n");
    sb.append("    payAnnual: ").append(toIndentedString(payAnnual)).append("\n");
    sb.append("    payType: ").append(toIndentedString(payType)).append("\n");
    sb.append("    payFrequency: ").append(toIndentedString(payFrequency)).append("\n");
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

