# **postUnhideWorksheetColumns API**

Unhide worksheet columns. 

```bash

POST http://api.aspose.cloud/v3.0//cells/{name}/worksheets/{sheetName}/cells/columns/unhide

```

## The request parameters of **postUnhideWorksheetColumns** API are: 

| Parameter Name | Type | Path/Query String/HTTPBody | Description | 
| :- | :- | :- |:- | 
|name|String|Path|The workbook name.|
|sheetName|String|Path|The worksheet name.|
|startColumn|Integer|Query|The begin column index to be operated.|
|totalColumns|Integer|Query|Number of columns to be operated.|
|width|Floating|Query|Gets and sets the column width in unit of characters.|
|folder|String|Query|Original workbook folder.|
|storageName|String|Query|Storage name.|


The [OpenAPI Specification](https://reference.aspose.cloud/cells/#/CellsController/PostUnhideWorksheetColumns) defines a publicly accessible programming interface and lets you carry out REST interactions directly from a web browser.