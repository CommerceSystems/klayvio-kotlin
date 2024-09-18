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

import org.openapitools.client.models.CouponEnum
import org.openapitools.client.models.CouponResponseObjectResourceAttributes
import org.openapitools.client.models.ObjectLinks

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param type 
 * @param id The internal id of a Coupon is equivalent to its external id stored within an integration.
 * @param attributes 
 * @param links 
 */


data class PostCouponResponseData (

    @Json(name = "type")
    val type: CouponEnum,

    /* The internal id of a Coupon is equivalent to its external id stored within an integration. */
    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "attributes")
    val attributes: CouponResponseObjectResourceAttributes,

    @Json(name = "links")
    val links: ObjectLinks

) {


}

