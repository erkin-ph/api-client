# DepositTransactionsApi

All URIs are relative to *https://localhost:8889/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adjust**](DepositTransactionsApi.md#adjust) | **POST** /deposits/transactions/{depositTransactionId}:adjust | Allows the adjustment of a deposit transaction. The adjustment of a single transaction may bulk adjust multiple transactions
[**applyFee**](DepositTransactionsApi.md#applyFee) | **POST** /deposits/{depositAccountId}/fee-transactions | Apply a fee on deposit account
[**getAll**](DepositTransactionsApi.md#getAll) | **GET** /deposits/{depositAccountId}/transactions | Allows retrieval of all transactions for a deposit account via id or encoded key
[**getById**](DepositTransactionsApi.md#getById) | **GET** /deposits/transactions/{depositTransactionId} | Allows retrieval of a single deposit transaction via id or encoded key
[**makeDeposit**](DepositTransactionsApi.md#makeDeposit) | **POST** /deposits/{depositAccountId}/deposit-transactions | Create new deposit transaction for account
[**makeTransfer**](DepositTransactionsApi.md#makeTransfer) | **POST** /deposits/{depositAccountId}/transfer-transactions | Create a new transfer transaction
[**makeWithdrawal**](DepositTransactionsApi.md#makeWithdrawal) | **POST** /deposits/{depositAccountId}/withdrawal-transactions | Create a new withdrawal transaction
[**search**](DepositTransactionsApi.md#search) | **POST** /deposits/transactions:search | Client Directed Query. Allows you to search deposit transactions for deposit accounts by various criteria


<a name="adjust"></a>
# **adjust**
> DepositTransaction adjust(depositTransactionId, body, idempotencyKey)

Allows the adjustment of a deposit transaction. The adjustment of a single transaction may bulk adjust multiple transactions



### Example
```java
// Import classes:
//import com.mambu.sdk.api.ApiClient;
//import com.mambu.sdk.api.ApiException;
//import com.mambu.sdk.api.Configuration;
//import com.mambu.sdk.api.auth.*;
//import com.mambu.sdk.api.v2.DepositTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DepositTransactionsApi apiInstance = new DepositTransactionsApi();
String depositTransactionId = "depositTransactionId_example"; // String | The id or encoded key of the deposit transaction
DepositTransactionAdjustmentDetails body = new DepositTransactionAdjustmentDetails(); // DepositTransactionAdjustmentDetails | Details of the adjustment action
String idempotencyKey = "idempotencyKey_example"; // String | Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
try {
    DepositTransaction result = apiInstance.adjust(depositTransactionId, body, idempotencyKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DepositTransactionsApi#adjust");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depositTransactionId** | **String**| The id or encoded key of the deposit transaction |
 **body** | [**DepositTransactionAdjustmentDetails**](DepositTransactionAdjustmentDetails.md)| Details of the adjustment action |
 **idempotencyKey** | **String**| Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting. | [optional]

### Return type

[**DepositTransaction**](DepositTransaction.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mambu.v2+json

<a name="applyFee"></a>
# **applyFee**
> DepositTransaction applyFee(depositAccountId, body, idempotencyKey)

Apply a fee on deposit account



### Example
```java
// Import classes:
//import com.mambu.sdk.api.ApiClient;
//import com.mambu.sdk.api.ApiException;
//import com.mambu.sdk.api.Configuration;
//import com.mambu.sdk.api.auth.*;
//import com.mambu.sdk.api.v2.DepositTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DepositTransactionsApi apiInstance = new DepositTransactionsApi();
String depositAccountId = "depositAccountId_example"; // String | The id or encoded key of the deposit that the transaction will be created for
FeeAppliedDepositTransactionInput body = new FeeAppliedDepositTransactionInput(); // FeeAppliedDepositTransactionInput | Represents the request payload for creating a transaction of type FEE_APPLIED on a deposit
String idempotencyKey = "idempotencyKey_example"; // String | Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
try {
    DepositTransaction result = apiInstance.applyFee(depositAccountId, body, idempotencyKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DepositTransactionsApi#applyFee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depositAccountId** | **String**| The id or encoded key of the deposit that the transaction will be created for |
 **body** | [**FeeAppliedDepositTransactionInput**](FeeAppliedDepositTransactionInput.md)| Represents the request payload for creating a transaction of type FEE_APPLIED on a deposit |
 **idempotencyKey** | **String**| Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting. | [optional]

### Return type

[**DepositTransaction**](DepositTransaction.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mambu.v2+json

<a name="getAll"></a>
# **getAll**
> List&lt;DepositTransaction&gt; getAll(depositAccountId, offset, limit, paginationDetails, detailsLevel)

Allows retrieval of all transactions for a deposit account via id or encoded key



### Example
```java
// Import classes:
//import com.mambu.sdk.api.ApiClient;
//import com.mambu.sdk.api.ApiException;
//import com.mambu.sdk.api.Configuration;
//import com.mambu.sdk.api.auth.*;
//import com.mambu.sdk.api.v2.DepositTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DepositTransactionsApi apiInstance = new DepositTransactionsApi();
String depositAccountId = "depositAccountId_example"; // String | The id or encoded key of the deposit account used to retrieve all its transactions
Integer offset = 56; // Integer | Pagination, index to start searching at when retrieving elements, used in combination with limit to paginate results
Integer limit = 56; // Integer | Pagination, the number of elements to retrieve, used in combination with offset to paginate results
String paginationDetails = "OFF"; // String | Flag specifying whether the pagination should be enabled or not. Please note that by default it is disabled (OFF), in order to improve the performance of the APIs
String detailsLevel = "detailsLevel_example"; // String | The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object
try {
    List<DepositTransaction> result = apiInstance.getAll(depositAccountId, offset, limit, paginationDetails, detailsLevel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DepositTransactionsApi#getAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depositAccountId** | **String**| The id or encoded key of the deposit account used to retrieve all its transactions |
 **offset** | **Integer**| Pagination, index to start searching at when retrieving elements, used in combination with limit to paginate results | [optional]
 **limit** | **Integer**| Pagination, the number of elements to retrieve, used in combination with offset to paginate results | [optional]
 **paginationDetails** | **String**| Flag specifying whether the pagination should be enabled or not. Please note that by default it is disabled (OFF), in order to improve the performance of the APIs | [optional] [default to OFF] [enum: ON, OFF]
 **detailsLevel** | **String**| The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object | [optional] [enum: BASIC, FULL]

### Return type

[**List&lt;DepositTransaction&gt;**](DepositTransaction.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mambu.v2+json

<a name="getById"></a>
# **getById**
> DepositTransaction getById(depositTransactionId, detailsLevel)

Allows retrieval of a single deposit transaction via id or encoded key



### Example
```java
// Import classes:
//import com.mambu.sdk.api.ApiClient;
//import com.mambu.sdk.api.ApiException;
//import com.mambu.sdk.api.Configuration;
//import com.mambu.sdk.api.auth.*;
//import com.mambu.sdk.api.v2.DepositTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DepositTransactionsApi apiInstance = new DepositTransactionsApi();
String depositTransactionId = "depositTransactionId_example"; // String | The id or encoded key of the deposit transaction
String detailsLevel = "detailsLevel_example"; // String | The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object
try {
    DepositTransaction result = apiInstance.getById(depositTransactionId, detailsLevel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DepositTransactionsApi#getById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depositTransactionId** | **String**| The id or encoded key of the deposit transaction |
 **detailsLevel** | **String**| The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object | [optional] [enum: BASIC, FULL]

### Return type

[**DepositTransaction**](DepositTransaction.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mambu.v2+json

<a name="makeDeposit"></a>
# **makeDeposit**
> DepositTransaction makeDeposit(depositAccountId, body, idempotencyKey)

Create new deposit transaction for account



### Example
```java
// Import classes:
//import com.mambu.sdk.api.ApiClient;
//import com.mambu.sdk.api.ApiException;
//import com.mambu.sdk.api.Configuration;
//import com.mambu.sdk.api.auth.*;
//import com.mambu.sdk.api.v2.DepositTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DepositTransactionsApi apiInstance = new DepositTransactionsApi();
String depositAccountId = "depositAccountId_example"; // String | The id or encoded key of the deposit that the transaction will be created for
DepositTransactionInput body = new DepositTransactionInput(); // DepositTransactionInput | The input details needed to create a deposit transaction
String idempotencyKey = "idempotencyKey_example"; // String | Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
try {
    DepositTransaction result = apiInstance.makeDeposit(depositAccountId, body, idempotencyKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DepositTransactionsApi#makeDeposit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depositAccountId** | **String**| The id or encoded key of the deposit that the transaction will be created for |
 **body** | [**DepositTransactionInput**](DepositTransactionInput.md)| The input details needed to create a deposit transaction |
 **idempotencyKey** | **String**| Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting. | [optional]

### Return type

[**DepositTransaction**](DepositTransaction.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mambu.v2+json

<a name="makeTransfer"></a>
# **makeTransfer**
> DepositTransaction makeTransfer(depositAccountId, body, idempotencyKey)

Create a new transfer transaction



### Example
```java
// Import classes:
//import com.mambu.sdk.api.ApiClient;
//import com.mambu.sdk.api.ApiException;
//import com.mambu.sdk.api.Configuration;
//import com.mambu.sdk.api.auth.*;
//import com.mambu.sdk.api.v2.DepositTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DepositTransactionsApi apiInstance = new DepositTransactionsApi();
String depositAccountId = "depositAccountId_example"; // String | The id or encoded key of the deposit that the transaction will be created for
TransferDepositTransactionInput body = new TransferDepositTransactionInput(); // TransferDepositTransactionInput | Input details for transfer transaction
String idempotencyKey = "idempotencyKey_example"; // String | Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
try {
    DepositTransaction result = apiInstance.makeTransfer(depositAccountId, body, idempotencyKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DepositTransactionsApi#makeTransfer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depositAccountId** | **String**| The id or encoded key of the deposit that the transaction will be created for |
 **body** | [**TransferDepositTransactionInput**](TransferDepositTransactionInput.md)| Input details for transfer transaction |
 **idempotencyKey** | **String**| Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting. | [optional]

### Return type

[**DepositTransaction**](DepositTransaction.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mambu.v2+json

<a name="makeWithdrawal"></a>
# **makeWithdrawal**
> DepositTransaction makeWithdrawal(depositAccountId, body, idempotencyKey)

Create a new withdrawal transaction



### Example
```java
// Import classes:
//import com.mambu.sdk.api.ApiClient;
//import com.mambu.sdk.api.ApiException;
//import com.mambu.sdk.api.Configuration;
//import com.mambu.sdk.api.auth.*;
//import com.mambu.sdk.api.v2.DepositTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DepositTransactionsApi apiInstance = new DepositTransactionsApi();
String depositAccountId = "depositAccountId_example"; // String | The id or encoded key of the deposit that the transaction will be created for
WithdrawalDepositTransactionInput body = new WithdrawalDepositTransactionInput(); // WithdrawalDepositTransactionInput | Input details for withdrawal transaction
String idempotencyKey = "idempotencyKey_example"; // String | Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
try {
    DepositTransaction result = apiInstance.makeWithdrawal(depositAccountId, body, idempotencyKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DepositTransactionsApi#makeWithdrawal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **depositAccountId** | **String**| The id or encoded key of the deposit that the transaction will be created for |
 **body** | [**WithdrawalDepositTransactionInput**](WithdrawalDepositTransactionInput.md)| Input details for withdrawal transaction |
 **idempotencyKey** | **String**| Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting. | [optional]

### Return type

[**DepositTransaction**](DepositTransaction.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mambu.v2+json

<a name="search"></a>
# **search**
> List&lt;DepositTransaction&gt; search(body, offset, limit, paginationDetails, detailsLevel)

Client Directed Query. Allows you to search deposit transactions for deposit accounts by various criteria



### Example
```java
// Import classes:
//import com.mambu.sdk.api.ApiClient;
//import com.mambu.sdk.api.ApiException;
//import com.mambu.sdk.api.Configuration;
//import com.mambu.sdk.api.auth.*;
//import com.mambu.sdk.api.v2.DepositTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DepositTransactionsApi apiInstance = new DepositTransactionsApi();
DepositTransactionSearchCriteria body = new DepositTransactionSearchCriteria(); // DepositTransactionSearchCriteria | Criteria to be used to search the deposit transactions
Integer offset = 56; // Integer | Pagination, index to start searching at when retrieving elements, used in combination with limit to paginate results
Integer limit = 56; // Integer | Pagination, the number of elements to retrieve, used in combination with offset to paginate results
String paginationDetails = "OFF"; // String | Flag specifying whether the pagination should be enabled or not. Please note that by default it is disabled (OFF), in order to improve the performance of the APIs
String detailsLevel = "detailsLevel_example"; // String | The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object
try {
    List<DepositTransaction> result = apiInstance.search(body, offset, limit, paginationDetails, detailsLevel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DepositTransactionsApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DepositTransactionSearchCriteria**](DepositTransactionSearchCriteria.md)| Criteria to be used to search the deposit transactions |
 **offset** | **Integer**| Pagination, index to start searching at when retrieving elements, used in combination with limit to paginate results | [optional]
 **limit** | **Integer**| Pagination, the number of elements to retrieve, used in combination with offset to paginate results | [optional]
 **paginationDetails** | **String**| Flag specifying whether the pagination should be enabled or not. Please note that by default it is disabled (OFF), in order to improve the performance of the APIs | [optional] [default to OFF] [enum: ON, OFF]
 **detailsLevel** | **String**| The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object | [optional] [enum: BASIC, FULL]

### Return type

[**List&lt;DepositTransaction&gt;**](DepositTransaction.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mambu.v2+json

