
# PredictiveAnalytics

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **historicClv** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Total value of all historically placed orders |  [optional] |
| **predictedClv** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Predicted value of all placed orders in the next 365 days |  [optional] |
| **totalClv** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Sum of historic and predicted CLV |  [optional] |
| **historicNumberOfOrders** | **kotlin.Int** | Number of already placed orders |  [optional] |
| **predictedNumberOfOrders** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Predicted number of placed orders in the next 365 days |  [optional] |
| **averageDaysBetweenOrders** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Average number of days between orders (None if only one order has been placed) |  [optional] |
| **averageOrderValue** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Average value of placed orders |  [optional] |
| **churnProbability** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Probability the customer has churned |  [optional] |
| **expectedDateOfNextOrder** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Expected date of next order, as calculated at the time of their most recent order |  [optional] |



