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

import org.openapitools.client.models.ProfileEnum

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param type 
 * @param id Related Profile ID
 */


data class GetEventProfilesRelationshipListResponseData (

    @Json(name = "type")
    val type: ProfileEnum,

    /* Related Profile ID */
    @Json(name = "id")
    val id: kotlin.String

) {


}

