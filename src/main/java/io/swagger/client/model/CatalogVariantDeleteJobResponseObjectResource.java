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
import io.swagger.client.model.CatalogVariantBulkDeleteJobEnum;
import io.swagger.client.model.CouponCodeCreateJobResponseObjectResourceAttributes;
import io.swagger.client.model.ObjectLinks;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CatalogVariantDeleteJobResponseObjectResource
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-18T16:09:09.130713678Z[GMT]")

public class CatalogVariantDeleteJobResponseObjectResource {
  @SerializedName("type")
  private CatalogVariantBulkDeleteJobEnum type = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("attributes")
  private CouponCodeCreateJobResponseObjectResourceAttributes attributes = null;

  @SerializedName("links")
  private ObjectLinks links = null;

  public CatalogVariantDeleteJobResponseObjectResource type(CatalogVariantBulkDeleteJobEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public CatalogVariantBulkDeleteJobEnum getType() {
    return type;
  }

  public void setType(CatalogVariantBulkDeleteJobEnum type) {
    this.type = type;
  }

  public CatalogVariantDeleteJobResponseObjectResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for retrieving the job. Generated by Klaviyo.
   * @return id
  **/
  @Schema(required = true, description = "Unique identifier for retrieving the job. Generated by Klaviyo.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogVariantDeleteJobResponseObjectResource attributes(CouponCodeCreateJobResponseObjectResourceAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(required = true, description = "")
  public CouponCodeCreateJobResponseObjectResourceAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CouponCodeCreateJobResponseObjectResourceAttributes attributes) {
    this.attributes = attributes;
  }

  public CatalogVariantDeleteJobResponseObjectResource links(ObjectLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @Schema(required = true, description = "")
  public ObjectLinks getLinks() {
    return links;
  }

  public void setLinks(ObjectLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogVariantDeleteJobResponseObjectResource catalogVariantDeleteJobResponseObjectResource = (CatalogVariantDeleteJobResponseObjectResource) o;
    return Objects.equals(this.type, catalogVariantDeleteJobResponseObjectResource.type) &&
        Objects.equals(this.id, catalogVariantDeleteJobResponseObjectResource.id) &&
        Objects.equals(this.attributes, catalogVariantDeleteJobResponseObjectResource.attributes) &&
        Objects.equals(this.links, catalogVariantDeleteJobResponseObjectResource.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, attributes, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogVariantDeleteJobResponseObjectResource {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
