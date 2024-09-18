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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param title The title of the catalog item variant.
 * @param description A description of the catalog item variant.
 * @param sku The SKU of the catalog item variant.
 * @param inventoryPolicy This field controls the visibility of this catalog item variant in product feeds/blocks. This field supports the following values: `1`: a product will not appear in dynamic product recommendation feeds and blocks if it is out of stock. `0` or `2`: a product can appear in dynamic product recommendation feeds and blocks regardless of inventory quantity.
 * @param inventoryQuantity The quantity of the catalog item variant currently in stock.
 * @param price This field can be used to set the price on the catalog item variant, which is what gets displayed for the item variant when included in emails. For most price-update use cases, you will also want to update the `price` on any parent items using the [Update Catalog Item Endpoint](https://developers.klaviyo.com/en/reference/update_catalog_item).
 * @param url URL pointing to the location of the catalog item variant on your website.
 * @param imageFullUrl URL pointing to the location of a full image of the catalog item variant.
 * @param imageThumbnailUrl URL pointing to the location of an image thumbnail of the catalog item variant.
 * @param images List of URLs pointing to the locations of images of the catalog item variant.
 * @param customMetadata Flat JSON blob to provide custom metadata about the catalog item variant. May not exceed 100kb.
 * @param published Boolean value indicating whether the catalog item variant is published.
 */


data class CatalogVariantUpdateQueryResourceObjectAttributes (

    /* The title of the catalog item variant. */
    @Json(name = "title")
    val title: kotlin.String? = null,

    /* A description of the catalog item variant. */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* The SKU of the catalog item variant. */
    @Json(name = "sku")
    val sku: kotlin.String? = null,

    /* This field controls the visibility of this catalog item variant in product feeds/blocks. This field supports the following values: `1`: a product will not appear in dynamic product recommendation feeds and blocks if it is out of stock. `0` or `2`: a product can appear in dynamic product recommendation feeds and blocks regardless of inventory quantity. */
    @Json(name = "inventory_policy")
    val inventoryPolicy: CatalogVariantUpdateQueryResourceObjectAttributes.InventoryPolicy? = null,

    /* The quantity of the catalog item variant currently in stock. */
    @Json(name = "inventory_quantity")
    val inventoryQuantity: java.math.BigDecimal? = null,

    /* This field can be used to set the price on the catalog item variant, which is what gets displayed for the item variant when included in emails. For most price-update use cases, you will also want to update the `price` on any parent items using the [Update Catalog Item Endpoint](https://developers.klaviyo.com/en/reference/update_catalog_item). */
    @Json(name = "price")
    val price: java.math.BigDecimal? = null,

    /* URL pointing to the location of the catalog item variant on your website. */
    @Json(name = "url")
    val url: kotlin.String? = null,

    /* URL pointing to the location of a full image of the catalog item variant. */
    @Json(name = "image_full_url")
    val imageFullUrl: kotlin.String? = null,

    /* URL pointing to the location of an image thumbnail of the catalog item variant. */
    @Json(name = "image_thumbnail_url")
    val imageThumbnailUrl: kotlin.String? = null,

    /* List of URLs pointing to the locations of images of the catalog item variant. */
    @Json(name = "images")
    val images: kotlin.collections.List<kotlin.String>? = null,

    /* Flat JSON blob to provide custom metadata about the catalog item variant. May not exceed 100kb. */
    @Json(name = "custom_metadata")
    val customMetadata: kotlin.Any? = null,

    /* Boolean value indicating whether the catalog item variant is published. */
    @Json(name = "published")
    val published: kotlin.Boolean? = null

) {

    /**
     * This field controls the visibility of this catalog item variant in product feeds/blocks. This field supports the following values: `1`: a product will not appear in dynamic product recommendation feeds and blocks if it is out of stock. `0` or `2`: a product can appear in dynamic product recommendation feeds and blocks regardless of inventory quantity.
     *
     * Values: _0,_1,_2
     */
    @JsonClass(generateAdapter = false)
    enum class InventoryPolicy(val value: kotlin.Int) {
        @Json(name = "0") _0(0),
        @Json(name = "1") _1(1),
        @Json(name = "2") _2(2);
    }

}

