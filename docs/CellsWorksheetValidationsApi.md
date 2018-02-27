# CellsWorksheetValidationsApi

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cellsWorksheetValidationsDeleteWorksheetValidation**](CellsWorksheetValidationsApi.md#cellsWorksheetValidationsDeleteWorksheetValidation) | **DELETE** /cells/{name}/worksheets/{sheetName}/validations/{validationIndex} | Delete worksheet validation by index.
[**cellsWorksheetValidationsGetWorksheetValidation**](CellsWorksheetValidationsApi.md#cellsWorksheetValidationsGetWorksheetValidation) | **GET** /cells/{name}/worksheets/{sheetName}/validations/{validationIndex} | Get worksheet validation by index.
[**cellsWorksheetValidationsGetWorksheetValidations**](CellsWorksheetValidationsApi.md#cellsWorksheetValidationsGetWorksheetValidations) | **GET** /cells/{name}/worksheets/{sheetName}/validations | Get worksheet validations.
[**cellsWorksheetValidationsPostWorksheetValidation**](CellsWorksheetValidationsApi.md#cellsWorksheetValidationsPostWorksheetValidation) | **POST** /cells/{name}/worksheets/{sheetName}/validations/{validationIndex} | Update worksheet validation by index.
[**cellsWorksheetValidationsPutWorksheetValidation**](CellsWorksheetValidationsApi.md#cellsWorksheetValidationsPutWorksheetValidation) | **PUT** /cells/{name}/worksheets/{sheetName}/validations | Add worksheet validation at index.


<a name="cellsWorksheetValidationsDeleteWorksheetValidation"></a>
# **cellsWorksheetValidationsDeleteWorksheetValidation**
> ValidationResponse cellsWorksheetValidationsDeleteWorksheetValidation(name, sheetName, validationIndex, folder)

Delete worksheet validation by index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetValidationsApi;


CellsWorksheetValidationsApi apiInstance = new CellsWorksheetValidationsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer validationIndex = 56; // Integer | The validation index.
String folder = "folder_example"; // String | Document's folder.
try {
    ValidationResponse result = apiInstance.cellsWorksheetValidationsDeleteWorksheetValidation(name, sheetName, validationIndex, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetValidationsApi#cellsWorksheetValidationsDeleteWorksheetValidation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **validationIndex** | **Integer**| The validation index. |
 **folder** | **String**| Document&#39;s folder. | [optional]

### Return type

[**ValidationResponse**](ValidationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetValidationsGetWorksheetValidation"></a>
# **cellsWorksheetValidationsGetWorksheetValidation**
> ValidationResponse cellsWorksheetValidationsGetWorksheetValidation(name, sheetName, validationIndex, folder)

Get worksheet validation by index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetValidationsApi;


CellsWorksheetValidationsApi apiInstance = new CellsWorksheetValidationsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer validationIndex = 56; // Integer | The validation index.
String folder = "folder_example"; // String | Document's folder.
try {
    ValidationResponse result = apiInstance.cellsWorksheetValidationsGetWorksheetValidation(name, sheetName, validationIndex, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetValidationsApi#cellsWorksheetValidationsGetWorksheetValidation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **validationIndex** | **Integer**| The validation index. |
 **folder** | **String**| Document&#39;s folder. | [optional]

### Return type

[**ValidationResponse**](ValidationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetValidationsGetWorksheetValidations"></a>
# **cellsWorksheetValidationsGetWorksheetValidations**
> ValidationsResponse cellsWorksheetValidationsGetWorksheetValidations(name, sheetName, folder)

Get worksheet validations.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetValidationsApi;


CellsWorksheetValidationsApi apiInstance = new CellsWorksheetValidationsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String folder = "folder_example"; // String | Document folder.
try {
    ValidationsResponse result = apiInstance.cellsWorksheetValidationsGetWorksheetValidations(name, sheetName, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetValidationsApi#cellsWorksheetValidationsGetWorksheetValidations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **folder** | **String**| Document folder. | [optional]

### Return type

[**ValidationsResponse**](ValidationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetValidationsPostWorksheetValidation"></a>
# **cellsWorksheetValidationsPostWorksheetValidation**
> ValidationResponse cellsWorksheetValidationsPostWorksheetValidation(name, sheetName, validationIndex, validation, folder)

Update worksheet validation by index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetValidationsApi;


CellsWorksheetValidationsApi apiInstance = new CellsWorksheetValidationsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer validationIndex = 56; // Integer | The validation index.
Validation validation = new Validation(); // Validation | 
String folder = "folder_example"; // String | Document's folder.
try {
    ValidationResponse result = apiInstance.cellsWorksheetValidationsPostWorksheetValidation(name, sheetName, validationIndex, validation, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetValidationsApi#cellsWorksheetValidationsPostWorksheetValidation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **validationIndex** | **Integer**| The validation index. |
 **validation** | [**Validation**](Validation.md)|  | [optional]
 **folder** | **String**| Document&#39;s folder. | [optional]

### Return type

[**ValidationResponse**](ValidationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetValidationsPutWorksheetValidation"></a>
# **cellsWorksheetValidationsPutWorksheetValidation**
> ValidationResponse cellsWorksheetValidationsPutWorksheetValidation(name, sheetName, range, folder)

Add worksheet validation at index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsWorksheetValidationsApi;


CellsWorksheetValidationsApi apiInstance = new CellsWorksheetValidationsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String range = "range_example"; // String | Specified cells area
String folder = "folder_example"; // String | Document's folder.
try {
    ValidationResponse result = apiInstance.cellsWorksheetValidationsPutWorksheetValidation(name, sheetName, range, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsWorksheetValidationsApi#cellsWorksheetValidationsPutWorksheetValidation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **range** | **String**| Specified cells area | [optional]
 **folder** | **String**| Document&#39;s folder. | [optional]

### Return type

[**ValidationResponse**](ValidationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

