# MarketingSubscriptionParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**consent** | [**ConsentEnum**](#ConsentEnum) | The Consent status to subscribe to for the \&quot;Marketing\&quot; type. Currently supports \&quot;SUBSCRIBED\&quot;. | 
**consentedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of when the profile&#x27;s consent was gathered. This should only be used when syncing over historical consent info to Klaviyo; if the &#x60;historical_import&#x60; flag is not included, providing any value for this field will raise an error. |  [optional]

<a name="ConsentEnum"></a>
## Enum: ConsentEnum
Name | Value
---- | -----
SUBSCRIBED | &quot;SUBSCRIBED&quot;
