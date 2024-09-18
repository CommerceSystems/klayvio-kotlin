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

import org.openapitools.client.models.EventResponseObjectResourceAttributes

class EventResponseObjectResourceAttributesTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EventResponseObjectResourceAttributes
        //val modelInstance = EventResponseObjectResourceAttributes()

        // to test the property `timestamp` - Event timestamp in seconds
        should("test timestamp") {
            // uncomment below to test the property
            //modelInstance.timestamp shouldBe ("TODO")
        }

        // to test the property `eventProperties` - Event properties, can include identifiers and extra properties
        should("test eventProperties") {
            // uncomment below to test the property
            //modelInstance.eventProperties shouldBe ("TODO")
        }

        // to test the property `datetime` - Event timestamp in ISO8601 format (YYYY-MM-DDTHH:MM:SS+hh:mm)
        should("test datetime") {
            // uncomment below to test the property
            //modelInstance.datetime shouldBe ("TODO")
        }

        // to test the property `uuid` - A unique identifier for the event, this can be used as a cursor in pagination
        should("test uuid") {
            // uncomment below to test the property
            //modelInstance.uuid shouldBe ("TODO")
        }

    }
}
