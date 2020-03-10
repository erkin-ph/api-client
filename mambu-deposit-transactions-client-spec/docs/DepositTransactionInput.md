
# DepositTransactionInput

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**externalId** | **String** | The external id of the deposit transaction, customizable, unique |  [optional]
**paymentOrderId** | **String** | The payment order id of the deposit transaction, customizable |  [optional]
**valueDate** | [**OffsetDateTime**](OffsetDateTime.md) | The entry date of the deposit (as Organization Time) |  [optional]
**bookingDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of Journal Entry (as Organization Time) |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) | The amount that was added to an account | 
**notes** | **String** | Extra notes about this deposit transaction |  [optional]
**transactionDetails** | [**TransactionDetailsInput**](TransactionDetailsInput.md) | Contains the details about transaction including fields like transaction channel key and channel id |  [optional]



