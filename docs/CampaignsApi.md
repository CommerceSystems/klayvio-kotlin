# CampaignsApi

All URIs are relative to *https://a.klaviyo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCampaign**](CampaignsApi.md#createCampaign) | **POST** /api/campaigns/ | Create Campaign
[**createCampaignClone**](CampaignsApi.md#createCampaignClone) | **POST** /api/campaign-clone/ | Create Campaign Clone
[**createCampaignMessageAssignTemplate**](CampaignsApi.md#createCampaignMessageAssignTemplate) | **POST** /api/campaign-message-assign-template/ | Assign Campaign Message Template
[**createCampaignRecipientEstimationJob**](CampaignsApi.md#createCampaignRecipientEstimationJob) | **POST** /api/campaign-recipient-estimation-jobs/ | Create Campaign Recipient Estimation Job
[**createCampaignSendJob**](CampaignsApi.md#createCampaignSendJob) | **POST** /api/campaign-send-jobs/ | Create Campaign Send Job
[**deleteCampaign**](CampaignsApi.md#deleteCampaign) | **DELETE** /api/campaigns/{id}/ | Delete Campaign
[**getCampaign**](CampaignsApi.md#getCampaign) | **GET** /api/campaigns/{id}/ | Get Campaign
[**getCampaignCampaignMessages**](CampaignsApi.md#getCampaignCampaignMessages) | **GET** /api/campaigns/{id}/campaign-messages/ | Get Campaign Campaign Messages
[**getCampaignMessage**](CampaignsApi.md#getCampaignMessage) | **GET** /api/campaign-messages/{id}/ | Get Campaign Message
[**getCampaignMessageCampaign**](CampaignsApi.md#getCampaignMessageCampaign) | **GET** /api/campaign-messages/{id}/campaign/ | Get Campaign Message Campaign
[**getCampaignMessageRelationshipsCampaign**](CampaignsApi.md#getCampaignMessageRelationshipsCampaign) | **GET** /api/campaign-messages/{id}/relationships/campaign/ | Get Campaign Message Relationships Campaign
[**getCampaignMessageRelationshipsTemplate**](CampaignsApi.md#getCampaignMessageRelationshipsTemplate) | **GET** /api/campaign-messages/{id}/relationships/template/ | Get Campaign Message Relationships Template
[**getCampaignMessageTemplate**](CampaignsApi.md#getCampaignMessageTemplate) | **GET** /api/campaign-messages/{id}/template/ | Get Campaign Message Template
[**getCampaignRecipientEstimation**](CampaignsApi.md#getCampaignRecipientEstimation) | **GET** /api/campaign-recipient-estimations/{id}/ | Get Campaign Recipient Estimation
[**getCampaignRecipientEstimationJob**](CampaignsApi.md#getCampaignRecipientEstimationJob) | **GET** /api/campaign-recipient-estimation-jobs/{id}/ | Get Campaign Recipient Estimation Job
[**getCampaignRelationshipsCampaignMessages**](CampaignsApi.md#getCampaignRelationshipsCampaignMessages) | **GET** /api/campaigns/{id}/relationships/campaign-messages/ | Get Campaign Relationships Campaign Messages
[**getCampaignRelationshipsTags**](CampaignsApi.md#getCampaignRelationshipsTags) | **GET** /api/campaigns/{id}/relationships/tags/ | Get Campaign Relationships Tags
[**getCampaignSendJob**](CampaignsApi.md#getCampaignSendJob) | **GET** /api/campaign-send-jobs/{id}/ | Get Campaign Send Job
[**getCampaignTags**](CampaignsApi.md#getCampaignTags) | **GET** /api/campaigns/{id}/tags/ | Get Campaign Tags
[**getCampaigns**](CampaignsApi.md#getCampaigns) | **GET** /api/campaigns/ | Get Campaigns
[**updateCampaign**](CampaignsApi.md#updateCampaign) | **PATCH** /api/campaigns/{id}/ | Update Campaign
[**updateCampaignMessage**](CampaignsApi.md#updateCampaignMessage) | **PATCH** /api/campaign-messages/{id}/ | Update Campaign Message
[**updateCampaignSendJob**](CampaignsApi.md#updateCampaignSendJob) | **PATCH** /api/campaign-send-jobs/{id}/ | Update Campaign Send Job

<a name="createCampaign"></a>
# **createCampaign**
> PostCampaignResponse createCampaign(body, revision)

Create Campaign

Creates a campaign given a set of parameters, then returns it.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
CampaignCreateQuery body = new CampaignCreateQuery(); // CampaignCreateQuery | Creates a campaign from parameters
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostCampaignResponse result = apiInstance.createCampaign(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#createCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CampaignCreateQuery**](CampaignCreateQuery.md)| Creates a campaign from parameters |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostCampaignResponse**](PostCampaignResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCampaignClone"></a>
# **createCampaignClone**
> PostCampaignResponse createCampaignClone(body, revision)

Create Campaign Clone

Clones an existing campaign, returning a new campaign based on the original with a new ID and name.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
CampaignCloneQuery body = new CampaignCloneQuery(); // CampaignCloneQuery | Clones a campaign from an existing campaign
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostCampaignResponse result = apiInstance.createCampaignClone(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#createCampaignClone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CampaignCloneQuery**](CampaignCloneQuery.md)| Clones a campaign from an existing campaign |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostCampaignResponse**](PostCampaignResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCampaignMessageAssignTemplate"></a>
# **createCampaignMessageAssignTemplate**
> PostCampaignMessageResponse createCampaignMessageAssignTemplate(body, revision)

Assign Campaign Message Template

Creates a non-reusable version of the template and assigns it to the message.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
CampaignMessageAssignTemplateQuery body = new CampaignMessageAssignTemplateQuery(); // CampaignMessageAssignTemplateQuery | Takes a reusable template, clones it, and assigns the non-reusable clone to the message.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostCampaignMessageResponse result = apiInstance.createCampaignMessageAssignTemplate(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#createCampaignMessageAssignTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CampaignMessageAssignTemplateQuery**](CampaignMessageAssignTemplateQuery.md)| Takes a reusable template, clones it, and assigns the non-reusable clone to the message. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostCampaignMessageResponse**](PostCampaignMessageResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCampaignRecipientEstimationJob"></a>
# **createCampaignRecipientEstimationJob**
> PostCampaignRecipientEstimationJobResponse createCampaignRecipientEstimationJob(body, revision)

Create Campaign Recipient Estimation Job

Trigger an asynchronous job to update the estimated number of recipients for the given campaign ID. Use the &#x60;Get Campaign Recipient Estimation Job&#x60; endpoint to retrieve the status of this estimation job. Use the &#x60;Get Campaign Recipient Estimation&#x60; endpoint to retrieve the estimated recipient count for a given campaign.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
CampaignRecipientEstimationJobCreateQuery body = new CampaignRecipientEstimationJobCreateQuery(); // CampaignRecipientEstimationJobCreateQuery | Trigger an asynchronous job to update the estimated number of recipients
for the given campaign ID. Use the `Get Campaign Recipient Estimation
Job` endpoint to retrieve the status of this estimation job. Use the
`Get Campaign Recipient Estimation` endpoint to retrieve the estimated
recipient count for a given campaign.
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostCampaignRecipientEstimationJobResponse result = apiInstance.createCampaignRecipientEstimationJob(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#createCampaignRecipientEstimationJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CampaignRecipientEstimationJobCreateQuery**](CampaignRecipientEstimationJobCreateQuery.md)| Trigger an asynchronous job to update the estimated number of recipients
for the given campaign ID. Use the &#x60;Get Campaign Recipient Estimation
Job&#x60; endpoint to retrieve the status of this estimation job. Use the
&#x60;Get Campaign Recipient Estimation&#x60; endpoint to retrieve the estimated
recipient count for a given campaign. |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostCampaignRecipientEstimationJobResponse**](PostCampaignRecipientEstimationJobResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCampaignSendJob"></a>
# **createCampaignSendJob**
> PostCampaignSendJobResponse createCampaignSendJob(body, revision)

Create Campaign Send Job

Trigger a campaign to send asynchronously&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
CampaignSendJobCreateQuery body = new CampaignSendJobCreateQuery(); // CampaignSendJobCreateQuery | Trigger the campaign to send asynchronously
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostCampaignSendJobResponse result = apiInstance.createCampaignSendJob(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#createCampaignSendJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CampaignSendJobCreateQuery**](CampaignSendJobCreateQuery.md)| Trigger the campaign to send asynchronously |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostCampaignSendJobResponse**](PostCampaignSendJobResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCampaign"></a>
# **deleteCampaign**
> deleteCampaign(id, revision)

Delete Campaign

Delete a campaign with the given campaign ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
String id = "id_example"; // String | The campaign ID to be deleted
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.deleteCampaign(id, revision);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#deleteCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The campaign ID to be deleted |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCampaign"></a>
# **getCampaign**
> GetCampaignResponseCompoundDocument getCampaign(id, revision, fieldsCampaignMessage, fieldsCampaign, fieldsTag, include)

Get Campaign

Returns a specific campaign based on a required id.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
String id = "id_example"; // String | The campaign ID to be retrieved
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCampaignMessage = Arrays.asList("fieldsCampaignMessage_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsCampaign = Arrays.asList("fieldsCampaign_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsTag = Arrays.asList("fieldsTag_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    GetCampaignResponseCompoundDocument result = apiInstance.getCampaign(id, revision, fieldsCampaignMessage, fieldsCampaign, fieldsTag, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The campaign ID to be retrieved |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCampaignMessage** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: label, channel, content, send_times, render_options, render_options.shorten_links, render_options.add_org_prefix, render_options.add_info_link, render_options.add_opt_out_language, created_at, updated_at]
 **fieldsCampaign** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, status, archived, audiences, audiences.included, audiences.excluded, send_options, tracking_options, send_strategy, send_strategy.method, send_strategy.options_static, send_strategy.options_static.datetime, send_strategy.options_static.is_local, send_strategy.options_static.send_past_recipients_immediately, send_strategy.options_throttled, send_strategy.options_throttled.datetime, send_strategy.options_throttled.throttle_percentage, send_strategy.options_sto, send_strategy.options_sto.date, created_at, scheduled_at, updated_at, send_time]
 **fieldsTag** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: campaign-messages, tags]

### Return type

[**GetCampaignResponseCompoundDocument**](GetCampaignResponseCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCampaignCampaignMessages"></a>
# **getCampaignCampaignMessages**
> GetCampaignMessageResponseCollectionCompoundDocument getCampaignCampaignMessages(id, revision, fieldsCampaignMessage, fieldsCampaign, fieldsTemplate, include)

Get Campaign Campaign Messages

Return all messages that belong to the given campaign.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCampaignMessage = Arrays.asList("fieldsCampaignMessage_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsCampaign = Arrays.asList("fieldsCampaign_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsTemplate = Arrays.asList("fieldsTemplate_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    GetCampaignMessageResponseCollectionCompoundDocument result = apiInstance.getCampaignCampaignMessages(id, revision, fieldsCampaignMessage, fieldsCampaign, fieldsTemplate, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaignCampaignMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCampaignMessage** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: label, channel, content, send_times, render_options, render_options.shorten_links, render_options.add_org_prefix, render_options.add_info_link, render_options.add_opt_out_language, created_at, updated_at]
 **fieldsCampaign** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, status, archived, audiences, audiences.included, audiences.excluded, send_options, tracking_options, send_strategy, send_strategy.method, send_strategy.options_static, send_strategy.options_static.datetime, send_strategy.options_static.is_local, send_strategy.options_static.send_past_recipients_immediately, send_strategy.options_throttled, send_strategy.options_throttled.datetime, send_strategy.options_throttled.throttle_percentage, send_strategy.options_sto, send_strategy.options_sto.date, created_at, scheduled_at, updated_at, send_time]
 **fieldsTemplate** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, editor_type, html, text, created, updated]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: campaign, template]

### Return type

[**GetCampaignMessageResponseCollectionCompoundDocument**](GetCampaignMessageResponseCollectionCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCampaignMessage"></a>
# **getCampaignMessage**
> GetCampaignMessageResponseCompoundDocument getCampaignMessage(id, revision, fieldsCampaignMessage, fieldsCampaign, fieldsTemplate, include)

Get Campaign Message

Returns a specific message based on a required id.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
String id = "id_example"; // String | The message ID to be retrieved
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCampaignMessage = Arrays.asList("fieldsCampaignMessage_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsCampaign = Arrays.asList("fieldsCampaign_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsTemplate = Arrays.asList("fieldsTemplate_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    GetCampaignMessageResponseCompoundDocument result = apiInstance.getCampaignMessage(id, revision, fieldsCampaignMessage, fieldsCampaign, fieldsTemplate, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaignMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The message ID to be retrieved |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCampaignMessage** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: label, channel, content, send_times, render_options, render_options.shorten_links, render_options.add_org_prefix, render_options.add_info_link, render_options.add_opt_out_language, created_at, updated_at]
 **fieldsCampaign** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, status, archived, audiences, audiences.included, audiences.excluded, send_options, tracking_options, send_strategy, send_strategy.method, send_strategy.options_static, send_strategy.options_static.datetime, send_strategy.options_static.is_local, send_strategy.options_static.send_past_recipients_immediately, send_strategy.options_throttled, send_strategy.options_throttled.datetime, send_strategy.options_throttled.throttle_percentage, send_strategy.options_sto, send_strategy.options_sto.date, created_at, scheduled_at, updated_at, send_time]
 **fieldsTemplate** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, editor_type, html, text, created, updated]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: campaign, template]

### Return type

[**GetCampaignMessageResponseCompoundDocument**](GetCampaignMessageResponseCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCampaignMessageCampaign"></a>
# **getCampaignMessageCampaign**
> GetCampaignResponse getCampaignMessageCampaign(id, revision, fieldsCampaign)

Get Campaign Message Campaign

Return the related campaign&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCampaign = Arrays.asList("fieldsCampaign_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetCampaignResponse result = apiInstance.getCampaignMessageCampaign(id, revision, fieldsCampaign);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaignMessageCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCampaign** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, status, archived, audiences, audiences.included, audiences.excluded, send_options, tracking_options, send_strategy, send_strategy.method, send_strategy.options_static, send_strategy.options_static.datetime, send_strategy.options_static.is_local, send_strategy.options_static.send_past_recipients_immediately, send_strategy.options_throttled, send_strategy.options_throttled.datetime, send_strategy.options_throttled.throttle_percentage, send_strategy.options_sto, send_strategy.options_sto.date, created_at, scheduled_at, updated_at, send_time]

### Return type

[**GetCampaignResponse**](GetCampaignResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCampaignMessageRelationshipsCampaign"></a>
# **getCampaignMessageRelationshipsCampaign**
> GetCampaignMessageCampaignRelationshipListResponse getCampaignMessageRelationshipsCampaign(id, revision)

Get Campaign Message Relationships Campaign

Returns the ID of the related campaign&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    GetCampaignMessageCampaignRelationshipListResponse result = apiInstance.getCampaignMessageRelationshipsCampaign(id, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaignMessageRelationshipsCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**GetCampaignMessageCampaignRelationshipListResponse**](GetCampaignMessageCampaignRelationshipListResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCampaignMessageRelationshipsTemplate"></a>
# **getCampaignMessageRelationshipsTemplate**
> GetCampaignMessageTemplateRelationshipListResponse getCampaignMessageRelationshipsTemplate(id, revision)

Get Campaign Message Relationships Template

Returns the ID of the related template&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60; &#x60;templates:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    GetCampaignMessageTemplateRelationshipListResponse result = apiInstance.getCampaignMessageRelationshipsTemplate(id, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaignMessageRelationshipsTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**GetCampaignMessageTemplateRelationshipListResponse**](GetCampaignMessageTemplateRelationshipListResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCampaignMessageTemplate"></a>
# **getCampaignMessageTemplate**
> GetTemplateResponse getCampaignMessageTemplate(id, revision, fieldsTemplate)

Get Campaign Message Template

Return the related template&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60; &#x60;templates:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsTemplate = Arrays.asList("fieldsTemplate_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetTemplateResponse result = apiInstance.getCampaignMessageTemplate(id, revision, fieldsTemplate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaignMessageTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsTemplate** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, editor_type, html, text, created, updated]

### Return type

[**GetTemplateResponse**](GetTemplateResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCampaignRecipientEstimation"></a>
# **getCampaignRecipientEstimation**
> GetCampaignRecipientEstimationResponse getCampaignRecipientEstimation(id, revision, fieldsCampaignRecipientEstimation)

Get Campaign Recipient Estimation

Get the estimated recipient count for a campaign with the provided campaign ID. You can refresh this count by using the &#x60;Create Campaign Recipient Estimation Job&#x60; endpoint.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
String id = "id_example"; // String | The ID of the campaign for which to get the estimated number of recipients
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCampaignRecipientEstimation = Arrays.asList("fieldsCampaignRecipientEstimation_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetCampaignRecipientEstimationResponse result = apiInstance.getCampaignRecipientEstimation(id, revision, fieldsCampaignRecipientEstimation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaignRecipientEstimation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the campaign for which to get the estimated number of recipients |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCampaignRecipientEstimation** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: estimated_recipient_count]

### Return type

[**GetCampaignRecipientEstimationResponse**](GetCampaignRecipientEstimationResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCampaignRecipientEstimationJob"></a>
# **getCampaignRecipientEstimationJob**
> GetCampaignRecipientEstimationJobResponse getCampaignRecipientEstimationJob(id, revision, fieldsCampaignRecipientEstimationJob)

Get Campaign Recipient Estimation Job

Retrieve the status of a recipient estimation job triggered with the &#x60;Create Campaign Recipient Estimation Job&#x60; endpoint.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
String id = "id_example"; // String | The ID of the campaign to get recipient estimation status
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCampaignRecipientEstimationJob = Arrays.asList("fieldsCampaignRecipientEstimationJob_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetCampaignRecipientEstimationJobResponse result = apiInstance.getCampaignRecipientEstimationJob(id, revision, fieldsCampaignRecipientEstimationJob);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaignRecipientEstimationJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the campaign to get recipient estimation status |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCampaignRecipientEstimationJob** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status]

### Return type

[**GetCampaignRecipientEstimationJobResponse**](GetCampaignRecipientEstimationJobResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCampaignRelationshipsCampaignMessages"></a>
# **getCampaignRelationshipsCampaignMessages**
> GetCampaignMessagesRelationshipListResponseCollection getCampaignRelationshipsCampaignMessages(id, revision)

Get Campaign Relationships Campaign Messages

Returns the IDs of all messages associated with the given campaign.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    GetCampaignMessagesRelationshipListResponseCollection result = apiInstance.getCampaignRelationshipsCampaignMessages(id, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaignRelationshipsCampaignMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**GetCampaignMessagesRelationshipListResponseCollection**](GetCampaignMessagesRelationshipListResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCampaignRelationshipsTags"></a>
# **getCampaignRelationshipsTags**
> GetCampaignTagRelationshipListResponseCollection getCampaignRelationshipsTags(id, revision)

Get Campaign Relationships Tags

Returns the IDs of all tags associated with the given campaign.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60; &#x60;tags:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    GetCampaignTagRelationshipListResponseCollection result = apiInstance.getCampaignRelationshipsTags(id, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaignRelationshipsTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**GetCampaignTagRelationshipListResponseCollection**](GetCampaignTagRelationshipListResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCampaignSendJob"></a>
# **getCampaignSendJob**
> GetCampaignSendJobResponse getCampaignSendJob(id, revision, fieldsCampaignSendJob)

Get Campaign Send Job

Get a campaign send job&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
String id = "id_example"; // String | The ID of the campaign to send
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCampaignSendJob = Arrays.asList("fieldsCampaignSendJob_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetCampaignSendJobResponse result = apiInstance.getCampaignSendJob(id, revision, fieldsCampaignSendJob);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaignSendJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the campaign to send |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCampaignSendJob** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status]

### Return type

[**GetCampaignSendJobResponse**](GetCampaignSendJobResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCampaignTags"></a>
# **getCampaignTags**
> GetTagResponseCollection getCampaignTags(id, revision, fieldsTag)

Get Campaign Tags

Return all tags that belong to the given campaign.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60; &#x60;tags:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsTag = Arrays.asList("fieldsTag_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetTagResponseCollection result = apiInstance.getCampaignTags(id, revision, fieldsTag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaignTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsTag** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name]

### Return type

[**GetTagResponseCollection**](GetTagResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCampaigns"></a>
# **getCampaigns**
> GetCampaignResponseCollectionCompoundDocument getCampaigns(filter, revision, fieldsCampaignMessage, fieldsCampaign, fieldsTag, include, pageCursor, sort)

Get Campaigns

Returns some or all campaigns based on filters.  A channel filter is required to list campaigns. Please provide either: &#x60;?filter&#x3D;equals(messages.channel,&#x27;email&#x27;)&#x60; to list email campaigns, or &#x60;?filter&#x3D;equals(messages.channel,&#x27;sms&#x27;)&#x60; to list SMS campaigns.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`messages.channel`: `equals`<br>`name`: `contains`<br>`status`: `any`, `equals`<br>`archived`: `equals`<br>`created_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`scheduled_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`updated_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsCampaignMessage = Arrays.asList("fieldsCampaignMessage_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsCampaign = Arrays.asList("fieldsCampaign_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsTag = Arrays.asList("fieldsTag_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
String sort = "sort_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    GetCampaignResponseCollectionCompoundDocument result = apiInstance.getCampaigns(filter, revision, fieldsCampaignMessage, fieldsCampaign, fieldsTag, include, pageCursor, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#getCampaigns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;messages.channel&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;name&#x60;: &#x60;contains&#x60;&lt;br&gt;&#x60;status&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;archived&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;created_at&#x60;: &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;scheduled_at&#x60;: &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;updated_at&#x60;: &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60; |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsCampaignMessage** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: label, channel, content, send_times, render_options, render_options.shorten_links, render_options.add_org_prefix, render_options.add_info_link, render_options.add_opt_out_language, created_at, updated_at]
 **fieldsCampaign** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, status, archived, audiences, audiences.included, audiences.excluded, send_options, tracking_options, send_strategy, send_strategy.method, send_strategy.options_static, send_strategy.options_static.datetime, send_strategy.options_static.is_local, send_strategy.options_static.send_past_recipients_immediately, send_strategy.options_throttled, send_strategy.options_throttled.datetime, send_strategy.options_throttled.throttle_percentage, send_strategy.options_sto, send_strategy.options_sto.date, created_at, scheduled_at, updated_at, send_time]
 **fieldsTag** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: campaign-messages, tags]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]
 **sort** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created_at, -created_at, id, -id, name, -name, scheduled_at, -scheduled_at, updated_at, -updated_at]

### Return type

[**GetCampaignResponseCollectionCompoundDocument**](GetCampaignResponseCollectionCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCampaign"></a>
# **updateCampaign**
> PatchCampaignResponse updateCampaign(body, revision, id)

Update Campaign

Update a campaign with the given campaign ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
CampaignPartialUpdateQuery body = new CampaignPartialUpdateQuery(); // CampaignPartialUpdateQuery | Update a campaign and return it
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | The campaign ID to be retrieved
try {
    PatchCampaignResponse result = apiInstance.updateCampaign(body, revision, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#updateCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CampaignPartialUpdateQuery**](CampaignPartialUpdateQuery.md)| Update a campaign and return it |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**| The campaign ID to be retrieved |

### Return type

[**PatchCampaignResponse**](PatchCampaignResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCampaignMessage"></a>
# **updateCampaignMessage**
> PatchCampaignMessageResponse updateCampaignMessage(body, revision, id)

Update Campaign Message

Update a campaign message&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
CampaignMessagePartialUpdateQuery body = new CampaignMessagePartialUpdateQuery(); // CampaignMessagePartialUpdateQuery | Update a message and return it
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | The message ID to be retrieved
try {
    PatchCampaignMessageResponse result = apiInstance.updateCampaignMessage(body, revision, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#updateCampaignMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CampaignMessagePartialUpdateQuery**](CampaignMessagePartialUpdateQuery.md)| Update a message and return it |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**| The message ID to be retrieved |

### Return type

[**PatchCampaignMessageResponse**](PatchCampaignMessageResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCampaignSendJob"></a>
# **updateCampaignSendJob**
> updateCampaignSendJob(body, revision, id)

Update Campaign Send Job

Permanently cancel the campaign, setting the status to CANCELED or revert the campaign, setting the status back to DRAFT&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

CampaignsApi apiInstance = new CampaignsApi();
CampaignSendJobPartialUpdateQuery body = new CampaignSendJobPartialUpdateQuery(); // CampaignSendJobPartialUpdateQuery | Permanently cancel the campaign, setting the status to CANCELED or
revert the campaign, setting the status back to DRAFT
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | The ID of the currently sending campaign to cancel or revert
try {
    apiInstance.updateCampaignSendJob(body, revision, id);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#updateCampaignSendJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CampaignSendJobPartialUpdateQuery**](CampaignSendJobPartialUpdateQuery.md)| Permanently cancel the campaign, setting the status to CANCELED or
revert the campaign, setting the status back to DRAFT |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**| The ID of the currently sending campaign to cancel or revert |

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

