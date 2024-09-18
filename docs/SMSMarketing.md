# SMSMarketing

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canReceiveSmsMarketing** | **Boolean** | Whether or not this profile is subscribed to receive SMS marketing. | 
**consent** | **String** | The consent status for SMS marketing. | 
**consentTimestamp** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when consent was recorded or updated for SMS marketing, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm). |  [optional]
**method** | **String** | The method by which the profile was subscribed to SMS marketing. |  [optional]
**methodDetail** | **String** | Additional details about the method which the profile was subscribed to SMS marketing. This may be empty if no details were provided. |  [optional]
**lastUpdated** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp when the SMS consent record was last modified, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm). |  [optional]
