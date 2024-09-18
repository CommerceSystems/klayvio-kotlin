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
import io.swagger.client.model.DateEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * StaticDateFilter
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-18T16:09:09.130713678Z[GMT]")

public class StaticDateFilter implements OneOfBounceDateFilterFilter, OneOfInvalidEmailDateFilterFilter, OneOfManualSuppressionDateFilterFilter, OneOfProfileHasGroupMembershipConditionTimeframeFilter, OneOfProfileMetricConditionTimeframeFilter, OneOfProfilePropertyConditionFilter, OneOfStatusDateFilterFilter {
  @SerializedName("type")
  private DateEnum type = null;

  /**
   * Operators for static date filters.  E.g. \&quot;before 2023-01-01\&quot;
   */
  @JsonAdapter(OperatorEnum.Adapter.class)
  public enum OperatorEnum {
    @SerializedName("after")
    AFTER("after"),
    @SerializedName("before")
    BEFORE("before");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static OperatorEnum fromValue(String input) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<OperatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperatorEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public OperatorEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return OperatorEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("operator")
  private OperatorEnum operator = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  public StaticDateFilter type(DateEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public DateEnum getType() {
    return type;
  }

  public void setType(DateEnum type) {
    this.type = type;
  }

  public StaticDateFilter operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Operators for static date filters.  E.g. \&quot;before 2023-01-01\&quot;
   * @return operator
  **/
  @Schema(required = true, description = "Operators for static date filters.  E.g. \"before 2023-01-01\"")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public StaticDateFilter date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @Schema(example = "2022-11-08T00:00Z", required = true, description = "")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaticDateFilter staticDateFilter = (StaticDateFilter) o;
    return Objects.equals(this.type, staticDateFilter.type) &&
        Objects.equals(this.operator, staticDateFilter.operator) &&
        Objects.equals(this.date, staticDateFilter.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, operator, date);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaticDateFilter {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
