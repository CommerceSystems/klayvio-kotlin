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

import org.openapitools.client.models.FormEnum
import org.openapitools.client.models.FormResponseObjectResourceAttributes
import org.openapitools.client.models.GetFormResponseCollectionCompoundDocumentDataInnerAllOfRelationships
import org.openapitools.client.models.ObjectLinks

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param type 
 * @param id ID of the form. Generated by Klaviyo.
 * @param attributes 
 * @param links 
 * @param relationships 
 */


data class GetFormResponseCollectionCompoundDocumentDataInner (

    @Json(name = "type")
    val type: FormEnum,

    /* ID of the form. Generated by Klaviyo. */
    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "attributes")
    val attributes: FormResponseObjectResourceAttributes,

    @Json(name = "links")
    val links: ObjectLinks,

    @Json(name = "relationships")
    val relationships: GetFormResponseCollectionCompoundDocumentDataInnerAllOfRelationships? = null

) {


}

