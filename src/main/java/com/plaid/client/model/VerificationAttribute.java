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
 * Details about a certain reason as to why a document could potentially be fraudulent
 */
@ApiModel(description = "Details about a certain reason as to why a document could potentially be fraudulent")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T05:25:50.453080Z[Etc/UTC]")
public class VerificationAttribute {
  /**
   * Message indicating the reason as to why the verification failed
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    VERIFICATION_ATTRIBUTE_TYPE_UNKNOWN("VERIFICATION_ATTRIBUTE_TYPE_UNKNOWN"),
    
    VERIFICATION_ATTRIBUTE_TYPE_AMOUNT_MATCH("VERIFICATION_ATTRIBUTE_TYPE_AMOUNT_MATCH"),
    
    VERIFICATION_ATTRIBUTE_TYPE_DATE_MATCH("VERIFICATION_ATTRIBUTE_TYPE_DATE_MATCH"),
    
    VERIFICATION_ATTRIBUTE_TYPE_DATE_MISMATCH("VERIFICATION_ATTRIBUTE_TYPE_DATE_MISMATCH"),
    
    VERIFICATION_ATTRIBUTE_TYPE_FILE_TAMPERING("VERIFICATION_ATTRIBUTE_TYPE_FILE_TAMPERING"),
    
    VERIFICATION_ATTRIBUTE_TYPE_DESCRIPTION_MATCH("VERIFICATION_ATTRIBUTE_TYPE_DESCRIPTION_MATCH"),
    
    VERIFICATION_ATTRIBUTE_TYPE_DESCRIPTION_MISMATCH("VERIFICATION_ATTRIBUTE_TYPE_DESCRIPTION_MISMATCH"),
    
    VERIFICATION_ATTRIBUTE_TYPE_FIRST_NAME_MATCH("VERIFICATION_ATTRIBUTE_TYPE_FIRST_NAME_MATCH"),
    
    VERIFICATION_ATTRIBUTE_TYPE_FIRST_NAME_MISMATCH("VERIFICATION_ATTRIBUTE_TYPE_FIRST_NAME_MISMATCH"),
    
    VERIFICATION_ATTRIBUTE_TYPE_LAST_NAME_MATCH("VERIFICATION_ATTRIBUTE_TYPE_LAST_NAME_MATCH"),
    
    VERIFICATION_ATTRIBUTE_TYPE_LAST_NAME_MISMATCH("VERIFICATION_ATTRIBUTE_TYPE_LAST_NAME_MISMATCH"),
    
    NULL("null");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;


  public VerificationAttribute type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Message indicating the reason as to why the verification failed
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Message indicating the reason as to why the verification failed")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationAttribute verificationAttribute = (VerificationAttribute) o;
    return Objects.equals(this.type, verificationAttribute.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationAttribute {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

