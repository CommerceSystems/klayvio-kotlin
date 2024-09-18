# DataPrivacyApi

All URIs are relative to *https://a.klaviyo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**requestProfileDeletion**](DataPrivacyApi.md#requestProfileDeletion) | **POST** /api/data-privacy-deletion-jobs/ | Request Profile Deletion

<a name="requestProfileDeletion"></a>
# **requestProfileDeletion**
> requestProfileDeletion(body, revision)

Request Profile Deletion

Request a deletion for the profiles corresponding to one of the following identifiers: &#x60;email&#x60;, &#x60;phone_number&#x60;, or &#x60;id&#x60;. If multiple identifiers are provided, we will return an error.  All profiles that match the provided identifier will be deleted.  The deletion occurs asynchronously; however, once it has completed, the deleted profile will appear on the [Deleted Profiles page](https://www.klaviyo.com/account/deleted).  For more information on the deletion process, please refer to our [Help Center docs on how to handle GDPR and CCPA deletion requests](https://help.klaviyo.com/hc/en-us/articles/360004217631-How-to-Handle-GDPR-Requests#record-gdpr-and-ccpa%20%20-deletion-requests2).&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;data-privacy:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataPrivacyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

DataPrivacyApi apiInstance = new DataPrivacyApi();
DataPrivacyCreateDeletionJobQuery body = new DataPrivacyCreateDeletionJobQuery(); // DataPrivacyCreateDeletionJobQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.requestProfileDeletion(body, revision);
} catch (ApiException e) {
    System.err.println("Exception when calling DataPrivacyApi#requestProfileDeletion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DataPrivacyCreateDeletionJobQuery**](DataPrivacyCreateDeletionJobQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

