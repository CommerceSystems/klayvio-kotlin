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

import org.openapitools.client.models.CatalogItemCreateQueryResourceObjectAttributes
import org.openapitools.client.models.CatalogItemCreateQueryResourceObjectRelationships
import org.openapitools.client.models.CatalogItemEnum

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param type 
 * @param attributes 
 * @param relationships 
 */


data class CatalogItemCreateQueryResourceObject (

    @Json(name = "type")
    val type: CatalogItemEnum,

    @Json(name = "attributes")
    val attributes: CatalogItemCreateQueryResourceObjectAttributes,

    @Json(name = "relationships")
    val relationships: CatalogItemCreateQueryResourceObjectRelationships? = null

) {


}

