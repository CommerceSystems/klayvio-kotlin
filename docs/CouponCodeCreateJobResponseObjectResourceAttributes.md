
# CouponCodeCreateJobResponseObjectResourceAttributes

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**inline**](#Status) | Status of the asynchronous job. |  |
| **createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time the job was created in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm). |  |
| **totalCount** | **kotlin.Int** | The total number of operations to be processed by the job. See &#x60;completed_count&#x60; for the job&#39;s current progress. |  |
| **completedCount** | **kotlin.Int** | The total number of operations that have been completed by the job. |  [optional] |
| **failedCount** | **kotlin.Int** | The total number of operations that have failed as part of the job. |  [optional] |
| **completedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time the job was completed in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm). |  [optional] |
| **errors** | [**kotlin.collections.List&lt;APIJobErrorPayload&gt;**](APIJobErrorPayload.md) | Array of errors encountered during the processing of the job. |  [optional] |
| **expiresAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time the job expires in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm). |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | cancelled, complete, processing, queued |



