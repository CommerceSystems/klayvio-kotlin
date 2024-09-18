# CampaignsApi

All URIs are relative to *https://a.klaviyo.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCampaign**](CampaignsApi.md#createCampaign) | **POST** /api/campaigns/ | Create Campaign |
| [**createCampaignClone**](CampaignsApi.md#createCampaignClone) | **POST** /api/campaign-clone/ | Create Campaign Clone |
| [**createCampaignMessageAssignTemplate**](CampaignsApi.md#createCampaignMessageAssignTemplate) | **POST** /api/campaign-message-assign-template/ | Assign Campaign Message Template |
| [**createCampaignRecipientEstimationJob**](CampaignsApi.md#createCampaignRecipientEstimationJob) | **POST** /api/campaign-recipient-estimation-jobs/ | Create Campaign Recipient Estimation Job |
| [**createCampaignSendJob**](CampaignsApi.md#createCampaignSendJob) | **POST** /api/campaign-send-jobs/ | Create Campaign Send Job |
| [**deleteCampaign**](CampaignsApi.md#deleteCampaign) | **DELETE** /api/campaigns/{id}/ | Delete Campaign |
| [**getCampaign**](CampaignsApi.md#getCampaign) | **GET** /api/campaigns/{id}/ | Get Campaign |
| [**getCampaignCampaignMessages**](CampaignsApi.md#getCampaignCampaignMessages) | **GET** /api/campaigns/{id}/campaign-messages/ | Get Campaign Campaign Messages |
| [**getCampaignMessage**](CampaignsApi.md#getCampaignMessage) | **GET** /api/campaign-messages/{id}/ | Get Campaign Message |
| [**getCampaignMessageCampaign**](CampaignsApi.md#getCampaignMessageCampaign) | **GET** /api/campaign-messages/{id}/campaign/ | Get Campaign Message Campaign |
| [**getCampaignMessageRelationshipsCampaign**](CampaignsApi.md#getCampaignMessageRelationshipsCampaign) | **GET** /api/campaign-messages/{id}/relationships/campaign/ | Get Campaign Message Relationships Campaign |
| [**getCampaignMessageRelationshipsTemplate**](CampaignsApi.md#getCampaignMessageRelationshipsTemplate) | **GET** /api/campaign-messages/{id}/relationships/template/ | Get Campaign Message Relationships Template |
| [**getCampaignMessageTemplate**](CampaignsApi.md#getCampaignMessageTemplate) | **GET** /api/campaign-messages/{id}/template/ | Get Campaign Message Template |
| [**getCampaignRecipientEstimation**](CampaignsApi.md#getCampaignRecipientEstimation) | **GET** /api/campaign-recipient-estimations/{id}/ | Get Campaign Recipient Estimation |
| [**getCampaignRecipientEstimationJob**](CampaignsApi.md#getCampaignRecipientEstimationJob) | **GET** /api/campaign-recipient-estimation-jobs/{id}/ | Get Campaign Recipient Estimation Job |
| [**getCampaignRelationshipsCampaignMessages**](CampaignsApi.md#getCampaignRelationshipsCampaignMessages) | **GET** /api/campaigns/{id}/relationships/campaign-messages/ | Get Campaign Relationships Campaign Messages |
| [**getCampaignRelationshipsTags**](CampaignsApi.md#getCampaignRelationshipsTags) | **GET** /api/campaigns/{id}/relationships/tags/ | Get Campaign Relationships Tags |
| [**getCampaignSendJob**](CampaignsApi.md#getCampaignSendJob) | **GET** /api/campaign-send-jobs/{id}/ | Get Campaign Send Job |
| [**getCampaignTags**](CampaignsApi.md#getCampaignTags) | **GET** /api/campaigns/{id}/tags/ | Get Campaign Tags |
| [**getCampaigns**](CampaignsApi.md#getCampaigns) | **GET** /api/campaigns/ | Get Campaigns |
| [**updateCampaign**](CampaignsApi.md#updateCampaign) | **PATCH** /api/campaigns/{id}/ | Update Campaign |
| [**updateCampaignMessage**](CampaignsApi.md#updateCampaignMessage) | **PATCH** /api/campaign-messages/{id}/ | Update Campaign Message |
| [**updateCampaignSendJob**](CampaignsApi.md#updateCampaignSendJob) | **PATCH** /api/campaign-send-jobs/{id}/ | Update Campaign Send Job |


<a id="createCampaign"></a>
# **createCampaign**
> PostCampaignResponse createCampaign(revision, campaignCreateQuery)

Create Campaign

Creates a campaign given a set of parameters, then returns it.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CampaignsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val campaignCreateQuery : CampaignCreateQuery =  // CampaignCreateQuery | Creates a campaign from parameters
try {
    val result : PostCampaignResponse = apiInstance.createCampaign(revision, campaignCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#createCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#createCampaign")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **campaignCreateQuery** | [**CampaignCreateQuery**](CampaignCreateQuery.md)| Creates a campaign from parameters | |

### Return type

[**PostCampaignResponse**](PostCampaignResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createCampaignClone"></a>
# **createCampaignClone**
> PostCampaignResponse createCampaignClone(revision, campaignCloneQuery)

Create Campaign Clone

Clones an existing campaign, returning a new campaign based on the original with a new ID and name.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CampaignsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val campaignCloneQuery : CampaignCloneQuery =  // CampaignCloneQuery | Clones a campaign from an existing campaign
try {
    val result : PostCampaignResponse = apiInstance.createCampaignClone(revision, campaignCloneQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#createCampaignClone")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#createCampaignClone")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **campaignCloneQuery** | [**CampaignCloneQuery**](CampaignCloneQuery.md)| Clones a campaign from an existing campaign | |

### Return type

[**PostCampaignResponse**](PostCampaignResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createCampaignMessageAssignTemplate"></a>
# **createCampaignMessageAssignTemplate**
> PostCampaignMessageResponse createCampaignMessageAssignTemplate(revision, campaignMessageAssignTemplateQuery)

Assign Campaign Message Template

Creates a non-reusable version of the template and assigns it to the message.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CampaignsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val campaignMessageAssignTemplateQuery : CampaignMessageAssignTemplateQuery =  // CampaignMessageAssignTemplateQuery | Takes a reusable template, clones it, and assigns the non-reusable clone to the message.
try {
    val result : PostCampaignMessageResponse = apiInstance.createCampaignMessageAssignTemplate(revision, campaignMessageAssignTemplateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#createCampaignMessageAssignTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#createCampaignMessageAssignTemplate")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **campaignMessageAssignTemplateQuery** | [**CampaignMessageAssignTemplateQuery**](CampaignMessageAssignTemplateQuery.md)| Takes a reusable template, clones it, and assigns the non-reusable clone to the message. | |

### Return type

[**PostCampaignMessageResponse**](PostCampaignMessageResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createCampaignRecipientEstimationJob"></a>
# **createCampaignRecipientEstimationJob**
> PostCampaignRecipientEstimationJobResponse createCampaignRecipientEstimationJob(revision, campaignRecipientEstimationJobCreateQuery)

Create Campaign Recipient Estimation Job

Trigger an asynchronous job to update the estimated number of recipients for the given campaign ID. Use the &#x60;Get Campaign Recipient Estimation Job&#x60; endpoint to retrieve the status of this estimation job. Use the &#x60;Get Campaign Recipient Estimation&#x60; endpoint to retrieve the estimated recipient count for a given campaign.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CampaignsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val campaignRecipientEstimationJobCreateQuery : CampaignRecipientEstimationJobCreateQuery =  // CampaignRecipientEstimationJobCreateQuery | Trigger an asynchronous job to update the estimated number of recipients for the given campaign ID. Use the `Get Campaign Recipient Estimation Job` endpoint to retrieve the status of this estimation job. Use the `Get Campaign Recipient Estimation` endpoint to retrieve the estimated recipient count for a given campaign.
try {
    val result : PostCampaignRecipientEstimationJobResponse = apiInstance.createCampaignRecipientEstimationJob(revision, campaignRecipientEstimationJobCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#createCampaignRecipientEstimationJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#createCampaignRecipientEstimationJob")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **campaignRecipientEstimationJobCreateQuery** | [**CampaignRecipientEstimationJobCreateQuery**](CampaignRecipientEstimationJobCreateQuery.md)| Trigger an asynchronous job to update the estimated number of recipients for the given campaign ID. Use the &#x60;Get Campaign Recipient Estimation Job&#x60; endpoint to retrieve the status of this estimation job. Use the &#x60;Get Campaign Recipient Estimation&#x60; endpoint to retrieve the estimated recipient count for a given campaign. | |

### Return type

[**PostCampaignRecipientEstimationJobResponse**](PostCampaignRecipientEstimationJobResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createCampaignSendJob"></a>
# **createCampaignSendJob**
> PostCampaignSendJobResponse createCampaignSendJob(revision, campaignSendJobCreateQuery)

Create Campaign Send Job

Trigger a campaign to send asynchronously&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CampaignsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val campaignSendJobCreateQuery : CampaignSendJobCreateQuery =  // CampaignSendJobCreateQuery | Trigger the campaign to send asynchronously
try {
    val result : PostCampaignSendJobResponse = apiInstance.createCampaignSendJob(revision, campaignSendJobCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#createCampaignSendJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#createCampaignSendJob")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **campaignSendJobCreateQuery** | [**CampaignSendJobCreateQuery**](CampaignSendJobCreateQuery.md)| Trigger the campaign to send asynchronously | |

### Return type

[**PostCampaignSendJobResponse**](PostCampaignSendJobResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCampaign"></a>
# **deleteCampaign**
> deleteCampaign(id, revision)

Delete Campaign

Delete a campaign with the given campaign ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CampaignsApi()
val id : kotlin.String = id_example // kotlin.String | The campaign ID to be deleted
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.deleteCampaign(id, revision)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#deleteCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#deleteCampaign")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The campaign ID to be deleted | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaign"></a>
# **getCampaign**
> GetCampaignResponseCompoundDocument getCampaign(id, revision, fieldsCampaignMessage, fieldsCampaign, fieldsTag, include)

Get Campaign

Returns a specific campaign based on a required id.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CampaignsApi()
val id : kotlin.String = id_example // kotlin.String | The campaign ID to be retrieved
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCampaignMessage : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsCampaign : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsTag : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    val result : GetCampaignResponseCompoundDocument = apiInstance.getCampaign(id, revision, fieldsCampaignMessage, fieldsCampaign, fieldsTag, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#getCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#getCampaign")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The campaign ID to be retrieved | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCampaignMessage** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: label, channel, content, send_times, render_options, render_options.shorten_links, render_options.add_org_prefix, render_options.add_info_link, render_options.add_opt_out_language, created_at, updated_at] |
| **fieldsCampaign** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, status, archived, audiences, audiences.included, audiences.excluded, send_options, tracking_options, send_strategy, send_strategy.method, send_strategy.options_static, send_strategy.options_static.datetime, send_strategy.options_static.is_local, send_strategy.options_static.send_past_recipients_immediately, send_strategy.options_throttled, send_strategy.options_throttled.datetime, send_strategy.options_throttled.throttle_percentage, send_strategy.options_sto, send_strategy.options_sto.date, created_at, scheduled_at, updated_at, send_time] |
| **fieldsTag** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: campaign-messages, tags] |

### Return type

[**GetCampaignResponseCompoundDocument**](GetCampaignResponseCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaignCampaignMessages"></a>
# **getCampaignCampaignMessages**
> GetCampaignMessageResponseCollectionCompoundDocument getCampaignCampaignMessages(id, revision, fieldsCampaignMessage, fieldsCampaign, fieldsTemplate, include)

Get Campaign Campaign Messages

Return all messages that belong to the given campaign.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CampaignsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCampaignMessage : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsCampaign : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsTemplate : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    val result : GetCampaignMessageResponseCollectionCompoundDocument = apiInstance.getCampaignCampaignMessages(id, revision, fieldsCampaignMessage, fieldsCampaign, fieldsTemplate, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#getCampaignCampaignMessages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#getCampaignCampaignMessages")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCampaignMessage** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: label, channel, content, send_times, render_options, render_options.shorten_links, render_options.add_org_prefix, render_options.add_info_link, render_options.add_opt_out_language, created_at, updated_at] |
| **fieldsCampaign** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, status, archived, audiences, audiences.included, audiences.excluded, send_options, tracking_options, send_strategy, send_strategy.method, send_strategy.options_static, send_strategy.options_static.datetime, send_strategy.options_static.is_local, send_strategy.options_static.send_past_recipients_immediately, send_strategy.options_throttled, send_strategy.options_throttled.datetime, send_strategy.options_throttled.throttle_percentage, send_strategy.options_sto, send_strategy.options_sto.date, created_at, scheduled_at, updated_at, send_time] |
| **fieldsTemplate** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, editor_type, html, text, created, updated] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: campaign, template] |

### Return type

[**GetCampaignMessageResponseCollectionCompoundDocument**](GetCampaignMessageResponseCollectionCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaignMessage"></a>
# **getCampaignMessage**
> GetCampaignMessageResponseCompoundDocument getCampaignMessage(id, revision, fieldsCampaignMessage, fieldsCampaign, fieldsTemplate, include)

Get Campaign Message

Returns a specific message based on a required id.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CampaignsApi()
val id : kotlin.String = id_example // kotlin.String | The message ID to be retrieved
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCampaignMessage : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsCampaign : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsTemplate : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    val result : GetCampaignMessageResponseCompoundDocument = apiInstance.getCampaignMessage(id, revision, fieldsCampaignMessage, fieldsCampaign, fieldsTemplate, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#getCampaignMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#getCampaignMessage")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The message ID to be retrieved | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCampaignMessage** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: label, channel, content, send_times, render_options, render_options.shorten_links, render_options.add_org_prefix, render_options.add_info_link, render_options.add_opt_out_language, created_at, updated_at] |
| **fieldsCampaign** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, status, archived, audiences, audiences.included, audiences.excluded, send_options, tracking_options, send_strategy, send_strategy.method, send_strategy.options_static, send_strategy.options_static.datetime, send_strategy.options_static.is_local, send_strategy.options_static.send_past_recipients_immediately, send_strategy.options_throttled, send_strategy.options_throttled.datetime, send_strategy.options_throttled.throttle_percentage, send_strategy.options_sto, send_strategy.options_sto.date, created_at, scheduled_at, updated_at, send_time] |
| **fieldsTemplate** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, editor_type, html, text, created, updated] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: campaign, template] |

### Return type

[**GetCampaignMessageResponseCompoundDocument**](GetCampaignMessageResponseCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaignMessageCampaign"></a>
# **getCampaignMessageCampaign**
> GetCampaignResponse getCampaignMessageCampaign(id, revision, fieldsCampaign)

Get Campaign Message Campaign

Return the related campaign&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CampaignsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCampaign : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetCampaignResponse = apiInstance.getCampaignMessageCampaign(id, revision, fieldsCampaign)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#getCampaignMessageCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#getCampaignMessageCampaign")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsCampaign** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, status, archived, audiences, audiences.included, audiences.excluded, send_options, tracking_options, send_strategy, send_strategy.method, send_strategy.options_static, send_strategy.options_static.datetime, send_strategy.options_static.is_local, send_strategy.options_static.send_past_recipients_immediately, send_strategy.options_throttled, send_strategy.options_throttled.datetime, send_strategy.options_throttled.throttle_percentage, send_strategy.options_sto, send_strategy.options_sto.date, created_at, scheduled_at, updated_at, send_time] |

### Return type

[**GetCampaignResponse**](GetCampaignResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaignMessageRelationshipsCampaign"></a>
# **getCampaignMessageRelationshipsCampaign**
> GetCampaignMessageCampaignRelationshipListResponse getCampaignMessageRelationshipsCampaign(id, revision)

Get Campaign Message Relationships Campaign

Returns the ID of the related campaign&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CampaignsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetCampaignMessageCampaignRelationshipListResponse = apiInstance.getCampaignMessageRelationshipsCampaign(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#getCampaignMessageRelationshipsCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#getCampaignMessageRelationshipsCampaign")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetCampaignMessageCampaignRelationshipListResponse**](GetCampaignMessageCampaignRelationshipListResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaignMessageRelationshipsTemplate"></a>
# **getCampaignMessageRelationshipsTemplate**
> GetCampaignMessageTemplateRelationshipListResponse getCampaignMessageRelationshipsTemplate(id, revision)

Get Campaign Message Relationships Template

Returns the ID of the related template&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60; &#x60;templates:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CampaignsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetCampaignMessageTemplateRelationshipListResponse = apiInstance.getCampaignMessageRelationshipsTemplate(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#getCampaignMessageRelationshipsTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#getCampaignMessageRelationshipsTemplate")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetCampaignMessageTemplateRelationshipListResponse**](GetCampaignMessageTemplateRelationshipListResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaignMessageTemplate"></a>
# **getCampaignMessageTemplate**
> GetTemplateResponse getCampaignMessageTemplate(id, revision, fieldsTemplate)

Get Campaign Message Template

Return the related template&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60; &#x60;templates:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CampaignsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsTemplate : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetTemplateResponse = apiInstance.getCampaignMessageTemplate(id, revision, fieldsTemplate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#getCampaignMessageTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#getCampaignMessageTemplate")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsTemplate** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, editor_type, html, text, created, updated] |

### Return type

[**GetTemplateResponse**](GetTemplateResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaignRecipientEstimation"></a>
# **getCampaignRecipientEstimation**
> GetCampaignRecipientEstimationResponse getCampaignRecipientEstimation(id, revision, fieldsCampaignRecipientEstimation)

Get Campaign Recipient Estimation

Get the estimated recipient count for a campaign with the provided campaign ID. You can refresh this count by using the &#x60;Create Campaign Recipient Estimation Job&#x60; endpoint.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CampaignsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the campaign for which to get the estimated number of recipients
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCampaignRecipientEstimation : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetCampaignRecipientEstimationResponse = apiInstance.getCampaignRecipientEstimation(id, revision, fieldsCampaignRecipientEstimation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#getCampaignRecipientEstimation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#getCampaignRecipientEstimation")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The ID of the campaign for which to get the estimated number of recipients | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsCampaignRecipientEstimation** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: estimated_recipient_count] |

### Return type

[**GetCampaignRecipientEstimationResponse**](GetCampaignRecipientEstimationResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaignRecipientEstimationJob"></a>
# **getCampaignRecipientEstimationJob**
> GetCampaignRecipientEstimationJobResponse getCampaignRecipientEstimationJob(id, revision, fieldsCampaignRecipientEstimationJob)

Get Campaign Recipient Estimation Job

Retrieve the status of a recipient estimation job triggered with the &#x60;Create Campaign Recipient Estimation Job&#x60; endpoint.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CampaignsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the campaign to get recipient estimation status
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCampaignRecipientEstimationJob : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetCampaignRecipientEstimationJobResponse = apiInstance.getCampaignRecipientEstimationJob(id, revision, fieldsCampaignRecipientEstimationJob)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#getCampaignRecipientEstimationJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#getCampaignRecipientEstimationJob")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The ID of the campaign to get recipient estimation status | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsCampaignRecipientEstimationJob** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status] |

### Return type

[**GetCampaignRecipientEstimationJobResponse**](GetCampaignRecipientEstimationJobResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaignRelationshipsCampaignMessages"></a>
# **getCampaignRelationshipsCampaignMessages**
> GetCampaignMessagesRelationshipListResponseCollection getCampaignRelationshipsCampaignMessages(id, revision)

Get Campaign Relationships Campaign Messages

Returns the IDs of all messages associated with the given campaign.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CampaignsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetCampaignMessagesRelationshipListResponseCollection = apiInstance.getCampaignRelationshipsCampaignMessages(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#getCampaignRelationshipsCampaignMessages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#getCampaignRelationshipsCampaignMessages")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetCampaignMessagesRelationshipListResponseCollection**](GetCampaignMessagesRelationshipListResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaignRelationshipsTags"></a>
# **getCampaignRelationshipsTags**
> GetCampaignTagRelationshipListResponseCollection getCampaignRelationshipsTags(id, revision)

Get Campaign Relationships Tags

Returns the IDs of all tags associated with the given campaign.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60; &#x60;tags:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CampaignsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetCampaignTagRelationshipListResponseCollection = apiInstance.getCampaignRelationshipsTags(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#getCampaignRelationshipsTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#getCampaignRelationshipsTags")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetCampaignTagRelationshipListResponseCollection**](GetCampaignTagRelationshipListResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaignSendJob"></a>
# **getCampaignSendJob**
> GetCampaignSendJobResponse getCampaignSendJob(id, revision, fieldsCampaignSendJob)

Get Campaign Send Job

Get a campaign send job&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CampaignsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the campaign to send
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCampaignSendJob : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetCampaignSendJobResponse = apiInstance.getCampaignSendJob(id, revision, fieldsCampaignSendJob)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#getCampaignSendJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#getCampaignSendJob")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The ID of the campaign to send | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsCampaignSendJob** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: status] |

### Return type

[**GetCampaignSendJobResponse**](GetCampaignSendJobResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaignTags"></a>
# **getCampaignTags**
> GetTagResponseCollection getCampaignTags(id, revision, fieldsTag)

Get Campaign Tags

Return all tags that belong to the given campaign.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60; &#x60;tags:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CampaignsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsTag : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetTagResponseCollection = apiInstance.getCampaignTags(id, revision, fieldsTag)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#getCampaignTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#getCampaignTags")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsTag** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name] |

### Return type

[**GetTagResponseCollection**](GetTagResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaigns"></a>
# **getCampaigns**
> GetCampaignResponseCollectionCompoundDocument getCampaigns(filter, revision, fieldsCampaignMessage, fieldsCampaign, fieldsTag, include, pageCursor, sort)

Get Campaigns

Returns some or all campaigns based on filters.  A channel filter is required to list campaigns. Please provide either: &#x60;?filter&#x3D;equals(messages.channel,&#39;email&#39;)&#x60; to list email campaigns, or &#x60;?filter&#x3D;equals(messages.channel,&#39;sms&#39;)&#x60; to list SMS campaigns.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CampaignsApi()
val filter : kotlin.String = equals(messages.channel,'sms') // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`messages.channel`: `equals`<br>`name`: `contains`<br>`status`: `any`, `equals`<br>`archived`: `equals`<br>`created_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`scheduled_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`updated_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsCampaignMessage : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsCampaign : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsTag : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetCampaignResponseCollectionCompoundDocument = apiInstance.getCampaigns(filter, revision, fieldsCampaignMessage, fieldsCampaign, fieldsTag, include, pageCursor, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#getCampaigns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#getCampaigns")
    e.printStackTrace()
}
```

### Parameters
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;messages.channel&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;name&#x60;: &#x60;contains&#x60;&lt;br&gt;&#x60;status&#x60;: &#x60;any&#x60;, &#x60;equals&#x60;&lt;br&gt;&#x60;archived&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;created_at&#x60;: &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;scheduled_at&#x60;: &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60;&lt;br&gt;&#x60;updated_at&#x60;: &#x60;greater-or-equal&#x60;, &#x60;greater-than&#x60;, &#x60;less-or-equal&#x60;, &#x60;less-than&#x60; | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsCampaignMessage** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: label, channel, content, send_times, render_options, render_options.shorten_links, render_options.add_org_prefix, render_options.add_info_link, render_options.add_opt_out_language, created_at, updated_at] |
| **fieldsCampaign** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, status, archived, audiences, audiences.included, audiences.excluded, send_options, tracking_options, send_strategy, send_strategy.method, send_strategy.options_static, send_strategy.options_static.datetime, send_strategy.options_static.is_local, send_strategy.options_static.send_past_recipients_immediately, send_strategy.options_throttled, send_strategy.options_throttled.datetime, send_strategy.options_throttled.throttle_percentage, send_strategy.options_sto, send_strategy.options_sto.date, created_at, scheduled_at, updated_at, send_time] |
| **fieldsTag** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name] |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: campaign-messages, tags] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: created_at, -created_at, id, -id, name, -name, scheduled_at, -scheduled_at, updated_at, -updated_at] |

### Return type

[**GetCampaignResponseCollectionCompoundDocument**](GetCampaignResponseCollectionCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateCampaign"></a>
# **updateCampaign**
> PatchCampaignResponse updateCampaign(id, revision, campaignPartialUpdateQuery)

Update Campaign

Update a campaign with the given campaign ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CampaignsApi()
val id : kotlin.String = id_example // kotlin.String | The campaign ID to be retrieved
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val campaignPartialUpdateQuery : CampaignPartialUpdateQuery =  // CampaignPartialUpdateQuery | Update a campaign and return it
try {
    val result : PatchCampaignResponse = apiInstance.updateCampaign(id, revision, campaignPartialUpdateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#updateCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#updateCampaign")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The campaign ID to be retrieved | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **campaignPartialUpdateQuery** | [**CampaignPartialUpdateQuery**](CampaignPartialUpdateQuery.md)| Update a campaign and return it | |

### Return type

[**PatchCampaignResponse**](PatchCampaignResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateCampaignMessage"></a>
# **updateCampaignMessage**
> PatchCampaignMessageResponse updateCampaignMessage(id, revision, campaignMessagePartialUpdateQuery)

Update Campaign Message

Update a campaign message&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CampaignsApi()
val id : kotlin.String = id_example // kotlin.String | The message ID to be retrieved
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val campaignMessagePartialUpdateQuery : CampaignMessagePartialUpdateQuery =  // CampaignMessagePartialUpdateQuery | Update a message and return it
try {
    val result : PatchCampaignMessageResponse = apiInstance.updateCampaignMessage(id, revision, campaignMessagePartialUpdateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#updateCampaignMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#updateCampaignMessage")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The message ID to be retrieved | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **campaignMessagePartialUpdateQuery** | [**CampaignMessagePartialUpdateQuery**](CampaignMessagePartialUpdateQuery.md)| Update a message and return it | |

### Return type

[**PatchCampaignMessageResponse**](PatchCampaignMessageResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateCampaignSendJob"></a>
# **updateCampaignSendJob**
> updateCampaignSendJob(id, revision, campaignSendJobPartialUpdateQuery)

Update Campaign Send Job

Permanently cancel the campaign, setting the status to CANCELED or revert the campaign, setting the status back to DRAFT&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;campaigns:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CampaignsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the currently sending campaign to cancel or revert
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val campaignSendJobPartialUpdateQuery : CampaignSendJobPartialUpdateQuery =  // CampaignSendJobPartialUpdateQuery | Permanently cancel the campaign, setting the status to CANCELED or revert the campaign, setting the status back to DRAFT
try {
    apiInstance.updateCampaignSendJob(id, revision, campaignSendJobPartialUpdateQuery)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#updateCampaignSendJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#updateCampaignSendJob")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The ID of the currently sending campaign to cancel or revert | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **campaignSendJobPartialUpdateQuery** | [**CampaignSendJobPartialUpdateQuery**](CampaignSendJobPartialUpdateQuery.md)| Permanently cancel the campaign, setting the status to CANCELED or revert the campaign, setting the status back to DRAFT | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

