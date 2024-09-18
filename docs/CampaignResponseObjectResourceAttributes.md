
# CampaignResponseObjectResourceAttributes

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | The campaign name |  |
| **status** | **kotlin.String** | The current status of the campaign |  |
| **archived** | **kotlin.Boolean** | Whether the campaign has been archived or not |  |
| **audiences** | [**AudiencesSubObject**](AudiencesSubObject.md) |  |  |
| **sendOptions** | [**CampaignResponseObjectResourceAttributesSendOptions**](CampaignResponseObjectResourceAttributesSendOptions.md) |  |  |
| **trackingOptions** | [**CampaignResponseObjectResourceAttributesTrackingOptions**](CampaignResponseObjectResourceAttributesTrackingOptions.md) |  |  |
| **sendStrategy** | [**SendStrategySubObject**](SendStrategySubObject.md) |  |  |
| **createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The datetime when the campaign was created |  |
| **updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The datetime when the campaign was last updated by a user or the system |  |
| **scheduledAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The datetime when the campaign was scheduled for future sending |  [optional] |
| **sendTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The datetime when the campaign will be / was sent or None if not yet scheduled by a send_job. |  [optional] |



