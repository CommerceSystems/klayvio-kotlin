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

import org.openapitools.client.models.MetricAggregateRowDTO

class MetricAggregateRowDTOTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of MetricAggregateRowDTO
        //val modelInstance = MetricAggregateRowDTO()

        // to test the property `dimensions` - List of dimensions associated with this set of measurements
        should("test dimensions") {
            // uncomment below to test the property
            //modelInstance.dimensions shouldBe ("TODO")
        }

        // to test the property `measurements` - Dictionary of measurement_key, values
        should("test measurements") {
            // uncomment below to test the property
            //modelInstance.measurements shouldBe ("TODO")
        }

    }
}
