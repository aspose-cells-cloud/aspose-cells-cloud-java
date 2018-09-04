# CellsPageBreaksApi

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cellsPageBreaksDeleteHorizontalPageBreak**](CellsPageBreaksApi.md#cellsPageBreaksDeleteHorizontalPageBreak) | **DELETE** /cells/{name}/worksheets/{sheetName}/horizontalpagebreaks/{index} | 
[**cellsPageBreaksDeleteHorizontalPageBreaks**](CellsPageBreaksApi.md#cellsPageBreaksDeleteHorizontalPageBreaks) | **DELETE** /cells/{name}/worksheets/{sheetName}/horizontalpagebreaks | 
[**cellsPageBreaksDeleteVerticalPageBreak**](CellsPageBreaksApi.md#cellsPageBreaksDeleteVerticalPageBreak) | **DELETE** /cells/{name}/worksheets/{sheetName}/verticalpagebreaks/{index} | 
[**cellsPageBreaksDeleteVerticalPageBreaks**](CellsPageBreaksApi.md#cellsPageBreaksDeleteVerticalPageBreaks) | **DELETE** /cells/{name}/worksheets/{sheetName}/verticalpagebreaks | 
[**cellsPageBreaksGetHorizontalPageBreak**](CellsPageBreaksApi.md#cellsPageBreaksGetHorizontalPageBreak) | **GET** /cells/{name}/worksheets/{sheetName}/horizontalpagebreaks/{index} | 
[**cellsPageBreaksGetHorizontalPageBreaks**](CellsPageBreaksApi.md#cellsPageBreaksGetHorizontalPageBreaks) | **GET** /cells/{name}/worksheets/{sheetName}/horizontalpagebreaks | 
[**cellsPageBreaksGetVerticalPageBreak**](CellsPageBreaksApi.md#cellsPageBreaksGetVerticalPageBreak) | **GET** /cells/{name}/worksheets/{sheetName}/verticalpagebreaks/{index} | 
[**cellsPageBreaksGetVerticalPageBreaks**](CellsPageBreaksApi.md#cellsPageBreaksGetVerticalPageBreaks) | **GET** /cells/{name}/worksheets/{sheetName}/verticalpagebreaks | 
[**cellsPageBreaksPutHorizontalPageBreak**](CellsPageBreaksApi.md#cellsPageBreaksPutHorizontalPageBreak) | **PUT** /cells/{name}/worksheets/{sheetName}/horizontalpagebreaks | 
[**cellsPageBreaksPutVerticalPageBreak**](CellsPageBreaksApi.md#cellsPageBreaksPutVerticalPageBreak) | **PUT** /cells/{name}/worksheets/{sheetName}/verticalpagebreaks | 


<a name="cellsPageBreaksDeleteHorizontalPageBreak"></a>
# **cellsPageBreaksDeleteHorizontalPageBreak**
> SaaSposeResponse cellsPageBreaksDeleteHorizontalPageBreak(name, sheetName, index, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPageBreaksApi;


CellsPageBreaksApi apiInstance = new CellsPageBreaksApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer index = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsPageBreaksDeleteHorizontalPageBreak(name, sheetName, index, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPageBreaksApi#cellsPageBreaksDeleteHorizontalPageBreak");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **index** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageBreaksDeleteHorizontalPageBreaks"></a>
# **cellsPageBreaksDeleteHorizontalPageBreaks**
> SaaSposeResponse cellsPageBreaksDeleteHorizontalPageBreaks(name, sheetName, row, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPageBreaksApi;


CellsPageBreaksApi apiInstance = new CellsPageBreaksApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer row = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsPageBreaksDeleteHorizontalPageBreaks(name, sheetName, row, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPageBreaksApi#cellsPageBreaksDeleteHorizontalPageBreaks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **row** | **Integer**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageBreaksDeleteVerticalPageBreak"></a>
# **cellsPageBreaksDeleteVerticalPageBreak**
> SaaSposeResponse cellsPageBreaksDeleteVerticalPageBreak(name, sheetName, index, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPageBreaksApi;


CellsPageBreaksApi apiInstance = new CellsPageBreaksApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer index = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsPageBreaksDeleteVerticalPageBreak(name, sheetName, index, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPageBreaksApi#cellsPageBreaksDeleteVerticalPageBreak");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **index** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageBreaksDeleteVerticalPageBreaks"></a>
# **cellsPageBreaksDeleteVerticalPageBreaks**
> SaaSposeResponse cellsPageBreaksDeleteVerticalPageBreaks(name, sheetName, column, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPageBreaksApi;


CellsPageBreaksApi apiInstance = new CellsPageBreaksApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer column = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsPageBreaksDeleteVerticalPageBreaks(name, sheetName, column, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPageBreaksApi#cellsPageBreaksDeleteVerticalPageBreaks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **column** | **Integer**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageBreaksGetHorizontalPageBreak"></a>
# **cellsPageBreaksGetHorizontalPageBreak**
> HorizontalPageBreakResponse cellsPageBreaksGetHorizontalPageBreak(name, sheetName, index, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPageBreaksApi;


CellsPageBreaksApi apiInstance = new CellsPageBreaksApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer index = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    HorizontalPageBreakResponse result = apiInstance.cellsPageBreaksGetHorizontalPageBreak(name, sheetName, index, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPageBreaksApi#cellsPageBreaksGetHorizontalPageBreak");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **index** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**HorizontalPageBreakResponse**](HorizontalPageBreakResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageBreaksGetHorizontalPageBreaks"></a>
# **cellsPageBreaksGetHorizontalPageBreaks**
> HorizontalPageBreaksResponse cellsPageBreaksGetHorizontalPageBreaks(name, sheetName, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPageBreaksApi;


CellsPageBreaksApi apiInstance = new CellsPageBreaksApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    HorizontalPageBreaksResponse result = apiInstance.cellsPageBreaksGetHorizontalPageBreaks(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPageBreaksApi#cellsPageBreaksGetHorizontalPageBreaks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**HorizontalPageBreaksResponse**](HorizontalPageBreaksResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageBreaksGetVerticalPageBreak"></a>
# **cellsPageBreaksGetVerticalPageBreak**
> VerticalPageBreakResponse cellsPageBreaksGetVerticalPageBreak(name, sheetName, index, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPageBreaksApi;


CellsPageBreaksApi apiInstance = new CellsPageBreaksApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer index = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    VerticalPageBreakResponse result = apiInstance.cellsPageBreaksGetVerticalPageBreak(name, sheetName, index, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPageBreaksApi#cellsPageBreaksGetVerticalPageBreak");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **index** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**VerticalPageBreakResponse**](VerticalPageBreakResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageBreaksGetVerticalPageBreaks"></a>
# **cellsPageBreaksGetVerticalPageBreaks**
> VerticalPageBreaksResponse cellsPageBreaksGetVerticalPageBreaks(name, sheetName, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPageBreaksApi;


CellsPageBreaksApi apiInstance = new CellsPageBreaksApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    VerticalPageBreaksResponse result = apiInstance.cellsPageBreaksGetVerticalPageBreaks(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPageBreaksApi#cellsPageBreaksGetVerticalPageBreaks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**VerticalPageBreaksResponse**](VerticalPageBreaksResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageBreaksPutHorizontalPageBreak"></a>
# **cellsPageBreaksPutHorizontalPageBreak**
> SaaSposeResponse cellsPageBreaksPutHorizontalPageBreak(name, sheetName, cellname, row, column, startColumn, endColumn, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPageBreaksApi;


CellsPageBreaksApi apiInstance = new CellsPageBreaksApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String cellname = "cellname_example"; // String | 
Integer row = 56; // Integer | 
Integer column = 56; // Integer | 
Integer startColumn = 56; // Integer | 
Integer endColumn = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsPageBreaksPutHorizontalPageBreak(name, sheetName, cellname, row, column, startColumn, endColumn, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPageBreaksApi#cellsPageBreaksPutHorizontalPageBreak");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **cellname** | **String**|  | [optional]
 **row** | **Integer**|  | [optional]
 **column** | **Integer**|  | [optional]
 **startColumn** | **Integer**|  | [optional]
 **endColumn** | **Integer**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageBreaksPutVerticalPageBreak"></a>
# **cellsPageBreaksPutVerticalPageBreak**
> SaaSposeResponse cellsPageBreaksPutVerticalPageBreak(name, sheetName, cellname, column, row, startRow, endRow, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPageBreaksApi;


CellsPageBreaksApi apiInstance = new CellsPageBreaksApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String cellname = "cellname_example"; // String | 
Integer column = 56; // Integer | 
Integer row = 56; // Integer | 
Integer startRow = 56; // Integer | 
Integer endRow = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsPageBreaksPutVerticalPageBreak(name, sheetName, cellname, column, row, startRow, endRow, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPageBreaksApi#cellsPageBreaksPutVerticalPageBreak");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **cellname** | **String**|  | [optional]
 **column** | **Integer**|  | [optional]
 **row** | **Integer**|  | [optional]
 **startRow** | **Integer**|  | [optional]
 **endRow** | **Integer**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

