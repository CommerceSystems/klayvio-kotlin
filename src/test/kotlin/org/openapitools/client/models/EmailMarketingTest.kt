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

import org.openapitools.client.models.EmailMarketing
import org.openapitools.client.models.EmailMarketingListSuppression
import org.openapitools.client.models.EmailMarketingSuppression

class EmailMarketingTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EmailMarketing
        //val modelInstance = EmailMarketing()

        // to test the property `canReceiveEmailMarketing` - Whether or not this profile has implicit consent to receive email marketing. True if it does profile does not have any global suppressions.
        should("test canReceiveEmailMarketing") {
            // uncomment below to test the property
            //modelInstance.canReceiveEmailMarketing shouldBe ("TODO")
        }

        // to test the property `consent` - The consent status for email marketing.
        should("test consent") {
            // uncomment below to test the property
            //modelInstance.consent shouldBe ("TODO")
        }

        // to test the property `consentTimestamp` - The timestamp when consent was recorded or updated for email marketing, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
        should("test consentTimestamp") {
            // uncomment below to test the property
            //modelInstance.consentTimestamp shouldBe ("TODO")
        }

        // to test the property `lastUpdated` - The timestamp when a field on the email marketing object was last modified.
        should("test lastUpdated") {
            // uncomment below to test the property
            //modelInstance.lastUpdated shouldBe ("TODO")
        }

        // to test the property `method` - The method by which the profile was subscribed to email marketing.
        should("test method") {
            // uncomment below to test the property
            //modelInstance.method shouldBe ("TODO")
        }

        // to test the property `methodDetail` - Additional details about the method by which the profile was subscribed to email marketing. This may be empty if no details were provided.
        should("test methodDetail") {
            // uncomment below to test the property
            //modelInstance.methodDetail shouldBe ("TODO")
        }

        // to test the property `customMethodDetail` - Additional detail provided by the caller when the profile was subscribed. This may be empty if no details were provided.
        should("test customMethodDetail") {
            // uncomment below to test the property
            //modelInstance.customMethodDetail shouldBe ("TODO")
        }

        // to test the property `doubleOptin` - Whether the profile was subscribed to email marketing using a double opt-in.
        should("test doubleOptin") {
            // uncomment below to test the property
            //modelInstance.doubleOptin shouldBe ("TODO")
        }

        // to test the property `suppression` - The global email marketing suppression for this profile.
        should("test suppression") {
            // uncomment below to test the property
            //modelInstance.suppression shouldBe ("TODO")
        }

        // to test the property `listSuppressions` - The list suppressions for this profile.
        should("test listSuppressions") {
            // uncomment below to test the property
            //modelInstance.listSuppressions shouldBe ("TODO")
        }

    }
}
