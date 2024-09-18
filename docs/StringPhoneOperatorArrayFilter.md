# StringPhoneOperatorArrayFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**StringEnum**](StringEnum.md) |  | 
**operator** | [**OperatorEnum**](#OperatorEnum) | Operators for phone string array filters.  Example condition using this filter:     { | 
**value** | **List&lt;String&gt;** |  | 

<a name="OperatorEnum"></a>
## Enum: OperatorEnum
Name | Value
---- | -----
IN | &quot;phone-country-code-in&quot;
NOT_IN | &quot;phone-country-code-not-in&quot;
