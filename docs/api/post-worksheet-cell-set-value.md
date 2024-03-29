# **postWorksheetCellSetValue API**

Set cell value using cell name in the worksheet. 

```bash

POST http://api.aspose.cloud/v3.0//cells/{name}/worksheets/{sheetName}/cells/{cellName}

```

## The request parameters of **postWorksheetCellSetValue** API are: 

| Parameter Name | Type | Path/Query String/HTTPBody | Description | 
| :- | :- | :- |:- | 
|name|String|Path|The file name.|
|sheetName|String|Path|The worksheet name.|
|cellName|String|Path|The cell name.|
|value|String|Query|The cell value.|
|type|String|Query|The value type.|
|formula|String|Query|Formula for cell|
|folder|String|Query|The folder where the file is situated.|
|storageName|String|Query|The storage name where the file is situated.|


The [OpenAPI Specification](https://reference.aspose.cloud/cells/#/CellsController/PostWorksheetCellSetValue) defines a publicly accessible programming interface and lets you carry out REST interactions directly from a web browser.
