
# ListListResponseObjectResourceAttributes

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | A helpful name to label the list |  [optional] |
| **created** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the list was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm) |  [optional] |
| **updated** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time when the list was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm) |  [optional] |
| **optInProcess** | [**inline**](#OptInProcess) | The opt-in process for this list.  Could be either &#39;single_opt_in&#39; or &#39;double_opt_in&#39;. |  [optional] |


<a id="OptInProcess"></a>
## Enum: opt_in_process
| Name | Value |
| ---- | ----- |
| optInProcess | double_opt_in, single_opt_in |



