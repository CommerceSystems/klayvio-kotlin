# FormVersionResponseObjectResourceAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**formType** | [**FormTypeEnum**](#FormTypeEnum) | The type of form. | 
**abTest** | [**FormVersionABTest**](FormVersionABTest.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the form version. \&quot;live\&quot; means it&#x27;s live on site. | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO8601 timestamp when the form version was created. | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | ISO8601 timestamp when the form version was last updated. | 

<a name="FormTypeEnum"></a>
## Enum: FormTypeEnum
Name | Value
---- | -----
BANNER | &quot;banner&quot;
EMBED | &quot;embed&quot;
FLYOUT | &quot;flyout&quot;
FULL_PAGE | &quot;full_page&quot;
POPUP | &quot;popup&quot;

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
DRAFT | &quot;draft&quot;
LIVE | &quot;live&quot;
