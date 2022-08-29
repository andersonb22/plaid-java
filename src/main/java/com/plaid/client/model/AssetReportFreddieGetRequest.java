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
 * AssetReportFreddieGetResponse defines the request schema for &#x60;credit/asset_report/freddie_mac/get&#x60;
 */
@ApiModel(description = "AssetReportFreddieGetResponse defines the request schema for `credit/asset_report/freddie_mac/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T19:15:24.024104Z[Etc/UTC]")
public class AssetReportFreddieGetRequest {
  public static final String SERIALIZED_NAME_AUDIT_COPY_TOKEN = "audit_copy_token";
  @SerializedName(SERIALIZED_NAME_AUDIT_COPY_TOKEN)
  private String auditCopyToken;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_REPORT_IDENTIFIER = "report_identifier";
  @SerializedName(SERIALIZED_NAME_REPORT_IDENTIFIER)
  private String reportIdentifier;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_VENDOR_IDENTIFIER = "vendor_identifier";
  @SerializedName(SERIALIZED_NAME_VENDOR_IDENTIFIER)
  private String vendorIdentifier;


  public AssetReportFreddieGetRequest auditCopyToken(String auditCopyToken) {
    
    this.auditCopyToken = auditCopyToken;
    return this;
  }

   /**
   * A token that can be shared with a third party auditor to allow them to obtain access to the Asset Report. This token should be stored securely.
   * @return auditCopyToken
  **/
  @ApiModelProperty(required = true, value = "A token that can be shared with a third party auditor to allow them to obtain access to the Asset Report. This token should be stored securely.")

  public String getAuditCopyToken() {
    return auditCopyToken;
  }


  public void setAuditCopyToken(String auditCopyToken) {
    this.auditCopyToken = auditCopyToken;
  }


  public AssetReportFreddieGetRequest clientId(String clientId) {
    
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


  public AssetReportFreddieGetRequest reportIdentifier(String reportIdentifier) {
    
    this.reportIdentifier = reportIdentifier;
    return this;
  }

   /**
   * A string ID provided by Freddie Mac which will be added to the Asset Report to help them identify the report (PLAD_.*)
   * @return reportIdentifier
  **/
  @ApiModelProperty(required = true, value = "A string ID provided by Freddie Mac which will be added to the Asset Report to help them identify the report (PLAD_.*)")

  public String getReportIdentifier() {
    return reportIdentifier;
  }


  public void setReportIdentifier(String reportIdentifier) {
    this.reportIdentifier = reportIdentifier;
  }


  public AssetReportFreddieGetRequest secret(String secret) {
    
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


  public AssetReportFreddieGetRequest vendorIdentifier(String vendorIdentifier) {
    
    this.vendorIdentifier = vendorIdentifier;
    return this;
  }

   /**
   * A string ID provided by Freddie Mac which will be added to the Asset Report with Plaid&#39;s vendor ID. Will always be \&quot;PLAD\&quot;
   * @return vendorIdentifier
  **/
  @ApiModelProperty(required = true, value = "A string ID provided by Freddie Mac which will be added to the Asset Report with Plaid's vendor ID. Will always be \"PLAD\"")

  public String getVendorIdentifier() {
    return vendorIdentifier;
  }


  public void setVendorIdentifier(String vendorIdentifier) {
    this.vendorIdentifier = vendorIdentifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReportFreddieGetRequest assetReportFreddieGetRequest = (AssetReportFreddieGetRequest) o;
    return Objects.equals(this.auditCopyToken, assetReportFreddieGetRequest.auditCopyToken) &&
        Objects.equals(this.clientId, assetReportFreddieGetRequest.clientId) &&
        Objects.equals(this.reportIdentifier, assetReportFreddieGetRequest.reportIdentifier) &&
        Objects.equals(this.secret, assetReportFreddieGetRequest.secret) &&
        Objects.equals(this.vendorIdentifier, assetReportFreddieGetRequest.vendorIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditCopyToken, clientId, reportIdentifier, secret, vendorIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReportFreddieGetRequest {\n");
    sb.append("    auditCopyToken: ").append(toIndentedString(auditCopyToken)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    reportIdentifier: ").append(toIndentedString(reportIdentifier)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    vendorIdentifier: ").append(toIndentedString(vendorIdentifier)).append("\n");
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

