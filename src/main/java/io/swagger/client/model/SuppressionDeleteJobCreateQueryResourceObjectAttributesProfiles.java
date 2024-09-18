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
import io.swagger.client.model.ProfileSuppressionDeleteQueryResourceObject;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The profile(s) to remove suppressions for.
 */
@Schema(description = "The profile(s) to remove suppressions for.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-18T16:09:09.130713678Z[GMT]")

public class SuppressionDeleteJobCreateQueryResourceObjectAttributesProfiles {
  @SerializedName("data")
  private List<ProfileSuppressionDeleteQueryResourceObject> data = new ArrayList<ProfileSuppressionDeleteQueryResourceObject>();

  public SuppressionDeleteJobCreateQueryResourceObjectAttributesProfiles data(List<ProfileSuppressionDeleteQueryResourceObject> data) {
    this.data = data;
    return this;
  }

  public SuppressionDeleteJobCreateQueryResourceObjectAttributesProfiles addDataItem(ProfileSuppressionDeleteQueryResourceObject dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(required = true, description = "")
  public List<ProfileSuppressionDeleteQueryResourceObject> getData() {
    return data;
  }

  public void setData(List<ProfileSuppressionDeleteQueryResourceObject> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuppressionDeleteJobCreateQueryResourceObjectAttributesProfiles suppressionDeleteJobCreateQueryResourceObjectAttributesProfiles = (SuppressionDeleteJobCreateQueryResourceObjectAttributesProfiles) o;
    return Objects.equals(this.data, suppressionDeleteJobCreateQueryResourceObjectAttributesProfiles.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuppressionDeleteJobCreateQueryResourceObjectAttributesProfiles {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
