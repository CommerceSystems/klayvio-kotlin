# ListListResponseObjectResourceAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A helpful name to label the list |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time when the list was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm) |  [optional]
**updated** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time when the list was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm) |  [optional]
**optInProcess** | [**OptInProcessEnum**](#OptInProcessEnum) | The opt-in process for this list.  Could be either &#x27;single_opt_in&#x27; or &#x27;double_opt_in&#x27;. |  [optional]

<a name="OptInProcessEnum"></a>
## Enum: OptInProcessEnum
Name | Value
---- | -----
DOUBLE_OPT_IN | &quot;double_opt_in&quot;
SINGLE_OPT_IN | &quot;single_opt_in&quot;
