
# PushTokenCreateQueryResourceObjectAttributes

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **token** | **kotlin.String** | A push token from APNS or FCM. |  |
| **platform** | [**inline**](#Platform) | The platform on which the push token was created. |  |
| **vendor** | [**inline**](#Vendor) | The vendor of the push token. |  |
| **profile** | [**PushTokenCreateQueryResourceObjectAttributesProfile**](PushTokenCreateQueryResourceObjectAttributesProfile.md) |  |  |
| **enablementStatus** | [**inline**](#EnablementStatus) | This is the enablement status for the individual push token. |  [optional] |
| **background** | [**inline**](#Background) | The background state of the push token. |  [optional] |
| **deviceMetadata** | [**DeviceMetadata**](DeviceMetadata.md) |  |  [optional] |


<a id="Platform"></a>
## Enum: platform
| Name | Value |
| ---- | ----- |
| platform | android, ios |


<a id="Vendor"></a>
## Enum: vendor
| Name | Value |
| ---- | ----- |
| vendor | apns, fcm |


<a id="EnablementStatus"></a>
## Enum: enablement_status
| Name | Value |
| ---- | ----- |
| enablementStatus | AUTHORIZED, DENIED, NOT_DETERMINED, PROVISIONAL, UNAUTHORIZED |


<a id="Background"></a>
## Enum: background
| Name | Value |
| ---- | ----- |
| background | AVAILABLE, DENIED, RESTRICTED |



