# EventCreateQueryV2ResourceObjectAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**properties** | **Object** | Properties of this event. Any top level property (that are not objects) can be used to create segments. The $extra property is a special property. This records any non-segmentable values that can be referenced later. For example, HTML templates are useful on a segment but are not used to create a segment. There are limits placed onto the size of the data present. This must not exceed 5 MB. This must not exceed 300 event properties. A single string cannot be larger than 100 KB. Each array must not exceed 4000 elements. The properties cannot contain more than 10 nested levels. | 
**time** | [**OffsetDateTime**](OffsetDateTime.md) | When this event occurred. By default, the time the request was received will be used. The time is truncated to the second. The time must be after the year 2000 and can only be up to 1 year in the future. |  [optional]
**value** | [**BigDecimal**](BigDecimal.md) | A numeric, monetary value to associate with this event. For example, the dollar amount of a purchase. |  [optional]
**valueCurrency** | **String** | The ISO 4217 currency code of the value associated with the event. |  [optional]
**uniqueId** | **String** | A unique identifier for an event. If the unique_id is repeated for the same profile and metric, only the first processed event will be recorded. If this is not present, this will use the time to the second. Using the default, this limits only one event per profile per second. |  [optional]
**metric** | [**EventCreateQueryV2ResourceObjectAttributesMetric**](EventCreateQueryV2ResourceObjectAttributesMetric.md) |  | 
**profile** | [**EventCreateQueryV2ResourceObjectAttributesProfile**](EventCreateQueryV2ResourceObjectAttributesProfile.md) |  | 
