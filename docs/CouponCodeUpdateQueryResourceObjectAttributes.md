
# CouponCodeUpdateQueryResourceObjectAttributes

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**inline**](#Status) | The API status of our coupon codes. |  [optional] |
| **expiresAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The datetime when this coupon code will expire. If not specified or set to null, it will be automatically set to 1 year. |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | ASSIGNED_TO_PROFILE, DELETING, PROCESSING, UNASSIGNED, USED, VERSION_NOT_ACTIVE |



