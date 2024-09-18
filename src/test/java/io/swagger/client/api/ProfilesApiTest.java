/*
 * Klaviyo API
 * The Klaviyo REST API. Please visit https://developers.klaviyo.com for more details.
 *
 * OpenAPI spec version: 2024-07-15
 * Contact: developers@klaviyo.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.GetImportErrorResponseCollection;
import io.swagger.client.model.GetListResponseCollection;
import io.swagger.client.model.GetProfileImportJobListRelationshipsResponseCollection;
import io.swagger.client.model.GetProfileImportJobProfileRelationshipsResponseCollection;
import io.swagger.client.model.GetProfileImportJobResponseCollectionCompoundDocument;
import io.swagger.client.model.GetProfileImportJobResponseCompoundDocument;
import io.swagger.client.model.GetProfileListRelationshipsResponseCollection;
import io.swagger.client.model.GetProfileResponseCollection;
import io.swagger.client.model.GetProfileResponseCollectionCompoundDocument;
import io.swagger.client.model.GetProfileResponseCompoundDocument;
import io.swagger.client.model.GetProfileSegmentRelationshipsResponseCollection;
import io.swagger.client.model.GetSegmentResponseCollection;
import io.swagger.client.model.InlineResponse4XX;
import io.swagger.client.model.PatchProfileResponse;
import io.swagger.client.model.PostProfileImportJobResponse;
import io.swagger.client.model.PostProfileMergeResponse;
import io.swagger.client.model.PostProfileResponse;
import io.swagger.client.model.ProfileCreateQuery;
import io.swagger.client.model.ProfileImportJobCreateQuery;
import io.swagger.client.model.ProfileMergeQuery;
import io.swagger.client.model.ProfilePartialUpdateQuery;
import io.swagger.client.model.ProfileUpsertQuery;
import io.swagger.client.model.PushTokenCreateQuery;
import io.swagger.client.model.SubscriptionCreateJobCreateQuery;
import io.swagger.client.model.SubscriptionDeleteJobCreateQuery;
import io.swagger.client.model.SuppressionCreateJobCreateQuery;
import io.swagger.client.model.SuppressionDeleteJobCreateQuery;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ProfilesApi
 */
@Ignore
public class ProfilesApiTest {

    private final ProfilesApi api = new ProfilesApi();

    /**
     * Create or Update Profile
     *
     * Given a set of profile attributes and optionally an ID, create or update a profile.  Returns 201 if a new profile was created, 200 if an existing profile was updated.  Note that setting a field to &#x60;null&#x60; will clear out the field, whereas not including a field in your request will leave it unchanged.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;profiles:write&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createOrUpdateProfileTest() throws Exception {
        ProfileUpsertQuery body = null;
        String revision = null;
        PostProfileResponse response = api.createOrUpdateProfile(body, revision);

        // TODO: test validations
    }
    /**
     * Create Profile
     *
     * Create a new profile.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;profiles:write&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createProfileTest() throws Exception {
        ProfileCreateQuery body = null;
        String revision = null;
        PostProfileResponse response = api.createProfile(body, revision);

        // TODO: test validations
    }
    /**
     * Create or Update Push Token
     *
     * Create or update a push token.  This endpoint can be used to migrate push tokens from another platform to Klaviyo. Please use our mobile SDKs ([iOS](https://github.com/klaviyo/klaviyo-swift-sdk) and [Android](https://github.com/klaviyo/klaviyo-android-sdk)) to create push tokens from users&#x27; devices.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;profiles:write&#x60; &#x60;push-tokens:write&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createPushTokenTest() throws Exception {
        PushTokenCreateQuery body = null;
        String revision = null;
        api.createPushToken(body, revision);

        // TODO: test validations
    }
    /**
     * Get Bulk Profile Import Job
     *
     * Get a bulk profile import job with the given job ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;lists:read&#x60; &#x60;profiles:read&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBulkProfileImportJobTest() throws Exception {
        String jobId = null;
        String revision = null;
        List<String> fieldsList = null;
        List<String> fieldsProfileBulkImportJob = null;
        List<String> include = null;
        GetProfileImportJobResponseCompoundDocument response = api.getBulkProfileImportJob(jobId, revision, fieldsList, fieldsProfileBulkImportJob, include);

        // TODO: test validations
    }
    /**
     * Get Bulk Profile Import Job Errors
     *
     * Get import errors for the bulk profile import job with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;profiles:read&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBulkProfileImportJobImportErrorsTest() throws Exception {
        String id = null;
        String revision = null;
        List<String> fieldsImportError = null;
        String pageCursor = null;
        Integer pageSize = null;
        GetImportErrorResponseCollection response = api.getBulkProfileImportJobImportErrors(id, revision, fieldsImportError, pageCursor, pageSize);

        // TODO: test validations
    }
    /**
     * Get Bulk Profile Import Job Lists
     *
     * Get list for the bulk profile import job with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;lists:read&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBulkProfileImportJobListsTest() throws Exception {
        String id = null;
        String revision = null;
        List<String> fieldsList = null;
        GetListResponseCollection response = api.getBulkProfileImportJobLists(id, revision, fieldsList);

        // TODO: test validations
    }
    /**
     * Get Bulk Profile Import Job Profiles
     *
     * Get profiles for the bulk profile import job with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;profiles:read&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBulkProfileImportJobProfilesTest() throws Exception {
        String id = null;
        String revision = null;
        List<String> additionalFieldsProfile = null;
        List<String> fieldsProfile = null;
        String pageCursor = null;
        Integer pageSize = null;
        GetProfileResponseCollection response = api.getBulkProfileImportJobProfiles(id, revision, additionalFieldsProfile, fieldsProfile, pageCursor, pageSize);

        // TODO: test validations
    }
    /**
     * Get Bulk Profile Import Job Relationships Lists
     *
     * Get list relationship for the bulk profile import job with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;lists:read&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBulkProfileImportJobRelationshipsListsTest() throws Exception {
        String id = null;
        String revision = null;
        GetProfileImportJobListRelationshipsResponseCollection response = api.getBulkProfileImportJobRelationshipsLists(id, revision);

        // TODO: test validations
    }
    /**
     * Get Bulk Profile Import Job Relationships Profiles
     *
     * Get profile relationships for the bulk profile import job with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;profiles:read&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBulkProfileImportJobRelationshipsProfilesTest() throws Exception {
        String id = null;
        String revision = null;
        String pageCursor = null;
        Integer pageSize = null;
        GetProfileImportJobProfileRelationshipsResponseCollection response = api.getBulkProfileImportJobRelationshipsProfiles(id, revision, pageCursor, pageSize);

        // TODO: test validations
    }
    /**
     * Get Bulk Profile Import Jobs
     *
     * Get all bulk profile import jobs.  Returns a maximum of 100 jobs per request.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;lists:read&#x60; &#x60;profiles:read&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBulkProfileImportJobsTest() throws Exception {
        String revision = null;
        List<String> fieldsProfileBulkImportJob = null;
        String filter = null;
        String pageCursor = null;
        Integer pageSize = null;
        String sort = null;
        GetProfileImportJobResponseCollectionCompoundDocument response = api.getBulkProfileImportJobs(revision, fieldsProfileBulkImportJob, filter, pageCursor, pageSize, sort);

        // TODO: test validations
    }
    /**
     * Get Profile
     *
     * Get the profile with the given profile ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;profiles:read&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProfileTest() throws Exception {
        String id = null;
        String revision = null;
        List<String> additionalFieldsProfile = null;
        List<String> fieldsList = null;
        List<String> fieldsProfile = null;
        List<String> fieldsSegment = null;
        List<String> include = null;
        GetProfileResponseCompoundDocument response = api.getProfile(id, revision, additionalFieldsProfile, fieldsList, fieldsProfile, fieldsSegment, include);

        // TODO: test validations
    }
    /**
     * Get Profile Lists
     *
     * Get list memberships for a profile with the given profile ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;lists:read&#x60; &#x60;profiles:read&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProfileListsTest() throws Exception {
        String id = null;
        String revision = null;
        List<String> fieldsList = null;
        GetListResponseCollection response = api.getProfileLists(id, revision, fieldsList);

        // TODO: test validations
    }
    /**
     * Get Profile Relationships Lists
     *
     * Get list memberships for a profile with the given profile ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;lists:read&#x60; &#x60;profiles:read&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProfileRelationshipsListsTest() throws Exception {
        String id = null;
        String revision = null;
        GetProfileListRelationshipsResponseCollection response = api.getProfileRelationshipsLists(id, revision);

        // TODO: test validations
    }
    /**
     * Get Profile Relationships Segments
     *
     * Get segment membership relationships for a profile with the given profile ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;profiles:read&#x60; &#x60;segments:read&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProfileRelationshipsSegmentsTest() throws Exception {
        String id = null;
        String revision = null;
        GetProfileSegmentRelationshipsResponseCollection response = api.getProfileRelationshipsSegments(id, revision);

        // TODO: test validations
    }
    /**
     * Get Profile Segments
     *
     * Get segment memberships for a profile with the given profile ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;profiles:read&#x60; &#x60;segments:read&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProfileSegmentsTest() throws Exception {
        String id = null;
        String revision = null;
        List<String> fieldsSegment = null;
        GetSegmentResponseCollection response = api.getProfileSegments(id, revision, fieldsSegment);

        // TODO: test validations
    }
    /**
     * Get Profiles
     *
     * Get all profiles in an account.  Profiles can be sorted by the following fields in ascending and descending order: &#x60;id&#x60;, &#x60;created&#x60;, &#x60;updated&#x60;, &#x60;email&#x60;, &#x60;subscriptions.email.marketing.suppression.timestamp&#x60;, &#x60;subscriptions.email.marketing.list_suppressions.timestamp&#x60;&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;&lt;br&gt;&lt;br&gt;Rate limits when using the &#x60;additional-fields[profile]&#x3D;predictive_analytics&#x60; parameter in your API request:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;&lt;br&gt;&lt;br&gt;To learn more about how the &#x60;additional-fields&#x60; parameter impacts rate limits, check out our [Rate limits, status codes, and errors](https://developers.klaviyo.com/en/v2024-07-15/docs/rate_limits_and_error_handling) guide.  **Scopes:** &#x60;profiles:read&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProfilesTest() throws Exception {
        String revision = null;
        List<String> additionalFieldsProfile = null;
        List<String> fieldsProfile = null;
        String filter = null;
        String pageCursor = null;
        Integer pageSize = null;
        String sort = null;
        GetProfileResponseCollectionCompoundDocument response = api.getProfiles(revision, additionalFieldsProfile, fieldsProfile, filter, pageCursor, pageSize, sort);

        // TODO: test validations
    }
    /**
     * Merge Profiles
     *
     * Merge a given related profile into a profile with the given profile ID.  The profile provided under &#x60;relationships&#x60; (the \&quot;source\&quot; profile) will be merged into the profile provided by the ID in the base data object (the \&quot;destination\&quot; profile). This endpoint queues an asynchronous task which will merge data from the source profile into the destination profile, deleting the source profile in the process. This endpoint accepts only one source profile.  To learn more about how profile data is preserved or overwritten during a merge, please [visit our Help Center](https://help.klaviyo.com/hc/en-us/articles/115005073847#merge-2-profiles3).&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;profiles:write&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void mergeProfilesTest() throws Exception {
        ProfileMergeQuery body = null;
        String revision = null;
        PostProfileMergeResponse response = api.mergeProfiles(body, revision);

        // TODO: test validations
    }
    /**
     * Spawn Bulk Profile Import Job
     *
     * Create a bulk profile import job to create or update a batch of profiles.  Accepts up to 10,000 profiles per request. The maximum allowed payload size is 5MB.  To learn more, see our [Bulk Profile Import API guide](https://developers.klaviyo.com/en/docs/use_klaviyos_bulk_profile_import_api).&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;10/s&#x60;&lt;br&gt;Steady: &#x60;150/m&#x60;  **Scopes:** &#x60;lists:write&#x60; &#x60;profiles:write&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void spawnBulkProfileImportJobTest() throws Exception {
        ProfileImportJobCreateQuery body = null;
        String revision = null;
        PostProfileImportJobResponse response = api.spawnBulkProfileImportJob(body, revision);

        // TODO: test validations
    }
    /**
     * Subscribe Profiles
     *
     * Subscribe one or more profiles to email marketing, SMS marketing, or both. If the provided list has double opt-in enabled, profiles will receive a message requiring their confirmation before subscribing. Otherwise, profiles will be immediately subscribed without receiving a confirmation message. Learn more about [consent in this guide](https://developers.klaviyo.com/en/docs/collect_email_and_sms_consent_via_api).  If a list is not provided, the opt-in process used will be determined by the [account-level default opt-in setting](https://www.klaviyo.com/settings/account/api-keys).  To add someone to a list without changing their subscription status, use [Add Profile to List](https://developers.klaviyo.com/en/reference/create_list_relationships).  This API will remove any &#x60;UNSUBSCRIBE&#x60;, &#x60;SPAM_REPORT&#x60; or &#x60;USER_SUPPRESSED&#x60; suppressions from the provided profiles. Learn more about [suppressed profiles](https://help.klaviyo.com/hc/en-us/articles/115005246108-Understanding-suppressed-email-profiles#what-is-a-suppressed-profile-1).  Maximum number of profiles can be submitted for subscription: 1000  This endpoint now supports a &#x60;historical_import&#x60; flag. If this flag is set &#x60;true&#x60;, profiles being subscribed will bypass double opt-in emails and be subscribed immediately. They will also bypass any associated \&quot;Added to list\&quot; flows. This is useful for importing historical data where you have already collected consent. If &#x60;historical_import&#x60; is set to true, the &#x60;consented_at&#x60; field is required and must be in the past.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;lists:write&#x60; &#x60;profiles:write&#x60; &#x60;subscriptions:write&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void subscribeProfilesTest() throws Exception {
        SubscriptionCreateJobCreateQuery body = null;
        String revision = null;
        api.subscribeProfiles(body, revision);

        // TODO: test validations
    }
    /**
     * Suppress Profiles
     *
     * Manually suppress profiles using their email address, or by specifying a segment or list ID to suppress all current members.  Suppressed profiles cannot receive email marketing, independent of their consent status. To learn more, see our [email suppressions guide](https://help.klaviyo.com/hc/en-us/articles/115005246108-Understanding-suppressed-email-profiles#what-is-a-suppressed-profile-1) and our [collecting consent guide](https://developers.klaviyo.com/en/docs/collect_email_and_sms_consent_via_api).  Email addresses per request limit: 100&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;profiles:write&#x60; &#x60;subscriptions:write&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void suppressProfilesTest() throws Exception {
        SuppressionCreateJobCreateQuery body = null;
        String revision = null;
        api.suppressProfiles(body, revision);

        // TODO: test validations
    }
    /**
     * Unsubscribe Profiles
     *
     * Unsubscribe one or more profiles to email marketing, SMS marketing, or both. Learn more about [consent in this guide](https://developers.klaviyo.com/en/docs/collect_email_and_sms_consent_via_api).  To remove someone from a list without changing their subscription status, use [Remove Profile from List](https://developers.klaviyo.com/en/reference/delete_list_relationships).  Maximum number of profile can be submitted for unsubscription: 100&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;lists:write&#x60; &#x60;profiles:write&#x60; &#x60;subscriptions:write&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void unsubscribeProfilesTest() throws Exception {
        SubscriptionDeleteJobCreateQuery body = null;
        String revision = null;
        api.unsubscribeProfiles(body, revision);

        // TODO: test validations
    }
    /**
     * Unsuppress Profiles
     *
     * Manually unsuppress profiles using their email address, or by specifying a segment or list ID to unsuppress all current members.  This only removes suppressions with reason &#x60;USER_SUPPRESSED&#x60;, leaving unsubscribed profiles and profiles suppressed with reason &#x60;INVALID_EMAIL&#x60; or &#x60;HARD_BOUNCE&#x60; unchanged. To learn more, see our [email suppressions guide](https://help.klaviyo.com/hc/en-us/articles/115005246108-Understanding-suppressed-email-profiles#what-is-a-suppressed-profile-1) and our [collecting consent guide](https://developers.klaviyo.com/en/docs/collect_email_and_sms_consent_via_api).  Email addresses per request limit: 100&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;subscriptions:write&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void unsuppressProfilesTest() throws Exception {
        SuppressionDeleteJobCreateQuery body = null;
        String revision = null;
        api.unsuppressProfiles(body, revision);

        // TODO: test validations
    }
    /**
     * Update Profile
     *
     * Update the profile with the given profile ID.  Note that setting a field to &#x60;null&#x60; will clear out the field, whereas not including a field in your request will leave it unchanged.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;75/s&#x60;&lt;br&gt;Steady: &#x60;700/m&#x60;  **Scopes:** &#x60;profiles:write&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateProfileTest() throws Exception {
        ProfilePartialUpdateQuery body = null;
        String revision = null;
        String id = null;
        PatchProfileResponse response = api.updateProfile(body, revision, id);

        // TODO: test validations
    }
}
