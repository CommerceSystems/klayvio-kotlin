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
import io.swagger.client.model.PushMarketing;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PushChannel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-18T16:09:09.130713678Z[GMT]")

public class PushChannel {
  @SerializedName("marketing")
  private PushMarketing marketing = null;

  public PushChannel marketing(PushMarketing marketing) {
    this.marketing = marketing;
    return this;
  }

   /**
   * Get marketing
   * @return marketing
  **/
  @Schema(description = "")
  public PushMarketing getMarketing() {
    return marketing;
  }

  public void setMarketing(PushMarketing marketing) {
    this.marketing = marketing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushChannel pushChannel = (PushChannel) o;
    return Objects.equals(this.marketing, pushChannel.marketing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketing);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushChannel {\n");
    
    sb.append("    marketing: ").append(toIndentedString(marketing)).append("\n");
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
