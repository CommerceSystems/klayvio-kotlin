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

import org.openapitools.client.models.EmailContentSubObject
import org.openapitools.client.models.SMSContentSubObject

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Additional attributes relating to the content of the message
 *
 * @param subject The subject of the message
 * @param previewText Preview text associated with the message
 * @param fromEmail The email the message should be sent from
 * @param fromLabel The label associated with the from_email
 * @param replyToEmail Optional Reply-To email address
 * @param ccEmail Optional CC email address
 * @param bccEmail Optional BCC email address
 * @param body The message body
 * @param mediaUrl URL for included media
 */


data class CampaignMessageResponseObjectResourceAttributesContent (

    /* The subject of the message */
    @Json(name = "subject")
    val subject: kotlin.String? = null,

    /* Preview text associated with the message */
    @Json(name = "preview_text")
    val previewText: kotlin.String? = null,

    /* The email the message should be sent from */
    @Json(name = "from_email")
    val fromEmail: kotlin.String? = null,

    /* The label associated with the from_email */
    @Json(name = "from_label")
    val fromLabel: kotlin.String? = null,

    /* Optional Reply-To email address */
    @Json(name = "reply_to_email")
    val replyToEmail: kotlin.String? = null,

    /* Optional CC email address */
    @Json(name = "cc_email")
    val ccEmail: kotlin.String? = null,

    /* Optional BCC email address */
    @Json(name = "bcc_email")
    val bccEmail: kotlin.String? = null,

    /* The message body */
    @Json(name = "body")
    val body: kotlin.String? = null,

    /* URL for included media */
    @Json(name = "media_url")
    val mediaUrl: kotlin.String? = null

) {


}

