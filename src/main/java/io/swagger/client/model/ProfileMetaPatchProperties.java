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
/**
 * ProfileMetaPatchProperties
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-18T16:09:09.130713678Z[GMT]")

public class ProfileMetaPatchProperties {
  @SerializedName("append")
  private Object append = null;

  @SerializedName("unappend")
  private Object unappend = null;

  @SerializedName("unset")
  private OneOfProfileMetaPatchPropertiesUnset unset = null;

  public ProfileMetaPatchProperties append(Object append) {
    this.append = append;
    return this;
  }

   /**
   * Append a simple value or values to this property array
   * @return append
  **/
  @Schema(example = "{\"skus\":\"92538\"}", description = "Append a simple value or values to this property array")
  public Object getAppend() {
    return append;
  }

  public void setAppend(Object append) {
    this.append = append;
  }

  public ProfileMetaPatchProperties unappend(Object unappend) {
    this.unappend = unappend;
    return this;
  }

   /**
   * Remove a simple value or values from this property array
   * @return unappend
  **/
  @Schema(example = "{\"skus\":\"40571\"}", description = "Remove a simple value or values from this property array")
  public Object getUnappend() {
    return unappend;
  }

  public void setUnappend(Object unappend) {
    this.unappend = unappend;
  }

  public ProfileMetaPatchProperties unset(OneOfProfileMetaPatchPropertiesUnset unset) {
    this.unset = unset;
    return this;
  }

   /**
   * Remove a key or keys (and their values) completely from properties
   * @return unset
  **/
  @Schema(example = "skus", description = "Remove a key or keys (and their values) completely from properties")
  public OneOfProfileMetaPatchPropertiesUnset getUnset() {
    return unset;
  }

  public void setUnset(OneOfProfileMetaPatchPropertiesUnset unset) {
    this.unset = unset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileMetaPatchProperties profileMetaPatchProperties = (ProfileMetaPatchProperties) o;
    return Objects.equals(this.append, profileMetaPatchProperties.append) &&
        Objects.equals(this.unappend, profileMetaPatchProperties.unappend) &&
        Objects.equals(this.unset, profileMetaPatchProperties.unset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(append, unappend, unset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileMetaPatchProperties {\n");
    
    sb.append("    append: ").append(toIndentedString(append)).append("\n");
    sb.append("    unappend: ").append(toIndentedString(unappend)).append("\n");
    sb.append("    unset: ").append(toIndentedString(unset)).append("\n");
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
