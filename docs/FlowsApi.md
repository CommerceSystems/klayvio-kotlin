# FlowsApi

All URIs are relative to *https://a.klaviyo.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteFlow**](FlowsApi.md#deleteFlow) | **DELETE** /api/flows/{id}/ | Delete Flow |
| [**getFlow**](FlowsApi.md#getFlow) | **GET** /api/flows/{id}/ | Get Flow |
| [**getFlowAction**](FlowsApi.md#getFlowAction) | **GET** /api/flow-actions/{id}/ | Get Flow Action |
| [**getFlowActionFlow**](FlowsApi.md#getFlowActionFlow) | **GET** /api/flow-actions/{id}/flow/ | Get Flow For Flow Action |
| [**getFlowActionMessages**](FlowsApi.md#getFlowActionMessages) | **GET** /api/flow-actions/{id}/flow-messages/ | Get Flow Action Messages |
| [**getFlowActionRelationshipsFlow**](FlowsApi.md#getFlowActionRelationshipsFlow) | **GET** /api/flow-actions/{id}/relationships/flow/ | Get Flow Action Relationships Flow |
| [**getFlowActionRelationshipsMessages**](FlowsApi.md#getFlowActionRelationshipsMessages) | **GET** /api/flow-actions/{id}/relationships/flow-messages/ | Get Flow Action Relationships Messages |
| [**getFlowFlowActions**](FlowsApi.md#getFlowFlowActions) | **GET** /api/flows/{id}/flow-actions/ | Get Flow Flow Actions |
| [**getFlowMessage**](FlowsApi.md#getFlowMessage) | **GET** /api/flow-messages/{id}/ | Get Flow Message |
| [**getFlowMessageAction**](FlowsApi.md#getFlowMessageAction) | **GET** /api/flow-messages/{id}/flow-action/ | Get Flow Action For Message |
| [**getFlowMessageRelationshipsAction**](FlowsApi.md#getFlowMessageRelationshipsAction) | **GET** /api/flow-messages/{id}/relationships/flow-action/ | Get Flow Message Relationships Action |
| [**getFlowMessageRelationshipsTemplate**](FlowsApi.md#getFlowMessageRelationshipsTemplate) | **GET** /api/flow-messages/{id}/relationships/template/ | Get Flow Message Relationships Template |
| [**getFlowMessageTemplate**](FlowsApi.md#getFlowMessageTemplate) | **GET** /api/flow-messages/{id}/template/ | Get Flow Message Template |
| [**getFlowRelationshipsFlowActions**](FlowsApi.md#getFlowRelationshipsFlowActions) | **GET** /api/flows/{id}/relationships/flow-actions/ | Get Flow Relationships Flow Actions |
| [**getFlowRelationshipsTags**](FlowsApi.md#getFlowRelationshipsTags) | **GET** /api/flows/{id}/relationships/tags/ | Get Flow Relationships Tags |
| [**getFlowTags**](FlowsApi.md#getFlowTags) | **GET** /api/flows/{id}/tags/ | Get Flow Tags |
| [**getFlows**](FlowsApi.md#getFlows) | **GET** /api/flows/ | Get Flows |
| [**updateFlow**](FlowsApi.md#updateFlow) | **PATCH** /api/flows/{id}/ | Update Flow Status |


<a id="deleteFlow"></a>
# **deleteFlow**
> deleteFlow(id, revision)

Delete Flow

Delete a flow with the given flow ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FlowsApi()
val id : kotlin.String = id_example // kotlin.String | ID of the Flow to delete. Ex: XVTP5Q
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.deleteFlow(id, revision)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#deleteFlow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#deleteFlow")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| ID of the Flow to delete. Ex: XVTP5Q | |
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

<a id="getFlow"></a>
# **getFlow**
> GetFlowResponseCompoundDocument getFlow(id, revision, fieldsFlowAction, fieldsFlow, fieldsTag, include)

Get Flow

Get a flow with the given flow ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FlowsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsFlowAction : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsFlow : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsTag : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    val result : GetFlowResponseCompoundDocument = apiInstance.getFlow(id, revision, fieldsFlowAction, fieldsFlow, fieldsTag, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#getFlow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#getFlow")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsFlowAction** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: action_type, status, created, updated, settings, tracking_options, send_options, send_options.use_smart_sending, send_options.is_transactional, render_options, render_options.shorten_links, render_options.add_org_prefix, render_options.add_info_link, render_options.add_opt_out_language] |
| **fieldsFlow** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, status, archived, created, updated, trigger_type] |
| **fieldsTag** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: flow-actions, tags] |

### Return type

[**GetFlowResponseCompoundDocument**](GetFlowResponseCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFlowAction"></a>
# **getFlowAction**
> GetFlowActionResponseCompoundDocument getFlowAction(id, revision, fieldsFlowAction, fieldsFlowMessage, fieldsFlow, include)

Get Flow Action

Get a flow action from a flow with the given flow action ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FlowsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsFlowAction : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsFlowMessage : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsFlow : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    val result : GetFlowActionResponseCompoundDocument = apiInstance.getFlowAction(id, revision, fieldsFlowAction, fieldsFlowMessage, fieldsFlow, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#getFlowAction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#getFlowAction")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsFlowAction** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: action_type, status, created, updated, settings, tracking_options, send_options, send_options.use_smart_sending, send_options.is_transactional, render_options, render_options.shorten_links, render_options.add_org_prefix, render_options.add_info_link, render_options.add_opt_out_language] |
| **fieldsFlowMessage** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, channel, content, created, updated] |
| **fieldsFlow** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, status, archived, created, updated, trigger_type] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: flow, flow-messages] |

### Return type

[**GetFlowActionResponseCompoundDocument**](GetFlowActionResponseCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFlowActionFlow"></a>
# **getFlowActionFlow**
> GetFlowResponse getFlowActionFlow(id, revision, fieldsFlow)

Get Flow For Flow Action

Get the flow associated with the given action ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FlowsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsFlow : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetFlowResponse = apiInstance.getFlowActionFlow(id, revision, fieldsFlow)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#getFlowActionFlow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#getFlowActionFlow")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsFlow** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, status, archived, created, updated, trigger_type] |

### Return type

[**GetFlowResponse**](GetFlowResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFlowActionMessages"></a>
# **getFlowActionMessages**
> GetFlowMessageResponseCollection getFlowActionMessages(id, revision, fieldsFlowMessage, filter, pageSize, sort)

Get Flow Action Messages

Get all flow messages associated with the given action ID.  Flow messages can be sorted by the following fields, in ascending and descending order:  ascending: &#x60;id&#x60;,  &#x60;name&#x60;, &#x60;created&#x60;, &#x60;updated&#x60; descending: &#x60;-id&#x60;,  &#x60;-name&#x60;, &#x60;-created&#x60;, &#x60;-updated&#x60;  Returns a maximum of 50 flows per request, which can be paginated with offset pagination. Offset pagination uses the following parameters: &#x60;page[size]&#x60; and &#x60;page[number]&#x60;&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FlowsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsFlowMessage : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`id`: `any`<br>`name`: `contains`, `ends-with`, `equals`, `starts-with`<br>`created`: `equals`, `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`updated`: `equals`, `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`
val pageSize : kotlin.Int = 56 // kotlin.Int | Default: 50. Min: 1. Max: 100.
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetFlowMessageResponseCollection = apiInstance.getFlowActionMessages(id, revision, fieldsFlowMessage, filter, pageSize, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#getFlowActionMessages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#getFlowActionMessages")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsFlowMessage** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, channel, content, created, updated] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;id&#x60;: &#x60;any&#x60;&lt;br&gt;&#x60;name&#x60;: &#x60;contains&#x60;, &#x60;ends-with&#x60;, &#x60;equals&#x60;, &#x60;starts-with&#x60;&lt;br&gt;&#x60;created&#x60;: &#x60;equals&#x60;, &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;updated&#x60;: &#x60;equals&#x60;, &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60; | [optional] |
| **pageSize** | **kotlin.Int**| Default: 50. Min: 1. Max: 100. | [optional] [default to 50] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created, id, -id, name, -name, updated, -updated] |

### Return type

[**GetFlowMessageResponseCollection**](GetFlowMessageResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFlowActionRelationshipsFlow"></a>
# **getFlowActionRelationshipsFlow**
> GetFlowActionFlowRelationshipResponse getFlowActionRelationshipsFlow(id, revision)

Get Flow Action Relationships Flow

Get the flow associated with the given action ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FlowsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetFlowActionFlowRelationshipResponse = apiInstance.getFlowActionRelationshipsFlow(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#getFlowActionRelationshipsFlow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#getFlowActionRelationshipsFlow")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetFlowActionFlowRelationshipResponse**](GetFlowActionFlowRelationshipResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFlowActionRelationshipsMessages"></a>
# **getFlowActionRelationshipsMessages**
> GetFlowActionFlowMessageRelationshipResponseCollection getFlowActionRelationshipsMessages(id, revision, filter, pageCursor, pageSize, sort)

Get Flow Action Relationships Messages

Get all relationships for flow messages associated with the given flow action ID.  Returns a maximum of 50 flow message relationships per request, which can be paginated with cursor-based pagination.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FlowsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`name`: `contains`, `ends-with`, `equals`, `starts-with`<br>`created`: `equals`, `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`updated`: `equals`, `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val pageSize : kotlin.Int = 56 // kotlin.Int | Default: 50. Min: 1. Max: 50.
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetFlowActionFlowMessageRelationshipResponseCollection = apiInstance.getFlowActionRelationshipsMessages(id, revision, filter, pageCursor, pageSize, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#getFlowActionRelationshipsMessages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#getFlowActionRelationshipsMessages")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;name&#x60;: &#x60;contains&#x60;, &#x60;ends-with&#x60;, &#x60;equals&#x60;, &#x60;starts-with&#x60;&lt;br&gt;&#x60;created&#x60;: &#x60;equals&#x60;, &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;updated&#x60;: &#x60;equals&#x60;, &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60; | [optional] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| **pageSize** | **kotlin.Int**| Default: 50. Min: 1. Max: 50. | [optional] [default to 50] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created, id, -id, name, -name, updated, -updated] |

### Return type

[**GetFlowActionFlowMessageRelationshipResponseCollection**](GetFlowActionFlowMessageRelationshipResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFlowFlowActions"></a>
# **getFlowFlowActions**
> GetFlowActionResponseCollection getFlowFlowActions(id, revision, fieldsFlowAction, filter, pageCursor, pageSize, sort)

Get Flow Flow Actions

Get all flow actions associated with the given flow ID.  Returns a maximum of 50 flows per request, which can be paginated with cursor-based pagination.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FlowsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsFlowAction : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`id`: `any`<br>`action_type`: `any`, `equals`<br>`status`: `equals`<br>`created`: `equals`, `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`updated`: `equals`, `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val pageSize : kotlin.Int = 56 // kotlin.Int | Default: 50. Min: 1. Max: 50.
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetFlowActionResponseCollection = apiInstance.getFlowFlowActions(id, revision, fieldsFlowAction, filter, pageCursor, pageSize, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#getFlowFlowActions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#getFlowFlowActions")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsFlowAction** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: action_type, status, created, updated, settings, tracking_options, send_options, send_options.use_smart_sending, send_options.is_transactional, render_options, render_options.shorten_links, render_options.add_org_prefix, render_options.add_info_link, render_options.add_opt_out_language] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;id&#x60;: &#x60;any&#x60;&lt;br&gt;&#x60;action_type&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;created&#x60;: &#x60;equals&#x60;, &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;updated&#x60;: &#x60;equals&#x60;, &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60; | [optional] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| **pageSize** | **kotlin.Int**| Default: 50. Min: 1. Max: 50. | [optional] [default to 50] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: action_type, -action_type, created, -created, id, -id, status, -status, updated, -updated] |

### Return type

[**GetFlowActionResponseCollection**](GetFlowActionResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFlowMessage"></a>
# **getFlowMessage**
> GetFlowMessageResponseCompoundDocument getFlowMessage(id, revision, fieldsFlowAction, fieldsFlowMessage, fieldsTemplate, include)

Get Flow Message

Get the flow message of a flow with the given message ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FlowsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsFlowAction : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsFlowMessage : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsTemplate : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    val result : GetFlowMessageResponseCompoundDocument = apiInstance.getFlowMessage(id, revision, fieldsFlowAction, fieldsFlowMessage, fieldsTemplate, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#getFlowMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#getFlowMessage")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsFlowAction** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: action_type, status, created, updated, settings, tracking_options, send_options, send_options.use_smart_sending, send_options.is_transactional, render_options, render_options.shorten_links, render_options.add_org_prefix, render_options.add_info_link, render_options.add_opt_out_language] |
| **fieldsFlowMessage** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, channel, content, created, updated] |
| **fieldsTemplate** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, editor_type, html, text, created, updated] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: flow-action, template] |

### Return type

[**GetFlowMessageResponseCompoundDocument**](GetFlowMessageResponseCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFlowMessageAction"></a>
# **getFlowMessageAction**
> GetFlowActionResponse getFlowMessageAction(id, revision, fieldsFlowAction)

Get Flow Action For Message

Get the flow action for a flow message with the given message ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FlowsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsFlowAction : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetFlowActionResponse = apiInstance.getFlowMessageAction(id, revision, fieldsFlowAction)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#getFlowMessageAction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#getFlowMessageAction")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsFlowAction** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: action_type, status, created, updated, settings, tracking_options, send_options, send_options.use_smart_sending, send_options.is_transactional, render_options, render_options.shorten_links, render_options.add_org_prefix, render_options.add_info_link, render_options.add_opt_out_language] |

### Return type

[**GetFlowActionResponse**](GetFlowActionResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFlowMessageRelationshipsAction"></a>
# **getFlowMessageRelationshipsAction**
> GetFlowMessageFlowActionRelationshipResponse getFlowMessageRelationshipsAction(id, revision)

Get Flow Message Relationships Action

Get the [relationship](https://developers.klaviyo.com/en/reference/api_overview#relationships) for a flow message&#39;s flow action, given the flow ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FlowsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetFlowMessageFlowActionRelationshipResponse = apiInstance.getFlowMessageRelationshipsAction(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#getFlowMessageRelationshipsAction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#getFlowMessageRelationshipsAction")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetFlowMessageFlowActionRelationshipResponse**](GetFlowMessageFlowActionRelationshipResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFlowMessageRelationshipsTemplate"></a>
# **getFlowMessageRelationshipsTemplate**
> GetFlowMessageTemplateRelationshipResponse getFlowMessageRelationshipsTemplate(id, revision)

Get Flow Message Relationships Template

Returns the ID of the related template&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;templates:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FlowsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetFlowMessageTemplateRelationshipResponse = apiInstance.getFlowMessageRelationshipsTemplate(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#getFlowMessageRelationshipsTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#getFlowMessageRelationshipsTemplate")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetFlowMessageTemplateRelationshipResponse**](GetFlowMessageTemplateRelationshipResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFlowMessageTemplate"></a>
# **getFlowMessageTemplate**
> GetTemplateResponse getFlowMessageTemplate(id, revision, fieldsTemplate)

Get Flow Message Template

Return the related template&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;templates:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FlowsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsTemplate : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetTemplateResponse = apiInstance.getFlowMessageTemplate(id, revision, fieldsTemplate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#getFlowMessageTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#getFlowMessageTemplate")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsTemplate** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, editor_type, html, text, created, updated] |

### Return type

[**GetTemplateResponse**](GetTemplateResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFlowRelationshipsFlowActions"></a>
# **getFlowRelationshipsFlowActions**
> GetFlowFlowActionRelationshipListResponseCollection getFlowRelationshipsFlowActions(id, revision, filter, pageSize, sort)

Get Flow Relationships Flow Actions

Get all [relationships](https://developers.klaviyo.com/en/reference/api_overview#relationships) for flow actions associated with the given flow ID.  Flow action relationships can be sorted by the following fields, in ascending and descending order: &#x60;id&#x60;,  &#x60;status&#x60;, &#x60;created&#x60;, &#x60;updated&#x60;  Use filters to narrow your results.  Returns a maximum of 50 flow action relationships per request, which can be paginated with offset pagination. Offset pagination uses the following parameters: &#x60;page[size]&#x60; and &#x60;page[number]&#x60;.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FlowsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`action_type`: `equals`<br>`status`: `equals`<br>`created`: `equals`, `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`updated`: `equals`, `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`
val pageSize : kotlin.Int = 56 // kotlin.Int | Default: 50. Min: 1. Max: 100.
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetFlowFlowActionRelationshipListResponseCollection = apiInstance.getFlowRelationshipsFlowActions(id, revision, filter, pageSize, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#getFlowRelationshipsFlowActions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#getFlowRelationshipsFlowActions")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;action_type&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;created&#x60;: &#x60;equals&#x60;, &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;updated&#x60;: &#x60;equals&#x60;, &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60; | [optional] |
| **pageSize** | **kotlin.Int**| Default: 50. Min: 1. Max: 100. | [optional] [default to 50] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created, id, -id, status, -status, updated, -updated] |

### Return type

[**GetFlowFlowActionRelationshipListResponseCollection**](GetFlowFlowActionRelationshipListResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFlowRelationshipsTags"></a>
# **getFlowRelationshipsTags**
> GetFlowTagRelationshipListResponseCollection getFlowRelationshipsTags(id, revision)

Get Flow Relationships Tags

Return the tag IDs of all tags associated with the given flow.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60; &#x60;tags:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FlowsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetFlowTagRelationshipListResponseCollection = apiInstance.getFlowRelationshipsTags(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#getFlowRelationshipsTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#getFlowRelationshipsTags")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetFlowTagRelationshipListResponseCollection**](GetFlowTagRelationshipListResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFlowTags"></a>
# **getFlowTags**
> GetTagResponseCollection getFlowTags(id, revision, fieldsTag)

Get Flow Tags

Return all tags associated with the given flow ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60; &#x60;tags:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FlowsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsTag : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetTagResponseCollection = apiInstance.getFlowTags(id, revision, fieldsTag)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#getFlowTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#getFlowTags")
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

<a id="getFlows"></a>
# **getFlows**
> GetFlowResponseCollectionCompoundDocument getFlows(revision, fieldsFlowAction, fieldsFlow, fieldsTag, filter, include, pageCursor, pageSize, sort)

Get Flows

Get all flows in an account.  Returns a maximum of 50 flows per request, which can be paginated with cursor-based pagination.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FlowsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsFlowAction : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsFlow : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsTag : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`id`: `any`<br>`name`: `contains`, `ends-with`, `equals`, `starts-with`<br>`status`: `equals`<br>`archived`: `equals`<br>`created`: `equals`, `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`updated`: `equals`, `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`trigger_type`: `equals`
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val pageSize : kotlin.Int = 56 // kotlin.Int | Default: 50. Min: 1. Max: 50.
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetFlowResponseCollectionCompoundDocument = apiInstance.getFlows(revision, fieldsFlowAction, fieldsFlow, fieldsTag, filter, include, pageCursor, pageSize, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#getFlows")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#getFlows")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsFlowAction** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: action_type, status, created, updated, settings, tracking_options, send_options, send_options.use_smart_sending, send_options.is_transactional, render_options, render_options.shorten_links, render_options.add_org_prefix, render_options.add_info_link, render_options.add_opt_out_language] |
| **fieldsFlow** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, status, archived, created, updated, trigger_type] |
| **fieldsTag** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;id&#x60;: &#x60;any&#x60;&lt;br&gt;&#x60;name&#x60;: &#x60;contains&#x60;, &#x60;ends-with&#x60;, &#x60;equals&#x60;, &#x60;starts-with&#x60;&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;archived&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;created&#x60;: &#x60;equals&#x60;, &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;updated&#x60;: &#x60;equals&#x60;, &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;trigger_type&#x60;: &#x60;equals&#x60; | [optional] |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: flow-actions, tags] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| **pageSize** | **kotlin.Int**| Default: 50. Min: 1. Max: 50. | [optional] [default to 50] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created, id, -id, name, -name, status, -status, trigger_type, -trigger_type, updated, -updated] |

### Return type

[**GetFlowResponseCollectionCompoundDocument**](GetFlowResponseCollectionCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateFlow"></a>
# **updateFlow**
> PatchFlowResponse updateFlow(id, revision, flowUpdateQuery)

Update Flow Status

Update the status of a flow with the given flow ID, and all actions in that flow.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FlowsApi()
val id : kotlin.String = id_example // kotlin.String | ID of the Flow to update. Ex: XVTP5Q
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val flowUpdateQuery : FlowUpdateQuery =  // FlowUpdateQuery | 
try {
    val result : PatchFlowResponse = apiInstance.updateFlow(id, revision, flowUpdateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FlowsApi#updateFlow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FlowsApi#updateFlow")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| ID of the Flow to update. Ex: XVTP5Q | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **flowUpdateQuery** | [**FlowUpdateQuery**](FlowUpdateQuery.md)|  | |

### Return type

[**PatchFlowResponse**](PatchFlowResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

