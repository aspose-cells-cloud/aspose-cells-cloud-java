# CellsAutoFilterApi

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cellsAutoFilterDeleteWorksheetDateFilter**](CellsAutoFilterApi.md#cellsAutoFilterDeleteWorksheetDateFilter) | **DELETE** /cells/{name}/worksheets/{sheetName}/autoFilter/dateFilter | Removes a date filter.             
[**cellsAutoFilterDeleteWorksheetFilter**](CellsAutoFilterApi.md#cellsAutoFilterDeleteWorksheetFilter) | **DELETE** /cells/{name}/worksheets/{sheetName}/autoFilter/filter | Delete a filter for a filter column.             
[**cellsAutoFilterGetWorksheetAutoFilter**](CellsAutoFilterApi.md#cellsAutoFilterGetWorksheetAutoFilter) | **GET** /cells/{name}/worksheets/{sheetName}/autoFilter | Get Auto filter Description
[**cellsAutoFilterPostWorksheetAutoFilterRefresh**](CellsAutoFilterApi.md#cellsAutoFilterPostWorksheetAutoFilterRefresh) | **POST** /cells/{name}/worksheets/{sheetName}/autoFilter/refresh | 
[**cellsAutoFilterPostWorksheetMatchBlanks**](CellsAutoFilterApi.md#cellsAutoFilterPostWorksheetMatchBlanks) | **POST** /cells/{name}/worksheets/{sheetName}/autoFilter/matchBlanks | Match all blank cell in the list.
[**cellsAutoFilterPostWorksheetMatchNonBlanks**](CellsAutoFilterApi.md#cellsAutoFilterPostWorksheetMatchNonBlanks) | **POST** /cells/{name}/worksheets/{sheetName}/autoFilter/matchNonBlanks | Match all not blank cell in the list.             
[**cellsAutoFilterPutWorksheetColorFilter**](CellsAutoFilterApi.md#cellsAutoFilterPutWorksheetColorFilter) | **PUT** /cells/{name}/worksheets/{sheetName}/autoFilter/colorFilter | 
[**cellsAutoFilterPutWorksheetCustomFilter**](CellsAutoFilterApi.md#cellsAutoFilterPutWorksheetCustomFilter) | **PUT** /cells/{name}/worksheets/{sheetName}/autoFilter/custom | Filters a list with a custom criteria.             
[**cellsAutoFilterPutWorksheetDateFilter**](CellsAutoFilterApi.md#cellsAutoFilterPutWorksheetDateFilter) | **PUT** /cells/{name}/worksheets/{sheetName}/autoFilter/dateFilter | add date filter in worksheet 
[**cellsAutoFilterPutWorksheetDynamicFilter**](CellsAutoFilterApi.md#cellsAutoFilterPutWorksheetDynamicFilter) | **PUT** /cells/{name}/worksheets/{sheetName}/autoFilter/dynamicFilter | 
[**cellsAutoFilterPutWorksheetFilter**](CellsAutoFilterApi.md#cellsAutoFilterPutWorksheetFilter) | **PUT** /cells/{name}/worksheets/{sheetName}/autoFilter/filter | Adds a filter for a filter column.             
[**cellsAutoFilterPutWorksheetFilterTop10**](CellsAutoFilterApi.md#cellsAutoFilterPutWorksheetFilterTop10) | **PUT** /cells/{name}/worksheets/{sheetName}/autoFilter/filterTop10 | Filter the top 10 item in the list
[**cellsAutoFilterPutWorksheetIconFilter**](CellsAutoFilterApi.md#cellsAutoFilterPutWorksheetIconFilter) | **PUT** /cells/{name}/worksheets/{sheetName}/autoFilter/iconFilter | Adds an icon filter.


<a name="cellsAutoFilterDeleteWorksheetDateFilter"></a>
# **cellsAutoFilterDeleteWorksheetDateFilter**
> SaaSposeResponse cellsAutoFilterDeleteWorksheetDateFilter(name, sheetName, fieldIndex, dateTimeGroupingType, year, month, day, hour, minute, second, folder, storage)

Removes a date filter.             

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsAutoFilterApi;


CellsAutoFilterApi apiInstance = new CellsAutoFilterApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer fieldIndex = 56; // Integer | 
String dateTimeGroupingType = "dateTimeGroupingType_example"; // String | 
Integer year = 0; // Integer | 
Integer month = 0; // Integer | 
Integer day = 0; // Integer | 
Integer hour = 0; // Integer | 
Integer minute = 0; // Integer | 
Integer second = 0; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsAutoFilterDeleteWorksheetDateFilter(name, sheetName, fieldIndex, dateTimeGroupingType, year, month, day, hour, minute, second, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsAutoFilterApi#cellsAutoFilterDeleteWorksheetDateFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **fieldIndex** | **Integer**|  |
 **dateTimeGroupingType** | **String**|  |
 **year** | **Integer**|  | [optional] [default to 0]
 **month** | **Integer**|  | [optional] [default to 0]
 **day** | **Integer**|  | [optional] [default to 0]
 **hour** | **Integer**|  | [optional] [default to 0]
 **minute** | **Integer**|  | [optional] [default to 0]
 **second** | **Integer**|  | [optional] [default to 0]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoFilterDeleteWorksheetFilter"></a>
# **cellsAutoFilterDeleteWorksheetFilter**
> SaaSposeResponse cellsAutoFilterDeleteWorksheetFilter(name, sheetName, fieldIndex, criteria, folder, storage)

Delete a filter for a filter column.             

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsAutoFilterApi;


CellsAutoFilterApi apiInstance = new CellsAutoFilterApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer fieldIndex = 56; // Integer | 
String criteria = "criteria_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsAutoFilterDeleteWorksheetFilter(name, sheetName, fieldIndex, criteria, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsAutoFilterApi#cellsAutoFilterDeleteWorksheetFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **fieldIndex** | **Integer**|  |
 **criteria** | **String**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoFilterGetWorksheetAutoFilter"></a>
# **cellsAutoFilterGetWorksheetAutoFilter**
> AutoFilterResponse cellsAutoFilterGetWorksheetAutoFilter(name, sheetName, folder, storage)

Get Auto filter Description

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsAutoFilterApi;


CellsAutoFilterApi apiInstance = new CellsAutoFilterApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    AutoFilterResponse result = apiInstance.cellsAutoFilterGetWorksheetAutoFilter(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsAutoFilterApi#cellsAutoFilterGetWorksheetAutoFilter");
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

[**AutoFilterResponse**](AutoFilterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoFilterPostWorksheetAutoFilterRefresh"></a>
# **cellsAutoFilterPostWorksheetAutoFilterRefresh**
> SaaSposeResponse cellsAutoFilterPostWorksheetAutoFilterRefresh(name, sheetName, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsAutoFilterApi;


CellsAutoFilterApi apiInstance = new CellsAutoFilterApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsAutoFilterPostWorksheetAutoFilterRefresh(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsAutoFilterApi#cellsAutoFilterPostWorksheetAutoFilterRefresh");
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

<a name="cellsAutoFilterPostWorksheetMatchBlanks"></a>
# **cellsAutoFilterPostWorksheetMatchBlanks**
> SaaSposeResponse cellsAutoFilterPostWorksheetMatchBlanks(name, sheetName, fieldIndex, folder, storage)

Match all blank cell in the list.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsAutoFilterApi;


CellsAutoFilterApi apiInstance = new CellsAutoFilterApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer fieldIndex = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsAutoFilterPostWorksheetMatchBlanks(name, sheetName, fieldIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsAutoFilterApi#cellsAutoFilterPostWorksheetMatchBlanks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **fieldIndex** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoFilterPostWorksheetMatchNonBlanks"></a>
# **cellsAutoFilterPostWorksheetMatchNonBlanks**
> SaaSposeResponse cellsAutoFilterPostWorksheetMatchNonBlanks(name, sheetName, fieldIndex, folder, storage)

Match all not blank cell in the list.             

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsAutoFilterApi;


CellsAutoFilterApi apiInstance = new CellsAutoFilterApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer fieldIndex = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsAutoFilterPostWorksheetMatchNonBlanks(name, sheetName, fieldIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsAutoFilterApi#cellsAutoFilterPostWorksheetMatchNonBlanks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **fieldIndex** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoFilterPutWorksheetColorFilter"></a>
# **cellsAutoFilterPutWorksheetColorFilter**
> SaaSposeResponse cellsAutoFilterPutWorksheetColorFilter(name, sheetName, range, fieldIndex, colorFilter, matchBlanks, refresh, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsAutoFilterApi;


CellsAutoFilterApi apiInstance = new CellsAutoFilterApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String range = "range_example"; // String | 
Integer fieldIndex = 56; // Integer | 
ColorFilterRequest colorFilter = new ColorFilterRequest(); // ColorFilterRequest | 
Boolean matchBlanks = true; // Boolean | 
Boolean refresh = true; // Boolean | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsAutoFilterPutWorksheetColorFilter(name, sheetName, range, fieldIndex, colorFilter, matchBlanks, refresh, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsAutoFilterApi#cellsAutoFilterPutWorksheetColorFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **range** | **String**|  |
 **fieldIndex** | **Integer**|  |
 **colorFilter** | [**ColorFilterRequest**](ColorFilterRequest.md)|  | [optional]
 **matchBlanks** | **Boolean**|  | [optional]
 **refresh** | **Boolean**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoFilterPutWorksheetCustomFilter"></a>
# **cellsAutoFilterPutWorksheetCustomFilter**
> SaaSposeResponse cellsAutoFilterPutWorksheetCustomFilter(name, sheetName, range, fieldIndex, operatorType1, criteria1, isAnd, operatorType2, criteria2, matchBlanks, refresh, folder, storage)

Filters a list with a custom criteria.             

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsAutoFilterApi;


CellsAutoFilterApi apiInstance = new CellsAutoFilterApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String range = "range_example"; // String | 
Integer fieldIndex = 56; // Integer | 
String operatorType1 = "operatorType1_example"; // String | 
String criteria1 = "criteria1_example"; // String | 
Boolean isAnd = true; // Boolean | 
String operatorType2 = "operatorType2_example"; // String | 
String criteria2 = "criteria2_example"; // String | 
Boolean matchBlanks = true; // Boolean | 
Boolean refresh = true; // Boolean | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsAutoFilterPutWorksheetCustomFilter(name, sheetName, range, fieldIndex, operatorType1, criteria1, isAnd, operatorType2, criteria2, matchBlanks, refresh, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsAutoFilterApi#cellsAutoFilterPutWorksheetCustomFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **range** | **String**|  |
 **fieldIndex** | **Integer**|  |
 **operatorType1** | **String**|  |
 **criteria1** | **String**|  |
 **isAnd** | **Boolean**|  | [optional]
 **operatorType2** | **String**|  | [optional]
 **criteria2** | **String**|  | [optional]
 **matchBlanks** | **Boolean**|  | [optional]
 **refresh** | **Boolean**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoFilterPutWorksheetDateFilter"></a>
# **cellsAutoFilterPutWorksheetDateFilter**
> SaaSposeResponse cellsAutoFilterPutWorksheetDateFilter(name, sheetName, range, fieldIndex, dateTimeGroupingType, year, month, day, hour, minute, second, matchBlanks, refresh, folder, storage)

add date filter in worksheet 

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsAutoFilterApi;


CellsAutoFilterApi apiInstance = new CellsAutoFilterApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String range = "range_example"; // String | 
Integer fieldIndex = 56; // Integer | 
String dateTimeGroupingType = "dateTimeGroupingType_example"; // String | 
Integer year = 0; // Integer | 
Integer month = 0; // Integer | 
Integer day = 0; // Integer | 
Integer hour = 0; // Integer | 
Integer minute = 0; // Integer | 
Integer second = 0; // Integer | 
Boolean matchBlanks = true; // Boolean | 
Boolean refresh = true; // Boolean | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsAutoFilterPutWorksheetDateFilter(name, sheetName, range, fieldIndex, dateTimeGroupingType, year, month, day, hour, minute, second, matchBlanks, refresh, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsAutoFilterApi#cellsAutoFilterPutWorksheetDateFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **range** | **String**|  |
 **fieldIndex** | **Integer**|  |
 **dateTimeGroupingType** | **String**|  |
 **year** | **Integer**|  | [optional] [default to 0]
 **month** | **Integer**|  | [optional] [default to 0]
 **day** | **Integer**|  | [optional] [default to 0]
 **hour** | **Integer**|  | [optional] [default to 0]
 **minute** | **Integer**|  | [optional] [default to 0]
 **second** | **Integer**|  | [optional] [default to 0]
 **matchBlanks** | **Boolean**|  | [optional]
 **refresh** | **Boolean**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoFilterPutWorksheetDynamicFilter"></a>
# **cellsAutoFilterPutWorksheetDynamicFilter**
> SaaSposeResponse cellsAutoFilterPutWorksheetDynamicFilter(name, sheetName, range, fieldIndex, dynamicFilterType, matchBlanks, refresh, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsAutoFilterApi;


CellsAutoFilterApi apiInstance = new CellsAutoFilterApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String range = "range_example"; // String | 
Integer fieldIndex = 56; // Integer | 
String dynamicFilterType = "dynamicFilterType_example"; // String | 
Boolean matchBlanks = true; // Boolean | 
Boolean refresh = true; // Boolean | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsAutoFilterPutWorksheetDynamicFilter(name, sheetName, range, fieldIndex, dynamicFilterType, matchBlanks, refresh, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsAutoFilterApi#cellsAutoFilterPutWorksheetDynamicFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **range** | **String**|  |
 **fieldIndex** | **Integer**|  |
 **dynamicFilterType** | **String**|  |
 **matchBlanks** | **Boolean**|  | [optional]
 **refresh** | **Boolean**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoFilterPutWorksheetFilter"></a>
# **cellsAutoFilterPutWorksheetFilter**
> SaaSposeResponse cellsAutoFilterPutWorksheetFilter(name, sheetName, range, fieldIndex, criteria, matchBlanks, refresh, folder, storage)

Adds a filter for a filter column.             

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsAutoFilterApi;


CellsAutoFilterApi apiInstance = new CellsAutoFilterApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String range = "range_example"; // String | 
Integer fieldIndex = 56; // Integer | 
String criteria = "criteria_example"; // String | 
Boolean matchBlanks = true; // Boolean | 
Boolean refresh = true; // Boolean | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsAutoFilterPutWorksheetFilter(name, sheetName, range, fieldIndex, criteria, matchBlanks, refresh, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsAutoFilterApi#cellsAutoFilterPutWorksheetFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **range** | **String**|  |
 **fieldIndex** | **Integer**|  |
 **criteria** | **String**|  |
 **matchBlanks** | **Boolean**|  | [optional]
 **refresh** | **Boolean**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoFilterPutWorksheetFilterTop10"></a>
# **cellsAutoFilterPutWorksheetFilterTop10**
> SaaSposeResponse cellsAutoFilterPutWorksheetFilterTop10(name, sheetName, range, fieldIndex, isTop, isPercent, itemCount, matchBlanks, refresh, folder, storage)

Filter the top 10 item in the list

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsAutoFilterApi;


CellsAutoFilterApi apiInstance = new CellsAutoFilterApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String range = "range_example"; // String | 
Integer fieldIndex = 56; // Integer | 
Boolean isTop = true; // Boolean | 
Boolean isPercent = true; // Boolean | 
Integer itemCount = 56; // Integer | 
Boolean matchBlanks = true; // Boolean | 
Boolean refresh = true; // Boolean | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsAutoFilterPutWorksheetFilterTop10(name, sheetName, range, fieldIndex, isTop, isPercent, itemCount, matchBlanks, refresh, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsAutoFilterApi#cellsAutoFilterPutWorksheetFilterTop10");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **range** | **String**|  |
 **fieldIndex** | **Integer**|  |
 **isTop** | **Boolean**|  |
 **isPercent** | **Boolean**|  |
 **itemCount** | **Integer**|  |
 **matchBlanks** | **Boolean**|  | [optional]
 **refresh** | **Boolean**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoFilterPutWorksheetIconFilter"></a>
# **cellsAutoFilterPutWorksheetIconFilter**
> SaaSposeResponse cellsAutoFilterPutWorksheetIconFilter(name, sheetName, range, fieldIndex, iconSetType, iconId, matchBlanks, refresh, folder, storage)

Adds an icon filter.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsAutoFilterApi;


CellsAutoFilterApi apiInstance = new CellsAutoFilterApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String range = "range_example"; // String | 
Integer fieldIndex = 56; // Integer | 
String iconSetType = "iconSetType_example"; // String | 
Integer iconId = 56; // Integer | 
Boolean matchBlanks = true; // Boolean | 
Boolean refresh = true; // Boolean | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsAutoFilterPutWorksheetIconFilter(name, sheetName, range, fieldIndex, iconSetType, iconId, matchBlanks, refresh, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsAutoFilterApi#cellsAutoFilterPutWorksheetIconFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **range** | **String**|  |
 **fieldIndex** | **Integer**|  |
 **iconSetType** | **String**|  |
 **iconId** | **Integer**|  |
 **matchBlanks** | **Boolean**|  | [optional]
 **refresh** | **Boolean**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

