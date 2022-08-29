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
import com.plaid.client.model.PartyRoleType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * No documentation available
 */
@ApiModel(description = "No documentation available")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T19:15:24.024104Z[Etc/UTC]")
public class RoleDetail {
  public static final String SERIALIZED_NAME_PARTY_ROLE_TYPE = "PartyRoleType";
  @SerializedName(SERIALIZED_NAME_PARTY_ROLE_TYPE)
  private PartyRoleType partyRoleType;


  public RoleDetail partyRoleType(PartyRoleType partyRoleType) {
    
    this.partyRoleType = partyRoleType;
    return this;
  }

   /**
   * Get partyRoleType
   * @return partyRoleType
  **/
  @ApiModelProperty(required = true, value = "")

  public PartyRoleType getPartyRoleType() {
    return partyRoleType;
  }


  public void setPartyRoleType(PartyRoleType partyRoleType) {
    this.partyRoleType = partyRoleType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleDetail roleDetail = (RoleDetail) o;
    return Objects.equals(this.partyRoleType, roleDetail.partyRoleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyRoleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleDetail {\n");
    sb.append("    partyRoleType: ").append(toIndentedString(partyRoleType)).append("\n");
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

