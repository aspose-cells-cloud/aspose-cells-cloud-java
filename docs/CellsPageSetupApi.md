# CellsPageSetupApi

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cellsPageSetupDeleteHeaderFooter**](CellsPageSetupApi.md#cellsPageSetupDeleteHeaderFooter) | **DELETE** /cells/{name}/worksheets/{sheetName}/pagesetup/clearheaderfooter | clear header footer
[**cellsPageSetupGetFooter**](CellsPageSetupApi.md#cellsPageSetupGetFooter) | **GET** /cells/{name}/worksheets/{sheetName}/pagesetup/footer | get page footer information
[**cellsPageSetupGetHeader**](CellsPageSetupApi.md#cellsPageSetupGetHeader) | **GET** /cells/{name}/worksheets/{sheetName}/pagesetup/header | get page header information
[**cellsPageSetupGetPageSetup**](CellsPageSetupApi.md#cellsPageSetupGetPageSetup) | **GET** /cells/{name}/worksheets/{sheetName}/pagesetup | Get Page Setup information.             
[**cellsPageSetupPostFooter**](CellsPageSetupApi.md#cellsPageSetupPostFooter) | **POST** /cells/{name}/worksheets/{sheetName}/pagesetup/footer | update  page footer information 
[**cellsPageSetupPostHeader**](CellsPageSetupApi.md#cellsPageSetupPostHeader) | **POST** /cells/{name}/worksheets/{sheetName}/pagesetup/header | update  page header information 
[**cellsPageSetupPostPageSetup**](CellsPageSetupApi.md#cellsPageSetupPostPageSetup) | **POST** /cells/{name}/worksheets/{sheetName}/pagesetup | Update Page Setup information.


<a name="cellsPageSetupDeleteHeaderFooter"></a>
# **cellsPageSetupDeleteHeaderFooter**
> SaaSposeResponse cellsPageSetupDeleteHeaderFooter(name, sheetName, folder)

clear header footer

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPageSetupApi;


CellsPageSetupApi apiInstance = new CellsPageSetupApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String folder = "folder_example"; // String | 
try {
    SaaSposeResponse result = apiInstance.cellsPageSetupDeleteHeaderFooter(name, sheetName, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPageSetupApi#cellsPageSetupDeleteHeaderFooter");
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

<a name="cellsPageSetupGetFooter"></a>
# **cellsPageSetupGetFooter**
> PageSectionsResponse cellsPageSetupGetFooter(name, sheetName, folder)

get page footer information

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPageSetupApi;


CellsPageSetupApi apiInstance = new CellsPageSetupApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String folder = "folder_example"; // String | 
try {
    PageSectionsResponse result = apiInstance.cellsPageSetupGetFooter(name, sheetName, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPageSetupApi#cellsPageSetupGetFooter");
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

[**PageSectionsResponse**](PageSectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageSetupGetHeader"></a>
# **cellsPageSetupGetHeader**
> PageSectionsResponse cellsPageSetupGetHeader(name, sheetName, folder)

get page header information

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPageSetupApi;


CellsPageSetupApi apiInstance = new CellsPageSetupApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String folder = "folder_example"; // String | 
try {
    PageSectionsResponse result = apiInstance.cellsPageSetupGetHeader(name, sheetName, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPageSetupApi#cellsPageSetupGetHeader");
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

[**PageSectionsResponse**](PageSectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageSetupGetPageSetup"></a>
# **cellsPageSetupGetPageSetup**
> PageSetupResponse cellsPageSetupGetPageSetup(name, sheetName, folder)

Get Page Setup information.             

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPageSetupApi;


CellsPageSetupApi apiInstance = new CellsPageSetupApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String folder = "folder_example"; // String | 
try {
    PageSetupResponse result = apiInstance.cellsPageSetupGetPageSetup(name, sheetName, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPageSetupApi#cellsPageSetupGetPageSetup");
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

[**PageSetupResponse**](PageSetupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageSetupPostFooter"></a>
# **cellsPageSetupPostFooter**
> SaaSposeResponse cellsPageSetupPostFooter(name, sheetName, section, script, isFirstPage, folder)

update  page footer information 

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPageSetupApi;


CellsPageSetupApi apiInstance = new CellsPageSetupApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer section = 56; // Integer | 
String script = "script_example"; // String | 
Boolean isFirstPage = true; // Boolean | 
String folder = "folder_example"; // String | 
try {
    SaaSposeResponse result = apiInstance.cellsPageSetupPostFooter(name, sheetName, section, script, isFirstPage, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPageSetupApi#cellsPageSetupPostFooter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **section** | **Integer**|  |
 **script** | **String**|  |
 **isFirstPage** | **Boolean**|  |
 **folder** | **String**|  | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageSetupPostHeader"></a>
# **cellsPageSetupPostHeader**
> SaaSposeResponse cellsPageSetupPostHeader(name, sheetName, section, script, isFirstPage, folder)

update  page header information 

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPageSetupApi;


CellsPageSetupApi apiInstance = new CellsPageSetupApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer section = 56; // Integer | 
String script = "script_example"; // String | 
Boolean isFirstPage = true; // Boolean | 
String folder = "folder_example"; // String | 
try {
    SaaSposeResponse result = apiInstance.cellsPageSetupPostHeader(name, sheetName, section, script, isFirstPage, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPageSetupApi#cellsPageSetupPostHeader");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **section** | **Integer**|  |
 **script** | **String**|  |
 **isFirstPage** | **Boolean**|  |
 **folder** | **String**|  | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageSetupPostPageSetup"></a>
# **cellsPageSetupPostPageSetup**
> SaaSposeResponse cellsPageSetupPostPageSetup(name, sheetName, pageSetup, folder)

Update Page Setup information.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPageSetupApi;


CellsPageSetupApi apiInstance = new CellsPageSetupApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
PageSetup pageSetup = new PageSetup(); // PageSetup | 
String folder = "folder_example"; // String | 
try {
    SaaSposeResponse result = apiInstance.cellsPageSetupPostPageSetup(name, sheetName, pageSetup, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPageSetupApi#cellsPageSetupPostPageSetup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **pageSetup** | [**PageSetup**](PageSetup.md)|  | [optional]
 **folder** | **String**|  | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

