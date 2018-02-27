# CellsShapesApi

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cellsShapesDeleteWorksheetShape**](CellsShapesApi.md#cellsShapesDeleteWorksheetShape) | **DELETE** /cells/{name}/worksheets/{sheetName}/shapes/{shapeindex} | Delete a shape in worksheet
[**cellsShapesDeleteWorksheetShapes**](CellsShapesApi.md#cellsShapesDeleteWorksheetShapes) | **DELETE** /cells/{name}/worksheets/{sheetName}/shapes | delete all shapes in worksheet
[**cellsShapesGetWorksheetShape**](CellsShapesApi.md#cellsShapesGetWorksheetShape) | **GET** /cells/{name}/worksheets/{sheetName}/shapes/{shapeindex} | Get worksheet shape
[**cellsShapesGetWorksheetShapes**](CellsShapesApi.md#cellsShapesGetWorksheetShapes) | **GET** /cells/{name}/worksheets/{sheetName}/shapes | Get worksheet shapes 
[**cellsShapesPostWorksheetShape**](CellsShapesApi.md#cellsShapesPostWorksheetShape) | **POST** /cells/{name}/worksheets/{sheetName}/shapes/{shapeindex} | Update a shape in worksheet
[**cellsShapesPutWorksheetShape**](CellsShapesApi.md#cellsShapesPutWorksheetShape) | **PUT** /cells/{name}/worksheets/{sheetName}/shapes | Add shape in worksheet


<a name="cellsShapesDeleteWorksheetShape"></a>
# **cellsShapesDeleteWorksheetShape**
> SaaSposeResponse cellsShapesDeleteWorksheetShape(name, sheetName, shapeindex, folder)

Delete a shape in worksheet

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsShapesApi;


CellsShapesApi apiInstance = new CellsShapesApi();
String name = "name_example"; // String | document name.
String sheetName = "sheetName_example"; // String | worksheet name.
Integer shapeindex = 56; // Integer | shape index in worksheet shapes.
String folder = "folder_example"; // String | Document's folder.
try {
    SaaSposeResponse result = apiInstance.cellsShapesDeleteWorksheetShape(name, sheetName, shapeindex, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsShapesApi#cellsShapesDeleteWorksheetShape");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| document name. |
 **sheetName** | **String**| worksheet name. |
 **shapeindex** | **Integer**| shape index in worksheet shapes. |
 **folder** | **String**| Document&#39;s folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsShapesDeleteWorksheetShapes"></a>
# **cellsShapesDeleteWorksheetShapes**
> SaaSposeResponse cellsShapesDeleteWorksheetShapes(name, sheetName, folder)

delete all shapes in worksheet

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsShapesApi;


CellsShapesApi apiInstance = new CellsShapesApi();
String name = "name_example"; // String | document name.
String sheetName = "sheetName_example"; // String | worksheet name.
String folder = "folder_example"; // String | Document's folder.
try {
    SaaSposeResponse result = apiInstance.cellsShapesDeleteWorksheetShapes(name, sheetName, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsShapesApi#cellsShapesDeleteWorksheetShapes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| document name. |
 **sheetName** | **String**| worksheet name. |
 **folder** | **String**| Document&#39;s folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsShapesGetWorksheetShape"></a>
# **cellsShapesGetWorksheetShape**
> ShapeResponse cellsShapesGetWorksheetShape(name, sheetName, shapeindex, folder)

Get worksheet shape

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsShapesApi;


CellsShapesApi apiInstance = new CellsShapesApi();
String name = "name_example"; // String | document name.
String sheetName = "sheetName_example"; // String | worksheet name.
Integer shapeindex = 56; // Integer | shape index in worksheet shapes.
String folder = "folder_example"; // String | Document's folder.
try {
    ShapeResponse result = apiInstance.cellsShapesGetWorksheetShape(name, sheetName, shapeindex, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsShapesApi#cellsShapesGetWorksheetShape");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| document name. |
 **sheetName** | **String**| worksheet name. |
 **shapeindex** | **Integer**| shape index in worksheet shapes. |
 **folder** | **String**| Document&#39;s folder. | [optional]

### Return type

[**ShapeResponse**](ShapeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsShapesGetWorksheetShapes"></a>
# **cellsShapesGetWorksheetShapes**
> ShapesResponse cellsShapesGetWorksheetShapes(name, sheetName, folder)

Get worksheet shapes 

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsShapesApi;


CellsShapesApi apiInstance = new CellsShapesApi();
String name = "name_example"; // String | document name.
String sheetName = "sheetName_example"; // String | worksheet name.
String folder = "folder_example"; // String | Document's folder.
try {
    ShapesResponse result = apiInstance.cellsShapesGetWorksheetShapes(name, sheetName, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsShapesApi#cellsShapesGetWorksheetShapes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| document name. |
 **sheetName** | **String**| worksheet name. |
 **folder** | **String**| Document&#39;s folder. | [optional]

### Return type

[**ShapesResponse**](ShapesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsShapesPostWorksheetShape"></a>
# **cellsShapesPostWorksheetShape**
> SaaSposeResponse cellsShapesPostWorksheetShape(name, sheetName, shapeindex, dto, folder)

Update a shape in worksheet

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsShapesApi;


CellsShapesApi apiInstance = new CellsShapesApi();
String name = "name_example"; // String | document name.
String sheetName = "sheetName_example"; // String | worksheet name.
Integer shapeindex = 56; // Integer | shape index in worksheet shapes.
Shape dto = new Shape(); // Shape | 
String folder = "folder_example"; // String | Document's folder.
try {
    SaaSposeResponse result = apiInstance.cellsShapesPostWorksheetShape(name, sheetName, shapeindex, dto, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsShapesApi#cellsShapesPostWorksheetShape");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| document name. |
 **sheetName** | **String**| worksheet name. |
 **shapeindex** | **Integer**| shape index in worksheet shapes. |
 **dto** | [**Shape**](Shape.md)|  | [optional]
 **folder** | **String**| Document&#39;s folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsShapesPutWorksheetShape"></a>
# **cellsShapesPutWorksheetShape**
> ShapeResponse cellsShapesPutWorksheetShape(name, sheetName, drawingType, upperLeftRow, upperLeftColumn, top, left, width, height, folder)

Add shape in worksheet

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsShapesApi;


CellsShapesApi apiInstance = new CellsShapesApi();
String name = "name_example"; // String | document name.
String sheetName = "sheetName_example"; // String | worksheet name.
String drawingType = "drawingType_example"; // String | shape object type
Integer upperLeftRow = 56; // Integer | Upper left row index.
Integer upperLeftColumn = 56; // Integer | Upper left column index.
Integer top = 56; // Integer | Represents the vertical offset of Spinner from its left row, in unit of pixel.
Integer left = 56; // Integer | Represents the horizontal offset of Spinner from its left column, in unit of pixel.
Integer width = 56; // Integer | Represents the height of Spinner, in unit of pixel.
Integer height = 56; // Integer | Represents the width of Spinner, in unit of pixel.
String folder = "folder_example"; // String | Document's folder.
try {
    ShapeResponse result = apiInstance.cellsShapesPutWorksheetShape(name, sheetName, drawingType, upperLeftRow, upperLeftColumn, top, left, width, height, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsShapesApi#cellsShapesPutWorksheetShape");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| document name. |
 **sheetName** | **String**| worksheet name. |
 **drawingType** | **String**| shape object type |
 **upperLeftRow** | **Integer**| Upper left row index. |
 **upperLeftColumn** | **Integer**| Upper left column index. |
 **top** | **Integer**| Represents the vertical offset of Spinner from its left row, in unit of pixel. |
 **left** | **Integer**| Represents the horizontal offset of Spinner from its left column, in unit of pixel. |
 **width** | **Integer**| Represents the height of Spinner, in unit of pixel. |
 **height** | **Integer**| Represents the width of Spinner, in unit of pixel. |
 **folder** | **String**| Document&#39;s folder. | [optional]

### Return type

[**ShapeResponse**](ShapeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

