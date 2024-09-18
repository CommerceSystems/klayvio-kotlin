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
import io.swagger.client.model.FailedAgeGateEnum;
import io.swagger.client.model.MethodEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * FailedAgeGateMethodFilter
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-18T16:09:09.130713678Z[GMT]")

public class FailedAgeGateMethodFilter implements OneOfNoSMSMarketingUnsubscribedFiltersItems {
  @SerializedName("field")
  private MethodEnum field = null;

  @SerializedName("method")
  private FailedAgeGateEnum method = null;

  public FailedAgeGateMethodFilter field(MethodEnum field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @Schema(required = true, description = "")
  public MethodEnum getField() {
    return field;
  }

  public void setField(MethodEnum field) {
    this.field = field;
  }

  public FailedAgeGateMethodFilter method(FailedAgeGateEnum method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @Schema(required = true, description = "")
  public FailedAgeGateEnum getMethod() {
    return method;
  }

  public void setMethod(FailedAgeGateEnum method) {
    this.method = method;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailedAgeGateMethodFilter failedAgeGateMethodFilter = (FailedAgeGateMethodFilter) o;
    return Objects.equals(this.field, failedAgeGateMethodFilter.field) &&
        Objects.equals(this.method, failedAgeGateMethodFilter.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, method);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailedAgeGateMethodFilter {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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
