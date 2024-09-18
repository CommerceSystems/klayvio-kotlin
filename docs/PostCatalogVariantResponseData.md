# PostCatalogVariantResponseData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**CatalogVariantEnum**](CatalogVariantEnum.md) |  | 
**id** | **String** | The catalog variant ID is a compound ID (string), with format: &#x60;{integration}:::{catalog}:::{external_id}&#x60;. Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog is &#x60;$default&#x60;. | 
**attributes** | [**CatalogVariantResponseObjectResourceAttributes**](CatalogVariantResponseObjectResourceAttributes.md) |  | 
**relationships** | [**PostCatalogVariantResponseDataRelationships**](PostCatalogVariantResponseDataRelationships.md) |  |  [optional]
**links** | [**ObjectLinks**](ObjectLinks.md) |  | 
