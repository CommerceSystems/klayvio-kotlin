# MetricsApi

All URIs are relative to *https://a.klaviyo.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getMetric**](MetricsApi.md#getMetric) | **GET** /api/metrics/{id}/ | Get Metric |
| [**getMetrics**](MetricsApi.md#getMetrics) | **GET** /api/metrics/ | Get Metrics |
| [**queryMetricAggregates**](MetricsApi.md#queryMetricAggregates) | **POST** /api/metric-aggregates/ | Query Metric Aggregates |


<a id="getMetric"></a>
# **getMetric**
> GetMetricResponseCompoundDocument getMetric(id, revision, fieldsMetric)

Get Metric

Get a metric with the given metric ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;metrics:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MetricsApi()
val id : kotlin.String = id_example // kotlin.String | Metric ID
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsMetric : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetMetricResponseCompoundDocument = apiInstance.getMetric(id, revision, fieldsMetric)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetricsApi#getMetric")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetricsApi#getMetric")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| Metric ID | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsMetric** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, created, updated, integration] |

### Return type

[**GetMetricResponseCompoundDocument**](GetMetricResponseCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getMetrics"></a>
# **getMetrics**
> GetMetricResponseCollectionCompoundDocument getMetrics(revision, fieldsMetric, filter, pageCursor)

Get Metrics

Get all metrics in an account.  Requests can be filtered by the following fields: integration &#x60;name&#x60;, integration &#x60;category&#x60;  Returns a maximum of 200 results per page.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;metrics:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MetricsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsMetric : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`integration.name`: `equals`<br>`integration.category`: `equals`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    val result : GetMetricResponseCollectionCompoundDocument = apiInstance.getMetrics(revision, fieldsMetric, filter, pageCursor)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetricsApi#getMetrics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetricsApi#getMetrics")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsMetric** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, created, updated, integration] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;integration.name&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;integration.category&#x60;: &#x60;equals&#x60; | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |

### Return type

[**GetMetricResponseCollectionCompoundDocument**](GetMetricResponseCollectionCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="queryMetricAggregates"></a>
# **queryMetricAggregates**
> PostMetricAggregateResponse queryMetricAggregates(revision, metricAggregateQuery)

Query Metric Aggregates

Query and aggregate event data associated with a metric, including native Klaviyo metrics, integration-specific metrics, and custom events. Queries must be passed in the JSON body of your &#x60;POST&#x60; request.  To request campaign and flow performance data that matches the data shown in Klaviyo&#39;s UI, we recommend the [Reporting API](https://developers.klaviyo.com/en/reference/reporting_api_overview).  Results can be filtered and grouped by time, event, or profile dimensions.  To learn more about how to use this endpoint, check out our new [Using the Query Metric Aggregates Endpoint guide](https://developers.klaviyo.com/en/docs/using-the-query-metric-aggregates-endpoint).  For a comprehensive list of request body parameters, native Klaviyo metrics, and their associated attributes for grouping and filtering, please refer to the [metrics attributes guide](https://developers.klaviyo.com/en/docs/supported_metrics_and_attributes).&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;metrics:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MetricsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val metricAggregateQuery : MetricAggregateQuery =  // MetricAggregateQuery | Retrieve Metric Aggregations
try {
    val result : PostMetricAggregateResponse = apiInstance.queryMetricAggregates(revision, metricAggregateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetricsApi#queryMetricAggregates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetricsApi#queryMetricAggregates")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **metricAggregateQuery** | [**MetricAggregateQuery**](MetricAggregateQuery.md)| Retrieve Metric Aggregations | |

### Return type

[**PostMetricAggregateResponse**](PostMetricAggregateResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

