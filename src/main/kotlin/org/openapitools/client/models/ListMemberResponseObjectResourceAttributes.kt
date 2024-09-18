/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.ProfileLocation

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param joinedGroupAt The datetime when this profile most recently joined the list.
 * @param email Individual's email address
 * @param phoneNumber Individual's phone number in E.164 format
 * @param externalId A unique identifier used by customers to associate Klaviyo profiles with profiles in an external system, such as a point-of-sale system. Format varies based on the external system.
 * @param firstName Individual's first name
 * @param lastName Individual's last name
 * @param organization Name of the company or organization within the company for whom the individual works
 * @param locale The locale of the profile, in the IETF BCP 47 language tag format (language-extlang-script-region-variant-extension-privateuse)
 * @param title Individual's job title
 * @param image URL pointing to the location of a profile image
 * @param created Date and time when the profile was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
 * @param updated Date and time when the profile was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
 * @param lastEventDate Date and time of the most recent event the triggered an update to the profile, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)
 * @param location 
 * @param properties An object containing key/value pairs for any custom properties assigned to this profile
 */


data class ListMemberResponseObjectResourceAttributes (

    /* The datetime when this profile most recently joined the list. */
    @Json(name = "joined_group_at")
    val joinedGroupAt: java.time.OffsetDateTime,

    /* Individual's email address */
    @Json(name = "email")
    val email: kotlin.String? = null,

    /* Individual's phone number in E.164 format */
    @Json(name = "phone_number")
    val phoneNumber: kotlin.String? = null,

    /* A unique identifier used by customers to associate Klaviyo profiles with profiles in an external system, such as a point-of-sale system. Format varies based on the external system. */
    @Json(name = "external_id")
    val externalId: kotlin.String? = null,

    /* Individual's first name */
    @Json(name = "first_name")
    val firstName: kotlin.String? = null,

    /* Individual's last name */
    @Json(name = "last_name")
    val lastName: kotlin.String? = null,

    /* Name of the company or organization within the company for whom the individual works */
    @Json(name = "organization")
    val organization: kotlin.String? = null,

    /* The locale of the profile, in the IETF BCP 47 language tag format (language-extlang-script-region-variant-extension-privateuse) */
    @Json(name = "locale")
    val locale: kotlin.String? = null,

    /* Individual's job title */
    @Json(name = "title")
    val title: kotlin.String? = null,

    /* URL pointing to the location of a profile image */
    @Json(name = "image")
    val image: kotlin.String? = null,

    /* Date and time when the profile was created, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm) */
    @Json(name = "created")
    val created: java.time.OffsetDateTime? = null,

    /* Date and time when the profile was last updated, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm) */
    @Json(name = "updated")
    val updated: java.time.OffsetDateTime? = null,

    /* Date and time of the most recent event the triggered an update to the profile, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm) */
    @Json(name = "last_event_date")
    val lastEventDate: java.time.OffsetDateTime? = null,

    @Json(name = "location")
    val location: ProfileLocation? = null,

    /* An object containing key/value pairs for any custom properties assigned to this profile */
    @Json(name = "properties")
    val properties: kotlin.Any? = null

) {


}

