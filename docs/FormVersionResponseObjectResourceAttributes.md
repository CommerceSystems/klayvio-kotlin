
# FormVersionResponseObjectResourceAttributes

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **formType** | [**inline**](#FormType) | The type of form. |  |
| **status** | [**inline**](#Status) | Status of the form version. \&quot;live\&quot; means it&#39;s live on site. |  |
| **createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 timestamp when the form version was created. |  |
| **updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | ISO8601 timestamp when the form version was last updated. |  |
| **abTest** | [**FormVersionABTest**](FormVersionABTest.md) |  |  [optional] |


<a id="FormType"></a>
## Enum: form_type
| Name | Value |
| ---- | ----- |
| formType | banner, embed, flyout, full_page, popup |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | draft, live |



