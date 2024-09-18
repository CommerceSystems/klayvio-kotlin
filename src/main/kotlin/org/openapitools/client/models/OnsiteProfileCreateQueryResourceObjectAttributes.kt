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
 * @param email Individual's email address
 * @param phoneNumber Individual's phone number in E.164 format
 * @param externalId A unique identifier used by customers to associate Klaviyo profiles with profiles in an external system, such as a point-of-sale system. Format varies based on the external system.
 * @param anonymousId 
 * @param kx Also known as the `exchange_id`, this is an encrypted identifier used for identifying a profile by Klaviyo's web tracking.  You can use this field as a filter when retrieving profiles via the Get Profiles endpoint.
 * @param firstName Individual's first name
 * @param lastName Individual's last name
 * @param organization Name of the company or organization within the company for whom the individual works
 * @param title Individual's job title
 * @param image URL pointing to the location of a profile image
 * @param location 
 * @param properties An object containing key/value pairs for any custom properties assigned to this profile
 */


data class OnsiteProfileCreateQueryResourceObjectAttributes (

    /* Individual's email address */
    @Json(name = "email")
    val email: kotlin.String? = null,

    /* Individual's phone number in E.164 format */
    @Json(name = "phone_number")
    val phoneNumber: kotlin.String? = null,

    /* A unique identifier used by customers to associate Klaviyo profiles with profiles in an external system, such as a point-of-sale system. Format varies based on the external system. */
    @Json(name = "external_id")
    val externalId: kotlin.String? = null,

    @Json(name = "anonymous_id")
    val anonymousId: kotlin.String? = null,

    /* Also known as the `exchange_id`, this is an encrypted identifier used for identifying a profile by Klaviyo's web tracking.  You can use this field as a filter when retrieving profiles via the Get Profiles endpoint. */
    @Json(name = "_kx")
    val kx: kotlin.String? = null,

    /* Individual's first name */
    @Json(name = "first_name")
    val firstName: kotlin.String? = null,

    /* Individual's last name */
    @Json(name = "last_name")
    val lastName: kotlin.String? = null,

    /* Name of the company or organization within the company for whom the individual works */
    @Json(name = "organization")
    val organization: kotlin.String? = null,

    /* Individual's job title */
    @Json(name = "title")
    val title: kotlin.String? = null,

    /* URL pointing to the location of a profile image */
    @Json(name = "image")
    val image: kotlin.String? = null,

    @Json(name = "location")
    val location: ProfileLocation? = null,

    /* An object containing key/value pairs for any custom properties assigned to this profile */
    @Json(name = "properties")
    val properties: kotlin.Any? = null

) {


}

