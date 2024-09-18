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
import io.swagger.client.model.AudiencesSubObject;
import io.swagger.client.model.CampaignCreateQueryResourceObjectAttributesCampaignmessages;
import io.swagger.client.model.SendStrategySubObject;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CampaignCreateQueryResourceObjectAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-18T16:09:09.130713678Z[GMT]")

public class CampaignCreateQueryResourceObjectAttributes {
  @SerializedName("name")
  private String name = null;

  @SerializedName("audiences")
  private AudiencesSubObject audiences = null;

  @SerializedName("send_strategy")
  private SendStrategySubObject sendStrategy = null;

  @SerializedName("send_options")
  private OneOfCampaignCreateQueryResourceObjectAttributesSendOptions sendOptions = null;

  @SerializedName("tracking_options")
  private OneOfCampaignCreateQueryResourceObjectAttributesTrackingOptions trackingOptions = null;

  @SerializedName("campaign-messages")
  private CampaignCreateQueryResourceObjectAttributesCampaignmessages campaignMessages = null;

  public CampaignCreateQueryResourceObjectAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The campaign name
   * @return name
  **/
  @Schema(example = "My new campaign", required = true, description = "The campaign name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CampaignCreateQueryResourceObjectAttributes audiences(AudiencesSubObject audiences) {
    this.audiences = audiences;
    return this;
  }

   /**
   * Get audiences
   * @return audiences
  **/
  @Schema(required = true, description = "")
  public AudiencesSubObject getAudiences() {
    return audiences;
  }

  public void setAudiences(AudiencesSubObject audiences) {
    this.audiences = audiences;
  }

  public CampaignCreateQueryResourceObjectAttributes sendStrategy(SendStrategySubObject sendStrategy) {
    this.sendStrategy = sendStrategy;
    return this;
  }

   /**
   * Get sendStrategy
   * @return sendStrategy
  **/
  @Schema(description = "")
  public SendStrategySubObject getSendStrategy() {
    return sendStrategy;
  }

  public void setSendStrategy(SendStrategySubObject sendStrategy) {
    this.sendStrategy = sendStrategy;
  }

  public CampaignCreateQueryResourceObjectAttributes sendOptions(OneOfCampaignCreateQueryResourceObjectAttributesSendOptions sendOptions) {
    this.sendOptions = sendOptions;
    return this;
  }

   /**
   * Options to use when sending a campaign
   * @return sendOptions
  **/
  @Schema(description = "Options to use when sending a campaign")
  public OneOfCampaignCreateQueryResourceObjectAttributesSendOptions getSendOptions() {
    return sendOptions;
  }

  public void setSendOptions(OneOfCampaignCreateQueryResourceObjectAttributesSendOptions sendOptions) {
    this.sendOptions = sendOptions;
  }

  public CampaignCreateQueryResourceObjectAttributes trackingOptions(OneOfCampaignCreateQueryResourceObjectAttributesTrackingOptions trackingOptions) {
    this.trackingOptions = trackingOptions;
    return this;
  }

   /**
   * The tracking options associated with the campaign
   * @return trackingOptions
  **/
  @Schema(description = "The tracking options associated with the campaign")
  public OneOfCampaignCreateQueryResourceObjectAttributesTrackingOptions getTrackingOptions() {
    return trackingOptions;
  }

  public void setTrackingOptions(OneOfCampaignCreateQueryResourceObjectAttributesTrackingOptions trackingOptions) {
    this.trackingOptions = trackingOptions;
  }

  public CampaignCreateQueryResourceObjectAttributes campaignMessages(CampaignCreateQueryResourceObjectAttributesCampaignmessages campaignMessages) {
    this.campaignMessages = campaignMessages;
    return this;
  }

   /**
   * Get campaignMessages
   * @return campaignMessages
  **/
  @Schema(required = true, description = "")
  public CampaignCreateQueryResourceObjectAttributesCampaignmessages getCampaignMessages() {
    return campaignMessages;
  }

  public void setCampaignMessages(CampaignCreateQueryResourceObjectAttributesCampaignmessages campaignMessages) {
    this.campaignMessages = campaignMessages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignCreateQueryResourceObjectAttributes campaignCreateQueryResourceObjectAttributes = (CampaignCreateQueryResourceObjectAttributes) o;
    return Objects.equals(this.name, campaignCreateQueryResourceObjectAttributes.name) &&
        Objects.equals(this.audiences, campaignCreateQueryResourceObjectAttributes.audiences) &&
        Objects.equals(this.sendStrategy, campaignCreateQueryResourceObjectAttributes.sendStrategy) &&
        Objects.equals(this.sendOptions, campaignCreateQueryResourceObjectAttributes.sendOptions) &&
        Objects.equals(this.trackingOptions, campaignCreateQueryResourceObjectAttributes.trackingOptions) &&
        Objects.equals(this.campaignMessages, campaignCreateQueryResourceObjectAttributes.campaignMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, audiences, sendStrategy, sendOptions, trackingOptions, campaignMessages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCreateQueryResourceObjectAttributes {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    audiences: ").append(toIndentedString(audiences)).append("\n");
    sb.append("    sendStrategy: ").append(toIndentedString(sendStrategy)).append("\n");
    sb.append("    sendOptions: ").append(toIndentedString(sendOptions)).append("\n");
    sb.append("    trackingOptions: ").append(toIndentedString(trackingOptions)).append("\n");
    sb.append("    campaignMessages: ").append(toIndentedString(campaignMessages)).append("\n");
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
