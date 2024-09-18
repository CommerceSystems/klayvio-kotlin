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

import org.openapitools.client.models.UTMParamsSubObject

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param isAddUtm Whether the campaign needs UTM parameters. If set to False, UTM params will not be used.
 * @param utmParams A list of UTM parameters. If an empty list is given and is_add_utm is True, uses company defaults.
 */


data class SMSTrackingOptionsSubObject (

    /* Whether the campaign needs UTM parameters. If set to False, UTM params will not be used. */
    @Json(name = "is_add_utm")
    val isAddUtm: kotlin.Boolean? = null,

    /* A list of UTM parameters. If an empty list is given and is_add_utm is True, uses company defaults. */
    @Json(name = "utm_params")
    val utmParams: kotlin.collections.List<UTMParamsSubObject>? = null

) {


}

