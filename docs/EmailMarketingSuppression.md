# EmailMarketingSuppression

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | [**ReasonEnum**](#ReasonEnum) | The reason the profile was suppressed. | 
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the profile was suppressed, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm). | 

<a name="ReasonEnum"></a>
## Enum: ReasonEnum
Name | Value
---- | -----
HARD_BOUNCE | &quot;HARD_BOUNCE&quot;
INVALID_EMAIL | &quot;INVALID_EMAIL&quot;
SPAM_COMPLAINT | &quot;SPAM_COMPLAINT&quot;
UNSUBSCRIBE | &quot;UNSUBSCRIBE&quot;
USER_SUPPRESSED | &quot;USER_SUPPRESSED&quot;
