# CellsChartAreaApi

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cellsChartAreaGetChartArea**](CellsChartAreaApi.md#cellsChartAreaGetChartArea) | **GET** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/chartArea | Get chart area info.
[**cellsChartAreaGetChartAreaBorder**](CellsChartAreaApi.md#cellsChartAreaGetChartAreaBorder) | **GET** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/chartArea/border | Get chart area border info.
[**cellsChartAreaGetChartAreaFillFormat**](CellsChartAreaApi.md#cellsChartAreaGetChartAreaFillFormat) | **GET** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/chartArea/fillFormat | Get chart area fill format info.


<a name="cellsChartAreaGetChartArea"></a>
# **cellsChartAreaGetChartArea**
> ChartAreaResponse cellsChartAreaGetChartArea(name, sheetName, chartIndex, folder)

Get chart area info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsChartAreaApi;


CellsChartAreaApi apiInstance = new CellsChartAreaApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartIndex = 56; // Integer | The chart index.
String folder = "folder_example"; // String | Workbook folder.
try {
    ChartAreaResponse result = apiInstance.cellsChartAreaGetChartArea(name, sheetName, chartIndex, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsChartAreaApi#cellsChartAreaGetChartArea");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **chartIndex** | **Integer**| The chart index. |
 **folder** | **String**| Workbook folder. | [optional]

### Return type

[**ChartAreaResponse**](ChartAreaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartAreaGetChartAreaBorder"></a>
# **cellsChartAreaGetChartAreaBorder**
> LineResponse cellsChartAreaGetChartAreaBorder(name, sheetName, chartIndex, folder)

Get chart area border info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsChartAreaApi;


CellsChartAreaApi apiInstance = new CellsChartAreaApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartIndex = 56; // Integer | The chart index.
String folder = "folder_example"; // String | Workbook folder.
try {
    LineResponse result = apiInstance.cellsChartAreaGetChartAreaBorder(name, sheetName, chartIndex, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsChartAreaApi#cellsChartAreaGetChartAreaBorder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **chartIndex** | **Integer**| The chart index. |
 **folder** | **String**| Workbook folder. | [optional]

### Return type

[**LineResponse**](LineResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartAreaGetChartAreaFillFormat"></a>
# **cellsChartAreaGetChartAreaFillFormat**
> FillFormatResponse cellsChartAreaGetChartAreaFillFormat(name, sheetName, chartIndex, folder)

Get chart area fill format info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsChartAreaApi;


CellsChartAreaApi apiInstance = new CellsChartAreaApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartIndex = 56; // Integer | The chart index.
String folder = "folder_example"; // String | Workbook folder.
try {
    FillFormatResponse result = apiInstance.cellsChartAreaGetChartAreaFillFormat(name, sheetName, chartIndex, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsChartAreaApi#cellsChartAreaGetChartAreaFillFormat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **chartIndex** | **Integer**| The chart index. |
 **folder** | **String**| Workbook folder. | [optional]

### Return type

[**FillFormatResponse**](FillFormatResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

