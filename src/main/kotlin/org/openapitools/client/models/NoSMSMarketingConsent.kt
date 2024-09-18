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

import org.openapitools.client.models.NoSMSMarketingConsentConsentStatus
import org.openapitools.client.models.SmsEnum

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param channel 
 * @param canReceiveMarketing 
 * @param consentStatus 
 */


data class NoSMSMarketingConsent (

    @Json(name = "channel")
    val channel: SmsEnum,

    @Json(name = "can_receive_marketing")
    val canReceiveMarketing: NoSMSMarketingConsent.CanReceiveMarketing,

    @Json(name = "consent_status")
    val consentStatus: NoSMSMarketingConsentConsentStatus

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

