# **postWorksheetChart API**

Update chart propreties in worksheet. 

```bash

POST http://api.aspose.cloud/v3.0//cells/{name}/worksheets/{sheetName}/charts/{chartIndex}

```

## The request parameters of **postWorksheetChart** API are: 

| Parameter Name | Type | Path/Query String/HTTPBody | Description | 
| :- | :- | :- |:- | 
|name|String|Path|The workbook name.|
|sheetName|String|Path|The worksheet name.|
|chartIndex|Integer|Path|The chart index.|
|chart|Class|Body|Represents a specified chart.|
|folder|String|Query|Original workbook folder.|
|storageName|String|Query|Storage name.|


The [OpenAPI Specification](https://reference.aspose.cloud/cells/#/ChartsController/PostWorksheetChart) defines a publicly accessible programming interface and lets you carry out REST interactions directly from a web browser.