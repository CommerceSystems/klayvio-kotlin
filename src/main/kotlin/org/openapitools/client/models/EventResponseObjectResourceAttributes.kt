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
 * @param timestamp Event timestamp in seconds
 * @param eventProperties Event properties, can include identifiers and extra properties
 * @param datetime Event timestamp in ISO8601 format (YYYY-MM-DDTHH:MM:SS+hh:mm)
 * @param uuid A unique identifier for the event, this can be used as a cursor in pagination
 */


data class EventResponseObjectResourceAttributes (

    /* Event timestamp in seconds */
    @Json(name = "timestamp")
    val timestamp: kotlin.Int? = null,

    /* Event properties, can include identifiers and extra properties */
    @Json(name = "event_properties")
    val eventProperties: kotlin.Any? = null,

    /* Event timestamp in ISO8601 format (YYYY-MM-DDTHH:MM:SS+hh:mm) */
    @Json(name = "datetime")
    val datetime: java.time.OffsetDateTime? = null,

    /* A unique identifier for the event, this can be used as a cursor in pagination */
    @Json(name = "uuid")
    val uuid: kotlin.String? = null

) {


}

