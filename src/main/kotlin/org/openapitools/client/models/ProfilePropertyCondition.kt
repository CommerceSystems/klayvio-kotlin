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

import org.openapitools.client.models.ProfilePropertyConditionFilter
import org.openapitools.client.models.ProfilePropertyEnum

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param type 
 * @param `property` 
 * @param filter 
 */


data class ProfilePropertyCondition (

    @Json(name = "type")
    val type: ProfilePropertyEnum,

    @Json(name = "property")
    val `property`: kotlin.String,

    @Json(name = "filter")
    val filter: ProfilePropertyConditionFilter

) {


}

