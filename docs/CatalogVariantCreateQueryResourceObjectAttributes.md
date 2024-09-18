
# CatalogVariantCreateQueryResourceObjectAttributes

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **externalId** | **kotlin.String** | The ID of the catalog item variant in an external system. |  |
| **title** | **kotlin.String** | The title of the catalog item variant. |  |
| **description** | **kotlin.String** | A description of the catalog item variant. |  |
| **sku** | **kotlin.String** | The SKU of the catalog item variant. |  |
| **inventoryQuantity** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The quantity of the catalog item variant currently in stock. |  |
| **price** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | This field can be used to set the price on the catalog item variant, which is what gets displayed for the item variant when included in emails. For most price-update use cases, you will also want to update the &#x60;price&#x60; on any parent items using the [Update Catalog Item Endpoint](https://developers.klaviyo.com/en/reference/update_catalog_item). |  |
| **url** | **kotlin.String** | URL pointing to the location of the catalog item variant on your website. |  |
| **catalogType** | **kotlin.String** | The type of catalog. Currently only \&quot;$default\&quot; is supported. |  [optional] |
| **integrationType** | [**inline**](#IntegrationType) | The integration type. Currently only \&quot;$custom\&quot; is supported. |  [optional] |
| **inventoryPolicy** | [**inline**](#InventoryPolicy) | This field controls the visibility of this catalog item variant in product feeds/blocks. This field supports the following values: &#x60;1&#x60;: a product will not appear in dynamic product recommendation feeds and blocks if it is out of stock. &#x60;0&#x60; or &#x60;2&#x60;: a product can appear in dynamic product recommendation feeds and blocks regardless of inventory quantity. |  [optional] |
| **imageFullUrl** | **kotlin.String** | URL pointing to the location of a full image of the catalog item variant. |  [optional] |
| **imageThumbnailUrl** | **kotlin.String** | URL pointing to the location of an image thumbnail of the catalog item variant. |  [optional] |
| **images** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of URLs pointing to the locations of images of the catalog item variant. |  [optional] |
| **customMetadata** | [**kotlin.Any**](.md) | Flat JSON blob to provide custom metadata about the catalog item variant. May not exceed 100kb. |  [optional] |
| **published** | **kotlin.Boolean** | Boolean value indicating whether the catalog item variant is published. |  [optional] |


<a id="IntegrationType"></a>
## Enum: integration_type
| Name | Value |
| ---- | ----- |
| integrationType | $custom |


<a id="InventoryPolicy"></a>
## Enum: inventory_policy
| Name | Value |
| ---- | ----- |
| inventoryPolicy | 0, 1, 2 |



