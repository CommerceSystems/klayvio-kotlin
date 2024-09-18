/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.CampaignValuesRequestDTOResourceObjectAttributesTimeframe

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param statistics List of statistics to query for. All rate statistics will be returned in fractional form [0.0, 1.0]
 * @param timeframe 
 * @param interval The interval used to aggregate data within the series request. If hourly is used, the timeframe cannot be longer than 7 days. If daily is used, the timeframe cannot be longer than 60 days. If monthly is used, the timeframe cannot be longer than 52 weeks.
 * @param conversionMetricId ID of the metric to be used for conversion statistics
 * @param filter API filter string used to filter the query. Allowed filters are flow_id, send_channel, flow_message_id. Allowed operators are equals, contains-any. Only one filter can be used per attribute, only AND can be used as a combination operator. Max of 100 messages per ANY filter. When filtering on send_channel, allowed values are email, push-notification, sms.
 */


data class FlowSeriesRequestDTOResourceObjectAttributes (

    /* List of statistics to query for. All rate statistics will be returned in fractional form [0.0, 1.0] */
    @Json(name = "statistics")
    val statistics: kotlin.collections.List<FlowSeriesRequestDTOResourceObjectAttributes.Statistics>,

    @Json(name = "timeframe")
    val timeframe: CampaignValuesRequestDTOResourceObjectAttributesTimeframe,

    /* The interval used to aggregate data within the series request. If hourly is used, the timeframe cannot be longer than 7 days. If daily is used, the timeframe cannot be longer than 60 days. If monthly is used, the timeframe cannot be longer than 52 weeks. */
    @Json(name = "interval")
    val interval: FlowSeriesRequestDTOResourceObjectAttributes.Interval,

    /* ID of the metric to be used for conversion statistics */
    @Json(name = "conversion_metric_id")
    val conversionMetricId: kotlin.String,

    /* API filter string used to filter the query. Allowed filters are flow_id, send_channel, flow_message_id. Allowed operators are equals, contains-any. Only one filter can be used per attribute, only AND can be used as a combination operator. Max of 100 messages per ANY filter. When filtering on send_channel, allowed values are email, push-notification, sms. */
    @Json(name = "filter")
    val filter: kotlin.String? = null

) {

    /**
     * List of statistics to query for. All rate statistics will be returned in fractional form [0.0, 1.0]
     *
     * Values: average_order_value,bounce_rate,bounced,bounced_or_failed,bounced_or_failed_rate,click_rate,click_to_open_rate,clicks,clicks_unique,conversion_rate,conversion_uniques,conversion_value,conversions,delivered,delivery_rate,failed,failed_rate,open_rate,opens,opens_unique,recipients,revenue_per_recipient,spam_complaint_rate,spam_complaints,unsubscribe_rate,unsubscribe_uniques,unsubscribes
     */
    @JsonClass(generateAdapter = false)
    enum class Statistics(val value: kotlin.String) {
        @Json(name = "average_order_value") average_order_value("average_order_value"),
        @Json(name = "bounce_rate") bounce_rate("bounce_rate"),
        @Json(name = "bounced") bounced("bounced"),
        @Json(name = "bounced_or_failed") bounced_or_failed("bounced_or_failed"),
        @Json(name = "bounced_or_failed_rate") bounced_or_failed_rate("bounced_or_failed_rate"),
        @Json(name = "click_rate") click_rate("click_rate"),
        @Json(name = "click_to_open_rate") click_to_open_rate("click_to_open_rate"),
        @Json(name = "clicks") clicks("clicks"),
        @Json(name = "clicks_unique") clicks_unique("clicks_unique"),
        @Json(name = "conversion_rate") conversion_rate("conversion_rate"),
        @Json(name = "conversion_uniques") conversion_uniques("conversion_uniques"),
        @Json(name = "conversion_value") conversion_value("conversion_value"),
        @Json(name = "conversions") conversions("conversions"),
        @Json(name = "delivered") delivered("delivered"),
        @Json(name = "delivery_rate") delivery_rate("delivery_rate"),
        @Json(name = "failed") failed("failed"),
        @Json(name = "failed_rate") failed_rate("failed_rate"),
        @Json(name = "open_rate") open_rate("open_rate"),
        @Json(name = "opens") opens("opens"),
        @Json(name = "opens_unique") opens_unique("opens_unique"),
        @Json(name = "recipients") recipients("recipients"),
        @Json(name = "revenue_per_recipient") revenue_per_recipient("revenue_per_recipient"),
        @Json(name = "spam_complaint_rate") spam_complaint_rate("spam_complaint_rate"),
        @Json(name = "spam_complaints") spam_complaints("spam_complaints"),
        @Json(name = "unsubscribe_rate") unsubscribe_rate("unsubscribe_rate"),
        @Json(name = "unsubscribe_uniques") unsubscribe_uniques("unsubscribe_uniques"),
        @Json(name = "unsubscribes") unsubscribes("unsubscribes");
    }
    /**
     * The interval used to aggregate data within the series request. If hourly is used, the timeframe cannot be longer than 7 days. If daily is used, the timeframe cannot be longer than 60 days. If monthly is used, the timeframe cannot be longer than 52 weeks.
     *
     * Values: daily,hourly,monthly,weekly
     */
    @JsonClass(generateAdapter = false)
    enum class Interval(val value: kotlin.String) {
        @Json(name = "daily") daily("daily"),
        @Json(name = "hourly") hourly("hourly"),
        @Json(name = "monthly") monthly("monthly"),
        @Json(name = "weekly") weekly("weekly");
    }

}

