
# MetricAggregateQueryResourceObjectAttributes

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metricId** | **kotlin.String** | The metric ID used in the aggregation. |  |
| **measurements** | [**inline**](#kotlin.collections.List&lt;Measurements&gt;) | Measurement key, e.g. &#x60;unique&#x60;, &#x60;sum_value&#x60;, &#x60;count&#x60; |  |
| **filter** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of filters, must include time range using ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).             These filters follow a similar format to those in &#x60;GET&#x60; requests, the primary difference is that this endpoint asks for a list.             The time range can be filtered by providing a &#x60;greater-or-equal&#x60; and a &#x60;less-than&#x60; filter on the &#x60;datetime&#x60; field. |  |
| **pageCursor** | **kotlin.String** | Optional pagination cursor to iterate over large result sets |  [optional] |
| **interval** | [**inline**](#Interval) | Aggregation interval, e.g. \&quot;hour\&quot;, \&quot;day\&quot;, \&quot;week\&quot;, \&quot;month\&quot; |  [optional] |
| **pageSize** | **kotlin.Int** | Alter the maximum number of returned rows in a single page of aggregation results |  [optional] |
| **by** | [**inline**](#kotlin.collections.List&lt;By&gt;) | Optional attribute(s) used for partitioning by the aggregation function |  [optional] |
| **returnFields** | **kotlin.collections.List&lt;kotlin.String&gt;** | Provide fields to limit the returned data |  [optional] |
| **timezone** | **kotlin.String** | The timezone used for processing the query, e.g. &#x60;&#39;America/New_York&#39;&#x60;.             This field is validated against a list of common timezones from the [IANA Time Zone Database](https://www.iana.org/time-zones).             While most are supported, a few notable exceptions are &#x60;Factory&#x60;, &#x60;Europe/Kyiv&#x60; and &#x60;Pacific/Kanton&#x60;. This field is case-sensitive. |  [optional] |
| **sort** | [**inline**](#Sort) | Provide a sort key (e.g. -$message) |  [optional] |


<a id="kotlin.collections.List<Measurements>"></a>
## Enum: measurements
| Name | Value |
| ---- | ----- |
| measurements | count, sum_value, unique |


<a id="Interval"></a>
## Enum: interval
| Name | Value |
| ---- | ----- |
| interval | day, hour, month, week |


<a id="kotlin.collections.List<By>"></a>
## Enum: by
| Name | Value |
| ---- | ----- |
| by | $attributed_channel, $attributed_flow, $attributed_message, $attributed_variation, $campaign_channel, $flow, $flow_channel, $message, $message_send_cohort, $variation, $variation_send_cohort, Bot Click, Bounce Type, Campaign Name, Client Canonical, Client Name, Client Type, Email Domain, Failure Source, Failure Type, From Number, From Phone Region, Inbox Provider, List, Message Name, Message Type, Method, Subject, To Number, To Phone Region, URL, form_id |


<a id="Sort"></a>
## Enum: sort
| Name | Value |
| ---- | ----- |
| sort | $attributed_channel, -$attributed_channel, $attributed_flow, -$attributed_flow, $attributed_message, -$attributed_message, $attributed_variation, -$attributed_variation, $campaign_channel, -$campaign_channel, $flow, -$flow, $flow_channel, -$flow_channel, $message, -$message, $message_send_cohort, -$message_send_cohort, $variation, -$variation, $variation_send_cohort, -$variation_send_cohort, Bot Click, -Bot Click, Bounce Type, -Bounce Type, Campaign Name, -Campaign Name, Client Canonical, -Client Canonical, Client Name, -Client Name, Client Type, -Client Type, Email Domain, -Email Domain, Failure Source, -Failure Source, Failure Type, -Failure Type, From Number, -From Number, From Phone Region, -From Phone Region, Inbox Provider, -Inbox Provider, List, -List, Message Name, -Message Name, Message Type, -Message Type, Method, -Method, Subject, -Subject, To Number, -To Number, To Phone Region, -To Phone Region, URL, -URL, count, -count, form_id, -form_id, sum_value, -sum_value, unique, -unique |



