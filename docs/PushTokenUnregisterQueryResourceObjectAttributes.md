
# PushTokenUnregisterQueryResourceObjectAttributes

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **token** | **kotlin.String** | A push token from APNS or FCM. |  |
| **platform** | [**inline**](#Platform) | The platform on which the push token was created. |  |
| **profile** | [**PushTokenUnregisterQueryResourceObjectAttributesProfile**](PushTokenUnregisterQueryResourceObjectAttributesProfile.md) |  |  |
| **vendor** | [**inline**](#Vendor) | The vendor of the push token. |  [optional] |


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



