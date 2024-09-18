# ProfilesApi

All URIs are relative to *https://a.klaviyo.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createOrUpdateProfile**](ProfilesApi.md#createOrUpdateProfile) | **POST** /api/profile-import/ | Create or Update Profile |
| [**createProfile**](ProfilesApi.md#createProfile) | **POST** /api/profiles/ | Create Profile |
| [**createPushToken**](ProfilesApi.md#createPushToken) | **POST** /api/push-tokens/ | Create or Update Push Token |
| [**getBulkProfileImportJob**](ProfilesApi.md#getBulkProfileImportJob) | **GET** /api/profile-bulk-import-jobs/{job_id}/ | Get Bulk Profile Import Job |
| [**getBulkProfileImportJobImportErrors**](ProfilesApi.md#getBulkProfileImportJobImportErrors) | **GET** /api/profile-bulk-import-jobs/{id}/import-errors/ | Get Bulk Profile Import Job Errors |
| [**getBulkProfileImportJobLists**](ProfilesApi.md#getBulkProfileImportJobLists) | **GET** /api/profile-bulk-import-jobs/{id}/lists/ | Get Bulk Profile Import Job Lists |
| [**getBulkProfileImportJobProfiles**](ProfilesApi.md#getBulkProfileImportJobProfiles) | **GET** /api/profile-bulk-import-jobs/{id}/profiles/ | Get Bulk Profile Import Job Profiles |
| [**getBulkProfileImportJobRelationshipsLists**](ProfilesApi.md#getBulkProfileImportJobRelationshipsLists) | **GET** /api/profile-bulk-import-jobs/{id}/relationships/lists/ | Get Bulk Profile Import Job Relationships Lists |
| [**getBulkProfileImportJobRelationshipsProfiles**](ProfilesApi.md#getBulkProfileImportJobRelationshipsProfiles) | **GET** /api/profile-bulk-import-jobs/{id}/relationships/profiles/ | Get Bulk Profile Import Job Relationships Profiles |
| [**getBulkProfileImportJobs**](ProfilesApi.md#getBulkProfileImportJobs) | **GET** /api/profile-bulk-import-jobs/ | Get Bulk Profile Import Jobs |
| [**getProfile**](ProfilesApi.md#getProfile) | **GET** /api/profiles/{id}/ | Get Profile |
| [**getProfileLists**](ProfilesApi.md#getProfileLists) | **GET** /api/profiles/{id}/lists/ | Get Profile Lists |
| [**getProfileRelationshipsLists**](ProfilesApi.md#getProfileRelationshipsLists) | **GET** /api/profiles/{id}/relationships/lists/ | Get Profile Relationships Lists |
| [**getProfileRelationshipsSegments**](ProfilesApi.md#getProfileRelationshipsSegments) | **GET** /api/profiles/{id}/relationships/segments/ | Get Profile Relationships Segments |
| [**getProfileSegments**](ProfilesApi.md#getProfileSegments) | **GET** /api/profiles/{id}/segments/ | Get Profile Segments |
| [**getProfiles**](ProfilesApi.md#getProfiles) | **GET** /api/profiles/ | Get Profiles |
| [**mergeProfiles**](ProfilesApi.md#mergeProfiles) | **POST** /api/profile-merge/ | Merge Profiles |
| [**spawnBulkProfileImportJob**](ProfilesApi.md#spawnBulkProfileImportJob) | **POST** /api/profile-bulk-import-jobs/ | Spawn Bulk Profile Import Job |
| [**subscribeProfiles**](ProfilesApi.md#subscribeProfiles) | **POST** /api/profile-subscription-bulk-create-jobs/ | Subscribe Profiles |
| [**suppressProfiles**](ProfilesApi.md#suppressProfiles) | **POST** /api/profile-suppression-bulk-create-jobs/ | Suppress Profiles |
| [**unsubscribeProfiles**](ProfilesApi.md#unsubscribeProfiles) | **POST** /api/profile-subscription-bulk-delete-jobs/ | Unsubscribe Profiles |
| [**unsuppressProfiles**](ProfilesApi.md#unsuppressProfiles) | **POST** /api/profile-suppression-bulk-delete-jobs/ | Unsuppress Profiles |
| [**updateProfile**](ProfilesApi.md#updateProfile) | **PATCH** /api/profiles/{id}/ | Update Profile |


<a id="createOrUpdateProfile"></a>
# **createOrUpdateProfile**
> PostProfileResponse createOrUpdateProfile(revision, profileUpsertQuery)

Create or Update Profile

Given a set of profile attributes and optionally an ID, create or update a profile.  Returns 201 if a new profile was created, 200 if an existing profile was updated.  Note that setting a field to &#x60;null&#x60; will clear out the field, whereas not including a field in your request will leave it unchanged.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;profiles:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val profileUpsertQuery : ProfileUpsertQuery =  // ProfileUpsertQuery | 
try {
    val result : PostProfileResponse = apiInstance.createOrUpdateProfile(revision, profileUpsertQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#createOrUpdateProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#createOrUpdateProfile")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **profileUpsertQuery** | [**ProfileUpsertQuery**](ProfileUpsertQuery.md)|  | |

### Return type

[**PostProfileResponse**](PostProfileResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createProfile"></a>
# **createProfile**
> PostProfileResponse createProfile(revision, profileCreateQuery)

Create Profile

Create a new profile.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;profiles:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val profileCreateQuery : ProfileCreateQuery =  // ProfileCreateQuery | 
try {
    val result : PostProfileResponse = apiInstance.createProfile(revision, profileCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#createProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#createProfile")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **profileCreateQuery** | [**ProfileCreateQuery**](ProfileCreateQuery.md)|  | |

### Return type

[**PostProfileResponse**](PostProfileResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createPushToken"></a>
# **createPushToken**
> createPushToken(revision, pushTokenCreateQuery)

Create or Update Push Token

Create or update a push token.  This endpoint can be used to migrate push tokens from another platform to Klaviyo. Please use our mobile SDKs ([iOS](https://github.com/klaviyo/klaviyo-swift-sdk) and [Android](https://github.com/klaviyo/klaviyo-android-sdk)) to create push tokens from users&#39; devices.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;profiles:write&#x60; &#x60;push-tokens:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val pushTokenCreateQuery : PushTokenCreateQuery =  // PushTokenCreateQuery | 
try {
    apiInstance.createPushToken(revision, pushTokenCreateQuery)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#createPushToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#createPushToken")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pushTokenCreateQuery** | [**PushTokenCreateQuery**](PushTokenCreateQuery.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getBulkProfileImportJob"></a>
# **getBulkProfileImportJob**
> GetProfileImportJobResponseCompoundDocument getBulkProfileImportJob(jobId, revision, fieldsList, fieldsProfileBulkImportJob, include)

Get Bulk Profile Import Job

Get a bulk profile import job with the given job ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;lists:read&#x60; &#x60;profiles:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val jobId : kotlin.String = 01GSQPBF74KQ5YTDEPP41T1BZH // kotlin.String | ID of the job to retrieve.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsList : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsProfileBulkImportJob : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    val result : GetProfileImportJobResponseCompoundDocument = apiInstance.getBulkProfileImportJob(jobId, revision, fieldsList, fieldsProfileBulkImportJob, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#getBulkProfileImportJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#getBulkProfileImportJob")
    e.printStackTrace()
}
```

### Parameters
| **jobId** | **kotlin.String**| ID of the job to retrieve. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsList** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, created, updated, opt_in_process] |
| **fieldsProfileBulkImportJob** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, expires_at, started_at] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: lists] |

### Return type

[**GetProfileImportJobResponseCompoundDocument**](GetProfileImportJobResponseCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBulkProfileImportJobImportErrors"></a>
# **getBulkProfileImportJobImportErrors**
> GetImportErrorResponseCollection getBulkProfileImportJobImportErrors(id, revision, fieldsImportError, pageCursor, pageSize)

Get Bulk Profile Import Job Errors

Get import errors for the bulk profile import job with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;profiles:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsImportError : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val pageSize : kotlin.Int = 56 // kotlin.Int | Default: 20. Min: 1. Max: 100.
try {
    val result : GetImportErrorResponseCollection = apiInstance.getBulkProfileImportJobImportErrors(id, revision, fieldsImportError, pageCursor, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#getBulkProfileImportJobImportErrors")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#getBulkProfileImportJobImportErrors")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsImportError** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: code, title, detail, source, source.pointer, original_payload] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Default: 20. Min: 1. Max: 100. | [optional] [default to 20] |

### Return type

[**GetImportErrorResponseCollection**](GetImportErrorResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBulkProfileImportJobLists"></a>
# **getBulkProfileImportJobLists**
> GetListResponseCollection getBulkProfileImportJobLists(id, revision, fieldsList)

Get Bulk Profile Import Job Lists

Get list for the bulk profile import job with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;lists:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsList : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetListResponseCollection = apiInstance.getBulkProfileImportJobLists(id, revision, fieldsList)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#getBulkProfileImportJobLists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#getBulkProfileImportJobLists")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsList** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, created, updated, opt_in_process] |

### Return type

[**GetListResponseCollection**](GetListResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBulkProfileImportJobProfiles"></a>
# **getBulkProfileImportJobProfiles**
> GetProfileResponseCollection getBulkProfileImportJobProfiles(id, revision, additionalFieldsProfile, fieldsProfile, pageCursor, pageSize)

Get Bulk Profile Import Job Profiles

Get profiles for the bulk profile import job with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;profiles:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val additionalFieldsProfile : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Request additional fields not included by default in the response. Supported values: 'subscriptions', 'predictive_analytics'
val fieldsProfile : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val pageSize : kotlin.Int = 56 // kotlin.Int | Default: 20. Min: 1. Max: 100.
try {
    val result : GetProfileResponseCollection = apiInstance.getBulkProfileImportJobProfiles(id, revision, additionalFieldsProfile, fieldsProfile, pageCursor, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#getBulkProfileImportJobProfiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#getBulkProfileImportJobProfiles")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **additionalFieldsProfile** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Request additional fields not included by default in the response. Supported values: &#39;subscriptions&#39;, &#39;predictive_analytics&#39; | [optional] [enum: subscriptions, predictive_analytics] |
| **fieldsProfile** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: email, phone_number, external_id, first_name, last_name, organization, locale, title, image, created, updated, last_event_date, location, location.address1, location.address2, location.city, location.country, location.latitude, location.longitude, location.region, location.zip, location.timezone, location.ip, properties, subscriptions, subscriptions.email, subscriptions.email.marketing, subscriptions.email.marketing.can_receive_email_marketing, subscriptions.email.marketing.consent, subscriptions.email.marketing.consent_timestamp, subscriptions.email.marketing.last_updated, subscriptions.email.marketing.method, subscriptions.email.marketing.method_detail, subscriptions.email.marketing.custom_method_detail, subscriptions.email.marketing.double_optin, subscriptions.email.marketing.suppression, subscriptions.email.marketing.list_suppressions, subscriptions.sms, subscriptions.sms.marketing, subscriptions.sms.marketing.can_receive_sms_marketing, subscriptions.sms.marketing.consent, subscriptions.sms.marketing.consent_timestamp, subscriptions.sms.marketing.method, subscriptions.sms.marketing.method_detail, subscriptions.sms.marketing.last_updated, subscriptions.mobile_push, subscriptions.mobile_push.marketing, subscriptions.mobile_push.marketing.can_receive_push_marketing, subscriptions.mobile_push.marketing.consent, subscriptions.mobile_push.marketing.consent_timestamp, predictive_analytics, predictive_analytics.historic_clv, predictive_analytics.predicted_clv, predictive_analytics.total_clv, predictive_analytics.historic_number_of_orders, predictive_analytics.predicted_number_of_orders, predictive_analytics.average_days_between_orders, predictive_analytics.average_order_value, predictive_analytics.churn_probability, predictive_analytics.expected_date_of_next_order] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Default: 20. Min: 1. Max: 100. | [optional] [default to 20] |

### Return type

[**GetProfileResponseCollection**](GetProfileResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBulkProfileImportJobRelationshipsLists"></a>
# **getBulkProfileImportJobRelationshipsLists**
> GetProfileImportJobListRelationshipsResponseCollection getBulkProfileImportJobRelationshipsLists(id, revision)

Get Bulk Profile Import Job Relationships Lists

Get list relationship for the bulk profile import job with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;lists:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetProfileImportJobListRelationshipsResponseCollection = apiInstance.getBulkProfileImportJobRelationshipsLists(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#getBulkProfileImportJobRelationshipsLists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#getBulkProfileImportJobRelationshipsLists")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetProfileImportJobListRelationshipsResponseCollection**](GetProfileImportJobListRelationshipsResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBulkProfileImportJobRelationshipsProfiles"></a>
# **getBulkProfileImportJobRelationshipsProfiles**
> GetProfileImportJobProfileRelationshipsResponseCollection getBulkProfileImportJobRelationshipsProfiles(id, revision, pageCursor, pageSize)

Get Bulk Profile Import Job Relationships Profiles

Get profile relationships for the bulk profile import job with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;profiles:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val pageSize : kotlin.Int = 56 // kotlin.Int | Default: 20. Min: 1. Max: 100.
try {
    val result : GetProfileImportJobProfileRelationshipsResponseCollection = apiInstance.getBulkProfileImportJobRelationshipsProfiles(id, revision, pageCursor, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#getBulkProfileImportJobRelationshipsProfiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#getBulkProfileImportJobRelationshipsProfiles")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Default: 20. Min: 1. Max: 100. | [optional] [default to 20] |

### Return type

[**GetProfileImportJobProfileRelationshipsResponseCollection**](GetProfileImportJobProfileRelationshipsResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBulkProfileImportJobs"></a>
# **getBulkProfileImportJobs**
> GetProfileImportJobResponseCollectionCompoundDocument getBulkProfileImportJobs(revision, fieldsProfileBulkImportJob, filter, pageCursor, pageSize, sort)

Get Bulk Profile Import Jobs

Get all bulk profile import jobs.  Returns a maximum of 100 jobs per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;lists:read&#x60; &#x60;profiles:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsProfileBulkImportJob : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `any`, `equals`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val pageSize : kotlin.Int = 56 // kotlin.Int | Default: 20. Min: 1. Max: 100.
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetProfileImportJobResponseCollectionCompoundDocument = apiInstance.getBulkProfileImportJobs(revision, fieldsProfileBulkImportJob, filter, pageCursor, pageSize, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#getBulkProfileImportJobs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#getBulkProfileImportJobs")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsProfileBulkImportJob** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, expires_at, started_at] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;status&#x60;: &#x60;any&#x60;, &#x60;equals&#x60; | [optional] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| **pageSize** | **kotlin.Int**| Default: 20. Min: 1. Max: 100. | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created_at, -created_at] |

### Return type

[**GetProfileImportJobResponseCollectionCompoundDocument**](GetProfileImportJobResponseCollectionCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProfile"></a>
# **getProfile**
> GetProfileResponseCompoundDocument getProfile(id, revision, additionalFieldsProfile, fieldsList, fieldsProfile, fieldsSegment, include)

Get Profile

Get the profile with the given profile ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;profiles:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val additionalFieldsProfile : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Request additional fields not included by default in the response. Supported values: 'subscriptions', 'predictive_analytics'
val fieldsList : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsProfile : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsSegment : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    val result : GetProfileResponseCompoundDocument = apiInstance.getProfile(id, revision, additionalFieldsProfile, fieldsList, fieldsProfile, fieldsSegment, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#getProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#getProfile")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **additionalFieldsProfile** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Request additional fields not included by default in the response. Supported values: &#39;subscriptions&#39;, &#39;predictive_analytics&#39; | [optional] [enum: subscriptions, predictive_analytics] |
| **fieldsList** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, created, updated, opt_in_process] |
| **fieldsProfile** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: email, phone_number, external_id, first_name, last_name, organization, locale, title, image, created, updated, last_event_date, location, location.address1, location.address2, location.city, location.country, location.latitude, location.longitude, location.region, location.zip, location.timezone, location.ip, properties, subscriptions, subscriptions.email, subscriptions.email.marketing, subscriptions.email.marketing.can_receive_email_marketing, subscriptions.email.marketing.consent, subscriptions.email.marketing.consent_timestamp, subscriptions.email.marketing.last_updated, subscriptions.email.marketing.method, subscriptions.email.marketing.method_detail, subscriptions.email.marketing.custom_method_detail, subscriptions.email.marketing.double_optin, subscriptions.email.marketing.suppression, subscriptions.email.marketing.list_suppressions, subscriptions.sms, subscriptions.sms.marketing, subscriptions.sms.marketing.can_receive_sms_marketing, subscriptions.sms.marketing.consent, subscriptions.sms.marketing.consent_timestamp, subscriptions.sms.marketing.method, subscriptions.sms.marketing.method_detail, subscriptions.sms.marketing.last_updated, subscriptions.mobile_push, subscriptions.mobile_push.marketing, subscriptions.mobile_push.marketing.can_receive_push_marketing, subscriptions.mobile_push.marketing.consent, subscriptions.mobile_push.marketing.consent_timestamp, predictive_analytics, predictive_analytics.historic_clv, predictive_analytics.predicted_clv, predictive_analytics.total_clv, predictive_analytics.historic_number_of_orders, predictive_analytics.predicted_number_of_orders, predictive_analytics.average_days_between_orders, predictive_analytics.average_order_value, predictive_analytics.churn_probability, predictive_analytics.expected_date_of_next_order] |
| **fieldsSegment** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, definition, definition.condition_groups, created, updated, is_active, is_processing, is_starred] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: lists, segments] |

### Return type

[**GetProfileResponseCompoundDocument**](GetProfileResponseCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProfileLists"></a>
# **getProfileLists**
> GetListResponseCollection getProfileLists(id, revision, fieldsList)

Get Profile Lists

Get list memberships for a profile with the given profile ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;lists:read&#x60; &#x60;profiles:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsList : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetListResponseCollection = apiInstance.getProfileLists(id, revision, fieldsList)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#getProfileLists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#getProfileLists")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsList** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, created, updated, opt_in_process] |

### Return type

[**GetListResponseCollection**](GetListResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProfileRelationshipsLists"></a>
# **getProfileRelationshipsLists**
> GetProfileListRelationshipsResponseCollection getProfileRelationshipsLists(id, revision)

Get Profile Relationships Lists

Get list memberships for a profile with the given profile ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;lists:read&#x60; &#x60;profiles:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetProfileListRelationshipsResponseCollection = apiInstance.getProfileRelationshipsLists(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#getProfileRelationshipsLists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#getProfileRelationshipsLists")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetProfileListRelationshipsResponseCollection**](GetProfileListRelationshipsResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProfileRelationshipsSegments"></a>
# **getProfileRelationshipsSegments**
> GetProfileSegmentRelationshipsResponseCollection getProfileRelationshipsSegments(id, revision)

Get Profile Relationships Segments

Get segment membership relationships for a profile with the given profile ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;profiles:read&#x60; &#x60;segments:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetProfileSegmentRelationshipsResponseCollection = apiInstance.getProfileRelationshipsSegments(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#getProfileRelationshipsSegments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#getProfileRelationshipsSegments")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetProfileSegmentRelationshipsResponseCollection**](GetProfileSegmentRelationshipsResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProfileSegments"></a>
# **getProfileSegments**
> GetSegmentResponseCollection getProfileSegments(id, revision, fieldsSegment)

Get Profile Segments

Get segment memberships for a profile with the given profile ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;profiles:read&#x60; &#x60;segments:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsSegment : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetSegmentResponseCollection = apiInstance.getProfileSegments(id, revision, fieldsSegment)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#getProfileSegments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#getProfileSegments")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsSegment** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, definition, definition.condition_groups, created, updated, is_active, is_processing, is_starred] |

### Return type

[**GetSegmentResponseCollection**](GetSegmentResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProfiles"></a>
# **getProfiles**
> GetProfileResponseCollectionCompoundDocument getProfiles(revision, additionalFieldsProfile, fieldsProfile, filter, pageCursor, pageSize, sort)

Get Profiles

Get all profiles in an account.  Profiles can be sorted by the following fields in ascending and descending order: &#x60;id&#x60;, &#x60;created&#x60;, &#x60;updated&#x60;, &#x60;email&#x60;, &#x60;subscriptions.email.marketing.suppression.timestamp&#x60;, &#x60;subscriptions.email.marketing.list_suppressions.timestamp&#x60;&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;&lt;br&gt;&lt;br&gt;Rate limits when using the &#x60;additional-fields[profile]&#x3D;predictive_analytics&#x60; parameter in your API request:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;&lt;br&gt;&lt;br&gt;To learn more about how the &#x60;additional-fields&#x60; parameter impacts rate limits, check out our [Rate limits, status codes, and errors](https://developers.klaviyo.com/en/v2024-07-15/docs/rate_limits_and_error_handling) guide.  **Scopes:** &#x60;profiles:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val additionalFieldsProfile : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Request additional fields not included by default in the response. Supported values: 'subscriptions', 'predictive_analytics'
val fieldsProfile : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`id`: `any`, `equals`<br>`email`: `any`, `equals`<br>`phone_number`: `any`, `equals`<br>`external_id`: `any`, `equals`<br>`_kx`: `equals`<br>`created`: `greater-than`, `less-than`<br>`updated`: `greater-than`, `less-than`<br>`subscriptions.email.marketing.suppression.timestamp` : `greater-than`, `greater-or-equal`, `less-than`, `less-or-equal`<br>`subscriptions.email.marketing.suppression.reason` : `equals`<br>`subscriptions.email.marketing.list_suppressions.list_id` : `equals`<br>`subscriptions.email.marketing.list_suppressions.reason` : `equals`<br>`subscriptions.email.marketing.list_suppressions.timestamp` : `greater-than`, `greater-or-equal`, `less-than`, `less-or-equal`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val pageSize : kotlin.Int = 56 // kotlin.Int | Default: 20. Min: 1. Max: 100.
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetProfileResponseCollectionCompoundDocument = apiInstance.getProfiles(revision, additionalFieldsProfile, fieldsProfile, filter, pageCursor, pageSize, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#getProfiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#getProfiles")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **additionalFieldsProfile** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Request additional fields not included by default in the response. Supported values: &#39;subscriptions&#39;, &#39;predictive_analytics&#39; | [optional] [enum: subscriptions, predictive_analytics] |
| **fieldsProfile** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: email, phone_number, external_id, first_name, last_name, organization, locale, title, image, created, updated, last_event_date, location, location.address1, location.address2, location.city, location.country, location.latitude, location.longitude, location.region, location.zip, location.timezone, location.ip, properties, subscriptions, subscriptions.email, subscriptions.email.marketing, subscriptions.email.marketing.can_receive_email_marketing, subscriptions.email.marketing.consent, subscriptions.email.marketing.consent_timestamp, subscriptions.email.marketing.last_updated, subscriptions.email.marketing.method, subscriptions.email.marketing.method_detail, subscriptions.email.marketing.custom_method_detail, subscriptions.email.marketing.double_optin, subscriptions.email.marketing.suppression, subscriptions.email.marketing.list_suppressions, subscriptions.sms, subscriptions.sms.marketing, subscriptions.sms.marketing.can_receive_sms_marketing, subscriptions.sms.marketing.consent, subscriptions.sms.marketing.consent_timestamp, subscriptions.sms.marketing.method, subscriptions.sms.marketing.method_detail, subscriptions.sms.marketing.last_updated, subscriptions.mobile_push, subscriptions.mobile_push.marketing, subscriptions.mobile_push.marketing.can_receive_push_marketing, subscriptions.mobile_push.marketing.consent, subscriptions.mobile_push.marketing.consent_timestamp, predictive_analytics, predictive_analytics.historic_clv, predictive_analytics.predicted_clv, predictive_analytics.total_clv, predictive_analytics.historic_number_of_orders, predictive_analytics.predicted_number_of_orders, predictive_analytics.average_days_between_orders, predictive_analytics.average_order_value, predictive_analytics.churn_probability, predictive_analytics.expected_date_of_next_order] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;id&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;email&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;phone_number&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;external_id&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;_kx&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;created&#x60;: &#x60;greater-than&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;updated&#x60;: &#x60;greater-than&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;subscriptions.email.marketing.suppression.timestamp&#x60; : &#x60;greater-than&#x60;, &#x60;greater-or-equal&#x60;, &#x60;less-than&#x60;, &#x60;less-or-equal&#x60;&lt;br&gt;&#x60;subscriptions.email.marketing.suppression.reason&#x60; : &#x60;equals&#x60;&lt;br&gt;&#x60;subscriptions.email.marketing.list_suppressions.list_id&#x60; : &#x60;equals&#x60;&lt;br&gt;&#x60;subscriptions.email.marketing.list_suppressions.reason&#x60; : &#x60;equals&#x60;&lt;br&gt;&#x60;subscriptions.email.marketing.list_suppressions.timestamp&#x60; : &#x60;greater-than&#x60;, &#x60;greater-or-equal&#x60;, &#x60;less-than&#x60;, &#x60;less-or-equal&#x60; | [optional] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| **pageSize** | **kotlin.Int**| Default: 20. Min: 1. Max: 100. | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created, email, -email, id, -id, updated, -updated, subscriptions.email.marketing.list_suppressions.timestamp, -subscriptions.email.marketing.list_suppressions.timestamp, subscriptions.email.marketing.suppression.timestamp, -subscriptions.email.marketing.suppression.timestamp] |

### Return type

[**GetProfileResponseCollectionCompoundDocument**](GetProfileResponseCollectionCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="mergeProfiles"></a>
# **mergeProfiles**
> PostProfileMergeResponse mergeProfiles(revision, profileMergeQuery)

Merge Profiles

Merge a given related profile into a profile with the given profile ID.  The profile provided under &#x60;relationships&#x60; (the \&quot;source\&quot; profile) will be merged into the profile provided by the ID in the base data object (the \&quot;destination\&quot; profile). This endpoint queues an asynchronous task which will merge data from the source profile into the destination profile, deleting the source profile in the process. This endpoint accepts only one source profile.  To learn more about how profile data is preserved or overwritten during a merge, please [visit our Help Center](https://help.klaviyo.com/hc/en-us/articles/115005073847#merge-2-profiles3).&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;profiles:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val profileMergeQuery : ProfileMergeQuery =  // ProfileMergeQuery | 
try {
    val result : PostProfileMergeResponse = apiInstance.mergeProfiles(revision, profileMergeQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#mergeProfiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#mergeProfiles")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **profileMergeQuery** | [**ProfileMergeQuery**](ProfileMergeQuery.md)|  | |

### Return type

[**PostProfileMergeResponse**](PostProfileMergeResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="spawnBulkProfileImportJob"></a>
# **spawnBulkProfileImportJob**
> PostProfileImportJobResponse spawnBulkProfileImportJob(revision, profileImportJobCreateQuery)

Spawn Bulk Profile Import Job

Create a bulk profile import job to create or update a batch of profiles.  Accepts up to 10,000 profiles per request. The maximum allowed payload size is 5MB.  To learn more, see our [Bulk Profile Import API guide](https://developers.klaviyo.com/en/docs/use_klaviyos_bulk_profile_import_api).&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;lists:write&#x60; &#x60;profiles:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val profileImportJobCreateQuery : ProfileImportJobCreateQuery =  // ProfileImportJobCreateQuery | 
try {
    val result : PostProfileImportJobResponse = apiInstance.spawnBulkProfileImportJob(revision, profileImportJobCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#spawnBulkProfileImportJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#spawnBulkProfileImportJob")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **profileImportJobCreateQuery** | [**ProfileImportJobCreateQuery**](ProfileImportJobCreateQuery.md)|  | |

### Return type

[**PostProfileImportJobResponse**](PostProfileImportJobResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="subscribeProfiles"></a>
# **subscribeProfiles**
> subscribeProfiles(revision, subscriptionCreateJobCreateQuery)

Subscribe Profiles

Subscribe one or more profiles to email marketing, SMS marketing, or both. If the provided list has double opt-in enabled, profiles will receive a message requiring their confirmation before subscribing. Otherwise, profiles will be immediately subscribed without receiving a confirmation message. Learn more about [consent in this guide](https://developers.klaviyo.com/en/docs/collect_email_and_sms_consent_via_api).  If a list is not provided, the opt-in process used will be determined by the [account-level default opt-in setting](https://www.klaviyo.com/settings/account/api-keys).  To add someone to a list without changing their subscription status, use [Add Profile to List](https://developers.klaviyo.com/en/reference/create_list_relationships).  This API will remove any &#x60;UNSUBSCRIBE&#x60;, &#x60;SPAM_REPORT&#x60; or &#x60;USER_SUPPRESSED&#x60; suppressions from the provided profiles. Learn more about [suppressed profiles](https://help.klaviyo.com/hc/en-us/articles/115005246108-Understanding-suppressed-email-profiles#what-is-a-suppressed-profile-1).  Maximum number of profiles can be submitted for subscription: 1000  This endpoint now supports a &#x60;historical_import&#x60; flag. If this flag is set &#x60;true&#x60;, profiles being subscribed will bypass double opt-in emails and be subscribed immediately. They will also bypass any associated \&quot;Added to list\&quot; flows. This is useful for importing historical data where you have already collected consent. If &#x60;historical_import&#x60; is set to true, the &#x60;consented_at&#x60; field is required and must be in the past.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;lists:write&#x60; &#x60;profiles:write&#x60; &#x60;subscriptions:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val subscriptionCreateJobCreateQuery : SubscriptionCreateJobCreateQuery =  // SubscriptionCreateJobCreateQuery | Subscribes one or more profiles to marketing. Currently, supports email and SMS only. All profiles will be added to the provided list. Either email or phone number is required. Both may be specified to subscribe to both channels. If a profile cannot be found matching the given identifier(s), a new profile will be created and then subscribed.
try {
    apiInstance.subscribeProfiles(revision, subscriptionCreateJobCreateQuery)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#subscribeProfiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#subscribeProfiles")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subscriptionCreateJobCreateQuery** | [**SubscriptionCreateJobCreateQuery**](SubscriptionCreateJobCreateQuery.md)| Subscribes one or more profiles to marketing. Currently, supports email and SMS only. All profiles will be added to the provided list. Either email or phone number is required. Both may be specified to subscribe to both channels. If a profile cannot be found matching the given identifier(s), a new profile will be created and then subscribed. | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="suppressProfiles"></a>
# **suppressProfiles**
> suppressProfiles(revision, suppressionCreateJobCreateQuery)

Suppress Profiles

Manually suppress profiles using their email address, or by specifying a segment or list ID to suppress all current members.  Suppressed profiles cannot receive email marketing, independent of their consent status. To learn more, see our [email suppressions guide](https://help.klaviyo.com/hc/en-us/articles/115005246108-Understanding-suppressed-email-profiles#what-is-a-suppressed-profile-1) and our [collecting consent guide](https://developers.klaviyo.com/en/docs/collect_email_and_sms_consent_via_api).  Email addresses per request limit: 100&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;profiles:write&#x60; &#x60;subscriptions:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val suppressionCreateJobCreateQuery : SuppressionCreateJobCreateQuery =  // SuppressionCreateJobCreateQuery | Suppresses one or more profiles from receiving marketing. Currently, supports email only. If a profile is not found with the given email, one will be created and immediately suppressed.
try {
    apiInstance.suppressProfiles(revision, suppressionCreateJobCreateQuery)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#suppressProfiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#suppressProfiles")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **suppressionCreateJobCreateQuery** | [**SuppressionCreateJobCreateQuery**](SuppressionCreateJobCreateQuery.md)| Suppresses one or more profiles from receiving marketing. Currently, supports email only. If a profile is not found with the given email, one will be created and immediately suppressed. | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="unsubscribeProfiles"></a>
# **unsubscribeProfiles**
> unsubscribeProfiles(revision, subscriptionDeleteJobCreateQuery)

Unsubscribe Profiles

Unsubscribe one or more profiles to email marketing, SMS marketing, or both. Learn more about [consent in this guide](https://developers.klaviyo.com/en/docs/collect_email_and_sms_consent_via_api).  To remove someone from a list without changing their subscription status, use [Remove Profile from List](https://developers.klaviyo.com/en/reference/delete_list_relationships).  Maximum number of profile can be submitted for unsubscription: 100&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;lists:write&#x60; &#x60;profiles:write&#x60; &#x60;subscriptions:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val subscriptionDeleteJobCreateQuery : SubscriptionDeleteJobCreateQuery =  // SubscriptionDeleteJobCreateQuery | Unsubscribes one or more profiles from marketing. Currently, supports email and SMS only. All profiles will be removed from the provided list. Either email or phone number is required. If a profile cannot be found matching the given identifier(s), a new profile will be created and then unsubscribed.
try {
    apiInstance.unsubscribeProfiles(revision, subscriptionDeleteJobCreateQuery)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#unsubscribeProfiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#unsubscribeProfiles")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subscriptionDeleteJobCreateQuery** | [**SubscriptionDeleteJobCreateQuery**](SubscriptionDeleteJobCreateQuery.md)| Unsubscribes one or more profiles from marketing. Currently, supports email and SMS only. All profiles will be removed from the provided list. Either email or phone number is required. If a profile cannot be found matching the given identifier(s), a new profile will be created and then unsubscribed. | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="unsuppressProfiles"></a>
# **unsuppressProfiles**
> unsuppressProfiles(revision, suppressionDeleteJobCreateQuery)

Unsuppress Profiles

Manually unsuppress profiles using their email address, or by specifying a segment or list ID to unsuppress all current members.  This only removes suppressions with reason &#x60;USER_SUPPRESSED&#x60;, leaving unsubscribed profiles and profiles suppressed with reason &#x60;INVALID_EMAIL&#x60; or &#x60;HARD_BOUNCE&#x60; unchanged. To learn more, see our [email suppressions guide](https://help.klaviyo.com/hc/en-us/articles/115005246108-Understanding-suppressed-email-profiles#what-is-a-suppressed-profile-1) and our [collecting consent guide](https://developers.klaviyo.com/en/docs/collect_email_and_sms_consent_via_api).  Email addresses per request limit: 100&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;subscriptions:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val suppressionDeleteJobCreateQuery : SuppressionDeleteJobCreateQuery =  // SuppressionDeleteJobCreateQuery | Unsuppresses one or more profiles from receiving marketing. Currently, supports email only. If a profile is not found with the given email, no action will be taken.
try {
    apiInstance.unsuppressProfiles(revision, suppressionDeleteJobCreateQuery)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#unsuppressProfiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#unsuppressProfiles")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **suppressionDeleteJobCreateQuery** | [**SuppressionDeleteJobCreateQuery**](SuppressionDeleteJobCreateQuery.md)| Unsuppresses one or more profiles from receiving marketing. Currently, supports email only. If a profile is not found with the given email, no action will be taken. | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateProfile"></a>
# **updateProfile**
> PatchProfileResponse updateProfile(id, revision, profilePartialUpdateQuery)

Update Profile

Update the profile with the given profile ID.  Note that setting a field to &#x60;null&#x60; will clear out the field, whereas not including a field in your request will leave it unchanged.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;profiles:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProfilesApi()
val id : kotlin.String = 01GDDKASAP8TKDDA2GRZDSVP4H // kotlin.String | Primary key that uniquely identifies this profile. Generated by Klaviyo.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val profilePartialUpdateQuery : ProfilePartialUpdateQuery =  // ProfilePartialUpdateQuery | 
try {
    val result : PatchProfileResponse = apiInstance.updateProfile(id, revision, profilePartialUpdateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfilesApi#updateProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfilesApi#updateProfile")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Primary key that uniquely identifies this profile. Generated by Klaviyo. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **profilePartialUpdateQuery** | [**ProfilePartialUpdateQuery**](ProfilePartialUpdateQuery.md)|  | |

### Return type

[**PatchProfileResponse**](PatchProfileResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

