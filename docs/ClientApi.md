# ClientApi

All URIs are relative to *https://a.klaviyo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkCreateClientEvents**](ClientApi.md#bulkCreateClientEvents) | **POST** /client/event-bulk-create/ | Bulk Create Client Events
[**createClientBackInStockSubscription**](ClientApi.md#createClientBackInStockSubscription) | **POST** /client/back-in-stock-subscriptions/ | Create Client Back In Stock Subscription
[**createClientEvent**](ClientApi.md#createClientEvent) | **POST** /client/events/ | Create Client Event
[**createClientProfile**](ClientApi.md#createClientProfile) | **POST** /client/profiles/ | Create or Update Client Profile
[**createClientPushToken**](ClientApi.md#createClientPushToken) | **POST** /client/push-tokens/ | Create or Update Client Push Token
[**createClientSubscription**](ClientApi.md#createClientSubscription) | **POST** /client/subscriptions/ | Create Client Subscription
[**unregisterClientPushToken**](ClientApi.md#unregisterClientPushToken) | **POST** /client/push-token-unregister/ | Unregister Client Push Token

<a name="bulkCreateClientEvents"></a>
# **bulkCreateClientEvents**
> bulkCreateClientEvents(body, revision, companyId)

Bulk Create Client Events

Create new events to track a profile&#x27;s activity.  This endpoint is specifically designed to be called from publicly-browseable, client-side environments only and requires a [public API key (site ID)](https://www.klaviyo.com/settings/account/api-keys). Never use a private API key with our client-side endpoints.  To create events from server-side applications, please use [POST /api/event-bulk-create-jobs](https://developers.klaviyo.com/en/reference/bulk_create_events).  Accepts a maximum of &#x60;1000&#x60; events per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;events:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientApi;


ClientApi apiInstance = new ClientApi();
EventsBulkCreateQuery body = new EventsBulkCreateQuery(); // EventsBulkCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String companyId = "companyId_example"; // String | Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details.
try {
    apiInstance.bulkCreateClientEvents(body, revision, companyId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#bulkCreateClientEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EventsBulkCreateQuery**](EventsBulkCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **companyId** | **String**| Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClientBackInStockSubscription"></a>
# **createClientBackInStockSubscription**
> createClientBackInStockSubscription(body, revision, companyId)

Create Client Back In Stock Subscription

Subscribe a profile to receive back in stock notifications. Check out [our Back in Stock API guide](https://developers.klaviyo.com/en/docs/how_to_set_up_custom_back_in_stock) for more details.  This endpoint is specifically designed to be called from publicly-browseable, client-side environments only and requires a [public API key (site ID)](https://www.klaviyo.com/settings/account/api-keys). Never use a private API key with our client-side endpoints.  To create back in stock subscriptions from server-side applications, please use [POST /api/back-in-stock-subscriptions](https://developers.klaviyo.com/en/reference/create_back_in_stock_subscription).&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;catalogs:write&#x60; &#x60;profiles:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientApi;


ClientApi apiInstance = new ClientApi();
ClientBISSubscriptionCreateQuery body = new ClientBISSubscriptionCreateQuery(); // ClientBISSubscriptionCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String companyId = "companyId_example"; // String | Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details.
try {
    apiInstance.createClientBackInStockSubscription(body, revision, companyId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#createClientBackInStockSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClientBISSubscriptionCreateQuery**](ClientBISSubscriptionCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **companyId** | **String**| Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClientEvent"></a>
# **createClientEvent**
> createClientEvent(body, revision, companyId)

Create Client Event

Create a new event to track a profile&#x27;s activity.  This endpoint is specifically designed to be called from publicly-browseable, client-side environments only and requires a [public API key (site ID)](https://www.klaviyo.com/settings/account/api-keys). Never use a private API key with our client-side endpoints.  To create events from server-side applications, please use [POST /api/events](https://developers.klaviyo.com/en/reference/create_event).  Note that to update a profile&#x27;s existing identifiers (e.g., email), you must use a server-side endpoint authenticated by a private API key. Attempts to do so via client-side endpoints will return a 202, however the identifier field(s) will not be updated.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;events:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientApi;


ClientApi apiInstance = new ClientApi();
EventCreateQueryV2 body = new EventCreateQueryV2(); // EventCreateQueryV2 | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String companyId = "companyId_example"; // String | Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details.
try {
    apiInstance.createClientEvent(body, revision, companyId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#createClientEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EventCreateQueryV2**](EventCreateQueryV2.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **companyId** | **String**| Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClientProfile"></a>
# **createClientProfile**
> createClientProfile(body, revision, companyId)

Create or Update Client Profile

Create or update properties about a profile without tracking an associated event.  This endpoint is specifically designed to be called from publicly-browseable, client-side environments only and requires a [public API key (site ID)](https://www.klaviyo.com/settings/account/api-keys). Never use a private API key with our client-side endpoints.  To create or update profiles from server-side applications, please use [POST /api/profile-import](https://developers.klaviyo.com/en/reference/create_or_update_profile).  Note that to update a profile&#x27;s existing identifiers (e.g., email), you must use a server-side endpoint authenticated by a private API key. Attempts to do so via client-side endpoints will return a 202, however the identifier field(s) will not be updated.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;350/s&#x60;&lt;br&gt;Steady: &#x60;3500/m&#x60;  **Scopes:** &#x60;profiles:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientApi;


ClientApi apiInstance = new ClientApi();
OnsiteProfileCreateQuery body = new OnsiteProfileCreateQuery(); // OnsiteProfileCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String companyId = "companyId_example"; // String | Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details.
try {
    apiInstance.createClientProfile(body, revision, companyId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#createClientProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OnsiteProfileCreateQuery**](OnsiteProfileCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **companyId** | **String**| Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClientPushToken"></a>
# **createClientPushToken**
> createClientPushToken(body, revision, companyId)

Create or Update Client Push Token

Create or update a push token.  This endpoint is specifically designed to be called from our mobile SDKs ([iOS](https://github.com/klaviyo/klaviyo-swift-sdk) and [Android](https://github.com/klaviyo/klaviyo-android-sdk)) and requires a [public API key (site ID)](https://www.klaviyo.com/settings/account/api-keys). Never use a private API key with our client-side endpoints. You must have push notifications enabled to use this endpoint.  To migrate push tokens from another platform to Klaviyo, please use our server-side [POST /api/push-tokens](https://developers.klaviyo.com/en/reference/create_push_token) endpoint instead.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientApi;


ClientApi apiInstance = new ClientApi();
PushTokenCreateQuery body = new PushTokenCreateQuery(); // PushTokenCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String companyId = "companyId_example"; // String | Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details.
try {
    apiInstance.createClientPushToken(body, revision, companyId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#createClientPushToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PushTokenCreateQuery**](PushTokenCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **companyId** | **String**| Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClientSubscription"></a>
# **createClientSubscription**
> createClientSubscription(body, revision, companyId)

Create Client Subscription

Creates a subscription and consent record for email and/or SMS channels based on the provided &#x60;email&#x60; and &#x60;phone_number&#x60; attributes, respectively. One of either &#x60;email&#x60; or &#x60;phone_number&#x60; must be provided.  This endpoint is specifically designed to be called from publicly-browseable, client-side environments only and requires a [public API key (site ID)](https://www.klaviyo.com/settings/account/api-keys). Never use a private API key with our client-side endpoints.  To subscribe profiles from server-side applications, please use [POST /api/profile-subscription-bulk-create-jobs](https://developers.klaviyo.com/en/reference/subscribe_profiles).  To create a subscription and consent record for only 1 channel but still include the other channel as a profile property, the consent channel can be provided as a top-level attribute and the other channel can be included in the properties object.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;100/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;subscriptions:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientApi;


ClientApi apiInstance = new ClientApi();
OnsiteSubscriptionCreateQuery body = new OnsiteSubscriptionCreateQuery(); // OnsiteSubscriptionCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String companyId = "companyId_example"; // String | Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details.
try {
    apiInstance.createClientSubscription(body, revision, companyId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#createClientSubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OnsiteSubscriptionCreateQuery**](OnsiteSubscriptionCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **companyId** | **String**| Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="unregisterClientPushToken"></a>
# **unregisterClientPushToken**
> unregisterClientPushToken(body, revision, companyId)

Unregister Client Push Token

Unregister a push token.  This endpoint is specifically designed to be called from our mobile SDKs ([iOS](https://github.com/klaviyo/klaviyo-swift-sdk) and [Android](https://github.com/klaviyo/klaviyo-android-sdk)) and requires a [public API key (site ID)](https://www.klaviyo.com/settings/account/api-keys). Never use a private API key with our client-side endpoints. You must have push notifications enabled to use this endpoint.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClientApi;


ClientApi apiInstance = new ClientApi();
PushTokenUnregisterQuery body = new PushTokenUnregisterQuery(); // PushTokenUnregisterQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String companyId = "companyId_example"; // String | Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details.
try {
    apiInstance.unregisterClientPushToken(body, revision, companyId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#unregisterClientPushToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PushTokenUnregisterQuery**](PushTokenUnregisterQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **companyId** | **String**| Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

