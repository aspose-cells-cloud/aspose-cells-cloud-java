![](https://img.shields.io/badge/REST%20API-v3.0-lightgrey) [![GitHub license](https://img.shields.io/github/license/aspose-cells-cloud/aspose-cells-cloud-java)](https://github.com/aspose-cells-cloud/aspose-cells-cloud-java/blob/master/LICENSE) ![GitHub commits since latest release (by date)](https://img.shields.io/github/commits-since/aspose-cells-cloud/aspose-cells-cloud-java/23.7)

# Java SDK for Spreadsheet Processing in the Cloud

This Cloud SDK enhances your Java-based cloud apps to [process & manipulate Microsoft Excel spreadsheets](https://products.aspose.cloud/cells/java) in the cloud.

## Cloud Spreadsheet Processor in a Nutshell

- Create new spreadsheets using Excel files as templates or Smart Marker.
- Load & process Excel spreadsheets & worksheets via Cloud SDK.
- Merge or split workbooks.
- Protect or unprotect worksheets.
- [Import data to worksheets](https://docs.aspose.cloud/cells/import-data-into-worksheet/).
- Calculate formulas or add/update formulas to worksheet cells.
- Add, update or delete charts, worksheets, images, shapes, hyperlinks & validations.
- Add or remove cells area, conditional formatting or OleObjects from Excel worksheets.
- Insert or delete horizontal or vertical page breaks
- [Add ListObject](https://docs.aspose.cloud/cells/working-with-list-object-or-table/) at a specific place within an Excel file & convert to a range of cells.
- Delete specific or all ListObjects in a worksheet or summarize data with Pivot Table.
- Apply custom criteria to list filters of various types.
- Get, update, show or hide chart legend & titles.
- Manipulate page setup, header & footer.
- Create, update, fetch or delete document properties.
- Fetch the required shape from worksheet.
- Leverage the power of [Pivot Tables](https://docs.aspose.cloud/cells/working-with-pivot-tables/) & Ranges.

## Feature & Enhancements in Version 23.7

Full list of issues covering all changes in this release:

- Support to repair file.
- Remove GetExtractBarcodes API.

## Read & Write Spreadsheet Formats

**Microsoft Excel:** XLS, XLSX, XLSB, XLSM, XLT, XLTX, XLTM
**OpenOffice:** ODS
**SpreadsheetML:** XML
**Text:** CSV, TSV, TXT (TabDelimited)
**Web:** HTML, MHTML
**PDF**

## Save Spreadsheet As

DIF, HTML, MHTML, PNG, JPG, TIFF, XPS, SVG, MD (Markdown), ODS, XLSX, XLS, XLSB, PDF, XML, TXT, CSV

## Read Other Formats

SXC, FODS

## Get Started with Aspose.Cells Cloud SDK for Java

You do not need to install anything to get started with Aspose.Cells Cloud SDK for Java. Just create an account at [Aspose for Cloud](https://dashboard.aspose.cloud/#/apps) and get your application information.

Next, add the following dependency to your project's POM:
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
        <version>23.5.0</version>
    </dependency>
</dependencies>
```

## Using Java to Add a Worksheet to an Excel File

```Java
CellsApi cellsApi = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret());
String localName = "Book1.xlsx";
String remoteName = "Book1.xlsx";
CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
PutAddNewWorksheetRequest request = new PutAddNewWorksheetRequest();
request.setName(remoteName);
request.setSheetName("Sheet1");
request.setPosition(0);
request.setSheettype("VB");
request.setFolder(remoteFolder);
CellsCloudResponse response =  cellsApi.putAddNewWorksheet(request);
```

## Convert Excel File in the Cloud

```Java
CellsApi cellsApi = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret());
String localName = "cloud.png";
String remoteName = "cloud.png";
String format = "csv";
CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
PutConvertWorkbookRequest request = new PutConvertWorkbookRequest();
request.setFormat(format);
HashMap<String,File> fileMap = new HashMap<String,File>(); 
fileMap.put(localName ,CellsApiUtil.GetFileHolder(localName) ); 
request.setFile(fileMap);
File response =  cellsApi.putConvertWorkbook(request);
```
## Aspose.Cells Cloud SDKs in Popular Languages

| .NET | PHP | Python | Ruby | Node.js | Android | Swift | Perl | GO |
|---|---|---|---|---|---|---|---|---|
| [GitHub](https://github.com/aspose-cells-cloud/aspose-cells-cloud-dotnet) | [GitHub](https://github.com/aspose-cells-cloud/aspose-cells-cloud-php) | [GitHub](https://github.com/aspose-cells-cloud/aspose-cells-cloud-python) | [GitHub](https://github.com/aspose-cells-cloud/aspose-cells-cloud-ruby)  | [GitHub](https://github.com/aspose-cells-cloud/aspose-cells-cloud-node) | [GitHub](https://github.com/aspose-cells-cloud/aspose-cells-cloud-android)  | [GitHub](https://github.com/aspose-cells-cloud/aspose-cells-cloud-swift) | [GitHub](https://github.com/aspose-cells-cloud/aspose-cells-cloud-perl) | [GitHub](https://github.com/aspose-cells-cloud/aspose-cells-cloud-go) |
| [NuGet](https://www.nuget.org/packages/Aspose.Cells-Cloud/) | [Composer](https://packagist.org/packages/aspose/cells-sdk-php) | [PIP](https://pypi.org/project/asposecellscloud/) | [GEM](https://rubygems.org/gems/aspose_cells_cloud)  | [NPM](https://www.npmjs.com/package/asposecellscloud) | [Maven](https://repository.aspose.cloud/webapp/#/artifacts/browse/tree/General/repo/com/aspose/aspose-cells-cloud-android) | [POD](https://cocoapods.org/pods/AsposeCellsCloud) |  [CPAN](https://metacpan.org/release/AsposeCellsCloud-CellsApi) | [GO](https://pkg.go.dev/github.com/aspose-cells-cloud/aspose-cells-cloud-go/v20?tab=overview) |

[Product Page](https://products.aspose.cloud/cells/java) | [Documentation](https://docs.aspose.cloud/cells/) | [Live Demo](https://products.aspose.app/cells/family) | [API Reference](https://apireference.aspose.cloud/cells/) | [Code Samples](https://github.com/aspose-cells-cloud/aspose-cells-cloud-java) | [Blog](https://blog.aspose.cloud/category/cells/) | [Free Support](https://forum.aspose.cloud/c/cells) | [Free Trial](https://dashboard.aspose.cloud/#/apps)

