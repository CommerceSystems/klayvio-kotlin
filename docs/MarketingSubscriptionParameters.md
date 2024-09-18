
# MarketingSubscriptionParameters

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **consent** | [**inline**](#Consent) | The Consent status to subscribe to for the \&quot;Marketing\&quot; type. Currently supports \&quot;SUBSCRIBED\&quot;. |  |
| **consentedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The timestamp of when the profile&#39;s consent was gathered. This should only be used when syncing over historical consent info to Klaviyo; if the &#x60;historical_import&#x60; flag is not included, providing any value for this field will raise an error. |  [optional] |


<a id="Consent"></a>
## Enum: consent
| Name | Value |
| ---- | ----- |
| consent | SUBSCRIBED |



