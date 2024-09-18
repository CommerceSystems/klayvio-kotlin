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

import org.openapitools.client.models.CatalogCategoryBulkCreateJobEnum
import org.openapitools.client.models.CouponCodeCreateJobResponseObjectResourceAttributes
import org.openapitools.client.models.GetCatalogCategoryCreateJobResponseCollectionCompoundDocumentDataInnerAllOfRelationships
import org.openapitools.client.models.ObjectLinks

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param type 
 * @param id Unique identifier for retrieving the job. Generated by Klaviyo.
 * @param attributes 
 * @param links 
 * @param relationships 
 */


data class PostCatalogCategoryCreateJobResponseData (

    @Json(name = "type")
    val type: CatalogCategoryBulkCreateJobEnum,

    /* Unique identifier for retrieving the job. Generated by Klaviyo. */
    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "attributes")
    val attributes: CouponCodeCreateJobResponseObjectResourceAttributes,

    @Json(name = "links")
    val links: ObjectLinks,

    @Json(name = "relationships")
    val relationships: GetCatalogCategoryCreateJobResponseCollectionCompoundDocumentDataInnerAllOfRelationships? = null

) {


}

