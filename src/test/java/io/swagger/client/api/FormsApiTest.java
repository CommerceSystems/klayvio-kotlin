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

import io.swagger.client.model.GetFormFormVersionRelationshipsResponseCollection;
import io.swagger.client.model.GetFormResponse;
import io.swagger.client.model.GetFormResponseCollectionCompoundDocument;
import io.swagger.client.model.GetFormResponseCompoundDocument;
import io.swagger.client.model.GetFormVersionFormRelationshipResponse;
import io.swagger.client.model.GetFormVersionResponse;
import io.swagger.client.model.InlineResponse4XX;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for FormsApi
 */
@Ignore
public class FormsApiTest {

    private final FormsApi api = new FormsApi();

    /**
     * Get Form
     *
     * Get the form with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;forms:read&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFormTest() throws Exception {
        String id = null;
        String revision = null;
        List<String> fieldsFormVersion = null;
        List<String> fieldsForm = null;
        List<String> include = null;
        GetFormResponseCompoundDocument response = api.getForm(id, revision, fieldsFormVersion, fieldsForm, include);

        // TODO: test validations
    }
    /**
     * Get Form for Form Version
     *
     * Get the form associated with the given form version.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;forms:read&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFormForFormVersionTest() throws Exception {
        String id = null;
        String revision = null;
        List<String> fieldsForm = null;
        GetFormResponse response = api.getFormForFormVersion(id, revision, fieldsForm);

        // TODO: test validations
    }
    /**
     * Get Form ID for Form Version
     *
     * Get the ID of the form associated with the given form version.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;forms:read&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFormIdForFormVersionTest() throws Exception {
        String id = null;
        String revision = null;
        GetFormVersionFormRelationshipResponse response = api.getFormIdForFormVersion(id, revision);

        // TODO: test validations
    }
    /**
     * Get Form Version
     *
     * Get the form version with the given ID.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;forms:read&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFormVersionTest() throws Exception {
        String id = null;
        String revision = null;
        List<String> fieldsFormVersion = null;
        GetFormVersionResponse response = api.getFormVersion(id, revision, fieldsFormVersion);

        // TODO: test validations
    }
    /**
     * Get Forms
     *
     * Get all forms in an account.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;forms:read&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFormsTest() throws Exception {
        String revision = null;
        List<String> fieldsForm = null;
        String filter = null;
        String pageCursor = null;
        Integer pageSize = null;
        String sort = null;
        GetFormResponseCollectionCompoundDocument response = api.getForms(revision, fieldsForm, filter, pageCursor, pageSize, sort);

        // TODO: test validations
    }
    /**
     * Get Version IDs for Form
     *
     * Get the IDs of the form versions for the given form.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;forms:read&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVersionIdsForFormTest() throws Exception {
        String id = null;
        String revision = null;
        GetFormFormVersionRelationshipsResponseCollection response = api.getVersionIdsForForm(id, revision);

        // TODO: test validations
    }
    /**
     * Get Versions for Form
     *
     * Get the form versions for the given form.&lt;br&gt;&lt;br&gt;*Rate limits*:&lt;br&gt;Burst: &#x60;3/s&#x60;&lt;br&gt;Steady: &#x60;60/m&#x60;  **Scopes:** &#x60;forms:read&#x60;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVersionsForFormTest() throws Exception {
        String id = null;
        String revision = null;
        List<String> fieldsFormVersion = null;
        String filter = null;
        String pageCursor = null;
        Integer pageSize = null;
        String sort = null;
        GetFormVersionResponse response = api.getVersionsForForm(id, revision, fieldsFormVersion, filter, pageCursor, pageSize, sort);

        // TODO: test validations
    }
}
