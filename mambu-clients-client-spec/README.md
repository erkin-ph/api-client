# swagger-java-client

clients
- API version: v2
  - Build date: 2019-04-17T14:40:27.775Z

No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.mambu.sdk.api.*;
import com.mambu.sdk.api.auth.*;
import com.mambu.sdk.model.v2.*;
import com.mambu.sdk.api.v2.ClientsApi;

import java.io.File;
import java.util.*;

public class ClientsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ClientsApi apiInstance = new ClientsApi();
        Client body = new Client(); // Client | Client to be created
        String idempotencyKey = "idempotencyKey_example"; // String | Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
        try {
            Client result = apiInstance.create(body, idempotencyKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsApi#create");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:8889/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ClientsApi* | [**create**](docs/ClientsApi.md#create) | **POST** /clients | Create a new client
*ClientsApi* | [**delete**](docs/ClientsApi.md#delete) | **DELETE** /clients/{clientId} | Delete a client
*ClientsApi* | [**getAll**](docs/ClientsApi.md#getAll) | **GET** /clients | Allows retrieval of clients using various query parameters
*ClientsApi* | [**getById**](docs/ClientsApi.md#getById) | **GET** /clients/{clientId} | Allows retrieval of a single client via id or encoded key
*ClientsApi* | [**getRoleByClientId**](docs/ClientsApi.md#getRoleByClientId) | **GET** /clients/{clientId}/role | Allows to retrieve the client role for a client
*ClientsApi* | [**patch**](docs/ClientsApi.md#patch) | **PATCH** /clients/{clientId} | Partially update an existing client
*ClientsApi* | [**update**](docs/ClientsApi.md#update) | **PUT** /clients/{clientId} | Update an existing client


## Documentation for Models

 - [Address](docs/Address.md)
 - [Client](docs/Client.md)
 - [ClientRole](docs/ClientRole.md)
 - [Document](docs/Document.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [IdentificationDocument](docs/IdentificationDocument.md)
 - [PatchOperation](docs/PatchOperation.md)
 - [PatchOperationsList](docs/PatchOperationsList.md)
 - [PortalSettings](docs/PortalSettings.md)
 - [RestError](docs/RestError.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basic

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


