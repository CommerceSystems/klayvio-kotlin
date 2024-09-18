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

import org.openapitools.client.models.BounceDateFilter
import org.openapitools.client.models.BounceDateFilterFilter
import org.openapitools.client.models.InvalidEmailDateEnum
import org.openapitools.client.models.InvalidEmailDateFilter
import org.openapitools.client.models.ManualSuppressionDateFilter

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param `field` 
 * @param filter 
 */


data class NoEmailMarketingFiltersInner (

    @Json(name = "field")
    val `field`: InvalidEmailDateEnum,

    @Json(name = "filter")
    val filter: BounceDateFilterFilter

) {


}

