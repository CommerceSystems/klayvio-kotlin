# MetricsApi

All URIs are relative to *https://a.klaviyo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMetric**](MetricsApi.md#getMetric) | **GET** /api/metrics/{id}/ | Get Metric
[**getMetrics**](MetricsApi.md#getMetrics) | **GET** /api/metrics/ | Get Metrics
[**queryMetricAggregates**](MetricsApi.md#queryMetricAggregates) | **POST** /api/metric-aggregates/ | Query Metric Aggregates

<a name="getMetric"></a>
# **getMetric**
> GetMetricResponseCompoundDocument getMetric(id, revision, fieldsMetric)

Get Metric

Get a metric with the given metric ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;metrics:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetricsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

MetricsApi apiInstance = new MetricsApi();
String id = "id_example"; // String | Metric ID
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsMetric = Arrays.asList("fieldsMetric_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetMetricResponseCompoundDocument result = apiInstance.getMetric(id, revision, fieldsMetric);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#getMetric");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Metric ID |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsMetric** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, created, updated, integration]

### Return type

[**GetMetricResponseCompoundDocument**](GetMetricResponseCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMetrics"></a>
# **getMetrics**
> GetMetricResponseCollectionCompoundDocument getMetrics(revision, fieldsMetric, filter, pageCursor)

Get Metrics

Get all metrics in an account.  Requests can be filtered by the following fields: integration &#x60;name&#x60;, integration &#x60;category&#x60;  Returns a maximum of 200 results per page.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;metrics:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetricsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

MetricsApi apiInstance = new MetricsApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsMetric = Arrays.asList("fieldsMetric_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`integration.name`: `equals`<br>`integration.category`: `equals`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    GetMetricResponseCollectionCompoundDocument result = apiInstance.getMetrics(revision, fieldsMetric, filter, pageCursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#getMetrics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsMetric** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, created, updated, integration]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;integration.name&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;integration.category&#x60;: &#x60;equals&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]

### Return type

[**GetMetricResponseCollectionCompoundDocument**](GetMetricResponseCollectionCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryMetricAggregates"></a>
# **queryMetricAggregates**
> PostMetricAggregateResponse queryMetricAggregates(body, revision)

Query Metric Aggregates

Query and aggregate event data associated with a metric, including native Klaviyo metrics, integration-specific metrics, and custom events. Queries must be passed in the JSON body of your &#x60;POST&#x60; request.  To request campaign and flow performance data that matches the data shown in Klaviyo&#x27;s UI, we recommend the [Reporting API](https://developers.klaviyo.com/en/reference/reporting_api_overview).  Results can be filtered and grouped by time, event, or profile dimensions.  To learn more about how to use this endpoint, check out our new [Using the Query Metric Aggregates Endpoint guide](https://developers.klaviyo.com/en/docs/using-the-query-metric-aggregates-endpoint).  For a comprehensive list of request body parameters, native Klaviyo metrics, and their associated attributes for grouping and filtering, please refer to the [metrics attributes guide](https://developers.klaviyo.com/en/docs/supported_metrics_and_attributes).&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;metrics:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetricsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

MetricsApi apiInstance = new MetricsApi();
MetricAggregateQuery body = new MetricAggregateQuery(); // MetricAggregateQuery | Retrieve Metric Aggregations
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostMetricAggregateResponse result = apiInstance.queryMetricAggregates(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetricsApi#queryMetricAggregates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MetricAggregateQuery**](MetricAggregateQuery.md)| Retrieve Metric Aggregations |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostMetricAggregateResponse**](PostMetricAggregateResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

