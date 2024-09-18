# WebhooksApi

All URIs are relative to *https://a.klaviyo.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createWebhook**](WebhooksApi.md#createWebhook) | **POST** /api/webhooks/ | Create Webhook |
| [**deleteWebhook**](WebhooksApi.md#deleteWebhook) | **DELETE** /api/webhooks/{id}/ | Delete Webhook |
| [**getWebhook**](WebhooksApi.md#getWebhook) | **GET** /api/webhooks/{id}/ | Get Webhook |
| [**getWebhookTopic**](WebhooksApi.md#getWebhookTopic) | **GET** /api/webhook-topics/{id}/ | Get Webhook Topic |
| [**getWebhookTopics**](WebhooksApi.md#getWebhookTopics) | **GET** /api/webhook-topics/ | Get Webhook Topics |
| [**getWebhooks**](WebhooksApi.md#getWebhooks) | **GET** /api/webhooks/ | Get Webhooks |
| [**updateWebhook**](WebhooksApi.md#updateWebhook) | **PATCH** /api/webhooks/{id}/ | Update Webhook |


<a id="createWebhook"></a>
# **createWebhook**
> PostWebhookResponse createWebhook(revision, webhookCreateQuery)

Create Webhook

Create a new Webhook&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;  **Scopes:** &#x60;webhooks:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebhooksApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val webhookCreateQuery : WebhookCreateQuery =  // WebhookCreateQuery | 
try {
    val result : PostWebhookResponse = apiInstance.createWebhook(revision, webhookCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#createWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#createWebhook")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webhookCreateQuery** | [**WebhookCreateQuery**](WebhookCreateQuery.md)|  | |

### Return type

[**PostWebhookResponse**](PostWebhookResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteWebhook"></a>
# **deleteWebhook**
> deleteWebhook(id, revision)

Delete Webhook

Delete a webhook with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;  **Scopes:** &#x60;webhooks:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebhooksApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the webhook.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.deleteWebhook(id, revision)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#deleteWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#deleteWebhook")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The ID of the webhook. | |
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

<a id="getWebhook"></a>
# **getWebhook**
> GetWebhookResponseCompoundDocument getWebhook(id, revision, fieldsWebhook, include)

Get Webhook

Get the webhook with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;  **Scopes:** &#x60;webhooks:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebhooksApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the webhook.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsWebhook : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    val result : GetWebhookResponseCompoundDocument = apiInstance.getWebhook(id, revision, fieldsWebhook, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#getWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#getWebhook")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The ID of the webhook. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsWebhook** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, description, endpoint_url, enabled, created_at, updated_at] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: webhook-topics] |

### Return type

[**GetWebhookResponseCompoundDocument**](GetWebhookResponseCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWebhookTopic"></a>
# **getWebhookTopic**
> GetWebhookTopicResponse getWebhookTopic(id, revision)

Get Webhook Topic

Get the webhook topic with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;  **Scopes:** &#x60;webhooks:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebhooksApi()
val id : kotlin.String = event:klaviyo.sent_sms // kotlin.String | The ID of the webhook topic.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetWebhookTopicResponse = apiInstance.getWebhookTopic(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#getWebhookTopic")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#getWebhookTopic")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The ID of the webhook topic. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetWebhookTopicResponse**](GetWebhookTopicResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWebhookTopics"></a>
# **getWebhookTopics**
> GetWebhookTopicResponseCollection getWebhookTopics(revision)

Get Webhook Topics

Get all webhook topics in a Klaviyo account.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;  **Scopes:** &#x60;webhooks:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebhooksApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetWebhookTopicResponseCollection = apiInstance.getWebhookTopics(revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#getWebhookTopics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#getWebhookTopics")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetWebhookTopicResponseCollection**](GetWebhookTopicResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWebhooks"></a>
# **getWebhooks**
> GetWebhookResponseCollectionCompoundDocument getWebhooks(revision, fieldsWebhook, include)

Get Webhooks

Get all webhooks in an account.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;  **Scopes:** &#x60;webhooks:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebhooksApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsWebhook : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    val result : GetWebhookResponseCollectionCompoundDocument = apiInstance.getWebhooks(revision, fieldsWebhook, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#getWebhooks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#getWebhooks")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsWebhook** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, description, endpoint_url, enabled, created_at, updated_at] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: webhook-topics] |

### Return type

[**GetWebhookResponseCollectionCompoundDocument**](GetWebhookResponseCollectionCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateWebhook"></a>
# **updateWebhook**
> PatchWebhookResponse updateWebhook(id, revision, webhookPartialUpdateQuery)

Update Webhook

Update the webhook with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;  **Scopes:** &#x60;webhooks:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebhooksApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the webhook.
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val webhookPartialUpdateQuery : WebhookPartialUpdateQuery =  // WebhookPartialUpdateQuery | 
try {
    val result : PatchWebhookResponse = apiInstance.updateWebhook(id, revision, webhookPartialUpdateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#updateWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#updateWebhook")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The ID of the webhook. | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webhookPartialUpdateQuery** | [**WebhookPartialUpdateQuery**](WebhookPartialUpdateQuery.md)|  | |

### Return type

[**PatchWebhookResponse**](PatchWebhookResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

