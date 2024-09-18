# ListsApi

All URIs are relative to *https://a.klaviyo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createList**](ListsApi.md#createList) | **POST** /api/lists/ | Create List
[**createListRelationships**](ListsApi.md#createListRelationships) | **POST** /api/lists/{id}/relationships/profiles/ | Add Profile To List
[**deleteList**](ListsApi.md#deleteList) | **DELETE** /api/lists/{id}/ | Delete List
[**deleteListRelationships**](ListsApi.md#deleteListRelationships) | **DELETE** /api/lists/{id}/relationships/profiles/ | Remove Profile From List
[**getList**](ListsApi.md#getList) | **GET** /api/lists/{id}/ | Get List
[**getListProfiles**](ListsApi.md#getListProfiles) | **GET** /api/lists/{id}/profiles/ | Get List Profiles
[**getListRelationshipsProfiles**](ListsApi.md#getListRelationshipsProfiles) | **GET** /api/lists/{id}/relationships/profiles/ | Get List Relationships Profiles
[**getListRelationshipsTags**](ListsApi.md#getListRelationshipsTags) | **GET** /api/lists/{id}/relationships/tags/ | Get List Relationships Tags
[**getListTags**](ListsApi.md#getListTags) | **GET** /api/lists/{id}/tags/ | Get List Tags
[**getLists**](ListsApi.md#getLists) | **GET** /api/lists/ | Get Lists
[**updateList**](ListsApi.md#updateList) | **PATCH** /api/lists/{id}/ | Update List

<a name="createList"></a>
# **createList**
> PostListCreateResponse createList(body, revision)

Create List

Create a new list.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;&lt;br&gt;Daily: &#x60;100/d&#x60;  **Scopes:** &#x60;lists:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
ListCreateQuery body = new ListCreateQuery(); // ListCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostListCreateResponse result = apiInstance.createList(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#createList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ListCreateQuery**](ListCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostListCreateResponse**](PostListCreateResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createListRelationships"></a>
# **createListRelationships**
> createListRelationships(body, revision, id)

Add Profile To List

Add a profile to a list with the given list ID.  It is recommended that you use the [Subscribe Profiles endpoint](https://developers.klaviyo.com/en/reference/subscribe_profiles) if you&#x27;re trying to give a profile [consent](https://developers.klaviyo.com/en/docs/collect_email_and_sms_consent_via_api) to receive email marketing, SMS marketing, or both.  This endpoint accepts a maximum of 1000 profiles per call.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;lists:write&#x60; &#x60;profiles:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
ListMembersAddQuery body = new ListMembersAddQuery(); // ListMembersAddQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | 
try {
    apiInstance.createListRelationships(body, revision, id);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#createListRelationships");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ListMembersAddQuery**](ListMembersAddQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteList"></a>
# **deleteList**
> deleteList(id, revision)

Delete List

Delete a list with the given list ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;lists:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
String id = "id_example"; // String | Primary key that uniquely identifies this list. Generated by Klaviyo.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.deleteList(id, revision);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#deleteList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Primary key that uniquely identifies this list. Generated by Klaviyo. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteListRelationships"></a>
# **deleteListRelationships**
> deleteListRelationships(body, revision, id)

Remove Profile From List

Remove a profile from a list with the given list ID.  The provided profile will no longer receive marketing from this particular list once removed.  Removing a profile from a list will not impact the profile&#x27;s [consent](https://developers.klaviyo.com/en/docs/collect_email_and_sms_consent_via_api) status or subscription status in general. To update a profile&#x27;s subscription status, please use the [Unsubscribe Profiles endpoint](https://developers.klaviyo.com/en/reference/unsubscribe_profiles).  This endpoint accepts a maximum of 1000 profiles per call.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;lists:write&#x60; &#x60;profiles:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
ListMembersDeleteQuery body = new ListMembersDeleteQuery(); // ListMembersDeleteQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | 
try {
    apiInstance.deleteListRelationships(body, revision, id);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#deleteListRelationships");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ListMembersDeleteQuery**](ListMembersDeleteQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getList"></a>
# **getList**
> GetListRetrieveResponseCompoundDocument getList(id, revision, additionalFieldsList, fieldsList, fieldsTag, include)

Get List

Get a list with the given list ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;&lt;br&gt;&lt;br&gt;Rate limits when using the &#x60;additional-fields[list]&#x3D;profile_count&#x60; parameter in your API request:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;&lt;br&gt;&lt;br&gt;To learn more about how the &#x60;additional-fields&#x60; parameter impacts rate limits, check out our [Rate limits, status codes, and errors](https://developers.klaviyo.com/en/v2024-07-15/docs/rate_limits_and_error_handling) guide.  **Scopes:** &#x60;lists:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
String id = "id_example"; // String | Primary key that uniquely identifies this list. Generated by Klaviyo.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> additionalFieldsList = Arrays.asList("additionalFieldsList_example"); // List<String> | Request additional fields not included by default in the response. Supported values: 'profile_count'
List<String> fieldsList = Arrays.asList("fieldsList_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsTag = Arrays.asList("fieldsTag_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    GetListRetrieveResponseCompoundDocument result = apiInstance.getList(id, revision, additionalFieldsList, fieldsList, fieldsTag, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#getList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Primary key that uniquely identifies this list. Generated by Klaviyo. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **additionalFieldsList** | [**List&lt;String&gt;**](String.md)| Request additional fields not included by default in the response. Supported values: &#x27;profile_count&#x27; | [optional] [enum: profile_count]
 **fieldsList** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, created, updated, opt_in_process, profile_count]
 **fieldsTag** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: tags]

### Return type

[**GetListRetrieveResponseCompoundDocument**](GetListRetrieveResponseCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getListProfiles"></a>
# **getListProfiles**
> GetListMemberResponseCollection getListProfiles(id, revision, additionalFieldsProfile, fieldsProfile, filter, pageCursor, pageSize, sort)

Get List Profiles

Get all profiles within a list with the given list ID.  Filter to request a subset of all profiles. Profiles can be filtered by &#x60;email&#x60;, &#x60;phone_number&#x60;, &#x60;push_token&#x60;, and &#x60;joined_group_at&#x60; fields. Profiles can be sorted by the following fields, in ascending and descending order: &#x60;joined_group_at&#x60;&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;&lt;br&gt;&lt;br&gt;Rate limits when using the &#x60;additional-fields[profile]&#x3D;predictive_analytics&#x60; parameter in your API request:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;&lt;br&gt;&lt;br&gt;To learn more about how the &#x60;additional-fields&#x60; parameter impacts rate limits, check out our [Rate limits, status codes, and errors](https://developers.klaviyo.com/en/v2024-07-15/docs/rate_limits_and_error_handling) guide.  **Scopes:** &#x60;lists:read&#x60; &#x60;profiles:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> additionalFieldsProfile = Arrays.asList("additionalFieldsProfile_example"); // List<String> | Request additional fields not included by default in the response. Supported values: 'subscriptions', 'predictive_analytics'
List<String> fieldsProfile = Arrays.asList("fieldsProfile_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`email`: `any`, `equals`<br>`phone_number`: `any`, `equals`<br>`push_token`: `any`, `equals`<br>`_kx`: `equals`<br>`joined_group_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
Integer pageSize = 20; // Integer | Default: 20. Min: 1. Max: 100.
String sort = "sort_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    GetListMemberResponseCollection result = apiInstance.getListProfiles(id, revision, additionalFieldsProfile, fieldsProfile, filter, pageCursor, pageSize, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#getListProfiles");
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

[**GetListMemberResponseCollection**](GetListMemberResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getListRelationshipsProfiles"></a>
# **getListRelationshipsProfiles**
> GetListRelationshipsResponseCollection getListRelationshipsProfiles(id, revision, filter, pageCursor, pageSize, sort)

Get List Relationships Profiles

Get profile membership [relationships](https://developers.klaviyo.com/en/reference/api_overview#relationships) for a list with the given list ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;lists:read&#x60; &#x60;profiles:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`email`: `any`, `equals`<br>`phone_number`: `any`, `equals`<br>`push_token`: `any`, `equals`<br>`_kx`: `equals`<br>`joined_group_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
Integer pageSize = 20; // Integer | Default: 20. Min: 1. Max: 1000.
String sort = "sort_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    GetListRelationshipsResponseCollection result = apiInstance.getListRelationshipsProfiles(id, revision, filter, pageCursor, pageSize, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#getListRelationshipsProfiles");
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

[**GetListRelationshipsResponseCollection**](GetListRelationshipsResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getListRelationshipsTags"></a>
# **getListRelationshipsTags**
> GetListTagRelationshipListResponseCollection getListRelationshipsTags(id, revision)

Get List Relationships Tags

Returns the tag IDs of all tags associated with the given list.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;lists:read&#x60; &#x60;tags:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    GetListTagRelationshipListResponseCollection result = apiInstance.getListRelationshipsTags(id, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#getListRelationshipsTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**GetListTagRelationshipListResponseCollection**](GetListTagRelationshipListResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getListTags"></a>
# **getListTags**
> GetTagResponseCollection getListTags(id, revision, fieldsTag)

Get List Tags

Return all tags associated with the given list ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;lists:read&#x60; &#x60;tags:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsTag = Arrays.asList("fieldsTag_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetTagResponseCollection result = apiInstance.getListTags(id, revision, fieldsTag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#getListTags");
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

<a name="getLists"></a>
# **getLists**
> GetListListResponseCollectionCompoundDocument getLists(revision, fieldsList, fieldsTag, filter, include, pageCursor, sort)

Get Lists

Get all lists in an account.  Filter to request a subset of all lists. Lists can be filtered by &#x60;id&#x60;, &#x60;name&#x60;, &#x60;created&#x60;, and &#x60;updated&#x60; fields.  Returns a maximum of 10 results per page.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;lists:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsList = Arrays.asList("fieldsList_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsTag = Arrays.asList("fieldsTag_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`name`: `any`, `equals`<br>`id`: `any`, `equals`<br>`created`: `greater-than`<br>`updated`: `greater-than`
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
String sort = "sort_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    GetListListResponseCollectionCompoundDocument result = apiInstance.getLists(revision, fieldsList, fieldsTag, filter, include, pageCursor, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#getLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsList** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, created, updated, opt_in_process]
 **fieldsTag** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;name&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;id&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;created&#x60;: &#x60;greater-than&#x60;&lt;br&gt;&#x60;updated&#x60;: &#x60;greater-than&#x60; | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: tags]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]
 **sort** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created, id, -id, name, -name, updated, -updated]

### Return type

[**GetListListResponseCollectionCompoundDocument**](GetListListResponseCollectionCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateList"></a>
# **updateList**
> PatchListPartialUpdateResponse updateList(body, revision, id)

Update List

Update the name of a list with the given list ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;lists:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ListsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ListsApi apiInstance = new ListsApi();
ListPartialUpdateQuery body = new ListPartialUpdateQuery(); // ListPartialUpdateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | Primary key that uniquely identifies this list. Generated by Klaviyo.
try {
    PatchListPartialUpdateResponse result = apiInstance.updateList(body, revision, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#updateList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ListPartialUpdateQuery**](ListPartialUpdateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**| Primary key that uniquely identifies this list. Generated by Klaviyo. |

### Return type

[**PatchListPartialUpdateResponse**](PatchListPartialUpdateResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

