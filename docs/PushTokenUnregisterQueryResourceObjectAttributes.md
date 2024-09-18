# PushTokenUnregisterQueryResourceObjectAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** | A push token from APNS or FCM. | 
**platform** | [**PlatformEnum**](#PlatformEnum) | The platform on which the push token was created. | 
**vendor** | [**VendorEnum**](#VendorEnum) | The vendor of the push token. |  [optional]
**profile** | [**PushTokenUnregisterQueryResourceObjectAttributesProfile**](PushTokenUnregisterQueryResourceObjectAttributesProfile.md) |  | 

<a name="PlatformEnum"></a>
## Enum: PlatformEnum
Name | Value
---- | -----
ANDROID | &quot;android&quot;
IOS | &quot;ios&quot;

<a name="VendorEnum"></a>
## Enum: VendorEnum
Name | Value
---- | -----
APNS | &quot;apns&quot;
FCM | &quot;fcm&quot;
