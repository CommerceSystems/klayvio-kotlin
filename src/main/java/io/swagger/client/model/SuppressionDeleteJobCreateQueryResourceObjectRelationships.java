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
import io.swagger.client.model.SuppressionDeleteJobCreateQueryResourceObjectRelationshipsList;
import io.swagger.client.model.SuppressionDeleteJobCreateQueryResourceObjectRelationshipsSegment;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SuppressionDeleteJobCreateQueryResourceObjectRelationships
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-18T16:09:09.130713678Z[GMT]")

public class SuppressionDeleteJobCreateQueryResourceObjectRelationships {
  @SerializedName("list")
  private SuppressionDeleteJobCreateQueryResourceObjectRelationshipsList list = null;

  @SerializedName("segment")
  private SuppressionDeleteJobCreateQueryResourceObjectRelationshipsSegment segment = null;

  public SuppressionDeleteJobCreateQueryResourceObjectRelationships list(SuppressionDeleteJobCreateQueryResourceObjectRelationshipsList list) {
    this.list = list;
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @Schema(description = "")
  public SuppressionDeleteJobCreateQueryResourceObjectRelationshipsList getList() {
    return list;
  }

  public void setList(SuppressionDeleteJobCreateQueryResourceObjectRelationshipsList list) {
    this.list = list;
  }

  public SuppressionDeleteJobCreateQueryResourceObjectRelationships segment(SuppressionDeleteJobCreateQueryResourceObjectRelationshipsSegment segment) {
    this.segment = segment;
    return this;
  }

   /**
   * Get segment
   * @return segment
  **/
  @Schema(description = "")
  public SuppressionDeleteJobCreateQueryResourceObjectRelationshipsSegment getSegment() {
    return segment;
  }

  public void setSegment(SuppressionDeleteJobCreateQueryResourceObjectRelationshipsSegment segment) {
    this.segment = segment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuppressionDeleteJobCreateQueryResourceObjectRelationships suppressionDeleteJobCreateQueryResourceObjectRelationships = (SuppressionDeleteJobCreateQueryResourceObjectRelationships) o;
    return Objects.equals(this.list, suppressionDeleteJobCreateQueryResourceObjectRelationships.list) &&
        Objects.equals(this.segment, suppressionDeleteJobCreateQueryResourceObjectRelationships.segment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list, segment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuppressionDeleteJobCreateQueryResourceObjectRelationships {\n");
    
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
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
