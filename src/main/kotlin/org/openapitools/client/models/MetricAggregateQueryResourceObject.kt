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

import org.openapitools.client.models.MetricAggregateEnum
import org.openapitools.client.models.MetricAggregateQueryResourceObjectAttributes

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param type 
 * @param attributes 
 */


data class MetricAggregateQueryResourceObject (

    @Json(name = "type")
    val type: MetricAggregateEnum,

    @Json(name = "attributes")
    val attributes: MetricAggregateQueryResourceObjectAttributes

) {


}

