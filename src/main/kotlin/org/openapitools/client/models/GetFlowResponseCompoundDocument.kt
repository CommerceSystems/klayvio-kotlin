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

import org.openapitools.client.models.GetFlowResponseCollectionCompoundDocumentDataInner
import org.openapitools.client.models.GetFlowResponseCollectionCompoundDocumentIncludedInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param `data` 
 * @param included 
 */


data class GetFlowResponseCompoundDocument (

    @Json(name = "data")
    val `data`: GetFlowResponseCollectionCompoundDocumentDataInner,

    @Json(name = "included")
    val included: kotlin.collections.List<GetFlowResponseCollectionCompoundDocumentIncludedInner>? = null

) {


}

