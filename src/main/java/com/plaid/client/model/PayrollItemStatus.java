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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Details about the status of the payroll item.
 */
@ApiModel(description = "Details about the status of the payroll item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T18:41:42.227025Z[Etc/UTC]")
public class PayrollItemStatus {
  public static final String SERIALIZED_NAME_PROCESSING_STATUS = "processing_status";
  @SerializedName(SERIALIZED_NAME_PROCESSING_STATUS)
  private String processingStatus;


  public PayrollItemStatus processingStatus(String processingStatus) {
    
    this.processingStatus = processingStatus;
    return this;
  }

   /**
   * Denotes the processing status for the verification.  &#x60;UNKNOWN&#x60;: The processing status could not be determined.  &#x60;PROCESSING_COMPLETE&#x60;: The processing has completed and the user has approved for sharing. The data is available to be retrieved.  &#x60;PROCESSING&#x60;: The verification is still processing. The data is not available yet.  &#x60;FAILED&#x60;: The processing failed to complete successfully.  &#x60;APPROVAL_STATUS_PENDING&#x60;: The processing has completed but the user has not yet approved the sharing of the data.
   * @return processingStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Denotes the processing status for the verification.  `UNKNOWN`: The processing status could not be determined.  `PROCESSING_COMPLETE`: The processing has completed and the user has approved for sharing. The data is available to be retrieved.  `PROCESSING`: The verification is still processing. The data is not available yet.  `FAILED`: The processing failed to complete successfully.  `APPROVAL_STATUS_PENDING`: The processing has completed but the user has not yet approved the sharing of the data.")

  public String getProcessingStatus() {
    return processingStatus;
  }


  public void setProcessingStatus(String processingStatus) {
    this.processingStatus = processingStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayrollItemStatus payrollItemStatus = (PayrollItemStatus) o;
    return Objects.equals(this.processingStatus, payrollItemStatus.processingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayrollItemStatus {\n");
    sb.append("    processingStatus: ").append(toIndentedString(processingStatus)).append("\n");
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

