# **Spreadsheet Cloud API: deleteSpreadsheetBlankRows**

Delete all blank rows which do not contain any data or other object. 


## **Quick Start**

- **Base URL**: `http://api.aspose.cloud/v4.0`
- **Authentication Method**: `JWT (OAuth2, application)`  **Token URL**: `https://api.aspose.cloud/connect/token`
- **Example** 

## **Interface Details**

### **Endpoint** 

```
PUT http://api.aspose.cloud/v4.0/cells/delete/blank-rows
```
### **Function Description**
- **Blank Row Identification**: This function identifies rows that do not contain any data or objects, ensuring thorough removal of unnecessary blank rows.- **Data Integrity**: By removing only truly empty rows, it maintains the integrity of your dataset, preventing accidental data loss.- **Usage**:- Ideal for cleaning large datasets where blank rows may interfere with data analysis or processing.- Enhances the readability and usability of spreadsheets by eliminating extraneous blank rows.

### The request parameters of **deleteSpreadsheetBlankRows** API are: 

| Parameter Name | Type | Path/Query String/HTTPBody | Description | 
| :- | :- | :- |:- | 
|Spreadsheet|File|FormData|Upload spreadsheet file.|
|outPath|String|Query|(Optional) The folder path where the workbook is stored. The default is null.|
|outStorageName|String|Query|Output file Storage Name.|
|regoin|String|Query|The spreadsheet region setting.|
|password|String|Query|The password for opening spreadsheet file.|

### **Response Description**
```json
{
File
}
```


## OpenAPI Specification

The [OpenAPI Specification](https://reference.aspose.cloud/cells/#/TransformController/DeleteSpreadsheetBlankRows) defines a publicly accessible programming interface and lets you carry out REST interactions directly from a web browser.
