# CellsHypelinksApi

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cellsHypelinksDeleteWorksheetHyperlink**](CellsHypelinksApi.md#cellsHypelinksDeleteWorksheetHyperlink) | **DELETE** /cells/{name}/worksheets/{sheetName}/hyperlinks/{hyperlinkIndex} | Delete worksheet hyperlink by index.
[**cellsHypelinksDeleteWorksheetHyperlinks**](CellsHypelinksApi.md#cellsHypelinksDeleteWorksheetHyperlinks) | **DELETE** /cells/{name}/worksheets/{sheetName}/hyperlinks | Delete all hyperlinks in worksheet.
[**cellsHypelinksGetWorksheetHyperlink**](CellsHypelinksApi.md#cellsHypelinksGetWorksheetHyperlink) | **GET** /cells/{name}/worksheets/{sheetName}/hyperlinks/{hyperlinkIndex} | Get worksheet hyperlink by index.
[**cellsHypelinksGetWorksheetHyperlinks**](CellsHypelinksApi.md#cellsHypelinksGetWorksheetHyperlinks) | **GET** /cells/{name}/worksheets/{sheetName}/hyperlinks | Get worksheet hyperlinks.
[**cellsHypelinksPostWorksheetHyperlink**](CellsHypelinksApi.md#cellsHypelinksPostWorksheetHyperlink) | **POST** /cells/{name}/worksheets/{sheetName}/hyperlinks/{hyperlinkIndex} | Update worksheet hyperlink by index.
[**cellsHypelinksPutWorksheetHyperlink**](CellsHypelinksApi.md#cellsHypelinksPutWorksheetHyperlink) | **PUT** /cells/{name}/worksheets/{sheetName}/hyperlinks | Add worksheet hyperlink.


<a name="cellsHypelinksDeleteWorksheetHyperlink"></a>
# **cellsHypelinksDeleteWorksheetHyperlink**
> SaaSposeResponse cellsHypelinksDeleteWorksheetHyperlink(name, sheetName, hyperlinkIndex, folder, storage)

Delete worksheet hyperlink by index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsHypelinksApi;


CellsHypelinksApi apiInstance = new CellsHypelinksApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer hyperlinkIndex = 56; // Integer | The hyperlink's index.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsHypelinksDeleteWorksheetHyperlink(name, sheetName, hyperlinkIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsHypelinksApi#cellsHypelinksDeleteWorksheetHyperlink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **hyperlinkIndex** | **Integer**| The hyperlink&#39;s index. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsHypelinksDeleteWorksheetHyperlinks"></a>
# **cellsHypelinksDeleteWorksheetHyperlinks**
> SaaSposeResponse cellsHypelinksDeleteWorksheetHyperlinks(name, sheetName, folder, storage)

Delete all hyperlinks in worksheet.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsHypelinksApi;


CellsHypelinksApi apiInstance = new CellsHypelinksApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsHypelinksDeleteWorksheetHyperlinks(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsHypelinksApi#cellsHypelinksDeleteWorksheetHyperlinks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsHypelinksGetWorksheetHyperlink"></a>
# **cellsHypelinksGetWorksheetHyperlink**
> HyperlinkResponse cellsHypelinksGetWorksheetHyperlink(name, sheetName, hyperlinkIndex, folder, storage)

Get worksheet hyperlink by index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsHypelinksApi;


CellsHypelinksApi apiInstance = new CellsHypelinksApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer hyperlinkIndex = 56; // Integer | The hyperlink's index.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    HyperlinkResponse result = apiInstance.cellsHypelinksGetWorksheetHyperlink(name, sheetName, hyperlinkIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsHypelinksApi#cellsHypelinksGetWorksheetHyperlink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **hyperlinkIndex** | **Integer**| The hyperlink&#39;s index. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**HyperlinkResponse**](HyperlinkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsHypelinksGetWorksheetHyperlinks"></a>
# **cellsHypelinksGetWorksheetHyperlinks**
> HyperlinksResponse cellsHypelinksGetWorksheetHyperlinks(name, sheetName, folder, storage)

Get worksheet hyperlinks.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsHypelinksApi;


CellsHypelinksApi apiInstance = new CellsHypelinksApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    HyperlinksResponse result = apiInstance.cellsHypelinksGetWorksheetHyperlinks(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsHypelinksApi#cellsHypelinksGetWorksheetHyperlinks");
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

[**HyperlinksResponse**](HyperlinksResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsHypelinksPostWorksheetHyperlink"></a>
# **cellsHypelinksPostWorksheetHyperlink**
> HyperlinkResponse cellsHypelinksPostWorksheetHyperlink(name, sheetName, hyperlinkIndex, hyperlink, folder, storage)

Update worksheet hyperlink by index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsHypelinksApi;


CellsHypelinksApi apiInstance = new CellsHypelinksApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer hyperlinkIndex = 56; // Integer | The hyperlink's index.
Hyperlink hyperlink = new Hyperlink(); // Hyperlink | Hyperlink object
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    HyperlinkResponse result = apiInstance.cellsHypelinksPostWorksheetHyperlink(name, sheetName, hyperlinkIndex, hyperlink, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsHypelinksApi#cellsHypelinksPostWorksheetHyperlink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **hyperlinkIndex** | **Integer**| The hyperlink&#39;s index. |
 **hyperlink** | [**Hyperlink**](Hyperlink.md)| Hyperlink object | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**HyperlinkResponse**](HyperlinkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsHypelinksPutWorksheetHyperlink"></a>
# **cellsHypelinksPutWorksheetHyperlink**
> HyperlinkResponse cellsHypelinksPutWorksheetHyperlink(name, sheetName, firstRow, firstColumn, totalRows, totalColumns, address, folder, storage)

Add worksheet hyperlink.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsHypelinksApi;


CellsHypelinksApi apiInstance = new CellsHypelinksApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer firstRow = 56; // Integer | 
Integer firstColumn = 56; // Integer | 
Integer totalRows = 56; // Integer | 
Integer totalColumns = 56; // Integer | 
String address = "address_example"; // String | 
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    HyperlinkResponse result = apiInstance.cellsHypelinksPutWorksheetHyperlink(name, sheetName, firstRow, firstColumn, totalRows, totalColumns, address, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsHypelinksApi#cellsHypelinksPutWorksheetHyperlink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **firstRow** | **Integer**|  |
 **firstColumn** | **Integer**|  |
 **totalRows** | **Integer**|  |
 **totalColumns** | **Integer**|  |
 **address** | **String**|  |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**HyperlinkResponse**](HyperlinkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

