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
import io.swagger.client.model.ConstantContactIntegrationFilter;
import io.swagger.client.model.IntegrationEnum;
import io.swagger.client.model.MethodEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ConstantContactIntegrationMethodFilter
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-18T16:09:09.130713678Z[GMT]")

public class ConstantContactIntegrationMethodFilter {
  @SerializedName("field")
  private MethodEnum field = null;

  @SerializedName("method")
  private IntegrationEnum method = null;

  @SerializedName("filter")
  private ConstantContactIntegrationFilter filter = null;

  public ConstantContactIntegrationMethodFilter field(MethodEnum field) {
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

  public ConstantContactIntegrationMethodFilter method(IntegrationEnum method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @Schema(required = true, description = "")
  public IntegrationEnum getMethod() {
    return method;
  }

  public void setMethod(IntegrationEnum method) {
    this.method = method;
  }

  public ConstantContactIntegrationMethodFilter filter(ConstantContactIntegrationFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @Schema(required = true, description = "")
  public ConstantContactIntegrationFilter getFilter() {
    return filter;
  }

  public void setFilter(ConstantContactIntegrationFilter filter) {
    this.filter = filter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConstantContactIntegrationMethodFilter constantContactIntegrationMethodFilter = (ConstantContactIntegrationMethodFilter) o;
    return Objects.equals(this.field, constantContactIntegrationMethodFilter.field) &&
        Objects.equals(this.method, constantContactIntegrationMethodFilter.method) &&
        Objects.equals(this.filter, constantContactIntegrationMethodFilter.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, method, filter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConstantContactIntegrationMethodFilter {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
