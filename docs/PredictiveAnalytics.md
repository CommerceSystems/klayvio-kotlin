# PredictiveAnalytics

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**historicClv** | [**BigDecimal**](BigDecimal.md) | Total value of all historically placed orders |  [optional]
**predictedClv** | [**BigDecimal**](BigDecimal.md) | Predicted value of all placed orders in the next 365 days |  [optional]
**totalClv** | [**BigDecimal**](BigDecimal.md) | Sum of historic and predicted CLV |  [optional]
**historicNumberOfOrders** | **Integer** | Number of already placed orders |  [optional]
**predictedNumberOfOrders** | [**BigDecimal**](BigDecimal.md) | Predicted number of placed orders in the next 365 days |  [optional]
**averageDaysBetweenOrders** | [**BigDecimal**](BigDecimal.md) | Average number of days between orders (None if only one order has been placed) |  [optional]
**averageOrderValue** | [**BigDecimal**](BigDecimal.md) | Average value of placed orders |  [optional]
**churnProbability** | [**BigDecimal**](BigDecimal.md) | Probability the customer has churned |  [optional]
**expectedDateOfNextOrder** | [**OffsetDateTime**](OffsetDateTime.md) | Expected date of next order, as calculated at the time of their most recent order |  [optional]
