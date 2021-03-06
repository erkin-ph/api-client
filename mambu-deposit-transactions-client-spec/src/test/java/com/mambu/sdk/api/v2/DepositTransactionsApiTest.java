/*
 * deposits/transactions
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
import com.mambu.sdk.model.v2.*;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * API tests for DepositTransactionsApi
 */
@Ignore
public class DepositTransactionsApiTest {

    private final DepositTransactionsApi api = new DepositTransactionsApi();


    /**
     * Allows the adjustment of a deposit transaction. The adjustment of a single transaction may bulk adjust multiple transactions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void adjustTest() throws ApiException {
        String depositTransactionId = null;
        DepositTransactionAdjustmentDetails body = null;
        String idempotencyKey = null;
        DepositTransaction response = api.adjust(depositTransactionId, body, idempotencyKey);

        // TODO: test validations
    }

    /**
     * Apply a fee on deposit account
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void applyFeeTest() throws ApiException {
        String depositAccountId = null;
        FeeAppliedDepositTransactionInput body = null;
        String idempotencyKey = null;
        DepositTransaction response = api.applyFee(depositAccountId, body, idempotencyKey);

        // TODO: test validations
    }

    /**
     * Allows retrieval of all transactions for a deposit account via id or encoded key
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTest() throws ApiException {
        String depositAccountId = null;
        Integer offset = null;
        Integer limit = null;
        String paginationDetails = null;
        String detailsLevel = null;
        List<DepositTransaction> response = api.getAll(depositAccountId, offset, limit, paginationDetails, detailsLevel);

        // TODO: test validations
    }

    /**
     * Allows retrieval of a single deposit transaction via id or encoded key
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String depositTransactionId = null;
        String detailsLevel = null;
        DepositTransaction response = api.getById(depositTransactionId, detailsLevel);

        // TODO: test validations
    }

    /**
     * Create new deposit transaction for account
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void makeDepositTest() throws ApiException {
        String depositAccountId = null;
        DepositTransactionInput body = null;
        String idempotencyKey = null;
        DepositTransaction response = api.makeDeposit(depositAccountId, body, idempotencyKey);

        // TODO: test validations
    }

    /**
     * Create a new transfer transaction
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void makeTransferTest() throws ApiException {
        String depositAccountId = null;
        TransferDepositTransactionInput body = null;
        String idempotencyKey = null;
        DepositTransaction response = api.makeTransfer(depositAccountId, body, idempotencyKey);

        // TODO: test validations
    }

    /**
     * Create a new withdrawal transaction
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void makeWithdrawalTest() throws ApiException {
        String depositAccountId = null;
        WithdrawalDepositTransactionInput body = null;
        String idempotencyKey = null;
        DepositTransaction response = api.makeWithdrawal(depositAccountId, body, idempotencyKey);

        // TODO: test validations
    }

    /**
     * Client Directed Query. Allows you to search deposit transactions for deposit accounts by various criteria
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchTest() throws ApiException {
        DepositTransactionSearchCriteria body = null;
        Integer offset = null;
        Integer limit = null;
        String paginationDetails = null;
        String detailsLevel = null;
        List<DepositTransaction> response = api.search(body, offset, limit, paginationDetails, detailsLevel);

        // TODO: test validations
    }

}
