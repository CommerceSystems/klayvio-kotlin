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

import org.openapitools.client.models.GetTagResponseCollectionCompoundDocumentDataInnerAllOfRelationships
import org.openapitools.client.models.ObjectLinks
import org.openapitools.client.models.TagEnum
import org.openapitools.client.models.TagResponseObjectResourceAttributes

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param type 
 * @param id The Tag ID
 * @param attributes 
 * @param links 
 * @param relationships 
 */


data class GetTagResponseCollectionCompoundDocumentDataInner (

    @Json(name = "type")
    val type: TagEnum,

    /* The Tag ID */
    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "attributes")
    val attributes: TagResponseObjectResourceAttributes,

    @Json(name = "links")
    val links: ObjectLinks,

    @Json(name = "relationships")
    val relationships: GetTagResponseCollectionCompoundDocumentDataInnerAllOfRelationships? = null

) {


}

