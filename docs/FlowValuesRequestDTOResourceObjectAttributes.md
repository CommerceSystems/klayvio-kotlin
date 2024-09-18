# FlowValuesRequestDTOResourceObjectAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**statistics** | [**List&lt;StatisticsEnum&gt;**](#List&lt;StatisticsEnum&gt;) | List of statistics to query for. All rate statistics will be returned in fractional form [0.0, 1.0] | 
**timeframe** | **OneOfFlowValuesRequestDTOResourceObjectAttributesTimeframe** | The timeframe to query for data within. The max length a timeframe can be is 1 year | 
**conversionMetricId** | **String** | ID of the metric to be used for conversion statistics | 
**filter** | **String** | API filter string used to filter the query. Allowed filters are flow_id, send_channel, flow_message_id. Allowed operators are equals, contains-any. Only one filter can be used per attribute, only AND can be used as a combination operator. Max of 100 messages per ANY filter. When filtering on send_channel, allowed values are email, push-notification, sms. |  [optional]

<a name="List<StatisticsEnum>"></a>
## Enum: List&lt;StatisticsEnum&gt;
Name | Value
---- | -----
AVERAGE_ORDER_VALUE | &quot;average_order_value&quot;
BOUNCE_RATE | &quot;bounce_rate&quot;
BOUNCED | &quot;bounced&quot;
BOUNCED_OR_FAILED | &quot;bounced_or_failed&quot;
BOUNCED_OR_FAILED_RATE | &quot;bounced_or_failed_rate&quot;
CLICK_RATE | &quot;click_rate&quot;
CLICK_TO_OPEN_RATE | &quot;click_to_open_rate&quot;
CLICKS | &quot;clicks&quot;
CLICKS_UNIQUE | &quot;clicks_unique&quot;
CONVERSION_RATE | &quot;conversion_rate&quot;
CONVERSION_UNIQUES | &quot;conversion_uniques&quot;
CONVERSION_VALUE | &quot;conversion_value&quot;
CONVERSIONS | &quot;conversions&quot;
DELIVERED | &quot;delivered&quot;
DELIVERY_RATE | &quot;delivery_rate&quot;
FAILED | &quot;failed&quot;
FAILED_RATE | &quot;failed_rate&quot;
OPEN_RATE | &quot;open_rate&quot;
OPENS | &quot;opens&quot;
OPENS_UNIQUE | &quot;opens_unique&quot;
RECIPIENTS | &quot;recipients&quot;
REVENUE_PER_RECIPIENT | &quot;revenue_per_recipient&quot;
SPAM_COMPLAINT_RATE | &quot;spam_complaint_rate&quot;
SPAM_COMPLAINTS | &quot;spam_complaints&quot;
UNSUBSCRIBE_RATE | &quot;unsubscribe_rate&quot;
UNSUBSCRIBE_UNIQUES | &quot;unsubscribe_uniques&quot;
UNSUBSCRIBES | &quot;unsubscribes&quot;
