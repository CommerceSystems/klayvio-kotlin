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

import org.openapitools.client.models.FlowEnum
import org.openapitools.client.models.FlowUpdateQueryResourceObjectAttributes

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param type 
 * @param id ID of the Flow to update. Ex: XVTP5Q
 * @param attributes 
 */


data class FlowUpdateQueryResourceObject (

    @Json(name = "type")
    val type: FlowEnum,

    /* ID of the Flow to update. Ex: XVTP5Q */
    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "attributes")
    val attributes: FlowUpdateQueryResourceObjectAttributes

) {


}

