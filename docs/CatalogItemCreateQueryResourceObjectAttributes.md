
# CatalogItemCreateQueryResourceObjectAttributes

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **externalId** | **kotlin.String** | The ID of the catalog item in an external system. |  |
| **title** | **kotlin.String** | The title of the catalog item. |  |
| **description** | **kotlin.String** | A description of the catalog item. |  |
| **url** | **kotlin.String** | URL pointing to the location of the catalog item on your website. |  |
| **integrationType** | [**inline**](#IntegrationType) | The integration type. Currently only \&quot;$custom\&quot; is supported. |  [optional] |
| **price** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | This field can be used to set the price on the catalog item, which is what gets displayed for the item when included in emails. For most price-update use cases, you will also want to update the &#x60;price&#x60; on any child variants, using the [Update Catalog Variant Endpoint](https://developers.klaviyo.com/en/reference/update_catalog_variant). |  [optional] |
| **catalogType** | **kotlin.String** | The type of catalog. Currently only \&quot;$default\&quot; is supported. |  [optional] |
| **imageFullUrl** | **kotlin.String** | URL pointing to the location of a full image of the catalog item. |  [optional] |
| **imageThumbnailUrl** | **kotlin.String** | URL pointing to the location of an image thumbnail of the catalog item |  [optional] |
| **images** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of URLs pointing to the locations of images of the catalog item. |  [optional] |
| **customMetadata** | [**kotlin.Any**](.md) | Flat JSON blob to provide custom metadata about the catalog item. May not exceed 100kb. |  [optional] |
| **published** | **kotlin.Boolean** | Boolean value indicating whether the catalog item is published. |  [optional] |


<a id="IntegrationType"></a>
## Enum: integration_type
| Name | Value |
| ---- | ----- |
| integrationType | $custom |



