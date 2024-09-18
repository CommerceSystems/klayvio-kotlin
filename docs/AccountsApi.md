# AccountsApi

All URIs are relative to *https://a.klaviyo.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getAccount**](AccountsApi.md#getAccount) | **GET** /api/accounts/{id}/ | Get Account |
| [**getAccounts**](AccountsApi.md#getAccounts) | **GET** /api/accounts/ | Get Accounts |


<a id="getAccount"></a>
# **getAccount**
> GetAccountResponse getAccount(id, revision, fieldsAccount)

Get Account

Retrieve a single account object by its account ID. You can only request the account by which the private API key was generated.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;  **Scopes:** &#x60;accounts:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val id : kotlin.String = AbC123 // kotlin.String | The ID of the account
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsAccount : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetAccountResponse = apiInstance.getAccount(id, revision, fieldsAccount)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getAccount")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The ID of the account | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsAccount** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: test_account, contact_information, contact_information.default_sender_name, contact_information.default_sender_email, contact_information.website_url, contact_information.organization_name, contact_information.street_address, contact_information.street_address.address1, contact_information.street_address.address2, contact_information.street_address.city, contact_information.street_address.region, contact_information.street_address.country, contact_information.street_address.zip, industry, timezone, preferred_currency, public_api_key, locale] |

### Return type

[**GetAccountResponse**](GetAccountResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAccounts"></a>
# **getAccounts**
> GetAccountResponseCollection getAccounts(revision, fieldsAccount)

Get Accounts

Retrieve the account(s) associated with a given private API key. This will return 1 account object within the array.  You can use this to retrieve account-specific data (contact information, timezone, currency, Public API key, etc.) or test if a Private API Key belongs to the correct account prior to performing subsequent actions with the API.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;  **Scopes:** &#x60;accounts:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsAccount : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetAccountResponseCollection = apiInstance.getAccounts(revision, fieldsAccount)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getAccounts")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsAccount** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: test_account, contact_information, contact_information.default_sender_name, contact_information.default_sender_email, contact_information.website_url, contact_information.organization_name, contact_information.street_address, contact_information.street_address.address1, contact_information.street_address.address2, contact_information.street_address.city, contact_information.street_address.region, contact_information.street_address.country, contact_information.street_address.zip, industry, timezone, preferred_currency, public_api_key, locale] |

### Return type

[**GetAccountResponseCollection**](GetAccountResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

