# CellsPicturesApi

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cellsPicturesDeleteWorksheetPicture**](CellsPicturesApi.md#cellsPicturesDeleteWorksheetPicture) | **DELETE** /cells/{name}/worksheets/{sheetName}/pictures/{pictureIndex} | Delete a picture object in worksheet
[**cellsPicturesDeleteWorksheetPictures**](CellsPicturesApi.md#cellsPicturesDeleteWorksheetPictures) | **DELETE** /cells/{name}/worksheets/{sheetName}/pictures | Delete all pictures in worksheet.
[**cellsPicturesGetWorksheetPicture**](CellsPicturesApi.md#cellsPicturesGetWorksheetPicture) | **GET** /cells/{name}/worksheets/{sheetName}/pictures/{pictureIndex} | GRead worksheet picture by number.
[**cellsPicturesGetWorksheetPictures**](CellsPicturesApi.md#cellsPicturesGetWorksheetPictures) | **GET** /cells/{name}/worksheets/{sheetName}/pictures | Read worksheet pictures.
[**cellsPicturesPostWorksheetPicture**](CellsPicturesApi.md#cellsPicturesPostWorksheetPicture) | **POST** /cells/{name}/worksheets/{sheetName}/pictures/{pictureIndex} | Update worksheet picture by index.
[**cellsPicturesPutWorksheetAddPicture**](CellsPicturesApi.md#cellsPicturesPutWorksheetAddPicture) | **PUT** /cells/{name}/worksheets/{sheetName}/pictures | Add a new worksheet picture.


<a name="cellsPicturesDeleteWorksheetPicture"></a>
# **cellsPicturesDeleteWorksheetPicture**
> SaaSposeResponse cellsPicturesDeleteWorksheetPicture(name, sheetName, pictureIndex, folder, storage)

Delete a picture object in worksheet

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPicturesApi;


CellsPicturesApi apiInstance = new CellsPicturesApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worsheet name.
Integer pictureIndex = 56; // Integer | Picture index
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsPicturesDeleteWorksheetPicture(name, sheetName, pictureIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPicturesApi#cellsPicturesDeleteWorksheetPicture");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worsheet name. |
 **pictureIndex** | **Integer**| Picture index |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPicturesDeleteWorksheetPictures"></a>
# **cellsPicturesDeleteWorksheetPictures**
> SaaSposeResponse cellsPicturesDeleteWorksheetPictures(name, sheetName, folder, storage)

Delete all pictures in worksheet.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPicturesApi;


CellsPicturesApi apiInstance = new CellsPicturesApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.cellsPicturesDeleteWorksheetPictures(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPicturesApi#cellsPicturesDeleteWorksheetPictures");
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

<a name="cellsPicturesGetWorksheetPicture"></a>
# **cellsPicturesGetWorksheetPicture**
> File cellsPicturesGetWorksheetPicture(name, sheetName, pictureIndex, format, folder, storage)

GRead worksheet picture by number.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPicturesApi;


CellsPicturesApi apiInstance = new CellsPicturesApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer pictureIndex = 56; // Integer | The picture index.
String format = "format_example"; // String | The exported object format.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    File result = apiInstance.cellsPicturesGetWorksheetPicture(name, sheetName, pictureIndex, format, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPicturesApi#cellsPicturesGetWorksheetPicture");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **pictureIndex** | **Integer**| The picture index. |
 **format** | **String**| The exported object format. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPicturesGetWorksheetPictures"></a>
# **cellsPicturesGetWorksheetPictures**
> PicturesResponse cellsPicturesGetWorksheetPictures(name, sheetName, folder, storage)

Read worksheet pictures.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPicturesApi;


CellsPicturesApi apiInstance = new CellsPicturesApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    PicturesResponse result = apiInstance.cellsPicturesGetWorksheetPictures(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPicturesApi#cellsPicturesGetWorksheetPictures");
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

[**PicturesResponse**](PicturesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPicturesPostWorksheetPicture"></a>
# **cellsPicturesPostWorksheetPicture**
> PictureResponse cellsPicturesPostWorksheetPicture(name, sheetName, pictureIndex, picture, folder, storage)

Update worksheet picture by index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPicturesApi;


CellsPicturesApi apiInstance = new CellsPicturesApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer pictureIndex = 56; // Integer | The picture's index.
Picture picture = new Picture(); // Picture | Picture object
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    PictureResponse result = apiInstance.cellsPicturesPostWorksheetPicture(name, sheetName, pictureIndex, picture, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPicturesApi#cellsPicturesPostWorksheetPicture");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **pictureIndex** | **Integer**| The picture&#39;s index. |
 **picture** | [**Picture**](Picture.md)| Picture object | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**PictureResponse**](PictureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPicturesPutWorksheetAddPicture"></a>
# **cellsPicturesPutWorksheetAddPicture**
> PicturesResponse cellsPicturesPutWorksheetAddPicture(name, sheetName, picture, upperLeftRow, upperLeftColumn, lowerRightRow, lowerRightColumn, picturePath, folder, storage)

Add a new worksheet picture.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsPicturesApi;


CellsPicturesApi apiInstance = new CellsPicturesApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worsheet name.
Picture picture = new Picture(); // Picture | Pictute object
Integer upperLeftRow = 0; // Integer | The image upper left row.
Integer upperLeftColumn = 0; // Integer | The image upper left column.
Integer lowerRightRow = 0; // Integer | The image low right row.
Integer lowerRightColumn = 0; // Integer | The image low right column.
String picturePath = "picturePath_example"; // String | The picture path, if not provided the picture data is inspected in the request body.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    PicturesResponse result = apiInstance.cellsPicturesPutWorksheetAddPicture(name, sheetName, picture, upperLeftRow, upperLeftColumn, lowerRightRow, lowerRightColumn, picturePath, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsPicturesApi#cellsPicturesPutWorksheetAddPicture");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worsheet name. |
 **picture** | [**Picture**](Picture.md)| Pictute object | [optional]
 **upperLeftRow** | **Integer**| The image upper left row. | [optional] [default to 0]
 **upperLeftColumn** | **Integer**| The image upper left column. | [optional] [default to 0]
 **lowerRightRow** | **Integer**| The image low right row. | [optional] [default to 0]
 **lowerRightColumn** | **Integer**| The image low right column. | [optional] [default to 0]
 **picturePath** | **String**| The picture path, if not provided the picture data is inspected in the request body. | [optional]
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**PicturesResponse**](PicturesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

