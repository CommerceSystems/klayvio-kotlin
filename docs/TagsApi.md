# TagsApi

All URIs are relative to *https://a.klaviyo.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTag**](TagsApi.md#createTag) | **POST** /api/tags/ | Create Tag
[**createTagGroup**](TagsApi.md#createTagGroup) | **POST** /api/tag-groups/ | Create Tag Group
[**createTagRelationshipsCampaigns**](TagsApi.md#createTagRelationshipsCampaigns) | **POST** /api/tags/{id}/relationships/campaigns/ | Create Tag Relationships Campaigns
[**createTagRelationshipsFlows**](TagsApi.md#createTagRelationshipsFlows) | **POST** /api/tags/{id}/relationships/flows/ | Create Tag Relationships Flows
[**createTagRelationshipsLists**](TagsApi.md#createTagRelationshipsLists) | **POST** /api/tags/{id}/relationships/lists/ | Create Tag Relationships Lists
[**createTagRelationshipsSegments**](TagsApi.md#createTagRelationshipsSegments) | **POST** /api/tags/{id}/relationships/segments/ | Create Tag Relationships Segments
[**deleteTag**](TagsApi.md#deleteTag) | **DELETE** /api/tags/{id}/ | Delete Tag
[**deleteTagGroup**](TagsApi.md#deleteTagGroup) | **DELETE** /api/tag-groups/{id}/ | Delete Tag Group
[**deleteTagRelationshipsCampaigns**](TagsApi.md#deleteTagRelationshipsCampaigns) | **DELETE** /api/tags/{id}/relationships/campaigns/ | Delete Tag Relationships Campaigns
[**deleteTagRelationshipsFlows**](TagsApi.md#deleteTagRelationshipsFlows) | **DELETE** /api/tags/{id}/relationships/flows/ | Delete Tag Relationships Flows
[**deleteTagRelationshipsLists**](TagsApi.md#deleteTagRelationshipsLists) | **DELETE** /api/tags/{id}/relationships/lists/ | Delete Tag Relationships Lists
[**deleteTagRelationshipsSegments**](TagsApi.md#deleteTagRelationshipsSegments) | **DELETE** /api/tags/{id}/relationships/segments/ | Delete Tag Relationships Segments
[**getTag**](TagsApi.md#getTag) | **GET** /api/tags/{id}/ | Get Tag
[**getTagGroup**](TagsApi.md#getTagGroup) | **GET** /api/tag-groups/{id}/ | Get Tag Group
[**getTagGroupRelationshipsTags**](TagsApi.md#getTagGroupRelationshipsTags) | **GET** /api/tag-groups/{id}/relationships/tags/ | Get Tag Group Relationships Tags
[**getTagGroupTags**](TagsApi.md#getTagGroupTags) | **GET** /api/tag-groups/{id}/tags/ | Get Tag Group Tags
[**getTagGroups**](TagsApi.md#getTagGroups) | **GET** /api/tag-groups/ | Get Tag Groups
[**getTagRelationshipsCampaigns**](TagsApi.md#getTagRelationshipsCampaigns) | **GET** /api/tags/{id}/relationships/campaigns/ | Get Tag Relationships Campaigns
[**getTagRelationshipsFlows**](TagsApi.md#getTagRelationshipsFlows) | **GET** /api/tags/{id}/relationships/flows/ | Get Tag Relationships Flows
[**getTagRelationshipsLists**](TagsApi.md#getTagRelationshipsLists) | **GET** /api/tags/{id}/relationships/lists/ | Get Tag Relationships Lists
[**getTagRelationshipsSegments**](TagsApi.md#getTagRelationshipsSegments) | **GET** /api/tags/{id}/relationships/segments/ | Get Tag Relationships Segments
[**getTagRelationshipsTagGroup**](TagsApi.md#getTagRelationshipsTagGroup) | **GET** /api/tags/{id}/relationships/tag-group/ | Get Tag Relationships Tag Group
[**getTagTagGroup**](TagsApi.md#getTagTagGroup) | **GET** /api/tags/{id}/tag-group/ | Get Tag Tag Group
[**getTags**](TagsApi.md#getTags) | **GET** /api/tags/ | Get Tags
[**updateTag**](TagsApi.md#updateTag) | **PATCH** /api/tags/{id}/ | Update Tag
[**updateTagGroup**](TagsApi.md#updateTagGroup) | **PATCH** /api/tag-groups/{id}/ | Update Tag Group

<a name="createTag"></a>
# **createTag**
> PostTagResponse createTag(body, revision)

Create Tag

Create a tag. An account cannot have more than **500** unique tags.  A tag belongs to a single tag group. If the &#x60;tag_group_id&#x60; is not specified, the tag is added to the account&#x27;s default tag group.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60; &#x60;tags:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
TagCreateQuery body = new TagCreateQuery(); // TagCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostTagResponse result = apiInstance.createTag(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#createTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TagCreateQuery**](TagCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostTagResponse**](PostTagResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTagGroup"></a>
# **createTagGroup**
> PostTagGroupResponse createTagGroup(body, revision)

Create Tag Group

Create a tag group. An account cannot have more than **50** unique tag groups.  If &#x60;exclusive&#x60; is not specified &#x60;true&#x60; or &#x60;false&#x60;, the tag group defaults to non-exclusive.  If a tag group is non-exclusive, any given related resource (campaign, flow, etc.) can be linked to multiple tags from that tag group. If a tag group is exclusive, any given related resource can only be linked to one tag from that tag group.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60; &#x60;tags:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
TagGroupCreateQuery body = new TagGroupCreateQuery(); // TagGroupCreateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    PostTagGroupResponse result = apiInstance.createTagGroup(body, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#createTagGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TagGroupCreateQuery**](TagGroupCreateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**PostTagGroupResponse**](PostTagGroupResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTagRelationshipsCampaigns"></a>
# **createTagRelationshipsCampaigns**
> createTagRelationshipsCampaigns(body, revision, id)

Create Tag Relationships Campaigns

Associate a tag with one or more campaigns. Any campaign cannot be associated with more than **100** tags.   Use the request body to pass in the ID(s) of the campaign(s) that will be associated with the tag.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;campaigns:write&#x60; &#x60;tags:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
TagCampaignOp body = new TagCampaignOp(); // TagCampaignOp | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | 
try {
    apiInstance.createTagRelationshipsCampaigns(body, revision, id);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#createTagRelationshipsCampaigns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TagCampaignOp**](TagCampaignOp.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTagRelationshipsFlows"></a>
# **createTagRelationshipsFlows**
> createTagRelationshipsFlows(body, revision, id)

Create Tag Relationships Flows

Associate a tag with one or more flows. Any flow cannot be associated with more than **100** tags.   Use the request body to pass in the ID(s) of the flow(s) that will be associated with the tag.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:write&#x60; &#x60;tags:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
TagFlowOp body = new TagFlowOp(); // TagFlowOp | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | 
try {
    apiInstance.createTagRelationshipsFlows(body, revision, id);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#createTagRelationshipsFlows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TagFlowOp**](TagFlowOp.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTagRelationshipsLists"></a>
# **createTagRelationshipsLists**
> createTagRelationshipsLists(body, revision, id)

Create Tag Relationships Lists

Associate a tag with one or more lists. Any list cannot be associated with more than **100** tags.   Use the request body to pass in the ID(s) of the lists(s) that will be associated with the tag.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;lists:write&#x60; &#x60;tags:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
TagListOp body = new TagListOp(); // TagListOp | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | 
try {
    apiInstance.createTagRelationshipsLists(body, revision, id);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#createTagRelationshipsLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TagListOp**](TagListOp.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTagRelationshipsSegments"></a>
# **createTagRelationshipsSegments**
> createTagRelationshipsSegments(body, revision, id)

Create Tag Relationships Segments

Associate a tag with one or more segments. Any segment cannot be associated with more than **100** tags.   Use the request body to pass in the ID(s) of the segments(s) that will be associated with the tag.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;segments:write&#x60; &#x60;tags:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
TagSegmentOp body = new TagSegmentOp(); // TagSegmentOp | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | 
try {
    apiInstance.createTagRelationshipsSegments(body, revision, id);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#createTagRelationshipsSegments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TagSegmentOp**](TagSegmentOp.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTag"></a>
# **deleteTag**
> deleteTag(id, revision)

Delete Tag

Delete the tag with the given tag ID. Any associations between the tag and other resources will also be removed.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60; &#x60;tags:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
String id = "id_example"; // String | The Tag ID
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.deleteTag(id, revision);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#deleteTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Tag ID |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteTagGroup"></a>
# **deleteTagGroup**
> DeleteTagGroupResponse deleteTagGroup(id, revision)

Delete Tag Group

Delete the tag group with the given tag group ID.  Any tags inside that tag group, and any associations between those tags and other resources, will also be removed. The default tag group cannot be deleted.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60; &#x60;tags:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
String id = "id_example"; // String | The Tag Group ID
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    DeleteTagGroupResponse result = apiInstance.deleteTagGroup(id, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#deleteTagGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Tag Group ID |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**DeleteTagGroupResponse**](DeleteTagGroupResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteTagRelationshipsCampaigns"></a>
# **deleteTagRelationshipsCampaigns**
> deleteTagRelationshipsCampaigns(body, revision, id)

Delete Tag Relationships Campaigns

Remove a tag&#x27;s association with one or more campaigns.   Use the request body to pass in the ID(s) of the campaign(s) whose association with the tag will be removed.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;campaigns:write&#x60; &#x60;tags:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
TagCampaignOp body = new TagCampaignOp(); // TagCampaignOp | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | 
try {
    apiInstance.deleteTagRelationshipsCampaigns(body, revision, id);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#deleteTagRelationshipsCampaigns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TagCampaignOp**](TagCampaignOp.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTagRelationshipsFlows"></a>
# **deleteTagRelationshipsFlows**
> deleteTagRelationshipsFlows(body, revision, id)

Delete Tag Relationships Flows

Remove a tag&#x27;s association with one or more flows.   Use the request body to pass in the ID(s) of the flows(s) whose association with the tag will be removed.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:write&#x60; &#x60;tags:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
TagFlowOp body = new TagFlowOp(); // TagFlowOp | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | 
try {
    apiInstance.deleteTagRelationshipsFlows(body, revision, id);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#deleteTagRelationshipsFlows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TagFlowOp**](TagFlowOp.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTagRelationshipsLists"></a>
# **deleteTagRelationshipsLists**
> deleteTagRelationshipsLists(body, revision, id)

Delete Tag Relationships Lists

Remove a tag&#x27;s association with one or more lists.   Use the request body to pass in the ID(s) of the list(s) whose association with the tag will be removed.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;lists:write&#x60; &#x60;tags:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
TagListOp body = new TagListOp(); // TagListOp | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | 
try {
    apiInstance.deleteTagRelationshipsLists(body, revision, id);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#deleteTagRelationshipsLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TagListOp**](TagListOp.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTagRelationshipsSegments"></a>
# **deleteTagRelationshipsSegments**
> deleteTagRelationshipsSegments(body, revision, id)

Delete Tag Relationships Segments

Remove a tag&#x27;s association with one or more segments.   Use the request body to pass in the ID(s) of the segments(s) whose association with the tag will be removed.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;segments:write&#x60; &#x60;tags:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
TagSegmentOp body = new TagSegmentOp(); // TagSegmentOp | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | 
try {
    apiInstance.deleteTagRelationshipsSegments(body, revision, id);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#deleteTagRelationshipsSegments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TagSegmentOp**](TagSegmentOp.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTag"></a>
# **getTag**
> GetTagResponseCompoundDocument getTag(id, revision, fieldsTagGroup, fieldsTag, include)

Get Tag

Retrieve the tag with the given tag ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
String id = "id_example"; // String | The Tag ID
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsTagGroup = Arrays.asList("fieldsTagGroup_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsTag = Arrays.asList("fieldsTag_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    GetTagResponseCompoundDocument result = apiInstance.getTag(id, revision, fieldsTagGroup, fieldsTag, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Tag ID |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsTagGroup** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, exclusive, default]
 **fieldsTag** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: tag-group]

### Return type

[**GetTagResponseCompoundDocument**](GetTagResponseCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTagGroup"></a>
# **getTagGroup**
> GetTagGroupResponse getTagGroup(id, revision, fieldsTagGroup)

Get Tag Group

Retrieve the tag group with the given tag group ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
String id = "id_example"; // String | The Tag Group ID
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsTagGroup = Arrays.asList("fieldsTagGroup_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetTagGroupResponse result = apiInstance.getTagGroup(id, revision, fieldsTagGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getTagGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The Tag Group ID |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsTagGroup** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, exclusive, default]

### Return type

[**GetTagGroupResponse**](GetTagGroupResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTagGroupRelationshipsTags"></a>
# **getTagGroupRelationshipsTags**
> GetTagGroupTagRelationshipsResponseCollection getTagGroupRelationshipsTags(id, revision)

Get Tag Group Relationships Tags

Returns the tag IDs of all tags inside the given tag group.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    GetTagGroupTagRelationshipsResponseCollection result = apiInstance.getTagGroupRelationshipsTags(id, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getTagGroupRelationshipsTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**GetTagGroupTagRelationshipsResponseCollection**](GetTagGroupTagRelationshipsResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTagGroupTags"></a>
# **getTagGroupTags**
> GetTagResponseCollection getTagGroupTags(id, revision, fieldsTag)

Get Tag Group Tags

Return the tags for a given tag group ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsTag = Arrays.asList("fieldsTag_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetTagResponseCollection result = apiInstance.getTagGroupTags(id, revision, fieldsTag);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getTagGroupTags");
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

<a name="getTagGroups"></a>
# **getTagGroups**
> GetTagGroupResponseCollection getTagGroups(revision, fieldsTagGroup, filter, pageCursor, sort)

Get Tag Groups

List all tag groups in an account. Every account has one default tag group.  Tag groups can be filtered by &#x60;name&#x60;, &#x60;exclusive&#x60;, and &#x60;default&#x60;, and sorted by &#x60;name&#x60; or &#x60;id&#x60; in ascending or descending order.  Returns a maximum of 25 tag groups per request, which can be paginated with [cursor-based pagination](https://developers.klaviyo.com/en/v2022-10-17/reference/api_overview#pagination).&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsTagGroup = Arrays.asList("fieldsTagGroup_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`name`: `contains`, `ends-with`, `equals`, `starts-with`<br>`exclusive`: `equals`<br>`default`: `equals`
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
String sort = "sort_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    GetTagGroupResponseCollection result = apiInstance.getTagGroups(revision, fieldsTagGroup, filter, pageCursor, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getTagGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsTagGroup** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, exclusive, default]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;name&#x60;: &#x60;contains&#x60;, &#x60;ends-with&#x60;, &#x60;equals&#x60;, &#x60;starts-with&#x60;&lt;br&gt;&#x60;exclusive&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;default&#x60;: &#x60;equals&#x60; | [optional]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]
 **sort** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: id, -id, name, -name]

### Return type

[**GetTagGroupResponseCollection**](GetTagGroupResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTagRelationshipsCampaigns"></a>
# **getTagRelationshipsCampaigns**
> GetTagCampaignRelationshipsResponseCollection getTagRelationshipsCampaigns(id, revision)

Get Tag Relationships Campaigns

Returns the IDs of all campaigns associated with the given tag.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60; &#x60;tags:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    GetTagCampaignRelationshipsResponseCollection result = apiInstance.getTagRelationshipsCampaigns(id, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getTagRelationshipsCampaigns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**GetTagCampaignRelationshipsResponseCollection**](GetTagCampaignRelationshipsResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTagRelationshipsFlows"></a>
# **getTagRelationshipsFlows**
> GetTagFlowRelationshipsResponseCollection getTagRelationshipsFlows(id, revision)

Get Tag Relationships Flows

Returns the IDs of all flows associated with the given tag.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60; &#x60;tags:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    GetTagFlowRelationshipsResponseCollection result = apiInstance.getTagRelationshipsFlows(id, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getTagRelationshipsFlows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**GetTagFlowRelationshipsResponseCollection**](GetTagFlowRelationshipsResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTagRelationshipsLists"></a>
# **getTagRelationshipsLists**
> GetTagListRelationshipsResponseCollection getTagRelationshipsLists(id, revision)

Get Tag Relationships Lists

Returns the IDs of all lists associated with the given tag.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;lists:read&#x60; &#x60;tags:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    GetTagListRelationshipsResponseCollection result = apiInstance.getTagRelationshipsLists(id, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getTagRelationshipsLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**GetTagListRelationshipsResponseCollection**](GetTagListRelationshipsResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTagRelationshipsSegments"></a>
# **getTagRelationshipsSegments**
> GetTagSegmentRelationshipsResponseCollection getTagRelationshipsSegments(id, revision)

Get Tag Relationships Segments

Returns the IDs of all segments associated with the given tag.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;segments:read&#x60; &#x60;tags:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    GetTagSegmentRelationshipsResponseCollection result = apiInstance.getTagRelationshipsSegments(id, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getTagRelationshipsSegments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**GetTagSegmentRelationshipsResponseCollection**](GetTagSegmentRelationshipsResponseCollection.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTagRelationshipsTagGroup"></a>
# **getTagRelationshipsTagGroup**
> GetTagTagGroupRelationshipsResponse getTagRelationshipsTagGroup(id, revision)

Get Tag Relationships Tag Group

Returns the id of the tag group related to the given tag.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    GetTagTagGroupRelationshipsResponse result = apiInstance.getTagRelationshipsTagGroup(id, revision);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getTagRelationshipsTagGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]

### Return type

[**GetTagTagGroupRelationshipsResponse**](GetTagTagGroupRelationshipsResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTagTagGroup"></a>
# **getTagTagGroup**
> GetTagGroupResponse getTagTagGroup(id, revision, fieldsTagGroup)

Get Tag Tag Group

Returns the tag group resource for a given tag ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
String id = "id_example"; // String | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsTagGroup = Arrays.asList("fieldsTagGroup_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    GetTagGroupResponse result = apiInstance.getTagTagGroup(id, revision, fieldsTagGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getTagTagGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsTagGroup** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, exclusive, default]

### Return type

[**GetTagGroupResponse**](GetTagGroupResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTags"></a>
# **getTags**
> GetTagResponseCollectionCompoundDocument getTags(revision, fieldsTagGroup, fieldsTag, filter, include, pageCursor, sort)

Get Tags

List all tags in an account.  Tags can be filtered by &#x60;name&#x60;, and sorted by &#x60;name&#x60; or &#x60;id&#x60; in ascending or descending order.  Returns a maximum of 50 tags per request, which can be paginated with [cursor-based pagination](https://developers.klaviyo.com/en/v2022-10-17/reference/api_overview#pagination).&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
List<String> fieldsTagGroup = Arrays.asList("fieldsTagGroup_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
List<String> fieldsTag = Arrays.asList("fieldsTag_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
String filter = "filter_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`name`: `contains`, `ends-with`, `equals`, `starts-with`
List<String> include = Arrays.asList("include_example"); // List<String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
String pageCursor = "pageCursor_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
String sort = "sort_example"; // String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    GetTagResponseCollectionCompoundDocument result = apiInstance.getTags(revision, fieldsTagGroup, fieldsTag, filter, include, pageCursor, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **fieldsTagGroup** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, exclusive, default]
 **fieldsTag** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name]
 **filter** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;name&#x60;: &#x60;contains&#x60;, &#x60;ends-with&#x60;, &#x60;equals&#x60;, &#x60;starts-with&#x60; | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: tag-group]
 **pageCursor** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional]
 **sort** | **String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: id, -id, name, -name]

### Return type

[**GetTagResponseCollectionCompoundDocument**](GetTagResponseCollectionCompoundDocument.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTag"></a>
# **updateTag**
> updateTag(body, revision, id)

Update Tag

Update the tag with the given tag ID.  Only a tag&#x27;s &#x60;name&#x60; can be changed. A tag cannot be moved from one tag group to another.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60; &#x60;tags:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
TagUpdateQuery body = new TagUpdateQuery(); // TagUpdateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | The Tag ID
try {
    apiInstance.updateTag(body, revision, id);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#updateTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TagUpdateQuery**](TagUpdateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**| The Tag ID |

### Return type

null (empty response body)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTagGroup"></a>
# **updateTagGroup**
> PatchTagGroupResponse updateTagGroup(body, revision, id)

Update Tag Group

Update the tag group with the given tag group ID.  Only a tag group&#x27;s &#x60;name&#x60; can be changed. A tag group&#x27;s &#x60;exclusive&#x60; or &#x60;default&#x60; value cannot be changed.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60; &#x60;tags:write&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Klaviyo-API-Key
ApiKeyAuth Klaviyo-API-Key = (ApiKeyAuth) defaultClient.getAuthentication("Klaviyo-API-Key");
Klaviyo-API-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Klaviyo-API-Key.setApiKeyPrefix("Token");

TagsApi apiInstance = new TagsApi();
TagGroupUpdateQuery body = new TagGroupUpdateQuery(); // TagGroupUpdateQuery | 
String revision = "2024-07-15"; // String | API endpoint revision (format: YYYY-MM-DD[.suffix])
String id = "id_example"; // String | The Tag Group ID
try {
    PatchTagGroupResponse result = apiInstance.updateTagGroup(body, revision, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#updateTagGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TagGroupUpdateQuery**](TagGroupUpdateQuery.md)|  |
 **revision** | **String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to 2024-07-15]
 **id** | **String**| The Tag Group ID |

### Return type

[**PatchTagGroupResponse**](PatchTagGroupResponse.md)

### Authorization

[Klaviyo-API-Key](../README.md#Klaviyo-API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

