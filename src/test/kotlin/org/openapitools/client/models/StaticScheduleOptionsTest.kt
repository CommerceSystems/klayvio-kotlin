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

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.models.StaticScheduleOptions

class StaticScheduleOptionsTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of StaticScheduleOptions
        //val modelInstance = StaticScheduleOptions()

        // to test the property `datetime` - The time to send at
        should("test datetime") {
            // uncomment below to test the property
            //modelInstance.datetime shouldBe ("TODO")
        }

        // to test the property `isLocal` - If the campaign should be sent with local recipient timezone send (requires UTC time) or statically sent at the given time. Defaults to False.
        should("test isLocal") {
            // uncomment below to test the property
            //modelInstance.isLocal shouldBe ("TODO")
        }

        // to test the property `sendPastRecipientsImmediately` - Determines if we should send to local recipient timezone if the given time has passed. Only applicable to local sends. Defaults to False.
        should("test sendPastRecipientsImmediately") {
            // uncomment below to test the property
            //modelInstance.sendPastRecipientsImmediately shouldBe ("TODO")
        }

    }
}
