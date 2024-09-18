
# CampaignValuesRequestDTOResourceObjectAttributes

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **statistics** | [**inline**](#kotlin.collections.List&lt;Statistics&gt;) | List of statistics to query for. All rate statistics will be returned in fractional form [0.0, 1.0] |  |
| **timeframe** | [**CampaignValuesRequestDTOResourceObjectAttributesTimeframe**](CampaignValuesRequestDTOResourceObjectAttributesTimeframe.md) |  |  |
| **conversionMetricId** | **kotlin.String** | ID of the metric to be used for conversion statistics |  |
| **filter** | **kotlin.String** | API filter string used to filter the query. Allowed filters are send_channel, campaign_id. Allowed operators are equals, contains-any. Only one filter can be used per attribute, only AND can be used as a combination operator. Max of 100 messages per ANY filter. When filtering on send_channel, allowed values are email, push-notification, sms. |  [optional] |


<a id="kotlin.collections.List<Statistics>"></a>
## Enum: statistics
| Name | Value |
| ---- | ----- |
| statistics | average_order_value, bounce_rate, bounced, bounced_or_failed, bounced_or_failed_rate, click_rate, click_to_open_rate, clicks, clicks_unique, conversion_rate, conversion_uniques, conversion_value, conversions, delivered, delivery_rate, failed, failed_rate, open_rate, opens, opens_unique, recipients, revenue_per_recipient, spam_complaint_rate, spam_complaints, unsubscribe_rate, unsubscribe_uniques, unsubscribes |



