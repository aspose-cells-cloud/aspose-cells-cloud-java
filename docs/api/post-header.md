# **postHeader API**

Updates page header in worksheet.  

```bash

POST http://api.aspose.cloud/v3.0//cells/{name}/worksheets/{sheetName}/pagesetup/header

```

## The request parameters of **postHeader** API are: 

| Parameter Name | Type | Path/Query String/HTTPBody | Description | 
| :- | :- | :- |:- | 
|name|String|Path|The workbook name.|
|sheetName|String|Path|The worksheet name.|
|section|Integer|Query|0:Left Section. 1:Center Section 2:Right Section|
|script|String|Query|Header format script.|
|isFirstPage|Boolean|Query|Is first page(true/false).|
|folder|String|Query|Original workbook folder.|
|storageName|String|Query|Storage name.|


The [OpenAPI Specification](https://reference.aspose.cloud/cells/#/PageSetupController/PostHeader) defines a publicly accessible programming interface and lets you carry out REST interactions directly from a web browser.