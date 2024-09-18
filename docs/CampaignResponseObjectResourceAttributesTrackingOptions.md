
# CampaignResponseObjectResourceAttributesTrackingOptions

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **isAddUtm** | **kotlin.Boolean** | Whether the campaign needs UTM parameters. If set to False, UTM params will not be used. |  [optional] |
| **utmParams** | [**kotlin.collections.List&lt;UTMParamsSubObject&gt;**](UTMParamsSubObject.md) | A list of UTM parameters. If an empty list is given and is_add_utm is True, uses company defaults. |  [optional] |
| **isTrackingClicks** | **kotlin.Boolean** | Whether the campaign is tracking click events. If not specified, uses company defaults. |  [optional] |
| **isTrackingOpens** | **kotlin.Boolean** | Whether the campaign is tracking open events. If not specified, uses company defaults. |  [optional] |



