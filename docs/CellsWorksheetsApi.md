# CellsWorksheetsApi

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cellsWorksheetsDeleteUnprotectWorksheet**](CellsWorksheetsApi.md#cellsWorksheetsDeleteUnprotectWorksheet) | **DELETE** /cells/{name}/worksheets/{sheetName}/protection | Unprotect worksheet.
[**cellsWorksheetsDeleteWorksheet**](CellsWorksheetsApi.md#cellsWorksheetsDeleteWorksheet) | **DELETE** /cells/{name}/worksheets/{sheetName} | Delete worksheet.
[**cellsWorksheetsDeleteWorksheetBackground**](CellsWorksheetsApi.md#cellsWorksheetsDeleteWorksheetBackground) | **DELETE** /cells/{name}/worksheets/{sheetName}/background | Set worksheet background image.
[**cellsWorksheetsDeleteWorksheetComment**](CellsWorksheetsApi.md#cellsWorksheetsDeleteWorksheetComment) | **DELETE** /cells/{name}/worksheets/{sheetName}/comments/{cellName} | Delete worksheet&#39;s cell comment.
[**cellsWorksheetsDeleteWorksheetComments**](CellsWorksheetsApi.md#cellsWorksheetsDeleteWorksheetComments) | **DELETE** /cells/{name}/worksheets/{sheetName}/comments | Delete all comments for worksheet.
[**cellsWorksheetsDeleteWorksheetFreezePanes**](CellsWorksheetsApi.md#cellsWorksheetsDeleteWorksheetFreezePanes) | **DELETE** /cells/{name}/worksheets/{sheetName}/freezepanes | Unfreeze panes
[**cellsWorksheetsGetNamedRanges**](CellsWorksheetsApi.md#cellsWorksheetsGetNamedRanges) | **GET** /cells/{name}/worksheets/ranges | Read worksheets ranges info.
[**cellsWorksheetsGetWorksheet**](CellsWorksheetsApi.md#cellsWorksheetsGetWorksheet) | **GET** /cells/{name}/worksheets/{sheetName} | Read worksheet info or export.
[**cellsWorksheetsGetWorksheetCalculateFormula**](CellsWorksheetsApi.md#cellsWorksheetsGetWorksheetCalculateFormula) | **GET** /cells/{name}/worksheets/{sheetName}/formulaResult | Calculate formula value.
[**cellsWorksheetsGetWorksheetComment**](CellsWorksheetsApi.md#cellsWorksheetsGetWorksheetComment) | **GET** /cells/{name}/worksheets/{sheetName}/comments/{cellName} | Get worksheet comment by cell name.
[**cellsWorksheetsGetWorksheetComments**](CellsWorksheetsApi.md#cellsWorksheetsGetWorksheetComments) | **GET** /cells/{name}/worksheets/{sheetName}/comments | Get worksheet comments.
[**cellsWorksheetsGetWorksheetMergedCell**](CellsWorksheetsApi.md#cellsWorksheetsGetWorksheetMergedCell) | **GET** /cells/{name}/worksheets/{sheetName}/mergedCells/{mergedCellIndex} | Get worksheet merged cell by its index.
[**cellsWorksheetsGetWorksheetMergedCells**](CellsWorksheetsApi.md#cellsWorksheetsGetWorksheetMergedCells) | **GET** /cells/{name}/worksheets/{sheetName}/mergedCells | Get worksheet merged cells.
[**cellsWorksheetsGetWorksheetTextItems**](CellsWorksheetsApi.md#cellsWorksheetsGetWorksheetTextItems) | **GET** /cells/{name}/worksheets/{sheetName}/textItems | Get worksheet text items.
[**cellsWorksheetsGetWorksheets**](CellsWorksheetsApi.md#cellsWorksheetsGetWorksheets) | **GET** /cells/{name}/worksheets | Read worksheets info.
[**cellsWorksheetsPostAutofitWorksheetColumns**](CellsWorksheetsApi.md#cellsWorksheetsPostAutofitWorksheetColumns) | **POST** /cells/{name}/worksheets/{sheetName}/autofitcolumns | 
[**cellsWorksheetsPostAutofitWorksheetRow**](CellsWorksheetsApi.md#cellsWorksheetsPostAutofitWorksheetRow) | **POST** /cells/{name}/worksheets/{sheetName}/autofitrow | 
[**cellsWorksheetsPostAutofitWorksheetRows**](CellsWorksheetsApi.md#cellsWorksheetsPostAutofitWorksheetRows) | **POST** /cells/{name}/worksheets/{sheetName}/autofitrows | Autofit worksheet rows.
[**cellsWorksheetsPostCopyWorksheet**](CellsWorksheetsApi.md#cellsWorksheetsPostCopyWorksheet) | **POST** /cells/{name}/worksheets/{sheetName}/copy | 
[**cellsWorksheetsPostMoveWorksheet**](CellsWorksheetsApi.md#cellsWorksheetsPostMoveWorksheet) | **POST** /cells/{name}/worksheets/{sheetName}/position | Move worksheet.
[**cellsWorksheetsPostRenameWorksheet**](CellsWorksheetsApi.md#cellsWorksheetsPostRenameWorksheet) | **POST** /cells/{name}/worksheets/{sheetName}/rename | Rename worksheet
[**cellsWorksheetsPostUpdateWorksheetProperty**](CellsWorksheetsApi.md#cellsWorksheetsPostUpdateWorksheetProperty) | **POST** /cells/{name}/worksheets/{sheetName} | Update worksheet property
[**cellsWorksheetsPostUpdateWorksheetZoom**](CellsWorksheetsApi.md#cellsWorksheetsPostUpdateWorksheetZoom) | **POST** /cells/{name}/worksheets/{sheetName}/zoom | 
[**cellsWorksheetsPostWorksheetComment**](CellsWorksheetsApi.md#cellsWorksheetsPostWorksheetComment) | **POST** /cells/{name}/worksheets/{sheetName}/comments/{cellName} | Update worksheet&#39;s cell comment.
[**cellsWorksheetsPostWorksheetRangeSort**](CellsWorksheetsApi.md#cellsWorksheetsPostWorksheetRangeSort) | **POST** /cells/{name}/worksheets/{sheetName}/sort | Sort worksheet range.
[**cellsWorksheetsPostWorksheetTextSearch**](CellsWorksheetsApi.md#cellsWorksheetsPostWorksheetTextSearch) | **POST** /cells/{name}/worksheets/{sheetName}/findText | Search text.
[**cellsWorksheetsPostWorsheetTextReplace**](CellsWorksheetsApi.md#cellsWorksheetsPostWorsheetTextReplace) | **POST** /cells/{name}/worksheets/{sheetName}/replaceText | Replace text.
[**cellsWorksheetsPutAddNewWorksheet**](CellsWorksheetsApi.md#cellsWorksheetsPutAddNewWorksheet) | **PUT** /cells/{name}/worksheets/{sheetName} | Add new worksheet.
[**cellsWorksheetsPutChangeVisibilityWorksheet**](CellsWorksheetsApi.md#cellsWorksheetsPutChangeVisibilityWorksheet) | **PUT** /cells/{name}/worksheets/{sheetName}/visible | Change worksheet visibility.
[**cellsWorksheetsPutProtectWorksheet**](CellsWorksheetsApi.md#cellsWorksheetsPutProtectWorksheet) | **PUT** /cells/{name}/worksheets/{sheetName}/protection | Protect worksheet.
[**cellsWorksheetsPutWorksheetBackground**](CellsWorksheetsApi.md#cellsWorksheetsPutWorksheetBackground) | **PUT** /cells/{name}/worksheets/{sheetName}/background | Set worksheet background image.
[**cellsWorksheetsPutWorksheetComment**](CellsWorksheetsApi.md#cellsWorksheetsPutWorksheetComment) | **PUT** /cells/{name}/worksheets/{sheetName}/comments/{cellName} | Add worksheet&#39;s cell comment.
[**cellsWorksheetsPutWorksheetFreezePanes**](CellsWorksheetsApi.md#cellsWorksheetsPutWorksheetFreezePanes) | **PUT** /cells/{name}/worksheets/{sheetName}/freezepanes | Set freeze panes


<a name="cellsWorksheetsDeleteUnprotectWorksheet"></a>
# **cellsWorksheetsDeleteUnprotectWorksheet**
> WorksheetResponse cellsWorksheetsDeleteUnprotectWorksheet(name, sheetName, protectParameter, folder, storage)

Unprotect worksheet.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
ProtectSheetParameter protectParameter = new ProtectSheetParameter(); // ProtectSheetParameter | with protection settings. Only password is used here.
String folder = "folder_example"; // String | Document folder.
String storage = "storage_example"; // String | storage name.
try {
    WorksheetResponse result = apiInstance.cellsWorksheetsDeleteUnprotectWorksheet(name, sheetName, protectParameter, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsDeleteUnprotectWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **protectParameter** | [**ProtectSheetParameter**](ProtectSheetParameter.md)| with protection settings. Only password is used here. | [optional]
 **folder** | **String**| Document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorksheetResponse**](WorksheetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsDeleteWorksheet"></a>
# **cellsWorksheetsDeleteWorksheet**
> WorksheetsResponse cellsWorksheetsDeleteWorksheet(name, sheetName, folder, storage)

Delete worksheet.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    WorksheetsResponse result = apiInstance.cellsWorksheetsDeleteWorksheet(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsDeleteWorksheet");
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

[**WorksheetsResponse**](WorksheetsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsDeleteWorksheetBackground"></a>
# **cellsWorksheetsDeleteWorksheetBackground**
> SaaSposeResponse cellsWorksheetsDeleteWorksheetBackground(name, sheetName, folder, storage)

Set worksheet background image.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorksheetsDeleteWorksheetBackground(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsDeleteWorksheetBackground");
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

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsDeleteWorksheetComment"></a>
# **cellsWorksheetsDeleteWorksheetComment**
> SaaSposeResponse cellsWorksheetsDeleteWorksheetComment(name, sheetName, cellName, folder, storage)

Delete worksheet&#39;s cell comment.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | The document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String cellName = "cellName_example"; // String | The cell name
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorksheetsDeleteWorksheetComment(name, sheetName, cellName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsDeleteWorksheetComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **sheetName** | **String**| The worksheet name. |
 **cellName** | **String**| The cell name |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsDeleteWorksheetComments"></a>
# **cellsWorksheetsDeleteWorksheetComments**
> SaaSposeResponse cellsWorksheetsDeleteWorksheetComments(name, sheetName, folder, storage)

Delete all comments for worksheet.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorksheetsDeleteWorksheetComments(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsDeleteWorksheetComments");
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

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsDeleteWorksheetFreezePanes"></a>
# **cellsWorksheetsDeleteWorksheetFreezePanes**
> SaaSposeResponse cellsWorksheetsDeleteWorksheetFreezePanes(name, sheetName, row, column, freezedRows, freezedColumns, folder, storage)

Unfreeze panes

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer row = 56; // Integer | 
Integer column = 56; // Integer | 
Integer freezedRows = 56; // Integer | 
Integer freezedColumns = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorksheetsDeleteWorksheetFreezePanes(name, sheetName, row, column, freezedRows, freezedColumns, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsDeleteWorksheetFreezePanes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **row** | **Integer**|  |
 **column** | **Integer**|  |
 **freezedRows** | **Integer**|  |
 **freezedColumns** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsGetNamedRanges"></a>
# **cellsWorksheetsGetNamedRanges**
> RangesResponse cellsWorksheetsGetNamedRanges(name, folder, storage)

Read worksheets ranges info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | Document name.
String folder = "folder_example"; // String | Document folder.
String storage = "storage_example"; // String | storage name.
try {
    RangesResponse result = apiInstance.cellsWorksheetsGetNamedRanges(name, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsGetNamedRanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **folder** | **String**| Document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**RangesResponse**](RangesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsGetWorksheet"></a>
# **cellsWorksheetsGetWorksheet**
> File cellsWorksheetsGetWorksheet(name, sheetName, format, verticalResolution, horizontalResolution, folder, storage)

Read worksheet info or export.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | The document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String format = "format_example"; // String | The exported file format.
Integer verticalResolution = 0; // Integer | Image vertical resolution.
Integer horizontalResolution = 0; // Integer | Image horizontal resolution.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    File result = apiInstance.cellsWorksheetsGetWorksheet(name, sheetName, format, verticalResolution, horizontalResolution, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsGetWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **sheetName** | **String**| The worksheet name. |
 **format** | **String**| The exported file format. | [optional]
 **verticalResolution** | **Integer**| Image vertical resolution. | [optional] [default to 0]
 **horizontalResolution** | **Integer**| Image horizontal resolution. | [optional] [default to 0]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsGetWorksheetCalculateFormula"></a>
# **cellsWorksheetsGetWorksheetCalculateFormula**
> SingleValueResponse cellsWorksheetsGetWorksheetCalculateFormula(name, sheetName, formula, folder, storage)

Calculate formula value.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String formula = "formula_example"; // String | The formula.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    SingleValueResponse result = apiInstance.cellsWorksheetsGetWorksheetCalculateFormula(name, sheetName, formula, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsGetWorksheetCalculateFormula");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **formula** | **String**| The formula. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SingleValueResponse**](SingleValueResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsGetWorksheetComment"></a>
# **cellsWorksheetsGetWorksheetComment**
> CommentResponse cellsWorksheetsGetWorksheetComment(name, sheetName, cellName, folder, storage)

Get worksheet comment by cell name.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | The document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String cellName = "cellName_example"; // String | The cell name
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CommentResponse result = apiInstance.cellsWorksheetsGetWorksheetComment(name, sheetName, cellName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsGetWorksheetComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **sheetName** | **String**| The worksheet name. |
 **cellName** | **String**| The cell name |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CommentResponse**](CommentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsGetWorksheetComments"></a>
# **cellsWorksheetsGetWorksheetComments**
> CommentsResponse cellsWorksheetsGetWorksheetComments(name, sheetName, folder, storage)

Get worksheet comments.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CommentsResponse result = apiInstance.cellsWorksheetsGetWorksheetComments(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsGetWorksheetComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CommentsResponse**](CommentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsGetWorksheetMergedCell"></a>
# **cellsWorksheetsGetWorksheetMergedCell**
> MergedCellResponse cellsWorksheetsGetWorksheetMergedCell(name, sheetName, mergedCellIndex, folder, storage)

Get worksheet merged cell by its index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer mergedCellIndex = 56; // Integer | Merged cell index.
String folder = "folder_example"; // String | Document folder.
String storage = "storage_example"; // String | storage name.
try {
    MergedCellResponse result = apiInstance.cellsWorksheetsGetWorksheetMergedCell(name, sheetName, mergedCellIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsGetWorksheetMergedCell");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **mergedCellIndex** | **Integer**| Merged cell index. |
 **folder** | **String**| Document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**MergedCellResponse**](MergedCellResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsGetWorksheetMergedCells"></a>
# **cellsWorksheetsGetWorksheetMergedCells**
> MergedCellsResponse cellsWorksheetsGetWorksheetMergedCells(name, sheetName, folder, storage)

Get worksheet merged cells.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The workseet name.
String folder = "folder_example"; // String | Document folder.
String storage = "storage_example"; // String | storage name.
try {
    MergedCellsResponse result = apiInstance.cellsWorksheetsGetWorksheetMergedCells(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsGetWorksheetMergedCells");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The workseet name. |
 **folder** | **String**| Document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**MergedCellsResponse**](MergedCellsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsGetWorksheetTextItems"></a>
# **cellsWorksheetsGetWorksheetTextItems**
> TextItemsResponse cellsWorksheetsGetWorksheetTextItems(name, sheetName, folder, storage)

Get worksheet text items.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | The workbook's folder.
String storage = "storage_example"; // String | storage name.
try {
    TextItemsResponse result = apiInstance.cellsWorksheetsGetWorksheetTextItems(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsGetWorksheetTextItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **folder** | **String**| The workbook&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**TextItemsResponse**](TextItemsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsGetWorksheets"></a>
# **cellsWorksheetsGetWorksheets**
> WorksheetsResponse cellsWorksheetsGetWorksheets(name, folder, storage)

Read worksheets info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | Document name.
String folder = "folder_example"; // String | Document folder.
String storage = "storage_example"; // String | storage name.
try {
    WorksheetsResponse result = apiInstance.cellsWorksheetsGetWorksheets(name, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsGetWorksheets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **folder** | **String**| Document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorksheetsResponse**](WorksheetsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPostAutofitWorksheetColumns"></a>
# **cellsWorksheetsPostAutofitWorksheetColumns**
> SaaSposeResponse cellsWorksheetsPostAutofitWorksheetColumns(name, sheetName, firstColumn, lastColumn, autoFitterOptions, firstRow, lastRow, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer firstColumn = 56; // Integer | 
Integer lastColumn = 56; // Integer | 
AutoFitterOptions autoFitterOptions = new AutoFitterOptions(); // AutoFitterOptions | 
Integer firstRow = 56; // Integer | 
Integer lastRow = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorksheetsPostAutofitWorksheetColumns(name, sheetName, firstColumn, lastColumn, autoFitterOptions, firstRow, lastRow, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsPostAutofitWorksheetColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **firstColumn** | **Integer**|  |
 **lastColumn** | **Integer**|  |
 **autoFitterOptions** | [**AutoFitterOptions**](AutoFitterOptions.md)|  | [optional]
 **firstRow** | **Integer**|  | [optional]
 **lastRow** | **Integer**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPostAutofitWorksheetRow"></a>
# **cellsWorksheetsPostAutofitWorksheetRow**
> SaaSposeResponse cellsWorksheetsPostAutofitWorksheetRow(name, sheetName, rowIndex, firstColumn, lastColumn, autoFitterOptions, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer rowIndex = 56; // Integer | 
Integer firstColumn = 56; // Integer | 
Integer lastColumn = 56; // Integer | 
AutoFitterOptions autoFitterOptions = new AutoFitterOptions(); // AutoFitterOptions | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorksheetsPostAutofitWorksheetRow(name, sheetName, rowIndex, firstColumn, lastColumn, autoFitterOptions, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsPostAutofitWorksheetRow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **rowIndex** | **Integer**|  |
 **firstColumn** | **Integer**|  |
 **lastColumn** | **Integer**|  |
 **autoFitterOptions** | [**AutoFitterOptions**](AutoFitterOptions.md)|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPostAutofitWorksheetRows"></a>
# **cellsWorksheetsPostAutofitWorksheetRows**
> SaaSposeResponse cellsWorksheetsPostAutofitWorksheetRows(name, sheetName, autoFitterOptions, startRow, endRow, onlyAuto, folder, storage)

Autofit worksheet rows.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
AutoFitterOptions autoFitterOptions = new AutoFitterOptions(); // AutoFitterOptions | Auto Fitter Options.
Integer startRow = 56; // Integer | Start row.
Integer endRow = 56; // Integer | End row.
Boolean onlyAuto = false; // Boolean | Only auto.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorksheetsPostAutofitWorksheetRows(name, sheetName, autoFitterOptions, startRow, endRow, onlyAuto, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsPostAutofitWorksheetRows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **autoFitterOptions** | [**AutoFitterOptions**](AutoFitterOptions.md)| Auto Fitter Options. | [optional]
 **startRow** | **Integer**| Start row. | [optional]
 **endRow** | **Integer**| End row. | [optional]
 **onlyAuto** | **Boolean**| Only auto. | [optional] [default to false]
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPostCopyWorksheet"></a>
# **cellsWorksheetsPostCopyWorksheet**
> SaaSposeResponse cellsWorksheetsPostCopyWorksheet(name, sheetName, sourceSheet, options, sourceWorkbook, sourceFolder, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String sourceSheet = "sourceSheet_example"; // String | 
CopyOptions options = new CopyOptions(); // CopyOptions | 
String sourceWorkbook = "sourceWorkbook_example"; // String | 
String sourceFolder = "sourceFolder_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorksheetsPostCopyWorksheet(name, sheetName, sourceSheet, options, sourceWorkbook, sourceFolder, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsPostCopyWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **sourceSheet** | **String**|  |
 **options** | [**CopyOptions**](CopyOptions.md)|  | [optional]
 **sourceWorkbook** | **String**|  | [optional]
 **sourceFolder** | **String**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPostMoveWorksheet"></a>
# **cellsWorksheetsPostMoveWorksheet**
> WorksheetsResponse cellsWorksheetsPostMoveWorksheet(name, sheetName, moving, folder, storage)

Move worksheet.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
WorksheetMovingRequest moving = new WorksheetMovingRequest(); // WorksheetMovingRequest | with moving parameters.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    WorksheetsResponse result = apiInstance.cellsWorksheetsPostMoveWorksheet(name, sheetName, moving, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsPostMoveWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **moving** | [**WorksheetMovingRequest**](WorksheetMovingRequest.md)| with moving parameters. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorksheetsResponse**](WorksheetsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPostRenameWorksheet"></a>
# **cellsWorksheetsPostRenameWorksheet**
> SaaSposeResponse cellsWorksheetsPostRenameWorksheet(name, sheetName, newname, folder, storage)

Rename worksheet

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String newname = "newname_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorksheetsPostRenameWorksheet(name, sheetName, newname, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsPostRenameWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **newname** | **String**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPostUpdateWorksheetProperty"></a>
# **cellsWorksheetsPostUpdateWorksheetProperty**
> WorksheetResponse cellsWorksheetsPostUpdateWorksheetProperty(name, sheetName, sheet, folder, storage)

Update worksheet property

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Worksheet sheet = new Worksheet(); // Worksheet | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    WorksheetResponse result = apiInstance.cellsWorksheetsPostUpdateWorksheetProperty(name, sheetName, sheet, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsPostUpdateWorksheetProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **sheet** | [**Worksheet**](Worksheet.md)|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorksheetResponse**](WorksheetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPostUpdateWorksheetZoom"></a>
# **cellsWorksheetsPostUpdateWorksheetZoom**
> SaaSposeResponse cellsWorksheetsPostUpdateWorksheetZoom(name, sheetName, value, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer value = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorksheetsPostUpdateWorksheetZoom(name, sheetName, value, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsPostUpdateWorksheetZoom");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **value** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPostWorksheetComment"></a>
# **cellsWorksheetsPostWorksheetComment**
> SaaSposeResponse cellsWorksheetsPostWorksheetComment(name, sheetName, cellName, comment, folder, storage)

Update worksheet&#39;s cell comment.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | The document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String cellName = "cellName_example"; // String | The cell name
Comment comment = new Comment(); // Comment | Comment object
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorksheetsPostWorksheetComment(name, sheetName, cellName, comment, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsPostWorksheetComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **sheetName** | **String**| The worksheet name. |
 **cellName** | **String**| The cell name |
 **comment** | [**Comment**](Comment.md)| Comment object | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPostWorksheetRangeSort"></a>
# **cellsWorksheetsPostWorksheetRangeSort**
> SaaSposeResponse cellsWorksheetsPostWorksheetRangeSort(name, sheetName, cellArea, dataSorter, folder, storage)

Sort worksheet range.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String cellArea = "cellArea_example"; // String | The range to sort.
DataSorter dataSorter = new DataSorter(); // DataSorter | with sorting settings.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorksheetsPostWorksheetRangeSort(name, sheetName, cellArea, dataSorter, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsPostWorksheetRangeSort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **cellArea** | **String**| The range to sort. |
 **dataSorter** | [**DataSorter**](DataSorter.md)| with sorting settings. | [optional]
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPostWorksheetTextSearch"></a>
# **cellsWorksheetsPostWorksheetTextSearch**
> TextItemsResponse cellsWorksheetsPostWorksheetTextSearch(name, sheetName, text, folder, storage)

Search text.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String text = "text_example"; // String | Text to search.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    TextItemsResponse result = apiInstance.cellsWorksheetsPostWorksheetTextSearch(name, sheetName, text, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsPostWorksheetTextSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **text** | **String**| Text to search. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**TextItemsResponse**](TextItemsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPostWorsheetTextReplace"></a>
# **cellsWorksheetsPostWorsheetTextReplace**
> WorksheetReplaceResponse cellsWorksheetsPostWorsheetTextReplace(name, sheetName, oldValue, newValue, folder, storage)

Replace text.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String oldValue = "oldValue_example"; // String | The old text to replace.
String newValue = "newValue_example"; // String | The new text to replace by.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    WorksheetReplaceResponse result = apiInstance.cellsWorksheetsPostWorsheetTextReplace(name, sheetName, oldValue, newValue, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsPostWorsheetTextReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **oldValue** | **String**| The old text to replace. |
 **newValue** | **String**| The new text to replace by. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorksheetReplaceResponse**](WorksheetReplaceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPutAddNewWorksheet"></a>
# **cellsWorksheetsPutAddNewWorksheet**
> WorksheetsResponse cellsWorksheetsPutAddNewWorksheet(name, sheetName, position, sheettype, folder, storage)

Add new worksheet.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The new sheet name.
Integer position = 56; // Integer | The new sheet position.
String sheettype = "sheettype_example"; // String | The new sheet type.
String folder = "folder_example"; // String | Document folder.
String storage = "storage_example"; // String | storage name.
try {
    WorksheetsResponse result = apiInstance.cellsWorksheetsPutAddNewWorksheet(name, sheetName, position, sheettype, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsPutAddNewWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The new sheet name. |
 **position** | **Integer**| The new sheet position. | [optional]
 **sheettype** | **String**| The new sheet type. | [optional]
 **folder** | **String**| Document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorksheetsResponse**](WorksheetsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPutChangeVisibilityWorksheet"></a>
# **cellsWorksheetsPutChangeVisibilityWorksheet**
> WorksheetResponse cellsWorksheetsPutChangeVisibilityWorksheet(name, sheetName, isVisible, folder, storage)

Change worksheet visibility.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Boolean isVisible = true; // Boolean | New worksheet visibility value.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    WorksheetResponse result = apiInstance.cellsWorksheetsPutChangeVisibilityWorksheet(name, sheetName, isVisible, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsPutChangeVisibilityWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **isVisible** | **Boolean**| New worksheet visibility value. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorksheetResponse**](WorksheetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPutProtectWorksheet"></a>
# **cellsWorksheetsPutProtectWorksheet**
> WorksheetResponse cellsWorksheetsPutProtectWorksheet(name, sheetName, protectParameter, folder, storage)

Protect worksheet.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
ProtectSheetParameter protectParameter = new ProtectSheetParameter(); // ProtectSheetParameter | with protection settings.
String folder = "folder_example"; // String | Document folder.
String storage = "storage_example"; // String | storage name.
try {
    WorksheetResponse result = apiInstance.cellsWorksheetsPutProtectWorksheet(name, sheetName, protectParameter, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsPutProtectWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **protectParameter** | [**ProtectSheetParameter**](ProtectSheetParameter.md)| with protection settings. | [optional]
 **folder** | **String**| Document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorksheetResponse**](WorksheetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPutWorksheetBackground"></a>
# **cellsWorksheetsPutWorksheetBackground**
> SaaSposeResponse cellsWorksheetsPutWorksheetBackground(name, sheetName, png, folder, storage)

Set worksheet background image.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
byte[] png = BINARY_DATA_HERE; // byte[] | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorksheetsPutWorksheetBackground(name, sheetName, png, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsPutWorksheetBackground");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **png** | **byte[]**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPutWorksheetComment"></a>
# **cellsWorksheetsPutWorksheetComment**
> CommentResponse cellsWorksheetsPutWorksheetComment(name, sheetName, cellName, comment, folder, storage)

Add worksheet&#39;s cell comment.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | The document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String cellName = "cellName_example"; // String | The cell name
Comment comment = new Comment(); // Comment | Comment object
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CommentResponse result = apiInstance.cellsWorksheetsPutWorksheetComment(name, sheetName, cellName, comment, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsPutWorksheetComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **sheetName** | **String**| The worksheet name. |
 **cellName** | **String**| The cell name |
 **comment** | [**Comment**](Comment.md)| Comment object | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CommentResponse**](CommentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPutWorksheetFreezePanes"></a>
# **cellsWorksheetsPutWorksheetFreezePanes**
> SaaSposeResponse cellsWorksheetsPutWorksheetFreezePanes(name, sheetName, row, column, freezedRows, freezedColumns, folder, storage)

Set freeze panes

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetsApi;


CellsWorksheetsApi apiInstance = new CellsWorksheetsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer row = 56; // Integer | 
Integer column = 56; // Integer | 
Integer freezedRows = 56; // Integer | 
Integer freezedColumns = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorksheetsPutWorksheetFreezePanes(name, sheetName, row, column, freezedRows, freezedColumns, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetsApi#cellsWorksheetsPutWorksheetFreezePanes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **row** | **Integer**|  |
 **column** | **Integer**|  |
 **freezedRows** | **Integer**|  |
 **freezedColumns** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

