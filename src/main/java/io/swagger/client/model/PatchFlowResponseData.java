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
import io.swagger.client.model.FlowEnum;
import io.swagger.client.model.FlowResponseObjectResourceAttributes;
import io.swagger.client.model.ObjectLinks;
import io.swagger.client.model.PatchFlowResponseDataRelationships;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PatchFlowResponseData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-18T16:09:09.130713678Z[GMT]")

public class PatchFlowResponseData {
  @SerializedName("type")
  private FlowEnum type = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("attributes")
  private FlowResponseObjectResourceAttributes attributes = null;

  @SerializedName("relationships")
  private PatchFlowResponseDataRelationships relationships = null;

  @SerializedName("links")
  private ObjectLinks links = null;

  public PatchFlowResponseData type(FlowEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public FlowEnum getType() {
    return type;
  }

  public void setType(FlowEnum type) {
    this.type = type;
  }

  public PatchFlowResponseData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PatchFlowResponseData attributes(FlowResponseObjectResourceAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(required = true, description = "")
  public FlowResponseObjectResourceAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(FlowResponseObjectResourceAttributes attributes) {
    this.attributes = attributes;
  }

  public PatchFlowResponseData relationships(PatchFlowResponseDataRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @Schema(description = "")
  public PatchFlowResponseDataRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(PatchFlowResponseDataRelationships relationships) {
    this.relationships = relationships;
  }

  public PatchFlowResponseData links(ObjectLinks links) {
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
    PatchFlowResponseData patchFlowResponseData = (PatchFlowResponseData) o;
    return Objects.equals(this.type, patchFlowResponseData.type) &&
        Objects.equals(this.id, patchFlowResponseData.id) &&
        Objects.equals(this.attributes, patchFlowResponseData.attributes) &&
        Objects.equals(this.relationships, patchFlowResponseData.relationships) &&
        Objects.equals(this.links, patchFlowResponseData.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, attributes, relationships, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchFlowResponseData {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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
