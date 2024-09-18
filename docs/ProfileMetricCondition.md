# ProfileMetricCondition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**ProfileMetricEnum**](ProfileMetricEnum.md) |  | 
**metricId** | **String** |  | 
**measurement** | [**MeasurementEnum**](#MeasurementEnum) | Measurements for profile metrics. | 
**measurementFilter** | [**NumericOperatorFilter**](NumericOperatorFilter.md) |  | 
**timeframeFilter** | **OneOfProfileMetricConditionTimeframeFilter** |  | 
**metricFilters** | [**List&lt;ProfileMetricPropertyFilter&gt;**](ProfileMetricPropertyFilter.md) |  |  [optional]

<a name="MeasurementEnum"></a>
## Enum: MeasurementEnum
Name | Value
---- | -----
COUNT | &quot;count&quot;
SUM | &quot;sum&quot;
