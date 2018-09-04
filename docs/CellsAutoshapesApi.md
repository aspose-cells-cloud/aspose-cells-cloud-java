# CellsAutoshapesApi

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cellsAutoshapesGetWorksheetAutoshape**](CellsAutoshapesApi.md#cellsAutoshapesGetWorksheetAutoshape) | **GET** /cells/{name}/worksheets/{sheetName}/autoshapes/{autoshapeNumber} | Get autoshape info.
[**cellsAutoshapesGetWorksheetAutoshapes**](CellsAutoshapesApi.md#cellsAutoshapesGetWorksheetAutoshapes) | **GET** /cells/{name}/worksheets/{sheetName}/autoshapes | Get worksheet autoshapes info.


<a name="cellsAutoshapesGetWorksheetAutoshape"></a>
# **cellsAutoshapesGetWorksheetAutoshape**
> File cellsAutoshapesGetWorksheetAutoshape(name, sheetName, autoshapeNumber, format, folder, storage)

Get autoshape info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsAutoshapesApi;


CellsAutoshapesApi apiInstance = new CellsAutoshapesApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer autoshapeNumber = 56; // Integer | The autoshape number.
String format = "format_example"; // String | Exported format.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    File result = apiInstance.cellsAutoshapesGetWorksheetAutoshape(name, sheetName, autoshapeNumber, format, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsAutoshapesApi#cellsAutoshapesGetWorksheetAutoshape");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **autoshapeNumber** | **Integer**| The autoshape number. |
 **format** | **String**| Exported format. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoshapesGetWorksheetAutoshapes"></a>
# **cellsAutoshapesGetWorksheetAutoshapes**
> AutoShapesResponse cellsAutoshapesGetWorksheetAutoshapes(name, sheetName, folder, storage)

Get worksheet autoshapes info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsAutoshapesApi;


CellsAutoshapesApi apiInstance = new CellsAutoshapesApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    AutoShapesResponse result = apiInstance.cellsAutoshapesGetWorksheetAutoshapes(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsAutoshapesApi#cellsAutoshapesGetWorksheetAutoshapes");
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

[**AutoShapesResponse**](AutoShapesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

