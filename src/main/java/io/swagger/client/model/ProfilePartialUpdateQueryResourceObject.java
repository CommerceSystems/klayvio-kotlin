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
import io.swagger.client.model.ProfileEnum;
import io.swagger.client.model.ProfileMeta;
import io.swagger.client.model.ProfilePartialUpdateQueryResourceObjectAttributes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ProfilePartialUpdateQueryResourceObject
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-18T16:09:09.130713678Z[GMT]")

public class ProfilePartialUpdateQueryResourceObject {
  @SerializedName("type")
  private ProfileEnum type = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("attributes")
  private ProfilePartialUpdateQueryResourceObjectAttributes attributes = null;

  @SerializedName("meta")
  private ProfileMeta meta = null;

  public ProfilePartialUpdateQueryResourceObject type(ProfileEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public ProfileEnum getType() {
    return type;
  }

  public void setType(ProfileEnum type) {
    this.type = type;
  }

  public ProfilePartialUpdateQueryResourceObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Primary key that uniquely identifies this profile. Generated by Klaviyo.
   * @return id
  **/
  @Schema(example = "01GDDKASAP8TKDDA2GRZDSVP4H", required = true, description = "Primary key that uniquely identifies this profile. Generated by Klaviyo.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProfilePartialUpdateQueryResourceObject attributes(ProfilePartialUpdateQueryResourceObjectAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(required = true, description = "")
  public ProfilePartialUpdateQueryResourceObjectAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ProfilePartialUpdateQueryResourceObjectAttributes attributes) {
    this.attributes = attributes;
  }

  public ProfilePartialUpdateQueryResourceObject meta(ProfileMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @Schema(description = "")
  public ProfileMeta getMeta() {
    return meta;
  }

  public void setMeta(ProfileMeta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfilePartialUpdateQueryResourceObject profilePartialUpdateQueryResourceObject = (ProfilePartialUpdateQueryResourceObject) o;
    return Objects.equals(this.type, profilePartialUpdateQueryResourceObject.type) &&
        Objects.equals(this.id, profilePartialUpdateQueryResourceObject.id) &&
        Objects.equals(this.attributes, profilePartialUpdateQueryResourceObject.attributes) &&
        Objects.equals(this.meta, profilePartialUpdateQueryResourceObject.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, attributes, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfilePartialUpdateQueryResourceObject {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
