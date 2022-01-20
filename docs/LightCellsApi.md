# LightCellsApi

All URIs are relative to *https://api.aspose.cloud/v3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMetadata**](LightCellsApi.md#deleteMetadata) | **POST** /cells/metadata/delete | 
[**getMetadata**](LightCellsApi.md#getMetadata) | **POST** /cells/metadata/get | 
[**postAssemble**](LightCellsApi.md#postAssemble) | **POST** /cells/assemble | 
[**postClearObjects**](LightCellsApi.md#postClearObjects) | **POST** /cells/clearobjects | 
[**postExport**](LightCellsApi.md#postExport) | **POST** /cells/export | 
[**postMerge**](LightCellsApi.md#postMerge) | **POST** /cells/merge | 
[**postMetadata**](LightCellsApi.md#postMetadata) | **POST** /cells/metadata/update | 
[**postProtect**](LightCellsApi.md#postProtect) | **POST** /cells/protect | 
[**postSearch**](LightCellsApi.md#postSearch) | **POST** /cells/search | 
[**postSplit**](LightCellsApi.md#postSplit) | **POST** /cells/split | 
[**postUnlock**](LightCellsApi.md#postUnlock) | **POST** /cells/unlock | 
[**postWatermark**](LightCellsApi.md#postWatermark) | **POST** /cells/watermark | 


<a name="deleteMetadata"></a>
# **deleteMetadata**
> FilesResult deleteMetadata(file, type)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.LightCellsApi;


LightCellsApi apiInstance = new LightCellsApi();
File file = new File("/path/to/file.txt"); // File | File to upload
String type = "all"; // String | 
try {
    FilesResult result = apiInstance.deleteMetadata(file, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LightCellsApi#deleteMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| File to upload |
 **type** | **String**|  | [optional] [default to all]

### Return type

[**FilesResult**](FilesResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="getMetadata"></a>
# **getMetadata**
> List&lt;CellsDocumentProperty&gt; getMetadata(file, type)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.LightCellsApi;


LightCellsApi apiInstance = new LightCellsApi();
File file = new File("/path/to/file.txt"); // File | File to upload
String type = "all"; // String | 
try {
    List<CellsDocumentProperty> result = apiInstance.getMetadata(file, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LightCellsApi#getMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| File to upload |
 **type** | **String**|  | [optional] [default to all]

### Return type

[**List&lt;CellsDocumentProperty&gt;**](CellsDocumentProperty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="postAssemble"></a>
# **postAssemble**
> FilesResult postAssemble(file, datasource, format)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.LightCellsApi;


LightCellsApi apiInstance = new LightCellsApi();
File file = new File("/path/to/file.txt"); // File | File to upload
String datasource = "datasource_example"; // String | 
String format = "Xlsx"; // String | 
try {
    FilesResult result = apiInstance.postAssemble(file, datasource, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LightCellsApi#postAssemble");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| File to upload |
 **datasource** | **String**|  |
 **format** | **String**|  | [optional] [default to Xlsx]

### Return type

[**FilesResult**](FilesResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="postClearObjects"></a>
# **postClearObjects**
> FilesResult postClearObjects(file, objecttype)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.LightCellsApi;


LightCellsApi apiInstance = new LightCellsApi();
File file = new File("/path/to/file.txt"); // File | File to upload
String objecttype = "objecttype_example"; // String | 
try {
    FilesResult result = apiInstance.postClearObjects(file, objecttype);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LightCellsApi#postClearObjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| File to upload |
 **objecttype** | **String**|  |

### Return type

[**FilesResult**](FilesResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="postExport"></a>
# **postExport**
> FilesResult postExport(file, objectType, format)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.LightCellsApi;


LightCellsApi apiInstance = new LightCellsApi();
File file = new File("/path/to/file.txt"); // File | File to upload
String objectType = "objectType_example"; // String | 
String format = "format_example"; // String | 
try {
    FilesResult result = apiInstance.postExport(file, objectType, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LightCellsApi#postExport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| File to upload |
 **objectType** | **String**|  |
 **format** | **String**|  |

### Return type

[**FilesResult**](FilesResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="postMerge"></a>
# **postMerge**
> FileInfo postMerge(file, format, mergeToOneSheet)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.LightCellsApi;


LightCellsApi apiInstance = new LightCellsApi();
File file = new File("/path/to/file.txt"); // File | File to upload
String format = "xlsx"; // String | 
Boolean mergeToOneSheet = false; // Boolean | 
try {
    FileInfo result = apiInstance.postMerge(file, format, mergeToOneSheet);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LightCellsApi#postMerge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| File to upload |
 **format** | **String**|  | [optional] [default to xlsx]
 **mergeToOneSheet** | **Boolean**|  | [optional] [default to false]

### Return type

[**FileInfo**](FileInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="postMetadata"></a>
# **postMetadata**
> FilesResult postMetadata(file, documentProperties)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.LightCellsApi;


LightCellsApi apiInstance = new LightCellsApi();
File file = new File("/path/to/file.txt"); // File | File to upload
CellsDocumentProperty documentProperties = new CellsDocumentProperty(); // CellsDocumentProperty | Cells document property.
try {
    FilesResult result = apiInstance.postMetadata(file, documentProperties);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LightCellsApi#postMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| File to upload |
 **documentProperties** | [**CellsDocumentProperty**](CellsDocumentProperty.md)| Cells document property. |

### Return type

[**FilesResult**](FilesResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: multipart/form-data

<a name="postProtect"></a>
# **postProtect**
> FilesResult postProtect(file, password)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.LightCellsApi;


LightCellsApi apiInstance = new LightCellsApi();
File file = new File("/path/to/file.txt"); // File | File to upload
String password = "password_example"; // String | 
try {
    FilesResult result = apiInstance.postProtect(file, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LightCellsApi#postProtect");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| File to upload |
 **password** | **String**|  |

### Return type

[**FilesResult**](FilesResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="postSearch"></a>
# **postSearch**
> List&lt;TextItem&gt; postSearch(file, text, password, sheetname)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.LightCellsApi;


LightCellsApi apiInstance = new LightCellsApi();
File file = new File("/path/to/file.txt"); // File | File to upload
String text = "text_example"; // String | 
String password = "password_example"; // String | 
String sheetname = "sheetname_example"; // String | 
try {
    List<TextItem> result = apiInstance.postSearch(file, text, password, sheetname);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LightCellsApi#postSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| File to upload |
 **text** | **String**|  |
 **password** | **String**|  | [optional]
 **sheetname** | **String**|  | [optional]

### Return type

[**List&lt;TextItem&gt;**](TextItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="postSplit"></a>
# **postSplit**
> FilesResult postSplit(file, format, password, from, to)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.LightCellsApi;


LightCellsApi apiInstance = new LightCellsApi();
File file = new File("/path/to/file.txt"); // File | File to upload
String format = "format_example"; // String | 
String password = "password_example"; // String | 
Integer from = 56; // Integer | 
Integer to = 56; // Integer | 
try {
    FilesResult result = apiInstance.postSplit(file, format, password, from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LightCellsApi#postSplit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| File to upload |
 **format** | **String**|  |
 **password** | **String**|  | [optional]
 **from** | **Integer**|  | [optional]
 **to** | **Integer**|  | [optional]

### Return type

[**FilesResult**](FilesResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="postUnlock"></a>
# **postUnlock**
> FilesResult postUnlock(file, password)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.LightCellsApi;


LightCellsApi apiInstance = new LightCellsApi();
File file = new File("/path/to/file.txt"); // File | File to upload
String password = "password_example"; // String | 
try {
    FilesResult result = apiInstance.postUnlock(file, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LightCellsApi#postUnlock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| File to upload |
 **password** | **String**|  |

### Return type

[**FilesResult**](FilesResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="postWatermark"></a>
# **postWatermark**
> FilesResult postWatermark(file, text, color)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.LightCellsApi;


LightCellsApi apiInstance = new LightCellsApi();
File file = new File("/path/to/file.txt"); // File | File to upload
String text = "text_example"; // String | 
String color = "color_example"; // String | 
try {
    FilesResult result = apiInstance.postWatermark(file, text, color);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LightCellsApi#postWatermark");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| File to upload |
 **text** | **String**|  |
 **color** | **String**|  |

### Return type

[**FilesResult**](FilesResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

