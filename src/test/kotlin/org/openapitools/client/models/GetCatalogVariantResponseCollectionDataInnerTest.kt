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

import org.openapitools.client.models.GetCatalogVariantResponseCollectionDataInner
import org.openapitools.client.models.CatalogVariantEnum
import org.openapitools.client.models.CatalogVariantResponseObjectResourceAttributes
import org.openapitools.client.models.GetCatalogVariantResponseCollectionDataInnerAllOfRelationships
import org.openapitools.client.models.ObjectLinks

class GetCatalogVariantResponseCollectionDataInnerTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of GetCatalogVariantResponseCollectionDataInner
        //val modelInstance = GetCatalogVariantResponseCollectionDataInner()

        // to test the property `type`
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `id` - The catalog variant ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
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

        // to test the property `relationships`
        should("test relationships") {
            // uncomment below to test the property
            //modelInstance.relationships shouldBe ("TODO")
        }

    }
}
