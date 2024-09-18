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

import org.openapitools.client.models.GetWebhookResponseCollectionCompoundDocumentDataInnerAllOfRelationships
import org.openapitools.client.models.ObjectLinks
import org.openapitools.client.models.WebhookEnum
import org.openapitools.client.models.WebhookResponseObjectResourceAttributes

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param type 
 * @param id The ID of the webhook.
 * @param attributes 
 * @param links 
 * @param relationships 
 */


data class GetWebhookResponseCollectionCompoundDocumentDataInner (

    @Json(name = "type")
    val type: WebhookEnum,

    /* The ID of the webhook. */
    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "attributes")
    val attributes: WebhookResponseObjectResourceAttributes,

    @Json(name = "links")
    val links: ObjectLinks,

    @Json(name = "relationships")
    val relationships: GetWebhookResponseCollectionCompoundDocumentDataInnerAllOfRelationships? = null

) {


}

