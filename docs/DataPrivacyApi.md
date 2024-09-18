# DataPrivacyApi

All URIs are relative to *https://a.klaviyo.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**requestProfileDeletion**](DataPrivacyApi.md#requestProfileDeletion) | **POST** /api/data-privacy-deletion-jobs/ | Request Profile Deletion |


<a id="requestProfileDeletion"></a>
# **requestProfileDeletion**
> requestProfileDeletion(revision, dataPrivacyCreateDeletionJobQuery)

Request Profile Deletion

Request a deletion for the profiles corresponding to one of the following identifiers: &#x60;email&#x60;, &#x60;phone_number&#x60;, or &#x60;id&#x60;. If multiple identifiers are provided, we will return an error.  All profiles that match the provided identifier will be deleted.  The deletion occurs asynchronously; however, once it has completed, the deleted profile will appear on the [Deleted Profiles page](https://www.klaviyo.com/account/deleted).  For more information on the deletion process, please refer to our [Help Center docs on how to handle GDPR and CCPA deletion requests](https://help.klaviyo.com/hc/en-us/articles/360004217631-How-to-Handle-GDPR-Requests#record-gdpr-and-ccpa%20%20-deletion-requests2).&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;data-privacy:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DataPrivacyApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val dataPrivacyCreateDeletionJobQuery : DataPrivacyCreateDeletionJobQuery =  // DataPrivacyCreateDeletionJobQuery | 
try {
    apiInstance.requestProfileDeletion(revision, dataPrivacyCreateDeletionJobQuery)
} catch (e: ClientException) {
    println("4xx response calling DataPrivacyApi#requestProfileDeletion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DataPrivacyApi#requestProfileDeletion")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dataPrivacyCreateDeletionJobQuery** | [**DataPrivacyCreateDeletionJobQuery**](DataPrivacyCreateDeletionJobQuery.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

