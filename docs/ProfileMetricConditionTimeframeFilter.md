
# ProfileMetricConditionTimeframeFilter

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**DateEnum**](DateEnum.md) |  |  |
| **&#x60;operator&#x60;** | [**inline**](#&#x60;Operator&#x60;) | Operators for alltime date filters. |  |
| **date** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **start** | **kotlin.Int** |  |  |
| **end** | **kotlin.Int** |  |  |
| **unit** | [**inline**](#Unit) | Units for relative date filters. |  |
| **quantity** | **kotlin.Int** |  |  |


<a id="`Operator`"></a>
## Enum: operator
| Name | Value |
| ---- | ----- |
| &#x60;operator&#x60; | alltime |


<a id="Unit"></a>
## Enum: unit
| Name | Value |
| ---- | ----- |
| unit | day, hour, week |



