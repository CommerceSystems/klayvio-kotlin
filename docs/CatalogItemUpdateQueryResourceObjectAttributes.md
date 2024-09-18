# CatalogItemUpdateQueryResourceObjectAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** | The title of the catalog item. |  [optional]
**price** | [**BigDecimal**](BigDecimal.md) | This field can be used to set the price on the catalog item, which is what gets displayed for the item when included in emails. For most price-update use cases, you will also want to update the &#x60;price&#x60; on any child variants, using the [Update Catalog Variant Endpoint](https://developers.klaviyo.com/en/reference/update_catalog_variant). |  [optional]
**description** | **String** | A description of the catalog item. |  [optional]
**url** | **String** | URL pointing to the location of the catalog item on your website. |  [optional]
**imageFullUrl** | **String** | URL pointing to the location of a full image of the catalog item. |  [optional]
**imageThumbnailUrl** | **String** | URL pointing to the location of an image thumbnail of the catalog item |  [optional]
**images** | **List&lt;String&gt;** | List of URLs pointing to the locations of images of the catalog item. |  [optional]
**customMetadata** | **Object** | Flat JSON blob to provide custom metadata about the catalog item. May not exceed 100kb. |  [optional]
**published** | **Boolean** | Boolean value indicating whether the catalog item is published. |  [optional]
