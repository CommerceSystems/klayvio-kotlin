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

import org.openapitools.client.models.MethodEnum
import org.openapitools.client.models.SftpEnum

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param `field` 
 * @param method 
 */


data class SftpMethodFilter (

    @Json(name = "field")
    val `field`: MethodEnum,

    @Json(name = "method")
    val method: SftpEnum

) {


}

