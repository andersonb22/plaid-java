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
import com.plaid.client.model.ScopesNullable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Describes the connected application for a particular end user.
 */
@ApiModel(description = "Describes the connected application for a particular end user.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T18:41:42.227025Z[Etc/UTC]")
public class ConnectedApplication {
  public static final String SERIALIZED_NAME_APPLICATION_ID = "application_id";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private String applicationId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_LOGO_URL = "logo_url";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_APPLICATION_URL = "application_url";
  @SerializedName(SERIALIZED_NAME_APPLICATION_URL)
  private String applicationUrl;

  public static final String SERIALIZED_NAME_REASON_FOR_ACCESS = "reason_for_access";
  @SerializedName(SERIALIZED_NAME_REASON_FOR_ACCESS)
  private String reasonForAccess;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private LocalDate createdAt;

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  private ScopesNullable scopes;


  public ConnectedApplication applicationId(String applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * This field will map to the application ID that is returned from /item/applications/list, or provided to the institution in an oauth redirect.
   * @return applicationId
  **/
  @ApiModelProperty(required = true, value = "This field will map to the application ID that is returned from /item/applications/list, or provided to the institution in an oauth redirect.")

  public String getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  public ConnectedApplication name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the application
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the application")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ConnectedApplication displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * A human-readable name of the application for display purposes
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human-readable name of the application for display purposes")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public ConnectedApplication logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * A URL that links to the application logo image.
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A URL that links to the application logo image.")

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public ConnectedApplication applicationUrl(String applicationUrl) {
    
    this.applicationUrl = applicationUrl;
    return this;
  }

   /**
   * The URL for the application&#39;s website
   * @return applicationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL for the application's website")

  public String getApplicationUrl() {
    return applicationUrl;
  }


  public void setApplicationUrl(String applicationUrl) {
    this.applicationUrl = applicationUrl;
  }


  public ConnectedApplication reasonForAccess(String reasonForAccess) {
    
    this.reasonForAccess = reasonForAccess;
    return this;
  }

   /**
   * A string provided by the connected app stating why they use their respective enabled products.
   * @return reasonForAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string provided by the connected app stating why they use their respective enabled products.")

  public String getReasonForAccess() {
    return reasonForAccess;
  }


  public void setReasonForAccess(String reasonForAccess) {
    this.reasonForAccess = reasonForAccess;
  }


  public ConnectedApplication createdAt(LocalDate createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date this application was linked in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format in UTC.
   * @return createdAt
  **/
  @ApiModelProperty(example = "Wed Jan 01 00:00:00 UTC 2020", required = true, value = "The date this application was linked in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format in UTC.")

  public LocalDate getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }


  public ConnectedApplication scopes(ScopesNullable scopes) {
    
    this.scopes = scopes;
    return this;
  }

   /**
   * Get scopes
   * @return scopes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScopesNullable getScopes() {
    return scopes;
  }


  public void setScopes(ScopesNullable scopes) {
    this.scopes = scopes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectedApplication connectedApplication = (ConnectedApplication) o;
    return Objects.equals(this.applicationId, connectedApplication.applicationId) &&
        Objects.equals(this.name, connectedApplication.name) &&
        Objects.equals(this.displayName, connectedApplication.displayName) &&
        Objects.equals(this.logoUrl, connectedApplication.logoUrl) &&
        Objects.equals(this.applicationUrl, connectedApplication.applicationUrl) &&
        Objects.equals(this.reasonForAccess, connectedApplication.reasonForAccess) &&
        Objects.equals(this.createdAt, connectedApplication.createdAt) &&
        Objects.equals(this.scopes, connectedApplication.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, name, displayName, logoUrl, applicationUrl, reasonForAccess, createdAt, scopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectedApplication {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    applicationUrl: ").append(toIndentedString(applicationUrl)).append("\n");
    sb.append("    reasonForAccess: ").append(toIndentedString(reasonForAccess)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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

