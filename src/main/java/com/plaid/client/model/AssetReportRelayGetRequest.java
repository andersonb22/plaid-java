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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AssetReportRelayGetRequest defines the request schema for &#x60;/asset_report/relay/get&#x60;
 */
@ApiModel(description = "AssetReportRelayGetRequest defines the request schema for `/asset_report/relay/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T18:41:42.227025Z[Etc/UTC]")
public class AssetReportRelayGetRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_ASSET_RELAY_TOKEN = "asset_relay_token";
  @SerializedName(SERIALIZED_NAME_ASSET_RELAY_TOKEN)
  private String assetRelayToken;


  public AssetReportRelayGetRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public AssetReportRelayGetRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public AssetReportRelayGetRequest assetRelayToken(String assetRelayToken) {
    
    this.assetRelayToken = assetRelayToken;
    return this;
  }

   /**
   * The &#x60;asset_relay_token&#x60; granting access to the Asset Report you would like to get.
   * @return assetRelayToken
  **/
  @ApiModelProperty(required = true, value = "The `asset_relay_token` granting access to the Asset Report you would like to get.")

  public String getAssetRelayToken() {
    return assetRelayToken;
  }


  public void setAssetRelayToken(String assetRelayToken) {
    this.assetRelayToken = assetRelayToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReportRelayGetRequest assetReportRelayGetRequest = (AssetReportRelayGetRequest) o;
    return Objects.equals(this.clientId, assetReportRelayGetRequest.clientId) &&
        Objects.equals(this.secret, assetReportRelayGetRequest.secret) &&
        Objects.equals(this.assetRelayToken, assetReportRelayGetRequest.assetRelayToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, assetRelayToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReportRelayGetRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    assetRelayToken: ").append(toIndentedString(assetRelayToken)).append("\n");
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

