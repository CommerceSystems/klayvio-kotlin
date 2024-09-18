# DeviceMetadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deviceId** | **String** | Relatively stable ID for the device. Will update on app uninstall and reinstall |  [optional]
**klaviyoSdk** | [**KlaviyoSdkEnum**](#KlaviyoSdkEnum) | The name of the SDK used to create the push token. |  [optional]
**sdkVersion** | **String** | The version of the SDK used to create the push token |  [optional]
**deviceModel** | **String** | The model of the device |  [optional]
**osName** | [**OsNameEnum**](#OsNameEnum) | The name of the operating system on the device. |  [optional]
**osVersion** | **String** | The version of the operating system on the device |  [optional]
**manufacturer** | **String** | The manufacturer of the device |  [optional]
**appName** | **String** | The name of the app that created the push token |  [optional]
**appVersion** | **String** | The version of the app that created the push token |  [optional]
**appBuild** | **String** | The build of the app that created the push token |  [optional]
**appId** | **String** | The ID of the app that created the push token |  [optional]
**environment** | [**EnvironmentEnum**](#EnvironmentEnum) | The environment in which the push token was created |  [optional]

<a name="KlaviyoSdkEnum"></a>
## Enum: KlaviyoSdkEnum
Name | Value
---- | -----
ANDROID | &quot;android&quot;
SWIFT | &quot;swift&quot;

<a name="OsNameEnum"></a>
## Enum: OsNameEnum
Name | Value
---- | -----
ANDROID | &quot;android&quot;
IOS | &quot;ios&quot;
IPADOS | &quot;ipados&quot;
MACOS | &quot;macos&quot;
TVOS | &quot;tvos&quot;

<a name="EnvironmentEnum"></a>
## Enum: EnvironmentEnum
Name | Value
---- | -----
DEBUG | &quot;debug&quot;
RELEASE | &quot;release&quot;
