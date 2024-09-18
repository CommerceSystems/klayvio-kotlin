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

import org.openapitools.client.models.GetProfileResponseCompoundDocumentData
import org.openapitools.client.models.GetProfileResponseCollectionDataInnerAllOfAttributes
import org.openapitools.client.models.GetProfileResponseCompoundDocumentDataAllOfRelationships
import org.openapitools.client.models.ObjectLinks
import org.openapitools.client.models.ProfileEnum

class GetProfileResponseCompoundDocumentDataTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of GetProfileResponseCompoundDocumentData
        //val modelInstance = GetProfileResponseCompoundDocumentData()

        // to test the property `type`
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `attributes`
        should("test attributes") {
            // uncomment below to test the property
            //modelInstance.attributes shouldBe ("TODO")
        }

        // to test the property `links`
        should("test links") {
            // uncomment below to test the property
            //modelInstance.links shouldBe ("TODO")
        }

        // to test the property `id` - Primary key that uniquely identifies this profile. Generated by Klaviyo.
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `relationships`
        should("test relationships") {
            // uncomment below to test the property
            //modelInstance.relationships shouldBe ("TODO")
        }

    }
}
