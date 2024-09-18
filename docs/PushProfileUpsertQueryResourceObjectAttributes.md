
# PushProfileUpsertQueryResourceObjectAttributes

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **phoneNumber** | **kotlin.String** | Individual&#39;s phone number in E.164 format |  [optional] |
| **externalId** | **kotlin.String** | A unique identifier used by customers to associate Klaviyo profiles with profiles in an external system, such as a point-of-sale system. Format varies based on the external system. |  [optional] |
| **anonymousId** | **kotlin.String** | Id that can be used to identify a profile when other identifiers are not available |  [optional] |
| **kx** | **kotlin.String** | Also known as the &#x60;exchange_id&#x60;, this is an encrypted identifier used for identifying a profile by Klaviyo&#39;s web tracking.  You can use this field as a filter when retrieving profiles via the Get Profiles endpoint. |  [optional] |
| **firstName** | **kotlin.String** | Individual&#39;s first name |  [optional] |
| **lastName** | **kotlin.String** | Individual&#39;s last name |  [optional] |
| **organization** | **kotlin.String** | Name of the company or organization within the company for whom the individual works |  [optional] |
| **title** | **kotlin.String** | Individual&#39;s job title |  [optional] |
| **image** | **kotlin.String** | URL pointing to the location of a profile image |  [optional] |
| **location** | [**ProfileLocation**](ProfileLocation.md) |  |  [optional] |
| **properties** | [**kotlin.Any**](.md) | An object containing key/value pairs for any custom properties assigned to this profile |  [optional] |
| **meta** | [**ProfileMeta**](ProfileMeta.md) |  |  [optional] |
| **email** | **kotlin.String** | Individual&#39;s email address |  [optional] |



