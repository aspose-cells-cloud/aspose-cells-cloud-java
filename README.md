# Java REST API for Spreadsheet Processing in Cloud

This Cloud SDK enhances your Java cloud-based apps to [process & manipulate Microsoft Excel spreadsheets](https://products.aspose.cloud/cells/java) in the cloud, without MS Office.

## Spreadsheet Processing Features

- Add, update or delete charts, worksheet pictures, shapes, hyperlinks & validations.
- Add or remove cells area for conditional formatting, or OleObjects from Excel worksheets.
- Insert or delete, horizontal or vertical page breaks
- Add ListObject at a specific place within an Excel file & convert them to a range of cells.
- Delete specific or all ListObjects in a worksheet or summarize its data with pivot table.
- Apply custom criteria to list filters of various types.
- Get, update, show or hide chart legend & titles.
- Manipulate page setup, header & footer.
- Create, update, fetch or delete document properties.
- Fetch the required shape from worksheet.
- Load & Process Excel Spreadsheets via Cloud SDK.
- Cloud SDK to Read & Process Excel Worksheets.
- Leverage the Power of Pivot Tables & Ranges.

## Enhancements in Version 20.9

- Support sparkline groups.
- Add API about updating pivot field.
- Enhancement for add chart API.

## Read & Write Spreadsheet Formats

**Microsoft Excel:** XLS, XLSX, XLSB, XLSM, XLT, XLTX, XLTM
**OpenOffice:** ODS
**SpreadsheetML:** XML
**Text:** CSV, TSV, TXT (TabDelimited)
**Web:** HTML, MHTML
**PDF**

## Save Spreadsheet As

DIF, HTML, MHTML,PNG,JPG, TIFF, XPS, SVG, MD (Markdown), ODS ,xlsx,xls,xlsb, PDF,XML,TXT,CSV

## Read Spreadsheet Formats

SXC, FODS

## Getting Started with Aspose.Cells Cloud SDK for Java

You do not need to install anything to get started with Aspose.Cells Cloud SDK for Java. Just create an account at [Aspose for Cloud](https://dashboard.aspose.cloud/#/apps) and get your application information.

Add this dependency to your project's POM:
```
<repositories>
    <repository>
        <id>AsposeJavaAPI</id>
        <name>Aspose Java API</name>
        <url>https://repository.aspose.cloud/repo/</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.aspose</groupId>
        <artifactId>aspose-cells-cloud</artifactId>
        <version>20.4.0</version>
    </dependency>
</dependencies>
```
If you already have Aspose.Cells Cloud SDK for Java and want to upgrade it, please execute `Update-Package Aspose.Cells-Cloud` to get the latest version.


Please check the [GitHub Repository](https://github.com/aspose-cells-cloud/aspose-cells-cloud-java) for other common usage scenarios.

## Using Java to Add a New Worksheet to an Excel File

The following code snippet demonstrates how to add a new worksheet to a Microsoft Excel document using Java code:

```Java
CellsApi cellsApi = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret())
String name = BOOK1;
String sheetName = SHEET1;
Integer position = 1;
String sheettype ="VB";
String folder = TEMPFOLDER;
cellsApi.uploadFile(folder +"\\" + filename, new File(sourceFolder + filename), null);
WorksheetsResponse response = cellsApi.cellsWorksheetsPutAddNewWorksheet(name, sheetName, position, sheettype, folder,null);
```

## Using Java to Convert an Excel File to another File Format

The following code example elaborates how you can use Java code to convert an Excel document to another file format in the cloud:

```Java
String name = BOOK1;
SaveOptions saveOptions = null;
String newfilename = "newbook.xlsx";
Boolean isAutoFitRows = true;
Boolean isAutoFitColumns = false;
String folder = TEMPFOLDER;
// Upload source file to aspose cloud storage
cellsApi.uploadFile(folder +"\\" + filename, new File(sourceFolder + filename), null);
// Invoke Aspose.Cells Cloud SDK API to convert excel workbook to different format
SaveResponse response = cellsApi.cellsSaveAsPostDocumentSaveAs(name, saveOptions, newfilename, isAutoFitRows, isAutoFitColumns, folder,null);
```

[Product Page](https://products.aspose.cloud/cells/java) | [Documentation](https://docs.aspose.cloud/cells/) | [Live Demo](https://products.aspose.app/cells/family) | [API Reference](https://apireference.aspose.cloud/cells/) | [Code Samples](https://github.com/aspose-cells-cloud/aspose-cells-cloud-java) | [Blog](https://blog.aspose.cloud/category/cells/) | [Free Support](https://forum.aspose.cloud/c/cells) | [Free Trial](https://dashboard.aspose.cloud/#/apps)

