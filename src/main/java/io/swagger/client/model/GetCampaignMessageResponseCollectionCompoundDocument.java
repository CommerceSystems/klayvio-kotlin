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
import io.swagger.client.model.CollectionLinks;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * GetCampaignMessageResponseCollectionCompoundDocument
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-18T16:09:09.130713678Z[GMT]")

public class GetCampaignMessageResponseCollectionCompoundDocument {
  @SerializedName("data")
  private List<AllOfGetCampaignMessageResponseCollectionCompoundDocumentDataItems> data = new ArrayList<AllOfGetCampaignMessageResponseCollectionCompoundDocumentDataItems>();

  @SerializedName("links")
  private CollectionLinks links = null;

  @SerializedName("included")
  private List<OneOfGetCampaignMessageResponseCollectionCompoundDocumentIncludedItems> included = null;

  public GetCampaignMessageResponseCollectionCompoundDocument data(List<AllOfGetCampaignMessageResponseCollectionCompoundDocumentDataItems> data) {
    this.data = data;
    return this;
  }

  public GetCampaignMessageResponseCollectionCompoundDocument addDataItem(AllOfGetCampaignMessageResponseCollectionCompoundDocumentDataItems dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(required = true, description = "")
  public List<AllOfGetCampaignMessageResponseCollectionCompoundDocumentDataItems> getData() {
    return data;
  }

  public void setData(List<AllOfGetCampaignMessageResponseCollectionCompoundDocumentDataItems> data) {
    this.data = data;
  }

  public GetCampaignMessageResponseCollectionCompoundDocument links(CollectionLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @Schema(description = "")
  public CollectionLinks getLinks() {
    return links;
  }

  public void setLinks(CollectionLinks links) {
    this.links = links;
  }

  public GetCampaignMessageResponseCollectionCompoundDocument included(List<OneOfGetCampaignMessageResponseCollectionCompoundDocumentIncludedItems> included) {
    this.included = included;
    return this;
  }

  public GetCampaignMessageResponseCollectionCompoundDocument addIncludedItem(OneOfGetCampaignMessageResponseCollectionCompoundDocumentIncludedItems includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<OneOfGetCampaignMessageResponseCollectionCompoundDocumentIncludedItems>();
    }
    this.included.add(includedItem);
    return this;
  }

   /**
   * Get included
   * @return included
  **/
  @Schema(description = "")
  public List<OneOfGetCampaignMessageResponseCollectionCompoundDocumentIncludedItems> getIncluded() {
    return included;
  }

  public void setIncluded(List<OneOfGetCampaignMessageResponseCollectionCompoundDocumentIncludedItems> included) {
    this.included = included;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCampaignMessageResponseCollectionCompoundDocument getCampaignMessageResponseCollectionCompoundDocument = (GetCampaignMessageResponseCollectionCompoundDocument) o;
    return Objects.equals(this.data, getCampaignMessageResponseCollectionCompoundDocument.data) &&
        Objects.equals(this.links, getCampaignMessageResponseCollectionCompoundDocument.links) &&
        Objects.equals(this.included, getCampaignMessageResponseCollectionCompoundDocument.included);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, included);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCampaignMessageResponseCollectionCompoundDocument {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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
