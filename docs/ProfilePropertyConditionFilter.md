
# ProfilePropertyConditionFilter

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**ExistenceEnum**](ExistenceEnum.md) |  |  |
| **&#x60;operator&#x60;** | [**inline**](#&#x60;Operator&#x60;) | Operators for existence filters. |  |
| **&#x60;value&#x60;** | **kotlin.Int** |  |  |
| **date** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **start** | **kotlin.Int** |  |  |
| **end** | **kotlin.Int** |  |  |
| **unit** | [**inline**](#Unit) | Units for relative date filters. |  |
| **quantity** | **kotlin.Int** |  |  |


<a id="`Operator`"></a>
## Enum: operator
| Name | Value |
| ---- | ----- |
| &#x60;operator&#x60; | is-set, not-set |


<a id="Unit"></a>
## Enum: unit
| Name | Value |
| ---- | ----- |
| unit | day, hour, week |



