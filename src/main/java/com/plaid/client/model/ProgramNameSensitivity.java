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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The valid name matching sensitivity configurations for a screening program. Note that while certain matching techniques may be more prevalent on less strict settings, all matching algorithms are enabled for every sensitivity.  &#x60;coarse&#x60; - See more potential matches. This sensitivity will see more broad phonetic matches across alphabets that make missing a potential hit very unlikely. This setting is noisier and will require more manual review.  &#x60;balanced&#x60; - A good default for most companies. This sensitivity is balanced to show high quality hits with reduced noise.  &#x60;strict&#x60; - Aggressive false positive reduction. This sensitivity will require names to be more similar than &#x60;coarse&#x60; and &#x60;balanced&#x60; settings, relying less on phonetics, while still accounting for character transpositions, missing tokens, and other common permutations.  &#x60;exact&#x60; - Matches must be nearly exact. This sensitivity will only show hits with exact or nearly exact name matches with only basic correction such as extraneous symbols and capitalization. This setting is generally not recommended unless you have a very specific use case.
 */
@JsonAdapter(ProgramNameSensitivity.Adapter.class)
public enum ProgramNameSensitivity {
  
  COARSE("coarse"),
  
  BALANCED("balanced"),
  
  STRICT("strict"),
  
  EXACT("exact"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  ProgramNameSensitivity(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProgramNameSensitivity fromValue(String value) {
    for (ProgramNameSensitivity b : ProgramNameSensitivity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return ProgramNameSensitivity.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<ProgramNameSensitivity> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProgramNameSensitivity enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProgramNameSensitivity read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProgramNameSensitivity.fromValue(value);
    }
  }
}

