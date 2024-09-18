# PostCatalogCategoryResponseData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**CatalogCategoryEnum**](CatalogCategoryEnum.md) |  | 
**id** | **String** | The catalog category ID is a compound ID (string), with format: &#x60;{integration}:::{catalog}:::{external_id}&#x60;. Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog is &#x60;$default&#x60;. | 
**attributes** | [**CatalogCategoryResponseObjectResourceAttributes**](CatalogCategoryResponseObjectResourceAttributes.md) |  | 
**relationships** | [**PostCatalogCategoryResponseDataRelationships**](PostCatalogCategoryResponseDataRelationships.md) |  |  [optional]
**links** | [**ObjectLinks**](ObjectLinks.md) |  | 
