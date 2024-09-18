
# StaticScheduleOptions

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **datetime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The time to send at |  |
| **isLocal** | **kotlin.Boolean** | If the campaign should be sent with local recipient timezone send (requires UTC time) or statically sent at the given time. Defaults to False. |  [optional] |
| **sendPastRecipientsImmediately** | **kotlin.Boolean** | Determines if we should send to local recipient timezone if the given time has passed. Only applicable to local sends. Defaults to False. |  [optional] |



