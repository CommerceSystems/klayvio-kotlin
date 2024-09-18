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

import org.openapitools.client.models.FormVersionResponseObjectResourceAttributes
import org.openapitools.client.models.FormVersionABTest

class FormVersionResponseObjectResourceAttributesTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of FormVersionResponseObjectResourceAttributes
        //val modelInstance = FormVersionResponseObjectResourceAttributes()

        // to test the property `formType` - The type of form.
        should("test formType") {
            // uncomment below to test the property
            //modelInstance.formType shouldBe ("TODO")
        }

        // to test the property `status` - Status of the form version. \"live\" means it's live on site.
        should("test status") {
            // uncomment below to test the property
            //modelInstance.status shouldBe ("TODO")
        }

        // to test the property `createdAt` - ISO8601 timestamp when the form version was created.
        should("test createdAt") {
            // uncomment below to test the property
            //modelInstance.createdAt shouldBe ("TODO")
        }

        // to test the property `updatedAt` - ISO8601 timestamp when the form version was last updated.
        should("test updatedAt") {
            // uncomment below to test the property
            //modelInstance.updatedAt shouldBe ("TODO")
        }

        // to test the property `abTest`
        should("test abTest") {
            // uncomment below to test the property
            //modelInstance.abTest shouldBe ("TODO")
        }

    }
}
