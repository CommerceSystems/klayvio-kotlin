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
 * @param deviceId Relatively stable ID for the device. Will update on app uninstall and reinstall
 * @param klaviyoSdk The name of the SDK used to create the push token.
 * @param sdkVersion The version of the SDK used to create the push token
 * @param deviceModel The model of the device
 * @param osName The name of the operating system on the device.
 * @param osVersion The version of the operating system on the device
 * @param manufacturer The manufacturer of the device
 * @param appName The name of the app that created the push token
 * @param appVersion The version of the app that created the push token
 * @param appBuild The build of the app that created the push token
 * @param appId The ID of the app that created the push token
 * @param environment The environment in which the push token was created
 */


data class DeviceMetadata (

    /* Relatively stable ID for the device. Will update on app uninstall and reinstall */
    @Json(name = "device_id")
    val deviceId: kotlin.String? = null,

    /* The name of the SDK used to create the push token. */
    @Json(name = "klaviyo_sdk")
    val klaviyoSdk: DeviceMetadata.KlaviyoSdk? = null,

    /* The version of the SDK used to create the push token */
    @Json(name = "sdk_version")
    val sdkVersion: kotlin.String? = null,

    /* The model of the device */
    @Json(name = "device_model")
    val deviceModel: kotlin.String? = null,

    /* The name of the operating system on the device. */
    @Json(name = "os_name")
    val osName: DeviceMetadata.OsName? = null,

    /* The version of the operating system on the device */
    @Json(name = "os_version")
    val osVersion: kotlin.String? = null,

    /* The manufacturer of the device */
    @Json(name = "manufacturer")
    val manufacturer: kotlin.String? = null,

    /* The name of the app that created the push token */
    @Json(name = "app_name")
    val appName: kotlin.String? = null,

    /* The version of the app that created the push token */
    @Json(name = "app_version")
    val appVersion: kotlin.String? = null,

    /* The build of the app that created the push token */
    @Json(name = "app_build")
    val appBuild: kotlin.String? = null,

    /* The ID of the app that created the push token */
    @Json(name = "app_id")
    val appId: kotlin.String? = null,

    /* The environment in which the push token was created */
    @Json(name = "environment")
    val environment: DeviceMetadata.Environment? = null

) {

    /**
     * The name of the SDK used to create the push token.
     *
     * Values: android,swift
     */
    @JsonClass(generateAdapter = false)
    enum class KlaviyoSdk(val value: kotlin.String) {
        @Json(name = "android") android("android"),
        @Json(name = "swift") swift("swift");
    }
    /**
     * The name of the operating system on the device.
     *
     * Values: android,ios,ipados,macos,tvos
     */
    @JsonClass(generateAdapter = false)
    enum class OsName(val value: kotlin.String) {
        @Json(name = "android") android("android"),
        @Json(name = "ios") ios("ios"),
        @Json(name = "ipados") ipados("ipados"),
        @Json(name = "macos") macos("macos"),
        @Json(name = "tvos") tvos("tvos");
    }
    /**
     * The environment in which the push token was created
     *
     * Values: debug,release
     */
    @JsonClass(generateAdapter = false)
    enum class Environment(val value: kotlin.String) {
        @Json(name = "debug") debug("debug"),
        @Json(name = "release") release("release");
    }

}

