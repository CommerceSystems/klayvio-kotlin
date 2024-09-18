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

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import org.openapitools.client.models.GetAccountResponse
import org.openapitools.client.models.GetAccountResponseCollection
import org.openapitools.client.models.GetAccounts4XXResponse

import com.squareup.moshi.Json

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ApiResponse
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.PartConfig
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class AccountsApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://a.klaviyo.com")
        }
    }

    /**
     * enum for parameter fieldsAccount
     */
     enum class FieldsAccountGetAccount(val value: kotlin.String) {
         @Json(name = "test_account") test_account("test_account"),
         @Json(name = "contact_information") contact_information("contact_information"),
         @Json(name = "contact_information.default_sender_name") contact_informationPeriodDefault_sender_name("contact_information.default_sender_name"),
         @Json(name = "contact_information.default_sender_email") contact_informationPeriodDefault_sender_email("contact_information.default_sender_email"),
         @Json(name = "contact_information.website_url") contact_informationPeriodWebsite_url("contact_information.website_url"),
         @Json(name = "contact_information.organization_name") contact_informationPeriodOrganization_name("contact_information.organization_name"),
         @Json(name = "contact_information.street_address") contact_informationPeriodStreet_address("contact_information.street_address"),
         @Json(name = "contact_information.street_address.address1") contact_informationPeriodStreet_addressPeriodAddress1("contact_information.street_address.address1"),
         @Json(name = "contact_information.street_address.address2") contact_informationPeriodStreet_addressPeriodAddress2("contact_information.street_address.address2"),
         @Json(name = "contact_information.street_address.city") contact_informationPeriodStreet_addressPeriodCity("contact_information.street_address.city"),
         @Json(name = "contact_information.street_address.region") contact_informationPeriodStreet_addressPeriodRegion("contact_information.street_address.region"),
         @Json(name = "contact_information.street_address.country") contact_informationPeriodStreet_addressPeriodCountry("contact_information.street_address.country"),
         @Json(name = "contact_information.street_address.zip") contact_informationPeriodStreet_addressPeriodZip("contact_information.street_address.zip"),
         @Json(name = "industry") industry("industry"),
         @Json(name = "timezone") timezone("timezone"),
         @Json(name = "preferred_currency") preferred_currency("preferred_currency"),
         @Json(name = "public_api_key") public_api_key("public_api_key"),
         @Json(name = "locale") locale("locale");

        /**
         * Override [toString()] to avoid using the enum variable name as the value, and instead use
         * the actual value defined in the API spec file.
         *
         * This solves a problem when the variable name and its value are different, and ensures that
         * the client sends the correct enum values to the server always.
         */
        override fun toString(): kotlin.String = "$value"
     }

    /**
     * Get Account
     * Retrieve a single account object by its account ID. You can only request the account by which the private API key was generated.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;  **Scopes:** &#x60;accounts:read&#x60;
     * @param id The ID of the account
     * @param revision API endpoint revision (format: YYYY-MM-DD[.suffix]) (default to "2024-07-15")
     * @param fieldsAccount For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets (optional)
     * @return GetAccountResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getAccount(id: kotlin.String, revision: kotlin.String = "2024-07-15", fieldsAccount: kotlin.collections.List<FieldsAccountGetAccount>? = null) : GetAccountResponse {
        val localVarResponse = getAccountWithHttpInfo(id = id, revision = revision, fieldsAccount = fieldsAccount)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetAccountResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Get Account
     * Retrieve a single account object by its account ID. You can only request the account by which the private API key was generated.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;  **Scopes:** &#x60;accounts:read&#x60;
     * @param id The ID of the account
     * @param revision API endpoint revision (format: YYYY-MM-DD[.suffix]) (default to "2024-07-15")
     * @param fieldsAccount For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets (optional)
     * @return ApiResponse<GetAccountResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getAccountWithHttpInfo(id: kotlin.String, revision: kotlin.String, fieldsAccount: kotlin.collections.List<FieldsAccountGetAccount>?) : ApiResponse<GetAccountResponse?> {
        val localVariableConfig = getAccountRequestConfig(id = id, revision = revision, fieldsAccount = fieldsAccount)

        return request<Unit, GetAccountResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getAccount
     *
     * @param id The ID of the account
     * @param revision API endpoint revision (format: YYYY-MM-DD[.suffix]) (default to "2024-07-15")
     * @param fieldsAccount For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets (optional)
     * @return RequestConfig
     */
    fun getAccountRequestConfig(id: kotlin.String, revision: kotlin.String, fieldsAccount: kotlin.collections.List<FieldsAccountGetAccount>?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (fieldsAccount != null) {
                    put("fields[account]", toMultiValue(fieldsAccount.toList(), "csv"))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        revision.apply { localVariableHeaders["revision"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/accounts/{id}/".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter fieldsAccount
     */
     enum class FieldsAccountGetAccounts(val value: kotlin.String) {
         @Json(name = "test_account") test_account("test_account"),
         @Json(name = "contact_information") contact_information("contact_information"),
         @Json(name = "contact_information.default_sender_name") contact_informationPeriodDefault_sender_name("contact_information.default_sender_name"),
         @Json(name = "contact_information.default_sender_email") contact_informationPeriodDefault_sender_email("contact_information.default_sender_email"),
         @Json(name = "contact_information.website_url") contact_informationPeriodWebsite_url("contact_information.website_url"),
         @Json(name = "contact_information.organization_name") contact_informationPeriodOrganization_name("contact_information.organization_name"),
         @Json(name = "contact_information.street_address") contact_informationPeriodStreet_address("contact_information.street_address"),
         @Json(name = "contact_information.street_address.address1") contact_informationPeriodStreet_addressPeriodAddress1("contact_information.street_address.address1"),
         @Json(name = "contact_information.street_address.address2") contact_informationPeriodStreet_addressPeriodAddress2("contact_information.street_address.address2"),
         @Json(name = "contact_information.street_address.city") contact_informationPeriodStreet_addressPeriodCity("contact_information.street_address.city"),
         @Json(name = "contact_information.street_address.region") contact_informationPeriodStreet_addressPeriodRegion("contact_information.street_address.region"),
         @Json(name = "contact_information.street_address.country") contact_informationPeriodStreet_addressPeriodCountry("contact_information.street_address.country"),
         @Json(name = "contact_information.street_address.zip") contact_informationPeriodStreet_addressPeriodZip("contact_information.street_address.zip"),
         @Json(name = "industry") industry("industry"),
         @Json(name = "timezone") timezone("timezone"),
         @Json(name = "preferred_currency") preferred_currency("preferred_currency"),
         @Json(name = "public_api_key") public_api_key("public_api_key"),
         @Json(name = "locale") locale("locale");

        /**
         * Override [toString()] to avoid using the enum variable name as the value, and instead use
         * the actual value defined in the API spec file.
         *
         * This solves a problem when the variable name and its value are different, and ensures that
         * the client sends the correct enum values to the server always.
         */
        override fun toString(): kotlin.String = "$value"
     }

    /**
     * Get Accounts
     * Retrieve the account(s) associated with a given private API key. This will return 1 account object within the array.  You can use this to retrieve account-specific data (contact information, timezone, currency, Public API key, etc.) or test if a Private API Key belongs to the correct account prior to performing subsequent actions with the API.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;  **Scopes:** &#x60;accounts:read&#x60;
     * @param revision API endpoint revision (format: YYYY-MM-DD[.suffix]) (default to "2024-07-15")
     * @param fieldsAccount For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets (optional)
     * @return GetAccountResponseCollection
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getAccounts(revision: kotlin.String = "2024-07-15", fieldsAccount: kotlin.collections.List<FieldsAccountGetAccounts>? = null) : GetAccountResponseCollection {
        val localVarResponse = getAccountsWithHttpInfo(revision = revision, fieldsAccount = fieldsAccount)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetAccountResponseCollection
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Get Accounts
     * Retrieve the account(s) associated with a given private API key. This will return 1 account object within the array.  You can use this to retrieve account-specific data (contact information, timezone, currency, Public API key, etc.) or test if a Private API Key belongs to the correct account prior to performing subsequent actions with the API.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;1/s&#x60;&lt;br&gt;Steady: &#x60;15/m&#x60;  **Scopes:** &#x60;accounts:read&#x60;
     * @param revision API endpoint revision (format: YYYY-MM-DD[.suffix]) (default to "2024-07-15")
     * @param fieldsAccount For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets (optional)
     * @return ApiResponse<GetAccountResponseCollection?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getAccountsWithHttpInfo(revision: kotlin.String, fieldsAccount: kotlin.collections.List<FieldsAccountGetAccounts>?) : ApiResponse<GetAccountResponseCollection?> {
        val localVariableConfig = getAccountsRequestConfig(revision = revision, fieldsAccount = fieldsAccount)

        return request<Unit, GetAccountResponseCollection>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getAccounts
     *
     * @param revision API endpoint revision (format: YYYY-MM-DD[.suffix]) (default to "2024-07-15")
     * @param fieldsAccount For more information please visit https://developers.klaviyo.com/en/v2024-07-15/reference/api-overview#sparse-fieldsets (optional)
     * @return RequestConfig
     */
    fun getAccountsRequestConfig(revision: kotlin.String, fieldsAccount: kotlin.collections.List<FieldsAccountGetAccounts>?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (fieldsAccount != null) {
                    put("fields[account]", toMultiValue(fieldsAccount.toList(), "csv"))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        revision.apply { localVariableHeaders["revision"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/accounts/",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
