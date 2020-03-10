
# DepositTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**encodedKey** | **String** | The encoded key of the deposit transaction, auto generated, unique |  [optional]
**id** | **String** | The id of the deposit transaction, auto generated, unique |  [optional]
**externalId** | **String** | The external id of the deposit transaction, customizable, unique |  [optional]
**paymentOrderId** | **String** | The payment order id of the deposit transaction, customizable |  [optional]
**creationDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date when this deposit transaction was created |  [optional]
**valueDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date of the entry (eg date of repayment or disbursal, etc.) (as Organization Time) |  [optional]
**bookingDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date when corresponding JE is booked (as Organization Time) |  [optional]
**notes** | **String** | Extra notes about this deposit transaction |  [optional]
**parentAccountKey** | **String** | The key of the parent deposit account |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the deposit transaction |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) | How much was added/removed in account |  [optional]
**currencyCode** | **String** | The currency in which this transaction was posted |  [optional]
**affectedAmounts** | [**DepositAffectedAmounts**](DepositAffectedAmounts.md) | The amounts affected after completing the transaction |  [optional]
**taxes** | [**DepositTaxes**](DepositTaxes.md) | The taxes applied on this transaction |  [optional]
**accountBalances** | [**DepositTransactionBalances**](DepositTransactionBalances.md) | The account balances changed within the transaction |  [optional]
**userKey** | **String** | The person that performed the transaction |  [optional]
**branchKey** | **String** | The branch where the transaction was performed |  [optional]
**centreKey** | **String** | The center where the transaction was performed |  [optional]
**tillKey** | **String** | The till key associated with this transaction |  [optional]
**adjustmentTransactionKey** | **String** | The key of the deposit transaction where the adjustment for this transaction was made (if any adjustment was involved) |  [optional]
**originalTransactionKey** | **String** | The encodedKey of the transaction that was adjusted as part of this one. Available only for adjustment transactions |  [optional]
**migrationEventKey** | **String** | The migration event encoded key associated with this deposit account. If this account was imported, track which &#39;migration event&#39; they came from |  [optional]
**terms** | [**DepositTerms**](DepositTerms.md) | The terms of the deposit transaction |  [optional]
**transactionDetails** | [**TransactionDetails**](TransactionDetails.md) | Holds the transaction details |  [optional]
**transferDetails** | [**TransferDetails**](TransferDetails.md) | Holds the transfer details |  [optional]
**fees** | [**List&lt;Fee&gt;**](Fee.md) | All the amounts that have been applied or paid within this transaction and involved predefined fees |  [optional]
**cardTransaction** | [**CardTransaction**](CardTransaction.md) | The card transaction details that correspond to this deposit transaction (if applicable) |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
IMPORT | &quot;IMPORT&quot;
WRITE_OFF | &quot;WRITE_OFF&quot;
WRITE_OFF_ADJUSTMENT | &quot;WRITE_OFF_ADJUSTMENT&quot;
DEPOSIT | &quot;DEPOSIT&quot;
ADJUSTMENT | &quot;ADJUSTMENT&quot;
WITHDRAWAL | &quot;WITHDRAWAL&quot;
WITHDRAWAL_ADJUSTMENT | &quot;WITHDRAWAL_ADJUSTMENT&quot;
CARD_TRANSACTION_REVERSAL | &quot;CARD_TRANSACTION_REVERSAL&quot;
TRANSFER | &quot;TRANSFER&quot;
TRANSFER_ADJUSTMENT | &quot;TRANSFER_ADJUSTMENT&quot;
FEE_APPLIED | &quot;FEE_APPLIED&quot;
FEE_ADJUSTED | &quot;FEE_ADJUSTED&quot;
FEES_DUE_REDUCED | &quot;FEES_DUE_REDUCED&quot;
INTEREST_APPLIED | &quot;INTEREST_APPLIED&quot;
INTEREST_APPLIED_ADJUSTMENT | &quot;INTEREST_APPLIED_ADJUSTMENT&quot;
FEE_REDUCTION_ADJUSTMENT | &quot;FEE_REDUCTION_ADJUSTMENT&quot;
WITHHOLDING_TAX | &quot;WITHHOLDING_TAX&quot;
WITHHOLDING_TAX_ADJUSTMENT | &quot;WITHHOLDING_TAX_ADJUSTMENT&quot;
INTEREST_RATE_CHANGED | &quot;INTEREST_RATE_CHANGED&quot;
OVERDRAFT_INTEREST_RATE_CHANGED | &quot;OVERDRAFT_INTEREST_RATE_CHANGED&quot;
OVERDRAFT_LIMIT_CHANGED | &quot;OVERDRAFT_LIMIT_CHANGED&quot;
BRANCH_CHANGED | &quot;BRANCH_CHANGED&quot;
LOAN_FUNDED | &quot;LOAN_FUNDED&quot;
LOAN_FUNDED_ADJUSTMENT | &quot;LOAN_FUNDED_ADJUSTMENT&quot;
LOAN_REPAID | &quot;LOAN_REPAID&quot;
LOAN_REPAID_ADJUSTMENT | &quot;LOAN_REPAID_ADJUSTMENT&quot;
LOAN_FRACTION_BOUGHT | &quot;LOAN_FRACTION_BOUGHT&quot;
LOAN_FRACTION_BOUGHT_ADJUSTMENT | &quot;LOAN_FRACTION_BOUGHT_ADJUSTMENT&quot;
LOAN_FRACTION_SOLD | &quot;LOAN_FRACTION_SOLD&quot;
LOAN_FRACTION_SOLD_ADJUSTMENT | &quot;LOAN_FRACTION_SOLD_ADJUSTMENT&quot;



