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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * PushMarketing
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-18T16:09:09.130713678Z[GMT]")

public class PushMarketing {
  @SerializedName("can_receive_push_marketing")
  private Boolean canReceivePushMarketing = null;

  @SerializedName("consent")
  private String consent = null;

  @SerializedName("consent_timestamp")
  private OffsetDateTime consentTimestamp = null;

  public PushMarketing canReceivePushMarketing(Boolean canReceivePushMarketing) {
    this.canReceivePushMarketing = canReceivePushMarketing;
    return this;
  }

   /**
   * Whether or not this profile is subscribed to receive mobile push.
   * @return canReceivePushMarketing
  **/
  @Schema(required = true, description = "Whether or not this profile is subscribed to receive mobile push.")
  public Boolean isCanReceivePushMarketing() {
    return canReceivePushMarketing;
  }

  public void setCanReceivePushMarketing(Boolean canReceivePushMarketing) {
    this.canReceivePushMarketing = canReceivePushMarketing;
  }

  public PushMarketing consent(String consent) {
    this.consent = consent;
    return this;
  }

   /**
   * The consent status for mobile push marketing.
   * @return consent
  **/
  @Schema(example = "SUBSCRIBED", required = true, description = "The consent status for mobile push marketing.")
  public String getConsent() {
    return consent;
  }

  public void setConsent(String consent) {
    this.consent = consent;
  }

  public PushMarketing consentTimestamp(OffsetDateTime consentTimestamp) {
    this.consentTimestamp = consentTimestamp;
    return this;
  }

   /**
   * The timestamp when the consent was last changed, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
   * @return consentTimestamp
  **/
  @Schema(example = "2023-02-21T20:07:38Z", description = "The timestamp when the consent was last changed, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).")
  public OffsetDateTime getConsentTimestamp() {
    return consentTimestamp;
  }

  public void setConsentTimestamp(OffsetDateTime consentTimestamp) {
    this.consentTimestamp = consentTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushMarketing pushMarketing = (PushMarketing) o;
    return Objects.equals(this.canReceivePushMarketing, pushMarketing.canReceivePushMarketing) &&
        Objects.equals(this.consent, pushMarketing.consent) &&
        Objects.equals(this.consentTimestamp, pushMarketing.consentTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canReceivePushMarketing, consent, consentTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushMarketing {\n");
    
    sb.append("    canReceivePushMarketing: ").append(toIndentedString(canReceivePushMarketing)).append("\n");
    sb.append("    consent: ").append(toIndentedString(consent)).append("\n");
    sb.append("    consentTimestamp: ").append(toIndentedString(consentTimestamp)).append("\n");
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
