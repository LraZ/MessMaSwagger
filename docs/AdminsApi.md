# AdminsApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNewAccessPoint**](AdminsApi.md#addNewAccessPoint) | **POST** /saveAccessPoint | adds an inventory item
[**addNewGridPoint**](AdminsApi.md#addNewGridPoint) | **POST** /saveGridPoint | adds an inventory item


<a name="addNewAccessPoint"></a>
# **addNewAccessPoint**
> List&lt;AccessPoint&gt; addNewAccessPoint(accessPoint)

adds an inventory item

Adds an AccessPoint to the DB

### Example
```java
// Import classes:
//import io.swagger.client.api.AdminsApi;

AdminsApi apiInstance = new AdminsApi();
AccessPoint accessPoint = new AccessPoint(); // AccessPoint | AccessPoint to add
try {
    List<AccessPoint> result = apiInstance.addNewAccessPoint(accessPoint);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminsApi#addNewAccessPoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessPoint** | [**AccessPoint**](AccessPoint.md)| AccessPoint to add | [optional]

### Return type

[**List&lt;AccessPoint&gt;**](AccessPoint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addNewGridPoint"></a>
# **addNewGridPoint**
> List&lt;GridPoint&gt; addNewGridPoint(gridPoint)

adds an inventory item

Adds an GridPoint to the DB

### Example
```java
// Import classes:
//import io.swagger.client.api.AdminsApi;

AdminsApi apiInstance = new AdminsApi();
GridPoint gridPoint = new GridPoint(); // GridPoint | GridPoint to add
try {
    List<GridPoint> result = apiInstance.addNewGridPoint(gridPoint);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminsApi#addNewGridPoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gridPoint** | [**GridPoint**](GridPoint.md)| GridPoint to add | [optional]

### Return type

[**List&lt;GridPoint&gt;**](GridPoint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

