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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SandboxProcessorTokenCreateResponse defines the response schema for &#x60;/sandbox/processor_token/create&#x60;
 */
@ApiModel(description = "SandboxProcessorTokenCreateResponse defines the response schema for `/sandbox/processor_token/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-20T20:43:44.520784Z[Etc/UTC]")
public class SandboxProcessorTokenCreateResponse {
  public static final String SERIALIZED_NAME_PROCESSOR_TOKEN = "processor_token";
  @SerializedName(SERIALIZED_NAME_PROCESSOR_TOKEN)
  private String processorToken;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public SandboxProcessorTokenCreateResponse processorToken(String processorToken) {
    
    this.processorToken = processorToken;
    return this;
  }

   /**
   * A processor token that can be used to call the &#x60;/processor/&#x60; endpoints.
   * @return processorToken
  **/
  @ApiModelProperty(required = true, value = "A processor token that can be used to call the `/processor/` endpoints.")

  public String getProcessorToken() {
    return processorToken;
  }


  public void setProcessorToken(String processorToken) {
    this.processorToken = processorToken;
  }


  public SandboxProcessorTokenCreateResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxProcessorTokenCreateResponse sandboxProcessorTokenCreateResponse = (SandboxProcessorTokenCreateResponse) o;
    return Objects.equals(this.processorToken, sandboxProcessorTokenCreateResponse.processorToken) &&
        Objects.equals(this.requestId, sandboxProcessorTokenCreateResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processorToken, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxProcessorTokenCreateResponse {\n");
    sb.append("    processorToken: ").append(toIndentedString(processorToken)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

