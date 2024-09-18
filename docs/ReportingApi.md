# ReportingApi

All URIs are relative to *https://a.klaviyo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**queryCampaignValues**](ReportingApi.md#queryCampaignValues) | **POST** /api/campaign-values-reports/ | Query Campaign Values
[**queryFlowSeries**](ReportingApi.md#queryFlowSeries) | **POST** /api/flow-series-reports/ | Query Flow Series
[**queryFlowValues**](ReportingApi.md#queryFlowValues) | **POST** /api/flow-values-reports/ | Query Flow Values

<a name="queryCampaignValues"></a>
# **queryCampaignValues**
> PostCampaignValuesResponseDTO queryCampaignValues(body, revision, pageCursor)

Query Campaign Values

Returns the requested campaign analytics values data&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;2/m&#x60;&lt;br&gt;Daily: &#x60;225/d&#x60;  **Scopes:** &#x60;campaigns:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReportingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ReportingApi apiInstance = new ReportingApi();
CampaignValuesRequestDTO body = new CampaignValuesRequestDTO(); // CampaignValuesRequestDTO | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    PostCampaignValuesResponseDTO result = apiInstance.queryCampaignValues(body, revision, pageCursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingApi#queryCampaignValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CampaignValuesRequestDTO**](CampaignValuesRequestDTO.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]

### Return type

[**PostCampaignValuesResponseDTO**](PostCampaignValuesResponseDTO.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryFlowSeries"></a>
# **queryFlowSeries**
> PostFlowSeriesResponseDTO queryFlowSeries(body, revision, pageCursor)

Query Flow Series

Returns the requested flow analytics series data&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;2/m&#x60;&lt;br&gt;Daily: &#x60;225/d&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReportingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ReportingApi apiInstance = new ReportingApi();
FlowSeriesRequestDTO body = new FlowSeriesRequestDTO(); // FlowSeriesRequestDTO | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    PostFlowSeriesResponseDTO result = apiInstance.queryFlowSeries(body, revision, pageCursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingApi#queryFlowSeries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FlowSeriesRequestDTO**](FlowSeriesRequestDTO.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]

### Return type

[**PostFlowSeriesResponseDTO**](PostFlowSeriesResponseDTO.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryFlowValues"></a>
# **queryFlowValues**
> PostFlowValuesResponseDTO queryFlowValues(body, revision, pageCursor)

Query Flow Values

Returns the requested flow analytics values data&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;2/m&#x60;&lt;br&gt;Daily: &#x60;225/d&#x60;  **Scopes:** &#x60;flows:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReportingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

ReportingApi apiInstance = new ReportingApi();
FlowValuesRequestDTO body = new FlowValuesRequestDTO(); // FlowValuesRequestDTO | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
try {
    PostFlowValuesResponseDTO result = apiInstance.queryFlowValues(body, revision, pageCursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingApi#queryFlowValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FlowValuesRequestDTO**](FlowValuesRequestDTO.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]

### Return type

[**PostFlowValuesResponseDTO**](PostFlowValuesResponseDTO.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

