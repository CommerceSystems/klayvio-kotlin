
# ConditionGroupConditionsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**ProfilePredictiveAnalyticsEnum**](ProfilePredictiveAnalyticsEnum.md) |  |  |
| **isMember** | [**inline**](#IsMember) |  |  |
| **groupIds** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  |
| **timeframeFilter** | [**ProfileMetricConditionTimeframeFilter**](ProfileMetricConditionTimeframeFilter.md) |  |  |
| **metricId** | **kotlin.String** |  |  |
| **measurement** | [**inline**](#Measurement) | Measurements for profile metrics. |  |
| **measurementFilter** | [**NumericOperatorFilter**](NumericOperatorFilter.md) |  |  |
| **consent** | [**ProfileMarketingConsentConditionConsent**](ProfileMarketingConsentConditionConsent.md) |  |  |
| **countryCode** | **kotlin.String** |  |  |
| **postalCode** | **kotlin.String** |  |  |
| **unit** | [**inline**](#Unit) | Units for profile postal code distance conditions. |  |
| **filter** | [**ProfilePredictiveAnalyticsStringFilter**](ProfilePredictiveAnalyticsStringFilter.md) |  |  |
| **&#x60;property&#x60;** | **kotlin.String** |  |  |
| **inRegion** | **kotlin.Boolean** |  |  |
| **region** | [**inline**](#Region) | Regions for profile region conditions. |  |
| **dimension** | [**inline**](#Dimension) | Dimension for string profile predictive analytics conditions. |  |
| **metricFilters** | [**kotlin.collections.List&lt;ProfileMetricPropertyFilter&gt;**](ProfileMetricPropertyFilter.md) |  |  [optional] |


<a id="IsMember"></a>
## Enum: is_member
| Name | Value |
| ---- | ----- |
| isMember | false |


<a id="Measurement"></a>
## Enum: measurement
| Name | Value |
| ---- | ----- |
| measurement | count, sum |


<a id="Unit"></a>
## Enum: unit
| Name | Value |
| ---- | ----- |
| unit | kilometers, miles |


<a id="Region"></a>
## Enum: region
| Name | Value |
| ---- | ----- |
| region | european_union, united_states |


<a id="Dimension"></a>
## Enum: dimension
| Name | Value |
| ---- | ----- |
| dimension | predicted_gender |



