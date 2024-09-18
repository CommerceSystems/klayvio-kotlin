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
import io.swagger.client.model.CatalogVariantUpdateQueryResourceObject;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Array of catalog variants to update.
 */
@Schema(description = "Array of catalog variants to update.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-18T16:09:09.130713678Z[GMT]")

public class CatalogVariantUpdateJobCreateQueryResourceObjectAttributesVariants {
  @SerializedName("data")
  private List<CatalogVariantUpdateQueryResourceObject> data = new ArrayList<CatalogVariantUpdateQueryResourceObject>();

  public CatalogVariantUpdateJobCreateQueryResourceObjectAttributesVariants data(List<CatalogVariantUpdateQueryResourceObject> data) {
    this.data = data;
    return this;
  }

  public CatalogVariantUpdateJobCreateQueryResourceObjectAttributesVariants addDataItem(CatalogVariantUpdateQueryResourceObject dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(required = true, description = "")
  public List<CatalogVariantUpdateQueryResourceObject> getData() {
    return data;
  }

  public void setData(List<CatalogVariantUpdateQueryResourceObject> data) {
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
    CatalogVariantUpdateJobCreateQueryResourceObjectAttributesVariants catalogVariantUpdateJobCreateQueryResourceObjectAttributesVariants = (CatalogVariantUpdateJobCreateQueryResourceObjectAttributesVariants) o;
    return Objects.equals(this.data, catalogVariantUpdateJobCreateQueryResourceObjectAttributesVariants.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogVariantUpdateJobCreateQueryResourceObjectAttributesVariants {\n");
    
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
