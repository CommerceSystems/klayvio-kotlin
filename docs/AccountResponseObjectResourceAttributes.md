
# AccountResponseObjectResourceAttributes

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **testAccount** | **kotlin.Boolean** | Indicates if the account is a test account. Test accounts are not a separate testing engineering environment. Test accounts use the same production environment as normal Klaviyo accounts. This feature is primarily UI based to reduce human errors |  |
| **contactInformation** | [**ContactInformation**](ContactInformation.md) |  |  |
| **industry** | **kotlin.String** | The kind of business and/or types of goods that the business sells. This is leveraged in Klaviyo analytics and guidance. |  |
| **timezone** | **kotlin.String** | The account&#39;s timezone is used when displaying dates and times. This is an IANA timezone. See [the full list here ](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). |  |
| **preferredCurrency** | **kotlin.String** | The preferred currency for the account. This is the currency used for currency-based metrics in dashboards, analytics, coupons, and templates. |  |
| **publicApiKey** | **kotlin.String** | The Public API Key can be used for client-side API calls. [More info here](https://developers.klaviyo.com/en/docs/retrieve_api_credentials). |  |
| **locale** | **kotlin.String** | The account&#39;s locale is used to determine the region and language for the account. |  |



