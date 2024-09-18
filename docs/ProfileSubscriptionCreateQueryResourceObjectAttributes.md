# ProfileSubscriptionCreateQueryResourceObjectAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** | The email address to subscribe or to set on the profile if &#x60;channels&#x60; is specified and the email channel is omitted. |  [optional]
**phoneNumber** | **String** | The phone number to subscribe or to set on the profile if &#x60;channels&#x60; is specified and the SMS channel is omitted. This must be in E.164 format. |  [optional]
**subscriptions** | [**SubscriptionChannels**](SubscriptionChannels.md) |  |  [optional]
**ageGatedDateOfBirth** | [**LocalDate**](LocalDate.md) | The profile&#x27;s date of birth. This field is required to update SMS consent for accounts using age-gating: https://help.klaviyo.com/hc/en-us/articles/17252552814875 |  [optional]
