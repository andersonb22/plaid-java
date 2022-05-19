/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.115.2
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
 * AssetReportRelayCreateRequest defines the request schema for &#x60;/asset_report/relay/create&#x60;
 */
@ApiModel(description = "AssetReportRelayCreateRequest defines the request schema for `/asset_report/relay/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T05:25:50.453080Z[Etc/UTC]")
public class AssetReportRelayCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_ASSET_REPORT_TOKEN = "asset_report_token";
  @SerializedName(SERIALIZED_NAME_ASSET_REPORT_TOKEN)
  private String assetReportToken;

  public static final String SERIALIZED_NAME_SECONDARY_CLIENT_ID = "secondary_client_id";
  @SerializedName(SERIALIZED_NAME_SECONDARY_CLIENT_ID)
  private String secondaryClientId;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private String webhook;


  public AssetReportRelayCreateRequest clientId(String clientId) {
    
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


  public AssetReportRelayCreateRequest secret(String secret) {
    
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


  public AssetReportRelayCreateRequest assetReportToken(String assetReportToken) {
    
    this.assetReportToken = assetReportToken;
    return this;
  }

   /**
   * A token that can be provided to endpoints such as &#x60;/asset_report/get&#x60; or &#x60;/asset_report/pdf/get&#x60; to fetch or update an Asset Report.
   * @return assetReportToken
  **/
  @ApiModelProperty(required = true, value = "A token that can be provided to endpoints such as `/asset_report/get` or `/asset_report/pdf/get` to fetch or update an Asset Report.")

  public String getAssetReportToken() {
    return assetReportToken;
  }


  public void setAssetReportToken(String assetReportToken) {
    this.assetReportToken = assetReportToken;
  }


  public AssetReportRelayCreateRequest secondaryClientId(String secondaryClientId) {
    
    this.secondaryClientId = secondaryClientId;
    return this;
  }

   /**
   * The &#x60;secondary_client_id&#x60; is the client id of the third party with whom you would like to share the Asset Report.
   * @return secondaryClientId
  **/
  @ApiModelProperty(required = true, value = "The `secondary_client_id` is the client id of the third party with whom you would like to share the Asset Report.")

  public String getSecondaryClientId() {
    return secondaryClientId;
  }


  public void setSecondaryClientId(String secondaryClientId) {
    this.secondaryClientId = secondaryClientId;
  }


  public AssetReportRelayCreateRequest webhook(String webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * URL to which Plaid will send webhooks when the Secondary Client successfully retrieves an Asset Report by calling &#x60;asset_report/relay/get&#x60;.
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to which Plaid will send webhooks when the Secondary Client successfully retrieves an Asset Report by calling `asset_report/relay/get`.")

  public String getWebhook() {
    return webhook;
  }


  public void setWebhook(String webhook) {
    this.webhook = webhook;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReportRelayCreateRequest assetReportRelayCreateRequest = (AssetReportRelayCreateRequest) o;
    return Objects.equals(this.clientId, assetReportRelayCreateRequest.clientId) &&
        Objects.equals(this.secret, assetReportRelayCreateRequest.secret) &&
        Objects.equals(this.assetReportToken, assetReportRelayCreateRequest.assetReportToken) &&
        Objects.equals(this.secondaryClientId, assetReportRelayCreateRequest.secondaryClientId) &&
        Objects.equals(this.webhook, assetReportRelayCreateRequest.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, assetReportToken, secondaryClientId, webhook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReportRelayCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    assetReportToken: ").append(toIndentedString(assetReportToken)).append("\n");
    sb.append("    secondaryClientId: ").append(toIndentedString(secondaryClientId)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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

