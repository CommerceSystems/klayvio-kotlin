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

import org.openapitools.client.models.GetFlowActionResponseCompoundDocumentDataAllOfRelationshipsFlowMessagesDataInner
import org.openapitools.client.models.RelationshipLinks

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param `data` 
 * @param links 
 */


data class GetFlowActionResponseCompoundDocumentDataAllOfRelationshipsFlowMessages (

    @Json(name = "data")
    val `data`: kotlin.collections.List<GetFlowActionResponseCompoundDocumentDataAllOfRelationshipsFlowMessagesDataInner>? = null,

    @Json(name = "links")
    val links: RelationshipLinks? = null

) {


}

