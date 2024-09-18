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
 * @param pointer A pointer to the source of the error in the request payload.
 */


data class ErrorSource (

    /* A pointer to the source of the error in the request payload. */
    @Json(name = "pointer")
    val pointer: kotlin.String? = "/data"

) {


}

