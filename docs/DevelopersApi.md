# DevelopersApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findAccessPointsbyMac**](DevelopersApi.md#findAccessPointsbyMac) | **GET** /getAccessPoint/byMac/{mac} | finds item from DB
[**findGridPointbyId**](DevelopersApi.md#findGridPointbyId) | **GET** /getGridPoint/byId/{id} | finds item from DB
[**findStandbyId**](DevelopersApi.md#findStandbyId) | **GET** /getStand/byId/{id} | finds item from DB
[**getAllAccessPoints**](DevelopersApi.md#getAllAccessPoints) | **GET** /getAllAccessPoints | finds all items
[**getAllGridPoints**](DevelopersApi.md#getAllGridPoints) | **GET** /getAllGridPoints | finds all items
[**getAllStands**](DevelopersApi.md#getAllStands) | **GET** /getAllStands | finds all items
[**getAllVektors**](DevelopersApi.md#getAllVektors) | **GET** /getAllVektors | finds all items


<a name="findAccessPointsbyMac"></a>
# **findAccessPointsbyMac**
> findAccessPointsbyMac(mac)

finds item from DB

Search AccessPoints by mac

### Example
```java
// Import classes:
//import io.swagger.client.api.DevelopersApi;

DevelopersApi apiInstance = new DevelopersApi();
UUID mac = new UUID(); // UUID | AccessPoint to find
try {
    apiInstance.findAccessPointsbyMac(mac);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#findAccessPointsbyMac");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mac** | [**UUID**](.md)| AccessPoint to find |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findGridPointbyId"></a>
# **findGridPointbyId**
> findGridPointbyId(id)

finds item from DB

Search Grid Points by ID

### Example
```java
// Import classes:
//import io.swagger.client.api.DevelopersApi;

DevelopersApi apiInstance = new DevelopersApi();
String id = "id_example"; // String | GridPoint to find
try {
    apiInstance.findGridPointbyId(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#findGridPointbyId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| GridPoint to find |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findStandbyId"></a>
# **findStandbyId**
> findStandbyId(id)

finds item from DB

Search Stands by ID

### Example
```java
// Import classes:
//import io.swagger.client.api.DevelopersApi;

DevelopersApi apiInstance = new DevelopersApi();
Integer id = 56; // Integer | Stand to find
try {
    apiInstance.findStandbyId(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#findStandbyId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Stand to find |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllAccessPoints"></a>
# **getAllAccessPoints**
> List&lt;AccessPoint&gt; getAllAccessPoints(accessPoint)

finds all items

Gives a list of all AccessPoints from DB

### Example
```java
// Import classes:
//import io.swagger.client.api.DevelopersApi;

DevelopersApi apiInstance = new DevelopersApi();
AccessPoint accessPoint = new AccessPoint(); // AccessPoint | AccessPoints to get
try {
    List<AccessPoint> result = apiInstance.getAllAccessPoints(accessPoint);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#getAllAccessPoints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessPoint** | [**AccessPoint**](AccessPoint.md)| AccessPoints to get | [optional]

### Return type

[**List&lt;AccessPoint&gt;**](AccessPoint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllGridPoints"></a>
# **getAllGridPoints**
> List&lt;GridPoint&gt; getAllGridPoints(gridPoint)

finds all items

Gives a list of all GridPoints from DB

### Example
```java
// Import classes:
//import io.swagger.client.api.DevelopersApi;

DevelopersApi apiInstance = new DevelopersApi();
GridPoint gridPoint = new GridPoint(); // GridPoint | GridPoints to get
try {
    List<GridPoint> result = apiInstance.getAllGridPoints(gridPoint);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#getAllGridPoints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gridPoint** | [**GridPoint**](GridPoint.md)| GridPoints to get | [optional]

### Return type

[**List&lt;GridPoint&gt;**](GridPoint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllStands"></a>
# **getAllStands**
> List&lt;Stand&gt; getAllStands(stand)

finds all items

Gives a list of all Stands from DB

### Example
```java
// Import classes:
//import io.swagger.client.api.DevelopersApi;

DevelopersApi apiInstance = new DevelopersApi();
Stand stand = new Stand(); // Stand | Stands to get
try {
    List<Stand> result = apiInstance.getAllStands(stand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#getAllStands");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stand** | [**Stand**](Stand.md)| Stands to get | [optional]

### Return type

[**List&lt;Stand&gt;**](Stand.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllVektors"></a>
# **getAllVektors**
> List&lt;Vector&gt; getAllVektors(vektor)

finds all items

Gives a list of all Vektors from DB

### Example
```java
// Import classes:
//import io.swagger.client.api.DevelopersApi;

DevelopersApi apiInstance = new DevelopersApi();
Vector vektor = new Vector(); // Vector | Vektors to get
try {
    List<Vector> result = apiInstance.getAllVektors(vektor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#getAllVektors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vektor** | [**Vector**](Vector.md)| Vektors to get | [optional]

### Return type

[**List&lt;Vector&gt;**](Vector.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

