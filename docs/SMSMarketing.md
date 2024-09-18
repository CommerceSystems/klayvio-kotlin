
# SMSMarketing

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **canReceiveSmsMarketing** | **kotlin.Boolean** | Whether or not this profile is subscribed to receive SMS marketing. |  |
| **consent** | **kotlin.String** | The consent status for SMS marketing. |  |
| **consentTimestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The timestamp when consent was recorded or updated for SMS marketing, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm). |  [optional] |
| **method** | **kotlin.String** | The method by which the profile was subscribed to SMS marketing. |  [optional] |
| **methodDetail** | **kotlin.String** | Additional details about the method which the profile was subscribed to SMS marketing. This may be empty if no details were provided. |  [optional] |
| **lastUpdated** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The timestamp when the SMS consent record was last modified, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm). |  [optional] |



