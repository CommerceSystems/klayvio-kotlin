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
import io.swagger.client.model.CatalogCategoryEnum;
import io.swagger.client.model.CatalogCategoryResponseObjectResource;
import io.swagger.client.model.CatalogCategoryResponseObjectResourceAttributes;
import io.swagger.client.model.ObjectLinks;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * AllOfGetCatalogCategoryResponseData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-18T16:09:09.130713678Z[GMT]")

public class AllOfGetCatalogCategoryResponseData extends CatalogCategoryResponseObjectResource {
  @SerializedName("relationships")
  private Object relationships = null;

  public AllOfGetCatalogCategoryResponseData relationships(Object relationships) {
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @Schema(description = "")
  public Object getRelationships() {
    return relationships;
  }

  public void setRelationships(Object relationships) {
    this.relationships = relationships;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllOfGetCatalogCategoryResponseData allOfGetCatalogCategoryResponseData = (AllOfGetCatalogCategoryResponseData) o;
    return Objects.equals(this.relationships, allOfGetCatalogCategoryResponseData.relationships) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationships, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOfGetCatalogCategoryResponseData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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
