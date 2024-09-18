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
import io.swagger.client.model.CampaignSendJobEnum;
import io.swagger.client.model.CampaignSendJobPartialUpdateQueryResourceObjectAttributes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CampaignSendJobPartialUpdateQueryResourceObject
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-18T16:09:09.130713678Z[GMT]")

public class CampaignSendJobPartialUpdateQueryResourceObject {
  @SerializedName("type")
  private CampaignSendJobEnum type = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("attributes")
  private CampaignSendJobPartialUpdateQueryResourceObjectAttributes attributes = null;

  public CampaignSendJobPartialUpdateQueryResourceObject type(CampaignSendJobEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public CampaignSendJobEnum getType() {
    return type;
  }

  public void setType(CampaignSendJobEnum type) {
    this.type = type;
  }

  public CampaignSendJobPartialUpdateQueryResourceObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the currently sending campaign to cancel or revert
   * @return id
  **/
  @Schema(required = true, description = "The ID of the currently sending campaign to cancel or revert")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CampaignSendJobPartialUpdateQueryResourceObject attributes(CampaignSendJobPartialUpdateQueryResourceObjectAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(required = true, description = "")
  public CampaignSendJobPartialUpdateQueryResourceObjectAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CampaignSendJobPartialUpdateQueryResourceObjectAttributes attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignSendJobPartialUpdateQueryResourceObject campaignSendJobPartialUpdateQueryResourceObject = (CampaignSendJobPartialUpdateQueryResourceObject) o;
    return Objects.equals(this.type, campaignSendJobPartialUpdateQueryResourceObject.type) &&
        Objects.equals(this.id, campaignSendJobPartialUpdateQueryResourceObject.id) &&
        Objects.equals(this.attributes, campaignSendJobPartialUpdateQueryResourceObject.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignSendJobPartialUpdateQueryResourceObject {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
