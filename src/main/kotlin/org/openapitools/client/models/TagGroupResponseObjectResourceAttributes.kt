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
 * @param name The Tag Group name
 * @param exclusive If a tag group is non-exclusive, any given related resource (campaign, flow, etc.) can be linked to multiple tags from that tag group. If a tag group is exclusive, any given related resource can only be linked to one tag from that tag group.
 * @param default Every company automatically has one Default Tag Group. The Default Tag Group cannot be deleted, and no other Default Tag Groups can be created. This value is true for the Default Tag Group and false for all other Tag Groups.
 */


data class TagGroupResponseObjectResourceAttributes (

    /* The Tag Group name */
    @Json(name = "name")
    val name: kotlin.String,

    /* If a tag group is non-exclusive, any given related resource (campaign, flow, etc.) can be linked to multiple tags from that tag group. If a tag group is exclusive, any given related resource can only be linked to one tag from that tag group. */
    @Json(name = "exclusive")
    val exclusive: kotlin.Boolean,

    /* Every company automatically has one Default Tag Group. The Default Tag Group cannot be deleted, and no other Default Tag Groups can be created. This value is true for the Default Tag Group and false for all other Tag Groups. */
    @Json(name = "default")
    val default: kotlin.Boolean

) {


}

