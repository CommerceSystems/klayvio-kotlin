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

import org.openapitools.client.models.ErrorSource

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id Unique identifier for the error.
 * @param code A code for classifying the error type.
 * @param title A high-level message about the error.
 * @param detail Specific details about the error.
 * @param source 
 */


data class APIJobErrorPayload (

    /* Unique identifier for the error. */
    @Json(name = "id")
    val id: kotlin.String,

    /* A code for classifying the error type. */
    @Json(name = "code")
    val code: kotlin.String,

    /* A high-level message about the error. */
    @Json(name = "title")
    val title: kotlin.String,

    /* Specific details about the error. */
    @Json(name = "detail")
    val detail: kotlin.String,

    @Json(name = "source")
    val source: ErrorSource

) {


}

