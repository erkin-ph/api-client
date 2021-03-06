/*
 * clients
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v2
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.mambu.sdk.api.v2;

import com.mambu.sdk.api.ApiException;
import com.mambu.sdk.model.v2.Client;
import com.mambu.sdk.model.v2.ClientRole;
import com.mambu.sdk.model.v2.PatchOperation;
import org.junit.Ignore;
import org.junit.Test;
import org.threeten.bp.LocalDate;

import java.util.List;

/**
 * API tests for ClientsApi
 */
@Ignore
public class ClientsApiTest {

    private final ClientsApi api = new ClientsApi();


    /**
     * Create a new client
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        Client body = null;
        String idempotencyKey = null;
        Client response = api.create(body, idempotencyKey);

        // TODO: test validations
    }

    /**
     * Delete a client
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        String clientId = null;
        api.delete(clientId);

        // TODO: test validations
    }

    /**
     * Allows retrieval of clients using various query parameters
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTest() throws ApiException {
        Integer offset = null;
        Integer limit = null;
        String paginationDetails = null;
        String detailsLevel = null;
        String firstName = null;
        String lastName = null;
        String idNumber = null;
        String branchId = null;
        String centreId = null;
        String creditOfficerUsername = null;
        String state = null;
        LocalDate birthDate = null;
        String sortBy = null;
        List<Client> response = api.getAll(offset, limit, paginationDetails, detailsLevel, firstName, lastName, idNumber, branchId, centreId, creditOfficerUsername, state, birthDate, sortBy);

        // TODO: test validations
    }

    /**
     * Allows retrieval of a single client via id or encoded key
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String clientId = null;
        String detailsLevel = null;
        Client response = api.getById(clientId, detailsLevel);

        // TODO: test validations
    }

    /**
     * Allows to retrieve the client role for a client
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRoleByClientIdTest() throws ApiException {
        String clientId = null;
        ClientRole response = api.getRoleByClientId(clientId);

        // TODO: test validations
    }

    /**
     * Partially update an existing client
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchTest() throws ApiException {
        String clientId = null;
        List<PatchOperation> body = null;
        api.patch(clientId, body);

        // TODO: test validations
    }

    /**
     * Update an existing client
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        String clientId = null;
        Client body = null;
        Client response = api.update(clientId, body);

        // TODO: test validations
    }

}
