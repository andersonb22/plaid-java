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
import com.plaid.client.model.EntityWatchlistScreeningHit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * List of entity watchlist screening hits
 */
@ApiModel(description = "List of entity watchlist screening hits")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-19T05:25:50.453080Z[Etc/UTC]")
public class EntityWatchlistScreeningHitList {
  public static final String SERIALIZED_NAME_ENTITY_WATCHLIST_SCREENING_HITS = "entity_watchlist_screening_hits";
  @SerializedName(SERIALIZED_NAME_ENTITY_WATCHLIST_SCREENING_HITS)
  private List<EntityWatchlistScreeningHit> entityWatchlistScreeningHits = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public EntityWatchlistScreeningHitList entityWatchlistScreeningHits(List<EntityWatchlistScreeningHit> entityWatchlistScreeningHits) {
    
    this.entityWatchlistScreeningHits = entityWatchlistScreeningHits;
    return this;
  }

  public EntityWatchlistScreeningHitList addEntityWatchlistScreeningHitsItem(EntityWatchlistScreeningHit entityWatchlistScreeningHitsItem) {
    this.entityWatchlistScreeningHits.add(entityWatchlistScreeningHitsItem);
    return this;
  }

   /**
   * List of entity watchlist screening hits
   * @return entityWatchlistScreeningHits
  **/
  @ApiModelProperty(required = true, value = "List of entity watchlist screening hits")

  public List<EntityWatchlistScreeningHit> getEntityWatchlistScreeningHits() {
    return entityWatchlistScreeningHits;
  }


  public void setEntityWatchlistScreeningHits(List<EntityWatchlistScreeningHit> entityWatchlistScreeningHits) {
    this.entityWatchlistScreeningHits = entityWatchlistScreeningHits;
  }


  public EntityWatchlistScreeningHitList requestId(String requestId) {
    
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
    EntityWatchlistScreeningHitList entityWatchlistScreeningHitList = (EntityWatchlistScreeningHitList) o;
    return Objects.equals(this.entityWatchlistScreeningHits, entityWatchlistScreeningHitList.entityWatchlistScreeningHits) &&
        Objects.equals(this.requestId, entityWatchlistScreeningHitList.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityWatchlistScreeningHits, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityWatchlistScreeningHitList {\n");
    sb.append("    entityWatchlistScreeningHits: ").append(toIndentedString(entityWatchlistScreeningHits)).append("\n");
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

