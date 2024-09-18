# ListsApi

All URIs are relative to *https://a.klaviyo.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createList**](ListsApi.md#createList) | **POST** /api/lists/ | Create List |
| [**createListRelationships**](ListsApi.md#createListRelationships) | **POST** /api/lists/{id}/relationships/profiles/ | Add Profile To List |
| [**deleteList**](ListsApi.md#deleteList) | **DELETE** /api/lists/{id}/ | Delete List |
| [**deleteListRelationships**](ListsApi.md#deleteListRelationships) | **DELETE** /api/lists/{id}/relationships/profiles/ | Remove Profile From List |
| [**getList**](ListsApi.md#getList) | **GET** /api/lists/{id}/ | Get List |
| [**getListProfiles**](ListsApi.md#getListProfiles) | **GET** /api/lists/{id}/profiles/ | Get List Profiles |
| [**getListRelationshipsProfiles**](ListsApi.md#getListRelationshipsProfiles) | **GET** /api/lists/{id}/relationships/profiles/ | Get List Relationships Profiles |
| [**getListRelationshipsTags**](ListsApi.md#getListRelationshipsTags) | **GET** /api/lists/{id}/relationships/tags/ | Get List Relationships Tags |
| [**getListTags**](ListsApi.md#getListTags) | **GET** /api/lists/{id}/tags/ | Get List Tags |
| [**getLists**](ListsApi.md#getLists) | **GET** /api/lists/ | Get Lists |
| [**updateList**](ListsApi.md#updateList) | **PATCH** /api/lists/{id}/ | Update List |


<a id="createList"></a>
# **createList**
> PostListCreateResponse createList(revision, listCreateQuery)

Create List

Create a new list.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;&lt;br&gt;Daily: &#x60;100/d&#x60;  **Scopes:** &#x60;lists:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ListsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val listCreateQuery : ListCreateQuery =  // ListCreateQuery | 
try {
    val result : PostListCreateResponse = apiInstance.createList(revision, listCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#createList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#createList")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **listCreateQuery** | [**ListCreateQuery**](ListCreateQuery.md)|  | |

### Return type

[**PostListCreateResponse**](PostListCreateResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createListRelationships"></a>
# **createListRelationships**
> createListRelationships(id, revision, listMembersAddQuery)

Add Profile To List

Add a profile to a list with the given list ID.  It is recommended that you use the [Subscribe Profiles endpoint](https://developers.klaviyo.com/en/reference/subscribe_profiles) if you&#39;re trying to give a profile [consent](https://developers.klaviyo.com/en/docs/collect_email_and_sms_consent_via_api) to receive email marketing, SMS marketing, or both.  This endpoint accepts a maximum of 1000 profiles per call.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;lists:write&#x60; &#x60;profiles:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ListsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val listMembersAddQuery : ListMembersAddQuery =  // ListMembersAddQuery | 
try {
    apiInstance.createListRelationships(id, revision, listMembersAddQuery)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#createListRelationships")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#createListRelationships")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **listMembersAddQuery** | [**ListMembersAddQuery**](ListMembersAddQuery.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteList"></a>
# **deleteList**
> deleteList(id, revision)

Delete List

Delete a list with the given list ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;lists:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ListsApi()
val id : kotlin.String = Y6nRLr // kotlin.String | Primary key that uniquely identifies this list. Generated by Klaviyo.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.deleteList(id, revision)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#deleteList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#deleteList")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Primary key that uniquely identifies this list. Generated by Klaviyo. | |
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

<a id="deleteListRelationships"></a>
# **deleteListRelationships**
> deleteListRelationships(id, revision, listMembersDeleteQuery)

Remove Profile From List

Remove a profile from a list with the given list ID.  The provided profile will no longer receive marketing from this particular list once removed.  Removing a profile from a list will not impact the profile&#39;s [consent](https://developers.klaviyo.com/en/docs/collect_email_and_sms_consent_via_api) status or subscription status in general. To update a profile&#39;s subscription status, please use the [Unsubscribe Profiles endpoint](https://developers.klaviyo.com/en/reference/unsubscribe_profiles).  This endpoint accepts a maximum of 1000 profiles per call.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;lists:write&#x60; &#x60;profiles:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ListsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val listMembersDeleteQuery : ListMembersDeleteQuery =  // ListMembersDeleteQuery | 
try {
    apiInstance.deleteListRelationships(id, revision, listMembersDeleteQuery)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#deleteListRelationships")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#deleteListRelationships")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **listMembersDeleteQuery** | [**ListMembersDeleteQuery**](ListMembersDeleteQuery.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getList"></a>
# **getList**
> GetListRetrieveResponseCompoundDocument getList(id, revision, additionalFieldsList, fieldsList, fieldsTag, include)

Get List

Get a list with the given list ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;&lt;br&gt;&lt;br&gt;Rate limits when using the &#x60;additional-fields[list]&#x3D;profile_count&#x60; parameter in your API request:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;&lt;br&gt;&lt;br&gt;To learn more about how the &#x60;additional-fields&#x60; parameter impacts rate limits, check out our [Rate limits, status codes, and errors](https://developers.klaviyo.com/en/v2024-07-15/docs/rate_limits_and_error_handling) guide.  **Scopes:** &#x60;lists:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ListsApi()
val id : kotlin.String = Y6nRLr // kotlin.String | Primary key that uniquely identifies this list. Generated by Klaviyo.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val additionalFieldsList : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Request additional fields not included by default in the response. Supported values: 'profile_count'
val fieldsList : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsTag : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    val result : GetListRetrieveResponseCompoundDocument = apiInstance.getList(id, revision, additionalFieldsList, fieldsList, fieldsTag, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#getList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#getList")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Primary key that uniquely identifies this list. Generated by Klaviyo. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **additionalFieldsList** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Request additional fields not included by default in the response. Supported values: &#39;profile_count&#39; | [optional] [enum: profile_count] |
| **fieldsList** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, created, updated, opt_in_process, profile_count] |
| **fieldsTag** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: tags] |

### Return type

[**GetListRetrieveResponseCompoundDocument**](GetListRetrieveResponseCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getListProfiles"></a>
# **getListProfiles**
> GetListMemberResponseCollection getListProfiles(id, revision, additionalFieldsProfile, fieldsProfile, filter, pageCursor, pageSize, sort)

Get List Profiles

Get all profiles within a list with the given list ID.  Filter to request a subset of all profiles. Profiles can be filtered by &#x60;email&#x60;, &#x60;phone_number&#x60;, &#x60;push_token&#x60;, and &#x60;joined_group_at&#x60; fields. Profiles can be sorted by the following fields, in ascending and descending order: &#x60;joined_group_at&#x60;&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;&lt;br&gt;&lt;br&gt;Rate limits when using the &#x60;additional-fields[profile]&#x3D;predictive_analytics&#x60; parameter in your API request:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;&lt;br&gt;&lt;br&gt;To learn more about how the &#x60;additional-fields&#x60; parameter impacts rate limits, check out our [Rate limits, status codes, and errors](https://developers.klaviyo.com/en/v2024-07-15/docs/rate_limits_and_error_handling) guide.  **Scopes:** &#x60;lists:read&#x60; &#x60;profiles:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ListsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val additionalFieldsProfile : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Request additional fields not included by default in the response. Supported values: 'subscriptions', 'predictive_analytics'
val fieldsProfile : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`email`: `any`, `equals`<br>`phone_number`: `any`, `equals`<br>`push_token`: `any`, `equals`<br>`_kx`: `equals`<br>`joined_group_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val pageSize : kotlin.Int = 56 // kotlin.Int | Default: 20. Min: 1. Max: 100.
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetListMemberResponseCollection = apiInstance.getListProfiles(id, revision, additionalFieldsProfile, fieldsProfile, filter, pageCursor, pageSize, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#getListProfiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#getListProfiles")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **additionalFieldsProfile** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Request additional fields not included by default in the response. Supported values: &#39;subscriptions&#39;, &#39;predictive_analytics&#39; | [optional] [enum: subscriptions, predictive_analytics] |
| **fieldsProfile** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: email, phone_number, external_id, first_name, last_name, organization, locale, title, image, created, updated, last_event_date, location, location.address1, location.address2, location.city, location.country, location.latitude, location.longitude, location.region, location.zip, location.timezone, location.ip, properties, joined_group_at, subscriptions, subscriptions.email, subscriptions.email.marketing, subscriptions.email.marketing.can_receive_email_marketing, subscriptions.email.marketing.consent, subscriptions.email.marketing.consent_timestamp, subscriptions.email.marketing.last_updated, subscriptions.email.marketing.method, subscriptions.email.marketing.method_detail, subscriptions.email.marketing.custom_method_detail, subscriptions.email.marketing.double_optin, subscriptions.email.marketing.suppression, subscriptions.email.marketing.list_suppressions, subscriptions.sms, subscriptions.sms.marketing, subscriptions.sms.marketing.can_receive_sms_marketing, subscriptions.sms.marketing.consent, subscriptions.sms.marketing.consent_timestamp, subscriptions.sms.marketing.method, subscriptions.sms.marketing.method_detail, subscriptions.sms.marketing.last_updated, subscriptions.mobile_push, subscriptions.mobile_push.marketing, subscriptions.mobile_push.marketing.can_receive_push_marketing, subscriptions.mobile_push.marketing.consent, subscriptions.mobile_push.marketing.consent_timestamp, predictive_analytics, predictive_analytics.historic_clv, predictive_analytics.predicted_clv, predictive_analytics.total_clv, predictive_analytics.historic_number_of_orders, predictive_analytics.predicted_number_of_orders, predictive_analytics.average_days_between_orders, predictive_analytics.average_order_value, predictive_analytics.churn_probability, predictive_analytics.expected_date_of_next_order] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;email&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;phone_number&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;push_token&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;_kx&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;joined_group_at&#x60;: &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60; | [optional] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| **pageSize** | **kotlin.Int**| Default: 20. Min: 1. Max: 100. | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: joined_group_at, -joined_group_at] |

### Return type

[**GetListMemberResponseCollection**](GetListMemberResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getListRelationshipsProfiles"></a>
# **getListRelationshipsProfiles**
> GetListRelationshipsResponseCollection getListRelationshipsProfiles(id, revision, filter, pageCursor, pageSize, sort)

Get List Relationships Profiles

Get profile membership [relationships](https://developers.klaviyo.com/en/reference/api_overview#relationships) for a list with the given list ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;lists:read&#x60; &#x60;profiles:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ListsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`email`: `any`, `equals`<br>`phone_number`: `any`, `equals`<br>`push_token`: `any`, `equals`<br>`_kx`: `equals`<br>`joined_group_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val pageSize : kotlin.Int = 56 // kotlin.Int | Default: 20. Min: 1. Max: 1000.
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetListRelationshipsResponseCollection = apiInstance.getListRelationshipsProfiles(id, revision, filter, pageCursor, pageSize, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#getListRelationshipsProfiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#getListRelationshipsProfiles")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;email&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;phone_number&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;push_token&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;_kx&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;joined_group_at&#x60;: &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60; | [optional] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| **pageSize** | **kotlin.Int**| Default: 20. Min: 1. Max: 1000. | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: joined_group_at, -joined_group_at] |

### Return type

[**GetListRelationshipsResponseCollection**](GetListRelationshipsResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getListRelationshipsTags"></a>
# **getListRelationshipsTags**
> GetListTagRelationshipListResponseCollection getListRelationshipsTags(id, revision)

Get List Relationships Tags

Returns the tag IDs of all tags associated with the given list.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;lists:read&#x60; &#x60;tags:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ListsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetListTagRelationshipListResponseCollection = apiInstance.getListRelationshipsTags(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#getListRelationshipsTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#getListRelationshipsTags")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetListTagRelationshipListResponseCollection**](GetListTagRelationshipListResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getListTags"></a>
# **getListTags**
> GetTagResponseCollection getListTags(id, revision, fieldsTag)

Get List Tags

Return all tags associated with the given list ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;lists:read&#x60; &#x60;tags:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ListsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsTag : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetTagResponseCollection = apiInstance.getListTags(id, revision, fieldsTag)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#getListTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#getListTags")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsTag** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name] |

### Return type

[**GetTagResponseCollection**](GetTagResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLists"></a>
# **getLists**
> GetListListResponseCollectionCompoundDocument getLists(revision, fieldsList, fieldsTag, filter, include, pageCursor, sort)

Get Lists

Get all lists in an account.  Filter to request a subset of all lists. Lists can be filtered by &#x60;id&#x60;, &#x60;name&#x60;, &#x60;created&#x60;, and &#x60;updated&#x60; fields.  Returns a maximum of 10 results per page.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;lists:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ListsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsList : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsTag : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`name`: `any`, `equals`<br>`id`: `any`, `equals`<br>`created`: `greater-than`<br>`updated`: `greater-than`
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetListListResponseCollectionCompoundDocument = apiInstance.getLists(revision, fieldsList, fieldsTag, filter, include, pageCursor, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#getLists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#getLists")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsList** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, created, updated, opt_in_process] |
| **fieldsTag** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;name&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;id&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;created&#x60;: &#x60;greater-than&#x60;&lt;br&gt;&#x60;updated&#x60;: &#x60;greater-than&#x60; | [optional] |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: tags] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created, id, -id, name, -name, updated, -updated] |

### Return type

[**GetListListResponseCollectionCompoundDocument**](GetListListResponseCollectionCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateList"></a>
# **updateList**
> PatchListPartialUpdateResponse updateList(id, revision, listPartialUpdateQuery)

Update List

Update the name of a list with the given list ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;lists:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ListsApi()
val id : kotlin.String = Y6nRLr // kotlin.String | Primary key that uniquely identifies this list. Generated by Klaviyo.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val listPartialUpdateQuery : ListPartialUpdateQuery =  // ListPartialUpdateQuery | 
try {
    val result : PatchListPartialUpdateResponse = apiInstance.updateList(id, revision, listPartialUpdateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#updateList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#updateList")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Primary key that uniquely identifies this list. Generated by Klaviyo. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **listPartialUpdateQuery** | [**ListPartialUpdateQuery**](ListPartialUpdateQuery.md)|  | |

### Return type

[**PatchListPartialUpdateResponse**](PatchListPartialUpdateResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

