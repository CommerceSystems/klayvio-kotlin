/*
 * Klaviyo API
 * The Klaviyo REST API. Please visit https://developers.klaviyo.com for more details.
 *
 * OpenAPI spec version: 2024-07-15
 * Contact: developers@klaviyo.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * EmailMarketingListSuppression
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-18T16:09:09.130713678Z[GMT]")

public class EmailMarketingListSuppression {
  @SerializedName("list_id")
  private String listId = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

  public EmailMarketingListSuppression listId(String listId) {
    this.listId = listId;
    return this;
  }

   /**
   * The ID of list to which the suppression applies.
   * @return listId
  **/
  @Schema(example = "Y6nRLr", required = true, description = "The ID of list to which the suppression applies.")
  public String getListId() {
    return listId;
  }

  public void setListId(String listId) {
    this.listId = listId;
  }

  public EmailMarketingListSuppression reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason the profile was suppressed from the list.
   * @return reason
  **/
  @Schema(example = "USER_SUPPRESSED", required = true, description = "The reason the profile was suppressed from the list.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public EmailMarketingListSuppression timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The timestamp when the profile was suppressed from the list, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
   * @return timestamp
  **/
  @Schema(example = "2023-02-21T20:07:38Z", required = true, description = "The timestamp when the profile was suppressed from the list, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailMarketingListSuppression emailMarketingListSuppression = (EmailMarketingListSuppression) o;
    return Objects.equals(this.listId, emailMarketingListSuppression.listId) &&
        Objects.equals(this.reason, emailMarketingListSuppression.reason) &&
        Objects.equals(this.timestamp, emailMarketingListSuppression.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listId, reason, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailMarketingListSuppression {\n");
    
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
