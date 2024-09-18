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

import org.openapitools.client.models.ObjectLinks
import org.openapitools.client.models.SegmentEnum
import org.openapitools.client.models.SegmentListResponseObjectResourceAttributes

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param type 
 * @param id 
 * @param attributes 
 * @param links 
 */


data class SegmentRetrieveResponseObjectResource (

    @Json(name = "type")
    val type: SegmentEnum,

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "attributes")
    val attributes: SegmentListResponseObjectResourceAttributes,

    @Json(name = "links")
    val links: ObjectLinks

) {


}

