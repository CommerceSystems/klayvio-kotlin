# ProfilesApi

All URIs are relative to *https://a.klaviyo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrUpdateProfile**](ProfilesApi.md#createOrUpdateProfile) | **POST** /api/profile-import/ | Create or Update Profile
[**createProfile**](ProfilesApi.md#createProfile) | **POST** /api/profiles/ | Create Profile
[**createPushToken**](ProfilesApi.md#createPushToken) | **POST** /api/push-tokens/ | Create or Update Push Token
[**getBulkProfileImportJob**](ProfilesApi.md#getBulkProfileImportJob) | **GET** /api/profile-bulk-import-jobs/{job_id}/ | Get Bulk Profile Import Job
[**getBulkProfileImportJobImportErrors**](ProfilesApi.md#getBulkProfileImportJobImportErrors) | **GET** /api/profile-bulk-import-jobs/{id}/import-errors/ | Get Bulk Profile Import Job Errors
[**getBulkProfileImportJobLists**](ProfilesApi.md#getBulkProfileImportJobLists) | **GET** /api/profile-bulk-import-jobs/{id}/lists/ | Get Bulk Profile Import Job Lists
[**getBulkProfileImportJobProfiles**](ProfilesApi.md#getBulkProfileImportJobProfiles) | **GET** /api/profile-bulk-import-jobs/{id}/profiles/ | Get Bulk Profile Import Job Profiles
[**getBulkProfileImportJobRelationshipsLists**](ProfilesApi.md#getBulkProfileImportJobRelationshipsLists) | **GET** /api/profile-bulk-import-jobs/{id}/relationships/lists/ | Get Bulk Profile Import Job Relationships Lists
[**getBulkProfileImportJobRelationshipsProfiles**](ProfilesApi.md#getBulkProfileImportJobRelationshipsProfiles) | **GET** /api/profile-bulk-import-jobs/{id}/relationships/profiles/ | Get Bulk Profile Import Job Relationships Profiles
[**getBulkProfileImportJobs**](ProfilesApi.md#getBulkProfileImportJobs) | **GET** /api/profile-bulk-import-jobs/ | Get Bulk Profile Import Jobs
[**getProfile**](ProfilesApi.md#getProfile) | **GET** /api/profiles/{id}/ | Get Profile
[**getProfileLists**](ProfilesApi.md#getProfileLists) | **GET** /api/profiles/{id}/lists/ | Get Profile Lists
[**getProfileRelationshipsLists**](ProfilesApi.md#getProfileRelationshipsLists) | **GET** /api/profiles/{id}/relationships/lists/ | Get Profile Relationships Lists
[**getProfileRelationshipsSegments**](ProfilesApi.md#getProfileRelationshipsSegments) | **GET** /api/profiles/{id}/relationships/segments/ | Get Profile Relationships Segments
[**getProfileSegments**](ProfilesApi.md#getProfileSegments) | **GET** /api/profiles/{id}/segments/ | Get Profile Segments
[**getProfiles**](ProfilesApi.md#getProfiles) | **GET** /api/profiles/ | Get Profiles
[**mergeProfiles**](ProfilesApi.md#mergeProfiles) | **POST** /api/profile-merge/ | Merge Profiles
[**spawnBulkProfileImportJob**](ProfilesApi.md#spawnBulkProfileImportJob) | **POST** /api/profile-bulk-import-jobs/ | Spawn Bulk Profile Import Job
[**subscribeProfiles**](ProfilesApi.md#subscribeProfiles) | **POST** /api/profile-subscription-bulk-create-jobs/ | Subscribe Profiles
[**suppressProfiles**](ProfilesApi.md#suppressProfiles) | **POST** /api/profile-suppression-bulk-create-jobs/ | Suppress Profiles
[**unsubscribeProfiles**](ProfilesApi.md#unsubscribeProfiles) | **POST** /api/profile-subscription-bulk-delete-jobs/ | Unsubscribe Profiles
[**unsuppressProfiles**](ProfilesApi.md#unsuppressProfiles) | **POST** /api/profile-suppression-bulk-delete-jobs/ | Unsuppress Profiles
[**updateProfile**](ProfilesApi.md#updateProfile) | **PATCH** /api/profiles/{id}/ | Update Profile

<a name="createOrUpdateProfile"></a>
# **createOrUpdateProfile**
> PostProfileResponse createOrUpdateProfile(body, revision)

Create or Update Profile

Given a set of profile attributes and optionally an ID, create or update a profile.  Returns 201 if a new profile was created, 200 if an existing profile was updated.  Note that setting a field to &#x60;null&#x60; will clear out the field, whereas not including a field in your request will leave it unchanged.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;profiles:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ProfilesApi apiInstance = new ProfilesApi();
ProfileUpsertQuery body = new ProfileUpsertQuery(); // ProfileUpsertQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostProfileResponse result = apiInstance.createOrUpdateProfile(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#createOrUpdateProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProfileUpsertQuery**](ProfileUpsertQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostProfileResponse**](PostProfileResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProfile"></a>
# **createProfile**
> PostProfileResponse createProfile(body, revision)

Create Profile

Create a new profile.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;profiles:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ProfilesApi apiInstance = new ProfilesApi();
ProfileCreateQuery body = new ProfileCreateQuery(); // ProfileCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostProfileResponse result = apiInstance.createProfile(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#createProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProfileCreateQuery**](ProfileCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostProfileResponse**](PostProfileResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPushToken"></a>
# **createPushToken**
> createPushToken(body, revision)

Create or Update Push Token

Create or update a push token.  This endpoint can be used to migrate push tokens from another platform to Klaviyo. Please use our mobile SDKs ([iOS](https://github.com/klaviyo/klaviyo-swift-sdk) and [Android](https://github.com/klaviyo/klaviyo-android-sdk)) to create push tokens from users&#x27; devices.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;profiles:write&#x60; &#x60;push-tokens:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ProfilesApi apiInstance = new ProfilesApi();
PushTokenCreateQuery body = new PushTokenCreateQuery(); // PushTokenCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.createPushToken(body, revision);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#createPushToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PushTokenCreateQuery**](PushTokenCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBulkProfileImportJob"></a>
# **getBulkProfileImportJob**
> GetProfileImportJobResponseCompoundDocument getBulkProfileImportJob(jobId, revision, fieldsList, fieldsProfileBulkImportJob, include)

Get Bulk Profile Import Job

Get a bulk profile import job with the given job ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;lists:read&#x60; &#x60;profiles:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ProfilesApi apiInstance = new ProfilesApi();
String jobId = "jobId_example"; // String | ID of the job to retrieve.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsList = Arrays.asList("fieldsList_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsProfileBulkImportJob = Arrays.asList("fieldsProfileBulkImportJob_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    GetProfileImportJobResponseCompoundDocument result = apiInstance.getBulkProfileImportJob(jobId, revision, fieldsList, fieldsProfileBulkImportJob, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#getBulkProfileImportJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| ID of the job to retrieve. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsList** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, created, updated, opt_in_process]
 **fieldsProfileBulkImportJob** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, expires_at, started_at]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: lists]

### Return type

[**GetProfileImportJobResponseCompoundDocument**](GetProfileImportJobResponseCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBulkProfileImportJobImportErrors"></a>
# **getBulkProfileImportJobImportErrors**
> GetImportErrorResponseCollection getBulkProfileImportJobImportErrors(id, revision, fieldsImportError, pageCursor, pageSize)

Get Bulk Profile Import Job Errors

Get import errors for the bulk profile import job with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;profiles:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ProfilesApi apiInstance = new ProfilesApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsImportError = Arrays.asList("fieldsImportError_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
Integer pageSize = 20; // Integer | Default: 20. Min: 1. Max: 100.
try {
    GetImportErrorResponseCollection result = apiInstance.getBulkProfileImportJobImportErrors(id, revision, fieldsImportError, pageCursor, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#getBulkProfileImportJobImportErrors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsImportError** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: code, title, detail, source, source.pointer, original_payload]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]
 **pageSize** | **Integer**| Default: 20. Min: 1. Max: 100. | [optional] [default to 20] [enum: 1, 100]

### Return type

[**GetImportErrorResponseCollection**](GetImportErrorResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBulkProfileImportJobLists"></a>
# **getBulkProfileImportJobLists**
> GetListResponseCollection getBulkProfileImportJobLists(id, revision, fieldsList)

Get Bulk Profile Import Job Lists

Get list for the bulk profile import job with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;lists:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ProfilesApi apiInstance = new ProfilesApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsList = Arrays.asList("fieldsList_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetListResponseCollection result = apiInstance.getBulkProfileImportJobLists(id, revision, fieldsList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#getBulkProfileImportJobLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsList** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, created, updated, opt_in_process]

### Return type

[**GetListResponseCollection**](GetListResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBulkProfileImportJobProfiles"></a>
# **getBulkProfileImportJobProfiles**
> GetProfileResponseCollection getBulkProfileImportJobProfiles(id, revision, additionalFieldsProfile, fieldsProfile, pageCursor, pageSize)

Get Bulk Profile Import Job Profiles

Get profiles for the bulk profile import job with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;profiles:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ProfilesApi apiInstance = new ProfilesApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> additionalFieldsProfile = Arrays.asList("additionalFieldsProfile_example"); // List<String> | Request additional fields not included by default in the response. Supported values: 'subscriptions', 'predictive_analytics'
List<String> fieldsProfile = Arrays.asList("fieldsProfile_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
Integer pageSize = 20; // Integer | Default: 20. Min: 1. Max: 100.
try {
    GetProfileResponseCollection result = apiInstance.getBulkProfileImportJobProfiles(id, revision, additionalFieldsProfile, fieldsProfile, pageCursor, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#getBulkProfileImportJobProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **additionalFieldsProfile** | [**List&lt;String&gt;**](String.md)| Request additional fields not included by default in the response. Supported values: &#x27;subscriptions&#x27;, &#x27;predictive_analytics&#x27; | [optional] [enum: subscriptions, predictive_analytics]
 **fieldsProfile** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: email, phone_number, external_id, first_name, last_name, organization, locale, title, image, created, updated, last_event_date, location, location.address1, location.address2, location.city, location.country, location.latitude, location.longitude, location.region, location.zip, location.timezone, location.ip, properties, subscriptions, subscriptions.email, subscriptions.email.marketing, subscriptions.email.marketing.can_receive_email_marketing, subscriptions.email.marketing.consent, subscriptions.email.marketing.consent_timestamp, subscriptions.email.marketing.last_updated, subscriptions.email.marketing.method, subscriptions.email.marketing.method_detail, subscriptions.email.marketing.custom_method_detail, subscriptions.email.marketing.double_optin, subscriptions.email.marketing.suppression, subscriptions.email.marketing.list_suppressions, subscriptions.sms, subscriptions.sms.marketing, subscriptions.sms.marketing.can_receive_sms_marketing, subscriptions.sms.marketing.consent, subscriptions.sms.marketing.consent_timestamp, subscriptions.sms.marketing.method, subscriptions.sms.marketing.method_detail, subscriptions.sms.marketing.last_updated, subscriptions.mobile_push, subscriptions.mobile_push.marketing, subscriptions.mobile_push.marketing.can_receive_push_marketing, subscriptions.mobile_push.marketing.consent, subscriptions.mobile_push.marketing.consent_timestamp, predictive_analytics, predictive_analytics.historic_clv, predictive_analytics.predicted_clv, predictive_analytics.total_clv, predictive_analytics.historic_number_of_orders, predictive_analytics.predicted_number_of_orders, predictive_analytics.average_days_between_orders, predictive_analytics.average_order_value, predictive_analytics.churn_probability, predictive_analytics.expected_date_of_next_order]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]
 **pageSize** | **Integer**| Default: 20. Min: 1. Max: 100. | [optional] [default to 20] [enum: 1, 100]

### Return type

[**GetProfileResponseCollection**](GetProfileResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBulkProfileImportJobRelationshipsLists"></a>
# **getBulkProfileImportJobRelationshipsLists**
> GetProfileImportJobListRelationshipsResponseCollection getBulkProfileImportJobRelationshipsLists(id, revision)

Get Bulk Profile Import Job Relationships Lists

Get list relationship for the bulk profile import job with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;lists:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ProfilesApi apiInstance = new ProfilesApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    GetProfileImportJobListRelationshipsResponseCollection result = apiInstance.getBulkProfileImportJobRelationshipsLists(id, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#getBulkProfileImportJobRelationshipsLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**GetProfileImportJobListRelationshipsResponseCollection**](GetProfileImportJobListRelationshipsResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBulkProfileImportJobRelationshipsProfiles"></a>
# **getBulkProfileImportJobRelationshipsProfiles**
> GetProfileImportJobProfileRelationshipsResponseCollection getBulkProfileImportJobRelationshipsProfiles(id, revision, pageCursor, pageSize)

Get Bulk Profile Import Job Relationships Profiles

Get profile relationships for the bulk profile import job with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;profiles:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ProfilesApi apiInstance = new ProfilesApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
Integer pageSize = 20; // Integer | Default: 20. Min: 1. Max: 100.
try {
    GetProfileImportJobProfileRelationshipsResponseCollection result = apiInstance.getBulkProfileImportJobRelationshipsProfiles(id, revision, pageCursor, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#getBulkProfileImportJobRelationshipsProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]
 **pageSize** | **Integer**| Default: 20. Min: 1. Max: 100. | [optional] [default to 20] [enum: 1, 100]

### Return type

[**GetProfileImportJobProfileRelationshipsResponseCollection**](GetProfileImportJobProfileRelationshipsResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBulkProfileImportJobs"></a>
# **getBulkProfileImportJobs**
> GetProfileImportJobResponseCollectionCompoundDocument getBulkProfileImportJobs(revision, fieldsProfileBulkImportJob, filter, pageCursor, pageSize, sort)

Get Bulk Profile Import Jobs

Get all bulk profile import jobs.  Returns a maximum of 100 jobs per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;lists:read&#x60; &#x60;profiles:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ProfilesApi apiInstance = new ProfilesApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsProfileBulkImportJob = Arrays.asList("fieldsProfileBulkImportJob_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `any`, `equals`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
Integer pageSize = 20; // Integer | Default: 20. Min: 1. Max: 100.
String sort = "sort_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    GetProfileImportJobResponseCollectionCompoundDocument result = apiInstance.getBulkProfileImportJobs(revision, fieldsProfileBulkImportJob, filter, pageCursor, pageSize, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#getBulkProfileImportJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsProfileBulkImportJob** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status, created_at, total_count, completed_count, failed_count, completed_at, expires_at, started_at]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;status&#x60;: &#x60;any&#x60;, &#x60;equals&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]
 **pageSize** | **Integer**| Default: 20. Min: 1. Max: 100. | [optional] [default to 20] [enum: 1, 100]
 **sort** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created_at, -created_at]

### Return type

[**GetProfileImportJobResponseCollectionCompoundDocument**](GetProfileImportJobResponseCollectionCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProfile"></a>
# **getProfile**
> GetProfileResponseCompoundDocument getProfile(id, revision, additionalFieldsProfile, fieldsList, fieldsProfile, fieldsSegment, include)

Get Profile

Get the profile with the given profile ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;profiles:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ProfilesApi apiInstance = new ProfilesApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> additionalFieldsProfile = Arrays.asList("additionalFieldsProfile_example"); // List<String> | Request additional fields not included by default in the response. Supported values: 'subscriptions', 'predictive_analytics'
List<String> fieldsList = Arrays.asList("fieldsList_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsProfile = Arrays.asList("fieldsProfile_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsSegment = Arrays.asList("fieldsSegment_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    GetProfileResponseCompoundDocument result = apiInstance.getProfile(id, revision, additionalFieldsProfile, fieldsList, fieldsProfile, fieldsSegment, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#getProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **additionalFieldsProfile** | [**List&lt;String&gt;**](String.md)| Request additional fields not included by default in the response. Supported values: &#x27;subscriptions&#x27;, &#x27;predictive_analytics&#x27; | [optional] [enum: subscriptions, predictive_analytics]
 **fieldsList** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, created, updated, opt_in_process]
 **fieldsProfile** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: email, phone_number, external_id, first_name, last_name, organization, locale, title, image, created, updated, last_event_date, location, location.address1, location.address2, location.city, location.country, location.latitude, location.longitude, location.region, location.zip, location.timezone, location.ip, properties, subscriptions, subscriptions.email, subscriptions.email.marketing, subscriptions.email.marketing.can_receive_email_marketing, subscriptions.email.marketing.consent, subscriptions.email.marketing.consent_timestamp, subscriptions.email.marketing.last_updated, subscriptions.email.marketing.method, subscriptions.email.marketing.method_detail, subscriptions.email.marketing.custom_method_detail, subscriptions.email.marketing.double_optin, subscriptions.email.marketing.suppression, subscriptions.email.marketing.list_suppressions, subscriptions.sms, subscriptions.sms.marketing, subscriptions.sms.marketing.can_receive_sms_marketing, subscriptions.sms.marketing.consent, subscriptions.sms.marketing.consent_timestamp, subscriptions.sms.marketing.method, subscriptions.sms.marketing.method_detail, subscriptions.sms.marketing.last_updated, subscriptions.mobile_push, subscriptions.mobile_push.marketing, subscriptions.mobile_push.marketing.can_receive_push_marketing, subscriptions.mobile_push.marketing.consent, subscriptions.mobile_push.marketing.consent_timestamp, predictive_analytics, predictive_analytics.historic_clv, predictive_analytics.predicted_clv, predictive_analytics.total_clv, predictive_analytics.historic_number_of_orders, predictive_analytics.predicted_number_of_orders, predictive_analytics.average_days_between_orders, predictive_analytics.average_order_value, predictive_analytics.churn_probability, predictive_analytics.expected_date_of_next_order]
 **fieldsSegment** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, definition, definition.condition_groups, created, updated, is_active, is_processing, is_starred]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: lists, segments]

### Return type

[**GetProfileResponseCompoundDocument**](GetProfileResponseCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProfileLists"></a>
# **getProfileLists**
> GetListResponseCollection getProfileLists(id, revision, fieldsList)

Get Profile Lists

Get list memberships for a profile with the given profile ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;lists:read&#x60; &#x60;profiles:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ProfilesApi apiInstance = new ProfilesApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsList = Arrays.asList("fieldsList_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetListResponseCollection result = apiInstance.getProfileLists(id, revision, fieldsList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#getProfileLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsList** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, created, updated, opt_in_process]

### Return type

[**GetListResponseCollection**](GetListResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProfileRelationshipsLists"></a>
# **getProfileRelationshipsLists**
> GetProfileListRelationshipsResponseCollection getProfileRelationshipsLists(id, revision)

Get Profile Relationships Lists

Get list memberships for a profile with the given profile ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;lists:read&#x60; &#x60;profiles:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ProfilesApi apiInstance = new ProfilesApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    GetProfileListRelationshipsResponseCollection result = apiInstance.getProfileRelationshipsLists(id, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#getProfileRelationshipsLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**GetProfileListRelationshipsResponseCollection**](GetProfileListRelationshipsResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProfileRelationshipsSegments"></a>
# **getProfileRelationshipsSegments**
> GetProfileSegmentRelationshipsResponseCollection getProfileRelationshipsSegments(id, revision)

Get Profile Relationships Segments

Get segment membership relationships for a profile with the given profile ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;profiles:read&#x60; &#x60;segments:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ProfilesApi apiInstance = new ProfilesApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    GetProfileSegmentRelationshipsResponseCollection result = apiInstance.getProfileRelationshipsSegments(id, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#getProfileRelationshipsSegments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**GetProfileSegmentRelationshipsResponseCollection**](GetProfileSegmentRelationshipsResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProfileSegments"></a>
# **getProfileSegments**
> GetSegmentResponseCollection getProfileSegments(id, revision, fieldsSegment)

Get Profile Segments

Get segment memberships for a profile with the given profile ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;profiles:read&#x60; &#x60;segments:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ProfilesApi apiInstance = new ProfilesApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsSegment = Arrays.asList("fieldsSegment_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetSegmentResponseCollection result = apiInstance.getProfileSegments(id, revision, fieldsSegment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#getProfileSegments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsSegment** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, definition, definition.condition_groups, created, updated, is_active, is_processing, is_starred]

### Return type

[**GetSegmentResponseCollection**](GetSegmentResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProfiles"></a>
# **getProfiles**
> GetProfileResponseCollectionCompoundDocument getProfiles(revision, additionalFieldsProfile, fieldsProfile, filter, pageCursor, pageSize, sort)

Get Profiles

Get all profiles in an account.  Profiles can be sorted by the following fields in ascending and descending order: &#x60;id&#x60;, &#x60;created&#x60;, &#x60;updated&#x60;, &#x60;email&#x60;, &#x60;subscriptions.email.marketing.suppression.timestamp&#x60;, &#x60;subscriptions.email.marketing.list_suppressions.timestamp&#x60;&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;&lt;br&gt;&lt;br&gt;Rate limits when using the &#x60;additional-fields[profile]&#x3D;predictive_analytics&#x60; parameter in your API request:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;&lt;br&gt;&lt;br&gt;To learn more about how the &#x60;additional-fields&#x60; parameter impacts rate limits, check out our [Rate limits, status codes, and errors](https://developers.klaviyo.com/en/v2024-07-15/docs/rate_limits_and_error_handling) guide.  **Scopes:** &#x60;profiles:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ProfilesApi apiInstance = new ProfilesApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> additionalFieldsProfile = Arrays.asList("additionalFieldsProfile_example"); // List<String> | Request additional fields not included by default in the response. Supported values: 'subscriptions', 'predictive_analytics'
List<String> fieldsProfile = Arrays.asList("fieldsProfile_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`id`: `any`, `equals`<br>`email`: `any`, `equals`<br>`phone_number`: `any`, `equals`<br>`external_id`: `any`, `equals`<br>`_kx`: `equals`<br>`created`: `greater-than`, `less-than`<br>`updated`: `greater-than`, `less-than`<br>`subscriptions.email.marketing.suppression.timestamp` : `greater-than`, `greater-or-equal`, `less-than`, `less-or-equal`<br>`subscriptions.email.marketing.suppression.reason` : `equals`<br>`subscriptions.email.marketing.list_suppressions.list_id` : `equals`<br>`subscriptions.email.marketing.list_suppressions.reason` : `equals`<br>`subscriptions.email.marketing.list_suppressions.timestamp` : `greater-than`, `greater-or-equal`, `less-than`, `less-or-equal`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
Integer pageSize = 20; // Integer | Default: 20. Min: 1. Max: 100.
String sort = "sort_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    GetProfileResponseCollectionCompoundDocument result = apiInstance.getProfiles(revision, additionalFieldsProfile, fieldsProfile, filter, pageCursor, pageSize, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#getProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **additionalFieldsProfile** | [**List&lt;String&gt;**](String.md)| Request additional fields not included by default in the response. Supported values: &#x27;subscriptions&#x27;, &#x27;predictive_analytics&#x27; | [optional] [enum: subscriptions, predictive_analytics]
 **fieldsProfile** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: email, phone_number, external_id, first_name, last_name, organization, locale, title, image, created, updated, last_event_date, location, location.address1, location.address2, location.city, location.country, location.latitude, location.longitude, location.region, location.zip, location.timezone, location.ip, properties, subscriptions, subscriptions.email, subscriptions.email.marketing, subscriptions.email.marketing.can_receive_email_marketing, subscriptions.email.marketing.consent, subscriptions.email.marketing.consent_timestamp, subscriptions.email.marketing.last_updated, subscriptions.email.marketing.method, subscriptions.email.marketing.method_detail, subscriptions.email.marketing.custom_method_detail, subscriptions.email.marketing.double_optin, subscriptions.email.marketing.suppression, subscriptions.email.marketing.list_suppressions, subscriptions.sms, subscriptions.sms.marketing, subscriptions.sms.marketing.can_receive_sms_marketing, subscriptions.sms.marketing.consent, subscriptions.sms.marketing.consent_timestamp, subscriptions.sms.marketing.method, subscriptions.sms.marketing.method_detail, subscriptions.sms.marketing.last_updated, subscriptions.mobile_push, subscriptions.mobile_push.marketing, subscriptions.mobile_push.marketing.can_receive_push_marketing, subscriptions.mobile_push.marketing.consent, subscriptions.mobile_push.marketing.consent_timestamp, predictive_analytics, predictive_analytics.historic_clv, predictive_analytics.predicted_clv, predictive_analytics.total_clv, predictive_analytics.historic_number_of_orders, predictive_analytics.predicted_number_of_orders, predictive_analytics.average_days_between_orders, predictive_analytics.average_order_value, predictive_analytics.churn_probability, predictive_analytics.expected_date_of_next_order]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;id&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;email&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;phone_number&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;external_id&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;_kx&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;created&#x60;: &#x60;greater-than&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;updated&#x60;: &#x60;greater-than&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;subscriptions.email.marketing.suppression.timestamp&#x60; : &#x60;greater-than&#x60;, &#x60;greater-or-equal&#x60;, &#x60;less-than&#x60;, &#x60;less-or-equal&#x60;&lt;br&gt;&#x60;subscriptions.email.marketing.suppression.reason&#x60; : &#x60;equals&#x60;&lt;br&gt;&#x60;subscriptions.email.marketing.list_suppressions.list_id&#x60; : &#x60;equals&#x60;&lt;br&gt;&#x60;subscriptions.email.marketing.list_suppressions.reason&#x60; : &#x60;equals&#x60;&lt;br&gt;&#x60;subscriptions.email.marketing.list_suppressions.timestamp&#x60; : &#x60;greater-than&#x60;, &#x60;greater-or-equal&#x60;, &#x60;less-than&#x60;, &#x60;less-or-equal&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]
 **pageSize** | **Integer**| Default: 20. Min: 1. Max: 100. | [optional] [default to 20] [enum: 1, 100]
 **sort** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created, email, -email, id, -id, updated, -updated, subscriptions.email.marketing.list_suppressions.timestamp, -subscriptions.email.marketing.list_suppressions.timestamp, subscriptions.email.marketing.suppression.timestamp, -subscriptions.email.marketing.suppression.timestamp]

### Return type

[**GetProfileResponseCollectionCompoundDocument**](GetProfileResponseCollectionCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="mergeProfiles"></a>
# **mergeProfiles**
> PostProfileMergeResponse mergeProfiles(body, revision)

Merge Profiles

Merge a given related profile into a profile with the given profile ID.  The profile provided under &#x60;relationships&#x60; (the \&quot;source\&quot; profile) will be merged into the profile provided by the ID in the base data object (the \&quot;destination\&quot; profile). This endpoint queues an asynchronous task which will merge data from the source profile into the destination profile, deleting the source profile in the process. This endpoint accepts only one source profile.  To learn more about how profile data is preserved or overwritten during a merge, please [visit our Help Center](https://help.klaviyo.com/hc/en-us/articles/115005073847#merge-2-profiles3).&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;profiles:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ProfilesApi apiInstance = new ProfilesApi();
ProfileMergeQuery body = new ProfileMergeQuery(); // ProfileMergeQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostProfileMergeResponse result = apiInstance.mergeProfiles(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#mergeProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProfileMergeQuery**](ProfileMergeQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostProfileMergeResponse**](PostProfileMergeResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="spawnBulkProfileImportJob"></a>
# **spawnBulkProfileImportJob**
> PostProfileImportJobResponse spawnBulkProfileImportJob(body, revision)

Spawn Bulk Profile Import Job

Create a bulk profile import job to create or update a batch of profiles.  Accepts up to 10,000 profiles per request. The maximum allowed payload size is 5MB.  To learn more, see our [Bulk Profile Import API guide](https://developers.klaviyo.com/en/docs/use_klaviyos_bulk_profile_import_api).&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;lists:write&#x60; &#x60;profiles:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ProfilesApi apiInstance = new ProfilesApi();
ProfileImportJobCreateQuery body = new ProfileImportJobCreateQuery(); // ProfileImportJobCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostProfileImportJobResponse result = apiInstance.spawnBulkProfileImportJob(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#spawnBulkProfileImportJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProfileImportJobCreateQuery**](ProfileImportJobCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostProfileImportJobResponse**](PostProfileImportJobResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subscribeProfiles"></a>
# **subscribeProfiles**
> subscribeProfiles(body, revision)

Subscribe Profiles

Subscribe one or more profiles to email marketing, SMS marketing, or both. If the provided list has double opt-in enabled, profiles will receive a message requiring their confirmation before subscribing. Otherwise, profiles will be immediately subscribed without receiving a confirmation message. Learn more about [consent in this guide](https://developers.klaviyo.com/en/docs/collect_email_and_sms_consent_via_api).  If a list is not provided, the opt-in process used will be determined by the [account-level default opt-in setting](https://www.klaviyo.com/settings/account/api-keys).  To add someone to a list without changing their subscription status, use [Add Profile to List](https://developers.klaviyo.com/en/reference/create_list_relationships).  This API will remove any &#x60;UNSUBSCRIBE&#x60;, &#x60;SPAM_REPORT&#x60; or &#x60;USER_SUPPRESSED&#x60; suppressions from the provided profiles. Learn more about [suppressed profiles](https://help.klaviyo.com/hc/en-us/articles/115005246108-Understanding-suppressed-email-profiles#what-is-a-suppressed-profile-1).  Maximum number of profiles can be submitted for subscription: 1000  This endpoint now supports a &#x60;historical_import&#x60; flag. If this flag is set &#x60;true&#x60;, profiles being subscribed will bypass double opt-in emails and be subscribed immediately. They will also bypass any associated \&quot;Added to list\&quot; flows. This is useful for importing historical data where you have already collected consent. If &#x60;historical_import&#x60; is set to true, the &#x60;consented_at&#x60; field is required and must be in the past.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;lists:write&#x60; &#x60;profiles:write&#x60; &#x60;subscriptions:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ProfilesApi apiInstance = new ProfilesApi();
SubscriptionCreateJobCreateQuery body = new SubscriptionCreateJobCreateQuery(); // SubscriptionCreateJobCreateQuery | Subscribes one or more profiles to marketing. Currently, supports email and SMS only. All profiles will be added to the provided list. Either email or phone number is required. Both may be specified to subscribe to both channels.
If a profile cannot be found matching the given identifier(s), a new profile will be created and then subscribed.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.subscribeProfiles(body, revision);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#subscribeProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubscriptionCreateJobCreateQuery**](SubscriptionCreateJobCreateQuery.md)| Subscribes one or more profiles to marketing. Currently, supports email and SMS only. All profiles will be added to the provided list. Either email or phone number is required. Both may be specified to subscribe to both channels.
If a profile cannot be found matching the given identifier(s), a new profile will be created and then subscribed. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="suppressProfiles"></a>
# **suppressProfiles**
> suppressProfiles(body, revision)

Suppress Profiles

Manually suppress profiles using their email address, or by specifying a segment or list ID to suppress all current members.  Suppressed profiles cannot receive email marketing, independent of their consent status. To learn more, see our [email suppressions guide](https://help.klaviyo.com/hc/en-us/articles/115005246108-Understanding-suppressed-email-profiles#what-is-a-suppressed-profile-1) and our [collecting consent guide](https://developers.klaviyo.com/en/docs/collect_email_and_sms_consent_via_api).  Email addresses per request limit: 100&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;profiles:write&#x60; &#x60;subscriptions:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ProfilesApi apiInstance = new ProfilesApi();
SuppressionCreateJobCreateQuery body = new SuppressionCreateJobCreateQuery(); // SuppressionCreateJobCreateQuery | Suppresses one or more profiles from receiving marketing. Currently, supports email only. If a profile is not found with the given email, one will be created and immediately suppressed.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.suppressProfiles(body, revision);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#suppressProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SuppressionCreateJobCreateQuery**](SuppressionCreateJobCreateQuery.md)| Suppresses one or more profiles from receiving marketing. Currently, supports email only. If a profile is not found with the given email, one will be created and immediately suppressed. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unsubscribeProfiles"></a>
# **unsubscribeProfiles**
> unsubscribeProfiles(body, revision)

Unsubscribe Profiles

Unsubscribe one or more profiles to email marketing, SMS marketing, or both. Learn more about [consent in this guide](https://developers.klaviyo.com/en/docs/collect_email_and_sms_consent_via_api).  To remove someone from a list without changing their subscription status, use [Remove Profile from List](https://developers.klaviyo.com/en/reference/delete_list_relationships).  Maximum number of profile can be submitted for unsubscription: 100&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;lists:write&#x60; &#x60;profiles:write&#x60; &#x60;subscriptions:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ProfilesApi apiInstance = new ProfilesApi();
SubscriptionDeleteJobCreateQuery body = new SubscriptionDeleteJobCreateQuery(); // SubscriptionDeleteJobCreateQuery | Unsubscribes one or more profiles from marketing. Currently, supports email and SMS only. All profiles will be removed from the provided list.
Either email or phone number is required. If a profile cannot be found matching the given identifier(s), a new profile will be created and then unsubscribed.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.unsubscribeProfiles(body, revision);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#unsubscribeProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubscriptionDeleteJobCreateQuery**](SubscriptionDeleteJobCreateQuery.md)| Unsubscribes one or more profiles from marketing. Currently, supports email and SMS only. All profiles will be removed from the provided list.
Either email or phone number is required. If a profile cannot be found matching the given identifier(s), a new profile will be created and then unsubscribed. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unsuppressProfiles"></a>
# **unsuppressProfiles**
> unsuppressProfiles(body, revision)

Unsuppress Profiles

Manually unsuppress profiles using their email address, or by specifying a segment or list ID to unsuppress all current members.  This only removes suppressions with reason &#x60;USER_SUPPRESSED&#x60;, leaving unsubscribed profiles and profiles suppressed with reason &#x60;INVALID_EMAIL&#x60; or &#x60;HARD_BOUNCE&#x60; unchanged. To learn more, see our [email suppressions guide](https://help.klaviyo.com/hc/en-us/articles/115005246108-Understanding-suppressed-email-profiles#what-is-a-suppressed-profile-1) and our [collecting consent guide](https://developers.klaviyo.com/en/docs/collect_email_and_sms_consent_via_api).  Email addresses per request limit: 100&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;subscriptions:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ProfilesApi apiInstance = new ProfilesApi();
SuppressionDeleteJobCreateQuery body = new SuppressionDeleteJobCreateQuery(); // SuppressionDeleteJobCreateQuery | Unsuppresses one or more profiles from receiving marketing. Currently, supports email only. If a profile is not
found with the given email, no action will be taken.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.unsuppressProfiles(body, revision);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#unsuppressProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SuppressionDeleteJobCreateQuery**](SuppressionDeleteJobCreateQuery.md)| Unsuppresses one or more profiles from receiving marketing. Currently, supports email only. If a profile is not
found with the given email, no action will be taken. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProfile"></a>
# **updateProfile**
> PatchProfileResponse updateProfile(body, revision, id)

Update Profile

Update the profile with the given profile ID.  Note that setting a field to &#x60;null&#x60; will clear out the field, whereas not including a field in your request will leave it unchanged.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;profiles:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ProfilesApi apiInstance = new ProfilesApi();
ProfilePartialUpdateQuery body = new ProfilePartialUpdateQuery(); // ProfilePartialUpdateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | Primary key that uniquely identifies this profile. Generated by Klaviyo.
try {
    PatchProfileResponse result = apiInstance.updateProfile(body, revision, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#updateProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProfilePartialUpdateQuery**](ProfilePartialUpdateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**| Primary key that uniquely identifies this profile. Generated by Klaviyo. |

### Return type

[**PatchProfileResponse**](PatchProfileResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

