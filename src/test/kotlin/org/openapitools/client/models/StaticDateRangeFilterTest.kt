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

import org.openapitools.client.models.StaticDateRangeFilter
import org.openapitools.client.models.DateEnum

class StaticDateRangeFilterTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of StaticDateRangeFilter
        //val modelInstance = StaticDateRangeFilter()

        // to test the property `type`
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property ``operator`` - Operators for static date range filters.  E.g. \"between 2023-01-01 and 2023-02-01\"
        should("test `operator`") {
            // uncomment below to test the property
            //modelInstance.`operator` shouldBe ("TODO")
        }

        // to test the property `start`
        should("test start") {
            // uncomment below to test the property
            //modelInstance.start shouldBe ("TODO")
        }

        // to test the property `end`
        should("test end") {
            // uncomment below to test the property
            //modelInstance.end shouldBe ("TODO")
        }

    }
}
