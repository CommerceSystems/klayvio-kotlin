# ImageCreateQueryResourceObjectAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A name for the image.  Defaults to the filename if not provided.  If the name matches an existing image, a suffix will be added. |  [optional]
**importFromUrl** | **String** | An existing image url to import the image from. Alternatively, you may specify a base-64 encoded data-uri (&#x60;data:image/...&#x60;). Supported image formats: jpeg,png,gif. Maximum image size: 5MB. | 
**hidden** | **Boolean** | If true, this image is not shown in the asset library. |  [optional]
