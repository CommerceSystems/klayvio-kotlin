
# DeviceMetadata

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **deviceId** | **kotlin.String** | Relatively stable ID for the device. Will update on app uninstall and reinstall |  [optional] |
| **klaviyoSdk** | [**inline**](#KlaviyoSdk) | The name of the SDK used to create the push token. |  [optional] |
| **sdkVersion** | **kotlin.String** | The version of the SDK used to create the push token |  [optional] |
| **deviceModel** | **kotlin.String** | The model of the device |  [optional] |
| **osName** | [**inline**](#OsName) | The name of the operating system on the device. |  [optional] |
| **osVersion** | **kotlin.String** | The version of the operating system on the device |  [optional] |
| **manufacturer** | **kotlin.String** | The manufacturer of the device |  [optional] |
| **appName** | **kotlin.String** | The name of the app that created the push token |  [optional] |
| **appVersion** | **kotlin.String** | The version of the app that created the push token |  [optional] |
| **appBuild** | **kotlin.String** | The build of the app that created the push token |  [optional] |
| **appId** | **kotlin.String** | The ID of the app that created the push token |  [optional] |
| **environment** | [**inline**](#Environment) | The environment in which the push token was created |  [optional] |


<a id="KlaviyoSdk"></a>
## Enum: klaviyo_sdk
| Name | Value |
| ---- | ----- |
| klaviyoSdk | android, swift |


<a id="OsName"></a>
## Enum: os_name
| Name | Value |
| ---- | ----- |
| osName | android, ios, ipados, macos, tvos |


<a id="Environment"></a>
## Enum: environment
| Name | Value |
| ---- | ----- |
| environment | debug, release |



