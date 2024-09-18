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
import io.swagger.client.model.SubscribedEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * NoEmailMarketingSubscribed
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-18T16:09:09.130713678Z[GMT]")

public class NoEmailMarketingSubscribed implements OneOfNoEmailMarketingConsentConsentStatus {
  @SerializedName("subscription")
  private SubscribedEnum subscription = null;

  @SerializedName("filters")
  private List<OneOfNoEmailMarketingSubscribedFiltersItems> filters = new ArrayList<OneOfNoEmailMarketingSubscribedFiltersItems>();

  public NoEmailMarketingSubscribed subscription(SubscribedEnum subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  @Schema(required = true, description = "")
  public SubscribedEnum getSubscription() {
    return subscription;
  }

  public void setSubscription(SubscribedEnum subscription) {
    this.subscription = subscription;
  }

  public NoEmailMarketingSubscribed filters(List<OneOfNoEmailMarketingSubscribedFiltersItems> filters) {
    this.filters = filters;
    return this;
  }

  public NoEmailMarketingSubscribed addFiltersItem(OneOfNoEmailMarketingSubscribedFiltersItems filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @Schema(required = true, description = "")
  public List<OneOfNoEmailMarketingSubscribedFiltersItems> getFilters() {
    return filters;
  }

  public void setFilters(List<OneOfNoEmailMarketingSubscribedFiltersItems> filters) {
    this.filters = filters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoEmailMarketingSubscribed noEmailMarketingSubscribed = (NoEmailMarketingSubscribed) o;
    return Objects.equals(this.subscription, noEmailMarketingSubscribed.subscription) &&
        Objects.equals(this.filters, noEmailMarketingSubscribed.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscription, filters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoEmailMarketingSubscribed {\n");
    
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
