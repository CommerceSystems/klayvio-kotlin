# CatalogsApi

All URIs are relative to *https://a.klaviyo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBackInStockSubscription**](CatalogsApi.md#createBackInStockSubscription) | **POST** /api/back-in-stock-subscriptions/ | Create Back In Stock Subscription
[**createCatalogCategory**](CatalogsApi.md#createCatalogCategory) | **POST** /api/catalog-categories/ | Create Catalog Category
[**createCatalogCategoryRelationshipsItems**](CatalogsApi.md#createCatalogCategoryRelationshipsItems) | **POST** /api/catalog-categories/{id}/relationships/items/ | Create Catalog Category Relationships Items
[**createCatalogItem**](CatalogsApi.md#createCatalogItem) | **POST** /api/catalog-items/ | Create Catalog Item
[**createCatalogItemRelationshipsCategories**](CatalogsApi.md#createCatalogItemRelationshipsCategories) | **POST** /api/catalog-items/{id}/relationships/categories/ | Create Catalog Item Relationships Categories
[**createCatalogVariant**](CatalogsApi.md#createCatalogVariant) | **POST** /api/catalog-variants/ | Create Catalog Variant
[**deleteCatalogCategory**](CatalogsApi.md#deleteCatalogCategory) | **DELETE** /api/catalog-categories/{id}/ | Delete Catalog Category
[**deleteCatalogCategoryRelationshipsItems**](CatalogsApi.md#deleteCatalogCategoryRelationshipsItems) | **DELETE** /api/catalog-categories/{id}/relationships/items/ | Delete Catalog Category Relationships Items
[**deleteCatalogItem**](CatalogsApi.md#deleteCatalogItem) | **DELETE** /api/catalog-items/{id}/ | Delete Catalog Item
[**deleteCatalogItemRelationshipsCategories**](CatalogsApi.md#deleteCatalogItemRelationshipsCategories) | **DELETE** /api/catalog-items/{id}/relationships/categories/ | Delete Catalog Item Relationships Categories
[**deleteCatalogVariant**](CatalogsApi.md#deleteCatalogVariant) | **DELETE** /api/catalog-variants/{id}/ | Delete Catalog Variant
[**getCatalogCategories**](CatalogsApi.md#getCatalogCategories) | **GET** /api/catalog-categories/ | Get Catalog Categories
[**getCatalogCategory**](CatalogsApi.md#getCatalogCategory) | **GET** /api/catalog-categories/{id}/ | Get Catalog Category
[**getCatalogCategoryItems**](CatalogsApi.md#getCatalogCategoryItems) | **GET** /api/catalog-categories/{id}/items/ | Get Catalog Category Items
[**getCatalogCategoryRelationshipsItems**](CatalogsApi.md#getCatalogCategoryRelationshipsItems) | **GET** /api/catalog-categories/{id}/relationships/items/ | Get Catalog Category Relationships Items
[**getCatalogItem**](CatalogsApi.md#getCatalogItem) | **GET** /api/catalog-items/{id}/ | Get Catalog Item
[**getCatalogItemCategories**](CatalogsApi.md#getCatalogItemCategories) | **GET** /api/catalog-items/{id}/categories/ | Get Catalog Item Categories
[**getCatalogItemRelationshipsCategories**](CatalogsApi.md#getCatalogItemRelationshipsCategories) | **GET** /api/catalog-items/{id}/relationships/categories/ | Get Catalog Item Relationships Categories
[**getCatalogItemVariants**](CatalogsApi.md#getCatalogItemVariants) | **GET** /api/catalog-items/{id}/variants/ | Get Catalog Item Variants
[**getCatalogItems**](CatalogsApi.md#getCatalogItems) | **GET** /api/catalog-items/ | Get Catalog Items
[**getCatalogVariant**](CatalogsApi.md#getCatalogVariant) | **GET** /api/catalog-variants/{id}/ | Get Catalog Variant
[**getCatalogVariants**](CatalogsApi.md#getCatalogVariants) | **GET** /api/catalog-variants/ | Get Catalog Variants
[**getCreateCategoriesJob**](CatalogsApi.md#getCreateCategoriesJob) | **GET** /api/catalog-category-bulk-create-jobs/{job_id}/ | Get Create Categories Job
[**getCreateCategoriesJobs**](CatalogsApi.md#getCreateCategoriesJobs) | **GET** /api/catalog-category-bulk-create-jobs/ | Get Create Categories Jobs
[**getCreateItemsJob**](CatalogsApi.md#getCreateItemsJob) | **GET** /api/catalog-item-bulk-create-jobs/{job_id}/ | Get Create Items Job
[**getCreateItemsJobs**](CatalogsApi.md#getCreateItemsJobs) | **GET** /api/catalog-item-bulk-create-jobs/ | Get Create Items Jobs
[**getCreateVariantsJob**](CatalogsApi.md#getCreateVariantsJob) | **GET** /api/catalog-variant-bulk-create-jobs/{job_id}/ | Get Create Variants Job
[**getCreateVariantsJobs**](CatalogsApi.md#getCreateVariantsJobs) | **GET** /api/catalog-variant-bulk-create-jobs/ | Get Create Variants Jobs
[**getDeleteCategoriesJob**](CatalogsApi.md#getDeleteCategoriesJob) | **GET** /api/catalog-category-bulk-delete-jobs/{job_id}/ | Get Delete Categories Job
[**getDeleteCategoriesJobs**](CatalogsApi.md#getDeleteCategoriesJobs) | **GET** /api/catalog-category-bulk-delete-jobs/ | Get Delete Categories Jobs
[**getDeleteItemsJob**](CatalogsApi.md#getDeleteItemsJob) | **GET** /api/catalog-item-bulk-delete-jobs/{job_id}/ | Get Delete Items Job
[**getDeleteItemsJobs**](CatalogsApi.md#getDeleteItemsJobs) | **GET** /api/catalog-item-bulk-delete-jobs/ | Get Delete Items Jobs
[**getDeleteVariantsJob**](CatalogsApi.md#getDeleteVariantsJob) | **GET** /api/catalog-variant-bulk-delete-jobs/{job_id}/ | Get Delete Variants Job
[**getDeleteVariantsJobs**](CatalogsApi.md#getDeleteVariantsJobs) | **GET** /api/catalog-variant-bulk-delete-jobs/ | Get Delete Variants Jobs
[**getUpdateCategoriesJob**](CatalogsApi.md#getUpdateCategoriesJob) | **GET** /api/catalog-category-bulk-update-jobs/{job_id}/ | Get Update Categories Job
[**getUpdateCategoriesJobs**](CatalogsApi.md#getUpdateCategoriesJobs) | **GET** /api/catalog-category-bulk-update-jobs/ | Get Update Categories Jobs
[**getUpdateItemsJob**](CatalogsApi.md#getUpdateItemsJob) | **GET** /api/catalog-item-bulk-update-jobs/{job_id}/ | Get Update Items Job
[**getUpdateItemsJobs**](CatalogsApi.md#getUpdateItemsJobs) | **GET** /api/catalog-item-bulk-update-jobs/ | Get Update Items Jobs
[**getUpdateVariantsJob**](CatalogsApi.md#getUpdateVariantsJob) | **GET** /api/catalog-variant-bulk-update-jobs/{job_id}/ | Get Update Variants Job
[**getUpdateVariantsJobs**](CatalogsApi.md#getUpdateVariantsJobs) | **GET** /api/catalog-variant-bulk-update-jobs/ | Get Update Variants Jobs
[**spawnCreateCategoriesJob**](CatalogsApi.md#spawnCreateCategoriesJob) | **POST** /api/catalog-category-bulk-create-jobs/ | Spawn Create Categories Job
[**spawnCreateItemsJob**](CatalogsApi.md#spawnCreateItemsJob) | **POST** /api/catalog-item-bulk-create-jobs/ | Spawn Create Items Job
[**spawnCreateVariantsJob**](CatalogsApi.md#spawnCreateVariantsJob) | **POST** /api/catalog-variant-bulk-create-jobs/ | Spawn Create Variants Job
[**spawnDeleteCategoriesJob**](CatalogsApi.md#spawnDeleteCategoriesJob) | **POST** /api/catalog-category-bulk-delete-jobs/ | Spawn Delete Categories Job
[**spawnDeleteItemsJob**](CatalogsApi.md#spawnDeleteItemsJob) | **POST** /api/catalog-item-bulk-delete-jobs/ | Spawn Delete Items Job
[**spawnDeleteVariantsJob**](CatalogsApi.md#spawnDeleteVariantsJob) | **POST** /api/catalog-variant-bulk-delete-jobs/ | Spawn Delete Variants Job
[**spawnUpdateCategoriesJob**](CatalogsApi.md#spawnUpdateCategoriesJob) | **POST** /api/catalog-category-bulk-update-jobs/ | Spawn Update Categories Job
[**spawnUpdateItemsJob**](CatalogsApi.md#spawnUpdateItemsJob) | **POST** /api/catalog-item-bulk-update-jobs/ | Spawn Update Items Job
[**spawnUpdateVariantsJob**](CatalogsApi.md#spawnUpdateVariantsJob) | **POST** /api/catalog-variant-bulk-update-jobs/ | Spawn Update Variants Job
[**updateCatalogCategory**](CatalogsApi.md#updateCatalogCategory) | **PATCH** /api/catalog-categories/{id}/ | Update Catalog Category
[**updateCatalogCategoryRelationshipsItems**](CatalogsApi.md#updateCatalogCategoryRelationshipsItems) | **PATCH** /api/catalog-categories/{id}/relationships/items/ | Update Catalog Category Relationships Items
[**updateCatalogItem**](CatalogsApi.md#updateCatalogItem) | **PATCH** /api/catalog-items/{id}/ | Update Catalog Item
[**updateCatalogItemRelationshipsCategories**](CatalogsApi.md#updateCatalogItemRelationshipsCategories) | **PATCH** /api/catalog-items/{id}/relationships/categories/ | Update Catalog Item Relationships Categories
[**updateCatalogVariant**](CatalogsApi.md#updateCatalogVariant) | **PATCH** /api/catalog-variants/{id}/ | Update Catalog Variant

<a name="createBackInStockSubscription"></a>
# **createBackInStockSubscription**
> createBackInStockSubscription(body, revision)

Create Back In Stock Subscription

Subscribe a profile to receive back in stock notifications. Check out [our Back in Stock API guide](https://developers.klaviyo.com/en/docs/how_to_set_up_custom_back_in_stock) for more details.  This endpoint is specifically designed to be called from server-side applications. To create subscriptions from client-side contexts, use [POST /client/back-in-stock-subscriptions](https://developers.klaviyo.com/en/reference/create_client_back_in_stock_subscription).&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60; &#x60;profiles:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
ServerBISSubscriptionCreateQuery body = new ServerBISSubscriptionCreateQuery(); // ServerBISSubscriptionCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.createBackInStockSubscription(body, revision);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#createBackInStockSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServerBISSubscriptionCreateQuery**](ServerBISSubscriptionCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCatalogCategory"></a>
# **createCatalogCategory**
> PostCatalogCategoryResponse createCatalogCategory(body, revision)

Create Catalog Category

Create a new catalog category.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
CatalogCategoryCreateQuery body = new CatalogCategoryCreateQuery(); // CatalogCategoryCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostCatalogCategoryResponse result = apiInstance.createCatalogCategory(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#createCatalogCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CatalogCategoryCreateQuery**](CatalogCategoryCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostCatalogCategoryResponse**](PostCatalogCategoryResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCatalogCategoryRelationshipsItems"></a>
# **createCatalogCategoryRelationshipsItems**
> createCatalogCategoryRelationshipsItems(body, revision, id)

Create Catalog Category Relationships Items

Create a new item relationship for the given category ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
CatalogCategoryItemOp body = new CatalogCategoryItemOp(); // CatalogCategoryItemOp | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | 
try {
    apiInstance.createCatalogCategoryRelationshipsItems(body, revision, id);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#createCatalogCategoryRelationshipsItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CatalogCategoryItemOp**](CatalogCategoryItemOp.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCatalogItem"></a>
# **createCatalogItem**
> PostCatalogItemResponse createCatalogItem(body, revision)

Create Catalog Item

Create a new catalog item.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
CatalogItemCreateQuery body = new CatalogItemCreateQuery(); // CatalogItemCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostCatalogItemResponse result = apiInstance.createCatalogItem(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#createCatalogItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CatalogItemCreateQuery**](CatalogItemCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostCatalogItemResponse**](PostCatalogItemResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCatalogItemRelationshipsCategories"></a>
# **createCatalogItemRelationshipsCategories**
> createCatalogItemRelationshipsCategories(body, revision, id)

Create Catalog Item Relationships Categories

Create a new catalog category relationship for the given item ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
CatalogItemCategoryOp body = new CatalogItemCategoryOp(); // CatalogItemCategoryOp | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | 
try {
    apiInstance.createCatalogItemRelationshipsCategories(body, revision, id);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#createCatalogItemRelationshipsCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CatalogItemCategoryOp**](CatalogItemCategoryOp.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCatalogVariant"></a>
# **createCatalogVariant**
> PostCatalogVariantResponse createCatalogVariant(body, revision)

Create Catalog Variant

Create a new variant for a related catalog item.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
CatalogVariantCreateQuery body = new CatalogVariantCreateQuery(); // CatalogVariantCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostCatalogVariantResponse result = apiInstance.createCatalogVariant(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#createCatalogVariant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CatalogVariantCreateQuery**](CatalogVariantCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostCatalogVariantResponse**](PostCatalogVariantResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCatalogCategory"></a>
# **deleteCatalogCategory**
> deleteCatalogCategory(id, revision)

Delete Catalog Category

Delete a catalog category using the given category ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String id = "id_example"; // String | The catalog category ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.deleteCatalogCategory(id, revision);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#deleteCatalogCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The catalog category ID is a compound ID (string), with format: &#x60;{integration}:::{catalog}:::{external_id}&#x60;. Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog is &#x60;$default&#x60;. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCatalogCategoryRelationshipsItems"></a>
# **deleteCatalogCategoryRelationshipsItems**
> deleteCatalogCategoryRelationshipsItems(body, revision, id)

Delete Catalog Category Relationships Items

Delete item relationships for the given category ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
CatalogCategoryItemOp body = new CatalogCategoryItemOp(); // CatalogCategoryItemOp | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | 
try {
    apiInstance.deleteCatalogCategoryRelationshipsItems(body, revision, id);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#deleteCatalogCategoryRelationshipsItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CatalogCategoryItemOp**](CatalogCategoryItemOp.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCatalogItem"></a>
# **deleteCatalogItem**
> deleteCatalogItem(id, revision)

Delete Catalog Item

Delete a catalog item with the given item ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String id = "id_example"; // String | The catalog item ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.deleteCatalogItem(id, revision);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#deleteCatalogItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The catalog item ID is a compound ID (string), with format: &#x60;{integration}:::{catalog}:::{external_id}&#x60;. Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog is &#x60;$default&#x60;. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCatalogItemRelationshipsCategories"></a>
# **deleteCatalogItemRelationshipsCategories**
> deleteCatalogItemRelationshipsCategories(body, revision, id)

Delete Catalog Item Relationships Categories

Delete catalog category relationships for the given item ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
CatalogItemCategoryOp body = new CatalogItemCategoryOp(); // CatalogItemCategoryOp | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | 
try {
    apiInstance.deleteCatalogItemRelationshipsCategories(body, revision, id);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#deleteCatalogItemRelationshipsCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CatalogItemCategoryOp**](CatalogItemCategoryOp.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCatalogVariant"></a>
# **deleteCatalogVariant**
> deleteCatalogVariant(id, revision)

Delete Catalog Variant

Delete a catalog item variant with the given variant ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String id = "id_example"; // String | The catalog variant ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.deleteCatalogVariant(id, revision);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#deleteCatalogVariant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The catalog variant ID is a compound ID (string), with format: &#x60;{integration}:::{catalog}:::{external_id}&#x60;. Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog is &#x60;$default&#x60;. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCatalogCategories"></a>
# **getCatalogCategories**
> GetCatalogCategoryResponseCollection getCatalogCategories(revision, fieldsCatalogCategory, filter, pageCursor, sort)

Get Catalog Categories

Get all catalog categories in an account.  Catalog categories can be sorted by the following fields, in ascending and descending order: &#x60;created&#x60;  Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog type is &#x60;$default&#x60;.  Returns a maximum of 100 categories per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogCategory = Arrays.asList("fieldsCatalogCategory_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`ids`: `any`<br>`item.id`: `equals`<br>`name`: `contains`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
String sort = "sort_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    GetCatalogCategoryResponseCollection result = apiInstance.getCatalogCategories(revision, fieldsCatalogCategory, filter, pageCursor, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getCatalogCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogCategory** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, name, updated]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;ids&#x60;: &#x60;any&#x60;&lt;br&gt;&#x60;item.id&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;name&#x60;: &#x60;contains&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]
 **sort** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created]

### Return type

[**GetCatalogCategoryResponseCollection**](GetCatalogCategoryResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCatalogCategory"></a>
# **getCatalogCategory**
> GetCatalogCategoryResponse getCatalogCategory(id, revision, fieldsCatalogCategory)

Get Catalog Category

Get a catalog category with the given category ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String id = "id_example"; // String | The catalog category ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogCategory = Arrays.asList("fieldsCatalogCategory_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetCatalogCategoryResponse result = apiInstance.getCatalogCategory(id, revision, fieldsCatalogCategory);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getCatalogCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The catalog category ID is a compound ID (string), with format: &#x60;{integration}:::{catalog}:::{external_id}&#x60;. Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog is &#x60;$default&#x60;. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogCategory** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, name, updated]

### Return type

[**GetCatalogCategoryResponse**](GetCatalogCategoryResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCatalogCategoryItems"></a>
# **getCatalogCategoryItems**
> GetCatalogItemResponseCollectionCompoundDocument getCatalogCategoryItems(id, revision, fieldsCatalogItem, fieldsCatalogVariant, filter, include, pageCursor, sort)

Get Catalog Category Items

Get all items in a category with the given category ID.  Items can be sorted by the following fields, in ascending and descending order: &#x60;created&#x60;  Returns a maximum of 100 items per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogItem = Arrays.asList("fieldsCatalogItem_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsCatalogVariant = Arrays.asList("fieldsCatalogVariant_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`ids`: `any`<br>`category.id`: `equals`<br>`title`: `contains`<br>`published`: `equals`
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
String sort = "sort_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    GetCatalogItemResponseCollectionCompoundDocument result = apiInstance.getCatalogCategoryItems(id, revision, fieldsCatalogItem, fieldsCatalogVariant, filter, include, pageCursor, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getCatalogCategoryItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogItem** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated]
 **fieldsCatalogVariant** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, sku, inventory_policy, inventory_quantity, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;ids&#x60;: &#x60;any&#x60;&lt;br&gt;&#x60;category.id&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;title&#x60;: &#x60;contains&#x60;&lt;br&gt;&#x60;published&#x60;: &#x60;equals&#x60; | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: variants]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]
 **sort** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created]

### Return type

[**GetCatalogItemResponseCollectionCompoundDocument**](GetCatalogItemResponseCollectionCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCatalogCategoryRelationshipsItems"></a>
# **getCatalogCategoryRelationshipsItems**
> GetCatalogCategoryItemListResponseCollection getCatalogCategoryRelationshipsItems(id, revision, pageCursor)

Get Catalog Category Relationships Items

Get all items in the given category ID.  Returns a maximum of 100 items per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    GetCatalogCategoryItemListResponseCollection result = apiInstance.getCatalogCategoryRelationshipsItems(id, revision, pageCursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getCatalogCategoryRelationshipsItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]

### Return type

[**GetCatalogCategoryItemListResponseCollection**](GetCatalogCategoryItemListResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCatalogItem"></a>
# **getCatalogItem**
> GetCatalogItemResponseCompoundDocument getCatalogItem(id, revision, fieldsCatalogItem, fieldsCatalogVariant, include)

Get Catalog Item

Get a specific catalog item with the given item ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String id = "id_example"; // String | The catalog item ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogItem = Arrays.asList("fieldsCatalogItem_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsCatalogVariant = Arrays.asList("fieldsCatalogVariant_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    GetCatalogItemResponseCompoundDocument result = apiInstance.getCatalogItem(id, revision, fieldsCatalogItem, fieldsCatalogVariant, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getCatalogItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The catalog item ID is a compound ID (string), with format: &#x60;{integration}:::{catalog}:::{external_id}&#x60;. Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog is &#x60;$default&#x60;. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogItem** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated]
 **fieldsCatalogVariant** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, sku, inventory_policy, inventory_quantity, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: variants]

### Return type

[**GetCatalogItemResponseCompoundDocument**](GetCatalogItemResponseCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCatalogItemCategories"></a>
# **getCatalogItemCategories**
> GetCatalogCategoryResponseCollection getCatalogItemCategories(id, revision, fieldsCatalogCategory, filter, pageCursor, sort)

Get Catalog Item Categories

Get all catalog categories that an item with the given item ID is in.  Catalog categories can be sorted by the following fields, in ascending and descending order: &#x60;created&#x60;  Returns a maximum of 100 categories per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogCategory = Arrays.asList("fieldsCatalogCategory_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`ids`: `any`<br>`item.id`: `equals`<br>`name`: `contains`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
String sort = "sort_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    GetCatalogCategoryResponseCollection result = apiInstance.getCatalogItemCategories(id, revision, fieldsCatalogCategory, filter, pageCursor, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getCatalogItemCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogCategory** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, name, updated]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;ids&#x60;: &#x60;any&#x60;&lt;br&gt;&#x60;item.id&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;name&#x60;: &#x60;contains&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]
 **sort** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created]

### Return type

[**GetCatalogCategoryResponseCollection**](GetCatalogCategoryResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCatalogItemRelationshipsCategories"></a>
# **getCatalogItemRelationshipsCategories**
> GetCatalogItemCategoryListResponseCollection getCatalogItemRelationshipsCategories(id, revision, pageCursor)

Get Catalog Item Relationships Categories

Get all catalog categories that a particular item is in.  Returns a maximum of 100 categories per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    GetCatalogItemCategoryListResponseCollection result = apiInstance.getCatalogItemRelationshipsCategories(id, revision, pageCursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getCatalogItemRelationshipsCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]

### Return type

[**GetCatalogItemCategoryListResponseCollection**](GetCatalogItemCategoryListResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCatalogItemVariants"></a>
# **getCatalogItemVariants**
> GetCatalogVariantResponseCollection getCatalogItemVariants(id, revision, fieldsCatalogVariant, filter, pageCursor, sort)

Get Catalog Item Variants

Get all variants related to the given item ID.  Variants can be sorted by the following fields, in ascending and descending order: &#x60;created&#x60;  Returns a maximum of 100 variants per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogVariant = Arrays.asList("fieldsCatalogVariant_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`ids`: `any`<br>`item.id`: `equals`<br>`sku`: `equals`<br>`title`: `contains`<br>`published`: `equals`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
String sort = "sort_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    GetCatalogVariantResponseCollection result = apiInstance.getCatalogItemVariants(id, revision, fieldsCatalogVariant, filter, pageCursor, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getCatalogItemVariants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogVariant** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, sku, inventory_policy, inventory_quantity, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;ids&#x60;: &#x60;any&#x60;&lt;br&gt;&#x60;item.id&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;sku&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;title&#x60;: &#x60;contains&#x60;&lt;br&gt;&#x60;published&#x60;: &#x60;equals&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]
 **sort** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created]

### Return type

[**GetCatalogVariantResponseCollection**](GetCatalogVariantResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCatalogItems"></a>
# **getCatalogItems**
> GetCatalogItemResponseCollectionCompoundDocument getCatalogItems(revision, fieldsCatalogItem, fieldsCatalogVariant, filter, include, pageCursor, sort)

Get Catalog Items

Get all catalog items in an account.  Catalog items can be sorted by the following fields, in ascending and descending order: &#x60;created&#x60;  Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog type is &#x60;$default&#x60;.  Returns a maximum of 100 items per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogItem = Arrays.asList("fieldsCatalogItem_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsCatalogVariant = Arrays.asList("fieldsCatalogVariant_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`ids`: `any`<br>`category.id`: `equals`<br>`title`: `contains`<br>`published`: `equals`
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
String sort = "sort_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    GetCatalogItemResponseCollectionCompoundDocument result = apiInstance.getCatalogItems(revision, fieldsCatalogItem, fieldsCatalogVariant, filter, include, pageCursor, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getCatalogItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogItem** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated]
 **fieldsCatalogVariant** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, sku, inventory_policy, inventory_quantity, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;ids&#x60;: &#x60;any&#x60;&lt;br&gt;&#x60;category.id&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;title&#x60;: &#x60;contains&#x60;&lt;br&gt;&#x60;published&#x60;: &#x60;equals&#x60; | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: variants]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]
 **sort** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created]

### Return type

[**GetCatalogItemResponseCollectionCompoundDocument**](GetCatalogItemResponseCollectionCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCatalogVariant"></a>
# **getCatalogVariant**
> GetCatalogVariantResponse getCatalogVariant(id, revision, fieldsCatalogVariant)

Get Catalog Variant

Get a catalog item variant with the given variant ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String id = "id_example"; // String | The catalog variant ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogVariant = Arrays.asList("fieldsCatalogVariant_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetCatalogVariantResponse result = apiInstance.getCatalogVariant(id, revision, fieldsCatalogVariant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getCatalogVariant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The catalog variant ID is a compound ID (string), with format: &#x60;{integration}:::{catalog}:::{external_id}&#x60;. Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog is &#x60;$default&#x60;. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogVariant** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, sku, inventory_policy, inventory_quantity, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated]

### Return type

[**GetCatalogVariantResponse**](GetCatalogVariantResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCatalogVariants"></a>
# **getCatalogVariants**
> GetCatalogVariantResponseCollection getCatalogVariants(revision, fieldsCatalogVariant, filter, pageCursor, sort)

Get Catalog Variants

Get all variants in an account.  Variants can be sorted by the following fields, in ascending and descending order: &#x60;created&#x60;  Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog type is &#x60;$default&#x60;.  Returns a maximum of 100 variants per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogVariant = Arrays.asList("fieldsCatalogVariant_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`ids`: `any`<br>`item.id`: `equals`<br>`sku`: `equals`<br>`title`: `contains`<br>`published`: `equals`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
String sort = "sort_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    GetCatalogVariantResponseCollection result = apiInstance.getCatalogVariants(revision, fieldsCatalogVariant, filter, pageCursor, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getCatalogVariants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogVariant** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, sku, inventory_policy, inventory_quantity, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;ids&#x60;: &#x60;any&#x60;&lt;br&gt;&#x60;item.id&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;sku&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;title&#x60;: &#x60;contains&#x60;&lt;br&gt;&#x60;published&#x60;: &#x60;equals&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]
 **sort** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created]

### Return type

[**GetCatalogVariantResponseCollection**](GetCatalogVariantResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreateCategoriesJob"></a>
# **getCreateCategoriesJob**
> GetCatalogCategoryCreateJobResponseCompoundDocument getCreateCategoriesJob(jobId, revision, fieldsCatalogCategoryBulkCreateJob, fieldsCatalogCategory, include)

Get Create Categories Job

Get a catalog category bulk create job with the given job ID.  An &#x60;include&#x60; parameter can be provided to get the following related resource data: &#x60;categories&#x60;.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String jobId = "jobId_example"; // String | ID of the job to retrieve.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogCategoryBulkCreateJob = Arrays.asList("fieldsCatalogCategoryBulkCreateJob_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsCatalogCategory = Arrays.asList("fieldsCatalogCategory_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    GetCatalogCategoryCreateJobResponseCompoundDocument result = apiInstance.getCreateCategoriesJob(jobId, revision, fieldsCatalogCategoryBulkCreateJob, fieldsCatalogCategory, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getCreateCategoriesJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| ID of the job to retrieve. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogCategoryBulkCreateJob** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at]
 **fieldsCatalogCategory** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, name, updated]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: categories]

### Return type

[**GetCatalogCategoryCreateJobResponseCompoundDocument**](GetCatalogCategoryCreateJobResponseCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreateCategoriesJobs"></a>
# **getCreateCategoriesJobs**
> GetCatalogCategoryCreateJobResponseCollectionCompoundDocument getCreateCategoriesJobs(revision, fieldsCatalogCategoryBulkCreateJob, filter, pageCursor)

Get Create Categories Jobs

Get all catalog category bulk create jobs.  Returns a maximum of 100 jobs per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogCategoryBulkCreateJob = Arrays.asList("fieldsCatalogCategoryBulkCreateJob_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    GetCatalogCategoryCreateJobResponseCollectionCompoundDocument result = apiInstance.getCreateCategoriesJobs(revision, fieldsCatalogCategoryBulkCreateJob, filter, pageCursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getCreateCategoriesJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogCategoryBulkCreateJob** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]

### Return type

[**GetCatalogCategoryCreateJobResponseCollectionCompoundDocument**](GetCatalogCategoryCreateJobResponseCollectionCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreateItemsJob"></a>
# **getCreateItemsJob**
> GetCatalogItemCreateJobResponseCompoundDocument getCreateItemsJob(jobId, revision, fieldsCatalogItemBulkCreateJob, fieldsCatalogItem, include)

Get Create Items Job

Get a catalog item bulk create job with the given job ID.  An &#x60;include&#x60; parameter can be provided to get the following related resource data: &#x60;items&#x60;.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String jobId = "jobId_example"; // String | ID of the job to retrieve.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogItemBulkCreateJob = Arrays.asList("fieldsCatalogItemBulkCreateJob_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsCatalogItem = Arrays.asList("fieldsCatalogItem_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    GetCatalogItemCreateJobResponseCompoundDocument result = apiInstance.getCreateItemsJob(jobId, revision, fieldsCatalogItemBulkCreateJob, fieldsCatalogItem, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getCreateItemsJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| ID of the job to retrieve. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogItemBulkCreateJob** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at]
 **fieldsCatalogItem** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: items]

### Return type

[**GetCatalogItemCreateJobResponseCompoundDocument**](GetCatalogItemCreateJobResponseCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreateItemsJobs"></a>
# **getCreateItemsJobs**
> GetCatalogItemCreateJobResponseCollectionCompoundDocument getCreateItemsJobs(revision, fieldsCatalogItemBulkCreateJob, filter, pageCursor)

Get Create Items Jobs

Get all catalog item bulk create jobs.  Returns a maximum of 100 jobs per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogItemBulkCreateJob = Arrays.asList("fieldsCatalogItemBulkCreateJob_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    GetCatalogItemCreateJobResponseCollectionCompoundDocument result = apiInstance.getCreateItemsJobs(revision, fieldsCatalogItemBulkCreateJob, filter, pageCursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getCreateItemsJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogItemBulkCreateJob** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]

### Return type

[**GetCatalogItemCreateJobResponseCollectionCompoundDocument**](GetCatalogItemCreateJobResponseCollectionCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreateVariantsJob"></a>
# **getCreateVariantsJob**
> GetCatalogVariantCreateJobResponseCompoundDocument getCreateVariantsJob(jobId, revision, fieldsCatalogVariantBulkCreateJob, fieldsCatalogVariant, include)

Get Create Variants Job

Get a catalog variant bulk create job with the given job ID.  An &#x60;include&#x60; parameter can be provided to get the following related resource data: &#x60;variants&#x60;.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String jobId = "jobId_example"; // String | ID of the job to retrieve.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogVariantBulkCreateJob = Arrays.asList("fieldsCatalogVariantBulkCreateJob_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsCatalogVariant = Arrays.asList("fieldsCatalogVariant_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    GetCatalogVariantCreateJobResponseCompoundDocument result = apiInstance.getCreateVariantsJob(jobId, revision, fieldsCatalogVariantBulkCreateJob, fieldsCatalogVariant, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getCreateVariantsJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| ID of the job to retrieve. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogVariantBulkCreateJob** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at]
 **fieldsCatalogVariant** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, sku, inventory_policy, inventory_quantity, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: variants]

### Return type

[**GetCatalogVariantCreateJobResponseCompoundDocument**](GetCatalogVariantCreateJobResponseCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCreateVariantsJobs"></a>
# **getCreateVariantsJobs**
> GetCatalogVariantCreateJobResponseCollectionCompoundDocument getCreateVariantsJobs(revision, fieldsCatalogVariantBulkCreateJob, filter, pageCursor)

Get Create Variants Jobs

Get all catalog variant bulk create jobs.  Returns a maximum of 100 jobs per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogVariantBulkCreateJob = Arrays.asList("fieldsCatalogVariantBulkCreateJob_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    GetCatalogVariantCreateJobResponseCollectionCompoundDocument result = apiInstance.getCreateVariantsJobs(revision, fieldsCatalogVariantBulkCreateJob, filter, pageCursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getCreateVariantsJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogVariantBulkCreateJob** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]

### Return type

[**GetCatalogVariantCreateJobResponseCollectionCompoundDocument**](GetCatalogVariantCreateJobResponseCollectionCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeleteCategoriesJob"></a>
# **getDeleteCategoriesJob**
> GetCatalogCategoryDeleteJobResponse getDeleteCategoriesJob(jobId, revision, fieldsCatalogCategoryBulkDeleteJob)

Get Delete Categories Job

Get a catalog category bulk delete job with the given job ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String jobId = "jobId_example"; // String | ID of the job to retrieve.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogCategoryBulkDeleteJob = Arrays.asList("fieldsCatalogCategoryBulkDeleteJob_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetCatalogCategoryDeleteJobResponse result = apiInstance.getDeleteCategoriesJob(jobId, revision, fieldsCatalogCategoryBulkDeleteJob);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getDeleteCategoriesJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| ID of the job to retrieve. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogCategoryBulkDeleteJob** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at]

### Return type

[**GetCatalogCategoryDeleteJobResponse**](GetCatalogCategoryDeleteJobResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeleteCategoriesJobs"></a>
# **getDeleteCategoriesJobs**
> GetCatalogCategoryDeleteJobResponseCollection getDeleteCategoriesJobs(revision, fieldsCatalogCategoryBulkDeleteJob, filter, pageCursor)

Get Delete Categories Jobs

Get all catalog category bulk delete jobs.  Returns a maximum of 100 jobs per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogCategoryBulkDeleteJob = Arrays.asList("fieldsCatalogCategoryBulkDeleteJob_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    GetCatalogCategoryDeleteJobResponseCollection result = apiInstance.getDeleteCategoriesJobs(revision, fieldsCatalogCategoryBulkDeleteJob, filter, pageCursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getDeleteCategoriesJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogCategoryBulkDeleteJob** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]

### Return type

[**GetCatalogCategoryDeleteJobResponseCollection**](GetCatalogCategoryDeleteJobResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeleteItemsJob"></a>
# **getDeleteItemsJob**
> GetCatalogItemDeleteJobResponse getDeleteItemsJob(jobId, revision, fieldsCatalogItemBulkDeleteJob)

Get Delete Items Job

Get a catalog item bulk delete job with the given job ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String jobId = "jobId_example"; // String | ID of the job to retrieve.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogItemBulkDeleteJob = Arrays.asList("fieldsCatalogItemBulkDeleteJob_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetCatalogItemDeleteJobResponse result = apiInstance.getDeleteItemsJob(jobId, revision, fieldsCatalogItemBulkDeleteJob);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getDeleteItemsJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| ID of the job to retrieve. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogItemBulkDeleteJob** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at]

### Return type

[**GetCatalogItemDeleteJobResponse**](GetCatalogItemDeleteJobResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeleteItemsJobs"></a>
# **getDeleteItemsJobs**
> GetCatalogItemDeleteJobResponseCollection getDeleteItemsJobs(revision, fieldsCatalogItemBulkDeleteJob, filter, pageCursor)

Get Delete Items Jobs

Get all catalog item bulk delete jobs.  Returns a maximum of 100 jobs per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogItemBulkDeleteJob = Arrays.asList("fieldsCatalogItemBulkDeleteJob_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    GetCatalogItemDeleteJobResponseCollection result = apiInstance.getDeleteItemsJobs(revision, fieldsCatalogItemBulkDeleteJob, filter, pageCursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getDeleteItemsJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogItemBulkDeleteJob** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]

### Return type

[**GetCatalogItemDeleteJobResponseCollection**](GetCatalogItemDeleteJobResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeleteVariantsJob"></a>
# **getDeleteVariantsJob**
> GetCatalogVariantDeleteJobResponse getDeleteVariantsJob(jobId, revision, fieldsCatalogVariantBulkDeleteJob)

Get Delete Variants Job

Get a catalog variant bulk delete job with the given job ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String jobId = "jobId_example"; // String | ID of the job to retrieve.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogVariantBulkDeleteJob = Arrays.asList("fieldsCatalogVariantBulkDeleteJob_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetCatalogVariantDeleteJobResponse result = apiInstance.getDeleteVariantsJob(jobId, revision, fieldsCatalogVariantBulkDeleteJob);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getDeleteVariantsJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| ID of the job to retrieve. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogVariantBulkDeleteJob** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at]

### Return type

[**GetCatalogVariantDeleteJobResponse**](GetCatalogVariantDeleteJobResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeleteVariantsJobs"></a>
# **getDeleteVariantsJobs**
> GetCatalogVariantDeleteJobResponseCollection getDeleteVariantsJobs(revision, fieldsCatalogVariantBulkDeleteJob, filter, pageCursor)

Get Delete Variants Jobs

Get all catalog variant bulk delete jobs.  Returns a maximum of 100 jobs per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogVariantBulkDeleteJob = Arrays.asList("fieldsCatalogVariantBulkDeleteJob_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    GetCatalogVariantDeleteJobResponseCollection result = apiInstance.getDeleteVariantsJobs(revision, fieldsCatalogVariantBulkDeleteJob, filter, pageCursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getDeleteVariantsJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogVariantBulkDeleteJob** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]

### Return type

[**GetCatalogVariantDeleteJobResponseCollection**](GetCatalogVariantDeleteJobResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUpdateCategoriesJob"></a>
# **getUpdateCategoriesJob**
> GetCatalogCategoryUpdateJobResponseCompoundDocument getUpdateCategoriesJob(jobId, revision, fieldsCatalogCategoryBulkUpdateJob, fieldsCatalogCategory, include)

Get Update Categories Job

Get a catalog category bulk update job with the given job ID.  An &#x60;include&#x60; parameter can be provided to get the following related resource data: &#x60;categories&#x60;.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String jobId = "jobId_example"; // String | ID of the job to retrieve.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogCategoryBulkUpdateJob = Arrays.asList("fieldsCatalogCategoryBulkUpdateJob_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsCatalogCategory = Arrays.asList("fieldsCatalogCategory_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    GetCatalogCategoryUpdateJobResponseCompoundDocument result = apiInstance.getUpdateCategoriesJob(jobId, revision, fieldsCatalogCategoryBulkUpdateJob, fieldsCatalogCategory, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getUpdateCategoriesJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| ID of the job to retrieve. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogCategoryBulkUpdateJob** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at]
 **fieldsCatalogCategory** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, name, updated]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: categories]

### Return type

[**GetCatalogCategoryUpdateJobResponseCompoundDocument**](GetCatalogCategoryUpdateJobResponseCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUpdateCategoriesJobs"></a>
# **getUpdateCategoriesJobs**
> GetCatalogCategoryUpdateJobResponseCollectionCompoundDocument getUpdateCategoriesJobs(revision, fieldsCatalogCategoryBulkUpdateJob, filter, pageCursor)

Get Update Categories Jobs

Get all catalog category bulk update jobs.  Returns a maximum of 100 jobs per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogCategoryBulkUpdateJob = Arrays.asList("fieldsCatalogCategoryBulkUpdateJob_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    GetCatalogCategoryUpdateJobResponseCollectionCompoundDocument result = apiInstance.getUpdateCategoriesJobs(revision, fieldsCatalogCategoryBulkUpdateJob, filter, pageCursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getUpdateCategoriesJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogCategoryBulkUpdateJob** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]

### Return type

[**GetCatalogCategoryUpdateJobResponseCollectionCompoundDocument**](GetCatalogCategoryUpdateJobResponseCollectionCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUpdateItemsJob"></a>
# **getUpdateItemsJob**
> GetCatalogItemUpdateJobResponseCompoundDocument getUpdateItemsJob(jobId, revision, fieldsCatalogItemBulkUpdateJob, fieldsCatalogItem, include)

Get Update Items Job

Get a catalog item bulk update job with the given job ID.  An &#x60;include&#x60; parameter can be provided to get the following related resource data: &#x60;items&#x60;.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String jobId = "jobId_example"; // String | ID of the job to retrieve.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogItemBulkUpdateJob = Arrays.asList("fieldsCatalogItemBulkUpdateJob_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsCatalogItem = Arrays.asList("fieldsCatalogItem_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    GetCatalogItemUpdateJobResponseCompoundDocument result = apiInstance.getUpdateItemsJob(jobId, revision, fieldsCatalogItemBulkUpdateJob, fieldsCatalogItem, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getUpdateItemsJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| ID of the job to retrieve. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogItemBulkUpdateJob** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at]
 **fieldsCatalogItem** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: items]

### Return type

[**GetCatalogItemUpdateJobResponseCompoundDocument**](GetCatalogItemUpdateJobResponseCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUpdateItemsJobs"></a>
# **getUpdateItemsJobs**
> GetCatalogItemUpdateJobResponseCollectionCompoundDocument getUpdateItemsJobs(revision, fieldsCatalogItemBulkUpdateJob, filter, pageCursor)

Get Update Items Jobs

Get all catalog item bulk update jobs.  Returns a maximum of 100 jobs per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogItemBulkUpdateJob = Arrays.asList("fieldsCatalogItemBulkUpdateJob_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    GetCatalogItemUpdateJobResponseCollectionCompoundDocument result = apiInstance.getUpdateItemsJobs(revision, fieldsCatalogItemBulkUpdateJob, filter, pageCursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getUpdateItemsJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogItemBulkUpdateJob** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]

### Return type

[**GetCatalogItemUpdateJobResponseCollectionCompoundDocument**](GetCatalogItemUpdateJobResponseCollectionCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUpdateVariantsJob"></a>
# **getUpdateVariantsJob**
> GetCatalogVariantUpdateJobResponseCompoundDocument getUpdateVariantsJob(jobId, revision, fieldsCatalogVariantBulkUpdateJob, fieldsCatalogVariant, include)

Get Update Variants Job

Get a catalog variate bulk update job with the given job ID.  An &#x60;include&#x60; parameter can be provided to get the following related resource data: &#x60;variants&#x60;.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String jobId = "jobId_example"; // String | ID of the job to retrieve.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogVariantBulkUpdateJob = Arrays.asList("fieldsCatalogVariantBulkUpdateJob_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsCatalogVariant = Arrays.asList("fieldsCatalogVariant_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    GetCatalogVariantUpdateJobResponseCompoundDocument result = apiInstance.getUpdateVariantsJob(jobId, revision, fieldsCatalogVariantBulkUpdateJob, fieldsCatalogVariant, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getUpdateVariantsJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| ID of the job to retrieve. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogVariantBulkUpdateJob** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at]
 **fieldsCatalogVariant** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, title, description, sku, inventory_policy, inventory_quantity, price, url, image_full_url, image_thumbnail_url, images, custom_metadata, published, created, updated]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: variants]

### Return type

[**GetCatalogVariantUpdateJobResponseCompoundDocument**](GetCatalogVariantUpdateJobResponseCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUpdateVariantsJobs"></a>
# **getUpdateVariantsJobs**
> GetCatalogVariantUpdateJobResponseCollectionCompoundDocument getUpdateVariantsJobs(revision, fieldsCatalogVariantBulkUpdateJob, filter, pageCursor)

Get Update Variants Jobs

Get all catalog variant bulk update jobs.  Returns a maximum of 100 jobs per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCatalogVariantBulkUpdateJob = Arrays.asList("fieldsCatalogVariantBulkUpdateJob_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    GetCatalogVariantUpdateJobResponseCollectionCompoundDocument result = apiInstance.getUpdateVariantsJobs(revision, fieldsCatalogVariantBulkUpdateJob, filter, pageCursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#getUpdateVariantsJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCatalogVariantBulkUpdateJob** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]

### Return type

[**GetCatalogVariantUpdateJobResponseCollectionCompoundDocument**](GetCatalogVariantUpdateJobResponseCollectionCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="spawnCreateCategoriesJob"></a>
# **spawnCreateCategoriesJob**
> PostCatalogCategoryCreateJobResponse spawnCreateCategoriesJob(body, revision)

Spawn Create Categories Job

Create a catalog category bulk create job to create a batch of catalog categories.  Accepts up to 100 catalog categories per request. The maximum allowed payload size is 5MB. The maximum number of jobs in progress at one time is 500.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
CatalogCategoryCreateJobCreateQuery body = new CatalogCategoryCreateJobCreateQuery(); // CatalogCategoryCreateJobCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostCatalogCategoryCreateJobResponse result = apiInstance.spawnCreateCategoriesJob(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#spawnCreateCategoriesJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CatalogCategoryCreateJobCreateQuery**](CatalogCategoryCreateJobCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostCatalogCategoryCreateJobResponse**](PostCatalogCategoryCreateJobResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="spawnCreateItemsJob"></a>
# **spawnCreateItemsJob**
> PostCatalogItemCreateJobResponse spawnCreateItemsJob(body, revision)

Spawn Create Items Job

Create a catalog item bulk create job to create a batch of catalog items.  Accepts up to 100 catalog items per request. The maximum allowed payload size is 5MB. The maximum number of jobs in progress at one time is 500.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
CatalogItemCreateJobCreateQuery body = new CatalogItemCreateJobCreateQuery(); // CatalogItemCreateJobCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostCatalogItemCreateJobResponse result = apiInstance.spawnCreateItemsJob(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#spawnCreateItemsJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CatalogItemCreateJobCreateQuery**](CatalogItemCreateJobCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostCatalogItemCreateJobResponse**](PostCatalogItemCreateJobResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="spawnCreateVariantsJob"></a>
# **spawnCreateVariantsJob**
> PostCatalogVariantCreateJobResponse spawnCreateVariantsJob(body, revision)

Spawn Create Variants Job

Create a catalog variant bulk create job to create a batch of catalog variants.  Accepts up to 100 catalog variants per request. The maximum allowed payload size is 5MB. The maximum number of jobs in progress at one time is 500.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
CatalogVariantCreateJobCreateQuery body = new CatalogVariantCreateJobCreateQuery(); // CatalogVariantCreateJobCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostCatalogVariantCreateJobResponse result = apiInstance.spawnCreateVariantsJob(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#spawnCreateVariantsJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CatalogVariantCreateJobCreateQuery**](CatalogVariantCreateJobCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostCatalogVariantCreateJobResponse**](PostCatalogVariantCreateJobResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="spawnDeleteCategoriesJob"></a>
# **spawnDeleteCategoriesJob**
> PostCatalogCategoryDeleteJobResponse spawnDeleteCategoriesJob(body, revision)

Spawn Delete Categories Job

Create a catalog category bulk delete job to delete a batch of catalog categories.  Accepts up to 100 catalog categories per request. The maximum allowed payload size is 5MB. The maximum number of jobs in progress at one time is 500.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
CatalogCategoryDeleteJobCreateQuery body = new CatalogCategoryDeleteJobCreateQuery(); // CatalogCategoryDeleteJobCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostCatalogCategoryDeleteJobResponse result = apiInstance.spawnDeleteCategoriesJob(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#spawnDeleteCategoriesJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CatalogCategoryDeleteJobCreateQuery**](CatalogCategoryDeleteJobCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostCatalogCategoryDeleteJobResponse**](PostCatalogCategoryDeleteJobResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="spawnDeleteItemsJob"></a>
# **spawnDeleteItemsJob**
> PostCatalogItemDeleteJobResponse spawnDeleteItemsJob(body, revision)

Spawn Delete Items Job

Create a catalog item bulk delete job to delete a batch of catalog items.  Accepts up to 100 catalog items per request. The maximum allowed payload size is 5MB. The maximum number of jobs in progress at one time is 500.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
CatalogItemDeleteJobCreateQuery body = new CatalogItemDeleteJobCreateQuery(); // CatalogItemDeleteJobCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostCatalogItemDeleteJobResponse result = apiInstance.spawnDeleteItemsJob(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#spawnDeleteItemsJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CatalogItemDeleteJobCreateQuery**](CatalogItemDeleteJobCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostCatalogItemDeleteJobResponse**](PostCatalogItemDeleteJobResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="spawnDeleteVariantsJob"></a>
# **spawnDeleteVariantsJob**
> PostCatalogVariantDeleteJobResponse spawnDeleteVariantsJob(body, revision)

Spawn Delete Variants Job

Create a catalog variant bulk delete job to delete a batch of catalog variants.  Accepts up to 100 catalog variants per request. The maximum allowed payload size is 5MB. The maximum number of jobs in progress at one time is 500.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
CatalogVariantDeleteJobCreateQuery body = new CatalogVariantDeleteJobCreateQuery(); // CatalogVariantDeleteJobCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostCatalogVariantDeleteJobResponse result = apiInstance.spawnDeleteVariantsJob(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#spawnDeleteVariantsJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CatalogVariantDeleteJobCreateQuery**](CatalogVariantDeleteJobCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostCatalogVariantDeleteJobResponse**](PostCatalogVariantDeleteJobResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="spawnUpdateCategoriesJob"></a>
# **spawnUpdateCategoriesJob**
> PostCatalogCategoryUpdateJobResponse spawnUpdateCategoriesJob(body, revision)

Spawn Update Categories Job

Create a catalog category bulk update job to update a batch of catalog categories.  Accepts up to 100 catalog categories per request. The maximum allowed payload size is 5MB. The maximum number of jobs in progress at one time is 500.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
CatalogCategoryUpdateJobCreateQuery body = new CatalogCategoryUpdateJobCreateQuery(); // CatalogCategoryUpdateJobCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostCatalogCategoryUpdateJobResponse result = apiInstance.spawnUpdateCategoriesJob(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#spawnUpdateCategoriesJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CatalogCategoryUpdateJobCreateQuery**](CatalogCategoryUpdateJobCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostCatalogCategoryUpdateJobResponse**](PostCatalogCategoryUpdateJobResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="spawnUpdateItemsJob"></a>
# **spawnUpdateItemsJob**
> PostCatalogItemUpdateJobResponse spawnUpdateItemsJob(body, revision)

Spawn Update Items Job

Create a catalog item bulk update job to update a batch of catalog items.  Accepts up to 100 catalog items per request. The maximum allowed payload size is 5MB. The maximum number of jobs in progress at one time is 500.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
CatalogItemUpdateJobCreateQuery body = new CatalogItemUpdateJobCreateQuery(); // CatalogItemUpdateJobCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostCatalogItemUpdateJobResponse result = apiInstance.spawnUpdateItemsJob(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#spawnUpdateItemsJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CatalogItemUpdateJobCreateQuery**](CatalogItemUpdateJobCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostCatalogItemUpdateJobResponse**](PostCatalogItemUpdateJobResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="spawnUpdateVariantsJob"></a>
# **spawnUpdateVariantsJob**
> PostCatalogVariantUpdateJobResponse spawnUpdateVariantsJob(body, revision)

Spawn Update Variants Job

Create a catalog variant bulk update job to update a batch of catalog variants.  Accepts up to 100 catalog variants per request. The maximum allowed payload size is 5MB. The maximum number of jobs in progress at one time is 500.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
CatalogVariantUpdateJobCreateQuery body = new CatalogVariantUpdateJobCreateQuery(); // CatalogVariantUpdateJobCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostCatalogVariantUpdateJobResponse result = apiInstance.spawnUpdateVariantsJob(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#spawnUpdateVariantsJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CatalogVariantUpdateJobCreateQuery**](CatalogVariantUpdateJobCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostCatalogVariantUpdateJobResponse**](PostCatalogVariantUpdateJobResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCatalogCategory"></a>
# **updateCatalogCategory**
> PatchCatalogCategoryResponse updateCatalogCategory(body, revision, id)

Update Catalog Category

Update a catalog category with the given category ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
CatalogCategoryUpdateQuery body = new CatalogCategoryUpdateQuery(); // CatalogCategoryUpdateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | The catalog category ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
try {
    PatchCatalogCategoryResponse result = apiInstance.updateCatalogCategory(body, revision, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#updateCatalogCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CatalogCategoryUpdateQuery**](CatalogCategoryUpdateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**| The catalog category ID is a compound ID (string), with format: &#x60;{integration}:::{catalog}:::{external_id}&#x60;. Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog is &#x60;$default&#x60;. |

### Return type

[**PatchCatalogCategoryResponse**](PatchCatalogCategoryResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCatalogCategoryRelationshipsItems"></a>
# **updateCatalogCategoryRelationshipsItems**
> updateCatalogCategoryRelationshipsItems(body, revision, id)

Update Catalog Category Relationships Items

Update item relationships for the given category ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
CatalogCategoryItemOp body = new CatalogCategoryItemOp(); // CatalogCategoryItemOp | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | 
try {
    apiInstance.updateCatalogCategoryRelationshipsItems(body, revision, id);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#updateCatalogCategoryRelationshipsItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CatalogCategoryItemOp**](CatalogCategoryItemOp.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCatalogItem"></a>
# **updateCatalogItem**
> PatchCatalogItemResponse updateCatalogItem(body, revision, id)

Update Catalog Item

Update a catalog item with the given item ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
CatalogItemUpdateQuery body = new CatalogItemUpdateQuery(); // CatalogItemUpdateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | The catalog item ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
try {
    PatchCatalogItemResponse result = apiInstance.updateCatalogItem(body, revision, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#updateCatalogItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CatalogItemUpdateQuery**](CatalogItemUpdateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**| The catalog item ID is a compound ID (string), with format: &#x60;{integration}:::{catalog}:::{external_id}&#x60;. Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog is &#x60;$default&#x60;. |

### Return type

[**PatchCatalogItemResponse**](PatchCatalogItemResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCatalogItemRelationshipsCategories"></a>
# **updateCatalogItemRelationshipsCategories**
> updateCatalogItemRelationshipsCategories(body, revision, id)

Update Catalog Item Relationships Categories

Update catalog category relationships for the given item ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
CatalogItemCategoryOp body = new CatalogItemCategoryOp(); // CatalogItemCategoryOp | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | 
try {
    apiInstance.updateCatalogItemRelationshipsCategories(body, revision, id);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#updateCatalogItemRelationshipsCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CatalogItemCategoryOp**](CatalogItemCategoryOp.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCatalogVariant"></a>
# **updateCatalogVariant**
> PatchCatalogVariantResponse updateCatalogVariant(body, revision, id)

Update Catalog Variant

Update a catalog item variant with the given variant ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CatalogsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CatalogsApi apiInstance = new CatalogsApi();
CatalogVariantUpdateQuery body = new CatalogVariantUpdateQuery(); // CatalogVariantUpdateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | The catalog variant ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
try {
    PatchCatalogVariantResponse result = apiInstance.updateCatalogVariant(body, revision, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogsApi#updateCatalogVariant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CatalogVariantUpdateQuery**](CatalogVariantUpdateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**| The catalog variant ID is a compound ID (string), with format: &#x60;{integration}:::{catalog}:::{external_id}&#x60;. Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog is &#x60;$default&#x60;. |

### Return type

[**PatchCatalogVariantResponse**](PatchCatalogVariantResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

