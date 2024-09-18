# CouponCodeUpdateQueryResourceObjectAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | The API status of our coupon codes. |  [optional]
**expiresAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime when this coupon code will expire. If not specified or set to null, it will be automatically set to 1 year. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ASSIGNED_TO_PROFILE | &quot;ASSIGNED_TO_PROFILE&quot;
DELETING | &quot;DELETING&quot;
PROCESSING | &quot;PROCESSING&quot;
UNASSIGNED | &quot;UNASSIGNED&quot;
USED | &quot;USED&quot;
VERSION_NOT_ACTIVE | &quot;VERSION_NOT_ACTIVE&quot;
