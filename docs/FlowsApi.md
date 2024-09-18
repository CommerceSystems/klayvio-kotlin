# FlowsApi

All URIs are relative to *https://a.klaviyo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteFlow**](FlowsApi.md#deleteFlow) | **DELETE** /api/flows/{id}/ | Delete Flow
[**getFlow**](FlowsApi.md#getFlow) | **GET** /api/flows/{id}/ | Get Flow
[**getFlowAction**](FlowsApi.md#getFlowAction) | **GET** /api/flow-actions/{id}/ | Get Flow Action
[**getFlowActionFlow**](FlowsApi.md#getFlowActionFlow) | **GET** /api/flow-actions/{id}/flow/ | Get Flow For Flow Action
[**getFlowActionMessages**](FlowsApi.md#getFlowActionMessages) | **GET** /api/flow-actions/{id}/flow-messages/ | Get Flow Action Messages
[**getFlowActionRelationshipsFlow**](FlowsApi.md#getFlowActionRelationshipsFlow) | **GET** /api/flow-actions/{id}/relationships/flow/ | Get Flow Action Relationships Flow
[**getFlowActionRelationshipsMessages**](FlowsApi.md#getFlowActionRelationshipsMessages) | **GET** /api/flow-actions/{id}/relationships/flow-messages/ | Get Flow Action Relationships Messages
[**getFlowFlowActions**](FlowsApi.md#getFlowFlowActions) | **GET** /api/flows/{id}/flow-actions/ | Get Flow Flow Actions
[**getFlowMessage**](FlowsApi.md#getFlowMessage) | **GET** /api/flow-messages/{id}/ | Get Flow Message
[**getFlowMessageAction**](FlowsApi.md#getFlowMessageAction) | **GET** /api/flow-messages/{id}/flow-action/ | Get Flow Action For Message
[**getFlowMessageRelationshipsAction**](FlowsApi.md#getFlowMessageRelationshipsAction) | **GET** /api/flow-messages/{id}/relationships/flow-action/ | Get Flow Message Relationships Action
[**getFlowMessageRelationshipsTemplate**](FlowsApi.md#getFlowMessageRelationshipsTemplate) | **GET** /api/flow-messages/{id}/relationships/template/ | Get Flow Message Relationships Template
[**getFlowMessageTemplate**](FlowsApi.md#getFlowMessageTemplate) | **GET** /api/flow-messages/{id}/template/ | Get Flow Message Template
[**getFlowRelationshipsFlowActions**](FlowsApi.md#getFlowRelationshipsFlowActions) | **GET** /api/flows/{id}/relationships/flow-actions/ | Get Flow Relationships Flow Actions
[**getFlowRelationshipsTags**](FlowsApi.md#getFlowRelationshipsTags) | **GET** /api/flows/{id}/relationships/tags/ | Get Flow Relationships Tags
[**getFlowTags**](FlowsApi.md#getFlowTags) | **GET** /api/flows/{id}/tags/ | Get Flow Tags
[**getFlows**](FlowsApi.md#getFlows) | **GET** /api/flows/ | Get Flows
[**updateFlow**](FlowsApi.md#updateFlow) | **PATCH** /api/flows/{id}/ | Update Flow Status

<a name="deleteFlow"></a>
# **deleteFlow**
> deleteFlow(id, revision)

Delete Flow

Delete a flow with the given flow ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

FlowsApi apiInstance = new FlowsApi();
String id = "id_example"; // String | ID of the Flow to delete. Ex: XVTP5Q
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.deleteFlow(id, revision);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#deleteFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Flow to delete. Ex: XVTP5Q |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlow"></a>
# **getFlow**
> GetFlowResponseCompoundDocument getFlow(id, revision, fieldsFlowAction, fieldsFlow, fieldsTag, include)

Get Flow

Get a flow with the given flow ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

FlowsApi apiInstance = new FlowsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsFlowAction = Arrays.asList("fieldsFlowAction_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsFlow = Arrays.asList("fieldsFlow_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsTag = Arrays.asList("fieldsTag_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    GetFlowResponseCompoundDocument result = apiInstance.getFlow(id, revision, fieldsFlowAction, fieldsFlow, fieldsTag, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#getFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsFlowAction** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: action_type, status, created, updated, settings, tracking_options, send_options, send_options.use_smart_sending, send_options.is_transactional, render_options, render_options.shorten_links, render_options.add_org_prefix, render_options.add_info_link, render_options.add_opt_out_language]
 **fieldsFlow** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, status, archived, created, updated, trigger_type]
 **fieldsTag** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: flow-actions, tags]

### Return type

[**GetFlowResponseCompoundDocument**](GetFlowResponseCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlowAction"></a>
# **getFlowAction**
> GetFlowActionResponseCompoundDocument getFlowAction(id, revision, fieldsFlowAction, fieldsFlowMessage, fieldsFlow, include)

Get Flow Action

Get a flow action from a flow with the given flow action ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

FlowsApi apiInstance = new FlowsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsFlowAction = Arrays.asList("fieldsFlowAction_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsFlowMessage = Arrays.asList("fieldsFlowMessage_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsFlow = Arrays.asList("fieldsFlow_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    GetFlowActionResponseCompoundDocument result = apiInstance.getFlowAction(id, revision, fieldsFlowAction, fieldsFlowMessage, fieldsFlow, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#getFlowAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsFlowAction** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: action_type, status, created, updated, settings, tracking_options, send_options, send_options.use_smart_sending, send_options.is_transactional, render_options, render_options.shorten_links, render_options.add_org_prefix, render_options.add_info_link, render_options.add_opt_out_language]
 **fieldsFlowMessage** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, channel, content, created, updated]
 **fieldsFlow** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, status, archived, created, updated, trigger_type]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: flow, flow-messages]

### Return type

[**GetFlowActionResponseCompoundDocument**](GetFlowActionResponseCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlowActionFlow"></a>
# **getFlowActionFlow**
> GetFlowResponse getFlowActionFlow(id, revision, fieldsFlow)

Get Flow For Flow Action

Get the flow associated with the given action ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

FlowsApi apiInstance = new FlowsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsFlow = Arrays.asList("fieldsFlow_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetFlowResponse result = apiInstance.getFlowActionFlow(id, revision, fieldsFlow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#getFlowActionFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsFlow** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, status, archived, created, updated, trigger_type]

### Return type

[**GetFlowResponse**](GetFlowResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlowActionMessages"></a>
# **getFlowActionMessages**
> GetFlowMessageResponseCollection getFlowActionMessages(id, revision, fieldsFlowMessage, filter, pageSize, sort)

Get Flow Action Messages

Get all flow messages associated with the given action ID.  Flow messages can be sorted by the following fields, in ascending and descending order:  ascending: &#x60;id&#x60;,  &#x60;name&#x60;, &#x60;created&#x60;, &#x60;updated&#x60; descending: &#x60;-id&#x60;,  &#x60;-name&#x60;, &#x60;-created&#x60;, &#x60;-updated&#x60;  Returns a maximum of 50 flows per request, which can be paginated with offset pagination. Offset pagination uses the following parameters: &#x60;page[size]&#x60; and &#x60;page[number]&#x60;&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

FlowsApi apiInstance = new FlowsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsFlowMessage = Arrays.asList("fieldsFlowMessage_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`id`: `any`<br>`name`: `contains`, `ends-with`, `equals`, `starts-with`<br>`created`: `equals`, `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`updated`: `equals`, `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`
Integer pageSize = 50; // Integer | Default: 50. Min: 1. Max: 100.
String sort = "sort_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    GetFlowMessageResponseCollection result = apiInstance.getFlowActionMessages(id, revision, fieldsFlowMessage, filter, pageSize, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#getFlowActionMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsFlowMessage** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, channel, content, created, updated]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;id&#x60;: &#x60;any&#x60;&lt;br&gt;&#x60;name&#x60;: &#x60;contains&#x60;, &#x60;ends-with&#x60;, &#x60;equals&#x60;, &#x60;starts-with&#x60;&lt;br&gt;&#x60;created&#x60;: &#x60;equals&#x60;, &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;updated&#x60;: &#x60;equals&#x60;, &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60; | [optional]
 **pageSize** | **Integer**| Default: 50. Min: 1. Max: 100. | [optional] [default to 50] [enum: 1, 100]
 **sort** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created, id, -id, name, -name, updated, -updated]

### Return type

[**GetFlowMessageResponseCollection**](GetFlowMessageResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlowActionRelationshipsFlow"></a>
# **getFlowActionRelationshipsFlow**
> GetFlowActionFlowRelationshipResponse getFlowActionRelationshipsFlow(id, revision)

Get Flow Action Relationships Flow

Get the flow associated with the given action ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

FlowsApi apiInstance = new FlowsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    GetFlowActionFlowRelationshipResponse result = apiInstance.getFlowActionRelationshipsFlow(id, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#getFlowActionRelationshipsFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**GetFlowActionFlowRelationshipResponse**](GetFlowActionFlowRelationshipResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlowActionRelationshipsMessages"></a>
# **getFlowActionRelationshipsMessages**
> GetFlowActionFlowMessageRelationshipResponseCollection getFlowActionRelationshipsMessages(id, revision, filter, pageCursor, pageSize, sort)

Get Flow Action Relationships Messages

Get all relationships for flow messages associated with the given flow action ID.  Returns a maximum of 50 flow message relationships per request, which can be paginated with cursor-based pagination.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

FlowsApi apiInstance = new FlowsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`name`: `contains`, `ends-with`, `equals`, `starts-with`<br>`created`: `equals`, `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`updated`: `equals`, `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
Integer pageSize = 50; // Integer | Default: 50. Min: 1. Max: 50.
String sort = "sort_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    GetFlowActionFlowMessageRelationshipResponseCollection result = apiInstance.getFlowActionRelationshipsMessages(id, revision, filter, pageCursor, pageSize, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#getFlowActionRelationshipsMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;name&#x60;: &#x60;contains&#x60;, &#x60;ends-with&#x60;, &#x60;equals&#x60;, &#x60;starts-with&#x60;&lt;br&gt;&#x60;created&#x60;: &#x60;equals&#x60;, &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;updated&#x60;: &#x60;equals&#x60;, &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]
 **pageSize** | **Integer**| Default: 50. Min: 1. Max: 50. | [optional] [default to 50] [enum: 1, 50]
 **sort** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created, id, -id, name, -name, updated, -updated]

### Return type

[**GetFlowActionFlowMessageRelationshipResponseCollection**](GetFlowActionFlowMessageRelationshipResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlowFlowActions"></a>
# **getFlowFlowActions**
> GetFlowActionResponseCollection getFlowFlowActions(id, revision, fieldsFlowAction, filter, pageCursor, pageSize, sort)

Get Flow Flow Actions

Get all flow actions associated with the given flow ID.  Returns a maximum of 50 flows per request, which can be paginated with cursor-based pagination.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

FlowsApi apiInstance = new FlowsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsFlowAction = Arrays.asList("fieldsFlowAction_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`id`: `any`<br>`action_type`: `any`, `equals`<br>`status`: `equals`<br>`created`: `equals`, `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`updated`: `equals`, `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
Integer pageSize = 50; // Integer | Default: 50. Min: 1. Max: 50.
String sort = "sort_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    GetFlowActionResponseCollection result = apiInstance.getFlowFlowActions(id, revision, fieldsFlowAction, filter, pageCursor, pageSize, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#getFlowFlowActions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsFlowAction** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: action_type, status, created, updated, settings, tracking_options, send_options, send_options.use_smart_sending, send_options.is_transactional, render_options, render_options.shorten_links, render_options.add_org_prefix, render_options.add_info_link, render_options.add_opt_out_language]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;id&#x60;: &#x60;any&#x60;&lt;br&gt;&#x60;action_type&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;created&#x60;: &#x60;equals&#x60;, &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;updated&#x60;: &#x60;equals&#x60;, &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]
 **pageSize** | **Integer**| Default: 50. Min: 1. Max: 50. | [optional] [default to 50] [enum: 1, 50]
 **sort** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: action_type, -action_type, created, -created, id, -id, status, -status, updated, -updated]

### Return type

[**GetFlowActionResponseCollection**](GetFlowActionResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlowMessage"></a>
# **getFlowMessage**
> GetFlowMessageResponseCompoundDocument getFlowMessage(id, revision, fieldsFlowAction, fieldsFlowMessage, fieldsTemplate, include)

Get Flow Message

Get the flow message of a flow with the given message ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

FlowsApi apiInstance = new FlowsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsFlowAction = Arrays.asList("fieldsFlowAction_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsFlowMessage = Arrays.asList("fieldsFlowMessage_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsTemplate = Arrays.asList("fieldsTemplate_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    GetFlowMessageResponseCompoundDocument result = apiInstance.getFlowMessage(id, revision, fieldsFlowAction, fieldsFlowMessage, fieldsTemplate, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#getFlowMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsFlowAction** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: action_type, status, created, updated, settings, tracking_options, send_options, send_options.use_smart_sending, send_options.is_transactional, render_options, render_options.shorten_links, render_options.add_org_prefix, render_options.add_info_link, render_options.add_opt_out_language]
 **fieldsFlowMessage** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, channel, content, created, updated]
 **fieldsTemplate** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, editor_type, html, text, created, updated]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: flow-action, template]

### Return type

[**GetFlowMessageResponseCompoundDocument**](GetFlowMessageResponseCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlowMessageAction"></a>
# **getFlowMessageAction**
> GetFlowActionResponse getFlowMessageAction(id, revision, fieldsFlowAction)

Get Flow Action For Message

Get the flow action for a flow message with the given message ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

FlowsApi apiInstance = new FlowsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsFlowAction = Arrays.asList("fieldsFlowAction_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetFlowActionResponse result = apiInstance.getFlowMessageAction(id, revision, fieldsFlowAction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#getFlowMessageAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsFlowAction** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: action_type, status, created, updated, settings, tracking_options, send_options, send_options.use_smart_sending, send_options.is_transactional, render_options, render_options.shorten_links, render_options.add_org_prefix, render_options.add_info_link, render_options.add_opt_out_language]

### Return type

[**GetFlowActionResponse**](GetFlowActionResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlowMessageRelationshipsAction"></a>
# **getFlowMessageRelationshipsAction**
> GetFlowMessageFlowActionRelationshipResponse getFlowMessageRelationshipsAction(id, revision)

Get Flow Message Relationships Action

Get the [relationship](https://developers.klaviyo.com/en/reference/api_overview#relationships) for a flow message&#x27;s flow action, given the flow ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

FlowsApi apiInstance = new FlowsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    GetFlowMessageFlowActionRelationshipResponse result = apiInstance.getFlowMessageRelationshipsAction(id, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#getFlowMessageRelationshipsAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**GetFlowMessageFlowActionRelationshipResponse**](GetFlowMessageFlowActionRelationshipResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlowMessageRelationshipsTemplate"></a>
# **getFlowMessageRelationshipsTemplate**
> GetFlowMessageTemplateRelationshipResponse getFlowMessageRelationshipsTemplate(id, revision)

Get Flow Message Relationships Template

Returns the ID of the related template&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;templates:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

FlowsApi apiInstance = new FlowsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    GetFlowMessageTemplateRelationshipResponse result = apiInstance.getFlowMessageRelationshipsTemplate(id, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#getFlowMessageRelationshipsTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**GetFlowMessageTemplateRelationshipResponse**](GetFlowMessageTemplateRelationshipResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlowMessageTemplate"></a>
# **getFlowMessageTemplate**
> GetTemplateResponse getFlowMessageTemplate(id, revision, fieldsTemplate)

Get Flow Message Template

Return the related template&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;templates:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

FlowsApi apiInstance = new FlowsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsTemplate = Arrays.asList("fieldsTemplate_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetTemplateResponse result = apiInstance.getFlowMessageTemplate(id, revision, fieldsTemplate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#getFlowMessageTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsTemplate** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, editor_type, html, text, created, updated]

### Return type

[**GetTemplateResponse**](GetTemplateResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlowRelationshipsFlowActions"></a>
# **getFlowRelationshipsFlowActions**
> GetFlowFlowActionRelationshipListResponseCollection getFlowRelationshipsFlowActions(id, revision, filter, pageSize, sort)

Get Flow Relationships Flow Actions

Get all [relationships](https://developers.klaviyo.com/en/reference/api_overview#relationships) for flow actions associated with the given flow ID.  Flow action relationships can be sorted by the following fields, in ascending and descending order: &#x60;id&#x60;,  &#x60;status&#x60;, &#x60;created&#x60;, &#x60;updated&#x60;  Use filters to narrow your results.  Returns a maximum of 50 flow action relationships per request, which can be paginated with offset pagination. Offset pagination uses the following parameters: &#x60;page[size]&#x60; and &#x60;page[number]&#x60;.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

FlowsApi apiInstance = new FlowsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`action_type`: `equals`<br>`status`: `equals`<br>`created`: `equals`, `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`updated`: `equals`, `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`
Integer pageSize = 50; // Integer | Default: 50. Min: 1. Max: 100.
String sort = "sort_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    GetFlowFlowActionRelationshipListResponseCollection result = apiInstance.getFlowRelationshipsFlowActions(id, revision, filter, pageSize, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#getFlowRelationshipsFlowActions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;action_type&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;created&#x60;: &#x60;equals&#x60;, &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;updated&#x60;: &#x60;equals&#x60;, &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60; | [optional]
 **pageSize** | **Integer**| Default: 50. Min: 1. Max: 100. | [optional] [default to 50] [enum: 1, 100]
 **sort** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created, id, -id, status, -status, updated, -updated]

### Return type

[**GetFlowFlowActionRelationshipListResponseCollection**](GetFlowFlowActionRelationshipListResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlowRelationshipsTags"></a>
# **getFlowRelationshipsTags**
> GetFlowTagRelationshipListResponseCollection getFlowRelationshipsTags(id, revision)

Get Flow Relationships Tags

Return the tag IDs of all tags associated with the given flow.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60; &#x60;tags:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

FlowsApi apiInstance = new FlowsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    GetFlowTagRelationshipListResponseCollection result = apiInstance.getFlowRelationshipsTags(id, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#getFlowRelationshipsTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**GetFlowTagRelationshipListResponseCollection**](GetFlowTagRelationshipListResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlowTags"></a>
# **getFlowTags**
> GetTagResponseCollection getFlowTags(id, revision, fieldsTag)

Get Flow Tags

Return all tags associated with the given flow ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60; &#x60;tags:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

FlowsApi apiInstance = new FlowsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsTag = Arrays.asList("fieldsTag_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetTagResponseCollection result = apiInstance.getFlowTags(id, revision, fieldsTag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#getFlowTags");
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

<a name="getFlows"></a>
# **getFlows**
> GetFlowResponseCollectionCompoundDocument getFlows(revision, fieldsFlowAction, fieldsFlow, fieldsTag, filter, include, pageCursor, pageSize, sort)

Get Flows

Get all flows in an account.  Returns a maximum of 50 flows per request, which can be paginated with cursor-based pagination.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

FlowsApi apiInstance = new FlowsApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsFlowAction = Arrays.asList("fieldsFlowAction_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsFlow = Arrays.asList("fieldsFlow_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsTag = Arrays.asList("fieldsTag_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`id`: `any`<br>`name`: `contains`, `ends-with`, `equals`, `starts-with`<br>`status`: `equals`<br>`archived`: `equals`<br>`created`: `equals`, `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`updated`: `equals`, `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`trigger_type`: `equals`
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
Integer pageSize = 50; // Integer | Default: 50. Min: 1. Max: 50.
String sort = "sort_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    GetFlowResponseCollectionCompoundDocument result = apiInstance.getFlows(revision, fieldsFlowAction, fieldsFlow, fieldsTag, filter, include, pageCursor, pageSize, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#getFlows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsFlowAction** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: action_type, status, created, updated, settings, tracking_options, send_options, send_options.use_smart_sending, send_options.is_transactional, render_options, render_options.shorten_links, render_options.add_org_prefix, render_options.add_info_link, render_options.add_opt_out_language]
 **fieldsFlow** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, status, archived, created, updated, trigger_type]
 **fieldsTag** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;id&#x60;: &#x60;any&#x60;&lt;br&gt;&#x60;name&#x60;: &#x60;contains&#x60;, &#x60;ends-with&#x60;, &#x60;equals&#x60;, &#x60;starts-with&#x60;&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;archived&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;created&#x60;: &#x60;equals&#x60;, &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;updated&#x60;: &#x60;equals&#x60;, &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;trigger_type&#x60;: &#x60;equals&#x60; | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: flow-actions, tags]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]
 **pageSize** | **Integer**| Default: 50. Min: 1. Max: 50. | [optional] [default to 50] [enum: 1, 50]
 **sort** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created, id, -id, name, -name, status, -status, trigger_type, -trigger_type, updated, -updated]

### Return type

[**GetFlowResponseCollectionCompoundDocument**](GetFlowResponseCollectionCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFlow"></a>
# **updateFlow**
> PatchFlowResponse updateFlow(body, revision, id)

Update Flow Status

Update the status of a flow with the given flow ID, and all actions in that flow.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

FlowsApi apiInstance = new FlowsApi();
FlowUpdateQuery body = new FlowUpdateQuery(); // FlowUpdateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | ID of the Flow to update. Ex: XVTP5Q
try {
    PatchFlowResponse result = apiInstance.updateFlow(body, revision, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowsApi#updateFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FlowUpdateQuery**](FlowUpdateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**| ID of the Flow to update. Ex: XVTP5Q |

### Return type

[**PatchFlowResponse**](PatchFlowResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

