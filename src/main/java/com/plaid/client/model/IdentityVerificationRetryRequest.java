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
import com.plaid.client.model.IdentityVerificationRetryRequestStepsObject;
import com.plaid.client.model.Strategy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request input for retrying an identity verification attempt
 */
@ApiModel(description = "Request input for retrying an identity verification attempt")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T19:15:24.024104Z[Etc/UTC]")
public class IdentityVerificationRetryRequest {
  public static final String SERIALIZED_NAME_CLIENT_USER_ID = "client_user_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_USER_ID)
  private String clientUserId;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public static final String SERIALIZED_NAME_STRATEGY = "strategy";
  @SerializedName(SERIALIZED_NAME_STRATEGY)
  private Strategy strategy;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private IdentityVerificationRetryRequestStepsObject steps;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;


  public IdentityVerificationRetryRequest clientUserId(String clientUserId) {
    
    this.clientUserId = clientUserId;
    return this;
  }

   /**
   * An identifier to help you connect this object to your internal systems. For example, your database ID corresponding to this object.
   * @return clientUserId
  **/
  @ApiModelProperty(example = "your-db-id-3b24110", required = true, value = "An identifier to help you connect this object to your internal systems. For example, your database ID corresponding to this object.")

  public String getClientUserId() {
    return clientUserId;
  }


  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }


  public IdentityVerificationRetryRequest templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * ID of the associated Identity Verification template.
   * @return templateId
  **/
  @ApiModelProperty(example = "idvtmp_4FrXJvfQU3zGUR", required = true, value = "ID of the associated Identity Verification template.")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public IdentityVerificationRetryRequest strategy(Strategy strategy) {
    
    this.strategy = strategy;
    return this;
  }

   /**
   * Get strategy
   * @return strategy
  **/
  @ApiModelProperty(required = true, value = "")

  public Strategy getStrategy() {
    return strategy;
  }


  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }


  public IdentityVerificationRetryRequest steps(IdentityVerificationRetryRequestStepsObject steps) {
    
    this.steps = steps;
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityVerificationRetryRequestStepsObject getSteps() {
    return steps;
  }


  public void setSteps(IdentityVerificationRetryRequestStepsObject steps) {
    this.steps = steps;
  }


  public IdentityVerificationRetryRequest clientId(String clientId) {
    
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


  public IdentityVerificationRetryRequest secret(String secret) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityVerificationRetryRequest identityVerificationRetryRequest = (IdentityVerificationRetryRequest) o;
    return Objects.equals(this.clientUserId, identityVerificationRetryRequest.clientUserId) &&
        Objects.equals(this.templateId, identityVerificationRetryRequest.templateId) &&
        Objects.equals(this.strategy, identityVerificationRetryRequest.strategy) &&
        Objects.equals(this.steps, identityVerificationRetryRequest.steps) &&
        Objects.equals(this.clientId, identityVerificationRetryRequest.clientId) &&
        Objects.equals(this.secret, identityVerificationRetryRequest.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientUserId, templateId, strategy, steps, clientId, secret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityVerificationRetryRequest {\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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

