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
import io.swagger.client.model.EmailEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * NoEmailMarketingConsent
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-18T16:09:09.130713678Z[GMT]")

public class NoEmailMarketingConsent implements OneOfProfileMarketingConsentConditionConsent {
  @SerializedName("channel")
  private EmailEnum channel = null;

  @SerializedName("can_receive_marketing")
  private Boolean canReceiveMarketing = null;

  @SerializedName("consent_status")
  private OneOfNoEmailMarketingConsentConsentStatus consentStatus = null;

  public NoEmailMarketingConsent channel(EmailEnum channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @Schema(required = true, description = "")
  public EmailEnum getChannel() {
    return channel;
  }

  public void setChannel(EmailEnum channel) {
    this.channel = channel;
  }

  public NoEmailMarketingConsent canReceiveMarketing(Boolean canReceiveMarketing) {
    this.canReceiveMarketing = canReceiveMarketing;
    return this;
  }

   /**
   * Get canReceiveMarketing
   * @return canReceiveMarketing
  **/
  @Schema(required = true, description = "")
  public Boolean getCanReceiveMarketing() {
    return canReceiveMarketing;
  }

  public void setCanReceiveMarketing(Boolean canReceiveMarketing) {
    this.canReceiveMarketing = canReceiveMarketing;
  }

  public NoEmailMarketingConsent consentStatus(OneOfNoEmailMarketingConsentConsentStatus consentStatus) {
    this.consentStatus = consentStatus;
    return this;
  }

   /**
   * Get consentStatus
   * @return consentStatus
  **/
  @Schema(required = true, description = "")
  public OneOfNoEmailMarketingConsentConsentStatus getConsentStatus() {
    return consentStatus;
  }

  public void setConsentStatus(OneOfNoEmailMarketingConsentConsentStatus consentStatus) {
    this.consentStatus = consentStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoEmailMarketingConsent noEmailMarketingConsent = (NoEmailMarketingConsent) o;
    return Objects.equals(this.channel, noEmailMarketingConsent.channel) &&
        Objects.equals(this.canReceiveMarketing, noEmailMarketingConsent.canReceiveMarketing) &&
        Objects.equals(this.consentStatus, noEmailMarketingConsent.consentStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, canReceiveMarketing, consentStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoEmailMarketingConsent {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    canReceiveMarketing: ").append(toIndentedString(canReceiveMarketing)).append("\n");
    sb.append("    consentStatus: ").append(toIndentedString(consentStatus)).append("\n");
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
