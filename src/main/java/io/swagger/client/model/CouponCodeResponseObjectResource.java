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
import io.swagger.client.model.CouponCodeEnum;
import io.swagger.client.model.CouponCodeResponseObjectResourceAttributes;
import io.swagger.client.model.ObjectLinks;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CouponCodeResponseObjectResource
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-18T16:09:09.130713678Z[GMT]")

public class CouponCodeResponseObjectResource {
  @SerializedName("type")
  private CouponCodeEnum type = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("attributes")
  private CouponCodeResponseObjectResourceAttributes attributes = null;

  @SerializedName("links")
  private ObjectLinks links = null;

  public CouponCodeResponseObjectResource type(CouponCodeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public CouponCodeEnum getType() {
    return type;
  }

  public void setType(CouponCodeEnum type) {
    this.type = type;
  }

  public CouponCodeResponseObjectResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of a coupon code is a combination of its unique code and the id of the coupon it is associated with.
   * @return id
  **/
  @Schema(example = "10OFF-ASD325FHK324UJDOI2M3JNES99", required = true, description = "The id of a coupon code is a combination of its unique code and the id of the coupon it is associated with.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CouponCodeResponseObjectResource attributes(CouponCodeResponseObjectResourceAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(required = true, description = "")
  public CouponCodeResponseObjectResourceAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CouponCodeResponseObjectResourceAttributes attributes) {
    this.attributes = attributes;
  }

  public CouponCodeResponseObjectResource links(ObjectLinks links) {
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
    CouponCodeResponseObjectResource couponCodeResponseObjectResource = (CouponCodeResponseObjectResource) o;
    return Objects.equals(this.type, couponCodeResponseObjectResource.type) &&
        Objects.equals(this.id, couponCodeResponseObjectResource.id) &&
        Objects.equals(this.attributes, couponCodeResponseObjectResource.attributes) &&
        Objects.equals(this.links, couponCodeResponseObjectResource.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, attributes, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponCodeResponseObjectResource {\n");
    
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
