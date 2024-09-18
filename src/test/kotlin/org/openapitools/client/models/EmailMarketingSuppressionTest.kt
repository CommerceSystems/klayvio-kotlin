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

import org.openapitools.client.models.EmailMarketingSuppression

class EmailMarketingSuppressionTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EmailMarketingSuppression
        //val modelInstance = EmailMarketingSuppression()

        // to test the property `reason` - The reason the profile was suppressed.
        should("test reason") {
            // uncomment below to test the property
            //modelInstance.reason shouldBe ("TODO")
        }

        // to test the property `timestamp` - The timestamp when the profile was suppressed, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
        should("test timestamp") {
            // uncomment below to test the property
            //modelInstance.timestamp shouldBe ("TODO")
        }

    }
}
