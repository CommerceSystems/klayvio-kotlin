
# CampaignMessageResponseObjectResourceAttributes

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **label** | **kotlin.String** | The label or name on the message |  |
| **channel** | **kotlin.String** | The channel the message is to be sent on |  |
| **content** | [**CampaignMessageResponseObjectResourceAttributesContent**](CampaignMessageResponseObjectResourceAttributesContent.md) |  |  |
| **sendTimes** | [**kotlin.collections.List&lt;SendTimeSubObject&gt;**](SendTimeSubObject.md) | The list of appropriate Send Time Sub-objects associated with the message |  [optional] |
| **renderOptions** | [**RenderOptionsSubObject**](RenderOptionsSubObject.md) |  |  [optional] |
| **createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The datetime when the message was created |  [optional] |
| **updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The datetime when the message was last updated |  [optional] |



