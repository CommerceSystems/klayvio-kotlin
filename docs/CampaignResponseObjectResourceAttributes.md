# CampaignResponseObjectResourceAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The campaign name | 
**status** | **String** | The current status of the campaign | 
**archived** | **Boolean** | Whether the campaign has been archived or not | 
**audiences** | [**AudiencesSubObject**](AudiencesSubObject.md) |  | 
**sendOptions** | **OneOfCampaignResponseObjectResourceAttributesSendOptions** | Options to use when sending a campaign | 
**trackingOptions** | **OneOfCampaignResponseObjectResourceAttributesTrackingOptions** | The tracking options associated with the campaign | 
**sendStrategy** | [**SendStrategySubObject**](SendStrategySubObject.md) |  | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime when the campaign was created | 
**scheduledAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime when the campaign was scheduled for future sending |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime when the campaign was last updated by a user or the system | 
**sendTime** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime when the campaign will be / was sent or None if not yet scheduled by a send_job. |  [optional]
