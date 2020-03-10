
# CardTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**encodedKey** | **String** | The encoded key of the entity, generated, globally unique |  [optional]
**cardToken** | **String** | The reference token of the card. |  [optional]
**externalReferenceId** | **String** | The external reference ID to be used to reference the card transaction in subsequent requests. | 
**advice** | **Boolean** | Whether the given request should be accepted without balance validations. | 
**amount** | [**BigDecimal**](BigDecimal.md) | The amount of money to be withdrawn in the financial transaction. | 
**currencyCode** | **String** | The ISO currency code in which the card withdrawal reversal transaction is posted. The amounts are stored in the base currency, but the transaction can be created with a foreign currency. |  [optional]
**cardAcceptor** | [**CardAcceptor**](CardAcceptor.md) | The card acceptor details. |  [optional]
**userTransactionTime** | **String** | The formatted time at which the user made this card transaction. |  [optional]
**externalAuthorizationReferenceId** | **String** | The external authorization hold reference ID, which relates this card transaction to a previous authorization hold. |  [optional]



