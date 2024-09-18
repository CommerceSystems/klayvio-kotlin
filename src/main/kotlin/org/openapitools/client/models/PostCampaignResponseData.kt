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

import org.openapitools.client.models.CampaignEnum
import org.openapitools.client.models.CampaignResponseObjectResourceAttributes
import org.openapitools.client.models.GetCampaignResponseCollectionCompoundDocumentDataInnerAllOfRelationships
import org.openapitools.client.models.ObjectLinks

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param type 
 * @param id The campaign ID
 * @param attributes 
 * @param links 
 * @param relationships 
 */


data class PostCampaignResponseData (

    @Json(name = "type")
    val type: CampaignEnum,

    /* The campaign ID */
    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "attributes")
    val attributes: CampaignResponseObjectResourceAttributes,

    @Json(name = "links")
    val links: ObjectLinks,

    @Json(name = "relationships")
    val relationships: GetCampaignResponseCollectionCompoundDocumentDataInnerAllOfRelationships? = null

) {


}

