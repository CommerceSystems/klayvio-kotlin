# FormResponseObjectResourceAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the form. | 
**status** | [**StatusEnum**](#StatusEnum) | Status of the form. A live form with an in-progress draft is considered \&quot;live\&quot;. | 
**abTest** | **Boolean** | Whether the form has an A/B test configured, regardless of its status. | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO8601 timestamp when the form was created. | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO8601 timestamp when the form was last updated. | 

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
DRAFT | &quot;draft&quot;
LIVE | &quot;live&quot;
