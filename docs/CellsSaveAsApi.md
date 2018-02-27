# CellsSaveAsApi

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cellsSaveAsPostDocumentSaveAs**](CellsSaveAsApi.md#cellsSaveAsPostDocumentSaveAs) | **POST** /cells/{name}/SaveAs | Convert document and save result to storage.


<a name="cellsSaveAsPostDocumentSaveAs"></a>
# **cellsSaveAsPostDocumentSaveAs**
> SaveResponse cellsSaveAsPostDocumentSaveAs(name, saveOptions, newfilename, isAutoFitRows, isAutoFitColumns, folder)

Convert document and save result to storage.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsSaveAsApi;


CellsSaveAsApi apiInstance = new CellsSaveAsApi();
String name = "name_example"; // String | The document name.
SaveOptions saveOptions = new SaveOptions(); // SaveOptions | Save options.
String newfilename = "newfilename_example"; // String | The new file name.
Boolean isAutoFitRows = false; // Boolean | Autofit rows.
Boolean isAutoFitColumns = false; // Boolean | Autofit columns.
String folder = "folder_example"; // String | The document folder.
try {
    SaveResponse result = apiInstance.cellsSaveAsPostDocumentSaveAs(name, saveOptions, newfilename, isAutoFitRows, isAutoFitColumns, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsSaveAsApi#cellsSaveAsPostDocumentSaveAs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **saveOptions** | [**SaveOptions**](SaveOptions.md)| Save options. | [optional]
 **newfilename** | **String**| The new file name. | [optional]
 **isAutoFitRows** | **Boolean**| Autofit rows. | [optional] [default to false]
 **isAutoFitColumns** | **Boolean**| Autofit columns. | [optional] [default to false]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**SaveResponse**](SaveResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

