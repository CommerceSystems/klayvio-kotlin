# TemplatesApi

All URIs are relative to *https://a.klaviyo.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTemplate**](TemplatesApi.md#createTemplate) | **POST** /api/templates/ | Create Template |
| [**createTemplateClone**](TemplatesApi.md#createTemplateClone) | **POST** /api/template-clone/ | Create Template Clone |
| [**createTemplateRender**](TemplatesApi.md#createTemplateRender) | **POST** /api/template-render/ | Create Template Render |
| [**deleteTemplate**](TemplatesApi.md#deleteTemplate) | **DELETE** /api/templates/{id}/ | Delete Template |
| [**getTemplate**](TemplatesApi.md#getTemplate) | **GET** /api/templates/{id}/ | Get Template |
| [**getTemplates**](TemplatesApi.md#getTemplates) | **GET** /api/templates/ | Get Templates |
| [**updateTemplate**](TemplatesApi.md#updateTemplate) | **PATCH** /api/templates/{id}/ | Update Template |


<a id="createTemplate"></a>
# **createTemplate**
> PostTemplateResponse createTemplate(revision, templateCreateQuery)

Create Template

Create a new custom HTML template.  If there are 1,000 or more templates in an account, creation will fail as there is a limit of 1,000 templates that can be created via the API.  Request specific fields using [sparse fieldsets](https://developers.klaviyo.com/en/reference/api_overview#sparse-fieldsets).&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;templates:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TemplatesApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val templateCreateQuery : TemplateCreateQuery =  // TemplateCreateQuery | 
try {
    val result : PostTemplateResponse = apiInstance.createTemplate(revision, templateCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#createTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#createTemplate")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **templateCreateQuery** | [**TemplateCreateQuery**](TemplateCreateQuery.md)|  | |

### Return type

[**PostTemplateResponse**](PostTemplateResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createTemplateClone"></a>
# **createTemplateClone**
> PostTemplateResponse createTemplateClone(revision, templateCloneQuery)

Create Template Clone

Create a clone of a template with the given template ID.  If there are 1,000 or more templates in an account, cloning will fail as there is a limit of 1,000 templates that can be created via the API.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;templates:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TemplatesApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val templateCloneQuery : TemplateCloneQuery =  // TemplateCloneQuery | 
try {
    val result : PostTemplateResponse = apiInstance.createTemplateClone(revision, templateCloneQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#createTemplateClone")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#createTemplateClone")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **templateCloneQuery** | [**TemplateCloneQuery**](TemplateCloneQuery.md)|  | |

### Return type

[**PostTemplateResponse**](PostTemplateResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createTemplateRender"></a>
# **createTemplateRender**
> PostTemplateResponse createTemplateRender(revision, templateRenderQuery)

Create Template Render

Render a template with the given template ID and context attribute. Returns the HTML and plain text versions of the email template.  **Request body parameters** (nested under &#x60;attributes&#x60;):  * &#x60;return_fields&#x60;: Request specific fields using [sparse fieldsets](https://developers.klaviyo.com/en/reference/api_overview#sparse-fieldsets).  * &#x60;context&#x60;: This is the context your email template will be rendered with. You must pass in a &#x60;context&#x60; object as a JSON object.  Email templates are rendered with contexts in a similar manner to Django templates. Nested template variables can be referenced via dot notation. Template variables without corresponding &#x60;context&#x60; values are treated as &#x60;FALSE&#x60; and output nothing.  Ex. &#x60;{ \&quot;name\&quot; : \&quot;George Washington\&quot;, \&quot;state\&quot; : \&quot;VA\&quot; }&#x60;&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;templates:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TemplatesApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val templateRenderQuery : TemplateRenderQuery =  // TemplateRenderQuery | 
try {
    val result : PostTemplateResponse = apiInstance.createTemplateRender(revision, templateRenderQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#createTemplateRender")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#createTemplateRender")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **templateRenderQuery** | [**TemplateRenderQuery**](TemplateRenderQuery.md)|  | |

### Return type

[**PostTemplateResponse**](PostTemplateResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTemplate"></a>
# **deleteTemplate**
> deleteTemplate(id, revision)

Delete Template

Delete a template with the given template ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;templates:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | The ID of template
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.deleteTemplate(id, revision)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#deleteTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#deleteTemplate")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The ID of template | |
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

<a id="getTemplate"></a>
# **getTemplate**
> GetTemplateResponse getTemplate(id, revision, fieldsTemplate)

Get Template

Get a template with the given template ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;templates:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | The ID of template
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsTemplate : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetTemplateResponse = apiInstance.getTemplate(id, revision, fieldsTemplate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#getTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#getTemplate")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The ID of template | |
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

<a id="getTemplates"></a>
# **getTemplates**
> GetTemplateResponseCollection getTemplates(revision, fieldsTemplate, filter, pageCursor, sort)

Get Templates

Get all templates in an account.  Filter to request a subset of all templates. Templates can be sorted by the following fields, in ascending and descending order: &#x60;id&#x60;, &#x60;name&#x60;, &#x60;created&#x60;, &#x60;updated&#x60;  Returns a maximum of 10 results per page.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;templates:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TemplatesApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsTemplate : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`id`: `any`, `equals`<br>`name`: `any`, `equals`<br>`created`: `equals`, `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`updated`: `equals`, `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetTemplateResponseCollection = apiInstance.getTemplates(revision, fieldsTemplate, filter, pageCursor, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#getTemplates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#getTemplates")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsTemplate** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, editor_type, html, text, created, updated] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;id&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;name&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;created&#x60;: &#x60;equals&#x60;, &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;updated&#x60;: &#x60;equals&#x60;, &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60; | [optional] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created, id, -id, name, -name, updated, -updated] |

### Return type

[**GetTemplateResponseCollection**](GetTemplateResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateTemplate"></a>
# **updateTemplate**
> PatchTemplateResponse updateTemplate(id, revision, templateUpdateQuery)

Update Template

Update a template with the given template ID. Does not currently update drag &amp; drop templates.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;templates:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TemplatesApi()
val id : kotlin.String = id_example // kotlin.String | The ID of template
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val templateUpdateQuery : TemplateUpdateQuery =  // TemplateUpdateQuery | 
try {
    val result : PatchTemplateResponse = apiInstance.updateTemplate(id, revision, templateUpdateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TemplatesApi#updateTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TemplatesApi#updateTemplate")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The ID of template | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **templateUpdateQuery** | [**TemplateUpdateQuery**](TemplateUpdateQuery.md)|  | |

### Return type

[**PatchTemplateResponse**](PatchTemplateResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

