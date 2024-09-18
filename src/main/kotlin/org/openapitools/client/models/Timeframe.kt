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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param key Pre-defined key that represents a set timeframe
 */


data class Timeframe (

    /* Pre-defined key that represents a set timeframe */
    @Json(name = "key")
    val key: Timeframe.Key

) {

    /**
     * Pre-defined key that represents a set timeframe
     *
     * Values: last_12_months,last_30_days,last_365_days,last_3_months,last_7_days,last_90_days,last_month,last_week,last_year,this_month,this_week,this_year,today,yesterday
     */
    @JsonClass(generateAdapter = false)
    enum class Key(val value: kotlin.String) {
        @Json(name = "last_12_months") last_12_months("last_12_months"),
        @Json(name = "last_30_days") last_30_days("last_30_days"),
        @Json(name = "last_365_days") last_365_days("last_365_days"),
        @Json(name = "last_3_months") last_3_months("last_3_months"),
        @Json(name = "last_7_days") last_7_days("last_7_days"),
        @Json(name = "last_90_days") last_90_days("last_90_days"),
        @Json(name = "last_month") last_month("last_month"),
        @Json(name = "last_week") last_week("last_week"),
        @Json(name = "last_year") last_year("last_year"),
        @Json(name = "this_month") this_month("this_month"),
        @Json(name = "this_week") this_week("this_week"),
        @Json(name = "this_year") this_year("this_year"),
        @Json(name = "today") today("today"),
        @Json(name = "yesterday") yesterday("yesterday");
    }

}

