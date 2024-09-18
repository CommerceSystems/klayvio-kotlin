
# CatalogItemUpdateQueryResourceObject

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**CatalogItemEnum**](CatalogItemEnum.md) |  |  |
| **id** | **kotlin.String** | The catalog item ID is a compound ID (string), with format: &#x60;{integration}:::{catalog}:::{external_id}&#x60;. Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog is &#x60;$default&#x60;. |  |
| **attributes** | [**CatalogItemUpdateQueryResourceObjectAttributes**](CatalogItemUpdateQueryResourceObjectAttributes.md) |  |  |
| **relationships** | [**CatalogItemCreateQueryResourceObjectRelationships**](CatalogItemCreateQueryResourceObjectRelationships.md) |  |  [optional] |



