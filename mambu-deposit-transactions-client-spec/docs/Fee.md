
# Fee

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**predefinedFeeKey** | **String** | The encoded key of the predefined fee, auto generated, unique | 
**name** | **String** | The name of the predefined fee |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) | The amount of the fee that was applied/paid in the transaction for the given predefined fee. |  [optional]
**taxAmount** | [**BigDecimal**](BigDecimal.md) | The amount of the taxes on fee that was applied/paid in the transaction. |  [optional]
**trigger** | [**TriggerEnum**](#TriggerEnum) | Shows the event that will trigger a fee |  [optional]


<a name="TriggerEnum"></a>
## Enum: TriggerEnum
Name | Value
---- | -----
MANUAL | &quot;MANUAL&quot;
DISBURSEMENT | &quot;DISBURSEMENT&quot;
CAPITALIZED_DISBURSEMENT | &quot;CAPITALIZED_DISBURSEMENT&quot;
UPFRONT_DISBURSEMENT | &quot;UPFRONT_DISBURSEMENT&quot;
LATE_REPAYMENT | &quot;LATE_REPAYMENT&quot;
MONTHLY_FEE | &quot;MONTHLY_FEE&quot;
PAYMENT_DUE | &quot;PAYMENT_DUE&quot;
PAYMENT_DUE_APPLIED_ON_DUE_DATES | &quot;PAYMENT_DUE_APPLIED_ON_DUE_DATES&quot;
ARBITRARY | &quot;ARBITRARY&quot;



