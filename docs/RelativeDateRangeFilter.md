# RelativeDateRangeFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**DateEnum**](DateEnum.md) |  | 
**operator** | [**OperatorEnum**](#OperatorEnum) | Operators for relative date range filters.  e.g. \&quot;between 10 and 20 days ago\&quot; | 
**start** | **Integer** |  | 
**end** | **Integer** |  | 
**unit** | [**UnitEnum**](#UnitEnum) | Units for relative date filters. | 

<a name="OperatorEnum"></a>
## Enum: OperatorEnum
Name | Value
---- | -----
BETWEEN | &quot;between&quot;

<a name="UnitEnum"></a>
## Enum: UnitEnum
Name | Value
---- | -----
DAY | &quot;day&quot;
HOUR | &quot;hour&quot;
WEEK | &quot;week&quot;
