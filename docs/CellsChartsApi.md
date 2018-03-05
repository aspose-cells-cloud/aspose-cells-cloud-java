# CellsChartsApi

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cellsChartsDeleteWorksheetChartLegend**](CellsChartsApi.md#cellsChartsDeleteWorksheetChartLegend) | **DELETE** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/legend | Hide legend in chart
[**cellsChartsDeleteWorksheetChartTitle**](CellsChartsApi.md#cellsChartsDeleteWorksheetChartTitle) | **DELETE** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/title | Hide title in chart
[**cellsChartsDeleteWorksheetClearCharts**](CellsChartsApi.md#cellsChartsDeleteWorksheetClearCharts) | **DELETE** /cells/{name}/worksheets/{sheetName}/charts | Clear the charts.
[**cellsChartsDeleteWorksheetDeleteChart**](CellsChartsApi.md#cellsChartsDeleteWorksheetDeleteChart) | **DELETE** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex} | Delete worksheet chart by index.
[**cellsChartsGetWorksheetChart**](CellsChartsApi.md#cellsChartsGetWorksheetChart) | **GET** /cells/{name}/worksheets/{sheetName}/charts/{chartNumber} | Get chart info.
[**cellsChartsGetWorksheetChartLegend**](CellsChartsApi.md#cellsChartsGetWorksheetChartLegend) | **GET** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/legend | Get chart legend
[**cellsChartsGetWorksheetChartTitle**](CellsChartsApi.md#cellsChartsGetWorksheetChartTitle) | **GET** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/title | Get chart title
[**cellsChartsGetWorksheetCharts**](CellsChartsApi.md#cellsChartsGetWorksheetCharts) | **GET** /cells/{name}/worksheets/{sheetName}/charts | Get worksheet charts info.
[**cellsChartsPostWorksheetChart**](CellsChartsApi.md#cellsChartsPostWorksheetChart) | **POST** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex} | Update chart propreties
[**cellsChartsPostWorksheetChartLegend**](CellsChartsApi.md#cellsChartsPostWorksheetChartLegend) | **POST** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/legend | Update chart legend
[**cellsChartsPostWorksheetChartTitle**](CellsChartsApi.md#cellsChartsPostWorksheetChartTitle) | **POST** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/title | Update chart title
[**cellsChartsPutWorksheetAddChart**](CellsChartsApi.md#cellsChartsPutWorksheetAddChart) | **PUT** /cells/{name}/worksheets/{sheetName}/charts | Add new chart to worksheet.
[**cellsChartsPutWorksheetChartLegend**](CellsChartsApi.md#cellsChartsPutWorksheetChartLegend) | **PUT** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/legend | Show legend in chart
[**cellsChartsPutWorksheetChartTitle**](CellsChartsApi.md#cellsChartsPutWorksheetChartTitle) | **PUT** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/title | Add chart title / Set chart title visible


<a name="cellsChartsDeleteWorksheetChartLegend"></a>
# **cellsChartsDeleteWorksheetChartLegend**
> SaaSposeResponse cellsChartsDeleteWorksheetChartLegend(name, sheetName, chartIndex, folder)

Hide legend in chart

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsChartsApi;


CellsChartsApi apiInstance = new CellsChartsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartIndex = 56; // Integer | The chart index.
String folder = "folder_example"; // String | The workbook folder.
try {
    SaaSposeResponse result = apiInstance.cellsChartsDeleteWorksheetChartLegend(name, sheetName, chartIndex, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsChartsApi#cellsChartsDeleteWorksheetChartLegend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **chartIndex** | **Integer**| The chart index. |
 **folder** | **String**| The workbook folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsDeleteWorksheetChartTitle"></a>
# **cellsChartsDeleteWorksheetChartTitle**
> SaaSposeResponse cellsChartsDeleteWorksheetChartTitle(name, sheetName, chartIndex, folder)

Hide title in chart

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsChartsApi;


CellsChartsApi apiInstance = new CellsChartsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartIndex = 56; // Integer | The chart index.
String folder = "folder_example"; // String | The workbook folder.
try {
    SaaSposeResponse result = apiInstance.cellsChartsDeleteWorksheetChartTitle(name, sheetName, chartIndex, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsChartsApi#cellsChartsDeleteWorksheetChartTitle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **chartIndex** | **Integer**| The chart index. |
 **folder** | **String**| The workbook folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsDeleteWorksheetClearCharts"></a>
# **cellsChartsDeleteWorksheetClearCharts**
> SaaSposeResponse cellsChartsDeleteWorksheetClearCharts(name, sheetName, folder)

Clear the charts.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsChartsApi;


CellsChartsApi apiInstance = new CellsChartsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | The workbook folder.
try {
    SaaSposeResponse result = apiInstance.cellsChartsDeleteWorksheetClearCharts(name, sheetName, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsChartsApi#cellsChartsDeleteWorksheetClearCharts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **folder** | **String**| The workbook folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsDeleteWorksheetDeleteChart"></a>
# **cellsChartsDeleteWorksheetDeleteChart**
> ChartsResponse cellsChartsDeleteWorksheetDeleteChart(name, sheetName, chartIndex, folder)

Delete worksheet chart by index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsChartsApi;


CellsChartsApi apiInstance = new CellsChartsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartIndex = 56; // Integer | The chart index.
String folder = "folder_example"; // String | The workbook folder.
try {
    ChartsResponse result = apiInstance.cellsChartsDeleteWorksheetDeleteChart(name, sheetName, chartIndex, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsChartsApi#cellsChartsDeleteWorksheetDeleteChart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **chartIndex** | **Integer**| The chart index. |
 **folder** | **String**| The workbook folder. | [optional]

### Return type

[**ChartsResponse**](ChartsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsGetWorksheetChart"></a>
# **cellsChartsGetWorksheetChart**
> File cellsChartsGetWorksheetChart(name, sheetName, chartNumber, format, folder)

Get chart info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsChartsApi;


CellsChartsApi apiInstance = new CellsChartsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartNumber = 56; // Integer | The chart number.
String format = "format_example"; // String | The exported file format.
String folder = "folder_example"; // String | The document folder.
try {
    File result = apiInstance.cellsChartsGetWorksheetChart(name, sheetName, chartNumber, format, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsChartsApi#cellsChartsGetWorksheetChart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **chartNumber** | **Integer**| The chart number. |
 **format** | **String**| The exported file format. | [optional]
 **folder** | **String**| The document folder. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsGetWorksheetChartLegend"></a>
# **cellsChartsGetWorksheetChartLegend**
> LegendResponse cellsChartsGetWorksheetChartLegend(name, sheetName, chartIndex, folder)

Get chart legend

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsChartsApi;


CellsChartsApi apiInstance = new CellsChartsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartIndex = 56; // Integer | The chart index.
String folder = "folder_example"; // String | The workbook folder.
try {
    LegendResponse result = apiInstance.cellsChartsGetWorksheetChartLegend(name, sheetName, chartIndex, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsChartsApi#cellsChartsGetWorksheetChartLegend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **chartIndex** | **Integer**| The chart index. |
 **folder** | **String**| The workbook folder. | [optional]

### Return type

[**LegendResponse**](LegendResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsGetWorksheetChartTitle"></a>
# **cellsChartsGetWorksheetChartTitle**
> TitleResponse cellsChartsGetWorksheetChartTitle(name, sheetName, chartIndex, folder)

Get chart title

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsChartsApi;


CellsChartsApi apiInstance = new CellsChartsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartIndex = 56; // Integer | The chart index.
String folder = "folder_example"; // String | The workbook folder.
try {
    TitleResponse result = apiInstance.cellsChartsGetWorksheetChartTitle(name, sheetName, chartIndex, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsChartsApi#cellsChartsGetWorksheetChartTitle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **chartIndex** | **Integer**| The chart index. |
 **folder** | **String**| The workbook folder. | [optional]

### Return type

[**TitleResponse**](TitleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsGetWorksheetCharts"></a>
# **cellsChartsGetWorksheetCharts**
> ChartsResponse cellsChartsGetWorksheetCharts(name, sheetName, folder)

Get worksheet charts info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsChartsApi;


CellsChartsApi apiInstance = new CellsChartsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | Document's folder.
try {
    ChartsResponse result = apiInstance.cellsChartsGetWorksheetCharts(name, sheetName, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsChartsApi#cellsChartsGetWorksheetCharts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **folder** | **String**| Document&#39;s folder. | [optional]

### Return type

[**ChartsResponse**](ChartsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsPostWorksheetChart"></a>
# **cellsChartsPostWorksheetChart**
> SaaSposeResponse cellsChartsPostWorksheetChart(name, sheetName, chartIndex, chart, folder)

Update chart propreties

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsChartsApi;


CellsChartsApi apiInstance = new CellsChartsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer chartIndex = 56; // Integer | 
Chart chart = new Chart(); // Chart | 
String folder = "folder_example"; // String | 
try {
    SaaSposeResponse result = apiInstance.cellsChartsPostWorksheetChart(name, sheetName, chartIndex, chart, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsChartsApi#cellsChartsPostWorksheetChart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **chartIndex** | **Integer**|  |
 **chart** | [**Chart**](Chart.md)|  | [optional]
 **folder** | **String**|  | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsPostWorksheetChartLegend"></a>
# **cellsChartsPostWorksheetChartLegend**
> LegendResponse cellsChartsPostWorksheetChartLegend(name, sheetName, chartIndex, legend, folder)

Update chart legend

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsChartsApi;


CellsChartsApi apiInstance = new CellsChartsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartIndex = 56; // Integer | The chart index.
Legend legend = new Legend(); // Legend | 
String folder = "folder_example"; // String | The workbook folder.
try {
    LegendResponse result = apiInstance.cellsChartsPostWorksheetChartLegend(name, sheetName, chartIndex, legend, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsChartsApi#cellsChartsPostWorksheetChartLegend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **chartIndex** | **Integer**| The chart index. |
 **legend** | [**Legend**](Legend.md)|  | [optional]
 **folder** | **String**| The workbook folder. | [optional]

### Return type

[**LegendResponse**](LegendResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsPostWorksheetChartTitle"></a>
# **cellsChartsPostWorksheetChartTitle**
> TitleResponse cellsChartsPostWorksheetChartTitle(name, sheetName, chartIndex, title, folder)

Update chart title

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsChartsApi;


CellsChartsApi apiInstance = new CellsChartsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartIndex = 56; // Integer | The chart index.
Title title = new Title(); // Title | Chart title
String folder = "folder_example"; // String | The workbook folder.
try {
    TitleResponse result = apiInstance.cellsChartsPostWorksheetChartTitle(name, sheetName, chartIndex, title, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsChartsApi#cellsChartsPostWorksheetChartTitle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **chartIndex** | **Integer**| The chart index. |
 **title** | [**Title**](Title.md)| Chart title | [optional]
 **folder** | **String**| The workbook folder. | [optional]

### Return type

[**TitleResponse**](TitleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsPutWorksheetAddChart"></a>
# **cellsChartsPutWorksheetAddChart**
> ChartsResponse cellsChartsPutWorksheetAddChart(name, sheetName, chartType, upperLeftRow, upperLeftColumn, lowerRightRow, lowerRightColumn, area, isVertical, categoryData, isAutoGetSerialName, title, folder)

Add new chart to worksheet.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsChartsApi;


CellsChartsApi apiInstance = new CellsChartsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String chartType = "chartType_example"; // String | Chart type, please refer property Type in chart resource.
Integer upperLeftRow = 0; // Integer | New chart upper left row.
Integer upperLeftColumn = 0; // Integer | New chart upperleft column.
Integer lowerRightRow = 0; // Integer | New chart lower right row.
Integer lowerRightColumn = 0; // Integer | New chart lower right column.
String area = "area_example"; // String | Specifies values from which to plot the data series. 
Boolean isVertical = true; // Boolean | Specifies whether to plot the series from a range of cell values by row or by column. 
String categoryData = "categoryData_example"; // String | Gets or sets the range of category Axis values. It can be a range of cells (such as, \"d1:e10\"). 
Boolean isAutoGetSerialName = true; // Boolean | Specifies whether auto update serial name. 
String title = "title_example"; // String | Specifies chart title name.
String folder = "folder_example"; // String | The workbook folder.
try {
    ChartsResponse result = apiInstance.cellsChartsPutWorksheetAddChart(name, sheetName, chartType, upperLeftRow, upperLeftColumn, lowerRightRow, lowerRightColumn, area, isVertical, categoryData, isAutoGetSerialName, title, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsChartsApi#cellsChartsPutWorksheetAddChart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **chartType** | **String**| Chart type, please refer property Type in chart resource. |
 **upperLeftRow** | **Integer**| New chart upper left row. | [optional] [default to 0]
 **upperLeftColumn** | **Integer**| New chart upperleft column. | [optional] [default to 0]
 **lowerRightRow** | **Integer**| New chart lower right row. | [optional] [default to 0]
 **lowerRightColumn** | **Integer**| New chart lower right column. | [optional] [default to 0]
 **area** | **String**| Specifies values from which to plot the data series.  | [optional]
 **isVertical** | **Boolean**| Specifies whether to plot the series from a range of cell values by row or by column.  | [optional] [default to true]
 **categoryData** | **String**| Gets or sets the range of category Axis values. It can be a range of cells (such as, \&quot;d1:e10\&quot;).  | [optional]
 **isAutoGetSerialName** | **Boolean**| Specifies whether auto update serial name.  | [optional] [default to true]
 **title** | **String**| Specifies chart title name. | [optional]
 **folder** | **String**| The workbook folder. | [optional]

### Return type

[**ChartsResponse**](ChartsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsPutWorksheetChartLegend"></a>
# **cellsChartsPutWorksheetChartLegend**
> SaaSposeResponse cellsChartsPutWorksheetChartLegend(name, sheetName, chartIndex, folder)

Show legend in chart

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsChartsApi;


CellsChartsApi apiInstance = new CellsChartsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartIndex = 56; // Integer | The chart index.
String folder = "folder_example"; // String | The workbook folder.
try {
    SaaSposeResponse result = apiInstance.cellsChartsPutWorksheetChartLegend(name, sheetName, chartIndex, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsChartsApi#cellsChartsPutWorksheetChartLegend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **chartIndex** | **Integer**| The chart index. |
 **folder** | **String**| The workbook folder. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsPutWorksheetChartTitle"></a>
# **cellsChartsPutWorksheetChartTitle**
> TitleResponse cellsChartsPutWorksheetChartTitle(name, sheetName, chartIndex, title, folder)

Add chart title / Set chart title visible

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsChartsApi;


CellsChartsApi apiInstance = new CellsChartsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartIndex = 56; // Integer | The chart index.
Title title = new Title(); // Title | Chart title.
String folder = "folder_example"; // String | The workbook folder.
try {
    TitleResponse result = apiInstance.cellsChartsPutWorksheetChartTitle(name, sheetName, chartIndex, title, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsChartsApi#cellsChartsPutWorksheetChartTitle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **chartIndex** | **Integer**| The chart index. |
 **title** | [**Title**](Title.md)| Chart title. | [optional]
 **folder** | **String**| The workbook folder. | [optional]

### Return type

[**TitleResponse**](TitleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

