
# EmailMarketing

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **canReceiveEmailMarketing** | **kotlin.Boolean** | Whether or not this profile has implicit consent to receive email marketing. True if it does profile does not have any global suppressions. |  |
| **consent** | **kotlin.String** | The consent status for email marketing. |  |
| **consentTimestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The timestamp when consent was recorded or updated for email marketing, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm). |  [optional] |
| **lastUpdated** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The timestamp when a field on the email marketing object was last modified. |  [optional] |
| **method** | **kotlin.String** | The method by which the profile was subscribed to email marketing. |  [optional] |
| **methodDetail** | **kotlin.String** | Additional details about the method by which the profile was subscribed to email marketing. This may be empty if no details were provided. |  [optional] |
| **customMethodDetail** | **kotlin.String** | Additional detail provided by the caller when the profile was subscribed. This may be empty if no details were provided. |  [optional] |
| **doubleOptin** | **kotlin.Boolean** | Whether the profile was subscribed to email marketing using a double opt-in. |  [optional] |
| **suppression** | [**kotlin.collections.List&lt;EmailMarketingSuppression&gt;**](EmailMarketingSuppression.md) | The global email marketing suppression for this profile. |  [optional] |
| **listSuppressions** | [**kotlin.collections.List&lt;EmailMarketingListSuppression&gt;**](EmailMarketingListSuppression.md) | The list suppressions for this profile. |  [optional] |



