# PushTokenCreateQueryResourceObjectAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** | A push token from APNS or FCM. | 
**platform** | [**PlatformEnum**](#PlatformEnum) | The platform on which the push token was created. | 
**enablementStatus** | [**EnablementStatusEnum**](#EnablementStatusEnum) | This is the enablement status for the individual push token. |  [optional]
**vendor** | [**VendorEnum**](#VendorEnum) | The vendor of the push token. | 
**background** | [**BackgroundEnum**](#BackgroundEnum) | The background state of the push token. |  [optional]
**deviceMetadata** | [**DeviceMetadata**](DeviceMetadata.md) |  |  [optional]
**profile** | [**PushTokenCreateQueryResourceObjectAttributesProfile**](PushTokenCreateQueryResourceObjectAttributesProfile.md) |  | 

<a name="PlatformEnum"></a>
## Enum: PlatformEnum
Name | Value
---- | -----
ANDROID | &quot;android&quot;
IOS | &quot;ios&quot;

<a name="EnablementStatusEnum"></a>
## Enum: EnablementStatusEnum
Name | Value
---- | -----
AUTHORIZED | &quot;AUTHORIZED&quot;
DENIED | &quot;DENIED&quot;
NOT_DETERMINED | &quot;NOT_DETERMINED&quot;
PROVISIONAL | &quot;PROVISIONAL&quot;
UNAUTHORIZED | &quot;UNAUTHORIZED&quot;

<a name="VendorEnum"></a>
## Enum: VendorEnum
Name | Value
---- | -----
APNS | &quot;apns&quot;
FCM | &quot;fcm&quot;

<a name="BackgroundEnum"></a>
## Enum: BackgroundEnum
Name | Value
---- | -----
AVAILABLE | &quot;AVAILABLE&quot;
DENIED | &quot;DENIED&quot;
RESTRICTED | &quot;RESTRICTED&quot;
