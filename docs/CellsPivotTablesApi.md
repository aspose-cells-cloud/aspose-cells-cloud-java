# CellsPivotTablesApi

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cellsPivotTablesDeletePivotTableField**](CellsPivotTablesApi.md#cellsPivotTablesDeletePivotTableField) | **DELETE** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotField | Delete pivot field into into pivot table
[**cellsPivotTablesDeleteWorksheetPivotTable**](CellsPivotTablesApi.md#cellsPivotTablesDeleteWorksheetPivotTable) | **DELETE** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex} | Delete worksheet pivot table by index
[**cellsPivotTablesDeleteWorksheetPivotTableFilter**](CellsPivotTablesApi.md#cellsPivotTablesDeleteWorksheetPivotTableFilter) | **DELETE** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotFilters/{fieldIndex} | delete  pivot filter for piovt table             
[**cellsPivotTablesDeleteWorksheetPivotTableFilters**](CellsPivotTablesApi.md#cellsPivotTablesDeleteWorksheetPivotTableFilters) | **DELETE** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotFilters | delete all pivot filters for piovt table
[**cellsPivotTablesDeleteWorksheetPivotTables**](CellsPivotTablesApi.md#cellsPivotTablesDeleteWorksheetPivotTables) | **DELETE** /cells/{name}/worksheets/{sheetName}/pivottables | Delete worksheet pivot tables
[**cellsPivotTablesGetPivotTableField**](CellsPivotTablesApi.md#cellsPivotTablesGetPivotTableField) | **GET** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotField | Get pivot field into into pivot table
[**cellsPivotTablesGetWorksheetPivotTable**](CellsPivotTablesApi.md#cellsPivotTablesGetWorksheetPivotTable) | **GET** /cells/{name}/worksheets/{sheetName}/pivottables/{pivottableIndex} | Get worksheet pivottable info by index.
[**cellsPivotTablesGetWorksheetPivotTableFilter**](CellsPivotTablesApi.md#cellsPivotTablesGetWorksheetPivotTableFilter) | **GET** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotFilters/{filterIndex} | 
[**cellsPivotTablesGetWorksheetPivotTableFilters**](CellsPivotTablesApi.md#cellsPivotTablesGetWorksheetPivotTableFilters) | **GET** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotFilters | 
[**cellsPivotTablesGetWorksheetPivotTables**](CellsPivotTablesApi.md#cellsPivotTablesGetWorksheetPivotTables) | **GET** /cells/{name}/worksheets/{sheetName}/pivottables | Get worksheet pivottables info.
[**cellsPivotTablesPostPivotTableCellStyle**](CellsPivotTablesApi.md#cellsPivotTablesPostPivotTableCellStyle) | **POST** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/Format | Update cell style for pivot table
[**cellsPivotTablesPostPivotTableFieldHideItem**](CellsPivotTablesApi.md#cellsPivotTablesPostPivotTableFieldHideItem) | **POST** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotField/Hide | 
[**cellsPivotTablesPostPivotTableFieldMoveTo**](CellsPivotTablesApi.md#cellsPivotTablesPostPivotTableFieldMoveTo) | **POST** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotField/Move | 
[**cellsPivotTablesPostPivotTableStyle**](CellsPivotTablesApi.md#cellsPivotTablesPostPivotTableStyle) | **POST** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/FormatAll | Update style for pivot table
[**cellsPivotTablesPostWorksheetPivotTableCalculate**](CellsPivotTablesApi.md#cellsPivotTablesPostWorksheetPivotTableCalculate) | **POST** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/Calculate | Calculates pivottable&#39;s data to cells.
[**cellsPivotTablesPostWorksheetPivotTableMove**](CellsPivotTablesApi.md#cellsPivotTablesPostWorksheetPivotTableMove) | **POST** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/Move | 
[**cellsPivotTablesPutPivotTableField**](CellsPivotTablesApi.md#cellsPivotTablesPutPivotTableField) | **PUT** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotField | Add pivot field into into pivot table
[**cellsPivotTablesPutWorksheetPivotTable**](CellsPivotTablesApi.md#cellsPivotTablesPutWorksheetPivotTable) | **PUT** /cells/{name}/worksheets/{sheetName}/pivottables | Add a pivot table into worksheet.
[**cellsPivotTablesPutWorksheetPivotTableFilter**](CellsPivotTablesApi.md#cellsPivotTablesPutWorksheetPivotTableFilter) | **PUT** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotFilters | Add pivot filter for piovt table index


<a name="cellsPivotTablesDeletePivotTableField"></a>
# **cellsPivotTablesDeletePivotTableField**
> SaaSposeResponse cellsPivotTablesDeletePivotTableField(name, sheetName, pivotTableIndex, pivotFieldType, request, folder, storage)

Delete pivot field into into pivot table

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPivotTablesApi;


CellsPivotTablesApi apiInstance = new CellsPivotTablesApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer pivotTableIndex = 56; // Integer | Pivot table index
String pivotFieldType = "pivotFieldType_example"; // String | The fields area type.
PivotTableFieldRequest request = new PivotTableFieldRequest(); // PivotTableFieldRequest | Dto that conrains field indexes
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsPivotTablesDeletePivotTableField(name, sheetName, pivotTableIndex, pivotFieldType, request, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPivotTablesApi#cellsPivotTablesDeletePivotTableField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **pivotTableIndex** | **Integer**| Pivot table index |
 **pivotFieldType** | **String**| The fields area type. |
 **request** | [**PivotTableFieldRequest**](PivotTableFieldRequest.md)| Dto that conrains field indexes | [optional]
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesDeleteWorksheetPivotTable"></a>
# **cellsPivotTablesDeleteWorksheetPivotTable**
> SaaSposeResponse cellsPivotTablesDeleteWorksheetPivotTable(name, sheetName, pivotTableIndex, folder, storage)

Delete worksheet pivot table by index

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPivotTablesApi;


CellsPivotTablesApi apiInstance = new CellsPivotTablesApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer pivotTableIndex = 56; // Integer | Pivot table index
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsPivotTablesDeleteWorksheetPivotTable(name, sheetName, pivotTableIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPivotTablesApi#cellsPivotTablesDeleteWorksheetPivotTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **pivotTableIndex** | **Integer**| Pivot table index |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesDeleteWorksheetPivotTableFilter"></a>
# **cellsPivotTablesDeleteWorksheetPivotTableFilter**
> SaaSposeResponse cellsPivotTablesDeleteWorksheetPivotTableFilter(name, sheetName, pivotTableIndex, fieldIndex, needReCalculate, folder, storage)

delete  pivot filter for piovt table             

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPivotTablesApi;


CellsPivotTablesApi apiInstance = new CellsPivotTablesApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer pivotTableIndex = 56; // Integer | 
Integer fieldIndex = 56; // Integer | 
Boolean needReCalculate = false; // Boolean | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsPivotTablesDeleteWorksheetPivotTableFilter(name, sheetName, pivotTableIndex, fieldIndex, needReCalculate, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPivotTablesApi#cellsPivotTablesDeleteWorksheetPivotTableFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **pivotTableIndex** | **Integer**|  |
 **fieldIndex** | **Integer**|  |
 **needReCalculate** | **Boolean**|  | [optional] [default to false]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesDeleteWorksheetPivotTableFilters"></a>
# **cellsPivotTablesDeleteWorksheetPivotTableFilters**
> SaaSposeResponse cellsPivotTablesDeleteWorksheetPivotTableFilters(name, sheetName, pivotTableIndex, needReCalculate, folder, storage)

delete all pivot filters for piovt table

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPivotTablesApi;


CellsPivotTablesApi apiInstance = new CellsPivotTablesApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer pivotTableIndex = 56; // Integer | 
Boolean needReCalculate = false; // Boolean | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsPivotTablesDeleteWorksheetPivotTableFilters(name, sheetName, pivotTableIndex, needReCalculate, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPivotTablesApi#cellsPivotTablesDeleteWorksheetPivotTableFilters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **pivotTableIndex** | **Integer**|  |
 **needReCalculate** | **Boolean**|  | [optional] [default to false]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesDeleteWorksheetPivotTables"></a>
# **cellsPivotTablesDeleteWorksheetPivotTables**
> SaaSposeResponse cellsPivotTablesDeleteWorksheetPivotTables(name, sheetName, folder, storage)

Delete worksheet pivot tables

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPivotTablesApi;


CellsPivotTablesApi apiInstance = new CellsPivotTablesApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsPivotTablesDeleteWorksheetPivotTables(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPivotTablesApi#cellsPivotTablesDeleteWorksheetPivotTables");
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

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesGetPivotTableField"></a>
# **cellsPivotTablesGetPivotTableField**
> PivotFieldResponse cellsPivotTablesGetPivotTableField(name, sheetName, pivotTableIndex, pivotFieldIndex, pivotFieldType, folder, storage)

Get pivot field into into pivot table

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPivotTablesApi;


CellsPivotTablesApi apiInstance = new CellsPivotTablesApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer pivotTableIndex = 56; // Integer | Pivot table index
Integer pivotFieldIndex = 56; // Integer | The field index in the base fields.
String pivotFieldType = "pivotFieldType_example"; // String | The fields area type.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    PivotFieldResponse result = apiInstance.cellsPivotTablesGetPivotTableField(name, sheetName, pivotTableIndex, pivotFieldIndex, pivotFieldType, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPivotTablesApi#cellsPivotTablesGetPivotTableField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **pivotTableIndex** | **Integer**| Pivot table index |
 **pivotFieldIndex** | **Integer**| The field index in the base fields. |
 **pivotFieldType** | **String**| The fields area type. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**PivotFieldResponse**](PivotFieldResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesGetWorksheetPivotTable"></a>
# **cellsPivotTablesGetWorksheetPivotTable**
> PivotTableResponse cellsPivotTablesGetWorksheetPivotTable(name, sheetName, pivottableIndex, folder, storage)

Get worksheet pivottable info by index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPivotTablesApi;


CellsPivotTablesApi apiInstance = new CellsPivotTablesApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer pivottableIndex = 56; // Integer | 
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    PivotTableResponse result = apiInstance.cellsPivotTablesGetWorksheetPivotTable(name, sheetName, pivottableIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPivotTablesApi#cellsPivotTablesGetWorksheetPivotTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **pivottableIndex** | **Integer**|  |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**PivotTableResponse**](PivotTableResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesGetWorksheetPivotTableFilter"></a>
# **cellsPivotTablesGetWorksheetPivotTableFilter**
> PivotFilterResponse cellsPivotTablesGetWorksheetPivotTableFilter(name, sheetName, pivotTableIndex, filterIndex, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPivotTablesApi;


CellsPivotTablesApi apiInstance = new CellsPivotTablesApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer pivotTableIndex = 56; // Integer | 
Integer filterIndex = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    PivotFilterResponse result = apiInstance.cellsPivotTablesGetWorksheetPivotTableFilter(name, sheetName, pivotTableIndex, filterIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPivotTablesApi#cellsPivotTablesGetWorksheetPivotTableFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **pivotTableIndex** | **Integer**|  |
 **filterIndex** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**PivotFilterResponse**](PivotFilterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesGetWorksheetPivotTableFilters"></a>
# **cellsPivotTablesGetWorksheetPivotTableFilters**
> PivotFiltersResponse cellsPivotTablesGetWorksheetPivotTableFilters(name, sheetName, pivotTableIndex, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPivotTablesApi;


CellsPivotTablesApi apiInstance = new CellsPivotTablesApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer pivotTableIndex = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    PivotFiltersResponse result = apiInstance.cellsPivotTablesGetWorksheetPivotTableFilters(name, sheetName, pivotTableIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPivotTablesApi#cellsPivotTablesGetWorksheetPivotTableFilters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **pivotTableIndex** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**PivotFiltersResponse**](PivotFiltersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesGetWorksheetPivotTables"></a>
# **cellsPivotTablesGetWorksheetPivotTables**
> PivotTablesResponse cellsPivotTablesGetWorksheetPivotTables(name, sheetName, folder, storage)

Get worksheet pivottables info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPivotTablesApi;


CellsPivotTablesApi apiInstance = new CellsPivotTablesApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    PivotTablesResponse result = apiInstance.cellsPivotTablesGetWorksheetPivotTables(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPivotTablesApi#cellsPivotTablesGetWorksheetPivotTables");
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

[**PivotTablesResponse**](PivotTablesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesPostPivotTableCellStyle"></a>
# **cellsPivotTablesPostPivotTableCellStyle**
> SaaSposeResponse cellsPivotTablesPostPivotTableCellStyle(name, sheetName, pivotTableIndex, column, row, style, needReCalculate, folder, storage)

Update cell style for pivot table

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPivotTablesApi;


CellsPivotTablesApi apiInstance = new CellsPivotTablesApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer pivotTableIndex = 56; // Integer | Pivot table index
Integer column = 56; // Integer | 
Integer row = 56; // Integer | 
Style style = new Style(); // Style | Style dto in request body.
Boolean needReCalculate = false; // Boolean | 
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsPivotTablesPostPivotTableCellStyle(name, sheetName, pivotTableIndex, column, row, style, needReCalculate, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPivotTablesApi#cellsPivotTablesPostPivotTableCellStyle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **pivotTableIndex** | **Integer**| Pivot table index |
 **column** | **Integer**|  |
 **row** | **Integer**|  |
 **style** | [**Style**](Style.md)| Style dto in request body. | [optional]
 **needReCalculate** | **Boolean**|  | [optional] [default to false]
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesPostPivotTableFieldHideItem"></a>
# **cellsPivotTablesPostPivotTableFieldHideItem**
> SaaSposeResponse cellsPivotTablesPostPivotTableFieldHideItem(name, sheetName, pivotTableIndex, pivotFieldType, fieldIndex, itemIndex, isHide, needReCalculate, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPivotTablesApi;


CellsPivotTablesApi apiInstance = new CellsPivotTablesApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer pivotTableIndex = 56; // Integer | 
String pivotFieldType = "pivotFieldType_example"; // String | 
Integer fieldIndex = 56; // Integer | 
Integer itemIndex = 56; // Integer | 
Boolean isHide = true; // Boolean | 
Boolean needReCalculate = false; // Boolean | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsPivotTablesPostPivotTableFieldHideItem(name, sheetName, pivotTableIndex, pivotFieldType, fieldIndex, itemIndex, isHide, needReCalculate, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPivotTablesApi#cellsPivotTablesPostPivotTableFieldHideItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **pivotTableIndex** | **Integer**|  |
 **pivotFieldType** | **String**|  |
 **fieldIndex** | **Integer**|  |
 **itemIndex** | **Integer**|  |
 **isHide** | **Boolean**|  |
 **needReCalculate** | **Boolean**|  | [optional] [default to false]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesPostPivotTableFieldMoveTo"></a>
# **cellsPivotTablesPostPivotTableFieldMoveTo**
> SaaSposeResponse cellsPivotTablesPostPivotTableFieldMoveTo(name, sheetName, pivotTableIndex, fieldIndex, from, to, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPivotTablesApi;


CellsPivotTablesApi apiInstance = new CellsPivotTablesApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer pivotTableIndex = 56; // Integer | 
Integer fieldIndex = 56; // Integer | 
String from = "from_example"; // String | 
String to = "to_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsPivotTablesPostPivotTableFieldMoveTo(name, sheetName, pivotTableIndex, fieldIndex, from, to, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPivotTablesApi#cellsPivotTablesPostPivotTableFieldMoveTo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **pivotTableIndex** | **Integer**|  |
 **fieldIndex** | **Integer**|  |
 **from** | **String**|  |
 **to** | **String**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesPostPivotTableStyle"></a>
# **cellsPivotTablesPostPivotTableStyle**
> SaaSposeResponse cellsPivotTablesPostPivotTableStyle(name, sheetName, pivotTableIndex, style, needReCalculate, folder, storage)

Update style for pivot table

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPivotTablesApi;


CellsPivotTablesApi apiInstance = new CellsPivotTablesApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer pivotTableIndex = 56; // Integer | Pivot table index
Style style = new Style(); // Style | Style dto in request body.
Boolean needReCalculate = false; // Boolean | 
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsPivotTablesPostPivotTableStyle(name, sheetName, pivotTableIndex, style, needReCalculate, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPivotTablesApi#cellsPivotTablesPostPivotTableStyle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **pivotTableIndex** | **Integer**| Pivot table index |
 **style** | [**Style**](Style.md)| Style dto in request body. | [optional]
 **needReCalculate** | **Boolean**|  | [optional] [default to false]
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesPostWorksheetPivotTableCalculate"></a>
# **cellsPivotTablesPostWorksheetPivotTableCalculate**
> SaaSposeResponse cellsPivotTablesPostWorksheetPivotTableCalculate(name, sheetName, pivotTableIndex, folder, storage)

Calculates pivottable&#39;s data to cells.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPivotTablesApi;


CellsPivotTablesApi apiInstance = new CellsPivotTablesApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer pivotTableIndex = 56; // Integer | Pivot table index
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsPivotTablesPostWorksheetPivotTableCalculate(name, sheetName, pivotTableIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPivotTablesApi#cellsPivotTablesPostWorksheetPivotTableCalculate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **pivotTableIndex** | **Integer**| Pivot table index |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesPostWorksheetPivotTableMove"></a>
# **cellsPivotTablesPostWorksheetPivotTableMove**
> SaaSposeResponse cellsPivotTablesPostWorksheetPivotTableMove(name, sheetName, pivotTableIndex, row, column, destCellName, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPivotTablesApi;


CellsPivotTablesApi apiInstance = new CellsPivotTablesApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer pivotTableIndex = 56; // Integer | 
Integer row = 56; // Integer | 
Integer column = 56; // Integer | 
String destCellName = "destCellName_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsPivotTablesPostWorksheetPivotTableMove(name, sheetName, pivotTableIndex, row, column, destCellName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPivotTablesApi#cellsPivotTablesPostWorksheetPivotTableMove");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **pivotTableIndex** | **Integer**|  |
 **row** | **Integer**|  | [optional]
 **column** | **Integer**|  | [optional]
 **destCellName** | **String**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesPutPivotTableField"></a>
# **cellsPivotTablesPutPivotTableField**
> SaaSposeResponse cellsPivotTablesPutPivotTableField(name, sheetName, pivotTableIndex, pivotFieldType, request, needReCalculate, folder, storage)

Add pivot field into into pivot table

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPivotTablesApi;


CellsPivotTablesApi apiInstance = new CellsPivotTablesApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer pivotTableIndex = 56; // Integer | Pivot table index
String pivotFieldType = "pivotFieldType_example"; // String | The fields area type.
PivotTableFieldRequest request = new PivotTableFieldRequest(); // PivotTableFieldRequest | Dto that conrains field indexes
Boolean needReCalculate = false; // Boolean | 
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsPivotTablesPutPivotTableField(name, sheetName, pivotTableIndex, pivotFieldType, request, needReCalculate, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPivotTablesApi#cellsPivotTablesPutPivotTableField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **pivotTableIndex** | **Integer**| Pivot table index |
 **pivotFieldType** | **String**| The fields area type. |
 **request** | [**PivotTableFieldRequest**](PivotTableFieldRequest.md)| Dto that conrains field indexes | [optional]
 **needReCalculate** | **Boolean**|  | [optional] [default to false]
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesPutWorksheetPivotTable"></a>
# **cellsPivotTablesPutWorksheetPivotTable**
> PivotTableResponse cellsPivotTablesPutWorksheetPivotTable(name, sheetName, request, folder, storage, sourceData, destCellName, tableName, useSameSource)

Add a pivot table into worksheet.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPivotTablesApi;


CellsPivotTablesApi apiInstance = new CellsPivotTablesApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
CreatePivotTableRequest request = new CreatePivotTableRequest(); // CreatePivotTableRequest | CreatePivotTableRequest dto in request body.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
String sourceData = "sourceData_example"; // String | The data for the new PivotTable cache.
String destCellName = "destCellName_example"; // String | The cell in the upper-left corner of the PivotTable report's destination range.
String tableName = "tableName_example"; // String | The name of the new PivotTable report.
Boolean useSameSource = true; // Boolean | Indicates whether using same data source when another existing pivot table has used this data source. If the property is true, it will save memory.
try {
    PivotTableResponse result = apiInstance.cellsPivotTablesPutWorksheetPivotTable(name, sheetName, request, folder, storage, sourceData, destCellName, tableName, useSameSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPivotTablesApi#cellsPivotTablesPutWorksheetPivotTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **request** | [**CreatePivotTableRequest**](CreatePivotTableRequest.md)| CreatePivotTableRequest dto in request body. | [optional]
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]
 **sourceData** | **String**| The data for the new PivotTable cache. | [optional]
 **destCellName** | **String**| The cell in the upper-left corner of the PivotTable report&#39;s destination range. | [optional]
 **tableName** | **String**| The name of the new PivotTable report. | [optional]
 **useSameSource** | **Boolean**| Indicates whether using same data source when another existing pivot table has used this data source. If the property is true, it will save memory. | [optional]

### Return type

[**PivotTableResponse**](PivotTableResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesPutWorksheetPivotTableFilter"></a>
# **cellsPivotTablesPutWorksheetPivotTableFilter**
> SaaSposeResponse cellsPivotTablesPutWorksheetPivotTableFilter(name, sheetName, pivotTableIndex, filter, needReCalculate, folder, storage)

Add pivot filter for piovt table index

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPivotTablesApi;


CellsPivotTablesApi apiInstance = new CellsPivotTablesApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer pivotTableIndex = 56; // Integer | 
PivotFilter filter = new PivotFilter(); // PivotFilter | 
Boolean needReCalculate = false; // Boolean | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsPivotTablesPutWorksheetPivotTableFilter(name, sheetName, pivotTableIndex, filter, needReCalculate, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPivotTablesApi#cellsPivotTablesPutWorksheetPivotTableFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **pivotTableIndex** | **Integer**|  |
 **filter** | [**PivotFilter**](PivotFilter.md)|  | [optional]
 **needReCalculate** | **Boolean**|  | [optional] [default to false]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

