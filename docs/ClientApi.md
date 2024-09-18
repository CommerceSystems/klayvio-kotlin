# ClientApi

All URIs are relative to *https://a.klaviyo.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**bulkCreateClientEvents**](ClientApi.md#bulkCreateClientEvents) | **POST** /client/event-bulk-create/ | Bulk Create Client Events |
| [**createClientBackInStockSubscription**](ClientApi.md#createClientBackInStockSubscription) | **POST** /client/back-in-stock-subscriptions/ | Create Client Back In Stock Subscription |
| [**createClientEvent**](ClientApi.md#createClientEvent) | **POST** /client/events/ | Create Client Event |
| [**createClientProfile**](ClientApi.md#createClientProfile) | **POST** /client/profiles/ | Create or Update Client Profile |
| [**createClientPushToken**](ClientApi.md#createClientPushToken) | **POST** /client/push-tokens/ | Create or Update Client Push Token |
| [**createClientSubscription**](ClientApi.md#createClientSubscription) | **POST** /client/subscriptions/ | Create Client Subscription |
| [**unregisterClientPushToken**](ClientApi.md#unregisterClientPushToken) | **POST** /client/push-token-unregister/ | Unregister Client Push Token |


<a id="bulkCreateClientEvents"></a>
# **bulkCreateClientEvents**
> bulkCreateClientEvents(companyId, revision, eventsBulkCreateQuery)

Bulk Create Client Events

Create new events to track a profile&#39;s activity.  This endpoint is specifically designed to be called from publicly-browseable, client-side environments only and requires a [public API key (site ID)](https://www.klaviyo.com/settings/account/api-keys). Never use a private API key with our client-side endpoints.  To create events from server-side applications, please use [POST /api/event-bulk-create-jobs](https://developers.klaviyo.com/en/reference/bulk_create_events).  Accepts a maximum of &#x60;1000&#x60; events per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;events:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ClientApi()
val companyId : kotlin.String = PUBLIC_API_KEY // kotlin.String | Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val eventsBulkCreateQuery : EventsBulkCreateQuery =  // EventsBulkCreateQuery | 
try {
    apiInstance.bulkCreateClientEvents(companyId, revision, eventsBulkCreateQuery)
} catch (e: ClientException) {
    println("4xx response calling ClientApi#bulkCreateClientEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientApi#bulkCreateClientEvents")
    e.printStackTrace()
}
```

### Parameters
| **companyId** | **kotlin.String**| Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eventsBulkCreateQuery** | [**EventsBulkCreateQuery**](EventsBulkCreateQuery.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createClientBackInStockSubscription"></a>
# **createClientBackInStockSubscription**
> createClientBackInStockSubscription(companyId, revision, clientBISSubscriptionCreateQuery)

Create Client Back In Stock Subscription

Subscribe a profile to receive back in stock notifications. Check out [our Back in Stock API guide](https://developers.klaviyo.com/en/docs/how_to_set_up_custom_back_in_stock) for more details.  This endpoint is specifically designed to be called from publicly-browseable, client-side environments only and requires a [public API key (site ID)](https://www.klaviyo.com/settings/account/api-keys). Never use a private API key with our client-side endpoints.  To create back in stock subscriptions from server-side applications, please use [POST /api/back-in-stock-subscriptions](https://developers.klaviyo.com/en/reference/create_back_in_stock_subscription).&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60; &#x60;profiles:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ClientApi()
val companyId : kotlin.String = PUBLIC_API_KEY // kotlin.String | Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val clientBISSubscriptionCreateQuery : ClientBISSubscriptionCreateQuery =  // ClientBISSubscriptionCreateQuery | 
try {
    apiInstance.createClientBackInStockSubscription(companyId, revision, clientBISSubscriptionCreateQuery)
} catch (e: ClientException) {
    println("4xx response calling ClientApi#createClientBackInStockSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientApi#createClientBackInStockSubscription")
    e.printStackTrace()
}
```

### Parameters
| **companyId** | **kotlin.String**| Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientBISSubscriptionCreateQuery** | [**ClientBISSubscriptionCreateQuery**](ClientBISSubscriptionCreateQuery.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createClientEvent"></a>
# **createClientEvent**
> createClientEvent(companyId, revision, eventCreateQueryV2)

Create Client Event

Create a new event to track a profile&#39;s activity.  This endpoint is specifically designed to be called from publicly-browseable, client-side environments only and requires a [public API key (site ID)](https://www.klaviyo.com/settings/account/api-keys). Never use a private API key with our client-side endpoints.  To create events from server-side applications, please use [POST /api/events](https://developers.klaviyo.com/en/reference/create_event).  Note that to update a profile&#39;s existing identifiers (e.g., email), you must use a server-side endpoint authenticated by a private API key. Attempts to do so via client-side endpoints will return a 202, however the identifier field(s) will not be updated.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;events:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ClientApi()
val companyId : kotlin.String = PUBLIC_API_KEY // kotlin.String | Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val eventCreateQueryV2 : EventCreateQueryV2 =  // EventCreateQueryV2 | 
try {
    apiInstance.createClientEvent(companyId, revision, eventCreateQueryV2)
} catch (e: ClientException) {
    println("4xx response calling ClientApi#createClientEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientApi#createClientEvent")
    e.printStackTrace()
}
```

### Parameters
| **companyId** | **kotlin.String**| Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eventCreateQueryV2** | [**EventCreateQueryV2**](EventCreateQueryV2.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createClientProfile"></a>
# **createClientProfile**
> createClientProfile(companyId, revision, onsiteProfileCreateQuery)

Create or Update Client Profile

Create or update properties about a profile without tracking an associated event.  This endpoint is specifically designed to be called from publicly-browseable, client-side environments only and requires a [public API key (site ID)](https://www.klaviyo.com/settings/account/api-keys). Never use a private API key with our client-side endpoints.  To create or update profiles from server-side applications, please use [POST /api/profile-import](https://developers.klaviyo.com/en/reference/create_or_update_profile).  Note that to update a profile&#39;s existing identifiers (e.g., email), you must use a server-side endpoint authenticated by a private API key. Attempts to do so via client-side endpoints will return a 202, however the identifier field(s) will not be updated.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;profiles:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ClientApi()
val companyId : kotlin.String = PUBLIC_API_KEY // kotlin.String | Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val onsiteProfileCreateQuery : OnsiteProfileCreateQuery =  // OnsiteProfileCreateQuery | 
try {
    apiInstance.createClientProfile(companyId, revision, onsiteProfileCreateQuery)
} catch (e: ClientException) {
    println("4xx response calling ClientApi#createClientProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientApi#createClientProfile")
    e.printStackTrace()
}
```

### Parameters
| **companyId** | **kotlin.String**| Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **onsiteProfileCreateQuery** | [**OnsiteProfileCreateQuery**](OnsiteProfileCreateQuery.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createClientPushToken"></a>
# **createClientPushToken**
> createClientPushToken(companyId, revision, pushTokenCreateQuery)

Create or Update Client Push Token

Create or update a push token.  This endpoint is specifically designed to be called from our mobile SDKs ([iOS](https://github.com/klaviyo/klaviyo-swift-sdk) and [Android](https://github.com/klaviyo/klaviyo-android-sdk)) and requires a [public API key (site ID)](https://www.klaviyo.com/settings/account/api-keys). Never use a private API key with our client-side endpoints. You must have push notifications enabled to use this endpoint.  To migrate push tokens from another platform to Klaviyo, please use our server-side [POST /api/push-tokens](https://developers.klaviyo.com/en/reference/create_push_token) endpoint instead.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ClientApi()
val companyId : kotlin.String = PUBLIC_API_KEY // kotlin.String | Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val pushTokenCreateQuery : PushTokenCreateQuery =  // PushTokenCreateQuery | 
try {
    apiInstance.createClientPushToken(companyId, revision, pushTokenCreateQuery)
} catch (e: ClientException) {
    println("4xx response calling ClientApi#createClientPushToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientApi#createClientPushToken")
    e.printStackTrace()
}
```

### Parameters
| **companyId** | **kotlin.String**| Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pushTokenCreateQuery** | [**PushTokenCreateQuery**](PushTokenCreateQuery.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createClientSubscription"></a>
# **createClientSubscription**
> createClientSubscription(companyId, revision, onsiteSubscriptionCreateQuery)

Create Client Subscription

Creates a subscription and consent record for email and/or SMS channels based on the provided &#x60;email&#x60; and &#x60;phone_number&#x60; attributes, respectively. One of either &#x60;email&#x60; or &#x60;phone_number&#x60; must be provided.  This endpoint is specifically designed to be called from publicly-browseable, client-side environments only and requires a [public API key (site ID)](https://www.klaviyo.com/settings/account/api-keys). Never use a private API key with our client-side endpoints.  To subscribe profiles from server-side applications, please use [POST /api/profile-subscription-bulk-create-jobs](https://developers.klaviyo.com/en/reference/subscribe_profiles).  To create a subscription and consent record for only 1 channel but still include the other channel as a profile property, the consent channel can be provided as a top-level attribute and the other channel can be included in the properties object.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;100/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;subscriptions:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ClientApi()
val companyId : kotlin.String = PUBLIC_API_KEY // kotlin.String | Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val onsiteSubscriptionCreateQuery : OnsiteSubscriptionCreateQuery =  // OnsiteSubscriptionCreateQuery | 
try {
    apiInstance.createClientSubscription(companyId, revision, onsiteSubscriptionCreateQuery)
} catch (e: ClientException) {
    println("4xx response calling ClientApi#createClientSubscription")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientApi#createClientSubscription")
    e.printStackTrace()
}
```

### Parameters
| **companyId** | **kotlin.String**| Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **onsiteSubscriptionCreateQuery** | [**OnsiteSubscriptionCreateQuery**](OnsiteSubscriptionCreateQuery.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="unregisterClientPushToken"></a>
# **unregisterClientPushToken**
> unregisterClientPushToken(companyId, revision, pushTokenUnregisterQuery)

Unregister Client Push Token

Unregister a push token.  This endpoint is specifically designed to be called from our mobile SDKs ([iOS](https://github.com/klaviyo/klaviyo-swift-sdk) and [Android](https://github.com/klaviyo/klaviyo-android-sdk)) and requires a [public API key (site ID)](https://www.klaviyo.com/settings/account/api-keys). Never use a private API key with our client-side endpoints. You must have push notifications enabled to use this endpoint.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ClientApi()
val companyId : kotlin.String = PUBLIC_API_KEY // kotlin.String | Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val pushTokenUnregisterQuery : PushTokenUnregisterQuery =  // PushTokenUnregisterQuery | 
try {
    apiInstance.unregisterClientPushToken(companyId, revision, pushTokenUnregisterQuery)
} catch (e: ClientException) {
    println("4xx response calling ClientApi#unregisterClientPushToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ClientApi#unregisterClientPushToken")
    e.printStackTrace()
}
```

### Parameters
| **companyId** | **kotlin.String**| Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pushTokenUnregisterQuery** | [**PushTokenUnregisterQuery**](PushTokenUnregisterQuery.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

