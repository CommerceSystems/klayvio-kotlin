
# FormResponseObjectResourceAttributes

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | Name of the form. |  |
| **status** | [**inline**](#Status) | Status of the form. A live form with an in-progress draft is considered \&quot;live\&quot;. |  |
| **abTest** | **kotlin.Boolean** | Whether the form has an A/B test configured, regardless of its status. |  |
| **createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 timestamp when the form was created. |  |
| **updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 timestamp when the form was last updated. |  |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | draft, live |



