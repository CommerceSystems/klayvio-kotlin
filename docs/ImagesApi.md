# ImagesApi

All URIs are relative to *https://a.klaviyo.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getImage**](ImagesApi.md#getImage) | **GET** /api/images/{id}/ | Get Image |
| [**getImages**](ImagesApi.md#getImages) | **GET** /api/images/ | Get Images |
| [**updateImage**](ImagesApi.md#updateImage) | **PATCH** /api/images/{id}/ | Update Image |
| [**uploadImageFromFile**](ImagesApi.md#uploadImageFromFile) | **POST** /api/image-upload/ | Upload Image From File |
| [**uploadImageFromUrl**](ImagesApi.md#uploadImageFromUrl) | **POST** /api/images/ | Upload Image From URL |


<a id="getImage"></a>
# **getImage**
> GetImageResponse getImage(id, revision, fieldsImage)

Get Image

Get the image with the given image ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;images:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ImagesApi()
val id : kotlin.String = 7 // kotlin.String | The ID of the image
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsImage : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetImageResponse = apiInstance.getImage(id, revision, fieldsImage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#getImage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#getImage")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The ID of the image | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsImage** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, image_url, format, size, hidden, updated_at] |

### Return type

[**GetImageResponse**](GetImageResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getImages"></a>
# **getImages**
> GetImageResponseCollection getImages(revision, fieldsImage, filter, pageCursor, pageSize, sort)

Get Images

Get all images in an account.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;images:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ImagesApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsImage : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`id`: `any`, `equals`<br>`updated_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`format`: `any`, `equals`<br>`name`: `any`, `contains`, `ends-with`, `equals`, `starts-with`<br>`size`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`hidden`: `any`, `equals`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val pageSize : kotlin.Int = 56 // kotlin.Int | Default: 20. Min: 1. Max: 100.
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetImageResponseCollection = apiInstance.getImages(revision, fieldsImage, filter, pageCursor, pageSize, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#getImages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#getImages")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsImage** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, image_url, format, size, hidden, updated_at] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;id&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;updated_at&#x60;: &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;format&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;name&#x60;: &#x60;any&#x60;, &#x60;contains&#x60;, &#x60;ends-with&#x60;, &#x60;equals&#x60;, &#x60;starts-with&#x60;&lt;br&gt;&#x60;size&#x60;: &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;hidden&#x60;: &#x60;any&#x60;, &#x60;equals&#x60; | [optional] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| **pageSize** | **kotlin.Int**| Default: 20. Min: 1. Max: 100. | [optional] [default to 20] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: format, -format, id, -id, name, -name, size, -size, updated_at, -updated_at] |

### Return type

[**GetImageResponseCollection**](GetImageResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateImage"></a>
# **updateImage**
> PatchImageResponse updateImage(id, revision, imagePartialUpdateQuery)

Update Image

Update the image with the given image ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;images:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ImagesApi()
val id : kotlin.String = 7 // kotlin.String | The ID of the image
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val imagePartialUpdateQuery : ImagePartialUpdateQuery =  // ImagePartialUpdateQuery | 
try {
    val result : PatchImageResponse = apiInstance.updateImage(id, revision, imagePartialUpdateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#updateImage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#updateImage")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The ID of the image | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **imagePartialUpdateQuery** | [**ImagePartialUpdateQuery**](ImagePartialUpdateQuery.md)|  | |

### Return type

[**PatchImageResponse**](PatchImageResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="uploadImageFromFile"></a>
# **uploadImageFromFile**
> PostImageResponse uploadImageFromFile(revision, file, name, hidden)

Upload Image From File

Upload an image from a file.  If you want to import an image from an existing url or a data uri, use the Upload Image From URL endpoint instead.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;100/m&#x60;&lt;br&gt;Daily: &#x60;100/d&#x60;  **Scopes:** &#x60;images:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ImagesApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The image file to upload. Supported image formats: jpeg,png,gif. Maximum image size: 5MB.
val name : kotlin.String = name_example // kotlin.String | A name for the image.  Defaults to the filename if not provided.  If the name matches an existing image, a suffix will be added.
val hidden : kotlin.Boolean = true // kotlin.Boolean | If true, this image is not shown in the asset library.
try {
    val result : PostImageResponse = apiInstance.uploadImageFromFile(revision, file, name, hidden)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#uploadImageFromFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#uploadImageFromFile")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **file** | **java.io.File**| The image file to upload. Supported image formats: jpeg,png,gif. Maximum image size: 5MB. | |
| **name** | **kotlin.String**| A name for the image.  Defaults to the filename if not provided.  If the name matches an existing image, a suffix will be added. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **hidden** | **kotlin.Boolean**| If true, this image is not shown in the asset library. | [optional] [default to false] |

### Return type

[**PostImageResponse**](PostImageResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="uploadImageFromUrl"></a>
# **uploadImageFromUrl**
> PostImageResponse uploadImageFromUrl(revision, imageCreateQuery)

Upload Image From URL

Import an image from a url or data uri.  If you want to upload an image from a file, use the Upload Image From File endpoint instead.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;100/m&#x60;&lt;br&gt;Daily: &#x60;100/d&#x60;  **Scopes:** &#x60;images:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ImagesApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val imageCreateQuery : ImageCreateQuery =  // ImageCreateQuery | 
try {
    val result : PostImageResponse = apiInstance.uploadImageFromUrl(revision, imageCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#uploadImageFromUrl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#uploadImageFromUrl")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **imageCreateQuery** | [**ImageCreateQuery**](ImageCreateQuery.md)|  | |

### Return type

[**PostImageResponse**](PostImageResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

