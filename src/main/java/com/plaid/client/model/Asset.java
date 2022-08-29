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
import com.plaid.client.model.AssetDetail;
import com.plaid.client.model.AssetHolder;
import com.plaid.client.model.AssetOwners;
import com.plaid.client.model.AssetTransactions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * No documentation available
 */
@ApiModel(description = "No documentation available")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T18:41:42.227025Z[Etc/UTC]")
public class Asset {
  public static final String SERIALIZED_NAME_A_S_S_E_T_D_E_T_A_I_L = "ASSET_DETAIL";
  @SerializedName(SERIALIZED_NAME_A_S_S_E_T_D_E_T_A_I_L)
  private AssetDetail ASSET_DETAIL;

  public static final String SERIALIZED_NAME_A_S_S_E_T_O_W_N_E_R_S = "ASSET_OWNERS";
  @SerializedName(SERIALIZED_NAME_A_S_S_E_T_O_W_N_E_R_S)
  private AssetOwners ASSET_OWNERS;

  public static final String SERIALIZED_NAME_A_S_S_E_T_H_O_L_D_E_R = "ASSET_HOLDER";
  @SerializedName(SERIALIZED_NAME_A_S_S_E_T_H_O_L_D_E_R)
  private AssetHolder ASSET_HOLDER;

  public static final String SERIALIZED_NAME_A_S_S_E_T_T_R_A_N_S_A_C_T_I_O_N_S = "ASSET_TRANSACTIONS";
  @SerializedName(SERIALIZED_NAME_A_S_S_E_T_T_R_A_N_S_A_C_T_I_O_N_S)
  private AssetTransactions ASSET_TRANSACTIONS;


  public Asset ASSET_DETAIL(AssetDetail ASSET_DETAIL) {
    
    this.ASSET_DETAIL = ASSET_DETAIL;
    return this;
  }

   /**
   * Get ASSET_DETAIL
   * @return ASSET_DETAIL
  **/
  @ApiModelProperty(required = true, value = "")

  public AssetDetail getASSETDETAIL() {
    return ASSET_DETAIL;
  }


  public void setASSETDETAIL(AssetDetail ASSET_DETAIL) {
    this.ASSET_DETAIL = ASSET_DETAIL;
  }


  public Asset ASSET_OWNERS(AssetOwners ASSET_OWNERS) {
    
    this.ASSET_OWNERS = ASSET_OWNERS;
    return this;
  }

   /**
   * Get ASSET_OWNERS
   * @return ASSET_OWNERS
  **/
  @ApiModelProperty(required = true, value = "")

  public AssetOwners getASSETOWNERS() {
    return ASSET_OWNERS;
  }


  public void setASSETOWNERS(AssetOwners ASSET_OWNERS) {
    this.ASSET_OWNERS = ASSET_OWNERS;
  }


  public Asset ASSET_HOLDER(AssetHolder ASSET_HOLDER) {
    
    this.ASSET_HOLDER = ASSET_HOLDER;
    return this;
  }

   /**
   * Get ASSET_HOLDER
   * @return ASSET_HOLDER
  **/
  @ApiModelProperty(required = true, value = "")

  public AssetHolder getASSETHOLDER() {
    return ASSET_HOLDER;
  }


  public void setASSETHOLDER(AssetHolder ASSET_HOLDER) {
    this.ASSET_HOLDER = ASSET_HOLDER;
  }


  public Asset ASSET_TRANSACTIONS(AssetTransactions ASSET_TRANSACTIONS) {
    
    this.ASSET_TRANSACTIONS = ASSET_TRANSACTIONS;
    return this;
  }

   /**
   * Get ASSET_TRANSACTIONS
   * @return ASSET_TRANSACTIONS
  **/
  @ApiModelProperty(required = true, value = "")

  public AssetTransactions getASSETTRANSACTIONS() {
    return ASSET_TRANSACTIONS;
  }


  public void setASSETTRANSACTIONS(AssetTransactions ASSET_TRANSACTIONS) {
    this.ASSET_TRANSACTIONS = ASSET_TRANSACTIONS;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Asset asset = (Asset) o;
    return Objects.equals(this.ASSET_DETAIL, asset.ASSET_DETAIL) &&
        Objects.equals(this.ASSET_OWNERS, asset.ASSET_OWNERS) &&
        Objects.equals(this.ASSET_HOLDER, asset.ASSET_HOLDER) &&
        Objects.equals(this.ASSET_TRANSACTIONS, asset.ASSET_TRANSACTIONS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ASSET_DETAIL, ASSET_OWNERS, ASSET_HOLDER, ASSET_TRANSACTIONS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Asset {\n");
    sb.append("    ASSET_DETAIL: ").append(toIndentedString(ASSET_DETAIL)).append("\n");
    sb.append("    ASSET_OWNERS: ").append(toIndentedString(ASSET_OWNERS)).append("\n");
    sb.append("    ASSET_HOLDER: ").append(toIndentedString(ASSET_HOLDER)).append("\n");
    sb.append("    ASSET_TRANSACTIONS: ").append(toIndentedString(ASSET_TRANSACTIONS)).append("\n");
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

