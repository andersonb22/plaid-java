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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * No documentation available
 */
@ApiModel(description = "No documentation available")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-20T20:08:02.399975Z[Etc/UTC]")
public class AssetOwner {
  public static final String SERIALIZED_NAME_ASSET_OWNER_TEXT = "AssetOwnerText";
  @SerializedName(SERIALIZED_NAME_ASSET_OWNER_TEXT)
  private String assetOwnerText;


  public AssetOwner assetOwnerText(String assetOwnerText) {
    
    this.assetOwnerText = assetOwnerText;
    return this;
  }

   /**
   * Account Owner Full Name.
   * @return assetOwnerText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Account Owner Full Name.")

  public String getAssetOwnerText() {
    return assetOwnerText;
  }


  public void setAssetOwnerText(String assetOwnerText) {
    this.assetOwnerText = assetOwnerText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetOwner assetOwner = (AssetOwner) o;
    return Objects.equals(this.assetOwnerText, assetOwner.assetOwnerText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetOwnerText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetOwner {\n");
    sb.append("    assetOwnerText: ").append(toIndentedString(assetOwnerText)).append("\n");
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

