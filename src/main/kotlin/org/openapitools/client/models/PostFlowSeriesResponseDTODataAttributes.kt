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

import org.openapitools.client.models.SeriesData

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param results An array of all the returned values data. Each object in the array represents one unique grouping and the results for that grouping. Each value in the results array corresponds to the date time at the same index.
 * @param dateTimes An array of date times which correspond to the equivalent index in the results data.
 */


data class PostFlowSeriesResponseDTODataAttributes (

    /* An array of all the returned values data. Each object in the array represents one unique grouping and the results for that grouping. Each value in the results array corresponds to the date time at the same index. */
    @Json(name = "results")
    val results: kotlin.collections.List<SeriesData>,

    /* An array of date times which correspond to the equivalent index in the results data. */
    @Json(name = "date_times")
    val dateTimes: kotlin.collections.List<java.time.OffsetDateTime>

) {


}

