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

import org.openapitools.client.models.ListEnum
import org.openapitools.client.models.ListListResponseObjectResourceAttributes
import org.openapitools.client.models.ObjectLinks

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param type 
 * @param id Primary key that uniquely identifies this list. Generated by Klaviyo.
 * @param attributes 
 * @param links 
 */


data class ListRetrieveResponseObjectResource (

    @Json(name = "type")
    val type: ListEnum,

    /* Primary key that uniquely identifies this list. Generated by Klaviyo. */
    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "attributes")
    val attributes: ListListResponseObjectResourceAttributes,

    @Json(name = "links")
    val links: ObjectLinks

) {


}

