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
 * @param title 
 * @param body 
 * @param sound 
 * @param badge 
 * @param mediaUrl 
 * @param dynamicImage 
 * @param iosLink 
 * @param androidLink 
 * @param onOpen 
 */


data class MobilePushMessageContent (

    @Json(name = "title")
    val title: kotlin.String,

    @Json(name = "body")
    val body: kotlin.String,

    @Json(name = "sound")
    val sound: kotlin.Boolean? = false,

    @Json(name = "badge")
    val badge: kotlin.Boolean? = false,

    @Json(name = "media_url")
    val mediaUrl: kotlin.String? = null,

    @Json(name = "dynamic_image")
    val dynamicImage: kotlin.String? = null,

    @Json(name = "ios_link")
    val iosLink: kotlin.String? = null,

    @Json(name = "android_link")
    val androidLink: kotlin.String? = null,

    @Json(name = "on_open")
    val onOpen: kotlin.String? = "home"

) {


}

