# CellsPropertiesApi

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cellsPropertiesDeleteDocumentProperties**](CellsPropertiesApi.md#cellsPropertiesDeleteDocumentProperties) | **DELETE** /cells/{name}/documentproperties | Delete all custom document properties and clean built-in ones.
[**cellsPropertiesDeleteDocumentProperty**](CellsPropertiesApi.md#cellsPropertiesDeleteDocumentProperty) | **DELETE** /cells/{name}/documentproperties/{propertyName} | Delete document property.
[**cellsPropertiesGetDocumentProperties**](CellsPropertiesApi.md#cellsPropertiesGetDocumentProperties) | **GET** /cells/{name}/documentproperties | Read document properties.
[**cellsPropertiesGetDocumentProperty**](CellsPropertiesApi.md#cellsPropertiesGetDocumentProperty) | **GET** /cells/{name}/documentproperties/{propertyName} | Read document property by name.
[**cellsPropertiesPutDocumentProperty**](CellsPropertiesApi.md#cellsPropertiesPutDocumentProperty) | **PUT** /cells/{name}/documentproperties/{propertyName} | Set/create document property.


<a name="cellsPropertiesDeleteDocumentProperties"></a>
# **cellsPropertiesDeleteDocumentProperties**
> CellsDocumentPropertiesResponse cellsPropertiesDeleteDocumentProperties(name, folder)

Delete all custom document properties and clean built-in ones.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPropertiesApi;


CellsPropertiesApi apiInstance = new CellsPropertiesApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | The document folder.
try {
    CellsDocumentPropertiesResponse result = apiInstance.cellsPropertiesDeleteDocumentProperties(name, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPropertiesApi#cellsPropertiesDeleteDocumentProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| The document folder. | [optional]

### Return type

[**CellsDocumentPropertiesResponse**](CellsDocumentPropertiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPropertiesDeleteDocumentProperty"></a>
# **cellsPropertiesDeleteDocumentProperty**
> CellsDocumentPropertiesResponse cellsPropertiesDeleteDocumentProperty(name, propertyName, folder)

Delete document property.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPropertiesApi;


CellsPropertiesApi apiInstance = new CellsPropertiesApi();
String name = "name_example"; // String | The document name.
String propertyName = "propertyName_example"; // String | The property name.
String folder = "folder_example"; // String | The document folder.
try {
    CellsDocumentPropertiesResponse result = apiInstance.cellsPropertiesDeleteDocumentProperty(name, propertyName, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPropertiesApi#cellsPropertiesDeleteDocumentProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **propertyName** | **String**| The property name. |
 **folder** | **String**| The document folder. | [optional]

### Return type

[**CellsDocumentPropertiesResponse**](CellsDocumentPropertiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPropertiesGetDocumentProperties"></a>
# **cellsPropertiesGetDocumentProperties**
> CellsDocumentPropertiesResponse cellsPropertiesGetDocumentProperties(name, folder)

Read document properties.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPropertiesApi;


CellsPropertiesApi apiInstance = new CellsPropertiesApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | The document folder.
try {
    CellsDocumentPropertiesResponse result = apiInstance.cellsPropertiesGetDocumentProperties(name, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPropertiesApi#cellsPropertiesGetDocumentProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| The document folder. | [optional]

### Return type

[**CellsDocumentPropertiesResponse**](CellsDocumentPropertiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPropertiesGetDocumentProperty"></a>
# **cellsPropertiesGetDocumentProperty**
> CellsDocumentPropertyResponse cellsPropertiesGetDocumentProperty(name, propertyName, folder)

Read document property by name.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPropertiesApi;


CellsPropertiesApi apiInstance = new CellsPropertiesApi();
String name = "name_example"; // String | The document name.
String propertyName = "propertyName_example"; // String | The property name.
String folder = "folder_example"; // String | The document folder.
try {
    CellsDocumentPropertyResponse result = apiInstance.cellsPropertiesGetDocumentProperty(name, propertyName, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPropertiesApi#cellsPropertiesGetDocumentProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **propertyName** | **String**| The property name. |
 **folder** | **String**| The document folder. | [optional]

### Return type

[**CellsDocumentPropertyResponse**](CellsDocumentPropertyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPropertiesPutDocumentProperty"></a>
# **cellsPropertiesPutDocumentProperty**
> CellsDocumentPropertyResponse cellsPropertiesPutDocumentProperty(name, propertyName, property, folder)

Set/create document property.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPropertiesApi;


CellsPropertiesApi apiInstance = new CellsPropertiesApi();
String name = "name_example"; // String | The document name.
String propertyName = "propertyName_example"; // String | The property name.
CellsDocumentProperty property = new CellsDocumentProperty(); // CellsDocumentProperty | with new property value.
String folder = "folder_example"; // String | The document folder.
try {
    CellsDocumentPropertyResponse result = apiInstance.cellsPropertiesPutDocumentProperty(name, propertyName, property, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPropertiesApi#cellsPropertiesPutDocumentProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **propertyName** | **String**| The property name. |
 **property** | [**CellsDocumentProperty**](CellsDocumentProperty.md)| with new property value. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**CellsDocumentPropertyResponse**](CellsDocumentPropertyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

