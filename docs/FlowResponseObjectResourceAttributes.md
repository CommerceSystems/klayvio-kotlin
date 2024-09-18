# FlowResponseObjectResourceAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**status** | **String** |  |  [optional]
**archived** | **Boolean** |  |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**triggerType** | [**TriggerTypeEnum**](#TriggerTypeEnum) | Corresponds to the object which triggered the flow. |  [optional]

<a name="TriggerTypeEnum"></a>
## Enum: TriggerTypeEnum
Name | Value
---- | -----
ADDED_TO_LIST | &quot;Added to List&quot;
DATE_BASED | &quot;Date Based&quot;
LOW_INVENTORY | &quot;Low Inventory&quot;
METRIC | &quot;Metric&quot;
PRICE_DROP | &quot;Price Drop&quot;
UNCONFIGURED | &quot;Unconfigured&quot;
