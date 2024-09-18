# RelativeAnniversaryDateFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**DateEnum**](DateEnum.md) |  | 
**operator** | [**OperatorEnum**](#OperatorEnum) | Operators for relative date filters.  e.g. \&quot;anniversary in the last 10 days\&quot; | 
**unit** | [**UnitEnum**](#UnitEnum) | Units for relative date filters. | 
**quantity** | **Integer** |  | 

<a name="OperatorEnum"></a>
## Enum: OperatorEnum
Name | Value
---- | -----
LAST | &quot;anniversary-last&quot;
NEXT | &quot;anniversary-next&quot;

<a name="UnitEnum"></a>
## Enum: UnitEnum
Name | Value
---- | -----
DAY | &quot;day&quot;
HOUR | &quot;hour&quot;
WEEK | &quot;week&quot;
