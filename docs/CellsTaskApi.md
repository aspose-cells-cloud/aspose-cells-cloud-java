# CellsTaskApi

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cellsTaskPostRunTask**](CellsTaskApi.md#cellsTaskPostRunTask) | **POST** /cells/task/runtask | Run tasks  


<a name="cellsTaskPostRunTask"></a>
# **cellsTaskPostRunTask**
> Object cellsTaskPostRunTask(taskData)

Run tasks  

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsTaskApi;


CellsTaskApi apiInstance = new CellsTaskApi();
TaskData taskData = new TaskData(); // TaskData | 
try {
    Object result = apiInstance.cellsTaskPostRunTask(taskData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsTaskApi#cellsTaskPostRunTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskData** | [**TaskData**](TaskData.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

