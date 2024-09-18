# RelativeDateOperatorBaseFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**DateEnum**](DateEnum.md) |  | 
**operator** | [**OperatorEnum**](#OperatorEnum) | Operators for relative date filters.  e.g. \&quot;in the last 10 days\&quot; | 
**unit** | [**UnitEnum**](#UnitEnum) | Units for relative date filters. | 
**quantity** | **Integer** |  | 

<a name="OperatorEnum"></a>
## Enum: OperatorEnum
Name | Value
---- | -----
AT_LEAST | &quot;at-least&quot;
IN_THE_LAST | &quot;in-the-last&quot;
IN_THE_NEXT | &quot;in-the-next&quot;

<a name="UnitEnum"></a>
## Enum: UnitEnum
Name | Value
---- | -----
DAY | &quot;day&quot;
HOUR | &quot;hour&quot;
WEEK | &quot;week&quot;
