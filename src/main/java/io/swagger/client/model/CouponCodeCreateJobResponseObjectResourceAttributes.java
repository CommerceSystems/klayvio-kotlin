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
import io.swagger.client.model.APIJobErrorPayload;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * CouponCodeCreateJobResponseObjectResourceAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-18T16:09:09.130713678Z[GMT]")

public class CouponCodeCreateJobResponseObjectResourceAttributes {
  /**
   * Status of the asynchronous job.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    @SerializedName("cancelled")
    CANCELLED("cancelled"),
    @SerializedName("complete")
    COMPLETE("complete"),
    @SerializedName("processing")
    PROCESSING("processing"),
    @SerializedName("queued")
    QUEUED("queued");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("total_count")
  private Integer totalCount = null;

  @SerializedName("completed_count")
  private Integer completedCount = 0;

  @SerializedName("failed_count")
  private Integer failedCount = 0;

  @SerializedName("completed_at")
  private OffsetDateTime completedAt = null;

  @SerializedName("errors")
  private List<APIJobErrorPayload> errors = null;

  @SerializedName("expires_at")
  private OffsetDateTime expiresAt = null;

  public CouponCodeCreateJobResponseObjectResourceAttributes status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the asynchronous job.
   * @return status
  **/
  @Schema(example = "processing", required = true, description = "Status of the asynchronous job.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CouponCodeCreateJobResponseObjectResourceAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time the job was created in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
   * @return createdAt
  **/
  @Schema(example = "2022-11-08T00:00Z", required = true, description = "The date and time the job was created in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public CouponCodeCreateJobResponseObjectResourceAttributes totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * The total number of operations to be processed by the job. See &#x60;completed_count&#x60; for the job&#x27;s current progress.
   * @return totalCount
  **/
  @Schema(example = "10", required = true, description = "The total number of operations to be processed by the job. See `completed_count` for the job's current progress.")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public CouponCodeCreateJobResponseObjectResourceAttributes completedCount(Integer completedCount) {
    this.completedCount = completedCount;
    return this;
  }

   /**
   * The total number of operations that have been completed by the job.
   * @return completedCount
  **/
  @Schema(example = "9", description = "The total number of operations that have been completed by the job.")
  public Integer getCompletedCount() {
    return completedCount;
  }

  public void setCompletedCount(Integer completedCount) {
    this.completedCount = completedCount;
  }

  public CouponCodeCreateJobResponseObjectResourceAttributes failedCount(Integer failedCount) {
    this.failedCount = failedCount;
    return this;
  }

   /**
   * The total number of operations that have failed as part of the job.
   * @return failedCount
  **/
  @Schema(example = "1", description = "The total number of operations that have failed as part of the job.")
  public Integer getFailedCount() {
    return failedCount;
  }

  public void setFailedCount(Integer failedCount) {
    this.failedCount = failedCount;
  }

  public CouponCodeCreateJobResponseObjectResourceAttributes completedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
    return this;
  }

   /**
   * Date and time the job was completed in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
   * @return completedAt
  **/
  @Schema(example = "2022-11-08T00:00Z", description = "Date and time the job was completed in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).")
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

  public CouponCodeCreateJobResponseObjectResourceAttributes errors(List<APIJobErrorPayload> errors) {
    this.errors = errors;
    return this;
  }

  public CouponCodeCreateJobResponseObjectResourceAttributes addErrorsItem(APIJobErrorPayload errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<APIJobErrorPayload>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Array of errors encountered during the processing of the job.
   * @return errors
  **/
  @Schema(description = "Array of errors encountered during the processing of the job.")
  public List<APIJobErrorPayload> getErrors() {
    return errors;
  }

  public void setErrors(List<APIJobErrorPayload> errors) {
    this.errors = errors;
  }

  public CouponCodeCreateJobResponseObjectResourceAttributes expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Date and time the job expires in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
   * @return expiresAt
  **/
  @Schema(example = "2022-11-08T00:00Z", description = "Date and time the job expires in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).")
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponCodeCreateJobResponseObjectResourceAttributes couponCodeCreateJobResponseObjectResourceAttributes = (CouponCodeCreateJobResponseObjectResourceAttributes) o;
    return Objects.equals(this.status, couponCodeCreateJobResponseObjectResourceAttributes.status) &&
        Objects.equals(this.createdAt, couponCodeCreateJobResponseObjectResourceAttributes.createdAt) &&
        Objects.equals(this.totalCount, couponCodeCreateJobResponseObjectResourceAttributes.totalCount) &&
        Objects.equals(this.completedCount, couponCodeCreateJobResponseObjectResourceAttributes.completedCount) &&
        Objects.equals(this.failedCount, couponCodeCreateJobResponseObjectResourceAttributes.failedCount) &&
        Objects.equals(this.completedAt, couponCodeCreateJobResponseObjectResourceAttributes.completedAt) &&
        Objects.equals(this.errors, couponCodeCreateJobResponseObjectResourceAttributes.errors) &&
        Objects.equals(this.expiresAt, couponCodeCreateJobResponseObjectResourceAttributes.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, createdAt, totalCount, completedCount, failedCount, completedAt, errors, expiresAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponCodeCreateJobResponseObjectResourceAttributes {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    completedCount: ").append(toIndentedString(completedCount)).append("\n");
    sb.append("    failedCount: ").append(toIndentedString(failedCount)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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
