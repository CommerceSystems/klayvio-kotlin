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

import org.openapitools.client.models.FlowMessageResponseObjectResourceAttributesContent

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param name 
 * @param channel 
 * @param content 
 * @param created 
 * @param updated 
 */


data class FlowMessageResponseObjectResourceAttributes (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "channel")
    val channel: kotlin.String,

    @Json(name = "content")
    val content: FlowMessageResponseObjectResourceAttributesContent,

    @Json(name = "created")
    val created: java.time.OffsetDateTime? = null,

    @Json(name = "updated")
    val updated: java.time.OffsetDateTime? = null

) {


}

