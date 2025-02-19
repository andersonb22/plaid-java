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
import com.plaid.client.model.LinkDeliveryDeliveryMethod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LinkDeliveryCreateRequest defines the request schema for &#x60;/link_delivery/create&#x60;
 */
@ApiModel(description = "LinkDeliveryCreateRequest defines the request schema for `/link_delivery/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-20T20:43:44.520784Z[Etc/UTC]")
public class LinkDeliveryCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_LINK_TOKEN = "link_token";
  @SerializedName(SERIALIZED_NAME_LINK_TOKEN)
  private String linkToken;

  public static final String SERIALIZED_NAME_DELIVERY_METHOD = "delivery_method";
  @SerializedName(SERIALIZED_NAME_DELIVERY_METHOD)
  private LinkDeliveryDeliveryMethod deliveryMethod;

  public static final String SERIALIZED_NAME_DELIVERY_DESTINATION = "delivery_destination";
  @SerializedName(SERIALIZED_NAME_DELIVERY_DESTINATION)
  private String deliveryDestination;


  public LinkDeliveryCreateRequest clientId(String clientId) {
    
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


  public LinkDeliveryCreateRequest secret(String secret) {
    
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


  public LinkDeliveryCreateRequest linkToken(String linkToken) {
    
    this.linkToken = linkToken;
    return this;
  }

   /**
   * A &#x60;link_token&#x60; from a previous invocation of &#x60;/link/token/create&#x60; with Link Delivery enabled
   * @return linkToken
  **/
  @ApiModelProperty(required = true, value = "A `link_token` from a previous invocation of `/link/token/create` with Link Delivery enabled")

  public String getLinkToken() {
    return linkToken;
  }


  public void setLinkToken(String linkToken) {
    this.linkToken = linkToken;
  }


  public LinkDeliveryCreateRequest deliveryMethod(LinkDeliveryDeliveryMethod deliveryMethod) {
    
    this.deliveryMethod = deliveryMethod;
    return this;
  }

   /**
   * Get deliveryMethod
   * @return deliveryMethod
  **/
  @ApiModelProperty(required = true, value = "")

  public LinkDeliveryDeliveryMethod getDeliveryMethod() {
    return deliveryMethod;
  }


  public void setDeliveryMethod(LinkDeliveryDeliveryMethod deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }


  public LinkDeliveryCreateRequest deliveryDestination(String deliveryDestination) {
    
    this.deliveryDestination = deliveryDestination;
    return this;
  }

   /**
   * The email or phone number to be used to delivery the URL of the Link Delivery session
   * @return deliveryDestination
  **/
  @ApiModelProperty(required = true, value = "The email or phone number to be used to delivery the URL of the Link Delivery session")

  public String getDeliveryDestination() {
    return deliveryDestination;
  }


  public void setDeliveryDestination(String deliveryDestination) {
    this.deliveryDestination = deliveryDestination;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkDeliveryCreateRequest linkDeliveryCreateRequest = (LinkDeliveryCreateRequest) o;
    return Objects.equals(this.clientId, linkDeliveryCreateRequest.clientId) &&
        Objects.equals(this.secret, linkDeliveryCreateRequest.secret) &&
        Objects.equals(this.linkToken, linkDeliveryCreateRequest.linkToken) &&
        Objects.equals(this.deliveryMethod, linkDeliveryCreateRequest.deliveryMethod) &&
        Objects.equals(this.deliveryDestination, linkDeliveryCreateRequest.deliveryDestination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, linkToken, deliveryMethod, deliveryDestination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkDeliveryCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    linkToken: ").append(toIndentedString(linkToken)).append("\n");
    sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
    sb.append("    deliveryDestination: ").append(toIndentedString(deliveryDestination)).append("\n");
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

