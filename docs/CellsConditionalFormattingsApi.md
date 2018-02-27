# CellsConditionalFormattingsApi

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cellsConditionalFormattingsDeleteWorksheetConditionalFormatting**](CellsConditionalFormattingsApi.md#cellsConditionalFormattingsDeleteWorksheetConditionalFormatting) | **DELETE** /cells/{name}/worksheets/{sheetName}/conditionalFormattings/{index} | Remove conditional formatting
[**cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea**](CellsConditionalFormattingsApi.md#cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea) | **DELETE** /cells/{name}/worksheets/{sheetName}/conditionalFormattings/area | Remove cell area from conditional formatting.
[**cellsConditionalFormattingsDeleteWorksheetConditionalFormattings**](CellsConditionalFormattingsApi.md#cellsConditionalFormattingsDeleteWorksheetConditionalFormattings) | **DELETE** /cells/{name}/worksheets/{sheetName}/conditionalFormattings | Clear all condition formattings
[**cellsConditionalFormattingsGetWorksheetConditionalFormatting**](CellsConditionalFormattingsApi.md#cellsConditionalFormattingsGetWorksheetConditionalFormatting) | **GET** /cells/{name}/worksheets/{sheetName}/conditionalFormattings/{index} | Get conditional formatting
[**cellsConditionalFormattingsGetWorksheetConditionalFormattings**](CellsConditionalFormattingsApi.md#cellsConditionalFormattingsGetWorksheetConditionalFormattings) | **GET** /cells/{name}/worksheets/{sheetName}/conditionalFormattings | Get conditional formattings 
[**cellsConditionalFormattingsPutWorksheetConditionalFormatting**](CellsConditionalFormattingsApi.md#cellsConditionalFormattingsPutWorksheetConditionalFormatting) | **PUT** /cells/{name}/worksheets/{sheetName}/conditionalFormattings | Add a condition formatting.
[**cellsConditionalFormattingsPutWorksheetFormatCondition**](CellsConditionalFormattingsApi.md#cellsConditionalFormattingsPutWorksheetFormatCondition) | **PUT** /cells/{name}/worksheets/{sheetName}/conditionalFormattings/{index} | Add a format condition.
[**cellsConditionalFormattingsPutWorksheetFormatConditionArea**](CellsConditionalFormattingsApi.md#cellsConditionalFormattingsPutWorksheetFormatConditionArea) | **PUT** /cells/{name}/worksheets/{sheetName}/conditionalFormattings/{index}/area | add a cell area for format condition             
[**cellsConditionalFormattingsPutWorksheetFormatConditionCondition**](CellsConditionalFormattingsApi.md#cellsConditionalFormattingsPutWorksheetFormatConditionCondition) | **PUT** /cells/{name}/worksheets/{sheetName}/conditionalFormattings/{index}/condition | Add a condition for format condition.


<a name="cellsConditionalFormattingsDeleteWorksheetConditionalFormatting"></a>
# **cellsConditionalFormattingsDeleteWorksheetConditionalFormatting**
> SaaSposeResponse cellsConditionalFormattingsDeleteWorksheetConditionalFormatting(name, sheetName, index, folder)

Remove conditional formatting

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsConditionalFormattingsApi;


CellsConditionalFormattingsApi apiInstance = new CellsConditionalFormattingsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer index = 56; // Integer | 
String folder = "folder_example"; // String | 
try {
    SaaSposeResponse result = apiInstance.cellsConditionalFormattingsDeleteWorksheetConditionalFormatting(name, sheetName, index, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsConditionalFormattingsApi#cellsConditionalFormattingsDeleteWorksheetConditionalFormatting");
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

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea"></a>
# **cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea**
> SaaSposeResponse cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea(name, sheetName, startRow, startColumn, totalRows, totalColumns, folder)

Remove cell area from conditional formatting.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsConditionalFormattingsApi;


CellsConditionalFormattingsApi apiInstance = new CellsConditionalFormattingsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer startRow = 56; // Integer | 
Integer startColumn = 56; // Integer | 
Integer totalRows = 56; // Integer | 
Integer totalColumns = 56; // Integer | 
String folder = "folder_example"; // String | 
try {
    SaaSposeResponse result = apiInstance.cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea(name, sheetName, startRow, startColumn, totalRows, totalColumns, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsConditionalFormattingsApi#cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **startRow** | **Integer**|  |
 **startColumn** | **Integer**|  |
 **totalRows** | **Integer**|  |
 **totalColumns** | **Integer**|  |
 **folder** | **String**|  | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsConditionalFormattingsDeleteWorksheetConditionalFormattings"></a>
# **cellsConditionalFormattingsDeleteWorksheetConditionalFormattings**
> SaaSposeResponse cellsConditionalFormattingsDeleteWorksheetConditionalFormattings(name, sheetName, folder)

Clear all condition formattings

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsConditionalFormattingsApi;


CellsConditionalFormattingsApi apiInstance = new CellsConditionalFormattingsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String folder = "folder_example"; // String | 
try {
    SaaSposeResponse result = apiInstance.cellsConditionalFormattingsDeleteWorksheetConditionalFormattings(name, sheetName, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsConditionalFormattingsApi#cellsConditionalFormattingsDeleteWorksheetConditionalFormattings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **folder** | **String**|  | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsConditionalFormattingsGetWorksheetConditionalFormatting"></a>
# **cellsConditionalFormattingsGetWorksheetConditionalFormatting**
> ConditionalFormattingResponse cellsConditionalFormattingsGetWorksheetConditionalFormatting(name, sheetName, index, folder)

Get conditional formatting

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsConditionalFormattingsApi;


CellsConditionalFormattingsApi apiInstance = new CellsConditionalFormattingsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer index = 56; // Integer | 
String folder = "folder_example"; // String | 
try {
    ConditionalFormattingResponse result = apiInstance.cellsConditionalFormattingsGetWorksheetConditionalFormatting(name, sheetName, index, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsConditionalFormattingsApi#cellsConditionalFormattingsGetWorksheetConditionalFormatting");
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

### Return type

[**ConditionalFormattingResponse**](ConditionalFormattingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsConditionalFormattingsGetWorksheetConditionalFormattings"></a>
# **cellsConditionalFormattingsGetWorksheetConditionalFormattings**
> ConditionalFormattingsResponse cellsConditionalFormattingsGetWorksheetConditionalFormattings(name, sheetName, folder)

Get conditional formattings 

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsConditionalFormattingsApi;


CellsConditionalFormattingsApi apiInstance = new CellsConditionalFormattingsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String folder = "folder_example"; // String | 
try {
    ConditionalFormattingsResponse result = apiInstance.cellsConditionalFormattingsGetWorksheetConditionalFormattings(name, sheetName, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsConditionalFormattingsApi#cellsConditionalFormattingsGetWorksheetConditionalFormattings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **folder** | **String**|  | [optional]

### Return type

[**ConditionalFormattingsResponse**](ConditionalFormattingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsConditionalFormattingsPutWorksheetConditionalFormatting"></a>
# **cellsConditionalFormattingsPutWorksheetConditionalFormatting**
> SaaSposeResponse cellsConditionalFormattingsPutWorksheetConditionalFormatting(name, sheetName, cellArea, formatcondition, folder)

Add a condition formatting.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsConditionalFormattingsApi;


CellsConditionalFormattingsApi apiInstance = new CellsConditionalFormattingsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String cellArea = "cellArea_example"; // String | 
FormatCondition formatcondition = new FormatCondition(); // FormatCondition | 
String folder = "folder_example"; // String | 
try {
    SaaSposeResponse result = apiInstance.cellsConditionalFormattingsPutWorksheetConditionalFormatting(name, sheetName, cellArea, formatcondition, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsConditionalFormattingsApi#cellsConditionalFormattingsPutWorksheetConditionalFormatting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **cellArea** | **String**|  |
 **formatcondition** | [**FormatCondition**](FormatCondition.md)|  | [optional]
 **folder** | **String**|  | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsConditionalFormattingsPutWorksheetFormatCondition"></a>
# **cellsConditionalFormattingsPutWorksheetFormatCondition**
> SaaSposeResponse cellsConditionalFormattingsPutWorksheetFormatCondition(name, sheetName, index, cellArea, type, operatorType, formula1, formula2, folder)

Add a format condition.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsConditionalFormattingsApi;


CellsConditionalFormattingsApi apiInstance = new CellsConditionalFormattingsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer index = 56; // Integer | 
String cellArea = "cellArea_example"; // String | 
String type = "type_example"; // String | 
String operatorType = "operatorType_example"; // String | 
String formula1 = "formula1_example"; // String | 
String formula2 = "formula2_example"; // String | 
String folder = "folder_example"; // String | 
try {
    SaaSposeResponse result = apiInstance.cellsConditionalFormattingsPutWorksheetFormatCondition(name, sheetName, index, cellArea, type, operatorType, formula1, formula2, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsConditionalFormattingsApi#cellsConditionalFormattingsPutWorksheetFormatCondition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **index** | **Integer**|  |
 **cellArea** | **String**|  |
 **type** | **String**|  |
 **operatorType** | **String**|  |
 **formula1** | **String**|  |
 **formula2** | **String**|  |
 **folder** | **String**|  | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsConditionalFormattingsPutWorksheetFormatConditionArea"></a>
# **cellsConditionalFormattingsPutWorksheetFormatConditionArea**
> SaaSposeResponse cellsConditionalFormattingsPutWorksheetFormatConditionArea(name, sheetName, index, cellArea, folder)

add a cell area for format condition             

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsConditionalFormattingsApi;


CellsConditionalFormattingsApi apiInstance = new CellsConditionalFormattingsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer index = 56; // Integer | 
String cellArea = "cellArea_example"; // String | 
String folder = "folder_example"; // String | 
try {
    SaaSposeResponse result = apiInstance.cellsConditionalFormattingsPutWorksheetFormatConditionArea(name, sheetName, index, cellArea, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsConditionalFormattingsApi#cellsConditionalFormattingsPutWorksheetFormatConditionArea");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **index** | **Integer**|  |
 **cellArea** | **String**|  |
 **folder** | **String**|  | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsConditionalFormattingsPutWorksheetFormatConditionCondition"></a>
# **cellsConditionalFormattingsPutWorksheetFormatConditionCondition**
> SaaSposeResponse cellsConditionalFormattingsPutWorksheetFormatConditionCondition(name, sheetName, index, type, operatorType, formula1, formula2, folder)

Add a condition for format condition.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsConditionalFormattingsApi;


CellsConditionalFormattingsApi apiInstance = new CellsConditionalFormattingsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer index = 56; // Integer | 
String type = "type_example"; // String | 
String operatorType = "operatorType_example"; // String | 
String formula1 = "formula1_example"; // String | 
String formula2 = "formula2_example"; // String | 
String folder = "folder_example"; // String | 
try {
    SaaSposeResponse result = apiInstance.cellsConditionalFormattingsPutWorksheetFormatConditionCondition(name, sheetName, index, type, operatorType, formula1, formula2, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsConditionalFormattingsApi#cellsConditionalFormattingsPutWorksheetFormatConditionCondition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **index** | **Integer**|  |
 **type** | **String**|  |
 **operatorType** | **String**|  |
 **formula1** | **String**|  |
 **formula2** | **String**|  |
 **folder** | **String**|  | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

