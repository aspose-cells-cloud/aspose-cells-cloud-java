# CellsListObjectsApi

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cellsListObjectsDeleteWorksheetListObject**](CellsListObjectsApi.md#cellsListObjectsDeleteWorksheetListObject) | **DELETE** /cells/{name}/worksheets/{sheetName}/listobjects/{listObjectIndex} | Delete worksheet list object by index
[**cellsListObjectsDeleteWorksheetListObjects**](CellsListObjectsApi.md#cellsListObjectsDeleteWorksheetListObjects) | **DELETE** /cells/{name}/worksheets/{sheetName}/listobjects | Delete worksheet list objects
[**cellsListObjectsGetWorksheetListObject**](CellsListObjectsApi.md#cellsListObjectsGetWorksheetListObject) | **GET** /cells/{name}/worksheets/{sheetName}/listobjects/{listobjectindex} | Get worksheet list object info by index.
[**cellsListObjectsGetWorksheetListObjects**](CellsListObjectsApi.md#cellsListObjectsGetWorksheetListObjects) | **GET** /cells/{name}/worksheets/{sheetName}/listobjects | Get worksheet listobjects info.
[**cellsListObjectsPostWorksheetListObject**](CellsListObjectsApi.md#cellsListObjectsPostWorksheetListObject) | **POST** /cells/{name}/worksheets/{sheetName}/listobjects/{listObjectIndex} | Update  list object 
[**cellsListObjectsPostWorksheetListObjectConvertToRange**](CellsListObjectsApi.md#cellsListObjectsPostWorksheetListObjectConvertToRange) | **POST** /cells/{name}/worksheets/{sheetName}/listobjects/{listObjectIndex}/ConvertToRange | 
[**cellsListObjectsPostWorksheetListObjectSortTable**](CellsListObjectsApi.md#cellsListObjectsPostWorksheetListObjectSortTable) | **POST** /cells/{name}/worksheets/{sheetName}/listobjects/{listObjectIndex}/sort | 
[**cellsListObjectsPostWorksheetListObjectSummarizeWithPivotTable**](CellsListObjectsApi.md#cellsListObjectsPostWorksheetListObjectSummarizeWithPivotTable) | **POST** /cells/{name}/worksheets/{sheetName}/listobjects/{listObjectIndex}/SummarizeWithPivotTable | 
[**cellsListObjectsPutWorksheetListObject**](CellsListObjectsApi.md#cellsListObjectsPutWorksheetListObject) | **PUT** /cells/{name}/worksheets/{sheetName}/listobjects | Add a list object into worksheet.


<a name="cellsListObjectsDeleteWorksheetListObject"></a>
# **cellsListObjectsDeleteWorksheetListObject**
> SaaSposeResponse cellsListObjectsDeleteWorksheetListObject(name, sheetName, listObjectIndex, folder)

Delete worksheet list object by index

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsListObjectsApi;


CellsListObjectsApi apiInstance = new CellsListObjectsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer listObjectIndex = 56; // Integer | List object index
String folder = "folder_example"; // String | Document's folder.
try {
    SaaSposeResponse result = apiInstance.cellsListObjectsDeleteWorksheetListObject(name, sheetName, listObjectIndex, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsListObjectsApi#cellsListObjectsDeleteWorksheetListObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **listObjectIndex** | **Integer**| List object index |
 **folder** | **String**| Document&#39;s folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsListObjectsDeleteWorksheetListObjects"></a>
# **cellsListObjectsDeleteWorksheetListObjects**
> SaaSposeResponse cellsListObjectsDeleteWorksheetListObjects(name, sheetName, folder)

Delete worksheet list objects

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsListObjectsApi;


CellsListObjectsApi apiInstance = new CellsListObjectsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | Document's folder.
try {
    SaaSposeResponse result = apiInstance.cellsListObjectsDeleteWorksheetListObjects(name, sheetName, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsListObjectsApi#cellsListObjectsDeleteWorksheetListObjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **folder** | **String**| Document&#39;s folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsListObjectsGetWorksheetListObject"></a>
# **cellsListObjectsGetWorksheetListObject**
> ListObjectResponse cellsListObjectsGetWorksheetListObject(name, sheetName, listobjectindex, folder)

Get worksheet list object info by index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsListObjectsApi;


CellsListObjectsApi apiInstance = new CellsListObjectsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer listobjectindex = 56; // Integer | list object index.
String folder = "folder_example"; // String | Document's folder.
try {
    ListObjectResponse result = apiInstance.cellsListObjectsGetWorksheetListObject(name, sheetName, listobjectindex, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsListObjectsApi#cellsListObjectsGetWorksheetListObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **listobjectindex** | **Integer**| list object index. |
 **folder** | **String**| Document&#39;s folder. | [optional]

### Return type

[**ListObjectResponse**](ListObjectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsListObjectsGetWorksheetListObjects"></a>
# **cellsListObjectsGetWorksheetListObjects**
> ListObjectsResponse cellsListObjectsGetWorksheetListObjects(name, sheetName, folder)

Get worksheet listobjects info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsListObjectsApi;


CellsListObjectsApi apiInstance = new CellsListObjectsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | Document's folder.
try {
    ListObjectsResponse result = apiInstance.cellsListObjectsGetWorksheetListObjects(name, sheetName, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsListObjectsApi#cellsListObjectsGetWorksheetListObjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **folder** | **String**| Document&#39;s folder. | [optional]

### Return type

[**ListObjectsResponse**](ListObjectsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsListObjectsPostWorksheetListObject"></a>
# **cellsListObjectsPostWorksheetListObject**
> SaaSposeResponse cellsListObjectsPostWorksheetListObject(name, sheetName, listObjectIndex, listObject, folder)

Update  list object 

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsListObjectsApi;


CellsListObjectsApi apiInstance = new CellsListObjectsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer listObjectIndex = 56; // Integer | list Object index
ListObject listObject = new ListObject(); // ListObject | listObject dto in request body.
String folder = "folder_example"; // String | Document's folder.
try {
    SaaSposeResponse result = apiInstance.cellsListObjectsPostWorksheetListObject(name, sheetName, listObjectIndex, listObject, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsListObjectsApi#cellsListObjectsPostWorksheetListObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **listObjectIndex** | **Integer**| list Object index |
 **listObject** | [**ListObject**](ListObject.md)| listObject dto in request body. | [optional]
 **folder** | **String**| Document&#39;s folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsListObjectsPostWorksheetListObjectConvertToRange"></a>
# **cellsListObjectsPostWorksheetListObjectConvertToRange**
> SaaSposeResponse cellsListObjectsPostWorksheetListObjectConvertToRange(name, sheetName, listObjectIndex, folder)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsListObjectsApi;


CellsListObjectsApi apiInstance = new CellsListObjectsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer listObjectIndex = 56; // Integer | 
String folder = "folder_example"; // String | 
try {
    SaaSposeResponse result = apiInstance.cellsListObjectsPostWorksheetListObjectConvertToRange(name, sheetName, listObjectIndex, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsListObjectsApi#cellsListObjectsPostWorksheetListObjectConvertToRange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **listObjectIndex** | **Integer**|  |
 **folder** | **String**|  | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsListObjectsPostWorksheetListObjectSortTable"></a>
# **cellsListObjectsPostWorksheetListObjectSortTable**
> SaaSposeResponse cellsListObjectsPostWorksheetListObjectSortTable(name, sheetName, listObjectIndex, dataSorter, folder)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsListObjectsApi;


CellsListObjectsApi apiInstance = new CellsListObjectsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer listObjectIndex = 56; // Integer | 
DataSorter dataSorter = new DataSorter(); // DataSorter | 
String folder = "folder_example"; // String | 
try {
    SaaSposeResponse result = apiInstance.cellsListObjectsPostWorksheetListObjectSortTable(name, sheetName, listObjectIndex, dataSorter, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsListObjectsApi#cellsListObjectsPostWorksheetListObjectSortTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **listObjectIndex** | **Integer**|  |
 **dataSorter** | [**DataSorter**](DataSorter.md)|  | [optional]
 **folder** | **String**|  | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsListObjectsPostWorksheetListObjectSummarizeWithPivotTable"></a>
# **cellsListObjectsPostWorksheetListObjectSummarizeWithPivotTable**
> SaaSposeResponse cellsListObjectsPostWorksheetListObjectSummarizeWithPivotTable(name, sheetName, listObjectIndex, destsheetName, request, folder)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsListObjectsApi;


CellsListObjectsApi apiInstance = new CellsListObjectsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer listObjectIndex = 56; // Integer | 
String destsheetName = "destsheetName_example"; // String | 
CreatePivotTableRequest request = new CreatePivotTableRequest(); // CreatePivotTableRequest | 
String folder = "folder_example"; // String | 
try {
    SaaSposeResponse result = apiInstance.cellsListObjectsPostWorksheetListObjectSummarizeWithPivotTable(name, sheetName, listObjectIndex, destsheetName, request, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsListObjectsApi#cellsListObjectsPostWorksheetListObjectSummarizeWithPivotTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **listObjectIndex** | **Integer**|  |
 **destsheetName** | **String**|  |
 **request** | [**CreatePivotTableRequest**](CreatePivotTableRequest.md)|  | [optional]
 **folder** | **String**|  | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsListObjectsPutWorksheetListObject"></a>
# **cellsListObjectsPutWorksheetListObject**
> ListObjectResponse cellsListObjectsPutWorksheetListObject(name, sheetName, startRow, startColumn, endRow, endColumn, folder, hasHeaders)

Add a list object into worksheet.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsListObjectsApi;


CellsListObjectsApi apiInstance = new CellsListObjectsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer startRow = 56; // Integer | The start row of the list range.
Integer startColumn = 56; // Integer | The start row of the list range.
Integer endRow = 56; // Integer | The start row of the list range.
Integer endColumn = 56; // Integer | The start row of the list range.
String folder = "folder_example"; // String | Document's folder.
Boolean hasHeaders = true; // Boolean | Whether the range has headers.
try {
    ListObjectResponse result = apiInstance.cellsListObjectsPutWorksheetListObject(name, sheetName, startRow, startColumn, endRow, endColumn, folder, hasHeaders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsListObjectsApi#cellsListObjectsPutWorksheetListObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **startRow** | **Integer**| The start row of the list range. |
 **startColumn** | **Integer**| The start row of the list range. |
 **endRow** | **Integer**| The start row of the list range. |
 **endColumn** | **Integer**| The start row of the list range. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **hasHeaders** | **Boolean**| Whether the range has headers. | [optional] [default to true]

### Return type

[**ListObjectResponse**](ListObjectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

