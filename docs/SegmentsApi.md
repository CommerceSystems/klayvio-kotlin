# SegmentsApi

All URIs are relative to *https://a.klaviyo.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSegment**](SegmentsApi.md#createSegment) | **POST** /api/segments/ | Create Segment |
| [**deleteSegment**](SegmentsApi.md#deleteSegment) | **DELETE** /api/segments/{id}/ | Delete Segment |
| [**getSegment**](SegmentsApi.md#getSegment) | **GET** /api/segments/{id}/ | Get Segment |
| [**getSegmentProfiles**](SegmentsApi.md#getSegmentProfiles) | **GET** /api/segments/{id}/profiles/ | Get Segment Profiles |
| [**getSegmentRelationshipsProfiles**](SegmentsApi.md#getSegmentRelationshipsProfiles) | **GET** /api/segments/{id}/relationships/profiles/ | Get Segment Relationships Profiles |
| [**getSegmentRelationshipsTags**](SegmentsApi.md#getSegmentRelationshipsTags) | **GET** /api/segments/{id}/relationships/tags/ | Get Segment Relationships Tags |
| [**getSegmentTags**](SegmentsApi.md#getSegmentTags) | **GET** /api/segments/{id}/tags/ | Get Segment Tags |
| [**getSegments**](SegmentsApi.md#getSegments) | **GET** /api/segments/ | Get Segments |
| [**updateSegment**](SegmentsApi.md#updateSegment) | **PATCH** /api/segments/{id}/ | Update Segment |


<a id="createSegment"></a>
# **createSegment**
> PostSegmentCreateResponse createSegment(revision, segmentCreateQuery)

Create Segment

Create a segment.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;&lt;br&gt;Daily: &#x60;100/d&#x60;  **Scopes:** &#x60;segments:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SegmentsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val segmentCreateQuery : SegmentCreateQuery =  // SegmentCreateQuery | 
try {
    val result : PostSegmentCreateResponse = apiInstance.createSegment(revision, segmentCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#createSegment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#createSegment")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **segmentCreateQuery** | [**SegmentCreateQuery**](SegmentCreateQuery.md)|  | |

### Return type

[**PostSegmentCreateResponse**](PostSegmentCreateResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSegment"></a>
# **deleteSegment**
> deleteSegment(id, revision)

Delete Segment

Delete a segment with the given segment ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;segments:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SegmentsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.deleteSegment(id, revision)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#deleteSegment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#deleteSegment")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
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

<a id="getSegment"></a>
# **getSegment**
> GetSegmentRetrieveResponseCompoundDocument getSegment(id, revision, additionalFieldsSegment, fieldsSegment, fieldsTag, include)

Get Segment

Get a segment with the given segment ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;&lt;br&gt;&lt;br&gt;Rate limits when using the &#x60;additional-fields[segment]&#x3D;profile_count&#x60; parameter in your API request:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;&lt;br&gt;&lt;br&gt;To learn more about how the &#x60;additional-fields&#x60; parameter impacts rate limits, check out our [Rate limits, status codes, and errors](https://developers.klaviyo.com/en/v2024-07-15/docs/rate_limits_and_error_handling) guide.  **Scopes:** &#x60;segments:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SegmentsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val additionalFieldsSegment : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Request additional fields not included by default in the response. Supported values: 'profile_count'
val fieldsSegment : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsTag : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    val result : GetSegmentRetrieveResponseCompoundDocument = apiInstance.getSegment(id, revision, additionalFieldsSegment, fieldsSegment, fieldsTag, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#getSegment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#getSegment")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **additionalFieldsSegment** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Request additional fields not included by default in the response. Supported values: &#39;profile_count&#39; | [optional] [enum: profile_count] |
| **fieldsSegment** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, definition, definition.condition_groups, created, updated, is_active, is_processing, is_starred, profile_count] |
| **fieldsTag** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: tags] |

### Return type

[**GetSegmentRetrieveResponseCompoundDocument**](GetSegmentRetrieveResponseCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSegmentProfiles"></a>
# **getSegmentProfiles**
> GetSegmentMemberResponseCollection getSegmentProfiles(id, revision, additionalFieldsProfile, fieldsProfile, filter, pageCursor, pageSize, sort)

Get Segment Profiles

Get all profiles within a segment with the given segment ID.  Filter to request a subset of all profiles. Profiles can be filtered by &#x60;email&#x60;, &#x60;phone_number&#x60;, &#x60;push_token&#x60;, and &#x60;joined_group_at&#x60; fields. Profiles can be sorted by the following fields, in ascending and descending order: &#x60;joined_group_at&#x60;&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;profiles:read&#x60; &#x60;segments:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SegmentsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val additionalFieldsProfile : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Request additional fields not included by default in the response. Supported values: 'subscriptions', 'predictive_analytics'
val fieldsProfile : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`email`: `any`, `equals`<br>`phone_number`: `any`, `equals`<br>`push_token`: `any`, `equals`<br>`_kx`: `equals`<br>`joined_group_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val pageSize : kotlin.Int = 56 // kotlin.Int | Default: 20. Min: 1. Max: 100.
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetSegmentMemberResponseCollection = apiInstance.getSegmentProfiles(id, revision, additionalFieldsProfile, fieldsProfile, filter, pageCursor, pageSize, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#getSegmentProfiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#getSegmentProfiles")
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

[**GetSegmentMemberResponseCollection**](GetSegmentMemberResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSegmentRelationshipsProfiles"></a>
# **getSegmentRelationshipsProfiles**
> GetSegmentRelationshipsResponseCollection getSegmentRelationshipsProfiles(id, revision, filter, pageCursor, pageSize, sort)

Get Segment Relationships Profiles

Get all profile membership [relationships](https://developers.klaviyo.com/en/reference/api_overview#relationships) for the given segment ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;profiles:read&#x60; &#x60;segments:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SegmentsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`email`: `any`, `equals`<br>`phone_number`: `any`, `equals`<br>`push_token`: `any`, `equals`<br>`_kx`: `equals`<br>`joined_group_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val pageSize : kotlin.Int = 56 // kotlin.Int | Default: 20. Min: 1. Max: 1000.
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetSegmentRelationshipsResponseCollection = apiInstance.getSegmentRelationshipsProfiles(id, revision, filter, pageCursor, pageSize, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#getSegmentRelationshipsProfiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#getSegmentRelationshipsProfiles")
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

[**GetSegmentRelationshipsResponseCollection**](GetSegmentRelationshipsResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSegmentRelationshipsTags"></a>
# **getSegmentRelationshipsTags**
> GetSegmentTagRelationshipListResponseCollection getSegmentRelationshipsTags(id, revision)

Get Segment Relationships Tags

If &#x60;related_resource&#x60; is &#x60;tags&#x60;, returns the tag IDs of all tags associated with the given segment ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;segments:read&#x60; &#x60;tags:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SegmentsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetSegmentTagRelationshipListResponseCollection = apiInstance.getSegmentRelationshipsTags(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#getSegmentRelationshipsTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#getSegmentRelationshipsTags")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetSegmentTagRelationshipListResponseCollection**](GetSegmentTagRelationshipListResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSegmentTags"></a>
# **getSegmentTags**
> GetTagResponseCollection getSegmentTags(id, revision, fieldsTag)

Get Segment Tags

Return all tags associated with the given segment ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;segments:read&#x60; &#x60;tags:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SegmentsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsTag : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetTagResponseCollection = apiInstance.getSegmentTags(id, revision, fieldsTag)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#getSegmentTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#getSegmentTags")
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

<a id="getSegments"></a>
# **getSegments**
> GetSegmentListResponseCollectionCompoundDocument getSegments(revision, fieldsSegment, fieldsTag, filter, include, pageCursor, sort)

Get Segments

Get all segments in an account.  Filter to request a subset of all segments. Segments can be filtered by &#x60;name&#x60;, &#x60;created&#x60;, and &#x60;updated&#x60; fields.  Returns a maximum of 10 results per page.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;segments:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SegmentsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsSegment : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsTag : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`name`: `any`, `equals`<br>`id`: `any`, `equals`<br>`created`: `greater-than`<br>`updated`: `greater-than`<br>`is_active`: `any`, `equals`<br>`is_starred`: `equals`
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetSegmentListResponseCollectionCompoundDocument = apiInstance.getSegments(revision, fieldsSegment, fieldsTag, filter, include, pageCursor, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#getSegments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#getSegments")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsSegment** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, definition, definition.condition_groups, created, updated, is_active, is_processing, is_starred] |
| **fieldsTag** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;name&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;id&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;created&#x60;: &#x60;greater-than&#x60;&lt;br&gt;&#x60;updated&#x60;: &#x60;greater-than&#x60;&lt;br&gt;&#x60;is_active&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;is_starred&#x60;: &#x60;equals&#x60; | [optional] |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: tags] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created, id, -id, name, -name, updated, -updated] |

### Return type

[**GetSegmentListResponseCollectionCompoundDocument**](GetSegmentListResponseCollectionCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateSegment"></a>
# **updateSegment**
> PatchSegmentPartialUpdateResponse updateSegment(id, revision, segmentPartialUpdateQuery)

Update Segment

Update a segment with the given segment ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;&lt;br&gt;Daily: &#x60;100/d&#x60;  **Scopes:** &#x60;segments:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SegmentsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val segmentPartialUpdateQuery : SegmentPartialUpdateQuery =  // SegmentPartialUpdateQuery | 
try {
    val result : PatchSegmentPartialUpdateResponse = apiInstance.updateSegment(id, revision, segmentPartialUpdateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#updateSegment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#updateSegment")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **segmentPartialUpdateQuery** | [**SegmentPartialUpdateQuery**](SegmentPartialUpdateQuery.md)|  | |

### Return type

[**PatchSegmentPartialUpdateResponse**](PatchSegmentPartialUpdateResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

