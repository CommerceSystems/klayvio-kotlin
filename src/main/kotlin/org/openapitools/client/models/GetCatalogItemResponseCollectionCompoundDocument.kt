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

import org.openapitools.client.models.CatalogVariantResponseObjectResource
import org.openapitools.client.models.CollectionLinks
import org.openapitools.client.models.GetCatalogItemResponseCollectionCompoundDocumentDataInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param `data` 
 * @param links 
 * @param included 
 */


data class GetCatalogItemResponseCollectionCompoundDocument (

    @Json(name = "data")
    val `data`: kotlin.collections.List<GetCatalogItemResponseCollectionCompoundDocumentDataInner>,

    @Json(name = "links")
    val links: CollectionLinks? = null,

    @Json(name = "included")
    val included: kotlin.collections.List<CatalogVariantResponseObjectResource>? = null

) {


}

