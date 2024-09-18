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

import org.openapitools.client.models.GetFlowActionResponseCompoundDocumentDataAllOfRelationshipsFlowMessages
import org.openapitools.client.models.PostListCreateResponseDataRelationshipsFlowTriggers

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param flows 
 * @param flowMessages 
 */


data class PostFlowValuesResponseDTODataRelationships (

    @Json(name = "flows")
    val flows: PostListCreateResponseDataRelationshipsFlowTriggers? = null,

    @Json(name = "flow-messages")
    val flowMessages: GetFlowActionResponseCompoundDocumentDataAllOfRelationshipsFlowMessages? = null

) {


}

