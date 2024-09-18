# SegmentMemberResponseObjectResourceAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** | Individual&#x27;s email address |  [optional]
**phoneNumber** | **String** | Individual&#x27;s phone number in E.164 format |  [optional]
**externalId** | **String** | A unique identifier used by customers to associate Klaviyo profiles with profiles in an external system, such as a point-of-sale system. Format varies based on the external system. |  [optional]
**firstName** | **String** | Individual&#x27;s first name |  [optional]
**lastName** | **String** | Individual&#x27;s last name |  [optional]
**organization** | **String** | Name of the company or organization within the company for whom the individual works |  [optional]
**locale** | **String** | The locale of the profile, in the IETF BCP 47 language tag format (language-extlang-script-region-variant-extension-privateuse) |  [optional]
**title** | **String** | Individual&#x27;s job title |  [optional]
**image** | **String** | URL pointing to the location of a profile image |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time when the profile was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm) |  [optional]
**updated** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time when the profile was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm) |  [optional]
**lastEventDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date and time of the most recent event the triggered an update to the profile, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm) |  [optional]
**location** | [**ProfileLocation**](ProfileLocation.md) |  |  [optional]
**properties** | **Object** | An object containing key/value pairs for any custom properties assigned to this profile |  [optional]
**joinedGroupAt** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime when this profile most recently joined the segment. | 
