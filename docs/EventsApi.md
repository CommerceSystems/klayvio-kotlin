# EventsApi

All URIs are relative to *https://a.klaviyo.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**bulkCreateEvents**](EventsApi.md#bulkCreateEvents) | **POST** /api/event-bulk-create-jobs/ | Bulk Create Events |
| [**createEvent**](EventsApi.md#createEvent) | **POST** /api/events/ | Create Event |
| [**getEvent**](EventsApi.md#getEvent) | **GET** /api/events/{id}/ | Get Event |
| [**getEventMetric**](EventsApi.md#getEventMetric) | **GET** /api/events/{id}/metric/ | Get Event Metric |
| [**getEventProfile**](EventsApi.md#getEventProfile) | **GET** /api/events/{id}/profile/ | Get Event Profile |
| [**getEventRelationshipsMetric**](EventsApi.md#getEventRelationshipsMetric) | **GET** /api/events/{id}/relationships/metric/ | Get Event Relationships Metric |
| [**getEventRelationshipsProfile**](EventsApi.md#getEventRelationshipsProfile) | **GET** /api/events/{id}/relationships/profile/ | Get Event Relationships Profile |
| [**getEvents**](EventsApi.md#getEvents) | **GET** /api/events/ | Get Events |


<a id="bulkCreateEvents"></a>
# **bulkCreateEvents**
> bulkCreateEvents(revision, eventsBulkCreateJob)

Bulk Create Events

Create a batch of events for one or more profiles.  Note that this endpoint allows you to create new profiles or update existing profile properties.  At a minimum, profile and metric objects should include at least one profile identifier (e.g., &#x60;id&#x60;, &#x60;email&#x60;, or &#x60;phone_number&#x60;) and the metric &#x60;name&#x60;, respectively.  Accepts up to 1,000 events per request. The maximum allowed payload size is 5MB.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;events:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EventsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val eventsBulkCreateJob : EventsBulkCreateJob =  // EventsBulkCreateJob | 
try {
    apiInstance.bulkCreateEvents(revision, eventsBulkCreateJob)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#bulkCreateEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#bulkCreateEvents")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eventsBulkCreateJob** | [**EventsBulkCreateJob**](EventsBulkCreateJob.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createEvent"></a>
# **createEvent**
> createEvent(revision, eventCreateQueryV2)

Create Event

Create a new event to track a profile&#39;s activity.  Note that this endpoint allows you to create a new profile or update an existing profile&#39;s properties.  At a minimum, profile and metric objects should include at least one profile identifier (e.g., &#x60;id&#x60;, &#x60;email&#x60;, or &#x60;phone_number&#x60;) and the metric &#x60;name&#x60;, respectively.  Successful response indicates that the event was validated and submitted for processing, but does not guarantee that processing is complete.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;events:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EventsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val eventCreateQueryV2 : EventCreateQueryV2 =  // EventCreateQueryV2 | 
try {
    apiInstance.createEvent(revision, eventCreateQueryV2)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#createEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#createEvent")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eventCreateQueryV2** | [**EventCreateQueryV2**](EventCreateQueryV2.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getEvent"></a>
# **getEvent**
> GetEventResponseCompoundDocument getEvent(id, revision, fieldsEvent, fieldsMetric, fieldsProfile, include)

Get Event

Get an event with the given event ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;events:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EventsApi()
val id : kotlin.String = id_example // kotlin.String | ID of the event
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsEvent : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsMetric : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsProfile : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    val result : GetEventResponseCompoundDocument = apiInstance.getEvent(id, revision, fieldsEvent, fieldsMetric, fieldsProfile, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#getEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#getEvent")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| ID of the event | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsEvent** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: timestamp, event_properties, datetime, uuid] |
| **fieldsMetric** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, created, updated, integration] |
| **fieldsProfile** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: email, phone_number, external_id, first_name, last_name, organization, locale, title, image, created, updated, last_event_date, location, location.address1, location.address2, location.city, location.country, location.latitude, location.longitude, location.region, location.zip, location.timezone, location.ip, properties] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: attributions, metric, profile] |

### Return type

[**GetEventResponseCompoundDocument**](GetEventResponseCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEventMetric"></a>
# **getEventMetric**
> GetMetricResponseCollection getEventMetric(id, revision, fieldsMetric)

Get Event Metric

Get the metric for an event with the given event ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;events:read&#x60; &#x60;metrics:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EventsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsMetric : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetMetricResponseCollection = apiInstance.getEventMetric(id, revision, fieldsMetric)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#getEventMetric")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#getEventMetric")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsMetric** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, created, updated, integration] |

### Return type

[**GetMetricResponseCollection**](GetMetricResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEventProfile"></a>
# **getEventProfile**
> GetProfileResponseCollection getEventProfile(id, revision, additionalFieldsProfile, fieldsProfile)

Get Event Profile

Get the profile associated with an event with the given event ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;events:read&#x60; &#x60;profiles:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EventsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val additionalFieldsProfile : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Request additional fields not included by default in the response. Supported values: 'subscriptions', 'predictive_analytics'
val fieldsProfile : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetProfileResponseCollection = apiInstance.getEventProfile(id, revision, additionalFieldsProfile, fieldsProfile)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#getEventProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#getEventProfile")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **additionalFieldsProfile** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Request additional fields not included by default in the response. Supported values: &#39;subscriptions&#39;, &#39;predictive_analytics&#39; | [optional] [enum: subscriptions, predictive_analytics] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsProfile** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: email, phone_number, external_id, first_name, last_name, organization, locale, title, image, created, updated, last_event_date, location, location.address1, location.address2, location.city, location.country, location.latitude, location.longitude, location.region, location.zip, location.timezone, location.ip, properties, subscriptions, subscriptions.email, subscriptions.email.marketing, subscriptions.email.marketing.can_receive_email_marketing, subscriptions.email.marketing.consent, subscriptions.email.marketing.consent_timestamp, subscriptions.email.marketing.last_updated, subscriptions.email.marketing.method, subscriptions.email.marketing.method_detail, subscriptions.email.marketing.custom_method_detail, subscriptions.email.marketing.double_optin, subscriptions.email.marketing.suppression, subscriptions.email.marketing.list_suppressions, subscriptions.sms, subscriptions.sms.marketing, subscriptions.sms.marketing.can_receive_sms_marketing, subscriptions.sms.marketing.consent, subscriptions.sms.marketing.consent_timestamp, subscriptions.sms.marketing.method, subscriptions.sms.marketing.method_detail, subscriptions.sms.marketing.last_updated, subscriptions.mobile_push, subscriptions.mobile_push.marketing, subscriptions.mobile_push.marketing.can_receive_push_marketing, subscriptions.mobile_push.marketing.consent, subscriptions.mobile_push.marketing.consent_timestamp, predictive_analytics, predictive_analytics.historic_clv, predictive_analytics.predicted_clv, predictive_analytics.total_clv, predictive_analytics.historic_number_of_orders, predictive_analytics.predicted_number_of_orders, predictive_analytics.average_days_between_orders, predictive_analytics.average_order_value, predictive_analytics.churn_probability, predictive_analytics.expected_date_of_next_order] |

### Return type

[**GetProfileResponseCollection**](GetProfileResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEventRelationshipsMetric"></a>
# **getEventRelationshipsMetric**
> GetEventMetricsRelationshipListResponse getEventRelationshipsMetric(id, revision)

Get Event Relationships Metric

Get a list of related Metrics for an Event&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;events:read&#x60; &#x60;metrics:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EventsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetEventMetricsRelationshipListResponse = apiInstance.getEventRelationshipsMetric(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#getEventRelationshipsMetric")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#getEventRelationshipsMetric")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetEventMetricsRelationshipListResponse**](GetEventMetricsRelationshipListResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEventRelationshipsProfile"></a>
# **getEventRelationshipsProfile**
> GetEventProfilesRelationshipListResponse getEventRelationshipsProfile(id, revision)

Get Event Relationships Profile

Get profile [relationships](https://developers.klaviyo.com/en/reference/api_overview#relationships) for an event with the given event ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;events:read&#x60; &#x60;profiles:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EventsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetEventProfilesRelationshipListResponse = apiInstance.getEventRelationshipsProfile(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#getEventRelationshipsProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#getEventRelationshipsProfile")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetEventProfilesRelationshipListResponse**](GetEventProfilesRelationshipListResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEvents"></a>
# **getEvents**
> GetEventResponseCollectionCompoundDocument getEvents(revision, fieldsEvent, fieldsMetric, fieldsProfile, filter, include, pageCursor, sort)

Get Events

Get all events in an account  Requests can be sorted by the following fields: &#x60;datetime&#x60;, &#x60;timestamp&#x60;  Returns a maximum of 200 events per page.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;events:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EventsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsEvent : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsMetric : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsProfile : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`metric_id`: `equals`<br>`profile_id`: `equals`<br>`profile`: `has`<br>`datetime`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`timestamp`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetEventResponseCollectionCompoundDocument = apiInstance.getEvents(revision, fieldsEvent, fieldsMetric, fieldsProfile, filter, include, pageCursor, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#getEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#getEvents")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsEvent** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: timestamp, event_properties, datetime, uuid] |
| **fieldsMetric** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, created, updated, integration] |
| **fieldsProfile** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: email, phone_number, external_id, first_name, last_name, organization, locale, title, image, created, updated, last_event_date, location, location.address1, location.address2, location.city, location.country, location.latitude, location.longitude, location.region, location.zip, location.timezone, location.ip, properties] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;metric_id&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;profile_id&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;profile&#x60;: &#x60;has&#x60;&lt;br&gt;&#x60;datetime&#x60;: &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;timestamp&#x60;: &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60; | [optional] |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: attributions, metric, profile] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: datetime, -datetime, timestamp, -timestamp] |

### Return type

[**GetEventResponseCollectionCompoundDocument**](GetEventResponseCollectionCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

