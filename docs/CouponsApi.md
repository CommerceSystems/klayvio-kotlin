# CouponsApi

All URIs are relative to *https://a.klaviyo.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCoupon**](CouponsApi.md#createCoupon) | **POST** /api/coupons/ | Create Coupon |
| [**createCouponCode**](CouponsApi.md#createCouponCode) | **POST** /api/coupon-codes/ | Create Coupon Code |
| [**deleteCoupon**](CouponsApi.md#deleteCoupon) | **DELETE** /api/coupons/{id}/ | Delete Coupon |
| [**deleteCouponCode**](CouponsApi.md#deleteCouponCode) | **DELETE** /api/coupon-codes/{id}/ | Delete Coupon Code |
| [**getCoupon**](CouponsApi.md#getCoupon) | **GET** /api/coupons/{id}/ | Get Coupon |
| [**getCouponCode**](CouponsApi.md#getCouponCode) | **GET** /api/coupon-codes/{id}/ | Get Coupon Code |
| [**getCouponCodeBulkCreateJob**](CouponsApi.md#getCouponCodeBulkCreateJob) | **GET** /api/coupon-code-bulk-create-jobs/{job_id}/ | Get Coupon Code Bulk Create Job |
| [**getCouponCodeBulkCreateJobs**](CouponsApi.md#getCouponCodeBulkCreateJobs) | **GET** /api/coupon-code-bulk-create-jobs/ | Get Coupon Code Bulk Create Jobs |
| [**getCouponCodeRelationshipsCoupon**](CouponsApi.md#getCouponCodeRelationshipsCoupon) | **GET** /api/coupons/{id}/relationships/coupon-codes/ | Get Coupon Code Relationships Coupon |
| [**getCouponCodes**](CouponsApi.md#getCouponCodes) | **GET** /api/coupon-codes/ | Get Coupon Codes |
| [**getCouponCodesForCoupon**](CouponsApi.md#getCouponCodesForCoupon) | **GET** /api/coupons/{id}/coupon-codes/ | Get Coupon Codes For Coupon |
| [**getCouponForCouponCode**](CouponsApi.md#getCouponForCouponCode) | **GET** /api/coupon-codes/{id}/coupon/ | Get Coupon For Coupon Code |
| [**getCouponRelationshipsCouponCodes**](CouponsApi.md#getCouponRelationshipsCouponCodes) | **GET** /api/coupon-codes/{id}/relationships/coupon/ | Get Coupon Relationships Coupon Codes |
| [**getCoupons**](CouponsApi.md#getCoupons) | **GET** /api/coupons/ | Get Coupons |
| [**spawnCouponCodeBulkCreateJob**](CouponsApi.md#spawnCouponCodeBulkCreateJob) | **POST** /api/coupon-code-bulk-create-jobs/ | Spawn Coupon Code Bulk Create Job |
| [**updateCoupon**](CouponsApi.md#updateCoupon) | **PATCH** /api/coupons/{id}/ | Update Coupon |
| [**updateCouponCode**](CouponsApi.md#updateCouponCode) | **PATCH** /api/coupon-codes/{id}/ | Update Coupon Code |


<a id="createCoupon"></a>
# **createCoupon**
> PostCouponResponse createCoupon(revision, couponCreateQuery)

Create Coupon

Creates a new coupon.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;coupons:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CouponsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val couponCreateQuery : CouponCreateQuery =  // CouponCreateQuery | 
try {
    val result : PostCouponResponse = apiInstance.createCoupon(revision, couponCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CouponsApi#createCoupon")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CouponsApi#createCoupon")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **couponCreateQuery** | [**CouponCreateQuery**](CouponCreateQuery.md)|  | |

### Return type

[**PostCouponResponse**](PostCouponResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createCouponCode"></a>
# **createCouponCode**
> PostCouponCodeResponse createCouponCode(revision, couponCodeCreateQuery)

Create Coupon Code

Synchronously creates a coupon code for the given coupon.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;coupon-codes:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CouponsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val couponCodeCreateQuery : CouponCodeCreateQuery =  // CouponCodeCreateQuery | 
try {
    val result : PostCouponCodeResponse = apiInstance.createCouponCode(revision, couponCodeCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CouponsApi#createCouponCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CouponsApi#createCouponCode")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **couponCodeCreateQuery** | [**CouponCodeCreateQuery**](CouponCodeCreateQuery.md)|  | |

### Return type

[**PostCouponCodeResponse**](PostCouponCodeResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCoupon"></a>
# **deleteCoupon**
> deleteCoupon(id, revision)

Delete Coupon

Delete the coupon with the given coupon ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;coupons:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CouponsApi()
val id : kotlin.String = 10OFF // kotlin.String | The internal id of a Coupon is equivalent to its external id stored within an integration.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.deleteCoupon(id, revision)
} catch (e: ClientException) {
    println("4xx response calling CouponsApi#deleteCoupon")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CouponsApi#deleteCoupon")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The internal id of a Coupon is equivalent to its external id stored within an integration. | |
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

<a id="deleteCouponCode"></a>
# **deleteCouponCode**
> deleteCouponCode(id, revision)

Delete Coupon Code

Deletes a coupon code specified by the given identifier synchronously. If a profile has been assigned to the coupon code, an exception will be raised&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;coupon-codes:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CouponsApi()
val id : kotlin.String = 10OFF-ASD325FHK324UJDOI2M3JNES99 // kotlin.String | The id of a coupon code is a combination of its unique code and the id of the coupon it is associated with.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.deleteCouponCode(id, revision)
} catch (e: ClientException) {
    println("4xx response calling CouponsApi#deleteCouponCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CouponsApi#deleteCouponCode")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The id of a coupon code is a combination of its unique code and the id of the coupon it is associated with. | |
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

<a id="getCoupon"></a>
# **getCoupon**
> GetCouponResponse getCoupon(id, revision, fieldsCoupon)

Get Coupon

Get a specific coupon with the given coupon ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;coupons:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CouponsApi()
val id : kotlin.String = 10OFF // kotlin.String | The internal id of a Coupon is equivalent to its external id stored within an integration.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCoupon : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetCouponResponse = apiInstance.getCoupon(id, revision, fieldsCoupon)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CouponsApi#getCoupon")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CouponsApi#getCoupon")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The internal id of a Coupon is equivalent to its external id stored within an integration. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsCoupon** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, description] |

### Return type

[**GetCouponResponse**](GetCouponResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCouponCode"></a>
# **getCouponCode**
> GetCouponCodeResponseCompoundDocument getCouponCode(id, revision, fieldsCouponCode, fieldsCoupon, include)

Get Coupon Code

Returns a Coupon Code specified by the given identifier.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;coupon-codes:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CouponsApi()
val id : kotlin.String = 10OFF-ASD325FHK324UJDOI2M3JNES99 // kotlin.String | The id of a coupon code is a combination of its unique code and the id of the coupon it is associated with.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCouponCode : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsCoupon : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    val result : GetCouponCodeResponseCompoundDocument = apiInstance.getCouponCode(id, revision, fieldsCouponCode, fieldsCoupon, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CouponsApi#getCouponCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CouponsApi#getCouponCode")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The id of a coupon code is a combination of its unique code and the id of the coupon it is associated with. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCouponCode** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: unique_code, expires_at, status] |
| **fieldsCoupon** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, description] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: coupon] |

### Return type

[**GetCouponCodeResponseCompoundDocument**](GetCouponCodeResponseCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCouponCodeBulkCreateJob"></a>
# **getCouponCodeBulkCreateJob**
> GetCouponCodeCreateJobResponseCompoundDocument getCouponCodeBulkCreateJob(jobId, revision, fieldsCouponCodeBulkCreateJob, fieldsCouponCode, include)

Get Coupon Code Bulk Create Job

Get a coupon code bulk create job with the given job ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;coupon-codes:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CouponsApi()
val jobId : kotlin.String = 01GSQPBF74KQ5YTDEPP41T1BZH // kotlin.String | ID of the job to retrieve.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCouponCodeBulkCreateJob : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsCouponCode : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    val result : GetCouponCodeCreateJobResponseCompoundDocument = apiInstance.getCouponCodeBulkCreateJob(jobId, revision, fieldsCouponCodeBulkCreateJob, fieldsCouponCode, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CouponsApi#getCouponCodeBulkCreateJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CouponsApi#getCouponCodeBulkCreateJob")
    e.printStackTrace()
}
```

### Parameters
| **jobId** | **kotlin.String**| ID of the job to retrieve. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCouponCodeBulkCreateJob** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at] |
| **fieldsCouponCode** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: unique_code, expires_at, status] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: coupon-codes] |

### Return type

[**GetCouponCodeCreateJobResponseCompoundDocument**](GetCouponCodeCreateJobResponseCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCouponCodeBulkCreateJobs"></a>
# **getCouponCodeBulkCreateJobs**
> GetCouponCodeCreateJobResponseCollectionCompoundDocument getCouponCodeBulkCreateJobs(revision, fieldsCouponCodeBulkCreateJob, filter, pageCursor)

Get Coupon Code Bulk Create Jobs

Get all coupon code bulk create jobs.  Returns a maximum of 100 jobs per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;coupon-codes:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CouponsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCouponCodeBulkCreateJob : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    val result : GetCouponCodeCreateJobResponseCollectionCompoundDocument = apiInstance.getCouponCodeBulkCreateJobs(revision, fieldsCouponCodeBulkCreateJob, filter, pageCursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CouponsApi#getCouponCodeBulkCreateJobs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CouponsApi#getCouponCodeBulkCreateJobs")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCouponCodeBulkCreateJob** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, errors, expires_at] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60; | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |

### Return type

[**GetCouponCodeCreateJobResponseCollectionCompoundDocument**](GetCouponCodeCreateJobResponseCollectionCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCouponCodeRelationshipsCoupon"></a>
# **getCouponCodeRelationshipsCoupon**
> GetCouponRelationshipCouponCodesListResponseCollection getCouponCodeRelationshipsCoupon(id, revision, pageCursor)

Get Coupon Code Relationships Coupon

Gets a list of coupon code relationships associated with the given coupon id&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;coupon-codes:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CouponsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    val result : GetCouponRelationshipCouponCodesListResponseCollection = apiInstance.getCouponCodeRelationshipsCoupon(id, revision, pageCursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CouponsApi#getCouponCodeRelationshipsCoupon")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CouponsApi#getCouponCodeRelationshipsCoupon")
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

[**GetCouponRelationshipCouponCodesListResponseCollection**](GetCouponRelationshipCouponCodesListResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCouponCodes"></a>
# **getCouponCodes**
> GetCouponCodeResponseCollectionCompoundDocument getCouponCodes(revision, fieldsCouponCode, fieldsCoupon, filter, include, pageCursor)

Get Coupon Codes

Gets a list of coupon codes associated with a coupon/coupons or a profile/profiles.  A coupon/coupons or a profile/profiles must be provided as required filter params.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;coupon-codes:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CouponsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCouponCode : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsCoupon : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`expires_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`status`: `equals`<br>`coupon.id`: `any`, `equals`<br>`profile.id`: `any`, `equals`
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    val result : GetCouponCodeResponseCollectionCompoundDocument = apiInstance.getCouponCodes(revision, fieldsCouponCode, fieldsCoupon, filter, include, pageCursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CouponsApi#getCouponCodes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CouponsApi#getCouponCodes")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCouponCode** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: unique_code, expires_at, status] |
| **fieldsCoupon** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, description] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;expires_at&#x60;: &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;coupon.id&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;profile.id&#x60;: &#x60;any&#x60;, &#x60;equals&#x60; | [optional] |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: coupon] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |

### Return type

[**GetCouponCodeResponseCollectionCompoundDocument**](GetCouponCodeResponseCollectionCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCouponCodesForCoupon"></a>
# **getCouponCodesForCoupon**
> GetCouponCodeResponseCollection getCouponCodesForCoupon(id, revision, fieldsCouponCode, filter, pageCursor)

Get Coupon Codes For Coupon

Gets a list of coupon codes associated with the given coupon id&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;coupon-codes:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CouponsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCouponCode : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`expires_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`status`: `equals`<br>`coupon.id`: `any`, `equals`<br>`profile.id`: `any`, `equals`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    val result : GetCouponCodeResponseCollection = apiInstance.getCouponCodesForCoupon(id, revision, fieldsCouponCode, filter, pageCursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CouponsApi#getCouponCodesForCoupon")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CouponsApi#getCouponCodesForCoupon")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCouponCode** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: unique_code, expires_at, status] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;expires_at&#x60;: &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;coupon.id&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;profile.id&#x60;: &#x60;any&#x60;, &#x60;equals&#x60; | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |

### Return type

[**GetCouponCodeResponseCollection**](GetCouponCodeResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCouponForCouponCode"></a>
# **getCouponForCouponCode**
> GetCouponResponseCollection getCouponForCouponCode(id, revision, fieldsCoupon)

Get Coupon For Coupon Code

Get the coupon associated with a given coupon code ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;coupons:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CouponsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCoupon : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetCouponResponseCollection = apiInstance.getCouponForCouponCode(id, revision, fieldsCoupon)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CouponsApi#getCouponForCouponCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CouponsApi#getCouponForCouponCode")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsCoupon** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, description] |

### Return type

[**GetCouponResponseCollection**](GetCouponResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCouponRelationshipsCouponCodes"></a>
# **getCouponRelationshipsCouponCodes**
> GetCouponCodeRelationshipCouponResponse getCouponRelationshipsCouponCodes(id, revision)

Get Coupon Relationships Coupon Codes

Gets the coupon relationship associated with the given coupon code id&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;coupons:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CouponsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetCouponCodeRelationshipCouponResponse = apiInstance.getCouponRelationshipsCouponCodes(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CouponsApi#getCouponRelationshipsCouponCodes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CouponsApi#getCouponRelationshipsCouponCodes")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetCouponCodeRelationshipCouponResponse**](GetCouponCodeRelationshipCouponResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCoupons"></a>
# **getCoupons**
> GetCouponResponseCollection getCoupons(revision, fieldsCoupon, pageCursor)

Get Coupons

Get all coupons in an account.  To learn more, see our [Coupons API guide](https://developers.klaviyo.com/en/docs/use_klaviyos_coupons_api).&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;coupons:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CouponsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCoupon : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    val result : GetCouponResponseCollection = apiInstance.getCoupons(revision, fieldsCoupon, pageCursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CouponsApi#getCoupons")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CouponsApi#getCoupons")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCoupon** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: external_id, description] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |

### Return type

[**GetCouponResponseCollection**](GetCouponResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="spawnCouponCodeBulkCreateJob"></a>
# **spawnCouponCodeBulkCreateJob**
> PostCouponCodeCreateJobResponse spawnCouponCodeBulkCreateJob(revision, couponCodeCreateJobCreateQuery)

Spawn Coupon Code Bulk Create Job

Create a coupon-code-bulk-create-job to bulk create a list of coupon codes.  Max number of coupon codes per job we allow for is 1000. Max number of jobs queued at once we allow for is 100.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;coupon-codes:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CouponsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val couponCodeCreateJobCreateQuery : CouponCodeCreateJobCreateQuery =  // CouponCodeCreateJobCreateQuery | 
try {
    val result : PostCouponCodeCreateJobResponse = apiInstance.spawnCouponCodeBulkCreateJob(revision, couponCodeCreateJobCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CouponsApi#spawnCouponCodeBulkCreateJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CouponsApi#spawnCouponCodeBulkCreateJob")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **couponCodeCreateJobCreateQuery** | [**CouponCodeCreateJobCreateQuery**](CouponCodeCreateJobCreateQuery.md)|  | |

### Return type

[**PostCouponCodeCreateJobResponse**](PostCouponCodeCreateJobResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateCoupon"></a>
# **updateCoupon**
> PatchCouponResponse updateCoupon(id, revision, couponUpdateQuery)

Update Coupon

*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;coupons:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CouponsApi()
val id : kotlin.String = 10OFF // kotlin.String | The internal id of a Coupon is equivalent to its external id stored within an integration.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val couponUpdateQuery : CouponUpdateQuery =  // CouponUpdateQuery | 
try {
    val result : PatchCouponResponse = apiInstance.updateCoupon(id, revision, couponUpdateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CouponsApi#updateCoupon")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CouponsApi#updateCoupon")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The internal id of a Coupon is equivalent to its external id stored within an integration. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **couponUpdateQuery** | [**CouponUpdateQuery**](CouponUpdateQuery.md)|  | |

### Return type

[**PatchCouponResponse**](PatchCouponResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateCouponCode"></a>
# **updateCouponCode**
> PatchCouponCodeResponse updateCouponCode(id, revision, couponCodeUpdateQuery)

Update Coupon Code

Updates a coupon code specified by the given identifier synchronously. We allow updating the &#39;status&#39; and &#39;expires_at&#39; of coupon codes.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;coupon-codes:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CouponsApi()
val id : kotlin.String = 10OFF-ASD325FHK324UJDOI2M3JNES99 // kotlin.String | The id of a coupon code is a combination of its unique code and the id of the coupon it is associated with.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val couponCodeUpdateQuery : CouponCodeUpdateQuery =  // CouponCodeUpdateQuery | 
try {
    val result : PatchCouponCodeResponse = apiInstance.updateCouponCode(id, revision, couponCodeUpdateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CouponsApi#updateCouponCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CouponsApi#updateCouponCode")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The id of a coupon code is a combination of its unique code and the id of the coupon it is associated with. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **couponCodeUpdateQuery** | [**CouponCodeUpdateQuery**](CouponCodeUpdateQuery.md)|  | |

### Return type

[**PatchCouponCodeResponse**](PatchCouponCodeResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

