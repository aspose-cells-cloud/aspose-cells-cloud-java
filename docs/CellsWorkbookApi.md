# CellsWorkbookApi

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cellsWorkbookDeleteDecryptDocument**](CellsWorkbookApi.md#cellsWorkbookDeleteDecryptDocument) | **DELETE** /cells/{name}/encryption | Decrypt document.
[**cellsWorkbookDeleteDocumentUnprotectFromChanges**](CellsWorkbookApi.md#cellsWorkbookDeleteDocumentUnprotectFromChanges) | **DELETE** /cells/{name}/writeProtection | Unprotect document from changes.
[**cellsWorkbookDeleteUnprotectDocument**](CellsWorkbookApi.md#cellsWorkbookDeleteUnprotectDocument) | **DELETE** /cells/{name}/protection | Unprotect document.
[**cellsWorkbookDeleteWorkbookName**](CellsWorkbookApi.md#cellsWorkbookDeleteWorkbookName) | **DELETE** /cells/{name}/names/{nameName} | Clean workbook&#39;s names.
[**cellsWorkbookDeleteWorkbookNames**](CellsWorkbookApi.md#cellsWorkbookDeleteWorkbookNames) | **DELETE** /cells/{name}/names | Clean workbook&#39;s names.
[**cellsWorkbookGetWorkbook**](CellsWorkbookApi.md#cellsWorkbookGetWorkbook) | **GET** /cells/{name} | Read workbook info or export.
[**cellsWorkbookGetWorkbookDefaultStyle**](CellsWorkbookApi.md#cellsWorkbookGetWorkbookDefaultStyle) | **GET** /cells/{name}/defaultstyle | Read workbook default style info.
[**cellsWorkbookGetWorkbookName**](CellsWorkbookApi.md#cellsWorkbookGetWorkbookName) | **GET** /cells/{name}/names/{nameName} | Read workbook&#39;s name.
[**cellsWorkbookGetWorkbookNameValue**](CellsWorkbookApi.md#cellsWorkbookGetWorkbookNameValue) | **GET** /cells/{name}/names/{nameName}/value | Get workbook&#39;s name value.
[**cellsWorkbookGetWorkbookNames**](CellsWorkbookApi.md#cellsWorkbookGetWorkbookNames) | **GET** /cells/{name}/names | Read workbook&#39;s names.
[**cellsWorkbookGetWorkbookSettings**](CellsWorkbookApi.md#cellsWorkbookGetWorkbookSettings) | **GET** /cells/{name}/settings | Get Workbook Settings DTO
[**cellsWorkbookGetWorkbookTextItems**](CellsWorkbookApi.md#cellsWorkbookGetWorkbookTextItems) | **GET** /cells/{name}/textItems | Read workbook&#39;s text items.
[**cellsWorkbookPostAutofitWorkbookRows**](CellsWorkbookApi.md#cellsWorkbookPostAutofitWorkbookRows) | **POST** /cells/{name}/autofitrows | Autofit workbook rows.
[**cellsWorkbookPostEncryptDocument**](CellsWorkbookApi.md#cellsWorkbookPostEncryptDocument) | **POST** /cells/{name}/encryption | Encript document.
[**cellsWorkbookPostImportData**](CellsWorkbookApi.md#cellsWorkbookPostImportData) | **POST** /cells/{name}/importdata | 
[**cellsWorkbookPostProtectDocument**](CellsWorkbookApi.md#cellsWorkbookPostProtectDocument) | **POST** /cells/{name}/protection | Protect document.
[**cellsWorkbookPostWorkbookCalculateFormula**](CellsWorkbookApi.md#cellsWorkbookPostWorkbookCalculateFormula) | **POST** /cells/{name}/calculateformula | Calculate all formulas in workbook.
[**cellsWorkbookPostWorkbookGetSmartMarkerResult**](CellsWorkbookApi.md#cellsWorkbookPostWorkbookGetSmartMarkerResult) | **POST** /cells/{name}/smartmarker | Smart marker processing result.
[**cellsWorkbookPostWorkbookSettings**](CellsWorkbookApi.md#cellsWorkbookPostWorkbookSettings) | **POST** /cells/{name}/settings | Update Workbook setting 
[**cellsWorkbookPostWorkbookSplit**](CellsWorkbookApi.md#cellsWorkbookPostWorkbookSplit) | **POST** /cells/{name}/split | Split workbook.
[**cellsWorkbookPostWorkbooksMerge**](CellsWorkbookApi.md#cellsWorkbookPostWorkbooksMerge) | **POST** /cells/{name}/merge | Merge workbooks.
[**cellsWorkbookPostWorkbooksTextReplace**](CellsWorkbookApi.md#cellsWorkbookPostWorkbooksTextReplace) | **POST** /cells/{name}/replaceText | Replace text.
[**cellsWorkbookPostWorkbooksTextSearch**](CellsWorkbookApi.md#cellsWorkbookPostWorkbooksTextSearch) | **POST** /cells/{name}/findText | Search text.
[**cellsWorkbookPutConvertWorkbook**](CellsWorkbookApi.md#cellsWorkbookPutConvertWorkbook) | **PUT** /cells/convert | Convert workbook from request content to some format.
[**cellsWorkbookPutDocumentProtectFromChanges**](CellsWorkbookApi.md#cellsWorkbookPutDocumentProtectFromChanges) | **PUT** /cells/{name}/writeProtection | Protect document from changes.
[**cellsWorkbookPutWorkbookCreate**](CellsWorkbookApi.md#cellsWorkbookPutWorkbookCreate) | **PUT** /cells/{name} | Create new workbook using deferent methods.


<a name="cellsWorkbookDeleteDecryptDocument"></a>
# **cellsWorkbookDeleteDecryptDocument**
> SaaSposeResponse cellsWorkbookDeleteDecryptDocument(name, encryption, folder, storage)

Decrypt document.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | The document name.
WorkbookEncryptionRequest encryption = new WorkbookEncryptionRequest(); // WorkbookEncryptionRequest | Encryption settings, only password can be specified.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorkbookDeleteDecryptDocument(name, encryption, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookDeleteDecryptDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **encryption** | [**WorkbookEncryptionRequest**](WorkbookEncryptionRequest.md)| Encryption settings, only password can be specified. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookDeleteDocumentUnprotectFromChanges"></a>
# **cellsWorkbookDeleteDocumentUnprotectFromChanges**
> SaaSposeResponse cellsWorkbookDeleteDocumentUnprotectFromChanges(name, folder, storage)

Unprotect document from changes.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorkbookDeleteDocumentUnprotectFromChanges(name, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookDeleteDocumentUnprotectFromChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookDeleteUnprotectDocument"></a>
# **cellsWorkbookDeleteUnprotectDocument**
> SaaSposeResponse cellsWorkbookDeleteUnprotectDocument(name, protection, folder, storage)

Unprotect document.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | The document name.
WorkbookProtectionRequest protection = new WorkbookProtectionRequest(); // WorkbookProtectionRequest | Protection settings, only password can be specified.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorkbookDeleteUnprotectDocument(name, protection, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookDeleteUnprotectDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **protection** | [**WorkbookProtectionRequest**](WorkbookProtectionRequest.md)| Protection settings, only password can be specified. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookDeleteWorkbookName"></a>
# **cellsWorkbookDeleteWorkbookName**
> SaaSposeResponse cellsWorkbookDeleteWorkbookName(name, nameName, folder, storage)

Clean workbook&#39;s names.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | The workbook name.
String nameName = "nameName_example"; // String | The name.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorkbookDeleteWorkbookName(name, nameName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookDeleteWorkbookName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **nameName** | **String**| The name. |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookDeleteWorkbookNames"></a>
# **cellsWorkbookDeleteWorkbookNames**
> SaaSposeResponse cellsWorkbookDeleteWorkbookNames(name, folder, storage)

Clean workbook&#39;s names.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | The workbook name.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorkbookDeleteWorkbookNames(name, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookDeleteWorkbookNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookGetWorkbook"></a>
# **cellsWorkbookGetWorkbook**
> File cellsWorkbookGetWorkbook(name, password, format, isAutoFit, onlySaveTable, folder, storage, outPath)

Read workbook info or export.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | The document name.
String password = "password_example"; // String | The document password.
String format = "format_example"; // String | The exported file format.
Boolean isAutoFit = false; // Boolean | Set document rows to be autofit.
Boolean onlySaveTable = false; // Boolean | Only save table data.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
String outPath = "outPath_example"; // String | The document output folder.
try {
    File result = apiInstance.cellsWorkbookGetWorkbook(name, password, format, isAutoFit, onlySaveTable, folder, storage, outPath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookGetWorkbook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **password** | **String**| The document password. | [optional]
 **format** | **String**| The exported file format. | [optional]
 **isAutoFit** | **Boolean**| Set document rows to be autofit. | [optional] [default to false]
 **onlySaveTable** | **Boolean**| Only save table data. | [optional] [default to false]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]
 **outPath** | **String**| The document output folder. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookGetWorkbookDefaultStyle"></a>
# **cellsWorkbookGetWorkbookDefaultStyle**
> StyleResponse cellsWorkbookGetWorkbookDefaultStyle(name, folder, storage)

Read workbook default style info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | The workbook name.
String folder = "folder_example"; // String | The document's folder.
String storage = "storage_example"; // String | storage name.
try {
    StyleResponse result = apiInstance.cellsWorkbookGetWorkbookDefaultStyle(name, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookGetWorkbookDefaultStyle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **folder** | **String**| The document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**StyleResponse**](StyleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookGetWorkbookName"></a>
# **cellsWorkbookGetWorkbookName**
> NameResponse cellsWorkbookGetWorkbookName(name, nameName, folder, storage)

Read workbook&#39;s name.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | The workbook name.
String nameName = "nameName_example"; // String | The name.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    NameResponse result = apiInstance.cellsWorkbookGetWorkbookName(name, nameName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookGetWorkbookName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **nameName** | **String**| The name. |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**NameResponse**](NameResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookGetWorkbookNameValue"></a>
# **cellsWorkbookGetWorkbookNameValue**
> RangeValueResponse cellsWorkbookGetWorkbookNameValue(name, nameName, folder, storage)

Get workbook&#39;s name value.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | The workbook name.
String nameName = "nameName_example"; // String | The name.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    RangeValueResponse result = apiInstance.cellsWorkbookGetWorkbookNameValue(name, nameName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookGetWorkbookNameValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **nameName** | **String**| The name. |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**RangeValueResponse**](RangeValueResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookGetWorkbookNames"></a>
# **cellsWorkbookGetWorkbookNames**
> NamesResponse cellsWorkbookGetWorkbookNames(name, folder, storage)

Read workbook&#39;s names.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | The workbook name.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    NamesResponse result = apiInstance.cellsWorkbookGetWorkbookNames(name, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookGetWorkbookNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**NamesResponse**](NamesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookGetWorkbookSettings"></a>
# **cellsWorkbookGetWorkbookSettings**
> WorkbookSettingsResponse cellsWorkbookGetWorkbookSettings(name, folder, storage)

Get Workbook Settings DTO

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | Document name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    WorkbookSettingsResponse result = apiInstance.cellsWorkbookGetWorkbookSettings(name, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookGetWorkbookSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorkbookSettingsResponse**](WorkbookSettingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookGetWorkbookTextItems"></a>
# **cellsWorkbookGetWorkbookTextItems**
> TextItemsResponse cellsWorkbookGetWorkbookTextItems(name, folder, storage)

Read workbook&#39;s text items.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | The workbook name.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    TextItemsResponse result = apiInstance.cellsWorkbookGetWorkbookTextItems(name, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookGetWorkbookTextItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**TextItemsResponse**](TextItemsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPostAutofitWorkbookRows"></a>
# **cellsWorkbookPostAutofitWorkbookRows**
> SaaSposeResponse cellsWorkbookPostAutofitWorkbookRows(name, autoFitterOptions, startRow, endRow, onlyAuto, folder, storage)

Autofit workbook rows.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | Document name.
AutoFitterOptions autoFitterOptions = new AutoFitterOptions(); // AutoFitterOptions | Auto Fitter Options.
Integer startRow = 56; // Integer | Start row.
Integer endRow = 56; // Integer | End row.
Boolean onlyAuto = false; // Boolean | Only auto.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorkbookPostAutofitWorkbookRows(name, autoFitterOptions, startRow, endRow, onlyAuto, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookPostAutofitWorkbookRows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
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

<a name="cellsWorkbookPostEncryptDocument"></a>
# **cellsWorkbookPostEncryptDocument**
> SaaSposeResponse cellsWorkbookPostEncryptDocument(name, encryption, folder, storage)

Encript document.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | The document name.
WorkbookEncryptionRequest encryption = new WorkbookEncryptionRequest(); // WorkbookEncryptionRequest | Encryption parameters.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorkbookPostEncryptDocument(name, encryption, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookPostEncryptDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **encryption** | [**WorkbookEncryptionRequest**](WorkbookEncryptionRequest.md)| Encryption parameters. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPostImportData"></a>
# **cellsWorkbookPostImportData**
> SaaSposeResponse cellsWorkbookPostImportData(name, importdata, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | 
ImportOption importdata = new ImportOption(); // ImportOption | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorkbookPostImportData(name, importdata, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookPostImportData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **importdata** | [**ImportOption**](ImportOption.md)|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPostProtectDocument"></a>
# **cellsWorkbookPostProtectDocument**
> SaaSposeResponse cellsWorkbookPostProtectDocument(name, protection, folder, storage)

Protect document.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | The document name.
WorkbookProtectionRequest protection = new WorkbookProtectionRequest(); // WorkbookProtectionRequest | The protection settings.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorkbookPostProtectDocument(name, protection, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookPostProtectDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **protection** | [**WorkbookProtectionRequest**](WorkbookProtectionRequest.md)| The protection settings. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPostWorkbookCalculateFormula"></a>
# **cellsWorkbookPostWorkbookCalculateFormula**
> SaaSposeResponse cellsWorkbookPostWorkbookCalculateFormula(name, options, ignoreError, folder, storage)

Calculate all formulas in workbook.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | Document name.
CalculationOptions options = new CalculationOptions(); // CalculationOptions | Calculation Options.
Boolean ignoreError = true; // Boolean | ignore Error.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorkbookPostWorkbookCalculateFormula(name, options, ignoreError, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookPostWorkbookCalculateFormula");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **options** | [**CalculationOptions**](CalculationOptions.md)| Calculation Options. | [optional]
 **ignoreError** | **Boolean**| ignore Error. | [optional]
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPostWorkbookGetSmartMarkerResult"></a>
# **cellsWorkbookPostWorkbookGetSmartMarkerResult**
> File cellsWorkbookPostWorkbookGetSmartMarkerResult(name, xmlFile, folder, storage, outPath)

Smart marker processing result.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | The workbook name.
String xmlFile = "xmlFile_example"; // String | The xml file full path, if empty the data is read from request body.
String folder = "folder_example"; // String | The workbook folder full path.
String storage = "storage_example"; // String | storage name.
String outPath = "outPath_example"; // String | Path to save result
try {
    File result = apiInstance.cellsWorkbookPostWorkbookGetSmartMarkerResult(name, xmlFile, folder, storage, outPath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookPostWorkbookGetSmartMarkerResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **xmlFile** | **String**| The xml file full path, if empty the data is read from request body. | [optional]
 **folder** | **String**| The workbook folder full path. | [optional]
 **storage** | **String**| storage name. | [optional]
 **outPath** | **String**| Path to save result | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPostWorkbookSettings"></a>
# **cellsWorkbookPostWorkbookSettings**
> SaaSposeResponse cellsWorkbookPostWorkbookSettings(name, settings, folder, storage)

Update Workbook setting 

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | Document name.
WorkbookSettings settings = new WorkbookSettings(); // WorkbookSettings | Workbook Setting DTO
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorkbookPostWorkbookSettings(name, settings, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookPostWorkbookSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **settings** | [**WorkbookSettings**](WorkbookSettings.md)| Workbook Setting DTO | [optional]
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPostWorkbookSplit"></a>
# **cellsWorkbookPostWorkbookSplit**
> SplitResultResponse cellsWorkbookPostWorkbookSplit(name, format, from, to, horizontalResolution, verticalResolution, folder, storage)

Split workbook.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | The workbook name.
String format = "format_example"; // String | Split format.
Integer from = 0; // Integer | Start worksheet index.
Integer to = 0; // Integer | End worksheet index.
Integer horizontalResolution = 0; // Integer | Image horizontal resolution.
Integer verticalResolution = 0; // Integer | Image vertical resolution.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    SplitResultResponse result = apiInstance.cellsWorkbookPostWorkbookSplit(name, format, from, to, horizontalResolution, verticalResolution, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookPostWorkbookSplit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **format** | **String**| Split format. | [optional]
 **from** | **Integer**| Start worksheet index. | [optional] [default to 0]
 **to** | **Integer**| End worksheet index. | [optional] [default to 0]
 **horizontalResolution** | **Integer**| Image horizontal resolution. | [optional] [default to 0]
 **verticalResolution** | **Integer**| Image vertical resolution. | [optional] [default to 0]
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SplitResultResponse**](SplitResultResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPostWorkbooksMerge"></a>
# **cellsWorkbookPostWorkbooksMerge**
> WorkbookResponse cellsWorkbookPostWorkbooksMerge(name, mergeWith, folder, storage)

Merge workbooks.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | Workbook name.
String mergeWith = "mergeWith_example"; // String | The workbook to merge with.
String folder = "folder_example"; // String | Source workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    WorkbookResponse result = apiInstance.cellsWorkbookPostWorkbooksMerge(name, mergeWith, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookPostWorkbooksMerge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **mergeWith** | **String**| The workbook to merge with. |
 **folder** | **String**| Source workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorkbookResponse**](WorkbookResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPostWorkbooksTextReplace"></a>
# **cellsWorkbookPostWorkbooksTextReplace**
> WorkbookReplaceResponse cellsWorkbookPostWorkbooksTextReplace(name, oldValue, newValue, folder, storage)

Replace text.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | Document name.
String oldValue = "oldValue_example"; // String | The old value.
String newValue = "newValue_example"; // String | The new value.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    WorkbookReplaceResponse result = apiInstance.cellsWorkbookPostWorkbooksTextReplace(name, oldValue, newValue, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookPostWorkbooksTextReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **oldValue** | **String**| The old value. |
 **newValue** | **String**| The new value. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorkbookReplaceResponse**](WorkbookReplaceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPostWorkbooksTextSearch"></a>
# **cellsWorkbookPostWorkbooksTextSearch**
> TextItemsResponse cellsWorkbookPostWorkbooksTextSearch(name, text, folder, storage)

Search text.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | Document name.
String text = "text_example"; // String | Text sample.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    TextItemsResponse result = apiInstance.cellsWorkbookPostWorkbooksTextSearch(name, text, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookPostWorkbooksTextSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **text** | **String**| Text sample. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**TextItemsResponse**](TextItemsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPutConvertWorkbook"></a>
# **cellsWorkbookPutConvertWorkbook**
> File cellsWorkbookPutConvertWorkbook(workbook, format, password, outPath)

Convert workbook from request content to some format.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
byte[] workbook = BINARY_DATA_HERE; // byte[] | 
String format = "format_example"; // String | The format to convert.
String password = "password_example"; // String | The workbook password.
String outPath = "outPath_example"; // String | Path to save result
try {
    File result = apiInstance.cellsWorkbookPutConvertWorkbook(workbook, format, password, outPath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookPutConvertWorkbook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workbook** | **byte[]**|  |
 **format** | **String**| The format to convert. | [optional]
 **password** | **String**| The workbook password. | [optional]
 **outPath** | **String**| Path to save result | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPutDocumentProtectFromChanges"></a>
# **cellsWorkbookPutDocumentProtectFromChanges**
> SaaSposeResponse cellsWorkbookPutDocumentProtectFromChanges(name, password, folder, storage)

Protect document from changes.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | Document name.
PasswordRequest password = new PasswordRequest(); // PasswordRequest | Modification password.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsWorkbookPutDocumentProtectFromChanges(name, password, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookPutDocumentProtectFromChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **password** | [**PasswordRequest**](PasswordRequest.md)| Modification password. | [optional]
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPutWorkbookCreate"></a>
# **cellsWorkbookPutWorkbookCreate**
> WorkbookResponse cellsWorkbookPutWorkbookCreate(name, templateFile, dataFile, folder, storage)

Create new workbook using deferent methods.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorkbookApi;


CellsWorkbookApi apiInstance = new CellsWorkbookApi();
String name = "name_example"; // String | The new document name.
String templateFile = "templateFile_example"; // String | The template file, if the data not provided default workbook is created.
String dataFile = "dataFile_example"; // String | Smart marker data file, if the data not provided the request content is checked for the data.
String folder = "folder_example"; // String | The new document folder.
String storage = "storage_example"; // String | storage name.
try {
    WorkbookResponse result = apiInstance.cellsWorkbookPutWorkbookCreate(name, templateFile, dataFile, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorkbookApi#cellsWorkbookPutWorkbookCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The new document name. |
 **templateFile** | **String**| The template file, if the data not provided default workbook is created. | [optional]
 **dataFile** | **String**| Smart marker data file, if the data not provided the request content is checked for the data. | [optional]
 **folder** | **String**| The new document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorkbookResponse**](WorkbookResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

