# CellsRangesApi

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cellsRangesGetWorksheetCellsRangeValue**](CellsRangesApi.md#cellsRangesGetWorksheetCellsRangeValue) | **GET** /cells/{name}/worksheets/{sheetName}/ranges/value | Get cells list in a range by range name or row column indexes  
[**cellsRangesPostWorksheetCellsRangeColumnWidth**](CellsRangesApi.md#cellsRangesPostWorksheetCellsRangeColumnWidth) | **POST** /cells/{name}/worksheets/{sheetName}/ranges/columnWidth | Set column width of range
[**cellsRangesPostWorksheetCellsRangeMerge**](CellsRangesApi.md#cellsRangesPostWorksheetCellsRangeMerge) | **POST** /cells/{name}/worksheets/{sheetName}/ranges/merge | Combines a range of cells into a single cell.              
[**cellsRangesPostWorksheetCellsRangeMoveTo**](CellsRangesApi.md#cellsRangesPostWorksheetCellsRangeMoveTo) | **POST** /cells/{name}/worksheets/{sheetName}/ranges/moveto | Move the current range to the dest range.             
[**cellsRangesPostWorksheetCellsRangeOutlineBorder**](CellsRangesApi.md#cellsRangesPostWorksheetCellsRangeOutlineBorder) | **POST** /cells/{name}/worksheets/{sheetName}/ranges/outlineBorder | Sets outline border around a range of cells.
[**cellsRangesPostWorksheetCellsRangeRowHeight**](CellsRangesApi.md#cellsRangesPostWorksheetCellsRangeRowHeight) | **POST** /cells/{name}/worksheets/{sheetName}/ranges/rowHeight | set row height of range
[**cellsRangesPostWorksheetCellsRangeStyle**](CellsRangesApi.md#cellsRangesPostWorksheetCellsRangeStyle) | **POST** /cells/{name}/worksheets/{sheetName}/ranges/style | Sets the style of the range.             
[**cellsRangesPostWorksheetCellsRangeUnmerge**](CellsRangesApi.md#cellsRangesPostWorksheetCellsRangeUnmerge) | **POST** /cells/{name}/worksheets/{sheetName}/ranges/unmerge | Unmerges merged cells of this range.             
[**cellsRangesPostWorksheetCellsRangeValue**](CellsRangesApi.md#cellsRangesPostWorksheetCellsRangeValue) | **POST** /cells/{name}/worksheets/{sheetName}/ranges/value | Puts a value into the range, if appropriate the value will be converted to other data type and cell&#39;s number format will be reset.             
[**cellsRangesPostWorksheetCellsRanges**](CellsRangesApi.md#cellsRangesPostWorksheetCellsRanges) | **POST** /cells/{name}/worksheets/{sheetName}/ranges | copy range in the worksheet


<a name="cellsRangesGetWorksheetCellsRangeValue"></a>
# **cellsRangesGetWorksheetCellsRangeValue**
> RangeValueResponse cellsRangesGetWorksheetCellsRangeValue(name, sheetName, namerange, firstRow, firstColumn, rowCount, columnCount, folder)

Get cells list in a range by range name or row column indexes  

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsRangesApi;


CellsRangesApi apiInstance = new CellsRangesApi();
String name = "name_example"; // String | workbook name
String sheetName = "sheetName_example"; // String | worksheet name
String namerange = "namerange_example"; // String | range name, for example: 'A1:B2' or 'range_name1'
Integer firstRow = 56; // Integer | the first row of the range
Integer firstColumn = 56; // Integer | the first column of the range
Integer rowCount = 56; // Integer | the count of rows in the range
Integer columnCount = 56; // Integer | the count of columns in the range
String folder = "folder_example"; // String | Workbook folder.
try {
    RangeValueResponse result = apiInstance.cellsRangesGetWorksheetCellsRangeValue(name, sheetName, namerange, firstRow, firstColumn, rowCount, columnCount, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsRangesApi#cellsRangesGetWorksheetCellsRangeValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| workbook name |
 **sheetName** | **String**| worksheet name |
 **namerange** | **String**| range name, for example: &#39;A1:B2&#39; or &#39;range_name1&#39; | [optional]
 **firstRow** | **Integer**| the first row of the range | [optional]
 **firstColumn** | **Integer**| the first column of the range | [optional]
 **rowCount** | **Integer**| the count of rows in the range | [optional]
 **columnCount** | **Integer**| the count of columns in the range | [optional]
 **folder** | **String**| Workbook folder. | [optional]

### Return type

[**RangeValueResponse**](RangeValueResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsRangesPostWorksheetCellsRangeColumnWidth"></a>
# **cellsRangesPostWorksheetCellsRangeColumnWidth**
> SaaSposeResponse cellsRangesPostWorksheetCellsRangeColumnWidth(name, sheetName, value, range, folder)

Set column width of range

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsRangesApi;


CellsRangesApi apiInstance = new CellsRangesApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Double value = 3.4D; // Double | 
Range range = new Range(); // Range | 
String folder = "folder_example"; // String | 
try {
    SaaSposeResponse result = apiInstance.cellsRangesPostWorksheetCellsRangeColumnWidth(name, sheetName, value, range, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsRangesApi#cellsRangesPostWorksheetCellsRangeColumnWidth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **value** | **Double**|  |
 **range** | [**Range**](Range.md)|  | [optional]
 **folder** | **String**|  | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsRangesPostWorksheetCellsRangeMerge"></a>
# **cellsRangesPostWorksheetCellsRangeMerge**
> SaaSposeResponse cellsRangesPostWorksheetCellsRangeMerge(name, sheetName, range, folder)

Combines a range of cells into a single cell.              

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsRangesApi;


CellsRangesApi apiInstance = new CellsRangesApi();
String name = "name_example"; // String | workbook name
String sheetName = "sheetName_example"; // String | worksheet name
Range range = new Range(); // Range | range in worksheet 
String folder = "folder_example"; // String | Workbook folder.
try {
    SaaSposeResponse result = apiInstance.cellsRangesPostWorksheetCellsRangeMerge(name, sheetName, range, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsRangesApi#cellsRangesPostWorksheetCellsRangeMerge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| workbook name |
 **sheetName** | **String**| worksheet name |
 **range** | [**Range**](Range.md)| range in worksheet  | [optional]
 **folder** | **String**| Workbook folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsRangesPostWorksheetCellsRangeMoveTo"></a>
# **cellsRangesPostWorksheetCellsRangeMoveTo**
> SaaSposeResponse cellsRangesPostWorksheetCellsRangeMoveTo(name, sheetName, destRow, destColumn, range, folder)

Move the current range to the dest range.             

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsRangesApi;


CellsRangesApi apiInstance = new CellsRangesApi();
String name = "name_example"; // String | workbook name
String sheetName = "sheetName_example"; // String | worksheet name
Integer destRow = 56; // Integer | The start row of the dest range.
Integer destColumn = 56; // Integer | The start column of the dest range.
Range range = new Range(); // Range | range in worksheet 
String folder = "folder_example"; // String | Workbook folder.
try {
    SaaSposeResponse result = apiInstance.cellsRangesPostWorksheetCellsRangeMoveTo(name, sheetName, destRow, destColumn, range, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsRangesApi#cellsRangesPostWorksheetCellsRangeMoveTo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| workbook name |
 **sheetName** | **String**| worksheet name |
 **destRow** | **Integer**| The start row of the dest range. |
 **destColumn** | **Integer**| The start column of the dest range. |
 **range** | [**Range**](Range.md)| range in worksheet  | [optional]
 **folder** | **String**| Workbook folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsRangesPostWorksheetCellsRangeOutlineBorder"></a>
# **cellsRangesPostWorksheetCellsRangeOutlineBorder**
> SaaSposeResponse cellsRangesPostWorksheetCellsRangeOutlineBorder(name, sheetName, rangeOperate, folder)

Sets outline border around a range of cells.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsRangesApi;


CellsRangesApi apiInstance = new CellsRangesApi();
String name = "name_example"; // String | workbook name
String sheetName = "sheetName_example"; // String | worksheet name
RangeSetOutlineBorderRequest rangeOperate = new RangeSetOutlineBorderRequest(); // RangeSetOutlineBorderRequest | Range Set OutlineBorder Request 
String folder = "folder_example"; // String | Workbook folder.
try {
    SaaSposeResponse result = apiInstance.cellsRangesPostWorksheetCellsRangeOutlineBorder(name, sheetName, rangeOperate, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsRangesApi#cellsRangesPostWorksheetCellsRangeOutlineBorder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| workbook name |
 **sheetName** | **String**| worksheet name |
 **rangeOperate** | [**RangeSetOutlineBorderRequest**](RangeSetOutlineBorderRequest.md)| Range Set OutlineBorder Request  | [optional]
 **folder** | **String**| Workbook folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsRangesPostWorksheetCellsRangeRowHeight"></a>
# **cellsRangesPostWorksheetCellsRangeRowHeight**
> SaaSposeResponse cellsRangesPostWorksheetCellsRangeRowHeight(name, sheetName, value, range, folder)

set row height of range

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsRangesApi;


CellsRangesApi apiInstance = new CellsRangesApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Double value = 3.4D; // Double | 
Range range = new Range(); // Range | 
String folder = "folder_example"; // String | 
try {
    SaaSposeResponse result = apiInstance.cellsRangesPostWorksheetCellsRangeRowHeight(name, sheetName, value, range, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsRangesApi#cellsRangesPostWorksheetCellsRangeRowHeight");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **value** | **Double**|  |
 **range** | [**Range**](Range.md)|  | [optional]
 **folder** | **String**|  | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsRangesPostWorksheetCellsRangeStyle"></a>
# **cellsRangesPostWorksheetCellsRangeStyle**
> SaaSposeResponse cellsRangesPostWorksheetCellsRangeStyle(name, sheetName, rangeOperate, folder)

Sets the style of the range.             

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsRangesApi;


CellsRangesApi apiInstance = new CellsRangesApi();
String name = "name_example"; // String | workbook name
String sheetName = "sheetName_example"; // String | worksheet name
RangeSetStyleRequest rangeOperate = new RangeSetStyleRequest(); // RangeSetStyleRequest | Range Set Style Request 
String folder = "folder_example"; // String | Workbook folder.
try {
    SaaSposeResponse result = apiInstance.cellsRangesPostWorksheetCellsRangeStyle(name, sheetName, rangeOperate, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsRangesApi#cellsRangesPostWorksheetCellsRangeStyle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| workbook name |
 **sheetName** | **String**| worksheet name |
 **rangeOperate** | [**RangeSetStyleRequest**](RangeSetStyleRequest.md)| Range Set Style Request  | [optional]
 **folder** | **String**| Workbook folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsRangesPostWorksheetCellsRangeUnmerge"></a>
# **cellsRangesPostWorksheetCellsRangeUnmerge**
> SaaSposeResponse cellsRangesPostWorksheetCellsRangeUnmerge(name, sheetName, range, folder)

Unmerges merged cells of this range.             

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsRangesApi;


CellsRangesApi apiInstance = new CellsRangesApi();
String name = "name_example"; // String | workbook name
String sheetName = "sheetName_example"; // String | worksheet name
Range range = new Range(); // Range | range in worksheet 
String folder = "folder_example"; // String | Workbook folder.
try {
    SaaSposeResponse result = apiInstance.cellsRangesPostWorksheetCellsRangeUnmerge(name, sheetName, range, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsRangesApi#cellsRangesPostWorksheetCellsRangeUnmerge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| workbook name |
 **sheetName** | **String**| worksheet name |
 **range** | [**Range**](Range.md)| range in worksheet  | [optional]
 **folder** | **String**| Workbook folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsRangesPostWorksheetCellsRangeValue"></a>
# **cellsRangesPostWorksheetCellsRangeValue**
> SaaSposeResponse cellsRangesPostWorksheetCellsRangeValue(name, sheetName, value, range, isConverted, setStyle, folder)

Puts a value into the range, if appropriate the value will be converted to other data type and cell&#39;s number format will be reset.             

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsRangesApi;


CellsRangesApi apiInstance = new CellsRangesApi();
String name = "name_example"; // String | workbook name
String sheetName = "sheetName_example"; // String | worksheet name
String value = "value_example"; // String | Input value
Range range = new Range(); // Range | range in worksheet 
Boolean isConverted = false; // Boolean | True: converted to other data type if appropriate.
Boolean setStyle = false; // Boolean | True: set the number format to cell's style when converting to other data type
String folder = "folder_example"; // String | Workbook folder.
try {
    SaaSposeResponse result = apiInstance.cellsRangesPostWorksheetCellsRangeValue(name, sheetName, value, range, isConverted, setStyle, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsRangesApi#cellsRangesPostWorksheetCellsRangeValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| workbook name |
 **sheetName** | **String**| worksheet name |
 **value** | **String**| Input value |
 **range** | [**Range**](Range.md)| range in worksheet  | [optional]
 **isConverted** | **Boolean**| True: converted to other data type if appropriate. | [optional] [default to false]
 **setStyle** | **Boolean**| True: set the number format to cell&#39;s style when converting to other data type | [optional] [default to false]
 **folder** | **String**| Workbook folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsRangesPostWorksheetCellsRanges"></a>
# **cellsRangesPostWorksheetCellsRanges**
> SaaSposeResponse cellsRangesPostWorksheetCellsRanges(name, sheetName, rangeOperate, folder)

copy range in the worksheet

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsRangesApi;


CellsRangesApi apiInstance = new CellsRangesApi();
String name = "name_example"; // String | workbook name
String sheetName = "sheetName_example"; // String | worksheet name
RangeCopyRequest rangeOperate = new RangeCopyRequest(); // RangeCopyRequest | copydata,copystyle,copyto,copyvalue
String folder = "folder_example"; // String | Workbook folder.
try {
    SaaSposeResponse result = apiInstance.cellsRangesPostWorksheetCellsRanges(name, sheetName, rangeOperate, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsRangesApi#cellsRangesPostWorksheetCellsRanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| workbook name |
 **sheetName** | **String**| worksheet name |
 **rangeOperate** | [**RangeCopyRequest**](RangeCopyRequest.md)| copydata,copystyle,copyto,copyvalue | [optional]
 **folder** | **String**| Workbook folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

