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
import io.swagger.client.model.EmailSubscriptionParameters;
import io.swagger.client.model.SMSSubscriptionParameters;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SubscriptionChannels
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-18T16:09:09.130713678Z[GMT]")

public class SubscriptionChannels {
  @SerializedName("email")
  private EmailSubscriptionParameters email = null;

  @SerializedName("sms")
  private SMSSubscriptionParameters sms = null;

  public SubscriptionChannels email(EmailSubscriptionParameters email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(description = "")
  public EmailSubscriptionParameters getEmail() {
    return email;
  }

  public void setEmail(EmailSubscriptionParameters email) {
    this.email = email;
  }

  public SubscriptionChannels sms(SMSSubscriptionParameters sms) {
    this.sms = sms;
    return this;
  }

   /**
   * Get sms
   * @return sms
  **/
  @Schema(description = "")
  public SMSSubscriptionParameters getSms() {
    return sms;
  }

  public void setSms(SMSSubscriptionParameters sms) {
    this.sms = sms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionChannels subscriptionChannels = (SubscriptionChannels) o;
    return Objects.equals(this.email, subscriptionChannels.email) &&
        Objects.equals(this.sms, subscriptionChannels.sms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, sms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionChannels {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
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
