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
 * @param useSmartSending Use smart sending. Defaults to True
 */


data class SMSSendOptionsSubObject (

    /* Use smart sending. Defaults to True */
    @Json(name = "use_smart_sending")
    val useSmartSending: kotlin.Boolean? = null

) {


}

