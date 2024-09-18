# SegmentsApi

All URIs are relative to *https://a.klaviyo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSegment**](SegmentsApi.md#createSegment) | **POST** /api/segments/ | Create Segment
[**deleteSegment**](SegmentsApi.md#deleteSegment) | **DELETE** /api/segments/{id}/ | Delete Segment
[**getSegment**](SegmentsApi.md#getSegment) | **GET** /api/segments/{id}/ | Get Segment
[**getSegmentProfiles**](SegmentsApi.md#getSegmentProfiles) | **GET** /api/segments/{id}/profiles/ | Get Segment Profiles
[**getSegmentRelationshipsProfiles**](SegmentsApi.md#getSegmentRelationshipsProfiles) | **GET** /api/segments/{id}/relationships/profiles/ | Get Segment Relationships Profiles
[**getSegmentRelationshipsTags**](SegmentsApi.md#getSegmentRelationshipsTags) | **GET** /api/segments/{id}/relationships/tags/ | Get Segment Relationships Tags
[**getSegmentTags**](SegmentsApi.md#getSegmentTags) | **GET** /api/segments/{id}/tags/ | Get Segment Tags
[**getSegments**](SegmentsApi.md#getSegments) | **GET** /api/segments/ | Get Segments
[**updateSegment**](SegmentsApi.md#updateSegment) | **PATCH** /api/segments/{id}/ | Update Segment

<a name="createSegment"></a>
# **createSegment**
> PostSegmentCreateResponse createSegment(body, revision)

Create Segment

Create a segment.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;&lt;br&gt;Daily: &#x60;100/d&#x60;  **Scopes:** &#x60;segments:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SegmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

SegmentsApi apiInstance = new SegmentsApi();
SegmentCreateQuery body = new SegmentCreateQuery(); // SegmentCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostSegmentCreateResponse result = apiInstance.createSegment(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentsApi#createSegment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SegmentCreateQuery**](SegmentCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostSegmentCreateResponse**](PostSegmentCreateResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSegment"></a>
# **deleteSegment**
> deleteSegment(id, revision)

Delete Segment

Delete a segment with the given segment ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;segments:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SegmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

SegmentsApi apiInstance = new SegmentsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.deleteSegment(id, revision);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentsApi#deleteSegment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSegment"></a>
# **getSegment**
> GetSegmentRetrieveResponseCompoundDocument getSegment(id, revision, additionalFieldsSegment, fieldsSegment, fieldsTag, include)

Get Segment

Get a segment with the given segment ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;&lt;br&gt;&lt;br&gt;Rate limits when using the &#x60;additional-fields[segment]&#x3D;profile_count&#x60; parameter in your API request:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;&lt;br&gt;&lt;br&gt;To learn more about how the &#x60;additional-fields&#x60; parameter impacts rate limits, check out our [Rate limits, status codes, and errors](https://developers.klaviyo.com/en/v2024-07-15/docs/rate_limits_and_error_handling) guide.  **Scopes:** &#x60;segments:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SegmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

SegmentsApi apiInstance = new SegmentsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> additionalFieldsSegment = Arrays.asList("additionalFieldsSegment_example"); // List<String> | Request additional fields not included by default in the response. Supported values: 'profile_count'
List<String> fieldsSegment = Arrays.asList("fieldsSegment_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsTag = Arrays.asList("fieldsTag_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    GetSegmentRetrieveResponseCompoundDocument result = apiInstance.getSegment(id, revision, additionalFieldsSegment, fieldsSegment, fieldsTag, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentsApi#getSegment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **additionalFieldsSegment** | [**List&lt;String&gt;**](String.md)| Request additional fields not included by default in the response. Supported values: &#x27;profile_count&#x27; | [optional] [enum: profile_count]
 **fieldsSegment** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, definition, definition.condition_groups, created, updated, is_active, is_processing, is_starred, profile_count]
 **fieldsTag** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: tags]

### Return type

[**GetSegmentRetrieveResponseCompoundDocument**](GetSegmentRetrieveResponseCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSegmentProfiles"></a>
# **getSegmentProfiles**
> GetSegmentMemberResponseCollection getSegmentProfiles(id, revision, additionalFieldsProfile, fieldsProfile, filter, pageCursor, pageSize, sort)

Get Segment Profiles

Get all profiles within a segment with the given segment ID.  Filter to request a subset of all profiles. Profiles can be filtered by &#x60;email&#x60;, &#x60;phone_number&#x60;, &#x60;push_token&#x60;, and &#x60;joined_group_at&#x60; fields. Profiles can be sorted by the following fields, in ascending and descending order: &#x60;joined_group_at&#x60;&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;profiles:read&#x60; &#x60;segments:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SegmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

SegmentsApi apiInstance = new SegmentsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> additionalFieldsProfile = Arrays.asList("additionalFieldsProfile_example"); // List<String> | Request additional fields not included by default in the response. Supported values: 'subscriptions', 'predictive_analytics'
List<String> fieldsProfile = Arrays.asList("fieldsProfile_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`email`: `any`, `equals`<br>`phone_number`: `any`, `equals`<br>`push_token`: `any`, `equals`<br>`_kx`: `equals`<br>`joined_group_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
Integer pageSize = 20; // Integer | Default: 20. Min: 1. Max: 100.
String sort = "sort_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    GetSegmentMemberResponseCollection result = apiInstance.getSegmentProfiles(id, revision, additionalFieldsProfile, fieldsProfile, filter, pageCursor, pageSize, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentsApi#getSegmentProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **additionalFieldsProfile** | [**List&lt;String&gt;**](String.md)| Request additional fields not included by default in the response. Supported values: &#x27;subscriptions&#x27;, &#x27;predictive_analytics&#x27; | [optional] [enum: subscriptions, predictive_analytics]
 **fieldsProfile** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: email, phone_number, external_id, first_name, last_name, organization, locale, title, image, created, updated, last_event_date, location, location.address1, location.address2, location.city, location.country, location.latitude, location.longitude, location.region, location.zip, location.timezone, location.ip, properties, joined_group_at, subscriptions, subscriptions.email, subscriptions.email.marketing, subscriptions.email.marketing.can_receive_email_marketing, subscriptions.email.marketing.consent, subscriptions.email.marketing.consent_timestamp, subscriptions.email.marketing.last_updated, subscriptions.email.marketing.method, subscriptions.email.marketing.method_detail, subscriptions.email.marketing.custom_method_detail, subscriptions.email.marketing.double_optin, subscriptions.email.marketing.suppression, subscriptions.email.marketing.list_suppressions, subscriptions.sms, subscriptions.sms.marketing, subscriptions.sms.marketing.can_receive_sms_marketing, subscriptions.sms.marketing.consent, subscriptions.sms.marketing.consent_timestamp, subscriptions.sms.marketing.method, subscriptions.sms.marketing.method_detail, subscriptions.sms.marketing.last_updated, subscriptions.mobile_push, subscriptions.mobile_push.marketing, subscriptions.mobile_push.marketing.can_receive_push_marketing, subscriptions.mobile_push.marketing.consent, subscriptions.mobile_push.marketing.consent_timestamp, predictive_analytics, predictive_analytics.historic_clv, predictive_analytics.predicted_clv, predictive_analytics.total_clv, predictive_analytics.historic_number_of_orders, predictive_analytics.predicted_number_of_orders, predictive_analytics.average_days_between_orders, predictive_analytics.average_order_value, predictive_analytics.churn_probability, predictive_analytics.expected_date_of_next_order]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;email&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;phone_number&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;push_token&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;_kx&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;joined_group_at&#x60;: &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]
 **pageSize** | **Integer**| Default: 20. Min: 1. Max: 100. | [optional] [default to 20] [enum: 1, 100]
 **sort** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: joined_group_at, -joined_group_at]

### Return type

[**GetSegmentMemberResponseCollection**](GetSegmentMemberResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSegmentRelationshipsProfiles"></a>
# **getSegmentRelationshipsProfiles**
> GetSegmentRelationshipsResponseCollection getSegmentRelationshipsProfiles(id, revision, filter, pageCursor, pageSize, sort)

Get Segment Relationships Profiles

Get all profile membership [relationships](https://developers.klaviyo.com/en/reference/api_overview#relationships) for the given segment ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;profiles:read&#x60; &#x60;segments:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SegmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

SegmentsApi apiInstance = new SegmentsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`email`: `any`, `equals`<br>`phone_number`: `any`, `equals`<br>`push_token`: `any`, `equals`<br>`_kx`: `equals`<br>`joined_group_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
Integer pageSize = 20; // Integer | Default: 20. Min: 1. Max: 1000.
String sort = "sort_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    GetSegmentRelationshipsResponseCollection result = apiInstance.getSegmentRelationshipsProfiles(id, revision, filter, pageCursor, pageSize, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentsApi#getSegmentRelationshipsProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;email&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;phone_number&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;push_token&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;_kx&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;joined_group_at&#x60;: &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]
 **pageSize** | **Integer**| Default: 20. Min: 1. Max: 1000. | [optional] [default to 20] [enum: 1, 1000]
 **sort** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: joined_group_at, -joined_group_at]

### Return type

[**GetSegmentRelationshipsResponseCollection**](GetSegmentRelationshipsResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSegmentRelationshipsTags"></a>
# **getSegmentRelationshipsTags**
> GetSegmentTagRelationshipListResponseCollection getSegmentRelationshipsTags(id, revision)

Get Segment Relationships Tags

If &#x60;related_resource&#x60; is &#x60;tags&#x60;, returns the tag IDs of all tags associated with the given segment ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;segments:read&#x60; &#x60;tags:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SegmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

SegmentsApi apiInstance = new SegmentsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    GetSegmentTagRelationshipListResponseCollection result = apiInstance.getSegmentRelationshipsTags(id, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentsApi#getSegmentRelationshipsTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**GetSegmentTagRelationshipListResponseCollection**](GetSegmentTagRelationshipListResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSegmentTags"></a>
# **getSegmentTags**
> GetTagResponseCollection getSegmentTags(id, revision, fieldsTag)

Get Segment Tags

Return all tags associated with the given segment ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;segments:read&#x60; &#x60;tags:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SegmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

SegmentsApi apiInstance = new SegmentsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsTag = Arrays.asList("fieldsTag_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetTagResponseCollection result = apiInstance.getSegmentTags(id, revision, fieldsTag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentsApi#getSegmentTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsTag** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name]

### Return type

[**GetTagResponseCollection**](GetTagResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSegments"></a>
# **getSegments**
> GetSegmentListResponseCollectionCompoundDocument getSegments(revision, fieldsSegment, fieldsTag, filter, include, pageCursor, sort)

Get Segments

Get all segments in an account.  Filter to request a subset of all segments. Segments can be filtered by &#x60;name&#x60;, &#x60;created&#x60;, and &#x60;updated&#x60; fields.  Returns a maximum of 10 results per page.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;segments:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SegmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

SegmentsApi apiInstance = new SegmentsApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsSegment = Arrays.asList("fieldsSegment_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsTag = Arrays.asList("fieldsTag_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`name`: `any`, `equals`<br>`id`: `any`, `equals`<br>`created`: `greater-than`<br>`updated`: `greater-than`<br>`is_active`: `any`, `equals`<br>`is_starred`: `equals`
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
String sort = "sort_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    GetSegmentListResponseCollectionCompoundDocument result = apiInstance.getSegments(revision, fieldsSegment, fieldsTag, filter, include, pageCursor, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentsApi#getSegments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsSegment** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, definition, definition.condition_groups, created, updated, is_active, is_processing, is_starred]
 **fieldsTag** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;name&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;id&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;created&#x60;: &#x60;greater-than&#x60;&lt;br&gt;&#x60;updated&#x60;: &#x60;greater-than&#x60;&lt;br&gt;&#x60;is_active&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;is_starred&#x60;: &#x60;equals&#x60; | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: tags]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]
 **sort** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created, id, -id, name, -name, updated, -updated]

### Return type

[**GetSegmentListResponseCollectionCompoundDocument**](GetSegmentListResponseCollectionCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSegment"></a>
# **updateSegment**
> PatchSegmentPartialUpdateResponse updateSegment(body, revision, id)

Update Segment

Update a segment with the given segment ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;&lt;br&gt;Daily: &#x60;100/d&#x60;  **Scopes:** &#x60;segments:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SegmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

SegmentsApi apiInstance = new SegmentsApi();
SegmentPartialUpdateQuery body = new SegmentPartialUpdateQuery(); // SegmentPartialUpdateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | 
try {
    PatchSegmentPartialUpdateResponse result = apiInstance.updateSegment(body, revision, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentsApi#updateSegment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SegmentPartialUpdateQuery**](SegmentPartialUpdateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**|  |

### Return type

[**PatchSegmentPartialUpdateResponse**](PatchSegmentPartialUpdateResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

