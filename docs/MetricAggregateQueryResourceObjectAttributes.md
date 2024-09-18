# MetricAggregateQueryResourceObjectAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metricId** | **String** | The metric ID used in the aggregation. | 
**pageCursor** | **String** | Optional pagination cursor to iterate over large result sets |  [optional]
**measurements** | [**List&lt;MeasurementsEnum&gt;**](#List&lt;MeasurementsEnum&gt;) | Measurement key, e.g. &#x60;unique&#x60;, &#x60;sum_value&#x60;, &#x60;count&#x60; | 
**interval** | [**IntervalEnum**](#IntervalEnum) | Aggregation interval, e.g. \&quot;hour\&quot;, \&quot;day\&quot;, \&quot;week\&quot;, \&quot;month\&quot; |  [optional]
**pageSize** | **Integer** | Alter the maximum number of returned rows in a single page of aggregation results |  [optional]
**by** | [**List&lt;ByEnum&gt;**](#List&lt;ByEnum&gt;) | Optional attribute(s) used for partitioning by the aggregation function |  [optional]
**returnFields** | **List&lt;String&gt;** | Provide fields to limit the returned data |  [optional]
**filter** | **List&lt;String&gt;** | List of filters, must include time range using ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).             These filters follow a similar format to those in &#x60;GET&#x60; requests, the primary difference is that this endpoint asks for a list.             The time range can be filtered by providing a &#x60;greater-or-equal&#x60; and a &#x60;less-than&#x60; filter on the &#x60;datetime&#x60; field. | 
**timezone** | **String** | The timezone used for processing the query, e.g. &#x60;&#x27;America/New_York&#x27;&#x60;.             This field is validated against a list of common timezones from the [IANA Time Zone Database](https://www.iana.org/time-zones).             While most are supported, a few notable exceptions are &#x60;Factory&#x60;, &#x60;Europe/Kyiv&#x60; and &#x60;Pacific/Kanton&#x60;. This field is case-sensitive. |  [optional]
**sort** | [**SortEnum**](#SortEnum) | Provide a sort key (e.g. -$message) |  [optional]

<a name="List<MeasurementsEnum>"></a>
## Enum: List&lt;MeasurementsEnum&gt;
Name | Value
---- | -----
COUNT | &quot;count&quot;
SUM_VALUE | &quot;sum_value&quot;
UNIQUE | &quot;unique&quot;

<a name="IntervalEnum"></a>
## Enum: IntervalEnum
Name | Value
---- | -----
DAY | &quot;day&quot;
HOUR | &quot;hour&quot;
MONTH | &quot;month&quot;
WEEK | &quot;week&quot;

<a name="List<ByEnum>"></a>
## Enum: List&lt;ByEnum&gt;
Name | Value
---- | -----
_ATTRIBUTED_CHANNEL | &quot;$attributed_channel&quot;
_ATTRIBUTED_FLOW | &quot;$attributed_flow&quot;
_ATTRIBUTED_MESSAGE | &quot;$attributed_message&quot;
_ATTRIBUTED_VARIATION | &quot;$attributed_variation&quot;
_CAMPAIGN_CHANNEL | &quot;$campaign_channel&quot;
_FLOW | &quot;$flow&quot;
_FLOW_CHANNEL | &quot;$flow_channel&quot;
_MESSAGE | &quot;$message&quot;
_MESSAGE_SEND_COHORT | &quot;$message_send_cohort&quot;
_VARIATION | &quot;$variation&quot;
_VARIATION_SEND_COHORT | &quot;$variation_send_cohort&quot;
BOT_CLICK | &quot;Bot Click&quot;
BOUNCE_TYPE | &quot;Bounce Type&quot;
CAMPAIGN_NAME | &quot;Campaign Name&quot;
CLIENT_CANONICAL | &quot;Client Canonical&quot;
CLIENT_NAME | &quot;Client Name&quot;
CLIENT_TYPE | &quot;Client Type&quot;
EMAIL_DOMAIN | &quot;Email Domain&quot;
FAILURE_SOURCE | &quot;Failure Source&quot;
FAILURE_TYPE | &quot;Failure Type&quot;
FROM_NUMBER | &quot;From Number&quot;
FROM_PHONE_REGION | &quot;From Phone Region&quot;
INBOX_PROVIDER | &quot;Inbox Provider&quot;
LIST | &quot;List&quot;
MESSAGE_NAME | &quot;Message Name&quot;
MESSAGE_TYPE | &quot;Message Type&quot;
METHOD | &quot;Method&quot;
SUBJECT | &quot;Subject&quot;
TO_NUMBER | &quot;To Number&quot;
TO_PHONE_REGION | &quot;To Phone Region&quot;
URL | &quot;URL&quot;
FORM_ID | &quot;form_id&quot;

<a name="SortEnum"></a>
## Enum: SortEnum
Name | Value
---- | -----
_ATTRIBUTED_CHANNEL | &quot;$attributed_channel&quot;
_ATTRIBUTED_CHANNEL_1 | &quot;-$attributed_channel&quot;
_ATTRIBUTED_FLOW | &quot;$attributed_flow&quot;
_ATTRIBUTED_FLOW_3 | &quot;-$attributed_flow&quot;
_ATTRIBUTED_MESSAGE | &quot;$attributed_message&quot;
_ATTRIBUTED_MESSAGE_5 | &quot;-$attributed_message&quot;
_ATTRIBUTED_VARIATION | &quot;$attributed_variation&quot;
_ATTRIBUTED_VARIATION_7 | &quot;-$attributed_variation&quot;
_CAMPAIGN_CHANNEL | &quot;$campaign_channel&quot;
_CAMPAIGN_CHANNEL_9 | &quot;-$campaign_channel&quot;
_FLOW | &quot;$flow&quot;
_FLOW_11 | &quot;-$flow&quot;
_FLOW_CHANNEL | &quot;$flow_channel&quot;
_FLOW_CHANNEL_13 | &quot;-$flow_channel&quot;
_MESSAGE | &quot;$message&quot;
_MESSAGE_15 | &quot;-$message&quot;
_MESSAGE_SEND_COHORT | &quot;$message_send_cohort&quot;
_MESSAGE_SEND_COHORT_17 | &quot;-$message_send_cohort&quot;
_VARIATION | &quot;$variation&quot;
_VARIATION_19 | &quot;-$variation&quot;
_VARIATION_SEND_COHORT | &quot;$variation_send_cohort&quot;
_VARIATION_SEND_COHORT_21 | &quot;-$variation_send_cohort&quot;
BOT_CLICK | &quot;Bot Click&quot;
_BOT_CLICK | &quot;-Bot Click&quot;
BOUNCE_TYPE | &quot;Bounce Type&quot;
_BOUNCE_TYPE | &quot;-Bounce Type&quot;
CAMPAIGN_NAME | &quot;Campaign Name&quot;
_CAMPAIGN_NAME | &quot;-Campaign Name&quot;
CLIENT_CANONICAL | &quot;Client Canonical&quot;
_CLIENT_CANONICAL | &quot;-Client Canonical&quot;
CLIENT_NAME | &quot;Client Name&quot;
_CLIENT_NAME | &quot;-Client Name&quot;
CLIENT_TYPE | &quot;Client Type&quot;
_CLIENT_TYPE | &quot;-Client Type&quot;
EMAIL_DOMAIN | &quot;Email Domain&quot;
_EMAIL_DOMAIN | &quot;-Email Domain&quot;
FAILURE_SOURCE | &quot;Failure Source&quot;
_FAILURE_SOURCE | &quot;-Failure Source&quot;
FAILURE_TYPE | &quot;Failure Type&quot;
_FAILURE_TYPE | &quot;-Failure Type&quot;
FROM_NUMBER | &quot;From Number&quot;
_FROM_NUMBER | &quot;-From Number&quot;
FROM_PHONE_REGION | &quot;From Phone Region&quot;
_FROM_PHONE_REGION | &quot;-From Phone Region&quot;
INBOX_PROVIDER | &quot;Inbox Provider&quot;
_INBOX_PROVIDER | &quot;-Inbox Provider&quot;
LIST | &quot;List&quot;
_LIST | &quot;-List&quot;
MESSAGE_NAME | &quot;Message Name&quot;
_MESSAGE_NAME | &quot;-Message Name&quot;
MESSAGE_TYPE | &quot;Message Type&quot;
_MESSAGE_TYPE | &quot;-Message Type&quot;
METHOD | &quot;Method&quot;
_METHOD | &quot;-Method&quot;
SUBJECT | &quot;Subject&quot;
_SUBJECT | &quot;-Subject&quot;
TO_NUMBER | &quot;To Number&quot;
_TO_NUMBER | &quot;-To Number&quot;
TO_PHONE_REGION | &quot;To Phone Region&quot;
_TO_PHONE_REGION | &quot;-To Phone Region&quot;
URL | &quot;URL&quot;
_URL | &quot;-URL&quot;
COUNT | &quot;count&quot;
_COUNT | &quot;-count&quot;
FORM_ID | &quot;form_id&quot;
_FORM_ID | &quot;-form_id&quot;
SUM_VALUE | &quot;sum_value&quot;
_SUM_VALUE | &quot;-sum_value&quot;
UNIQUE | &quot;unique&quot;
_UNIQUE | &quot;-unique&quot;
