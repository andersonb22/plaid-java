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
import com.plaid.client.model.Status;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A collection of STATUS containers.
 */
@ApiModel(description = "A collection of STATUS containers.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-20T20:08:02.399975Z[Etc/UTC]")
public class Statuses {
  public static final String SERIALIZED_NAME_S_T_A_T_U_S = "STATUS";
  @SerializedName(SERIALIZED_NAME_S_T_A_T_U_S)
  private Status STATUS;


  public Statuses STATUS(Status STATUS) {
    
    this.STATUS = STATUS;
    return this;
  }

   /**
   * Get STATUS
   * @return STATUS
  **/
  @ApiModelProperty(required = true, value = "")

  public Status getSTATUS() {
    return STATUS;
  }


  public void setSTATUS(Status STATUS) {
    this.STATUS = STATUS;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Statuses statuses = (Statuses) o;
    return Objects.equals(this.STATUS, statuses.STATUS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(STATUS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Statuses {\n");
    sb.append("    STATUS: ").append(toIndentedString(STATUS)).append("\n");
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

