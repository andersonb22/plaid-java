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
import com.plaid.client.model.IdentityUpdateTypes;
import com.plaid.client.model.PlaidError;
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Fired when a change to identity data has been detected on an Item.
 */
@ApiModel(description = "Fired when a change to identity data has been detected on an Item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-20T20:43:44.520784Z[Etc/UTC]")
public class IdentityDefaultUpdateWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_ACCOUNT_IDS_WITH_UPDATED_IDENTITY = "account_ids_with_updated_identity";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDS_WITH_UPDATED_IDENTITY)
  private Map<String, List<IdentityUpdateTypes>> accountIdsWithUpdatedIdentity = new HashMap<>();

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private PlaidError error;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public IdentityDefaultUpdateWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;IDENTITY&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`IDENTITY`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public IdentityDefaultUpdateWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;DEFAULT_UPDATE&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`DEFAULT_UPDATE`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public IdentityDefaultUpdateWebhook itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "The `item_id` of the Item associated with this webhook, warning, or error")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public IdentityDefaultUpdateWebhook accountIdsWithUpdatedIdentity(Map<String, List<IdentityUpdateTypes>> accountIdsWithUpdatedIdentity) {
    
    this.accountIdsWithUpdatedIdentity = accountIdsWithUpdatedIdentity;
    return this;
  }

  public IdentityDefaultUpdateWebhook putAccountIdsWithUpdatedIdentityItem(String key, List<IdentityUpdateTypes> accountIdsWithUpdatedIdentityItem) {
    this.accountIdsWithUpdatedIdentity.put(key, accountIdsWithUpdatedIdentityItem);
    return this;
  }

   /**
   * An object with keys of &#x60;account_id&#x60;&#39;s that are mapped to their respective identity attributes that changed.  Example: &#x60;{ \&quot;XMBvvyMGQ1UoLbKByoMqH3nXMj84ALSdE5B58\&quot;: [\&quot;PHONES\&quot;] }&#x60; 
   * @return accountIdsWithUpdatedIdentity
  **/
  @ApiModelProperty(required = true, value = "An object with keys of `account_id`'s that are mapped to their respective identity attributes that changed.  Example: `{ \"XMBvvyMGQ1UoLbKByoMqH3nXMj84ALSdE5B58\": [\"PHONES\"] }` ")

  public Map<String, List<IdentityUpdateTypes>> getAccountIdsWithUpdatedIdentity() {
    return accountIdsWithUpdatedIdentity;
  }


  public void setAccountIdsWithUpdatedIdentity(Map<String, List<IdentityUpdateTypes>> accountIdsWithUpdatedIdentity) {
    this.accountIdsWithUpdatedIdentity = accountIdsWithUpdatedIdentity;
  }


  public IdentityDefaultUpdateWebhook error(PlaidError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public PlaidError getError() {
    return error;
  }


  public void setError(PlaidError error) {
    this.error = error;
  }


  public IdentityDefaultUpdateWebhook environment(WebhookEnvironmentValues environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(required = true, value = "")

  public WebhookEnvironmentValues getEnvironment() {
    return environment;
  }


  public void setEnvironment(WebhookEnvironmentValues environment) {
    this.environment = environment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityDefaultUpdateWebhook identityDefaultUpdateWebhook = (IdentityDefaultUpdateWebhook) o;
    return Objects.equals(this.webhookType, identityDefaultUpdateWebhook.webhookType) &&
        Objects.equals(this.webhookCode, identityDefaultUpdateWebhook.webhookCode) &&
        Objects.equals(this.itemId, identityDefaultUpdateWebhook.itemId) &&
        Objects.equals(this.accountIdsWithUpdatedIdentity, identityDefaultUpdateWebhook.accountIdsWithUpdatedIdentity) &&
        Objects.equals(this.error, identityDefaultUpdateWebhook.error) &&
        Objects.equals(this.environment, identityDefaultUpdateWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, itemId, accountIdsWithUpdatedIdentity, error, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityDefaultUpdateWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    accountIdsWithUpdatedIdentity: ").append(toIndentedString(accountIdsWithUpdatedIdentity)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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

