# CouponsApi

All URIs are relative to *https://a.klaviyo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCoupon**](CouponsApi.md#createCoupon) | **POST** /api/coupons/ | Create Coupon
[**createCouponCode**](CouponsApi.md#createCouponCode) | **POST** /api/coupon-codes/ | Create Coupon Code
[**deleteCoupon**](CouponsApi.md#deleteCoupon) | **DELETE** /api/coupons/{id}/ | Delete Coupon
[**deleteCouponCode**](CouponsApi.md#deleteCouponCode) | **DELETE** /api/coupon-codes/{id}/ | Delete Coupon Code
[**getCoupon**](CouponsApi.md#getCoupon) | **GET** /api/coupons/{id}/ | Get Coupon
[**getCouponCode**](CouponsApi.md#getCouponCode) | **GET** /api/coupon-codes/{id}/ | Get Coupon Code
[**getCouponCodeBulkCreateJob**](CouponsApi.md#getCouponCodeBulkCreateJob) | **GET** /api/coupon-code-bulk-create-jobs/{job_id}/ | Get Coupon Code Bulk Create Job
[**getCouponCodeBulkCreateJobs**](CouponsApi.md#getCouponCodeBulkCreateJobs) | **GET** /api/coupon-code-bulk-create-jobs/ | Get Coupon Code Bulk Create Jobs
[**getCouponCodeRelationshipsCoupon**](CouponsApi.md#getCouponCodeRelationshipsCoupon) | **GET** /api/coupons/{id}/relationships/coupon-codes/ | Get Coupon Code Relationships Coupon
[**getCouponCodes**](CouponsApi.md#getCouponCodes) | **GET** /api/coupon-codes/ | Get Coupon Codes
[**getCouponCodesForCoupon**](CouponsApi.md#getCouponCodesForCoupon) | **GET** /api/coupons/{id}/coupon-codes/ | Get Coupon Codes For Coupon
[**getCouponForCouponCode**](CouponsApi.md#getCouponForCouponCode) | **GET** /api/coupon-codes/{id}/coupon/ | Get Coupon For Coupon Code
[**getCouponRelationshipsCouponCodes**](CouponsApi.md#getCouponRelationshipsCouponCodes) | **GET** /api/coupon-codes/{id}/relationships/coupon/ | Get Coupon Relationships Coupon Codes
[**getCoupons**](CouponsApi.md#getCoupons) | **GET** /api/coupons/ | Get Coupons
[**spawnCouponCodeBulkCreateJob**](CouponsApi.md#spawnCouponCodeBulkCreateJob) | **POST** /api/coupon-code-bulk-create-jobs/ | Spawn Coupon Code Bulk Create Job
[**updateCoupon**](CouponsApi.md#updateCoupon) | **PATCH** /api/coupons/{id}/ | Update Coupon
[**updateCouponCode**](CouponsApi.md#updateCouponCode) | **PATCH** /api/coupon-codes/{id}/ | Update Coupon Code

<a name="createCoupon"></a>
# **createCoupon**
> PostCouponResponse createCoupon(body, revision)

Create Coupon

Creates a new coupon.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;coupons:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CouponsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CouponsApi apiInstance = new CouponsApi();
CouponCreateQuery body = new CouponCreateQuery(); // CouponCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostCouponResponse result = apiInstance.createCoupon(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponsApi#createCoupon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CouponCreateQuery**](CouponCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostCouponResponse**](PostCouponResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCouponCode"></a>
# **createCouponCode**
> PostCouponCodeResponse createCouponCode(body, revision)

Create Coupon Code

Synchronously creates a coupon code for the given coupon.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;coupon-codes:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CouponsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CouponsApi apiInstance = new CouponsApi();
CouponCodeCreateQuery body = new CouponCodeCreateQuery(); // CouponCodeCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostCouponCodeResponse result = apiInstance.createCouponCode(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponsApi#createCouponCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CouponCodeCreateQuery**](CouponCodeCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostCouponCodeResponse**](PostCouponCodeResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCoupon"></a>
# **deleteCoupon**
> deleteCoupon(id, revision)

Delete Coupon

Delete the coupon with the given coupon ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;coupons:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CouponsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CouponsApi apiInstance = new CouponsApi();
String id = "id_example"; // String | The internal id of a Coupon is equivalent to its external id stored within an integration.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.deleteCoupon(id, revision);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponsApi#deleteCoupon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The internal id of a Coupon is equivalent to its external id stored within an integration. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCouponCode"></a>
# **deleteCouponCode**
> deleteCouponCode(id, revision)

Delete Coupon Code

Deletes a coupon code specified by the given identifier synchronously. If a profile has been assigned to the coupon code, an exception will be raised&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;coupon-codes:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CouponsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CouponsApi apiInstance = new CouponsApi();
String id = "id_example"; // String | The id of a coupon code is a combination of its unique code and the id of the coupon it is associated with.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.deleteCouponCode(id, revision);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponsApi#deleteCouponCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of a coupon code is a combination of its unique code and the id of the coupon it is associated with. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCoupon"></a>
# **getCoupon**
> GetCouponResponse getCoupon(id, revision, fieldsCoupon)

Get Coupon

Get a specific coupon with the given coupon ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;coupons:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CouponsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CouponsApi apiInstance = new CouponsApi();
String id = "id_example"; // String | The internal id of a Coupon is equivalent to its external id stored within an integration.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCoupon = Arrays.asList("fieldsCoupon_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetCouponResponse result = apiInstance.getCoupon(id, revision, fieldsCoupon);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponsApi#getCoupon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The internal id of a Coupon is equivalent to its external id stored within an integration. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCoupon** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, description]

### Return type

[**GetCouponResponse**](GetCouponResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCouponCode"></a>
# **getCouponCode**
> GetCouponCodeResponseCompoundDocument getCouponCode(id, revision, fieldsCouponCode, fieldsCoupon, include)

Get Coupon Code

Returns a Coupon Code specified by the given identifier.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;coupon-codes:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CouponsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CouponsApi apiInstance = new CouponsApi();
String id = "id_example"; // String | The id of a coupon code is a combination of its unique code and the id of the coupon it is associated with.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCouponCode = Arrays.asList("fieldsCouponCode_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsCoupon = Arrays.asList("fieldsCoupon_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    GetCouponCodeResponseCompoundDocument result = apiInstance.getCouponCode(id, revision, fieldsCouponCode, fieldsCoupon, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponsApi#getCouponCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of a coupon code is a combination of its unique code and the id of the coupon it is associated with. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCouponCode** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: unique_code, expires_at, status]
 **fieldsCoupon** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, description]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: coupon]

### Return type

[**GetCouponCodeResponseCompoundDocument**](GetCouponCodeResponseCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCouponCodeBulkCreateJob"></a>
# **getCouponCodeBulkCreateJob**
> GetCouponCodeCreateJobResponseCompoundDocument getCouponCodeBulkCreateJob(jobId, revision, fieldsCouponCodeBulkCreateJob, fieldsCouponCode, include)

Get Coupon Code Bulk Create Job

Get a coupon code bulk create job with the given job ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;coupon-codes:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CouponsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CouponsApi apiInstance = new CouponsApi();
String jobId = "jobId_example"; // String | ID of the job to retrieve.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCouponCodeBulkCreateJob = Arrays.asList("fieldsCouponCodeBulkCreateJob_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsCouponCode = Arrays.asList("fieldsCouponCode_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    GetCouponCodeCreateJobResponseCompoundDocument result = apiInstance.getCouponCodeBulkCreateJob(jobId, revision, fieldsCouponCodeBulkCreateJob, fieldsCouponCode, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponsApi#getCouponCodeBulkCreateJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| ID of the job to retrieve. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCouponCodeBulkCreateJob** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at]
 **fieldsCouponCode** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: unique_code, expires_at, status]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: coupon-codes]

### Return type

[**GetCouponCodeCreateJobResponseCompoundDocument**](GetCouponCodeCreateJobResponseCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCouponCodeBulkCreateJobs"></a>
# **getCouponCodeBulkCreateJobs**
> GetCouponCodeCreateJobResponseCollectionCompoundDocument getCouponCodeBulkCreateJobs(revision, fieldsCouponCodeBulkCreateJob, filter, pageCursor)

Get Coupon Code Bulk Create Jobs

Get all coupon code bulk create jobs.  Returns a maximum of 100 jobs per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;coupon-codes:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CouponsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CouponsApi apiInstance = new CouponsApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCouponCodeBulkCreateJob = Arrays.asList("fieldsCouponCodeBulkCreateJob_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    GetCouponCodeCreateJobResponseCollectionCompoundDocument result = apiInstance.getCouponCodeBulkCreateJobs(revision, fieldsCouponCodeBulkCreateJob, filter, pageCursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponsApi#getCouponCodeBulkCreateJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCouponCodeBulkCreateJob** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]

### Return type

[**GetCouponCodeCreateJobResponseCollectionCompoundDocument**](GetCouponCodeCreateJobResponseCollectionCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCouponCodeRelationshipsCoupon"></a>
# **getCouponCodeRelationshipsCoupon**
> GetCouponRelationshipCouponCodesListResponseCollection getCouponCodeRelationshipsCoupon(id, revision, pageCursor)

Get Coupon Code Relationships Coupon

Gets a list of coupon code relationships associated with the given coupon id&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;coupon-codes:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CouponsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CouponsApi apiInstance = new CouponsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    GetCouponRelationshipCouponCodesListResponseCollection result = apiInstance.getCouponCodeRelationshipsCoupon(id, revision, pageCursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponsApi#getCouponCodeRelationshipsCoupon");
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

[**GetCouponRelationshipCouponCodesListResponseCollection**](GetCouponRelationshipCouponCodesListResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCouponCodes"></a>
# **getCouponCodes**
> GetCouponCodeResponseCollectionCompoundDocument getCouponCodes(revision, fieldsCouponCode, fieldsCoupon, filter, include, pageCursor)

Get Coupon Codes

Gets a list of coupon codes associated with a coupon/coupons or a profile/profiles.  A coupon/coupons or a profile/profiles must be provided as required filter params.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;coupon-codes:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CouponsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CouponsApi apiInstance = new CouponsApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCouponCode = Arrays.asList("fieldsCouponCode_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsCoupon = Arrays.asList("fieldsCoupon_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`expires_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`status`: `equals`<br>`coupon.id`: `any`, `equals`<br>`profile.id`: `any`, `equals`
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    GetCouponCodeResponseCollectionCompoundDocument result = apiInstance.getCouponCodes(revision, fieldsCouponCode, fieldsCoupon, filter, include, pageCursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponsApi#getCouponCodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCouponCode** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: unique_code, expires_at, status]
 **fieldsCoupon** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, description]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;expires_at&#x60;: &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;coupon.id&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;profile.id&#x60;: &#x60;any&#x60;, &#x60;equals&#x60; | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: coupon]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]

### Return type

[**GetCouponCodeResponseCollectionCompoundDocument**](GetCouponCodeResponseCollectionCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCouponCodesForCoupon"></a>
# **getCouponCodesForCoupon**
> GetCouponCodeResponseCollection getCouponCodesForCoupon(id, revision, fieldsCouponCode, filter, pageCursor)

Get Coupon Codes For Coupon

Gets a list of coupon codes associated with the given coupon id&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;coupon-codes:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CouponsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CouponsApi apiInstance = new CouponsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCouponCode = Arrays.asList("fieldsCouponCode_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`expires_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`status`: `equals`<br>`coupon.id`: `any`, `equals`<br>`profile.id`: `any`, `equals`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    GetCouponCodeResponseCollection result = apiInstance.getCouponCodesForCoupon(id, revision, fieldsCouponCode, filter, pageCursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponsApi#getCouponCodesForCoupon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCouponCode** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: unique_code, expires_at, status]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;expires_at&#x60;: &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;coupon.id&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;profile.id&#x60;: &#x60;any&#x60;, &#x60;equals&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]

### Return type

[**GetCouponCodeResponseCollection**](GetCouponCodeResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCouponForCouponCode"></a>
# **getCouponForCouponCode**
> GetCouponResponseCollection getCouponForCouponCode(id, revision, fieldsCoupon)

Get Coupon For Coupon Code

Get the coupon associated with a given coupon code ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;coupons:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CouponsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CouponsApi apiInstance = new CouponsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCoupon = Arrays.asList("fieldsCoupon_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetCouponResponseCollection result = apiInstance.getCouponForCouponCode(id, revision, fieldsCoupon);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponsApi#getCouponForCouponCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCoupon** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, description]

### Return type

[**GetCouponResponseCollection**](GetCouponResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCouponRelationshipsCouponCodes"></a>
# **getCouponRelationshipsCouponCodes**
> GetCouponCodeRelationshipCouponResponse getCouponRelationshipsCouponCodes(id, revision)

Get Coupon Relationships Coupon Codes

Gets the coupon relationship associated with the given coupon code id&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;coupons:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CouponsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CouponsApi apiInstance = new CouponsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    GetCouponCodeRelationshipCouponResponse result = apiInstance.getCouponRelationshipsCouponCodes(id, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponsApi#getCouponRelationshipsCouponCodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**GetCouponCodeRelationshipCouponResponse**](GetCouponCodeRelationshipCouponResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCoupons"></a>
# **getCoupons**
> GetCouponResponseCollection getCoupons(revision, fieldsCoupon, pageCursor)

Get Coupons

Get all coupons in an account.  To learn more, see our [Coupons API guide](https://developers.klaviyo.com/en/docs/use_klaviyos_coupons_api).&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;coupons:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CouponsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CouponsApi apiInstance = new CouponsApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCoupon = Arrays.asList("fieldsCoupon_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    GetCouponResponseCollection result = apiInstance.getCoupons(revision, fieldsCoupon, pageCursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponsApi#getCoupons");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCoupon** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, description]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]

### Return type

[**GetCouponResponseCollection**](GetCouponResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="spawnCouponCodeBulkCreateJob"></a>
# **spawnCouponCodeBulkCreateJob**
> PostCouponCodeCreateJobResponse spawnCouponCodeBulkCreateJob(body, revision)

Spawn Coupon Code Bulk Create Job

Create a coupon-code-bulk-create-job to bulk create a list of coupon codes.  Max number of coupon codes per job we allow for is 1000. Max number of jobs queued at once we allow for is 100.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;coupon-codes:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CouponsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CouponsApi apiInstance = new CouponsApi();
CouponCodeCreateJobCreateQuery body = new CouponCodeCreateJobCreateQuery(); // CouponCodeCreateJobCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostCouponCodeCreateJobResponse result = apiInstance.spawnCouponCodeBulkCreateJob(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponsApi#spawnCouponCodeBulkCreateJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CouponCodeCreateJobCreateQuery**](CouponCodeCreateJobCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostCouponCodeCreateJobResponse**](PostCouponCodeCreateJobResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCoupon"></a>
# **updateCoupon**
> PatchCouponResponse updateCoupon(body, revision, id)

Update Coupon

*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;coupons:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CouponsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CouponsApi apiInstance = new CouponsApi();
CouponUpdateQuery body = new CouponUpdateQuery(); // CouponUpdateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | The internal id of a Coupon is equivalent to its external id stored within an integration.
try {
    PatchCouponResponse result = apiInstance.updateCoupon(body, revision, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponsApi#updateCoupon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CouponUpdateQuery**](CouponUpdateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**| The internal id of a Coupon is equivalent to its external id stored within an integration. |

### Return type

[**PatchCouponResponse**](PatchCouponResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCouponCode"></a>
# **updateCouponCode**
> PatchCouponCodeResponse updateCouponCode(body, revision, id)

Update Coupon Code

Updates a coupon code specified by the given identifier synchronously. We allow updating the &#x27;status&#x27; and &#x27;expires_at&#x27; of coupon codes.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;coupon-codes:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CouponsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CouponsApi apiInstance = new CouponsApi();
CouponCodeUpdateQuery body = new CouponCodeUpdateQuery(); // CouponCodeUpdateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | The id of a coupon code is a combination of its unique code and the id of the coupon it is associated with.
try {
    PatchCouponCodeResponse result = apiInstance.updateCouponCode(body, revision, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponsApi#updateCouponCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CouponCodeUpdateQuery**](CouponCodeUpdateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**| The id of a coupon code is a combination of its unique code and the id of the coupon it is associated with. |

### Return type

[**PatchCouponCodeResponse**](PatchCouponCodeResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

