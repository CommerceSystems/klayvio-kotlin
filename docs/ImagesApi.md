# ImagesApi

All URIs are relative to *https://a.klaviyo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getImage**](ImagesApi.md#getImage) | **GET** /api/images/{id}/ | Get Image
[**getImages**](ImagesApi.md#getImages) | **GET** /api/images/ | Get Images
[**updateImage**](ImagesApi.md#updateImage) | **PATCH** /api/images/{id}/ | Update Image
[**uploadImageFromFile**](ImagesApi.md#uploadImageFromFile) | **POST** /api/image-upload/ | Upload Image From File
[**uploadImageFromUrl**](ImagesApi.md#uploadImageFromUrl) | **POST** /api/images/ | Upload Image From URL

<a name="getImage"></a>
# **getImage**
> GetImageResponse getImage(id, revision, fieldsImage)

Get Image

Get the image with the given image ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;images:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ImagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ImagesApi apiInstance = new ImagesApi();
String id = "id_example"; // String | The ID of the image
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsImage = Arrays.asList("fieldsImage_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetImageResponse result = apiInstance.getImage(id, revision, fieldsImage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImagesApi#getImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the image |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsImage** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, image_url, format, size, hidden, updated_at]

### Return type

[**GetImageResponse**](GetImageResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getImages"></a>
# **getImages**
> GetImageResponseCollection getImages(revision, fieldsImage, filter, pageCursor, pageSize, sort)

Get Images

Get all images in an account.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;images:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ImagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ImagesApi apiInstance = new ImagesApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsImage = Arrays.asList("fieldsImage_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`id`: `any`, `equals`<br>`updated_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`format`: `any`, `equals`<br>`name`: `any`, `contains`, `ends-with`, `equals`, `starts-with`<br>`size`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`hidden`: `any`, `equals`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
Integer pageSize = 20; // Integer | Default: 20. Min: 1. Max: 100.
String sort = "sort_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    GetImageResponseCollection result = apiInstance.getImages(revision, fieldsImage, filter, pageCursor, pageSize, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImagesApi#getImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsImage** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, image_url, format, size, hidden, updated_at]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;id&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;updated_at&#x60;: &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;format&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;name&#x60;: &#x60;any&#x60;, &#x60;contains&#x60;, &#x60;ends-with&#x60;, &#x60;equals&#x60;, &#x60;starts-with&#x60;&lt;br&gt;&#x60;size&#x60;: &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;hidden&#x60;: &#x60;any&#x60;, &#x60;equals&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]
 **pageSize** | **Integer**| Default: 20. Min: 1. Max: 100. | [optional] [default to 20] [enum: 1, 100]
 **sort** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: format, -format, id, -id, name, -name, size, -size, updated_at, -updated_at]

### Return type

[**GetImageResponseCollection**](GetImageResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateImage"></a>
# **updateImage**
> PatchImageResponse updateImage(body, revision, id)

Update Image

Update the image with the given image ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;images:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ImagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ImagesApi apiInstance = new ImagesApi();
ImagePartialUpdateQuery body = new ImagePartialUpdateQuery(); // ImagePartialUpdateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | The ID of the image
try {
    PatchImageResponse result = apiInstance.updateImage(body, revision, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImagesApi#updateImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ImagePartialUpdateQuery**](ImagePartialUpdateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**| The ID of the image |

### Return type

[**PatchImageResponse**](PatchImageResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadImageFromFile"></a>
# **uploadImageFromFile**
> PostImageResponse uploadImageFromFile(file, name, hidden, revision)

Upload Image From File

Upload an image from a file.  If you want to import an image from an existing url or a data uri, use the Upload Image From URL endpoint instead.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;100/m&#x60;&lt;br&gt;Daily: &#x60;100/d&#x60;  **Scopes:** &#x60;images:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ImagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ImagesApi apiInstance = new ImagesApi();
File file = new File("file_example"); // File | 
String name = "name_example"; // String | 
Boolean hidden = true; // Boolean | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostImageResponse result = apiInstance.uploadImageFromFile(file, name, hidden, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImagesApi#uploadImageFromFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  |
 **name** | **String**|  |
 **hidden** | **Boolean**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostImageResponse**](PostImageResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="uploadImageFromUrl"></a>
# **uploadImageFromUrl**
> PostImageResponse uploadImageFromUrl(body, revision)

Upload Image From URL

Import an image from a url or data uri.  If you want to upload an image from a file, use the Upload Image From File endpoint instead.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;100/m&#x60;&lt;br&gt;Daily: &#x60;100/d&#x60;  **Scopes:** &#x60;images:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ImagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ImagesApi apiInstance = new ImagesApi();
ImageCreateQuery body = new ImageCreateQuery(); // ImageCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostImageResponse result = apiInstance.uploadImageFromUrl(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImagesApi#uploadImageFromUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ImageCreateQuery**](ImageCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostImageResponse**](PostImageResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

