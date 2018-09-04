# CellsOleObjectsApi

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cellsOleObjectsDeleteWorksheetOleObject**](CellsOleObjectsApi.md#cellsOleObjectsDeleteWorksheetOleObject) | **DELETE** /cells/{name}/worksheets/{sheetName}/oleobjects/{oleObjectIndex} | Delete OLE object.
[**cellsOleObjectsDeleteWorksheetOleObjects**](CellsOleObjectsApi.md#cellsOleObjectsDeleteWorksheetOleObjects) | **DELETE** /cells/{name}/worksheets/{sheetName}/oleobjects | Delete all OLE objects.
[**cellsOleObjectsGetWorksheetOleObject**](CellsOleObjectsApi.md#cellsOleObjectsGetWorksheetOleObject) | **GET** /cells/{name}/worksheets/{sheetName}/oleobjects/{objectNumber} | Get OLE object info.
[**cellsOleObjectsGetWorksheetOleObjects**](CellsOleObjectsApi.md#cellsOleObjectsGetWorksheetOleObjects) | **GET** /cells/{name}/worksheets/{sheetName}/oleobjects | Get worksheet OLE objects info.
[**cellsOleObjectsPostUpdateWorksheetOleObject**](CellsOleObjectsApi.md#cellsOleObjectsPostUpdateWorksheetOleObject) | **POST** /cells/{name}/worksheets/{sheetName}/oleobjects/{oleObjectIndex} | Update OLE object.
[**cellsOleObjectsPutWorksheetOleObject**](CellsOleObjectsApi.md#cellsOleObjectsPutWorksheetOleObject) | **PUT** /cells/{name}/worksheets/{sheetName}/oleobjects | Add OLE object


<a name="cellsOleObjectsDeleteWorksheetOleObject"></a>
# **cellsOleObjectsDeleteWorksheetOleObject**
> SaaSposeResponse cellsOleObjectsDeleteWorksheetOleObject(name, sheetName, oleObjectIndex, folder, storage)

Delete OLE object.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsOleObjectsApi;


CellsOleObjectsApi apiInstance = new CellsOleObjectsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worsheet name.
Integer oleObjectIndex = 56; // Integer | Ole object index
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsOleObjectsDeleteWorksheetOleObject(name, sheetName, oleObjectIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsOleObjectsApi#cellsOleObjectsDeleteWorksheetOleObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worsheet name. |
 **oleObjectIndex** | **Integer**| Ole object index |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsOleObjectsDeleteWorksheetOleObjects"></a>
# **cellsOleObjectsDeleteWorksheetOleObjects**
> SaaSposeResponse cellsOleObjectsDeleteWorksheetOleObjects(name, sheetName, folder, storage)

Delete all OLE objects.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsOleObjectsApi;


CellsOleObjectsApi apiInstance = new CellsOleObjectsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worsheet name.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsOleObjectsDeleteWorksheetOleObjects(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsOleObjectsApi#cellsOleObjectsDeleteWorksheetOleObjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worsheet name. |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsOleObjectsGetWorksheetOleObject"></a>
# **cellsOleObjectsGetWorksheetOleObject**
> File cellsOleObjectsGetWorksheetOleObject(name, sheetName, objectNumber, folder, storage)

Get OLE object info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsOleObjectsApi;


CellsOleObjectsApi apiInstance = new CellsOleObjectsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer objectNumber = 56; // Integer | The object number.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    File result = apiInstance.cellsOleObjectsGetWorksheetOleObject(name, sheetName, objectNumber, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsOleObjectsApi#cellsOleObjectsGetWorksheetOleObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **objectNumber** | **Integer**| The object number. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsOleObjectsGetWorksheetOleObjects"></a>
# **cellsOleObjectsGetWorksheetOleObjects**
> OleObjectsResponse cellsOleObjectsGetWorksheetOleObjects(name, sheetName, folder, storage)

Get worksheet OLE objects info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsOleObjectsApi;


CellsOleObjectsApi apiInstance = new CellsOleObjectsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    OleObjectsResponse result = apiInstance.cellsOleObjectsGetWorksheetOleObjects(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsOleObjectsApi#cellsOleObjectsGetWorksheetOleObjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**OleObjectsResponse**](OleObjectsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsOleObjectsPostUpdateWorksheetOleObject"></a>
# **cellsOleObjectsPostUpdateWorksheetOleObject**
> SaaSposeResponse cellsOleObjectsPostUpdateWorksheetOleObject(name, sheetName, oleObjectIndex, ole, folder, storage)

Update OLE object.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsOleObjectsApi;


CellsOleObjectsApi apiInstance = new CellsOleObjectsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worsheet name.
Integer oleObjectIndex = 56; // Integer | Ole object index
OleObject ole = new OleObject(); // OleObject | Ole Object
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsOleObjectsPostUpdateWorksheetOleObject(name, sheetName, oleObjectIndex, ole, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsOleObjectsApi#cellsOleObjectsPostUpdateWorksheetOleObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worsheet name. |
 **oleObjectIndex** | **Integer**| Ole object index |
 **ole** | [**OleObject**](OleObject.md)| Ole Object | [optional]
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsOleObjectsPutWorksheetOleObject"></a>
# **cellsOleObjectsPutWorksheetOleObject**
> OleObjectResponse cellsOleObjectsPutWorksheetOleObject(name, sheetName, oleObject, upperLeftRow, upperLeftColumn, height, width, oleFile, imageFile, folder, storage)

Add OLE object

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsOleObjectsApi;


CellsOleObjectsApi apiInstance = new CellsOleObjectsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worsheet name.
OleObject oleObject = new OleObject(); // OleObject | Ole Object
Integer upperLeftRow = 0; // Integer | Upper left row index
Integer upperLeftColumn = 0; // Integer | Upper left column index
Integer height = 0; // Integer | Height of oleObject, in unit of pixel
Integer width = 0; // Integer | Width of oleObject, in unit of pixel
String oleFile = "oleFile_example"; // String | OLE filename
String imageFile = "imageFile_example"; // String | Image filename
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    OleObjectResponse result = apiInstance.cellsOleObjectsPutWorksheetOleObject(name, sheetName, oleObject, upperLeftRow, upperLeftColumn, height, width, oleFile, imageFile, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsOleObjectsApi#cellsOleObjectsPutWorksheetOleObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worsheet name. |
 **oleObject** | [**OleObject**](OleObject.md)| Ole Object | [optional]
 **upperLeftRow** | **Integer**| Upper left row index | [optional] [default to 0]
 **upperLeftColumn** | **Integer**| Upper left column index | [optional] [default to 0]
 **height** | **Integer**| Height of oleObject, in unit of pixel | [optional] [default to 0]
 **width** | **Integer**| Width of oleObject, in unit of pixel | [optional] [default to 0]
 **oleFile** | **String**| OLE filename | [optional]
 **imageFile** | **String**| Image filename | [optional]
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**OleObjectResponse**](OleObjectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

