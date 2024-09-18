
# ProfileMetricCondition

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**ProfileMetricEnum**](ProfileMetricEnum.md) |  |  |
| **metricId** | **kotlin.String** |  |  |
| **measurement** | [**inline**](#Measurement) | Measurements for profile metrics. |  |
| **measurementFilter** | [**NumericOperatorFilter**](NumericOperatorFilter.md) |  |  |
| **timeframeFilter** | [**ProfileMetricConditionTimeframeFilter**](ProfileMetricConditionTimeframeFilter.md) |  |  |
| **metricFilters** | [**kotlin.collections.List&lt;ProfileMetricPropertyFilter&gt;**](ProfileMetricPropertyFilter.md) |  |  [optional] |


<a id="Measurement"></a>
## Enum: measurement
| Name | Value |
| ---- | ----- |
| measurement | count, sum |



