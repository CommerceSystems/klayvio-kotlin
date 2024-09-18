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

import org.openapitools.client.models.EventProfileCreateQueryResourceObjectAttributes
import org.openapitools.client.models.OnsiteProfileMeta
import org.openapitools.client.models.ProfileLocation

class EventProfileCreateQueryResourceObjectAttributesTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EventProfileCreateQueryResourceObjectAttributes
        //val modelInstance = EventProfileCreateQueryResourceObjectAttributes()

        // to test the property `email` - Individual's email address
        should("test email") {
            // uncomment below to test the property
            //modelInstance.email shouldBe ("TODO")
        }

        // to test the property `phoneNumber` - Individual's phone number in E.164 format
        should("test phoneNumber") {
            // uncomment below to test the property
            //modelInstance.phoneNumber shouldBe ("TODO")
        }

        // to test the property `externalId` - A unique identifier used by customers to associate Klaviyo profiles with profiles in an external system, such as a point-of-sale system. Format varies based on the external system.
        should("test externalId") {
            // uncomment below to test the property
            //modelInstance.externalId shouldBe ("TODO")
        }

        // to test the property `anonymousId`
        should("test anonymousId") {
            // uncomment below to test the property
            //modelInstance.anonymousId shouldBe ("TODO")
        }

        // to test the property `kx` - Also known as the `exchange_id`, this is an encrypted identifier used for identifying a profile by Klaviyo's web tracking.  You can use this field as a filter when retrieving profiles via the Get Profiles endpoint.
        should("test kx") {
            // uncomment below to test the property
            //modelInstance.kx shouldBe ("TODO")
        }

        // to test the property `firstName` - Individual's first name
        should("test firstName") {
            // uncomment below to test the property
            //modelInstance.firstName shouldBe ("TODO")
        }

        // to test the property `lastName` - Individual's last name
        should("test lastName") {
            // uncomment below to test the property
            //modelInstance.lastName shouldBe ("TODO")
        }

        // to test the property `organization` - Name of the company or organization within the company for whom the individual works
        should("test organization") {
            // uncomment below to test the property
            //modelInstance.organization shouldBe ("TODO")
        }

        // to test the property `title` - Individual's job title
        should("test title") {
            // uncomment below to test the property
            //modelInstance.title shouldBe ("TODO")
        }

        // to test the property `image` - URL pointing to the location of a profile image
        should("test image") {
            // uncomment below to test the property
            //modelInstance.image shouldBe ("TODO")
        }

        // to test the property `location`
        should("test location") {
            // uncomment below to test the property
            //modelInstance.location shouldBe ("TODO")
        }

        // to test the property `properties` - An object containing key/value pairs for any custom properties assigned to this profile
        should("test properties") {
            // uncomment below to test the property
            //modelInstance.properties shouldBe ("TODO")
        }

        // to test the property `meta`
        should("test meta") {
            // uncomment below to test the property
            //modelInstance.meta shouldBe ("TODO")
        }

    }
}
