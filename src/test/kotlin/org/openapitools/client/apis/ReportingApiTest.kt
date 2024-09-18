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

package org.openapitools.client.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.apis.ReportingApi
import org.openapitools.client.models.CampaignValuesRequestDTO
import org.openapitools.client.models.FlowSeriesRequestDTO
import org.openapitools.client.models.FlowValuesRequestDTO
import org.openapitools.client.models.GetAccounts4XXResponse
import org.openapitools.client.models.PostCampaignValuesResponseDTO
import org.openapitools.client.models.PostFlowSeriesResponseDTO
import org.openapitools.client.models.PostFlowValuesResponseDTO

class ReportingApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ReportingApi
        //val apiInstance = ReportingApi()

        // to test queryCampaignValues
        should("test queryCampaignValues") {
            // uncomment below to test queryCampaignValues
            //val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
            //val campaignValuesRequestDTO : CampaignValuesRequestDTO =  // CampaignValuesRequestDTO | 
            //val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
            //val result : PostCampaignValuesResponseDTO = apiInstance.queryCampaignValues(revision, campaignValuesRequestDTO, pageCursor)
            //result shouldBe ("TODO")
        }

        // to test queryFlowSeries
        should("test queryFlowSeries") {
            // uncomment below to test queryFlowSeries
            //val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
            //val flowSeriesRequestDTO : FlowSeriesRequestDTO =  // FlowSeriesRequestDTO | 
            //val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
            //val result : PostFlowSeriesResponseDTO = apiInstance.queryFlowSeries(revision, flowSeriesRequestDTO, pageCursor)
            //result shouldBe ("TODO")
        }

        // to test queryFlowValues
        should("test queryFlowValues") {
            // uncomment below to test queryFlowValues
            //val revision : kotlin.String = revision_example // kotlin.String | API endpoint revision (format: YYYY-MM-DD[.suffix])
            //val flowValuesRequestDTO : FlowValuesRequestDTO =  // FlowValuesRequestDTO | 
            //val pageCursor : kotlin.String = pageCursor_example // kotlin.String | For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#pagination
            //val result : PostFlowValuesResponseDTO = apiInstance.queryFlowValues(revision, flowValuesRequestDTO, pageCursor)
            //result shouldBe ("TODO")
        }

    }
}
