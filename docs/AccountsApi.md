# AccountsApi

All URIs are relative to *https://a.klaviyo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccount**](AccountsApi.md#getAccount) | **GET** /api/accounts/{id}/ | Get Account
[**getAccounts**](AccountsApi.md#getAccounts) | **GET** /api/accounts/ | Get Accounts

<a name="getAccount"></a>
# **getAccount**
> GetAccountResponse getAccount(id, revision, fieldsAccount)

Get Account

Retrieve a single account object by its account ID. You can only request the account by which the private API key was generated.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;  **Scopes:** &#x60;accounts:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

AccountsApi apiInstance = new AccountsApi();
String id = "id_example"; // String | The ID of the account
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsAccount = Arrays.asList("fieldsAccount_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetAccountResponse result = apiInstance.getAccount(id, revision, fieldsAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the account |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsAccount** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: test_account, contact_information, contact_information.default_sender_name, contact_information.default_sender_email, contact_information.website_url, contact_information.organization_name, contact_information.street_address, contact_information.street_address.address1, contact_information.street_address.address2, contact_information.street_address.city, contact_information.street_address.region, contact_information.street_address.country, contact_information.street_address.zip, industry, timezone, preferred_currency, public_api_key, locale]

### Return type

[**GetAccountResponse**](GetAccountResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccounts"></a>
# **getAccounts**
> GetAccountResponseCollection getAccounts(revision, fieldsAccount)

Get Accounts

Retrieve the account(s) associated with a given private API key. This will return 1 account object within the array.  You can use this to retrieve account-specific data (contact information, timezone, currency, Public API key, etc.) or test if a Private API Key belongs to the correct account prior to performing subsequent actions with the API.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;  **Scopes:** &#x60;accounts:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

AccountsApi apiInstance = new AccountsApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsAccount = Arrays.asList("fieldsAccount_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetAccountResponseCollection result = apiInstance.getAccounts(revision, fieldsAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsAccount** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: test_account, contact_information, contact_information.default_sender_name, contact_information.default_sender_email, contact_information.website_url, contact_information.organization_name, contact_information.street_address, contact_information.street_address.address1, contact_information.street_address.address2, contact_information.street_address.city, contact_information.street_address.region, contact_information.street_address.country, contact_information.street_address.zip, industry, timezone, preferred_currency, public_api_key, locale]

### Return type

[**GetAccountResponseCollection**](GetAccountResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

