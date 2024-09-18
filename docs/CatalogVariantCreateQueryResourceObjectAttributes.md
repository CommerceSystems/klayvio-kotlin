# CatalogVariantCreateQueryResourceObjectAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**externalId** | **String** | The ID of the catalog item variant in an external system. | 
**catalogType** | **String** | The type of catalog. Currently only \&quot;$default\&quot; is supported. |  [optional]
**integrationType** | [**IntegrationTypeEnum**](#IntegrationTypeEnum) | The integration type. Currently only \&quot;$custom\&quot; is supported. |  [optional]
**title** | **String** | The title of the catalog item variant. | 
**description** | **String** | A description of the catalog item variant. | 
**sku** | **String** | The SKU of the catalog item variant. | 
**inventoryPolicy** | [**InventoryPolicyEnum**](#InventoryPolicyEnum) | This field controls the visibility of this catalog item variant in product feeds/blocks. This field supports the following values: &#x60;1&#x60;: a product will not appear in dynamic product recommendation feeds and blocks if it is out of stock. &#x60;0&#x60; or &#x60;2&#x60;: a product can appear in dynamic product recommendation feeds and blocks regardless of inventory quantity. |  [optional]
**inventoryQuantity** | [**BigDecimal**](BigDecimal.md) | The quantity of the catalog item variant currently in stock. | 
**price** | [**BigDecimal**](BigDecimal.md) | This field can be used to set the price on the catalog item variant, which is what gets displayed for the item variant when included in emails. For most price-update use cases, you will also want to update the &#x60;price&#x60; on any parent items using the [Update Catalog Item Endpoint](https://developers.klaviyo.com/en/reference/update_catalog_item). | 
**url** | **String** | URL pointing to the location of the catalog item variant on your website. | 
**imageFullUrl** | **String** | URL pointing to the location of a full image of the catalog item variant. |  [optional]
**imageThumbnailUrl** | **String** | URL pointing to the location of an image thumbnail of the catalog item variant. |  [optional]
**images** | **List&lt;String&gt;** | List of URLs pointing to the locations of images of the catalog item variant. |  [optional]
**customMetadata** | **Object** | Flat JSON blob to provide custom metadata about the catalog item variant. May not exceed 100kb. |  [optional]
**published** | **Boolean** | Boolean value indicating whether the catalog item variant is published. |  [optional]

<a name="IntegrationTypeEnum"></a>
## Enum: IntegrationTypeEnum
Name | Value
---- | -----
_CUSTOM | &quot;$custom&quot;

<a name="InventoryPolicyEnum"></a>
## Enum: InventoryPolicyEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2
