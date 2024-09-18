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

import org.openapitools.client.models.EmailEnum
import org.openapitools.client.models.NoEmailMarketingConsentConsentStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param channel 
 * @param canReceiveMarketing 
 * @param consentStatus 
 */


data class NoEmailMarketingConsent (

    @Json(name = "channel")
    val channel: EmailEnum,

    @Json(name = "can_receive_marketing")
    val canReceiveMarketing: NoEmailMarketingConsent.CanReceiveMarketing,

    @Json(name = "consent_status")
    val consentStatus: NoEmailMarketingConsentConsentStatus

) {

    /**
     * 
     *
     * Values: `false`
     */
    @JsonClass(generateAdapter = false)
    enum class CanReceiveMarketing(val value: kotlin.Boolean) {
        @Json(name = "false") `false`("false");
    }

}

