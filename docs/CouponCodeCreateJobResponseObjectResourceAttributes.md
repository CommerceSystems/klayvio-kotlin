# CouponCodeCreateJobResponseObjectResourceAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Status of the asynchronous job. | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time the job was created in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm). | 
**totalCount** | **Integer** | The total number of operations to be processed by the job. See &#x60;completed_count&#x60; for the job&#x27;s current progress. | 
**completedCount** | **Integer** | The total number of operations that have been completed by the job. |  [optional]
**failedCount** | **Integer** | The total number of operations that have failed as part of the job. |  [optional]
**completedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time the job was completed in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm). |  [optional]
**errors** | [**List&lt;APIJobErrorPayload&gt;**](APIJobErrorPayload.md) | Array of errors encountered during the processing of the job. |  [optional]
**expiresAt** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time the job expires in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm). |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
CANCELLED | &quot;cancelled&quot;
COMPLETE | &quot;complete&quot;
PROCESSING | &quot;processing&quot;
QUEUED | &quot;queued&quot;
