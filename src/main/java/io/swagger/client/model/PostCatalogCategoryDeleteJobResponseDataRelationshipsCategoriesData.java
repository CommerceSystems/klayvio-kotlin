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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PostCatalogCategoryDeleteJobResponseDataRelationshipsCategoriesData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-18T16:09:09.130713678Z[GMT]")

public class PostCatalogCategoryDeleteJobResponseDataRelationshipsCategoriesData {
  @SerializedName("type")
  private CatalogCategoryEnum type = null;

  @SerializedName("id")
  private String id = null;

  public PostCatalogCategoryDeleteJobResponseDataRelationshipsCategoriesData type(CatalogCategoryEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public CatalogCategoryEnum getType() {
    return type;
  }

  public void setType(CatalogCategoryEnum type) {
    this.type = type;
  }

  public PostCatalogCategoryDeleteJobResponseDataRelationshipsCategoriesData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * IDs of the deleted catalog categories.
   * @return id
  **/
  @Schema(example = "$custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL", required = true, description = "IDs of the deleted catalog categories.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCatalogCategoryDeleteJobResponseDataRelationshipsCategoriesData postCatalogCategoryDeleteJobResponseDataRelationshipsCategoriesData = (PostCatalogCategoryDeleteJobResponseDataRelationshipsCategoriesData) o;
    return Objects.equals(this.type, postCatalogCategoryDeleteJobResponseDataRelationshipsCategoriesData.type) &&
        Objects.equals(this.id, postCatalogCategoryDeleteJobResponseDataRelationshipsCategoriesData.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCatalogCategoryDeleteJobResponseDataRelationshipsCategoriesData {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
