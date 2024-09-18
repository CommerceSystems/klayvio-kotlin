# CampaignMessageResponseObjectResourceAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **String** | The label or name on the message | 
**channel** | **String** | The channel the message is to be sent on | 
**content** | **OneOfCampaignMessageResponseObjectResourceAttributesContent** | Additional attributes relating to the content of the message | 
**sendTimes** | [**List&lt;SendTimeSubObject&gt;**](SendTimeSubObject.md) | The list of appropriate Send Time Sub-objects associated with the message |  [optional]
**renderOptions** | [**RenderOptionsSubObject**](RenderOptionsSubObject.md) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime when the message was created |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime when the message was last updated |  [optional]
