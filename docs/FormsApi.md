# FormsApi

All URIs are relative to *https://a.klaviyo.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getForm**](FormsApi.md#getForm) | **GET** /api/forms/{id}/ | Get Form |
| [**getFormForFormVersion**](FormsApi.md#getFormForFormVersion) | **GET** /api/form-versions/{id}/form/ | Get Form for Form Version |
| [**getFormIdForFormVersion**](FormsApi.md#getFormIdForFormVersion) | **GET** /api/form-versions/{id}/relationships/form/ | Get Form ID for Form Version |
| [**getFormVersion**](FormsApi.md#getFormVersion) | **GET** /api/form-versions/{id}/ | Get Form Version |
| [**getForms**](FormsApi.md#getForms) | **GET** /api/forms/ | Get Forms |
| [**getVersionIdsForForm**](FormsApi.md#getVersionIdsForForm) | **GET** /api/forms/{id}/relationships/form-versions/ | Get Version IDs for Form |
| [**getVersionsForForm**](FormsApi.md#getVersionsForForm) | **GET** /api/forms/{id}/form-versions/ | Get Versions for Form |


<a id="getForm"></a>
# **getForm**
> GetFormResponseCompoundDocument getForm(id, revision, fieldsFormVersion, fieldsForm, include)

Get Form

Get the form with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;forms:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FormsApi()
val id : kotlin.String = Y6nRLr // kotlin.String | The ID of the form
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsFormVersion : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsForm : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    val result : GetFormResponseCompoundDocument = apiInstance.getForm(id, revision, fieldsFormVersion, fieldsForm, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FormsApi#getForm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FormsApi#getForm")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The ID of the form | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsFormVersion** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: form_type, ab_test, ab_test.variation_name, status, created_at, updated_at] |
| **fieldsForm** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, status, ab_test, created_at, updated_at] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: form-versions] |

### Return type

[**GetFormResponseCompoundDocument**](GetFormResponseCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFormForFormVersion"></a>
# **getFormForFormVersion**
> GetFormResponse getFormForFormVersion(id, revision, fieldsForm)

Get Form for Form Version

Get the form associated with the given form version.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;forms:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FormsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsForm : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetFormResponse = apiInstance.getFormForFormVersion(id, revision, fieldsForm)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FormsApi#getFormForFormVersion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FormsApi#getFormForFormVersion")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsForm** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, status, ab_test, created_at, updated_at] |

### Return type

[**GetFormResponse**](GetFormResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFormIdForFormVersion"></a>
# **getFormIdForFormVersion**
> GetFormVersionFormRelationshipResponse getFormIdForFormVersion(id, revision)

Get Form ID for Form Version

Get the ID of the form associated with the given form version.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;forms:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FormsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetFormVersionFormRelationshipResponse = apiInstance.getFormIdForFormVersion(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FormsApi#getFormIdForFormVersion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FormsApi#getFormIdForFormVersion")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetFormVersionFormRelationshipResponse**](GetFormVersionFormRelationshipResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFormVersion"></a>
# **getFormVersion**
> GetFormVersionResponse getFormVersion(id, revision, fieldsFormVersion)

Get Form Version

Get the form version with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;forms:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FormsApi()
val id : kotlin.String = 1234567 // kotlin.String | The ID of the form version
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsFormVersion : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetFormVersionResponse = apiInstance.getFormVersion(id, revision, fieldsFormVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FormsApi#getFormVersion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FormsApi#getFormVersion")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The ID of the form version | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsFormVersion** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: form_type, ab_test, ab_test.variation_name, status, created_at, updated_at] |

### Return type

[**GetFormVersionResponse**](GetFormVersionResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getForms"></a>
# **getForms**
> GetFormResponseCollectionCompoundDocument getForms(revision, fieldsForm, filter, pageCursor, pageSize, sort)

Get Forms

Get all forms in an account.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;forms:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FormsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsForm : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`id`: `any`, `equals`<br>`name`: `any`, `contains`, `equals`<br>`ab_test`: `equals`<br>`updated_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`created_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`status`: `equals`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val pageSize : kotlin.Int = 56 // kotlin.Int | Default: 20. Min: 1. Max: 100.
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetFormResponseCollectionCompoundDocument = apiInstance.getForms(revision, fieldsForm, filter, pageCursor, pageSize, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FormsApi#getForms")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FormsApi#getForms")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsForm** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, status, ab_test, created_at, updated_at] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;id&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;name&#x60;: &#x60;any&#x60;, &#x60;contains&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;ab_test&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;updated_at&#x60;: &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;created_at&#x60;: &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60; | [optional] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| **pageSize** | **kotlin.Int**| Default: 20. Min: 1. Max: 100. | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created_at, -created_at, updated_at, -updated_at] |

### Return type

[**GetFormResponseCollectionCompoundDocument**](GetFormResponseCollectionCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getVersionIdsForForm"></a>
# **getVersionIdsForForm**
> GetFormFormVersionRelationshipsResponseCollection getVersionIdsForForm(id, revision)

Get Version IDs for Form

Get the IDs of the form versions for the given form.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;forms:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FormsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetFormFormVersionRelationshipsResponseCollection = apiInstance.getVersionIdsForForm(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FormsApi#getVersionIdsForForm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FormsApi#getVersionIdsForForm")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetFormFormVersionRelationshipsResponseCollection**](GetFormFormVersionRelationshipsResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getVersionsForForm"></a>
# **getVersionsForForm**
> GetFormVersionResponse getVersionsForForm(id, revision, fieldsFormVersion, filter, pageCursor, pageSize, sort)

Get Versions for Form

Get the form versions for the given form.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;forms:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FormsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsFormVersion : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`form_type`: `any`, `equals`<br>`status`: `equals`<br>`updated_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`created_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val pageSize : kotlin.Int = 56 // kotlin.Int | Default: 20. Min: 1. Max: 100.
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetFormVersionResponse = apiInstance.getVersionsForForm(id, revision, fieldsFormVersion, filter, pageCursor, pageSize, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FormsApi#getVersionsForForm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FormsApi#getVersionsForForm")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsFormVersion** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: form_type, ab_test, ab_test.variation_name, status, created_at, updated_at] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;form_type&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;status&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;updated_at&#x60;: &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;created_at&#x60;: &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60; | [optional] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| **pageSize** | **kotlin.Int**| Default: 20. Min: 1. Max: 100. | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created_at, -created_at, updated_at, -updated_at] |

### Return type

[**GetFormVersionResponse**](GetFormVersionResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

