# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.AdminsApi;

public class AdminsApiExample {

    public static void main(String[] args) {
        AdminsApi apiInstance = new AdminsApi();
        AccessPoint accessPoint = new AccessPoint(); // AccessPoint | AccessPoint to add
        try {
            List<AccessPoint> result = apiInstance.addNewAccessPoint(accessPoint);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminsApi#addNewAccessPoint");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminsApi* | [**addNewAccessPoint**](docs/AdminsApi.md#addNewAccessPoint) | **POST** /saveAccessPoint | adds an inventory item
*AdminsApi* | [**addNewGridPoint**](docs/AdminsApi.md#addNewGridPoint) | **POST** /saveGridPoint | adds an inventory item
*DevelopersApi* | [**findAccessPointsbyMac**](docs/DevelopersApi.md#findAccessPointsbyMac) | **GET** /getAccessPoint/byMac/{mac} | finds item from DB
*DevelopersApi* | [**findGridPointbyId**](docs/DevelopersApi.md#findGridPointbyId) | **GET** /getGridPoint/byId/{id} | finds item from DB
*DevelopersApi* | [**findStandbyId**](docs/DevelopersApi.md#findStandbyId) | **GET** /getStand/byId/{id} | finds item from DB
*DevelopersApi* | [**getAllAccessPoints**](docs/DevelopersApi.md#getAllAccessPoints) | **GET** /getAllAccessPoints | finds all items
*DevelopersApi* | [**getAllGridPoints**](docs/DevelopersApi.md#getAllGridPoints) | **GET** /getAllGridPoints | finds all items
*DevelopersApi* | [**getAllStands**](docs/DevelopersApi.md#getAllStands) | **GET** /getAllStands | finds all items
*DevelopersApi* | [**getAllVektors**](docs/DevelopersApi.md#getAllVektors) | **GET** /getAllVektors | finds all items


## Documentation for Models

 - [AccessPoint](docs/AccessPoint.md)
 - [GridAccessPoint](docs/GridAccessPoint.md)
 - [GridPoint](docs/GridPoint.md)
 - [Stand](docs/Stand.md)
 - [Vector](docs/Vector.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

wi15b099@technikum-wien.at

