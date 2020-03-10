
# TransferDepositTransactionInput

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**externalId** | **String** | The external id of the transfer transaction, customizable, unique |  [optional]
**paymentOrderId** | **String** | The payment order id of the transfer transaction, customizable |  [optional]
**valueDate** | [**OffsetDateTime**](OffsetDateTime.md) | The entry date of the transfer. If not specified it is considered the current date (as Organization Time) |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) | The amount to transfer from account | 
**transferDetails** | [**TransferDetailsInput**](TransferDetailsInput.md) | The amount to transfer from account | 
**notes** | **String** | Extra notes about this deposit transaction |  [optional]



