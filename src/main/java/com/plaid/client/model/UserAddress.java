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
 * Home address for the user.
 */
@ApiModel(description = "Home address for the user.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-20T20:08:02.399975Z[Etc/UTC]")
public class UserAddress {
  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_STREET2 = "street2";
  @SerializedName(SERIALIZED_NAME_STREET2)
  private String street2;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;


  public UserAddress street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * The primary street portion of an address. If the user has submitted their address, this field will always be filled.
   * @return street
  **/
  @ApiModelProperty(example = "123 Main St.", required = true, value = "The primary street portion of an address. If the user has submitted their address, this field will always be filled.")

  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  public UserAddress street2(String street2) {
    
    this.street2 = street2;
    return this;
  }

   /**
   * Extra street information, like an apartment or suite number.
   * @return street2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Unit 42", value = "Extra street information, like an apartment or suite number.")

  public String getStreet2() {
    return street2;
  }


  public void setStreet2(String street2) {
    this.street2 = street2;
  }


  public UserAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City from the end user&#39;s address
   * @return city
  **/
  @ApiModelProperty(example = "Pawnee", required = true, value = "City from the end user's address")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public UserAddress region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * An ISO 3166-2 subdivision code. Related terms would be \&quot;state\&quot;, \&quot;province\&quot;, \&quot;prefecture\&quot;, \&quot;zone\&quot;, \&quot;subdivision\&quot;, etc.
   * @return region
  **/
  @ApiModelProperty(example = "IN", required = true, value = "An ISO 3166-2 subdivision code. Related terms would be \"state\", \"province\", \"prefecture\", \"zone\", \"subdivision\", etc.")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public UserAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code for the associated address. Between 2 and 10 alphanumeric characters. For US-based addresses this must be 5 numeric digits.
   * @return postalCode
  **/
  @ApiModelProperty(example = "46001", required = true, value = "The postal code for the associated address. Between 2 and 10 alphanumeric characters. For US-based addresses this must be 5 numeric digits.")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public UserAddress country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Valid, capitalized, two-letter ISO code representing the country of this object. Must be in ISO 3166-1 alpha-2 form.
   * @return country
  **/
  @ApiModelProperty(example = "US", required = true, value = "Valid, capitalized, two-letter ISO code representing the country of this object. Must be in ISO 3166-1 alpha-2 form.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAddress userAddress = (UserAddress) o;
    return Objects.equals(this.street, userAddress.street) &&
        Objects.equals(this.street2, userAddress.street2) &&
        Objects.equals(this.city, userAddress.city) &&
        Objects.equals(this.region, userAddress.region) &&
        Objects.equals(this.postalCode, userAddress.postalCode) &&
        Objects.equals(this.country, userAddress.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, street2, city, region, postalCode, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAddress {\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

