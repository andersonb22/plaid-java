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
 * Object containing metadata for the document
 */
@ApiModel(description = "Object containing metadata for the document")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-20T20:08:02.399975Z[Etc/UTC]")
public class RiskSignalDocumentReference {
  public static final String SERIALIZED_NAME_DOCUMENT_ID = "document_id";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  private String documentId;

  public static final String SERIALIZED_NAME_DOCUMENT_NAME = "document_name";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_NAME)
  private String documentName;


  public RiskSignalDocumentReference documentId(String documentId) {
    
    this.documentId = documentId;
    return this;
  }

   /**
   * An identifier of the document referenced by the document metadata.
   * @return documentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An identifier of the document referenced by the document metadata.")

  public String getDocumentId() {
    return documentId;
  }


  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  public RiskSignalDocumentReference documentName(String documentName) {
    
    this.documentName = documentName;
    return this;
  }

   /**
   * The name of the document
   * @return documentName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the document")

  public String getDocumentName() {
    return documentName;
  }


  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskSignalDocumentReference riskSignalDocumentReference = (RiskSignalDocumentReference) o;
    return Objects.equals(this.documentId, riskSignalDocumentReference.documentId) &&
        Objects.equals(this.documentName, riskSignalDocumentReference.documentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, documentName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskSignalDocumentReference {\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
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

