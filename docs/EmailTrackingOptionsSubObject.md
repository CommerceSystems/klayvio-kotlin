# EmailTrackingOptionsSubObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isAddUtm** | **Boolean** | Whether the campaign needs UTM parameters. If set to False, UTM params will not be used. |  [optional]
**utmParams** | [**List&lt;UTMParamsSubObject&gt;**](UTMParamsSubObject.md) | A list of UTM parameters. If an empty list is given and is_add_utm is True, uses company defaults. |  [optional]
**isTrackingClicks** | **Boolean** | Whether the campaign is tracking click events. If not specified, uses company defaults. |  [optional]
**isTrackingOpens** | **Boolean** | Whether the campaign is tracking open events. If not specified, uses company defaults. |  [optional]
