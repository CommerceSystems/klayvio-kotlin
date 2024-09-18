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

import org.openapitools.client.models.ImageEnum
import org.openapitools.client.models.ImagePartialUpdateQueryResourceObjectAttributes

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param type 
 * @param id The ID of the image
 * @param attributes 
 */


data class ImagePartialUpdateQueryResourceObject (

    @Json(name = "type")
    val type: ImageEnum,

    /* The ID of the image */
    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "attributes")
    val attributes: ImagePartialUpdateQueryResourceObjectAttributes

) {


}

