# WebhooksApi

All URIs are relative to *https://a.klaviyo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebhook**](WebhooksApi.md#createWebhook) | **POST** /api/webhooks/ | Create Webhook
[**deleteWebhook**](WebhooksApi.md#deleteWebhook) | **DELETE** /api/webhooks/{id}/ | Delete Webhook
[**getWebhook**](WebhooksApi.md#getWebhook) | **GET** /api/webhooks/{id}/ | Get Webhook
[**getWebhookTopic**](WebhooksApi.md#getWebhookTopic) | **GET** /api/webhook-topics/{id}/ | Get Webhook Topic
[**getWebhookTopics**](WebhooksApi.md#getWebhookTopics) | **GET** /api/webhook-topics/ | Get Webhook Topics
[**getWebhooks**](WebhooksApi.md#getWebhooks) | **GET** /api/webhooks/ | Get Webhooks
[**updateWebhook**](WebhooksApi.md#updateWebhook) | **PATCH** /api/webhooks/{id}/ | Update Webhook

<a name="createWebhook"></a>
# **createWebhook**
> PostWebhookResponse createWebhook(body, revision)

Create Webhook

Create a new Webhook&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;  **Scopes:** &#x60;webhooks:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
WebhookCreateQuery body = new WebhookCreateQuery(); // WebhookCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostWebhookResponse result = apiInstance.createWebhook(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#createWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WebhookCreateQuery**](WebhookCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostWebhookResponse**](PostWebhookResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWebhook"></a>
# **deleteWebhook**
> deleteWebhook(id, revision)

Delete Webhook

Delete a webhook with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;  **Scopes:** &#x60;webhooks:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
String id = "id_example"; // String | The ID of the webhook.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.deleteWebhook(id, revision);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#deleteWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the webhook. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWebhook"></a>
# **getWebhook**
> GetWebhookResponseCompoundDocument getWebhook(id, revision, fieldsWebhook, include)

Get Webhook

Get the webhook with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;  **Scopes:** &#x60;webhooks:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
String id = "id_example"; // String | The ID of the webhook.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsWebhook = Arrays.asList("fieldsWebhook_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    GetWebhookResponseCompoundDocument result = apiInstance.getWebhook(id, revision, fieldsWebhook, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the webhook. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsWebhook** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, description, endpoint_url, enabled, created_at, updated_at]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: webhook-topics]

### Return type

[**GetWebhookResponseCompoundDocument**](GetWebhookResponseCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWebhookTopic"></a>
# **getWebhookTopic**
> GetWebhookTopicResponse getWebhookTopic(id, revision)

Get Webhook Topic

Get the webhook topic with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;  **Scopes:** &#x60;webhooks:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
String id = "id_example"; // String | The ID of the webhook topic.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    GetWebhookTopicResponse result = apiInstance.getWebhookTopic(id, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhookTopic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the webhook topic. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**GetWebhookTopicResponse**](GetWebhookTopicResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWebhookTopics"></a>
# **getWebhookTopics**
> GetWebhookTopicResponseCollection getWebhookTopics(revision)

Get Webhook Topics

Get all webhook topics in a Klaviyo account.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;  **Scopes:** &#x60;webhooks:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    GetWebhookTopicResponseCollection result = apiInstance.getWebhookTopics(revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhookTopics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**GetWebhookTopicResponseCollection**](GetWebhookTopicResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWebhooks"></a>
# **getWebhooks**
> GetWebhookResponseCollectionCompoundDocument getWebhooks(revision, fieldsWebhook, include)

Get Webhooks

Get all webhooks in an account.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;  **Scopes:** &#x60;webhooks:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsWebhook = Arrays.asList("fieldsWebhook_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    GetWebhookResponseCollectionCompoundDocument result = apiInstance.getWebhooks(revision, fieldsWebhook, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#getWebhooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsWebhook** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, description, endpoint_url, enabled, created_at, updated_at]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: webhook-topics]

### Return type

[**GetWebhookResponseCollectionCompoundDocument**](GetWebhookResponseCollectionCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWebhook"></a>
# **updateWebhook**
> PatchWebhookResponse updateWebhook(body, revision, id)

Update Webhook

Update the webhook with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;  **Scopes:** &#x60;webhooks:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
WebhookPartialUpdateQuery body = new WebhookPartialUpdateQuery(); // WebhookPartialUpdateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | The ID of the webhook.
try {
    PatchWebhookResponse result = apiInstance.updateWebhook(body, revision, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#updateWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WebhookPartialUpdateQuery**](WebhookPartialUpdateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**| The ID of the webhook. |

### Return type

[**PatchWebhookResponse**](PatchWebhookResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

