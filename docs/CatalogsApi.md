# CatalogsApi

All URIs are relative to *https://a.klaviyo.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createBackInStockSubscription**](CatalogsApi.md#createBackInStockSubscription) | **POST** /api/back-in-stock-subscriptions/ | Create Back In Stock Subscription |
| [**createCatalogCategory**](CatalogsApi.md#createCatalogCategory) | **POST** /api/catalog-categories/ | Create Catalog Category |
| [**createCatalogCategoryRelationshipsItems**](CatalogsApi.md#createCatalogCategoryRelationshipsItems) | **POST** /api/catalog-categories/{id}/relationships/items/ | Create Catalog Category Relationships Items |
| [**createCatalogItem**](CatalogsApi.md#createCatalogItem) | **POST** /api/catalog-items/ | Create Catalog Item |
| [**createCatalogItemRelationshipsCategories**](CatalogsApi.md#createCatalogItemRelationshipsCategories) | **POST** /api/catalog-items/{id}/relationships/categories/ | Create Catalog Item Relationships Categories |
| [**createCatalogVariant**](CatalogsApi.md#createCatalogVariant) | **POST** /api/catalog-variants/ | Create Catalog Variant |
| [**deleteCatalogCategory**](CatalogsApi.md#deleteCatalogCategory) | **DELETE** /api/catalog-categories/{id}/ | Delete Catalog Category |
| [**deleteCatalogCategoryRelationshipsItems**](CatalogsApi.md#deleteCatalogCategoryRelationshipsItems) | **DELETE** /api/catalog-categories/{id}/relationships/items/ | Delete Catalog Category Relationships Items |
| [**deleteCatalogItem**](CatalogsApi.md#deleteCatalogItem) | **DELETE** /api/catalog-items/{id}/ | Delete Catalog Item |
| [**deleteCatalogItemRelationshipsCategories**](CatalogsApi.md#deleteCatalogItemRelationshipsCategories) | **DELETE** /api/catalog-items/{id}/relationships/categories/ | Delete Catalog Item Relationships Categories |
| [**deleteCatalogVariant**](CatalogsApi.md#deleteCatalogVariant) | **DELETE** /api/catalog-variants/{id}/ | Delete Catalog Variant |
| [**getCatalogCategories**](CatalogsApi.md#getCatalogCategories) | **GET** /api/catalog-categories/ | Get Catalog Categories |
| [**getCatalogCategory**](CatalogsApi.md#getCatalogCategory) | **GET** /api/catalog-categories/{id}/ | Get Catalog Category |
| [**getCatalogCategoryItems**](CatalogsApi.md#getCatalogCategoryItems) | **GET** /api/catalog-categories/{id}/items/ | Get Catalog Category Items |
| [**getCatalogCategoryRelationshipsItems**](CatalogsApi.md#getCatalogCategoryRelationshipsItems) | **GET** /api/catalog-categories/{id}/relationships/items/ | Get Catalog Category Relationships Items |
| [**getCatalogItem**](CatalogsApi.md#getCatalogItem) | **GET** /api/catalog-items/{id}/ | Get Catalog Item |
| [**getCatalogItemCategories**](CatalogsApi.md#getCatalogItemCategories) | **GET** /api/catalog-items/{id}/categories/ | Get Catalog Item Categories |
| [**getCatalogItemRelationshipsCategories**](CatalogsApi.md#getCatalogItemRelationshipsCategories) | **GET** /api/catalog-items/{id}/relationships/categories/ | Get Catalog Item Relationships Categories |
| [**getCatalogItemVariants**](CatalogsApi.md#getCatalogItemVariants) | **GET** /api/catalog-items/{id}/variants/ | Get Catalog Item Variants |
| [**getCatalogItems**](CatalogsApi.md#getCatalogItems) | **GET** /api/catalog-items/ | Get Catalog Items |
| [**getCatalogVariant**](CatalogsApi.md#getCatalogVariant) | **GET** /api/catalog-variants/{id}/ | Get Catalog Variant |
| [**getCatalogVariants**](CatalogsApi.md#getCatalogVariants) | **GET** /api/catalog-variants/ | Get Catalog Variants |
| [**getCreateCategoriesJob**](CatalogsApi.md#getCreateCategoriesJob) | **GET** /api/catalog-category-bulk-create-jobs/{job_id}/ | Get Create Categories Job |
| [**getCreateCategoriesJobs**](CatalogsApi.md#getCreateCategoriesJobs) | **GET** /api/catalog-category-bulk-create-jobs/ | Get Create Categories Jobs |
| [**getCreateItemsJob**](CatalogsApi.md#getCreateItemsJob) | **GET** /api/catalog-item-bulk-create-jobs/{job_id}/ | Get Create Items Job |
| [**getCreateItemsJobs**](CatalogsApi.md#getCreateItemsJobs) | **GET** /api/catalog-item-bulk-create-jobs/ | Get Create Items Jobs |
| [**getCreateVariantsJob**](CatalogsApi.md#getCreateVariantsJob) | **GET** /api/catalog-variant-bulk-create-jobs/{job_id}/ | Get Create Variants Job |
| [**getCreateVariantsJobs**](CatalogsApi.md#getCreateVariantsJobs) | **GET** /api/catalog-variant-bulk-create-jobs/ | Get Create Variants Jobs |
| [**getDeleteCategoriesJob**](CatalogsApi.md#getDeleteCategoriesJob) | **GET** /api/catalog-category-bulk-delete-jobs/{job_id}/ | Get Delete Categories Job |
| [**getDeleteCategoriesJobs**](CatalogsApi.md#getDeleteCategoriesJobs) | **GET** /api/catalog-category-bulk-delete-jobs/ | Get Delete Categories Jobs |
| [**getDeleteItemsJob**](CatalogsApi.md#getDeleteItemsJob) | **GET** /api/catalog-item-bulk-delete-jobs/{job_id}/ | Get Delete Items Job |
| [**getDeleteItemsJobs**](CatalogsApi.md#getDeleteItemsJobs) | **GET** /api/catalog-item-bulk-delete-jobs/ | Get Delete Items Jobs |
| [**getDeleteVariantsJob**](CatalogsApi.md#getDeleteVariantsJob) | **GET** /api/catalog-variant-bulk-delete-jobs/{job_id}/ | Get Delete Variants Job |
| [**getDeleteVariantsJobs**](CatalogsApi.md#getDeleteVariantsJobs) | **GET** /api/catalog-variant-bulk-delete-jobs/ | Get Delete Variants Jobs |
| [**getUpdateCategoriesJob**](CatalogsApi.md#getUpdateCategoriesJob) | **GET** /api/catalog-category-bulk-update-jobs/{job_id}/ | Get Update Categories Job |
| [**getUpdateCategoriesJobs**](CatalogsApi.md#getUpdateCategoriesJobs) | **GET** /api/catalog-category-bulk-update-jobs/ | Get Update Categories Jobs |
| [**getUpdateItemsJob**](CatalogsApi.md#getUpdateItemsJob) | **GET** /api/catalog-item-bulk-update-jobs/{job_id}/ | Get Update Items Job |
| [**getUpdateItemsJobs**](CatalogsApi.md#getUpdateItemsJobs) | **GET** /api/catalog-item-bulk-update-jobs/ | Get Update Items Jobs |
| [**getUpdateVariantsJob**](CatalogsApi.md#getUpdateVariantsJob) | **GET** /api/catalog-variant-bulk-update-jobs/{job_id}/ | Get Update Variants Job |
| [**getUpdateVariantsJobs**](CatalogsApi.md#getUpdateVariantsJobs) | **GET** /api/catalog-variant-bulk-update-jobs/ | Get Update Variants Jobs |
| [**spawnCreateCategoriesJob**](CatalogsApi.md#spawnCreateCategoriesJob) | **POST** /api/catalog-category-bulk-create-jobs/ | Spawn Create Categories Job |
| [**spawnCreateItemsJob**](CatalogsApi.md#spawnCreateItemsJob) | **POST** /api/catalog-item-bulk-create-jobs/ | Spawn Create Items Job |
| [**spawnCreateVariantsJob**](CatalogsApi.md#spawnCreateVariantsJob) | **POST** /api/catalog-variant-bulk-create-jobs/ | Spawn Create Variants Job |
| [**spawnDeleteCategoriesJob**](CatalogsApi.md#spawnDeleteCategoriesJob) | **POST** /api/catalog-category-bulk-delete-jobs/ | Spawn Delete Categories Job |
| [**spawnDeleteItemsJob**](CatalogsApi.md#spawnDeleteItemsJob) | **POST** /api/catalog-item-bulk-delete-jobs/ | Spawn Delete Items Job |
| [**spawnDeleteVariantsJob**](CatalogsApi.md#spawnDeleteVariantsJob) | **POST** /api/catalog-variant-bulk-delete-jobs/ | Spawn Delete Variants Job |
| [**spawnUpdateCategoriesJob**](CatalogsApi.md#spawnUpdateCategoriesJob) | **POST** /api/catalog-category-bulk-update-jobs/ | Spawn Update Categories Job |
| [**spawnUpdateItemsJob**](CatalogsApi.md#spawnUpdateItemsJob) | **POST** /api/catalog-item-bulk-update-jobs/ | Spawn Update Items Job |
| [**spawnUpdateVariantsJob**](CatalogsApi.md#spawnUpdateVariantsJob) | **POST** /api/catalog-variant-bulk-update-jobs/ | Spawn Update Variants Job |
| [**updateCatalogCategory**](CatalogsApi.md#updateCatalogCategory) | **PATCH** /api/catalog-categories/{id}/ | Update Catalog Category |
| [**updateCatalogCategoryRelationshipsItems**](CatalogsApi.md#updateCatalogCategoryRelationshipsItems) | **PATCH** /api/catalog-categories/{id}/relationships/items/ | Update Catalog Category Relationships Items |
| [**updateCatalogItem**](CatalogsApi.md#updateCatalogItem) | **PATCH** /api/catalog-items/{id}/ | Update Catalog Item |
| [**updateCatalogItemRelationshipsCategories**](CatalogsApi.md#updateCatalogItemRelationshipsCategories) | **PATCH** /api/catalog-items/{id}/relationships/categories/ | Update Catalog Item Relationships Categories |
| [**updateCatalogVariant**](CatalogsApi.md#updateCatalogVariant) | **PATCH** /api/catalog-variants/{id}/ | Update Catalog Variant |


<a id="createBackInStockSubscription"></a>
# **createBackInStockSubscription**
> createBackInStockSubscription(revision, serverBISSubscriptionCreateQuery)

Create Back In Stock Subscription

Subscribe a profile to receive back in stock notifications. Check out [our Back in Stock API guide](https://developers.klaviyo.com/en/docs/how_to_set_up_custom_back_in_stock) for more details.  This endpoint is specifically designed to be called from server-side applications. To create subscriptions from client-side contexts, use [POST /client/back-in-stock-subscriptions](https://developers.klaviyo.com/en/reference/create_client_back_in_stock_subscription).&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60; &#x60;profiles:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val serverBISSubscriptionCreateQuery : ServerBISSubscriptionCreateQuery =  // ServerBISSubscriptionCreateQuery | 
try {
    apiInstance.createBackInStockSubscription(revision, serverBISSubscriptionCreateQuery)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#createBackInStockSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#createBackInStockSubscription")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **serverBISSubscriptionCreateQuery** | [**ServerBISSubscriptionCreateQuery**](ServerBISSubscriptionCreateQuery.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createCatalogCategory"></a>
# **createCatalogCategory**
> PostCatalogCategoryResponse createCatalogCategory(revision, catalogCategoryCreateQuery)

Create Catalog Category

Create a new catalog category.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val catalogCategoryCreateQuery : CatalogCategoryCreateQuery =  // CatalogCategoryCreateQuery | 
try {
    val result : PostCatalogCategoryResponse = apiInstance.createCatalogCategory(revision, catalogCategoryCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#createCatalogCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#createCatalogCategory")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogCategoryCreateQuery** | [**CatalogCategoryCreateQuery**](CatalogCategoryCreateQuery.md)|  | |

### Return type

[**PostCatalogCategoryResponse**](PostCatalogCategoryResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createCatalogCategoryRelationshipsItems"></a>
# **createCatalogCategoryRelationshipsItems**
> createCatalogCategoryRelationshipsItems(id, revision, catalogCategoryItemOp)

Create Catalog Category Relationships Items

Create a new item relationship for the given category ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val catalogCategoryItemOp : CatalogCategoryItemOp =  // CatalogCategoryItemOp | 
try {
    apiInstance.createCatalogCategoryRelationshipsItems(id, revision, catalogCategoryItemOp)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#createCatalogCategoryRelationshipsItems")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#createCatalogCategoryRelationshipsItems")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogCategoryItemOp** | [**CatalogCategoryItemOp**](CatalogCategoryItemOp.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createCatalogItem"></a>
# **createCatalogItem**
> PostCatalogItemResponse createCatalogItem(revision, catalogItemCreateQuery)

Create Catalog Item

Create a new catalog item.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val catalogItemCreateQuery : CatalogItemCreateQuery =  // CatalogItemCreateQuery | 
try {
    val result : PostCatalogItemResponse = apiInstance.createCatalogItem(revision, catalogItemCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#createCatalogItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#createCatalogItem")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogItemCreateQuery** | [**CatalogItemCreateQuery**](CatalogItemCreateQuery.md)|  | |

### Return type

[**PostCatalogItemResponse**](PostCatalogItemResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createCatalogItemRelationshipsCategories"></a>
# **createCatalogItemRelationshipsCategories**
> createCatalogItemRelationshipsCategories(id, revision, catalogItemCategoryOp)

Create Catalog Item Relationships Categories

Create a new catalog category relationship for the given item ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val catalogItemCategoryOp : CatalogItemCategoryOp =  // CatalogItemCategoryOp | 
try {
    apiInstance.createCatalogItemRelationshipsCategories(id, revision, catalogItemCategoryOp)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#createCatalogItemRelationshipsCategories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#createCatalogItemRelationshipsCategories")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogItemCategoryOp** | [**CatalogItemCategoryOp**](CatalogItemCategoryOp.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createCatalogVariant"></a>
# **createCatalogVariant**
> PostCatalogVariantResponse createCatalogVariant(revision, catalogVariantCreateQuery)

Create Catalog Variant

Create a new variant for a related catalog item.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val catalogVariantCreateQuery : CatalogVariantCreateQuery =  // CatalogVariantCreateQuery | 
try {
    val result : PostCatalogVariantResponse = apiInstance.createCatalogVariant(revision, catalogVariantCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#createCatalogVariant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#createCatalogVariant")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogVariantCreateQuery** | [**CatalogVariantCreateQuery**](CatalogVariantCreateQuery.md)|  | |

### Return type

[**PostCatalogVariantResponse**](PostCatalogVariantResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCatalogCategory"></a>
# **deleteCatalogCategory**
> deleteCatalogCategory(id, revision)

Delete Catalog Category

Delete a catalog category using the given category ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val id : kotlin.String = $custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL // kotlin.String | The catalog category ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.deleteCatalogCategory(id, revision)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#deleteCatalogCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#deleteCatalogCategory")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The catalog category ID is a compound ID (string), with format: &#x60;{integration}:::{catalog}:::{external_id}&#x60;. Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog is &#x60;$default&#x60;. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteCatalogCategoryRelationshipsItems"></a>
# **deleteCatalogCategoryRelationshipsItems**
> deleteCatalogCategoryRelationshipsItems(id, revision, catalogCategoryItemOp)

Delete Catalog Category Relationships Items

Delete item relationships for the given category ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val catalogCategoryItemOp : CatalogCategoryItemOp =  // CatalogCategoryItemOp | 
try {
    apiInstance.deleteCatalogCategoryRelationshipsItems(id, revision, catalogCategoryItemOp)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#deleteCatalogCategoryRelationshipsItems")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#deleteCatalogCategoryRelationshipsItems")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogCategoryItemOp** | [**CatalogCategoryItemOp**](CatalogCategoryItemOp.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCatalogItem"></a>
# **deleteCatalogItem**
> deleteCatalogItem(id, revision)

Delete Catalog Item

Delete a catalog item with the given item ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val id : kotlin.String = $custom:::$default:::SAMPLE-DATA-ITEM-1 // kotlin.String | The catalog item ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.deleteCatalogItem(id, revision)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#deleteCatalogItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#deleteCatalogItem")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The catalog item ID is a compound ID (string), with format: &#x60;{integration}:::{catalog}:::{external_id}&#x60;. Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog is &#x60;$default&#x60;. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteCatalogItemRelationshipsCategories"></a>
# **deleteCatalogItemRelationshipsCategories**
> deleteCatalogItemRelationshipsCategories(id, revision, catalogItemCategoryOp)

Delete Catalog Item Relationships Categories

Delete catalog category relationships for the given item ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val catalogItemCategoryOp : CatalogItemCategoryOp =  // CatalogItemCategoryOp | 
try {
    apiInstance.deleteCatalogItemRelationshipsCategories(id, revision, catalogItemCategoryOp)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#deleteCatalogItemRelationshipsCategories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#deleteCatalogItemRelationshipsCategories")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogItemCategoryOp** | [**CatalogItemCategoryOp**](CatalogItemCategoryOp.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCatalogVariant"></a>
# **deleteCatalogVariant**
> deleteCatalogVariant(id, revision)

Delete Catalog Variant

Delete a catalog item variant with the given variant ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val id : kotlin.String = $custom:::$default:::SAMPLE-DATA-ITEM-1-VARIANT-MEDIUM // kotlin.String | The catalog variant ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.deleteCatalogVariant(id, revision)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#deleteCatalogVariant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#deleteCatalogVariant")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The catalog variant ID is a compound ID (string), with format: &#x60;{integration}:::{catalog}:::{external_id}&#x60;. Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog is &#x60;$default&#x60;. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCatalogCategories"></a>
# **getCatalogCategories**
> GetCatalogCategoryResponseCollection getCatalogCategories(revision, fieldsCatalogCategory, filter, pageCursor, sort)

Get Catalog Categories

Get all catalog categories in an account.  Catalog categories can be sorted by the following fields, in ascending and descending order: &#x60;created&#x60;  Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog type is &#x60;$default&#x60;.  Returns a maximum of 100 categories per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogCategory : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`ids`: `any`<br>`item.id`: `equals`<br>`name`: `contains`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetCatalogCategoryResponseCollection = apiInstance.getCatalogCategories(revision, fieldsCatalogCategory, filter, pageCursor, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getCatalogCategories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getCatalogCategories")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCatalogCategory** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, name, updated] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;ids&#x60;: &#x60;any&#x60;&lt;br&gt;&#x60;item.id&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;name&#x60;: &#x60;contains&#x60; | [optional] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created] |

### Return type

[**GetCatalogCategoryResponseCollection**](GetCatalogCategoryResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCatalogCategory"></a>
# **getCatalogCategory**
> GetCatalogCategoryResponse getCatalogCategory(id, revision, fieldsCatalogCategory)

Get Catalog Category

Get a catalog category with the given category ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val id : kotlin.String = $custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL // kotlin.String | The catalog category ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogCategory : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetCatalogCategoryResponse = apiInstance.getCatalogCategory(id, revision, fieldsCatalogCategory)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getCatalogCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getCatalogCategory")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The catalog category ID is a compound ID (string), with format: &#x60;{integration}:::{catalog}:::{external_id}&#x60;. Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog is &#x60;$default&#x60;. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsCatalogCategory** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, name, updated] |

### Return type

[**GetCatalogCategoryResponse**](GetCatalogCategoryResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCatalogCategoryItems"></a>
# **getCatalogCategoryItems**
> GetCatalogItemResponseCollectionCompoundDocument getCatalogCategoryItems(id, revision, fieldsCatalogItem, fieldsCatalogVariant, filter, include, pageCursor, sort)

Get Catalog Category Items

Get all items in a category with the given category ID.  Items can be sorted by the following fields, in ascending and descending order: &#x60;created&#x60;  Returns a maximum of 100 items per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogItem : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsCatalogVariant : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`ids`: `any`<br>`category.id`: `equals`<br>`title`: `contains`<br>`published`: `equals`
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetCatalogItemResponseCollectionCompoundDocument = apiInstance.getCatalogCategoryItems(id, revision, fieldsCatalogItem, fieldsCatalogVariant, filter, include, pageCursor, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getCatalogCategoryItems")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getCatalogCategoryItems")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCatalogItem** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated] |
| **fieldsCatalogVariant** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, sku, inventory_policy, inventory_quantity, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;ids&#x60;: &#x60;any&#x60;&lt;br&gt;&#x60;category.id&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;title&#x60;: &#x60;contains&#x60;&lt;br&gt;&#x60;published&#x60;: &#x60;equals&#x60; | [optional] |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: variants] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created] |

### Return type

[**GetCatalogItemResponseCollectionCompoundDocument**](GetCatalogItemResponseCollectionCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCatalogCategoryRelationshipsItems"></a>
# **getCatalogCategoryRelationshipsItems**
> GetCatalogCategoryItemListResponseCollection getCatalogCategoryRelationshipsItems(id, revision, pageCursor)

Get Catalog Category Relationships Items

Get all items in the given category ID.  Returns a maximum of 100 items per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    val result : GetCatalogCategoryItemListResponseCollection = apiInstance.getCatalogCategoryRelationshipsItems(id, revision, pageCursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getCatalogCategoryRelationshipsItems")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getCatalogCategoryRelationshipsItems")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |

### Return type

[**GetCatalogCategoryItemListResponseCollection**](GetCatalogCategoryItemListResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCatalogItem"></a>
# **getCatalogItem**
> GetCatalogItemResponseCompoundDocument getCatalogItem(id, revision, fieldsCatalogItem, fieldsCatalogVariant, include)

Get Catalog Item

Get a specific catalog item with the given item ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val id : kotlin.String = $custom:::$default:::SAMPLE-DATA-ITEM-1 // kotlin.String | The catalog item ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogItem : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsCatalogVariant : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    val result : GetCatalogItemResponseCompoundDocument = apiInstance.getCatalogItem(id, revision, fieldsCatalogItem, fieldsCatalogVariant, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getCatalogItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getCatalogItem")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The catalog item ID is a compound ID (string), with format: &#x60;{integration}:::{catalog}:::{external_id}&#x60;. Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog is &#x60;$default&#x60;. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCatalogItem** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated] |
| **fieldsCatalogVariant** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, sku, inventory_policy, inventory_quantity, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: variants] |

### Return type

[**GetCatalogItemResponseCompoundDocument**](GetCatalogItemResponseCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCatalogItemCategories"></a>
# **getCatalogItemCategories**
> GetCatalogCategoryResponseCollection getCatalogItemCategories(id, revision, fieldsCatalogCategory, filter, pageCursor, sort)

Get Catalog Item Categories

Get all catalog categories that an item with the given item ID is in.  Catalog categories can be sorted by the following fields, in ascending and descending order: &#x60;created&#x60;  Returns a maximum of 100 categories per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogCategory : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`ids`: `any`<br>`item.id`: `equals`<br>`name`: `contains`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetCatalogCategoryResponseCollection = apiInstance.getCatalogItemCategories(id, revision, fieldsCatalogCategory, filter, pageCursor, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getCatalogItemCategories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getCatalogItemCategories")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCatalogCategory** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, name, updated] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;ids&#x60;: &#x60;any&#x60;&lt;br&gt;&#x60;item.id&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;name&#x60;: &#x60;contains&#x60; | [optional] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created] |

### Return type

[**GetCatalogCategoryResponseCollection**](GetCatalogCategoryResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCatalogItemRelationshipsCategories"></a>
# **getCatalogItemRelationshipsCategories**
> GetCatalogItemCategoryListResponseCollection getCatalogItemRelationshipsCategories(id, revision, pageCursor)

Get Catalog Item Relationships Categories

Get all catalog categories that a particular item is in.  Returns a maximum of 100 categories per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    val result : GetCatalogItemCategoryListResponseCollection = apiInstance.getCatalogItemRelationshipsCategories(id, revision, pageCursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getCatalogItemRelationshipsCategories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getCatalogItemRelationshipsCategories")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |

### Return type

[**GetCatalogItemCategoryListResponseCollection**](GetCatalogItemCategoryListResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCatalogItemVariants"></a>
# **getCatalogItemVariants**
> GetCatalogVariantResponseCollection getCatalogItemVariants(id, revision, fieldsCatalogVariant, filter, pageCursor, sort)

Get Catalog Item Variants

Get all variants related to the given item ID.  Variants can be sorted by the following fields, in ascending and descending order: &#x60;created&#x60;  Returns a maximum of 100 variants per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogVariant : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`ids`: `any`<br>`item.id`: `equals`<br>`sku`: `equals`<br>`title`: `contains`<br>`published`: `equals`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetCatalogVariantResponseCollection = apiInstance.getCatalogItemVariants(id, revision, fieldsCatalogVariant, filter, pageCursor, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getCatalogItemVariants")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getCatalogItemVariants")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCatalogVariant** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, sku, inventory_policy, inventory_quantity, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;ids&#x60;: &#x60;any&#x60;&lt;br&gt;&#x60;item.id&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;sku&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;title&#x60;: &#x60;contains&#x60;&lt;br&gt;&#x60;published&#x60;: &#x60;equals&#x60; | [optional] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created] |

### Return type

[**GetCatalogVariantResponseCollection**](GetCatalogVariantResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCatalogItems"></a>
# **getCatalogItems**
> GetCatalogItemResponseCollectionCompoundDocument getCatalogItems(revision, fieldsCatalogItem, fieldsCatalogVariant, filter, include, pageCursor, sort)

Get Catalog Items

Get all catalog items in an account.  Catalog items can be sorted by the following fields, in ascending and descending order: &#x60;created&#x60;  Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog type is &#x60;$default&#x60;.  Returns a maximum of 100 items per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogItem : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsCatalogVariant : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`ids`: `any`<br>`category.id`: `equals`<br>`title`: `contains`<br>`published`: `equals`
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetCatalogItemResponseCollectionCompoundDocument = apiInstance.getCatalogItems(revision, fieldsCatalogItem, fieldsCatalogVariant, filter, include, pageCursor, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getCatalogItems")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getCatalogItems")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCatalogItem** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated] |
| **fieldsCatalogVariant** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, sku, inventory_policy, inventory_quantity, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;ids&#x60;: &#x60;any&#x60;&lt;br&gt;&#x60;category.id&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;title&#x60;: &#x60;contains&#x60;&lt;br&gt;&#x60;published&#x60;: &#x60;equals&#x60; | [optional] |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: variants] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created] |

### Return type

[**GetCatalogItemResponseCollectionCompoundDocument**](GetCatalogItemResponseCollectionCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCatalogVariant"></a>
# **getCatalogVariant**
> GetCatalogVariantResponse getCatalogVariant(id, revision, fieldsCatalogVariant)

Get Catalog Variant

Get a catalog item variant with the given variant ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val id : kotlin.String = $custom:::$default:::SAMPLE-DATA-ITEM-1-VARIANT-MEDIUM // kotlin.String | The catalog variant ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogVariant : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetCatalogVariantResponse = apiInstance.getCatalogVariant(id, revision, fieldsCatalogVariant)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getCatalogVariant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getCatalogVariant")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The catalog variant ID is a compound ID (string), with format: &#x60;{integration}:::{catalog}:::{external_id}&#x60;. Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog is &#x60;$default&#x60;. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsCatalogVariant** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, sku, inventory_policy, inventory_quantity, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated] |

### Return type

[**GetCatalogVariantResponse**](GetCatalogVariantResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCatalogVariants"></a>
# **getCatalogVariants**
> GetCatalogVariantResponseCollection getCatalogVariants(revision, fieldsCatalogVariant, filter, pageCursor, sort)

Get Catalog Variants

Get all variants in an account.  Variants can be sorted by the following fields, in ascending and descending order: &#x60;created&#x60;  Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog type is &#x60;$default&#x60;.  Returns a maximum of 100 variants per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogVariant : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`ids`: `any`<br>`item.id`: `equals`<br>`sku`: `equals`<br>`title`: `contains`<br>`published`: `equals`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetCatalogVariantResponseCollection = apiInstance.getCatalogVariants(revision, fieldsCatalogVariant, filter, pageCursor, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getCatalogVariants")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getCatalogVariants")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCatalogVariant** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, sku, inventory_policy, inventory_quantity, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;ids&#x60;: &#x60;any&#x60;&lt;br&gt;&#x60;item.id&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;sku&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;title&#x60;: &#x60;contains&#x60;&lt;br&gt;&#x60;published&#x60;: &#x60;equals&#x60; | [optional] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created] |

### Return type

[**GetCatalogVariantResponseCollection**](GetCatalogVariantResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCreateCategoriesJob"></a>
# **getCreateCategoriesJob**
> GetCatalogCategoryCreateJobResponseCompoundDocument getCreateCategoriesJob(jobId, revision, fieldsCatalogCategoryBulkCreateJob, fieldsCatalogCategory, include)

Get Create Categories Job

Get a catalog category bulk create job with the given job ID.  An &#x60;include&#x60; parameter can be provided to get the following related resource data: &#x60;categories&#x60;.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val jobId : kotlin.String = 01GSQPBF74KQ5YTDEPP41T1BZH // kotlin.String | ID of the job to retrieve.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogCategoryBulkCreateJob : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsCatalogCategory : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    val result : GetCatalogCategoryCreateJobResponseCompoundDocument = apiInstance.getCreateCategoriesJob(jobId, revision, fieldsCatalogCategoryBulkCreateJob, fieldsCatalogCategory, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getCreateCategoriesJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getCreateCategoriesJob")
    e.printStackTrace()
}
```

### Parameters
| **jobId** | **kotlin.String**| ID of the job to retrieve. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCatalogCategoryBulkCreateJob** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at] |
| **fieldsCatalogCategory** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, name, updated] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: categories] |

### Return type

[**GetCatalogCategoryCreateJobResponseCompoundDocument**](GetCatalogCategoryCreateJobResponseCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCreateCategoriesJobs"></a>
# **getCreateCategoriesJobs**
> GetCatalogCategoryCreateJobResponseCollectionCompoundDocument getCreateCategoriesJobs(revision, fieldsCatalogCategoryBulkCreateJob, filter, pageCursor)

Get Create Categories Jobs

Get all catalog category bulk create jobs.  Returns a maximum of 100 jobs per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogCategoryBulkCreateJob : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    val result : GetCatalogCategoryCreateJobResponseCollectionCompoundDocument = apiInstance.getCreateCategoriesJobs(revision, fieldsCatalogCategoryBulkCreateJob, filter, pageCursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getCreateCategoriesJobs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getCreateCategoriesJobs")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCatalogCategoryBulkCreateJob** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60; | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |

### Return type

[**GetCatalogCategoryCreateJobResponseCollectionCompoundDocument**](GetCatalogCategoryCreateJobResponseCollectionCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCreateItemsJob"></a>
# **getCreateItemsJob**
> GetCatalogItemCreateJobResponseCompoundDocument getCreateItemsJob(jobId, revision, fieldsCatalogItemBulkCreateJob, fieldsCatalogItem, include)

Get Create Items Job

Get a catalog item bulk create job with the given job ID.  An &#x60;include&#x60; parameter can be provided to get the following related resource data: &#x60;items&#x60;.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val jobId : kotlin.String = 01GSQPBF74KQ5YTDEPP41T1BZH // kotlin.String | ID of the job to retrieve.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogItemBulkCreateJob : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsCatalogItem : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    val result : GetCatalogItemCreateJobResponseCompoundDocument = apiInstance.getCreateItemsJob(jobId, revision, fieldsCatalogItemBulkCreateJob, fieldsCatalogItem, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getCreateItemsJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getCreateItemsJob")
    e.printStackTrace()
}
```

### Parameters
| **jobId** | **kotlin.String**| ID of the job to retrieve. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCatalogItemBulkCreateJob** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at] |
| **fieldsCatalogItem** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: items] |

### Return type

[**GetCatalogItemCreateJobResponseCompoundDocument**](GetCatalogItemCreateJobResponseCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCreateItemsJobs"></a>
# **getCreateItemsJobs**
> GetCatalogItemCreateJobResponseCollectionCompoundDocument getCreateItemsJobs(revision, fieldsCatalogItemBulkCreateJob, filter, pageCursor)

Get Create Items Jobs

Get all catalog item bulk create jobs.  Returns a maximum of 100 jobs per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogItemBulkCreateJob : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    val result : GetCatalogItemCreateJobResponseCollectionCompoundDocument = apiInstance.getCreateItemsJobs(revision, fieldsCatalogItemBulkCreateJob, filter, pageCursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getCreateItemsJobs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getCreateItemsJobs")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCatalogItemBulkCreateJob** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60; | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |

### Return type

[**GetCatalogItemCreateJobResponseCollectionCompoundDocument**](GetCatalogItemCreateJobResponseCollectionCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCreateVariantsJob"></a>
# **getCreateVariantsJob**
> GetCatalogVariantCreateJobResponseCompoundDocument getCreateVariantsJob(jobId, revision, fieldsCatalogVariantBulkCreateJob, fieldsCatalogVariant, include)

Get Create Variants Job

Get a catalog variant bulk create job with the given job ID.  An &#x60;include&#x60; parameter can be provided to get the following related resource data: &#x60;variants&#x60;.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val jobId : kotlin.String = 01GSQPBF74KQ5YTDEPP41T1BZH // kotlin.String | ID of the job to retrieve.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogVariantBulkCreateJob : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsCatalogVariant : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    val result : GetCatalogVariantCreateJobResponseCompoundDocument = apiInstance.getCreateVariantsJob(jobId, revision, fieldsCatalogVariantBulkCreateJob, fieldsCatalogVariant, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getCreateVariantsJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getCreateVariantsJob")
    e.printStackTrace()
}
```

### Parameters
| **jobId** | **kotlin.String**| ID of the job to retrieve. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCatalogVariantBulkCreateJob** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at] |
| **fieldsCatalogVariant** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, sku, inventory_policy, inventory_quantity, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: variants] |

### Return type

[**GetCatalogVariantCreateJobResponseCompoundDocument**](GetCatalogVariantCreateJobResponseCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCreateVariantsJobs"></a>
# **getCreateVariantsJobs**
> GetCatalogVariantCreateJobResponseCollectionCompoundDocument getCreateVariantsJobs(revision, fieldsCatalogVariantBulkCreateJob, filter, pageCursor)

Get Create Variants Jobs

Get all catalog variant bulk create jobs.  Returns a maximum of 100 jobs per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogVariantBulkCreateJob : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    val result : GetCatalogVariantCreateJobResponseCollectionCompoundDocument = apiInstance.getCreateVariantsJobs(revision, fieldsCatalogVariantBulkCreateJob, filter, pageCursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getCreateVariantsJobs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getCreateVariantsJobs")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCatalogVariantBulkCreateJob** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60; | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |

### Return type

[**GetCatalogVariantCreateJobResponseCollectionCompoundDocument**](GetCatalogVariantCreateJobResponseCollectionCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDeleteCategoriesJob"></a>
# **getDeleteCategoriesJob**
> GetCatalogCategoryDeleteJobResponse getDeleteCategoriesJob(jobId, revision, fieldsCatalogCategoryBulkDeleteJob)

Get Delete Categories Job

Get a catalog category bulk delete job with the given job ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val jobId : kotlin.String = 01GSQPBF74KQ5YTDEPP41T1BZH // kotlin.String | ID of the job to retrieve.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogCategoryBulkDeleteJob : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetCatalogCategoryDeleteJobResponse = apiInstance.getDeleteCategoriesJob(jobId, revision, fieldsCatalogCategoryBulkDeleteJob)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getDeleteCategoriesJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getDeleteCategoriesJob")
    e.printStackTrace()
}
```

### Parameters
| **jobId** | **kotlin.String**| ID of the job to retrieve. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsCatalogCategoryBulkDeleteJob** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at] |

### Return type

[**GetCatalogCategoryDeleteJobResponse**](GetCatalogCategoryDeleteJobResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDeleteCategoriesJobs"></a>
# **getDeleteCategoriesJobs**
> GetCatalogCategoryDeleteJobResponseCollection getDeleteCategoriesJobs(revision, fieldsCatalogCategoryBulkDeleteJob, filter, pageCursor)

Get Delete Categories Jobs

Get all catalog category bulk delete jobs.  Returns a maximum of 100 jobs per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogCategoryBulkDeleteJob : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    val result : GetCatalogCategoryDeleteJobResponseCollection = apiInstance.getDeleteCategoriesJobs(revision, fieldsCatalogCategoryBulkDeleteJob, filter, pageCursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getDeleteCategoriesJobs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getDeleteCategoriesJobs")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCatalogCategoryBulkDeleteJob** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60; | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |

### Return type

[**GetCatalogCategoryDeleteJobResponseCollection**](GetCatalogCategoryDeleteJobResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDeleteItemsJob"></a>
# **getDeleteItemsJob**
> GetCatalogItemDeleteJobResponse getDeleteItemsJob(jobId, revision, fieldsCatalogItemBulkDeleteJob)

Get Delete Items Job

Get a catalog item bulk delete job with the given job ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val jobId : kotlin.String = 01GSQPBF74KQ5YTDEPP41T1BZH // kotlin.String | ID of the job to retrieve.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogItemBulkDeleteJob : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetCatalogItemDeleteJobResponse = apiInstance.getDeleteItemsJob(jobId, revision, fieldsCatalogItemBulkDeleteJob)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getDeleteItemsJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getDeleteItemsJob")
    e.printStackTrace()
}
```

### Parameters
| **jobId** | **kotlin.String**| ID of the job to retrieve. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsCatalogItemBulkDeleteJob** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at] |

### Return type

[**GetCatalogItemDeleteJobResponse**](GetCatalogItemDeleteJobResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDeleteItemsJobs"></a>
# **getDeleteItemsJobs**
> GetCatalogItemDeleteJobResponseCollection getDeleteItemsJobs(revision, fieldsCatalogItemBulkDeleteJob, filter, pageCursor)

Get Delete Items Jobs

Get all catalog item bulk delete jobs.  Returns a maximum of 100 jobs per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogItemBulkDeleteJob : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    val result : GetCatalogItemDeleteJobResponseCollection = apiInstance.getDeleteItemsJobs(revision, fieldsCatalogItemBulkDeleteJob, filter, pageCursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getDeleteItemsJobs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getDeleteItemsJobs")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCatalogItemBulkDeleteJob** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60; | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |

### Return type

[**GetCatalogItemDeleteJobResponseCollection**](GetCatalogItemDeleteJobResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDeleteVariantsJob"></a>
# **getDeleteVariantsJob**
> GetCatalogVariantDeleteJobResponse getDeleteVariantsJob(jobId, revision, fieldsCatalogVariantBulkDeleteJob)

Get Delete Variants Job

Get a catalog variant bulk delete job with the given job ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val jobId : kotlin.String = 01GSQPBF74KQ5YTDEPP41T1BZH // kotlin.String | ID of the job to retrieve.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogVariantBulkDeleteJob : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetCatalogVariantDeleteJobResponse = apiInstance.getDeleteVariantsJob(jobId, revision, fieldsCatalogVariantBulkDeleteJob)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getDeleteVariantsJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getDeleteVariantsJob")
    e.printStackTrace()
}
```

### Parameters
| **jobId** | **kotlin.String**| ID of the job to retrieve. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsCatalogVariantBulkDeleteJob** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at] |

### Return type

[**GetCatalogVariantDeleteJobResponse**](GetCatalogVariantDeleteJobResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDeleteVariantsJobs"></a>
# **getDeleteVariantsJobs**
> GetCatalogVariantDeleteJobResponseCollection getDeleteVariantsJobs(revision, fieldsCatalogVariantBulkDeleteJob, filter, pageCursor)

Get Delete Variants Jobs

Get all catalog variant bulk delete jobs.  Returns a maximum of 100 jobs per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogVariantBulkDeleteJob : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    val result : GetCatalogVariantDeleteJobResponseCollection = apiInstance.getDeleteVariantsJobs(revision, fieldsCatalogVariantBulkDeleteJob, filter, pageCursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getDeleteVariantsJobs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getDeleteVariantsJobs")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCatalogVariantBulkDeleteJob** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60; | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |

### Return type

[**GetCatalogVariantDeleteJobResponseCollection**](GetCatalogVariantDeleteJobResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getUpdateCategoriesJob"></a>
# **getUpdateCategoriesJob**
> GetCatalogCategoryUpdateJobResponseCompoundDocument getUpdateCategoriesJob(jobId, revision, fieldsCatalogCategoryBulkUpdateJob, fieldsCatalogCategory, include)

Get Update Categories Job

Get a catalog category bulk update job with the given job ID.  An &#x60;include&#x60; parameter can be provided to get the following related resource data: &#x60;categories&#x60;.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val jobId : kotlin.String = 01GSQPBF74KQ5YTDEPP41T1BZH // kotlin.String | ID of the job to retrieve.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogCategoryBulkUpdateJob : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsCatalogCategory : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    val result : GetCatalogCategoryUpdateJobResponseCompoundDocument = apiInstance.getUpdateCategoriesJob(jobId, revision, fieldsCatalogCategoryBulkUpdateJob, fieldsCatalogCategory, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getUpdateCategoriesJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getUpdateCategoriesJob")
    e.printStackTrace()
}
```

### Parameters
| **jobId** | **kotlin.String**| ID of the job to retrieve. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCatalogCategoryBulkUpdateJob** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at] |
| **fieldsCatalogCategory** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, name, updated] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: categories] |

### Return type

[**GetCatalogCategoryUpdateJobResponseCompoundDocument**](GetCatalogCategoryUpdateJobResponseCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getUpdateCategoriesJobs"></a>
# **getUpdateCategoriesJobs**
> GetCatalogCategoryUpdateJobResponseCollectionCompoundDocument getUpdateCategoriesJobs(revision, fieldsCatalogCategoryBulkUpdateJob, filter, pageCursor)

Get Update Categories Jobs

Get all catalog category bulk update jobs.  Returns a maximum of 100 jobs per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogCategoryBulkUpdateJob : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    val result : GetCatalogCategoryUpdateJobResponseCollectionCompoundDocument = apiInstance.getUpdateCategoriesJobs(revision, fieldsCatalogCategoryBulkUpdateJob, filter, pageCursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getUpdateCategoriesJobs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getUpdateCategoriesJobs")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCatalogCategoryBulkUpdateJob** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60; | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |

### Return type

[**GetCatalogCategoryUpdateJobResponseCollectionCompoundDocument**](GetCatalogCategoryUpdateJobResponseCollectionCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getUpdateItemsJob"></a>
# **getUpdateItemsJob**
> GetCatalogItemUpdateJobResponseCompoundDocument getUpdateItemsJob(jobId, revision, fieldsCatalogItemBulkUpdateJob, fieldsCatalogItem, include)

Get Update Items Job

Get a catalog item bulk update job with the given job ID.  An &#x60;include&#x60; parameter can be provided to get the following related resource data: &#x60;items&#x60;.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val jobId : kotlin.String = 01GSQPBF74KQ5YTDEPP41T1BZH // kotlin.String | ID of the job to retrieve.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogItemBulkUpdateJob : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsCatalogItem : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    val result : GetCatalogItemUpdateJobResponseCompoundDocument = apiInstance.getUpdateItemsJob(jobId, revision, fieldsCatalogItemBulkUpdateJob, fieldsCatalogItem, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getUpdateItemsJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getUpdateItemsJob")
    e.printStackTrace()
}
```

### Parameters
| **jobId** | **kotlin.String**| ID of the job to retrieve. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCatalogItemBulkUpdateJob** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at] |
| **fieldsCatalogItem** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: items] |

### Return type

[**GetCatalogItemUpdateJobResponseCompoundDocument**](GetCatalogItemUpdateJobResponseCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getUpdateItemsJobs"></a>
# **getUpdateItemsJobs**
> GetCatalogItemUpdateJobResponseCollectionCompoundDocument getUpdateItemsJobs(revision, fieldsCatalogItemBulkUpdateJob, filter, pageCursor)

Get Update Items Jobs

Get all catalog item bulk update jobs.  Returns a maximum of 100 jobs per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogItemBulkUpdateJob : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    val result : GetCatalogItemUpdateJobResponseCollectionCompoundDocument = apiInstance.getUpdateItemsJobs(revision, fieldsCatalogItemBulkUpdateJob, filter, pageCursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getUpdateItemsJobs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getUpdateItemsJobs")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCatalogItemBulkUpdateJob** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60; | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |

### Return type

[**GetCatalogItemUpdateJobResponseCollectionCompoundDocument**](GetCatalogItemUpdateJobResponseCollectionCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getUpdateVariantsJob"></a>
# **getUpdateVariantsJob**
> GetCatalogVariantUpdateJobResponseCompoundDocument getUpdateVariantsJob(jobId, revision, fieldsCatalogVariantBulkUpdateJob, fieldsCatalogVariant, include)

Get Update Variants Job

Get a catalog variate bulk update job with the given job ID.  An &#x60;include&#x60; parameter can be provided to get the following related resource data: &#x60;variants&#x60;.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val jobId : kotlin.String = 01GSQPBF74KQ5YTDEPP41T1BZH // kotlin.String | ID of the job to retrieve.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogVariantBulkUpdateJob : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsCatalogVariant : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    val result : GetCatalogVariantUpdateJobResponseCompoundDocument = apiInstance.getUpdateVariantsJob(jobId, revision, fieldsCatalogVariantBulkUpdateJob, fieldsCatalogVariant, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getUpdateVariantsJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getUpdateVariantsJob")
    e.printStackTrace()
}
```

### Parameters
| **jobId** | **kotlin.String**| ID of the job to retrieve. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCatalogVariantBulkUpdateJob** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at] |
| **fieldsCatalogVariant** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, sku, inventory_policy, inventory_quantity, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: variants] |

### Return type

[**GetCatalogVariantUpdateJobResponseCompoundDocument**](GetCatalogVariantUpdateJobResponseCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getUpdateVariantsJobs"></a>
# **getUpdateVariantsJobs**
> GetCatalogVariantUpdateJobResponseCollectionCompoundDocument getUpdateVariantsJobs(revision, fieldsCatalogVariantBulkUpdateJob, filter, pageCursor)

Get Update Variants Jobs

Get all catalog variant bulk update jobs.  Returns a maximum of 100 jobs per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCatalogVariantBulkUpdateJob : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    val result : GetCatalogVariantUpdateJobResponseCollectionCompoundDocument = apiInstance.getUpdateVariantsJobs(revision, fieldsCatalogVariantBulkUpdateJob, filter, pageCursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#getUpdateVariantsJobs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#getUpdateVariantsJobs")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCatalogVariantBulkUpdateJob** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60; | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |

### Return type

[**GetCatalogVariantUpdateJobResponseCollectionCompoundDocument**](GetCatalogVariantUpdateJobResponseCollectionCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="spawnCreateCategoriesJob"></a>
# **spawnCreateCategoriesJob**
> PostCatalogCategoryCreateJobResponse spawnCreateCategoriesJob(revision, catalogCategoryCreateJobCreateQuery)

Spawn Create Categories Job

Create a catalog category bulk create job to create a batch of catalog categories.  Accepts up to 100 catalog categories per request. The maximum allowed payload size is 5MB. The maximum number of jobs in progress at one time is 500.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val catalogCategoryCreateJobCreateQuery : CatalogCategoryCreateJobCreateQuery =  // CatalogCategoryCreateJobCreateQuery | 
try {
    val result : PostCatalogCategoryCreateJobResponse = apiInstance.spawnCreateCategoriesJob(revision, catalogCategoryCreateJobCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#spawnCreateCategoriesJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#spawnCreateCategoriesJob")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogCategoryCreateJobCreateQuery** | [**CatalogCategoryCreateJobCreateQuery**](CatalogCategoryCreateJobCreateQuery.md)|  | |

### Return type

[**PostCatalogCategoryCreateJobResponse**](PostCatalogCategoryCreateJobResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="spawnCreateItemsJob"></a>
# **spawnCreateItemsJob**
> PostCatalogItemCreateJobResponse spawnCreateItemsJob(revision, catalogItemCreateJobCreateQuery)

Spawn Create Items Job

Create a catalog item bulk create job to create a batch of catalog items.  Accepts up to 100 catalog items per request. The maximum allowed payload size is 5MB. The maximum number of jobs in progress at one time is 500.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val catalogItemCreateJobCreateQuery : CatalogItemCreateJobCreateQuery =  // CatalogItemCreateJobCreateQuery | 
try {
    val result : PostCatalogItemCreateJobResponse = apiInstance.spawnCreateItemsJob(revision, catalogItemCreateJobCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#spawnCreateItemsJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#spawnCreateItemsJob")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogItemCreateJobCreateQuery** | [**CatalogItemCreateJobCreateQuery**](CatalogItemCreateJobCreateQuery.md)|  | |

### Return type

[**PostCatalogItemCreateJobResponse**](PostCatalogItemCreateJobResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="spawnCreateVariantsJob"></a>
# **spawnCreateVariantsJob**
> PostCatalogVariantCreateJobResponse spawnCreateVariantsJob(revision, catalogVariantCreateJobCreateQuery)

Spawn Create Variants Job

Create a catalog variant bulk create job to create a batch of catalog variants.  Accepts up to 100 catalog variants per request. The maximum allowed payload size is 5MB. The maximum number of jobs in progress at one time is 500.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val catalogVariantCreateJobCreateQuery : CatalogVariantCreateJobCreateQuery =  // CatalogVariantCreateJobCreateQuery | 
try {
    val result : PostCatalogVariantCreateJobResponse = apiInstance.spawnCreateVariantsJob(revision, catalogVariantCreateJobCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#spawnCreateVariantsJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#spawnCreateVariantsJob")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogVariantCreateJobCreateQuery** | [**CatalogVariantCreateJobCreateQuery**](CatalogVariantCreateJobCreateQuery.md)|  | |

### Return type

[**PostCatalogVariantCreateJobResponse**](PostCatalogVariantCreateJobResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="spawnDeleteCategoriesJob"></a>
# **spawnDeleteCategoriesJob**
> PostCatalogCategoryDeleteJobResponse spawnDeleteCategoriesJob(revision, catalogCategoryDeleteJobCreateQuery)

Spawn Delete Categories Job

Create a catalog category bulk delete job to delete a batch of catalog categories.  Accepts up to 100 catalog categories per request. The maximum allowed payload size is 5MB. The maximum number of jobs in progress at one time is 500.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val catalogCategoryDeleteJobCreateQuery : CatalogCategoryDeleteJobCreateQuery =  // CatalogCategoryDeleteJobCreateQuery | 
try {
    val result : PostCatalogCategoryDeleteJobResponse = apiInstance.spawnDeleteCategoriesJob(revision, catalogCategoryDeleteJobCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#spawnDeleteCategoriesJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#spawnDeleteCategoriesJob")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogCategoryDeleteJobCreateQuery** | [**CatalogCategoryDeleteJobCreateQuery**](CatalogCategoryDeleteJobCreateQuery.md)|  | |

### Return type

[**PostCatalogCategoryDeleteJobResponse**](PostCatalogCategoryDeleteJobResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="spawnDeleteItemsJob"></a>
# **spawnDeleteItemsJob**
> PostCatalogItemDeleteJobResponse spawnDeleteItemsJob(revision, catalogItemDeleteJobCreateQuery)

Spawn Delete Items Job

Create a catalog item bulk delete job to delete a batch of catalog items.  Accepts up to 100 catalog items per request. The maximum allowed payload size is 5MB. The maximum number of jobs in progress at one time is 500.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val catalogItemDeleteJobCreateQuery : CatalogItemDeleteJobCreateQuery =  // CatalogItemDeleteJobCreateQuery | 
try {
    val result : PostCatalogItemDeleteJobResponse = apiInstance.spawnDeleteItemsJob(revision, catalogItemDeleteJobCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#spawnDeleteItemsJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#spawnDeleteItemsJob")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogItemDeleteJobCreateQuery** | [**CatalogItemDeleteJobCreateQuery**](CatalogItemDeleteJobCreateQuery.md)|  | |

### Return type

[**PostCatalogItemDeleteJobResponse**](PostCatalogItemDeleteJobResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="spawnDeleteVariantsJob"></a>
# **spawnDeleteVariantsJob**
> PostCatalogVariantDeleteJobResponse spawnDeleteVariantsJob(revision, catalogVariantDeleteJobCreateQuery)

Spawn Delete Variants Job

Create a catalog variant bulk delete job to delete a batch of catalog variants.  Accepts up to 100 catalog variants per request. The maximum allowed payload size is 5MB. The maximum number of jobs in progress at one time is 500.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val catalogVariantDeleteJobCreateQuery : CatalogVariantDeleteJobCreateQuery =  // CatalogVariantDeleteJobCreateQuery | 
try {
    val result : PostCatalogVariantDeleteJobResponse = apiInstance.spawnDeleteVariantsJob(revision, catalogVariantDeleteJobCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#spawnDeleteVariantsJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#spawnDeleteVariantsJob")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogVariantDeleteJobCreateQuery** | [**CatalogVariantDeleteJobCreateQuery**](CatalogVariantDeleteJobCreateQuery.md)|  | |

### Return type

[**PostCatalogVariantDeleteJobResponse**](PostCatalogVariantDeleteJobResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="spawnUpdateCategoriesJob"></a>
# **spawnUpdateCategoriesJob**
> PostCatalogCategoryUpdateJobResponse spawnUpdateCategoriesJob(revision, catalogCategoryUpdateJobCreateQuery)

Spawn Update Categories Job

Create a catalog category bulk update job to update a batch of catalog categories.  Accepts up to 100 catalog categories per request. The maximum allowed payload size is 5MB. The maximum number of jobs in progress at one time is 500.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val catalogCategoryUpdateJobCreateQuery : CatalogCategoryUpdateJobCreateQuery =  // CatalogCategoryUpdateJobCreateQuery | 
try {
    val result : PostCatalogCategoryUpdateJobResponse = apiInstance.spawnUpdateCategoriesJob(revision, catalogCategoryUpdateJobCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#spawnUpdateCategoriesJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#spawnUpdateCategoriesJob")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogCategoryUpdateJobCreateQuery** | [**CatalogCategoryUpdateJobCreateQuery**](CatalogCategoryUpdateJobCreateQuery.md)|  | |

### Return type

[**PostCatalogCategoryUpdateJobResponse**](PostCatalogCategoryUpdateJobResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="spawnUpdateItemsJob"></a>
# **spawnUpdateItemsJob**
> PostCatalogItemUpdateJobResponse spawnUpdateItemsJob(revision, catalogItemUpdateJobCreateQuery)

Spawn Update Items Job

Create a catalog item bulk update job to update a batch of catalog items.  Accepts up to 100 catalog items per request. The maximum allowed payload size is 5MB. The maximum number of jobs in progress at one time is 500.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val catalogItemUpdateJobCreateQuery : CatalogItemUpdateJobCreateQuery =  // CatalogItemUpdateJobCreateQuery | 
try {
    val result : PostCatalogItemUpdateJobResponse = apiInstance.spawnUpdateItemsJob(revision, catalogItemUpdateJobCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#spawnUpdateItemsJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#spawnUpdateItemsJob")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogItemUpdateJobCreateQuery** | [**CatalogItemUpdateJobCreateQuery**](CatalogItemUpdateJobCreateQuery.md)|  | |

### Return type

[**PostCatalogItemUpdateJobResponse**](PostCatalogItemUpdateJobResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="spawnUpdateVariantsJob"></a>
# **spawnUpdateVariantsJob**
> PostCatalogVariantUpdateJobResponse spawnUpdateVariantsJob(revision, catalogVariantUpdateJobCreateQuery)

Spawn Update Variants Job

Create a catalog variant bulk update job to update a batch of catalog variants.  Accepts up to 100 catalog variants per request. The maximum allowed payload size is 5MB. The maximum number of jobs in progress at one time is 500.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val catalogVariantUpdateJobCreateQuery : CatalogVariantUpdateJobCreateQuery =  // CatalogVariantUpdateJobCreateQuery | 
try {
    val result : PostCatalogVariantUpdateJobResponse = apiInstance.spawnUpdateVariantsJob(revision, catalogVariantUpdateJobCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#spawnUpdateVariantsJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#spawnUpdateVariantsJob")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogVariantUpdateJobCreateQuery** | [**CatalogVariantUpdateJobCreateQuery**](CatalogVariantUpdateJobCreateQuery.md)|  | |

### Return type

[**PostCatalogVariantUpdateJobResponse**](PostCatalogVariantUpdateJobResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateCatalogCategory"></a>
# **updateCatalogCategory**
> PatchCatalogCategoryResponse updateCatalogCategory(id, revision, catalogCategoryUpdateQuery)

Update Catalog Category

Update a catalog category with the given category ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val id : kotlin.String = $custom:::$default:::SAMPLE-DATA-CATEGORY-APPAREL // kotlin.String | The catalog category ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val catalogCategoryUpdateQuery : CatalogCategoryUpdateQuery =  // CatalogCategoryUpdateQuery | 
try {
    val result : PatchCatalogCategoryResponse = apiInstance.updateCatalogCategory(id, revision, catalogCategoryUpdateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#updateCatalogCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#updateCatalogCategory")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The catalog category ID is a compound ID (string), with format: &#x60;{integration}:::{catalog}:::{external_id}&#x60;. Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog is &#x60;$default&#x60;. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogCategoryUpdateQuery** | [**CatalogCategoryUpdateQuery**](CatalogCategoryUpdateQuery.md)|  | |

### Return type

[**PatchCatalogCategoryResponse**](PatchCatalogCategoryResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateCatalogCategoryRelationshipsItems"></a>
# **updateCatalogCategoryRelationshipsItems**
> updateCatalogCategoryRelationshipsItems(id, revision, catalogCategoryItemOp)

Update Catalog Category Relationships Items

Update item relationships for the given category ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val catalogCategoryItemOp : CatalogCategoryItemOp =  // CatalogCategoryItemOp | 
try {
    apiInstance.updateCatalogCategoryRelationshipsItems(id, revision, catalogCategoryItemOp)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#updateCatalogCategoryRelationshipsItems")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#updateCatalogCategoryRelationshipsItems")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogCategoryItemOp** | [**CatalogCategoryItemOp**](CatalogCategoryItemOp.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateCatalogItem"></a>
# **updateCatalogItem**
> PatchCatalogItemResponse updateCatalogItem(id, revision, catalogItemUpdateQuery)

Update Catalog Item

Update a catalog item with the given item ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val id : kotlin.String = $custom:::$default:::SAMPLE-DATA-ITEM-1 // kotlin.String | The catalog item ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val catalogItemUpdateQuery : CatalogItemUpdateQuery =  // CatalogItemUpdateQuery | 
try {
    val result : PatchCatalogItemResponse = apiInstance.updateCatalogItem(id, revision, catalogItemUpdateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#updateCatalogItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#updateCatalogItem")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The catalog item ID is a compound ID (string), with format: &#x60;{integration}:::{catalog}:::{external_id}&#x60;. Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog is &#x60;$default&#x60;. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogItemUpdateQuery** | [**CatalogItemUpdateQuery**](CatalogItemUpdateQuery.md)|  | |

### Return type

[**PatchCatalogItemResponse**](PatchCatalogItemResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateCatalogItemRelationshipsCategories"></a>
# **updateCatalogItemRelationshipsCategories**
> updateCatalogItemRelationshipsCategories(id, revision, catalogItemCategoryOp)

Update Catalog Item Relationships Categories

Update catalog category relationships for the given item ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val catalogItemCategoryOp : CatalogItemCategoryOp =  // CatalogItemCategoryOp | 
try {
    apiInstance.updateCatalogItemRelationshipsCategories(id, revision, catalogItemCategoryOp)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#updateCatalogItemRelationshipsCategories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#updateCatalogItemRelationshipsCategories")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogItemCategoryOp** | [**CatalogItemCategoryOp**](CatalogItemCategoryOp.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateCatalogVariant"></a>
# **updateCatalogVariant**
> PatchCatalogVariantResponse updateCatalogVariant(id, revision, catalogVariantUpdateQuery)

Update Catalog Variant

Update a catalog item variant with the given variant ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CatalogsApi()
val id : kotlin.String = $custom:::$default:::SAMPLE-DATA-ITEM-1-VARIANT-MEDIUM // kotlin.String | The catalog variant ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val catalogVariantUpdateQuery : CatalogVariantUpdateQuery =  // CatalogVariantUpdateQuery | 
try {
    val result : PatchCatalogVariantResponse = apiInstance.updateCatalogVariant(id, revision, catalogVariantUpdateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CatalogsApi#updateCatalogVariant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CatalogsApi#updateCatalogVariant")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The catalog variant ID is a compound ID (string), with format: &#x60;{integration}:::{catalog}:::{external_id}&#x60;. Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog is &#x60;$default&#x60;. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogVariantUpdateQuery** | [**CatalogVariantUpdateQuery**](CatalogVariantUpdateQuery.md)|  | |

### Return type

[**PatchCatalogVariantResponse**](PatchCatalogVariantResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

