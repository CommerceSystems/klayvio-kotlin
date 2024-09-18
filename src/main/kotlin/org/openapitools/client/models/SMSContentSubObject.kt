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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param body The message body
 * @param mediaUrl URL for included media
 */


data class SMSContentSubObject (

    /* The message body */
    @Json(name = "body")
    val body: kotlin.String? = null,

    /* URL for included media */
    @Json(name = "media_url")
    val mediaUrl: kotlin.String? = null

) {


}

