# CellsApi

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cellsDeleteWorksheetColumns**](CellsApi.md#cellsDeleteWorksheetColumns) | **DELETE** /cells/{name}/worksheets/{sheetName}/cells/columns/{columnIndex} | Delete worksheet columns.
[**cellsDeleteWorksheetRow**](CellsApi.md#cellsDeleteWorksheetRow) | **DELETE** /cells/{name}/worksheets/{sheetName}/cells/rows/{rowIndex} | Delete worksheet row.
[**cellsDeleteWorksheetRows**](CellsApi.md#cellsDeleteWorksheetRows) | **DELETE** /cells/{name}/worksheets/{sheetName}/cells/rows | Delete several worksheet rows.
[**cellsGetWorksheetCell**](CellsApi.md#cellsGetWorksheetCell) | **GET** /cells/{name}/worksheets/{sheetName}/cells/{cellOrMethodName} | Read cell data by cell&#39;s name.
[**cellsGetWorksheetCellStyle**](CellsApi.md#cellsGetWorksheetCellStyle) | **GET** /cells/{name}/worksheets/{sheetName}/cells/{cellName}/style | Read cell&#39;s style info.
[**cellsGetWorksheetCells**](CellsApi.md#cellsGetWorksheetCells) | **GET** /cells/{name}/worksheets/{sheetName}/cells | Get cells info.
[**cellsGetWorksheetColumn**](CellsApi.md#cellsGetWorksheetColumn) | **GET** /cells/{name}/worksheets/{sheetName}/cells/columns/{columnIndex} | Read worksheet column data by column&#39;s index.
[**cellsGetWorksheetColumns**](CellsApi.md#cellsGetWorksheetColumns) | **GET** /cells/{name}/worksheets/{sheetName}/cells/columns | Read worksheet columns info.
[**cellsGetWorksheetRow**](CellsApi.md#cellsGetWorksheetRow) | **GET** /cells/{name}/worksheets/{sheetName}/cells/rows/{rowIndex} | Read worksheet row data by row&#39;s index.
[**cellsGetWorksheetRows**](CellsApi.md#cellsGetWorksheetRows) | **GET** /cells/{name}/worksheets/{sheetName}/cells/rows | Read worksheet rows info.
[**cellsPostCellCalculate**](CellsApi.md#cellsPostCellCalculate) | **POST** /cells/{name}/worksheets/{sheetName}/cells/{cellName}/calculate | Cell calculate formula
[**cellsPostCellCharacters**](CellsApi.md#cellsPostCellCharacters) | **POST** /cells/{name}/worksheets/{sheetName}/cells/{cellName}/characters | Set cell characters 
[**cellsPostClearContents**](CellsApi.md#cellsPostClearContents) | **POST** /cells/{name}/worksheets/{sheetName}/cells/clearcontents | Clear cells contents.
[**cellsPostClearFormats**](CellsApi.md#cellsPostClearFormats) | **POST** /cells/{name}/worksheets/{sheetName}/cells/clearformats | Clear cells contents.
[**cellsPostColumnStyle**](CellsApi.md#cellsPostColumnStyle) | **POST** /cells/{name}/worksheets/{sheetName}/cells/columns/{columnIndex}/style | Set column style
[**cellsPostCopyCellIntoCell**](CellsApi.md#cellsPostCopyCellIntoCell) | **POST** /cells/{name}/worksheets/{sheetName}/cells/{destCellName}/copy | Copy cell into cell
[**cellsPostCopyWorksheetColumns**](CellsApi.md#cellsPostCopyWorksheetColumns) | **POST** /cells/{name}/worksheets/{sheetName}/cells/columns/copy | Copy worksheet columns.
[**cellsPostCopyWorksheetRows**](CellsApi.md#cellsPostCopyWorksheetRows) | **POST** /cells/{name}/worksheets/{sheetName}/cells/rows/copy | Copy worksheet rows.
[**cellsPostGroupWorksheetColumns**](CellsApi.md#cellsPostGroupWorksheetColumns) | **POST** /cells/{name}/worksheets/{sheetName}/cells/columns/group | Group worksheet columns.
[**cellsPostGroupWorksheetRows**](CellsApi.md#cellsPostGroupWorksheetRows) | **POST** /cells/{name}/worksheets/{sheetName}/cells/rows/group | Group worksheet rows.
[**cellsPostHideWorksheetColumns**](CellsApi.md#cellsPostHideWorksheetColumns) | **POST** /cells/{name}/worksheets/{sheetName}/cells/columns/hide | Hide worksheet columns.
[**cellsPostHideWorksheetRows**](CellsApi.md#cellsPostHideWorksheetRows) | **POST** /cells/{name}/worksheets/{sheetName}/cells/rows/hide | Hide worksheet rows.
[**cellsPostRowStyle**](CellsApi.md#cellsPostRowStyle) | **POST** /cells/{name}/worksheets/{sheetName}/cells/rows/{rowIndex}/style | Set row style.
[**cellsPostSetCellHtmlString**](CellsApi.md#cellsPostSetCellHtmlString) | **POST** /cells/{name}/worksheets/{sheetName}/cells/{cellName}/htmlstring | Set htmlstring value into cell
[**cellsPostSetCellRangeValue**](CellsApi.md#cellsPostSetCellRangeValue) | **POST** /cells/{name}/worksheets/{sheetName}/cells | Set cell range value 
[**cellsPostSetWorksheetColumnWidth**](CellsApi.md#cellsPostSetWorksheetColumnWidth) | **POST** /cells/{name}/worksheets/{sheetName}/cells/columns/{columnIndex} | Set worksheet column width.
[**cellsPostUngroupWorksheetColumns**](CellsApi.md#cellsPostUngroupWorksheetColumns) | **POST** /cells/{name}/worksheets/{sheetName}/cells/columns/ungroup | Ungroup worksheet columns.
[**cellsPostUngroupWorksheetRows**](CellsApi.md#cellsPostUngroupWorksheetRows) | **POST** /cells/{name}/worksheets/{sheetName}/cells/rows/ungroup | Ungroup worksheet rows.
[**cellsPostUnhideWorksheetColumns**](CellsApi.md#cellsPostUnhideWorksheetColumns) | **POST** /cells/{name}/worksheets/{sheetName}/cells/columns/unhide | Unhide worksheet columns.
[**cellsPostUnhideWorksheetRows**](CellsApi.md#cellsPostUnhideWorksheetRows) | **POST** /cells/{name}/worksheets/{sheetName}/cells/rows/unhide | Unhide worksheet rows.
[**cellsPostUpdateWorksheetCellStyle**](CellsApi.md#cellsPostUpdateWorksheetCellStyle) | **POST** /cells/{name}/worksheets/{sheetName}/cells/{cellName}/style | Update cell&#39;s style.
[**cellsPostUpdateWorksheetRangeStyle**](CellsApi.md#cellsPostUpdateWorksheetRangeStyle) | **POST** /cells/{name}/worksheets/{sheetName}/cells/style | Update cell&#39;s range style.
[**cellsPostUpdateWorksheetRow**](CellsApi.md#cellsPostUpdateWorksheetRow) | **POST** /cells/{name}/worksheets/{sheetName}/cells/rows/{rowIndex} | Update worksheet row.
[**cellsPostWorksheetCellSetValue**](CellsApi.md#cellsPostWorksheetCellSetValue) | **POST** /cells/{name}/worksheets/{sheetName}/cells/{cellName} | Set cell value.
[**cellsPostWorksheetMerge**](CellsApi.md#cellsPostWorksheetMerge) | **POST** /cells/{name}/worksheets/{sheetName}/cells/merge | Merge cells.
[**cellsPostWorksheetUnmerge**](CellsApi.md#cellsPostWorksheetUnmerge) | **POST** /cells/{name}/worksheets/{sheetName}/cells/unmerge | Unmerge cells.
[**cellsPutInsertWorksheetColumns**](CellsApi.md#cellsPutInsertWorksheetColumns) | **PUT** /cells/{name}/worksheets/{sheetName}/cells/columns/{columnIndex} | Insert worksheet columns.
[**cellsPutInsertWorksheetRow**](CellsApi.md#cellsPutInsertWorksheetRow) | **PUT** /cells/{name}/worksheets/{sheetName}/cells/rows/{rowIndex} | Insert new worksheet row.
[**cellsPutInsertWorksheetRows**](CellsApi.md#cellsPutInsertWorksheetRows) | **PUT** /cells/{name}/worksheets/{sheetName}/cells/rows | Insert several new worksheet rows.


<a name="cellsDeleteWorksheetColumns"></a>
# **cellsDeleteWorksheetColumns**
> ColumnsResponse cellsDeleteWorksheetColumns(name, sheetName, columnIndex, columns, updateReference, folder)

Delete worksheet columns.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer columnIndex = 56; // Integer | The column index.
Integer columns = 56; // Integer | The columns.
Boolean updateReference = true; // Boolean | The update reference.
String folder = "folder_example"; // String | The workbook folder.
try {
    ColumnsResponse result = apiInstance.cellsDeleteWorksheetColumns(name, sheetName, columnIndex, columns, updateReference, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsDeleteWorksheetColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **columnIndex** | **Integer**| The column index. |
 **columns** | **Integer**| The columns. |
 **updateReference** | **Boolean**| The update reference. |
 **folder** | **String**| The workbook folder. | [optional]

### Return type

[**ColumnsResponse**](ColumnsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsDeleteWorksheetRow"></a>
# **cellsDeleteWorksheetRow**
> SaaSposeResponse cellsDeleteWorksheetRow(name, sheetName, rowIndex, folder)

Delete worksheet row.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet bame.
Integer rowIndex = 56; // Integer | The row index.
String folder = "folder_example"; // String | The document folder.
try {
    SaaSposeResponse result = apiInstance.cellsDeleteWorksheetRow(name, sheetName, rowIndex, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsDeleteWorksheetRow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet bame. |
 **rowIndex** | **Integer**| The row index. |
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsDeleteWorksheetRows"></a>
# **cellsDeleteWorksheetRows**
> SaaSposeResponse cellsDeleteWorksheetRows(name, sheetName, startrow, totalRows, updateReference, folder)

Delete several worksheet rows.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet bame.
Integer startrow = 56; // Integer | The begin row index to be operated.
Integer totalRows = 1; // Integer | Number of rows to be operated.
Boolean updateReference = true; // Boolean | Indicates if update references in other worksheets.
String folder = "folder_example"; // String | The document folder.
try {
    SaaSposeResponse result = apiInstance.cellsDeleteWorksheetRows(name, sheetName, startrow, totalRows, updateReference, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsDeleteWorksheetRows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet bame. |
 **startrow** | **Integer**| The begin row index to be operated. |
 **totalRows** | **Integer**| Number of rows to be operated. | [optional] [default to 1]
 **updateReference** | **Boolean**| Indicates if update references in other worksheets. | [optional] [default to true]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsGetWorksheetCell"></a>
# **cellsGetWorksheetCell**
> File cellsGetWorksheetCell(name, sheetName, cellOrMethodName, folder)

Read cell data by cell&#39;s name.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String cellOrMethodName = "cellOrMethodName_example"; // String | The cell's or method name. (Method name like firstcell, endcell etc.)
String folder = "folder_example"; // String | Document's folder.
try {
    File result = apiInstance.cellsGetWorksheetCell(name, sheetName, cellOrMethodName, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsGetWorksheetCell");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **cellOrMethodName** | **String**| The cell&#39;s or method name. (Method name like firstcell, endcell etc.) |
 **folder** | **String**| Document&#39;s folder. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsGetWorksheetCellStyle"></a>
# **cellsGetWorksheetCellStyle**
> StyleResponse cellsGetWorksheetCellStyle(name, sheetName, cellName, folder)

Read cell&#39;s style info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String cellName = "cellName_example"; // String | Cell's name.
String folder = "folder_example"; // String | Document's folder.
try {
    StyleResponse result = apiInstance.cellsGetWorksheetCellStyle(name, sheetName, cellName, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsGetWorksheetCellStyle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **cellName** | **String**| Cell&#39;s name. |
 **folder** | **String**| Document&#39;s folder. | [optional]

### Return type

[**StyleResponse**](StyleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsGetWorksheetCells"></a>
# **cellsGetWorksheetCells**
> CellsResponse cellsGetWorksheetCells(name, sheetName, offest, count, folder)

Get cells info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer offest = 0; // Integer | Begginig offset.
Integer count = 0; // Integer | Maximum amount of cells in the response.
String folder = "folder_example"; // String | Document's folder name.
try {
    CellsResponse result = apiInstance.cellsGetWorksheetCells(name, sheetName, offest, count, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsGetWorksheetCells");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **offest** | **Integer**| Begginig offset. | [optional] [default to 0]
 **count** | **Integer**| Maximum amount of cells in the response. | [optional] [default to 0]
 **folder** | **String**| Document&#39;s folder name. | [optional]

### Return type

[**CellsResponse**](CellsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsGetWorksheetColumn"></a>
# **cellsGetWorksheetColumn**
> ColumnResponse cellsGetWorksheetColumn(name, sheetName, columnIndex, folder)

Read worksheet column data by column&#39;s index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer columnIndex = 56; // Integer | The column index.
String folder = "folder_example"; // String | The workbook folder.
try {
    ColumnResponse result = apiInstance.cellsGetWorksheetColumn(name, sheetName, columnIndex, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsGetWorksheetColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **columnIndex** | **Integer**| The column index. |
 **folder** | **String**| The workbook folder. | [optional]

### Return type

[**ColumnResponse**](ColumnResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsGetWorksheetColumns"></a>
# **cellsGetWorksheetColumns**
> ColumnsResponse cellsGetWorksheetColumns(name, sheetName, folder)

Read worksheet columns info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | The workdook folder.
try {
    ColumnsResponse result = apiInstance.cellsGetWorksheetColumns(name, sheetName, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsGetWorksheetColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **folder** | **String**| The workdook folder. | [optional]

### Return type

[**ColumnsResponse**](ColumnsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsGetWorksheetRow"></a>
# **cellsGetWorksheetRow**
> RowResponse cellsGetWorksheetRow(name, sheetName, rowIndex, folder)

Read worksheet row data by row&#39;s index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer rowIndex = 56; // Integer | The row index.
String folder = "folder_example"; // String | The workbook folder.
try {
    RowResponse result = apiInstance.cellsGetWorksheetRow(name, sheetName, rowIndex, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsGetWorksheetRow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **rowIndex** | **Integer**| The row index. |
 **folder** | **String**| The workbook folder. | [optional]

### Return type

[**RowResponse**](RowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsGetWorksheetRows"></a>
# **cellsGetWorksheetRows**
> RowsResponse cellsGetWorksheetRows(name, sheetName, folder)

Read worksheet rows info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | The workdook folder.
try {
    RowsResponse result = apiInstance.cellsGetWorksheetRows(name, sheetName, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsGetWorksheetRows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **folder** | **String**| The workdook folder. | [optional]

### Return type

[**RowsResponse**](RowsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostCellCalculate"></a>
# **cellsPostCellCalculate**
> SaaSposeResponse cellsPostCellCalculate(name, sheetName, cellName, options, folder)

Cell calculate formula

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String cellName = "cellName_example"; // String | 
CalculationOptions options = new CalculationOptions(); // CalculationOptions | 
String folder = "folder_example"; // String | 
try {
    SaaSposeResponse result = apiInstance.cellsPostCellCalculate(name, sheetName, cellName, options, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostCellCalculate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **cellName** | **String**|  |
 **options** | [**CalculationOptions**](CalculationOptions.md)|  | [optional]
 **folder** | **String**|  | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostCellCharacters"></a>
# **cellsPostCellCharacters**
> SaaSposeResponse cellsPostCellCharacters(name, sheetName, cellName, options, folder)

Set cell characters 

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String cellName = "cellName_example"; // String | 
List<FontSetting> options = Arrays.asList(new FontSetting()); // List<FontSetting> | 
String folder = "folder_example"; // String | 
try {
    SaaSposeResponse result = apiInstance.cellsPostCellCharacters(name, sheetName, cellName, options, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostCellCharacters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **cellName** | **String**|  |
 **options** | [**List&lt;FontSetting&gt;**](FontSetting.md)|  | [optional]
 **folder** | **String**|  | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostClearContents"></a>
# **cellsPostClearContents**
> SaaSposeResponse cellsPostClearContents(name, sheetName, range, startRow, startColumn, endRow, endColumn, folder)

Clear cells contents.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String range = "range_example"; // String | The range.
Integer startRow = 56; // Integer | The start row.
Integer startColumn = 56; // Integer | The start column.
Integer endRow = 56; // Integer | The end row.
Integer endColumn = 56; // Integer | The end column.
String folder = "folder_example"; // String | The workbook folder.
try {
    SaaSposeResponse result = apiInstance.cellsPostClearContents(name, sheetName, range, startRow, startColumn, endRow, endColumn, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostClearContents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **range** | **String**| The range. | [optional]
 **startRow** | **Integer**| The start row. | [optional]
 **startColumn** | **Integer**| The start column. | [optional]
 **endRow** | **Integer**| The end row. | [optional]
 **endColumn** | **Integer**| The end column. | [optional]
 **folder** | **String**| The workbook folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostClearFormats"></a>
# **cellsPostClearFormats**
> SaaSposeResponse cellsPostClearFormats(name, sheetName, range, startRow, startColumn, endRow, endColumn, folder)

Clear cells contents.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String range = "range_example"; // String | The range.
Integer startRow = 56; // Integer | The start row.
Integer startColumn = 56; // Integer | The start column.
Integer endRow = 56; // Integer | The end row.
Integer endColumn = 56; // Integer | The end column.
String folder = "folder_example"; // String | The workbook folder.
try {
    SaaSposeResponse result = apiInstance.cellsPostClearFormats(name, sheetName, range, startRow, startColumn, endRow, endColumn, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostClearFormats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **range** | **String**| The range. | [optional]
 **startRow** | **Integer**| The start row. | [optional]
 **startColumn** | **Integer**| The start column. | [optional]
 **endRow** | **Integer**| The end row. | [optional]
 **endColumn** | **Integer**| The end column. | [optional]
 **folder** | **String**| The workbook folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostColumnStyle"></a>
# **cellsPostColumnStyle**
> SaaSposeResponse cellsPostColumnStyle(name, sheetName, columnIndex, style, folder)

Set column style

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer columnIndex = 56; // Integer | The column index.
Style style = new Style(); // Style | Style dto
String folder = "folder_example"; // String | The workbook folder.
try {
    SaaSposeResponse result = apiInstance.cellsPostColumnStyle(name, sheetName, columnIndex, style, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostColumnStyle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **columnIndex** | **Integer**| The column index. |
 **style** | [**Style**](Style.md)| Style dto | [optional]
 **folder** | **String**| The workbook folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostCopyCellIntoCell"></a>
# **cellsPostCopyCellIntoCell**
> SaaSposeResponse cellsPostCopyCellIntoCell(name, destCellName, sheetName, worksheet, cellname, row, column, folder)

Copy cell into cell

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String destCellName = "destCellName_example"; // String | Destination cell name
String sheetName = "sheetName_example"; // String | Destination worksheet name.
String worksheet = "worksheet_example"; // String | Source worksheet name.
String cellname = "cellname_example"; // String | Source cell name
Integer row = 56; // Integer | Source row
Integer column = 56; // Integer | Source column
String folder = "folder_example"; // String | Folder name
try {
    SaaSposeResponse result = apiInstance.cellsPostCopyCellIntoCell(name, destCellName, sheetName, worksheet, cellname, row, column, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostCopyCellIntoCell");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **destCellName** | **String**| Destination cell name |
 **sheetName** | **String**| Destination worksheet name. |
 **worksheet** | **String**| Source worksheet name. |
 **cellname** | **String**| Source cell name | [optional]
 **row** | **Integer**| Source row | [optional]
 **column** | **Integer**| Source column | [optional]
 **folder** | **String**| Folder name | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostCopyWorksheetColumns"></a>
# **cellsPostCopyWorksheetColumns**
> SaaSposeResponse cellsPostCopyWorksheetColumns(name, sheetName, sourceColumnIndex, destinationColumnIndex, columnNumber, worksheet, folder)

Copy worksheet columns.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer sourceColumnIndex = 56; // Integer | Source column index
Integer destinationColumnIndex = 56; // Integer | Destination column index
Integer columnNumber = 56; // Integer | The copied column number
String worksheet = ""; // String | The Worksheet
String folder = "folder_example"; // String | The document folder.
try {
    SaaSposeResponse result = apiInstance.cellsPostCopyWorksheetColumns(name, sheetName, sourceColumnIndex, destinationColumnIndex, columnNumber, worksheet, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostCopyWorksheetColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **sourceColumnIndex** | **Integer**| Source column index |
 **destinationColumnIndex** | **Integer**| Destination column index |
 **columnNumber** | **Integer**| The copied column number |
 **worksheet** | **String**| The Worksheet | [optional] [default to ]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostCopyWorksheetRows"></a>
# **cellsPostCopyWorksheetRows**
> SaaSposeResponse cellsPostCopyWorksheetRows(name, sheetName, sourceRowIndex, destinationRowIndex, rowNumber, worksheet, folder)

Copy worksheet rows.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer sourceRowIndex = 56; // Integer | Source row index
Integer destinationRowIndex = 56; // Integer | Destination row index
Integer rowNumber = 56; // Integer | The copied row number
String worksheet = "worksheet_example"; // String | worksheet
String folder = "folder_example"; // String | The document folder.
try {
    SaaSposeResponse result = apiInstance.cellsPostCopyWorksheetRows(name, sheetName, sourceRowIndex, destinationRowIndex, rowNumber, worksheet, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostCopyWorksheetRows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **sourceRowIndex** | **Integer**| Source row index |
 **destinationRowIndex** | **Integer**| Destination row index |
 **rowNumber** | **Integer**| The copied row number |
 **worksheet** | **String**| worksheet | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostGroupWorksheetColumns"></a>
# **cellsPostGroupWorksheetColumns**
> SaaSposeResponse cellsPostGroupWorksheetColumns(name, sheetName, firstIndex, lastIndex, hide, folder)

Group worksheet columns.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer firstIndex = 56; // Integer | The first column index to be operated.
Integer lastIndex = 56; // Integer | The last column index to be operated.
Boolean hide = true; // Boolean | columns visible state
String folder = "folder_example"; // String | The document folder.
try {
    SaaSposeResponse result = apiInstance.cellsPostGroupWorksheetColumns(name, sheetName, firstIndex, lastIndex, hide, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostGroupWorksheetColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **firstIndex** | **Integer**| The first column index to be operated. |
 **lastIndex** | **Integer**| The last column index to be operated. |
 **hide** | **Boolean**| columns visible state | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostGroupWorksheetRows"></a>
# **cellsPostGroupWorksheetRows**
> SaaSposeResponse cellsPostGroupWorksheetRows(name, sheetName, firstIndex, lastIndex, hide, folder)

Group worksheet rows.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer firstIndex = 56; // Integer | The first row index to be operated.
Integer lastIndex = 56; // Integer | The last row index to be operated.
Boolean hide = true; // Boolean | rows visible state
String folder = "folder_example"; // String | The document folder.
try {
    SaaSposeResponse result = apiInstance.cellsPostGroupWorksheetRows(name, sheetName, firstIndex, lastIndex, hide, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostGroupWorksheetRows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **firstIndex** | **Integer**| The first row index to be operated. |
 **lastIndex** | **Integer**| The last row index to be operated. |
 **hide** | **Boolean**| rows visible state | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostHideWorksheetColumns"></a>
# **cellsPostHideWorksheetColumns**
> SaaSposeResponse cellsPostHideWorksheetColumns(name, sheetName, startColumn, totalColumns, folder)

Hide worksheet columns.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer startColumn = 56; // Integer | The begin column index to be operated.
Integer totalColumns = 56; // Integer | Number of columns to be operated.
String folder = "folder_example"; // String | The document folder.
try {
    SaaSposeResponse result = apiInstance.cellsPostHideWorksheetColumns(name, sheetName, startColumn, totalColumns, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostHideWorksheetColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **startColumn** | **Integer**| The begin column index to be operated. |
 **totalColumns** | **Integer**| Number of columns to be operated. |
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostHideWorksheetRows"></a>
# **cellsPostHideWorksheetRows**
> SaaSposeResponse cellsPostHideWorksheetRows(name, sheetName, startrow, totalRows, folder)

Hide worksheet rows.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer startrow = 56; // Integer | The begin row index to be operated.
Integer totalRows = 56; // Integer | Number of rows to be operated.
String folder = "folder_example"; // String | The document folder.
try {
    SaaSposeResponse result = apiInstance.cellsPostHideWorksheetRows(name, sheetName, startrow, totalRows, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostHideWorksheetRows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **startrow** | **Integer**| The begin row index to be operated. |
 **totalRows** | **Integer**| Number of rows to be operated. |
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostRowStyle"></a>
# **cellsPostRowStyle**
> SaaSposeResponse cellsPostRowStyle(name, sheetName, rowIndex, style, folder)

Set row style.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer rowIndex = 56; // Integer | The row index.
Style style = new Style(); // Style | Style dto
String folder = "folder_example"; // String | The document folder.
try {
    SaaSposeResponse result = apiInstance.cellsPostRowStyle(name, sheetName, rowIndex, style, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostRowStyle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **rowIndex** | **Integer**| The row index. |
 **style** | [**Style**](Style.md)| Style dto | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostSetCellHtmlString"></a>
# **cellsPostSetCellHtmlString**
> CellResponse cellsPostSetCellHtmlString(name, sheetName, cellName, folder)

Set htmlstring value into cell

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String cellName = "cellName_example"; // String | The cell name.
String folder = "folder_example"; // String | The workbook folder.
try {
    CellResponse result = apiInstance.cellsPostSetCellHtmlString(name, sheetName, cellName, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostSetCellHtmlString");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **cellName** | **String**| The cell name. |
 **folder** | **String**| The workbook folder. | [optional]

### Return type

[**CellResponse**](CellResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostSetCellRangeValue"></a>
# **cellsPostSetCellRangeValue**
> SaaSposeResponse cellsPostSetCellRangeValue(name, sheetName, cellarea, value, type, folder)

Set cell range value 

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String cellarea = "cellarea_example"; // String | Cell area (like \"A1:C2\")
String value = "value_example"; // String | Range value
String type = "type_example"; // String | Value data type (like \"int\")
String folder = "folder_example"; // String | Folder name
try {
    SaaSposeResponse result = apiInstance.cellsPostSetCellRangeValue(name, sheetName, cellarea, value, type, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostSetCellRangeValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **cellarea** | **String**| Cell area (like \&quot;A1:C2\&quot;) |
 **value** | **String**| Range value |
 **type** | **String**| Value data type (like \&quot;int\&quot;) |
 **folder** | **String**| Folder name | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostSetWorksheetColumnWidth"></a>
# **cellsPostSetWorksheetColumnWidth**
> ColumnResponse cellsPostSetWorksheetColumnWidth(name, sheetName, columnIndex, width, folder)

Set worksheet column width.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer columnIndex = 56; // Integer | The column index.
Double width = 3.4D; // Double | The width.
String folder = "folder_example"; // String | The workbook folder.
try {
    ColumnResponse result = apiInstance.cellsPostSetWorksheetColumnWidth(name, sheetName, columnIndex, width, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostSetWorksheetColumnWidth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **columnIndex** | **Integer**| The column index. |
 **width** | **Double**| The width. |
 **folder** | **String**| The workbook folder. | [optional]

### Return type

[**ColumnResponse**](ColumnResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostUngroupWorksheetColumns"></a>
# **cellsPostUngroupWorksheetColumns**
> SaaSposeResponse cellsPostUngroupWorksheetColumns(name, sheetName, firstIndex, lastIndex, folder)

Ungroup worksheet columns.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer firstIndex = 56; // Integer | The first column index to be operated.
Integer lastIndex = 56; // Integer | The last column index to be operated.
String folder = "folder_example"; // String | The document folder.
try {
    SaaSposeResponse result = apiInstance.cellsPostUngroupWorksheetColumns(name, sheetName, firstIndex, lastIndex, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostUngroupWorksheetColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **firstIndex** | **Integer**| The first column index to be operated. |
 **lastIndex** | **Integer**| The last column index to be operated. |
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostUngroupWorksheetRows"></a>
# **cellsPostUngroupWorksheetRows**
> SaaSposeResponse cellsPostUngroupWorksheetRows(name, sheetName, firstIndex, lastIndex, isAll, folder)

Ungroup worksheet rows.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer firstIndex = 56; // Integer | The first row index to be operated.
Integer lastIndex = 56; // Integer | The last row index to be operated.
Boolean isAll = true; // Boolean | Is all row to be operated
String folder = "folder_example"; // String | The document folder.
try {
    SaaSposeResponse result = apiInstance.cellsPostUngroupWorksheetRows(name, sheetName, firstIndex, lastIndex, isAll, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostUngroupWorksheetRows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **firstIndex** | **Integer**| The first row index to be operated. |
 **lastIndex** | **Integer**| The last row index to be operated. |
 **isAll** | **Boolean**| Is all row to be operated | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostUnhideWorksheetColumns"></a>
# **cellsPostUnhideWorksheetColumns**
> SaaSposeResponse cellsPostUnhideWorksheetColumns(name, sheetName, startcolumn, totalColumns, width, folder)

Unhide worksheet columns.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer startcolumn = 56; // Integer | The begin column index to be operated.
Integer totalColumns = 56; // Integer | Number of columns to be operated.
Double width = 3.4D; // Double | The new column width.
String folder = "folder_example"; // String | The document folder.
try {
    SaaSposeResponse result = apiInstance.cellsPostUnhideWorksheetColumns(name, sheetName, startcolumn, totalColumns, width, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostUnhideWorksheetColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **startcolumn** | **Integer**| The begin column index to be operated. |
 **totalColumns** | **Integer**| Number of columns to be operated. |
 **width** | **Double**| The new column width. | [optional] [default to 50.0]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostUnhideWorksheetRows"></a>
# **cellsPostUnhideWorksheetRows**
> SaaSposeResponse cellsPostUnhideWorksheetRows(name, sheetName, startrow, totalRows, height, folder)

Unhide worksheet rows.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer startrow = 56; // Integer | The begin row index to be operated.
Integer totalRows = 56; // Integer | Number of rows to be operated.
Double height = 3.4D; // Double | The new row height.
String folder = "folder_example"; // String | The document folder.
try {
    SaaSposeResponse result = apiInstance.cellsPostUnhideWorksheetRows(name, sheetName, startrow, totalRows, height, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostUnhideWorksheetRows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **startrow** | **Integer**| The begin row index to be operated. |
 **totalRows** | **Integer**| Number of rows to be operated. |
 **height** | **Double**| The new row height. | [optional] [default to 15.0]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostUpdateWorksheetCellStyle"></a>
# **cellsPostUpdateWorksheetCellStyle**
> StyleResponse cellsPostUpdateWorksheetCellStyle(name, sheetName, cellName, style, folder)

Update cell&#39;s style.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String cellName = "cellName_example"; // String | The cell name.
Style style = new Style(); // Style | with update style settings.
String folder = "folder_example"; // String | The workbook folder.
try {
    StyleResponse result = apiInstance.cellsPostUpdateWorksheetCellStyle(name, sheetName, cellName, style, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostUpdateWorksheetCellStyle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **cellName** | **String**| The cell name. |
 **style** | [**Style**](Style.md)| with update style settings. | [optional]
 **folder** | **String**| The workbook folder. | [optional]

### Return type

[**StyleResponse**](StyleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostUpdateWorksheetRangeStyle"></a>
# **cellsPostUpdateWorksheetRangeStyle**
> SaaSposeResponse cellsPostUpdateWorksheetRangeStyle(name, sheetName, range, style, folder)

Update cell&#39;s range style.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String range = "range_example"; // String | The range.
Style style = new Style(); // Style | with update style settings.
String folder = "folder_example"; // String | The workbook folder.
try {
    SaaSposeResponse result = apiInstance.cellsPostUpdateWorksheetRangeStyle(name, sheetName, range, style, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostUpdateWorksheetRangeStyle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **range** | **String**| The range. |
 **style** | [**Style**](Style.md)| with update style settings. | [optional]
 **folder** | **String**| The workbook folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostUpdateWorksheetRow"></a>
# **cellsPostUpdateWorksheetRow**
> RowResponse cellsPostUpdateWorksheetRow(name, sheetName, rowIndex, height, folder)

Update worksheet row.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer rowIndex = 56; // Integer | The row index.
Double height = 3.4D; // Double | The new row height.
String folder = "folder_example"; // String | The document folder.
try {
    RowResponse result = apiInstance.cellsPostUpdateWorksheetRow(name, sheetName, rowIndex, height, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostUpdateWorksheetRow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **rowIndex** | **Integer**| The row index. |
 **height** | **Double**| The new row height. | [optional] [default to 0.0]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**RowResponse**](RowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostWorksheetCellSetValue"></a>
# **cellsPostWorksheetCellSetValue**
> CellResponse cellsPostWorksheetCellSetValue(name, sheetName, cellName, value, type, formula, folder)

Set cell value.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String cellName = "cellName_example"; // String | The cell name.
String value = "value_example"; // String | The cell value.
String type = "type_example"; // String | The value type.
String formula = "formula_example"; // String | Formula for cell
String folder = "folder_example"; // String | The document folder.
try {
    CellResponse result = apiInstance.cellsPostWorksheetCellSetValue(name, sheetName, cellName, value, type, formula, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostWorksheetCellSetValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **sheetName** | **String**| The worksheet name. |
 **cellName** | **String**| The cell name. |
 **value** | **String**| The cell value. | [optional]
 **type** | **String**| The value type. | [optional]
 **formula** | **String**| Formula for cell | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**CellResponse**](CellResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostWorksheetMerge"></a>
# **cellsPostWorksheetMerge**
> SaaSposeResponse cellsPostWorksheetMerge(name, sheetName, startRow, startColumn, totalRows, totalColumns, folder)

Merge cells.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer startRow = 56; // Integer | The start row.
Integer startColumn = 56; // Integer | The start column.
Integer totalRows = 56; // Integer | The total rows
Integer totalColumns = 56; // Integer | The total columns.
String folder = "folder_example"; // String | The workbook folder.
try {
    SaaSposeResponse result = apiInstance.cellsPostWorksheetMerge(name, sheetName, startRow, startColumn, totalRows, totalColumns, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostWorksheetMerge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **startRow** | **Integer**| The start row. |
 **startColumn** | **Integer**| The start column. |
 **totalRows** | **Integer**| The total rows |
 **totalColumns** | **Integer**| The total columns. |
 **folder** | **String**| The workbook folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostWorksheetUnmerge"></a>
# **cellsPostWorksheetUnmerge**
> SaaSposeResponse cellsPostWorksheetUnmerge(name, sheetName, startRow, startColumn, totalRows, totalColumns, folder)

Unmerge cells.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer startRow = 56; // Integer | The start row.
Integer startColumn = 56; // Integer | The start column.
Integer totalRows = 56; // Integer | The total rows
Integer totalColumns = 56; // Integer | The total columns.
String folder = "folder_example"; // String | The workbook folder.
try {
    SaaSposeResponse result = apiInstance.cellsPostWorksheetUnmerge(name, sheetName, startRow, startColumn, totalRows, totalColumns, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostWorksheetUnmerge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **startRow** | **Integer**| The start row. |
 **startColumn** | **Integer**| The start column. |
 **totalRows** | **Integer**| The total rows |
 **totalColumns** | **Integer**| The total columns. |
 **folder** | **String**| The workbook folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPutInsertWorksheetColumns"></a>
# **cellsPutInsertWorksheetColumns**
> ColumnsResponse cellsPutInsertWorksheetColumns(name, sheetName, columnIndex, columns, updateReference, folder)

Insert worksheet columns.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer columnIndex = 56; // Integer | The column index.
Integer columns = 56; // Integer | The columns.
Boolean updateReference = true; // Boolean | The update reference.
String folder = "folder_example"; // String | The workbook folder.
try {
    ColumnsResponse result = apiInstance.cellsPutInsertWorksheetColumns(name, sheetName, columnIndex, columns, updateReference, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPutInsertWorksheetColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **columnIndex** | **Integer**| The column index. |
 **columns** | **Integer**| The columns. |
 **updateReference** | **Boolean**| The update reference. | [optional] [default to true]
 **folder** | **String**| The workbook folder. | [optional]

### Return type

[**ColumnsResponse**](ColumnsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPutInsertWorksheetRow"></a>
# **cellsPutInsertWorksheetRow**
> RowResponse cellsPutInsertWorksheetRow(name, sheetName, rowIndex, folder)

Insert new worksheet row.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer rowIndex = 56; // Integer | The new row index.
String folder = "folder_example"; // String | The document folder.
try {
    RowResponse result = apiInstance.cellsPutInsertWorksheetRow(name, sheetName, rowIndex, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPutInsertWorksheetRow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **rowIndex** | **Integer**| The new row index. |
 **folder** | **String**| The document folder. | [optional]

### Return type

[**RowResponse**](RowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPutInsertWorksheetRows"></a>
# **cellsPutInsertWorksheetRows**
> SaaSposeResponse cellsPutInsertWorksheetRows(name, sheetName, startrow, totalRows, updateReference, folder)

Insert several new worksheet rows.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer startrow = 56; // Integer | The begin row index to be operated.
Integer totalRows = 1; // Integer | Number of rows to be operated.
Boolean updateReference = true; // Boolean | Indicates if update references in other worksheets.
String folder = "folder_example"; // String | The document folder.
try {
    SaaSposeResponse result = apiInstance.cellsPutInsertWorksheetRows(name, sheetName, startrow, totalRows, updateReference, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPutInsertWorksheetRows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **startrow** | **Integer**| The begin row index to be operated. |
 **totalRows** | **Integer**| Number of rows to be operated. | [optional] [default to 1]
 **updateReference** | **Boolean**| Indicates if update references in other worksheets. | [optional] [default to true]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

