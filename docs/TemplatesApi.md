# TemplatesApi

All URIs are relative to *https://a.klaviyo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTemplate**](TemplatesApi.md#createTemplate) | **POST** /api/templates/ | Create Template
[**createTemplateClone**](TemplatesApi.md#createTemplateClone) | **POST** /api/template-clone/ | Create Template Clone
[**createTemplateRender**](TemplatesApi.md#createTemplateRender) | **POST** /api/template-render/ | Create Template Render
[**deleteTemplate**](TemplatesApi.md#deleteTemplate) | **DELETE** /api/templates/{id}/ | Delete Template
[**getTemplate**](TemplatesApi.md#getTemplate) | **GET** /api/templates/{id}/ | Get Template
[**getTemplates**](TemplatesApi.md#getTemplates) | **GET** /api/templates/ | Get Templates
[**updateTemplate**](TemplatesApi.md#updateTemplate) | **PATCH** /api/templates/{id}/ | Update Template

<a name="createTemplate"></a>
# **createTemplate**
> PostTemplateResponse createTemplate(body, revision)

Create Template

Create a new custom HTML template.  If there are 1,000 or more templates in an account, creation will fail as there is a limit of 1,000 templates that can be created via the API.  Request specific fields using [sparse fieldsets](https://developers.klaviyo.com/en/reference/api_overview#sparse-fieldsets).&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;templates:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TemplatesApi apiInstance = new TemplatesApi();
TemplateCreateQuery body = new TemplateCreateQuery(); // TemplateCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostTemplateResponse result = apiInstance.createTemplate(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#createTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TemplateCreateQuery**](TemplateCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostTemplateResponse**](PostTemplateResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTemplateClone"></a>
# **createTemplateClone**
> PostTemplateResponse createTemplateClone(body, revision)

Create Template Clone

Create a clone of a template with the given template ID.  If there are 1,000 or more templates in an account, cloning will fail as there is a limit of 1,000 templates that can be created via the API.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;templates:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TemplatesApi apiInstance = new TemplatesApi();
TemplateCloneQuery body = new TemplateCloneQuery(); // TemplateCloneQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostTemplateResponse result = apiInstance.createTemplateClone(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#createTemplateClone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TemplateCloneQuery**](TemplateCloneQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostTemplateResponse**](PostTemplateResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTemplateRender"></a>
# **createTemplateRender**
> PostTemplateResponse createTemplateRender(body, revision)

Create Template Render

Render a template with the given template ID and context attribute. Returns the HTML and plain text versions of the email template.  **Request body parameters** (nested under &#x60;attributes&#x60;):  * &#x60;return_fields&#x60;: Request specific fields using [sparse fieldsets](https://developers.klaviyo.com/en/reference/api_overview#sparse-fieldsets).  * &#x60;context&#x60;: This is the context your email template will be rendered with. You must pass in a &#x60;context&#x60; object as a JSON object.  Email templates are rendered with contexts in a similar manner to Django templates. Nested template variables can be referenced via dot notation. Template variables without corresponding &#x60;context&#x60; values are treated as &#x60;FALSE&#x60; and output nothing.  Ex. &#x60;{ \&quot;name\&quot; : \&quot;George Washington\&quot;, \&quot;state\&quot; : \&quot;VA\&quot; }&#x60;&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;templates:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TemplatesApi apiInstance = new TemplatesApi();
TemplateRenderQuery body = new TemplateRenderQuery(); // TemplateRenderQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostTemplateResponse result = apiInstance.createTemplateRender(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#createTemplateRender");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TemplateRenderQuery**](TemplateRenderQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostTemplateResponse**](PostTemplateResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTemplate"></a>
# **deleteTemplate**
> deleteTemplate(id, revision)

Delete Template

Delete a template with the given template ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;templates:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TemplatesApi apiInstance = new TemplatesApi();
String id = "id_example"; // String | The ID of template
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.deleteTemplate(id, revision);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#deleteTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of template |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTemplate"></a>
# **getTemplate**
> GetTemplateResponse getTemplate(id, revision, fieldsTemplate)

Get Template

Get a template with the given template ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;templates:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TemplatesApi apiInstance = new TemplatesApi();
String id = "id_example"; // String | The ID of template
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsTemplate = Arrays.asList("fieldsTemplate_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetTemplateResponse result = apiInstance.getTemplate(id, revision, fieldsTemplate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#getTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of template |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsTemplate** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, editor_type, html, text, created, updated]

### Return type

[**GetTemplateResponse**](GetTemplateResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTemplates"></a>
# **getTemplates**
> GetTemplateResponseCollection getTemplates(revision, fieldsTemplate, filter, pageCursor, sort)

Get Templates

Get all templates in an account.  Filter to request a subset of all templates. Templates can be sorted by the following fields, in ascending and descending order: &#x60;id&#x60;, &#x60;name&#x60;, &#x60;created&#x60;, &#x60;updated&#x60;  Returns a maximum of 10 results per page.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;templates:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TemplatesApi apiInstance = new TemplatesApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsTemplate = Arrays.asList("fieldsTemplate_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`id`: `any`, `equals`<br>`name`: `any`, `equals`<br>`created`: `equals`, `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`updated`: `equals`, `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
String sort = "sort_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    GetTemplateResponseCollection result = apiInstance.getTemplates(revision, fieldsTemplate, filter, pageCursor, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#getTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsTemplate** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, editor_type, html, text, created, updated]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;id&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;name&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;created&#x60;: &#x60;equals&#x60;, &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;updated&#x60;: &#x60;equals&#x60;, &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]
 **sort** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created, -created, id, -id, name, -name, updated, -updated]

### Return type

[**GetTemplateResponseCollection**](GetTemplateResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTemplate"></a>
# **updateTemplate**
> PatchTemplateResponse updateTemplate(body, revision, id)

Update Template

Update a template with the given template ID. Does not currently update drag &amp; drop templates.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;templates:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TemplatesApi apiInstance = new TemplatesApi();
TemplateUpdateQuery body = new TemplateUpdateQuery(); // TemplateUpdateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | The ID of template
try {
    PatchTemplateResponse result = apiInstance.updateTemplate(body, revision, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#updateTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TemplateUpdateQuery**](TemplateUpdateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**| The ID of template |

### Return type

[**PatchTemplateResponse**](PatchTemplateResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

