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

import org.openapitools.client.models.CatalogCategoryEnum
import org.openapitools.client.models.CatalogCategoryResponseObjectResourceAttributes
import org.openapitools.client.models.GetCatalogCategoryResponseCollectionDataInnerAllOfRelationships
import org.openapitools.client.models.ObjectLinks

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param type 
 * @param id The catalog category ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
 * @param attributes 
 * @param links 
 * @param relationships 
 */


data class GetCatalogCategoryResponseCollectionDataInner (

    @Json(name = "type")
    val type: CatalogCategoryEnum,

    /* The catalog category ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`. */
    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "attributes")
    val attributes: CatalogCategoryResponseObjectResourceAttributes,

    @Json(name = "links")
    val links: ObjectLinks,

    @Json(name = "relationships")
    val relationships: GetCatalogCategoryResponseCollectionDataInnerAllOfRelationships? = null

) {


}

