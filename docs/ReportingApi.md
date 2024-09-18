# ReportingApi

All URIs are relative to *https://a.klaviyo.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**queryCampaignValues**](ReportingApi.md#queryCampaignValues) | **POST** /api/campaign-values-reports/ | Query Campaign Values |
| [**queryFlowSeries**](ReportingApi.md#queryFlowSeries) | **POST** /api/flow-series-reports/ | Query Flow Series |
| [**queryFlowValues**](ReportingApi.md#queryFlowValues) | **POST** /api/flow-values-reports/ | Query Flow Values |


<a id="queryCampaignValues"></a>
# **queryCampaignValues**
> PostCampaignValuesResponseDTO queryCampaignValues(revision, campaignValuesRequestDTO, pageCursor)

Query Campaign Values

Returns the requested campaign analytics values data&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;2/m&#x60;&lt;br&gt;Daily: &#x60;225/d&#x60;  **Scopes:** &#x60;campaigns:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReportingApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val campaignValuesRequestDTO : CampaignValuesRequestDTO =  // CampaignValuesRequestDTO | 
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    val result : PostCampaignValuesResponseDTO = apiInstance.queryCampaignValues(revision, campaignValuesRequestDTO, pageCursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportingApi#queryCampaignValues")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportingApi#queryCampaignValues")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **campaignValuesRequestDTO** | [**CampaignValuesRequestDTO**](CampaignValuesRequestDTO.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |

### Return type

[**PostCampaignValuesResponseDTO**](PostCampaignValuesResponseDTO.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="queryFlowSeries"></a>
# **queryFlowSeries**
> PostFlowSeriesResponseDTO queryFlowSeries(revision, flowSeriesRequestDTO, pageCursor)

Query Flow Series

Returns the requested flow analytics series data&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;2/m&#x60;&lt;br&gt;Daily: &#x60;225/d&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReportingApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val flowSeriesRequestDTO : FlowSeriesRequestDTO =  // FlowSeriesRequestDTO | 
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    val result : PostFlowSeriesResponseDTO = apiInstance.queryFlowSeries(revision, flowSeriesRequestDTO, pageCursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportingApi#queryFlowSeries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportingApi#queryFlowSeries")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **flowSeriesRequestDTO** | [**FlowSeriesRequestDTO**](FlowSeriesRequestDTO.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |

### Return type

[**PostFlowSeriesResponseDTO**](PostFlowSeriesResponseDTO.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="queryFlowValues"></a>
# **queryFlowValues**
> PostFlowValuesResponseDTO queryFlowValues(revision, flowValuesRequestDTO, pageCursor)

Query Flow Values

Returns the requested flow analytics values data&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;2/m&#x60;&lt;br&gt;Daily: &#x60;225/d&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReportingApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val flowValuesRequestDTO : FlowValuesRequestDTO =  // FlowValuesRequestDTO | 
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    val result : PostFlowValuesResponseDTO = apiInstance.queryFlowValues(revision, flowValuesRequestDTO, pageCursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportingApi#queryFlowValues")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportingApi#queryFlowValues")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **flowValuesRequestDTO** | [**FlowValuesRequestDTO**](FlowValuesRequestDTO.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |

### Return type

[**PostFlowValuesResponseDTO**](PostFlowValuesResponseDTO.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

