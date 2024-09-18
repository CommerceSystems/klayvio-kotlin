# TagsApi

All URIs are relative to *https://a.klaviyo.com*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTag**](TagsApi.md#createTag) | **POST** /api/tags/ | Create Tag |
| [**createTagGroup**](TagsApi.md#createTagGroup) | **POST** /api/tag-groups/ | Create Tag Group |
| [**createTagRelationshipsCampaigns**](TagsApi.md#createTagRelationshipsCampaigns) | **POST** /api/tags/{id}/relationships/campaigns/ | Create Tag Relationships Campaigns |
| [**createTagRelationshipsFlows**](TagsApi.md#createTagRelationshipsFlows) | **POST** /api/tags/{id}/relationships/flows/ | Create Tag Relationships Flows |
| [**createTagRelationshipsLists**](TagsApi.md#createTagRelationshipsLists) | **POST** /api/tags/{id}/relationships/lists/ | Create Tag Relationships Lists |
| [**createTagRelationshipsSegments**](TagsApi.md#createTagRelationshipsSegments) | **POST** /api/tags/{id}/relationships/segments/ | Create Tag Relationships Segments |
| [**deleteTag**](TagsApi.md#deleteTag) | **DELETE** /api/tags/{id}/ | Delete Tag |
| [**deleteTagGroup**](TagsApi.md#deleteTagGroup) | **DELETE** /api/tag-groups/{id}/ | Delete Tag Group |
| [**deleteTagRelationshipsCampaigns**](TagsApi.md#deleteTagRelationshipsCampaigns) | **DELETE** /api/tags/{id}/relationships/campaigns/ | Delete Tag Relationships Campaigns |
| [**deleteTagRelationshipsFlows**](TagsApi.md#deleteTagRelationshipsFlows) | **DELETE** /api/tags/{id}/relationships/flows/ | Delete Tag Relationships Flows |
| [**deleteTagRelationshipsLists**](TagsApi.md#deleteTagRelationshipsLists) | **DELETE** /api/tags/{id}/relationships/lists/ | Delete Tag Relationships Lists |
| [**deleteTagRelationshipsSegments**](TagsApi.md#deleteTagRelationshipsSegments) | **DELETE** /api/tags/{id}/relationships/segments/ | Delete Tag Relationships Segments |
| [**getTag**](TagsApi.md#getTag) | **GET** /api/tags/{id}/ | Get Tag |
| [**getTagGroup**](TagsApi.md#getTagGroup) | **GET** /api/tag-groups/{id}/ | Get Tag Group |
| [**getTagGroupRelationshipsTags**](TagsApi.md#getTagGroupRelationshipsTags) | **GET** /api/tag-groups/{id}/relationships/tags/ | Get Tag Group Relationships Tags |
| [**getTagGroupTags**](TagsApi.md#getTagGroupTags) | **GET** /api/tag-groups/{id}/tags/ | Get Tag Group Tags |
| [**getTagGroups**](TagsApi.md#getTagGroups) | **GET** /api/tag-groups/ | Get Tag Groups |
| [**getTagRelationshipsCampaigns**](TagsApi.md#getTagRelationshipsCampaigns) | **GET** /api/tags/{id}/relationships/campaigns/ | Get Tag Relationships Campaigns |
| [**getTagRelationshipsFlows**](TagsApi.md#getTagRelationshipsFlows) | **GET** /api/tags/{id}/relationships/flows/ | Get Tag Relationships Flows |
| [**getTagRelationshipsLists**](TagsApi.md#getTagRelationshipsLists) | **GET** /api/tags/{id}/relationships/lists/ | Get Tag Relationships Lists |
| [**getTagRelationshipsSegments**](TagsApi.md#getTagRelationshipsSegments) | **GET** /api/tags/{id}/relationships/segments/ | Get Tag Relationships Segments |
| [**getTagRelationshipsTagGroup**](TagsApi.md#getTagRelationshipsTagGroup) | **GET** /api/tags/{id}/relationships/tag-group/ | Get Tag Relationships Tag Group |
| [**getTagTagGroup**](TagsApi.md#getTagTagGroup) | **GET** /api/tags/{id}/tag-group/ | Get Tag Tag Group |
| [**getTags**](TagsApi.md#getTags) | **GET** /api/tags/ | Get Tags |
| [**updateTag**](TagsApi.md#updateTag) | **PATCH** /api/tags/{id}/ | Update Tag |
| [**updateTagGroup**](TagsApi.md#updateTagGroup) | **PATCH** /api/tag-groups/{id}/ | Update Tag Group |


<a id="createTag"></a>
# **createTag**
> PostTagResponse createTag(revision, tagCreateQuery)

Create Tag

Create a tag. An account cannot have more than **500** unique tags.  A tag belongs to a single tag group. If the &#x60;tag_group_id&#x60; is not specified, the tag is added to the account&#39;s default tag group.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60; &#x60;tags:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val tagCreateQuery : TagCreateQuery =  // TagCreateQuery | 
try {
    val result : PostTagResponse = apiInstance.createTag(revision, tagCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#createTag")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#createTag")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tagCreateQuery** | [**TagCreateQuery**](TagCreateQuery.md)|  | |

### Return type

[**PostTagResponse**](PostTagResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createTagGroup"></a>
# **createTagGroup**
> PostTagGroupResponse createTagGroup(revision, tagGroupCreateQuery)

Create Tag Group

Create a tag group. An account cannot have more than **50** unique tag groups.  If &#x60;exclusive&#x60; is not specified &#x60;true&#x60; or &#x60;false&#x60;, the tag group defaults to non-exclusive.  If a tag group is non-exclusive, any given related resource (campaign, flow, etc.) can be linked to multiple tags from that tag group. If a tag group is exclusive, any given related resource can only be linked to one tag from that tag group.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60; &#x60;tags:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val tagGroupCreateQuery : TagGroupCreateQuery =  // TagGroupCreateQuery | 
try {
    val result : PostTagGroupResponse = apiInstance.createTagGroup(revision, tagGroupCreateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#createTagGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#createTagGroup")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tagGroupCreateQuery** | [**TagGroupCreateQuery**](TagGroupCreateQuery.md)|  | |

### Return type

[**PostTagGroupResponse**](PostTagGroupResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createTagRelationshipsCampaigns"></a>
# **createTagRelationshipsCampaigns**
> createTagRelationshipsCampaigns(id, revision, tagCampaignOp)

Create Tag Relationships Campaigns

Associate a tag with one or more campaigns. Any campaign cannot be associated with more than **100** tags.   Use the request body to pass in the ID(s) of the campaign(s) that will be associated with the tag.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;campaigns:write&#x60; &#x60;tags:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val tagCampaignOp : TagCampaignOp =  // TagCampaignOp | 
try {
    apiInstance.createTagRelationshipsCampaigns(id, revision, tagCampaignOp)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#createTagRelationshipsCampaigns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#createTagRelationshipsCampaigns")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tagCampaignOp** | [**TagCampaignOp**](TagCampaignOp.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createTagRelationshipsFlows"></a>
# **createTagRelationshipsFlows**
> createTagRelationshipsFlows(id, revision, tagFlowOp)

Create Tag Relationships Flows

Associate a tag with one or more flows. Any flow cannot be associated with more than **100** tags.   Use the request body to pass in the ID(s) of the flow(s) that will be associated with the tag.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:write&#x60; &#x60;tags:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val tagFlowOp : TagFlowOp =  // TagFlowOp | 
try {
    apiInstance.createTagRelationshipsFlows(id, revision, tagFlowOp)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#createTagRelationshipsFlows")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#createTagRelationshipsFlows")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tagFlowOp** | [**TagFlowOp**](TagFlowOp.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createTagRelationshipsLists"></a>
# **createTagRelationshipsLists**
> createTagRelationshipsLists(id, revision, tagListOp)

Create Tag Relationships Lists

Associate a tag with one or more lists. Any list cannot be associated with more than **100** tags.   Use the request body to pass in the ID(s) of the lists(s) that will be associated with the tag.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;lists:write&#x60; &#x60;tags:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val tagListOp : TagListOp =  // TagListOp | 
try {
    apiInstance.createTagRelationshipsLists(id, revision, tagListOp)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#createTagRelationshipsLists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#createTagRelationshipsLists")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tagListOp** | [**TagListOp**](TagListOp.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createTagRelationshipsSegments"></a>
# **createTagRelationshipsSegments**
> createTagRelationshipsSegments(id, revision, tagSegmentOp)

Create Tag Relationships Segments

Associate a tag with one or more segments. Any segment cannot be associated with more than **100** tags.   Use the request body to pass in the ID(s) of the segments(s) that will be associated with the tag.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;segments:write&#x60; &#x60;tags:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val tagSegmentOp : TagSegmentOp =  // TagSegmentOp | 
try {
    apiInstance.createTagRelationshipsSegments(id, revision, tagSegmentOp)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#createTagRelationshipsSegments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#createTagRelationshipsSegments")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tagSegmentOp** | [**TagSegmentOp**](TagSegmentOp.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTag"></a>
# **deleteTag**
> deleteTag(id, revision)

Delete Tag

Delete the tag with the given tag ID. Any associations between the tag and other resources will also be removed.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60; &#x60;tags:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val id : kotlin.String = abcd1234-ef56-gh78-ij90-abcdef123456 // kotlin.String | The Tag ID
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    apiInstance.deleteTag(id, revision)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#deleteTag")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#deleteTag")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The Tag ID | |
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

<a id="deleteTagGroup"></a>
# **deleteTagGroup**
> DeleteTagGroupResponse deleteTagGroup(id, revision)

Delete Tag Group

Delete the tag group with the given tag group ID.  Any tags inside that tag group, and any associations between those tags and other resources, will also be removed. The default tag group cannot be deleted.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60; &#x60;tags:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val id : kotlin.String = zyxw9876-vu54-ts32-rq10-zyxwvu654321 // kotlin.String | The Tag Group ID
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : DeleteTagGroupResponse = apiInstance.deleteTagGroup(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#deleteTagGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#deleteTagGroup")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The Tag Group ID | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**DeleteTagGroupResponse**](DeleteTagGroupResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteTagRelationshipsCampaigns"></a>
# **deleteTagRelationshipsCampaigns**
> deleteTagRelationshipsCampaigns(id, revision, tagCampaignOp)

Delete Tag Relationships Campaigns

Remove a tag&#39;s association with one or more campaigns.   Use the request body to pass in the ID(s) of the campaign(s) whose association with the tag will be removed.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;campaigns:write&#x60; &#x60;tags:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val tagCampaignOp : TagCampaignOp =  // TagCampaignOp | 
try {
    apiInstance.deleteTagRelationshipsCampaigns(id, revision, tagCampaignOp)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#deleteTagRelationshipsCampaigns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#deleteTagRelationshipsCampaigns")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tagCampaignOp** | [**TagCampaignOp**](TagCampaignOp.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTagRelationshipsFlows"></a>
# **deleteTagRelationshipsFlows**
> deleteTagRelationshipsFlows(id, revision, tagFlowOp)

Delete Tag Relationships Flows

Remove a tag&#39;s association with one or more flows.   Use the request body to pass in the ID(s) of the flows(s) whose association with the tag will be removed.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:write&#x60; &#x60;tags:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val tagFlowOp : TagFlowOp =  // TagFlowOp | 
try {
    apiInstance.deleteTagRelationshipsFlows(id, revision, tagFlowOp)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#deleteTagRelationshipsFlows")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#deleteTagRelationshipsFlows")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tagFlowOp** | [**TagFlowOp**](TagFlowOp.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTagRelationshipsLists"></a>
# **deleteTagRelationshipsLists**
> deleteTagRelationshipsLists(id, revision, tagListOp)

Delete Tag Relationships Lists

Remove a tag&#39;s association with one or more lists.   Use the request body to pass in the ID(s) of the list(s) whose association with the tag will be removed.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;lists:write&#x60; &#x60;tags:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val tagListOp : TagListOp =  // TagListOp | 
try {
    apiInstance.deleteTagRelationshipsLists(id, revision, tagListOp)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#deleteTagRelationshipsLists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#deleteTagRelationshipsLists")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tagListOp** | [**TagListOp**](TagListOp.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTagRelationshipsSegments"></a>
# **deleteTagRelationshipsSegments**
> deleteTagRelationshipsSegments(id, revision, tagSegmentOp)

Delete Tag Relationships Segments

Remove a tag&#39;s association with one or more segments.   Use the request body to pass in the ID(s) of the segments(s) whose association with the tag will be removed.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;segments:write&#x60; &#x60;tags:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val tagSegmentOp : TagSegmentOp =  // TagSegmentOp | 
try {
    apiInstance.deleteTagRelationshipsSegments(id, revision, tagSegmentOp)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#deleteTagRelationshipsSegments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#deleteTagRelationshipsSegments")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tagSegmentOp** | [**TagSegmentOp**](TagSegmentOp.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getTag"></a>
# **getTag**
> GetTagResponseCompoundDocument getTag(id, revision, fieldsTagGroup, fieldsTag, include)

Get Tag

Retrieve the tag with the given tag ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val id : kotlin.String = abcd1234-ef56-gh78-ij90-abcdef123456 // kotlin.String | The Tag ID
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsTagGroup : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsTag : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
try {
    val result : GetTagResponseCompoundDocument = apiInstance.getTag(id, revision, fieldsTagGroup, fieldsTag, include)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#getTag")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#getTag")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The Tag ID | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsTagGroup** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, exclusive, default] |
| **fieldsTag** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: tag-group] |

### Return type

[**GetTagResponseCompoundDocument**](GetTagResponseCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTagGroup"></a>
# **getTagGroup**
> GetTagGroupResponse getTagGroup(id, revision, fieldsTagGroup)

Get Tag Group

Retrieve the tag group with the given tag group ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val id : kotlin.String = zyxw9876-vu54-ts32-rq10-zyxwvu654321 // kotlin.String | The Tag Group ID
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsTagGroup : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetTagGroupResponse = apiInstance.getTagGroup(id, revision, fieldsTagGroup)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#getTagGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#getTagGroup")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The Tag Group ID | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsTagGroup** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, exclusive, default] |

### Return type

[**GetTagGroupResponse**](GetTagGroupResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTagGroupRelationshipsTags"></a>
# **getTagGroupRelationshipsTags**
> GetTagGroupTagRelationshipsResponseCollection getTagGroupRelationshipsTags(id, revision)

Get Tag Group Relationships Tags

Returns the tag IDs of all tags inside the given tag group.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetTagGroupTagRelationshipsResponseCollection = apiInstance.getTagGroupRelationshipsTags(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#getTagGroupRelationshipsTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#getTagGroupRelationshipsTags")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetTagGroupTagRelationshipsResponseCollection**](GetTagGroupTagRelationshipsResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTagGroupTags"></a>
# **getTagGroupTags**
> GetTagResponseCollection getTagGroupTags(id, revision, fieldsTag)

Get Tag Group Tags

Return the tags for a given tag group ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsTag : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetTagResponseCollection = apiInstance.getTagGroupTags(id, revision, fieldsTag)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#getTagGroupTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#getTagGroupTags")
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

<a id="getTagGroups"></a>
# **getTagGroups**
> GetTagGroupResponseCollection getTagGroups(revision, fieldsTagGroup, filter, pageCursor, sort)

Get Tag Groups

List all tag groups in an account. Every account has one default tag group.  Tag groups can be filtered by &#x60;name&#x60;, &#x60;exclusive&#x60;, and &#x60;default&#x60;, and sorted by &#x60;name&#x60; or &#x60;id&#x60; in ascending or descending order.  Returns a maximum of 25 tag groups per request, which can be paginated with [cursor-based pagination](https://developers.klaviyo.com/en/v2022-10-17/reference/api_overview#pagination).&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsTagGroup : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`name`: `contains`, `ends-with`, `equals`, `starts-with`<br>`exclusive`: `equals`<br>`default`: `equals`
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetTagGroupResponseCollection = apiInstance.getTagGroups(revision, fieldsTagGroup, filter, pageCursor, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#getTagGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#getTagGroups")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsTagGroup** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, exclusive, default] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;name&#x60;: &#x60;contains&#x60;, &#x60;ends-with&#x60;, &#x60;equals&#x60;, &#x60;starts-with&#x60;&lt;br&gt;&#x60;exclusive&#x60;: &#x60;equals&#x60;&lt;br&gt;&#x60;default&#x60;: &#x60;equals&#x60; | [optional] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: id, -id, name, -name] |

### Return type

[**GetTagGroupResponseCollection**](GetTagGroupResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTagRelationshipsCampaigns"></a>
# **getTagRelationshipsCampaigns**
> GetTagCampaignRelationshipsResponseCollection getTagRelationshipsCampaigns(id, revision)

Get Tag Relationships Campaigns

Returns the IDs of all campaigns associated with the given tag.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;campaigns:read&#x60; &#x60;tags:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetTagCampaignRelationshipsResponseCollection = apiInstance.getTagRelationshipsCampaigns(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#getTagRelationshipsCampaigns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#getTagRelationshipsCampaigns")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetTagCampaignRelationshipsResponseCollection**](GetTagCampaignRelationshipsResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTagRelationshipsFlows"></a>
# **getTagRelationshipsFlows**
> GetTagFlowRelationshipsResponseCollection getTagRelationshipsFlows(id, revision)

Get Tag Relationships Flows

Returns the IDs of all flows associated with the given tag.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;flows:read&#x60; &#x60;tags:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetTagFlowRelationshipsResponseCollection = apiInstance.getTagRelationshipsFlows(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#getTagRelationshipsFlows")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#getTagRelationshipsFlows")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetTagFlowRelationshipsResponseCollection**](GetTagFlowRelationshipsResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTagRelationshipsLists"></a>
# **getTagRelationshipsLists**
> GetTagListRelationshipsResponseCollection getTagRelationshipsLists(id, revision)

Get Tag Relationships Lists

Returns the IDs of all lists associated with the given tag.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;lists:read&#x60; &#x60;tags:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetTagListRelationshipsResponseCollection = apiInstance.getTagRelationshipsLists(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#getTagRelationshipsLists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#getTagRelationshipsLists")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetTagListRelationshipsResponseCollection**](GetTagListRelationshipsResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTagRelationshipsSegments"></a>
# **getTagRelationshipsSegments**
> GetTagSegmentRelationshipsResponseCollection getTagRelationshipsSegments(id, revision)

Get Tag Relationships Segments

Returns the IDs of all segments associated with the given tag.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;segments:read&#x60; &#x60;tags:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetTagSegmentRelationshipsResponseCollection = apiInstance.getTagRelationshipsSegments(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#getTagRelationshipsSegments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#getTagRelationshipsSegments")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetTagSegmentRelationshipsResponseCollection**](GetTagSegmentRelationshipsResponseCollection.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTagRelationshipsTagGroup"></a>
# **getTagRelationshipsTagGroup**
> GetTagTagGroupRelationshipsResponse getTagRelationshipsTagGroup(id, revision)

Get Tag Relationships Tag Group

Returns the id of the tag group related to the given tag.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
try {
    val result : GetTagTagGroupRelationshipsResponse = apiInstance.getTagRelationshipsTagGroup(id, revision)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#getTagRelationshipsTagGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#getTagRelationshipsTagGroup")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |

### Return type

[**GetTagTagGroupRelationshipsResponse**](GetTagTagGroupRelationshipsResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTagTagGroup"></a>
# **getTagTagGroup**
> GetTagGroupResponse getTagTagGroup(id, revision, fieldsTagGroup)

Get Tag Tag Group

Returns the tag group resource for a given tag ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val id : kotlin.String = id_example // kotlin.String | 
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsTagGroup : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
try {
    val result : GetTagGroupResponse = apiInstance.getTagTagGroup(id, revision, fieldsTagGroup)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#getTagTagGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#getTagTagGroup")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fieldsTagGroup** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, exclusive, default] |

### Return type

[**GetTagGroupResponse**](GetTagGroupResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTags"></a>
# **getTags**
> GetTagResponseCollectionCompoundDocument getTags(revision, fieldsTagGroup, fieldsTag, filter, include, pageCursor, sort)

Get Tags

List all tags in an account.  Tags can be filtered by &#x60;name&#x60;, and sorted by &#x60;name&#x60; or &#x60;id&#x60; in ascending or descending order.  Returns a maximum of 50 tags per request, which can be paginated with [cursor-based pagination](https://developers.klaviyo.com/en/v2022-10-17/reference/api_overview#pagination).&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val fieldsTagGroup : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val fieldsTag : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets
val filter : kotlin.String = filter_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`name`: `contains`, `ends-with`, `equals`, `starts-with`
val include : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships
val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
val sort : kotlin.String = sort_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting
try {
    val result : GetTagResponseCollectionCompoundDocument = apiInstance.getTags(revision, fieldsTagGroup, fieldsTag, filter, include, pageCursor, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#getTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#getTags")
    e.printStackTrace()
}
```

### Parameters
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| **fieldsTagGroup** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name, exclusive, default] |
| **fieldsTag** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets | [optional] [enum: name] |
| **filter** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;&#x60;name&#x60;: &#x60;contains&#x60;, &#x60;ends-with&#x60;, &#x60;equals&#x60;, &#x60;starts-with&#x60; | [optional] |
| **include** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#relationships | [optional] [enum: tag-group] |
| **pageCursor** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sort** | **kotlin.String**| For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sorting | [optional] [enum: id, -id, name, -name] |

### Return type

[**GetTagResponseCollectionCompoundDocument**](GetTagResponseCollectionCompoundDocument.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateTag"></a>
# **updateTag**
> updateTag(id, revision, tagUpdateQuery)

Update Tag

Update the tag with the given tag ID.  Only a tag&#39;s &#x60;name&#x60; can be changed. A tag cannot be moved from one tag group to another.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60; &#x60;tags:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val id : kotlin.String = abcd1234-ef56-gh78-ij90-abcdef123456 // kotlin.String | The Tag ID
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val tagUpdateQuery : TagUpdateQuery =  // TagUpdateQuery | 
try {
    apiInstance.updateTag(id, revision, tagUpdateQuery)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#updateTag")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#updateTag")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The Tag ID | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tagUpdateQuery** | [**TagUpdateQuery**](TagUpdateQuery.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateTagGroup"></a>
# **updateTagGroup**
> PatchTagGroupResponse updateTagGroup(id, revision, tagGroupUpdateQuery)

Update Tag Group

Update the tag group with the given tag group ID.  Only a tag group&#39;s &#x60;name&#x60; can be changed. A tag group&#39;s &#x60;exclusive&#x60; or &#x60;default&#x60; value cannot be changed.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;tags:read&#x60; &#x60;tags:write&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagsApi()
val id : kotlin.String = zyxw9876-vu54-ts32-rq10-zyxwvu654321 // kotlin.String | The Tag Group ID
val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
val tagGroupUpdateQuery : TagGroupUpdateQuery =  // TagGroupUpdateQuery | 
try {
    val result : PatchTagGroupResponse = apiInstance.updateTagGroup(id, revision, tagGroupUpdateQuery)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagsApi#updateTagGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagsApi#updateTagGroup")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**| The Tag Group ID | |
| **revision** | **kotlin.String**| API endpoint revision (format: YYYY-MM-DD[.suffix]) | [default to &quot;2024-07-15&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tagGroupUpdateQuery** | [**TagGroupUpdateQuery**](TagGroupUpdateQuery.md)|  | |

### Return type

[**PatchTagGroupResponse**](PatchTagGroupResponse.md)

### Authorization


Configure Klaviyo-API-Key:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

