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

import org.openapitools.client.models.GetFlowMessageResponseCompoundDocumentData
import org.openapitools.client.models.GetFlowMessageResponseCompoundDocumentIncludedInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param `data` 
 * @param included 
 */


data class GetFlowMessageResponseCompoundDocument (

    @Json(name = "data")
    val `data`: GetFlowMessageResponseCompoundDocumentData,

    @Json(name = "included")
    val included: kotlin.collections.List<GetFlowMessageResponseCompoundDocumentIncludedInner>? = null

) {


}

