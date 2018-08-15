# aspose-cells-cloud

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.aspose</groupId>
    <artifactId>aspose-cells-cloud</artifactId>
    <version>18.8</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.aspose:aspose-cells-cloud:18.8"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/aspose-cells-cloud-18.8.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.client.auth.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.api.CellsApi;

import java.io.File;
import java.util.*;

public class CellsApiExample {

    public static void main(String[] args) {
        
        CellsApi apiInstance = new CellsApi();
        String name = "name_example"; // String | The workbook name.
        String sheetName = "sheetName_example"; // String | The worksheet name.
        Integer columnIndex = 56; // Integer | The column index.
        Integer columns = 56; // Integer | The columns.
        Boolean updateReference = true; // Boolean | The update reference.
        String folder = "folder_example"; // String | The workbook folder.
        try {
            ColumnsResponse result = apiInstance.cellsDeleteWorksheetColumns(name, sheetName, columnIndex, columns, updateReference, folder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CellsApi#cellsDeleteWorksheetColumns");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CellsApi* | [**cellsDeleteWorksheetColumns**](docs/CellsApi.md#cellsDeleteWorksheetColumns) | **DELETE** /cells/{name}/worksheets/{sheetName}/cells/columns/{columnIndex} | Delete worksheet columns.
*CellsApi* | [**cellsDeleteWorksheetRow**](docs/CellsApi.md#cellsDeleteWorksheetRow) | **DELETE** /cells/{name}/worksheets/{sheetName}/cells/rows/{rowIndex} | Delete worksheet row.
*CellsApi* | [**cellsDeleteWorksheetRows**](docs/CellsApi.md#cellsDeleteWorksheetRows) | **DELETE** /cells/{name}/worksheets/{sheetName}/cells/rows | Delete several worksheet rows.
*CellsApi* | [**cellsGetWorksheetCell**](docs/CellsApi.md#cellsGetWorksheetCell) | **GET** /cells/{name}/worksheets/{sheetName}/cells/{cellOrMethodName} | Read cell data by cell&#39;s name.
*CellsApi* | [**cellsGetWorksheetCellStyle**](docs/CellsApi.md#cellsGetWorksheetCellStyle) | **GET** /cells/{name}/worksheets/{sheetName}/cells/{cellName}/style | Read cell&#39;s style info.
*CellsApi* | [**cellsGetWorksheetCells**](docs/CellsApi.md#cellsGetWorksheetCells) | **GET** /cells/{name}/worksheets/{sheetName}/cells | Get cells info.
*CellsApi* | [**cellsGetWorksheetColumn**](docs/CellsApi.md#cellsGetWorksheetColumn) | **GET** /cells/{name}/worksheets/{sheetName}/cells/columns/{columnIndex} | Read worksheet column data by column&#39;s index.
*CellsApi* | [**cellsGetWorksheetColumns**](docs/CellsApi.md#cellsGetWorksheetColumns) | **GET** /cells/{name}/worksheets/{sheetName}/cells/columns | Read worksheet columns info.
*CellsApi* | [**cellsGetWorksheetRow**](docs/CellsApi.md#cellsGetWorksheetRow) | **GET** /cells/{name}/worksheets/{sheetName}/cells/rows/{rowIndex} | Read worksheet row data by row&#39;s index.
*CellsApi* | [**cellsGetWorksheetRows**](docs/CellsApi.md#cellsGetWorksheetRows) | **GET** /cells/{name}/worksheets/{sheetName}/cells/rows | Read worksheet rows info.
*CellsApi* | [**cellsPostCellCalculate**](docs/CellsApi.md#cellsPostCellCalculate) | **POST** /cells/{name}/worksheets/{sheetName}/cells/{cellName}/calculate | Cell calculate formula
*CellsApi* | [**cellsPostCellCharacters**](docs/CellsApi.md#cellsPostCellCharacters) | **POST** /cells/{name}/worksheets/{sheetName}/cells/{cellName}/characters | Set cell characters 
*CellsApi* | [**cellsPostClearContents**](docs/CellsApi.md#cellsPostClearContents) | **POST** /cells/{name}/worksheets/{sheetName}/cells/clearcontents | Clear cells contents.
*CellsApi* | [**cellsPostClearFormats**](docs/CellsApi.md#cellsPostClearFormats) | **POST** /cells/{name}/worksheets/{sheetName}/cells/clearformats | Clear cells contents.
*CellsApi* | [**cellsPostColumnStyle**](docs/CellsApi.md#cellsPostColumnStyle) | **POST** /cells/{name}/worksheets/{sheetName}/cells/columns/{columnIndex}/style | Set column style
*CellsApi* | [**cellsPostCopyCellIntoCell**](docs/CellsApi.md#cellsPostCopyCellIntoCell) | **POST** /cells/{name}/worksheets/{sheetName}/cells/{destCellName}/copy | Copy cell into cell
*CellsApi* | [**cellsPostCopyWorksheetColumns**](docs/CellsApi.md#cellsPostCopyWorksheetColumns) | **POST** /cells/{name}/worksheets/{sheetName}/cells/columns/copy | Copy worksheet columns.
*CellsApi* | [**cellsPostCopyWorksheetRows**](docs/CellsApi.md#cellsPostCopyWorksheetRows) | **POST** /cells/{name}/worksheets/{sheetName}/cells/rows/copy | Copy worksheet rows.
*CellsApi* | [**cellsPostGroupWorksheetColumns**](docs/CellsApi.md#cellsPostGroupWorksheetColumns) | **POST** /cells/{name}/worksheets/{sheetName}/cells/columns/group | Group worksheet columns.
*CellsApi* | [**cellsPostGroupWorksheetRows**](docs/CellsApi.md#cellsPostGroupWorksheetRows) | **POST** /cells/{name}/worksheets/{sheetName}/cells/rows/group | Group worksheet rows.
*CellsApi* | [**cellsPostHideWorksheetColumns**](docs/CellsApi.md#cellsPostHideWorksheetColumns) | **POST** /cells/{name}/worksheets/{sheetName}/cells/columns/hide | Hide worksheet columns.
*CellsApi* | [**cellsPostHideWorksheetRows**](docs/CellsApi.md#cellsPostHideWorksheetRows) | **POST** /cells/{name}/worksheets/{sheetName}/cells/rows/hide | Hide worksheet rows.
*CellsApi* | [**cellsPostRowStyle**](docs/CellsApi.md#cellsPostRowStyle) | **POST** /cells/{name}/worksheets/{sheetName}/cells/rows/{rowIndex}/style | Set row style.
*CellsApi* | [**cellsPostSetCellHtmlString**](docs/CellsApi.md#cellsPostSetCellHtmlString) | **POST** /cells/{name}/worksheets/{sheetName}/cells/{cellName}/htmlstring | Set htmlstring value into cell
*CellsApi* | [**cellsPostSetCellRangeValue**](docs/CellsApi.md#cellsPostSetCellRangeValue) | **POST** /cells/{name}/worksheets/{sheetName}/cells | Set cell range value 
*CellsApi* | [**cellsPostSetWorksheetColumnWidth**](docs/CellsApi.md#cellsPostSetWorksheetColumnWidth) | **POST** /cells/{name}/worksheets/{sheetName}/cells/columns/{columnIndex} | Set worksheet column width.
*CellsApi* | [**cellsPostUngroupWorksheetColumns**](docs/CellsApi.md#cellsPostUngroupWorksheetColumns) | **POST** /cells/{name}/worksheets/{sheetName}/cells/columns/ungroup | Ungroup worksheet columns.
*CellsApi* | [**cellsPostUngroupWorksheetRows**](docs/CellsApi.md#cellsPostUngroupWorksheetRows) | **POST** /cells/{name}/worksheets/{sheetName}/cells/rows/ungroup | Ungroup worksheet rows.
*CellsApi* | [**cellsPostUnhideWorksheetColumns**](docs/CellsApi.md#cellsPostUnhideWorksheetColumns) | **POST** /cells/{name}/worksheets/{sheetName}/cells/columns/unhide | Unhide worksheet columns.
*CellsApi* | [**cellsPostUnhideWorksheetRows**](docs/CellsApi.md#cellsPostUnhideWorksheetRows) | **POST** /cells/{name}/worksheets/{sheetName}/cells/rows/unhide | Unhide worksheet rows.
*CellsApi* | [**cellsPostUpdateWorksheetCellStyle**](docs/CellsApi.md#cellsPostUpdateWorksheetCellStyle) | **POST** /cells/{name}/worksheets/{sheetName}/cells/{cellName}/style | Update cell&#39;s style.
*CellsApi* | [**cellsPostUpdateWorksheetRangeStyle**](docs/CellsApi.md#cellsPostUpdateWorksheetRangeStyle) | **POST** /cells/{name}/worksheets/{sheetName}/cells/style | Update cell&#39;s range style.
*CellsApi* | [**cellsPostUpdateWorksheetRow**](docs/CellsApi.md#cellsPostUpdateWorksheetRow) | **POST** /cells/{name}/worksheets/{sheetName}/cells/rows/{rowIndex} | Update worksheet row.
*CellsApi* | [**cellsPostWorksheetCellSetValue**](docs/CellsApi.md#cellsPostWorksheetCellSetValue) | **POST** /cells/{name}/worksheets/{sheetName}/cells/{cellName} | Set cell value.
*CellsApi* | [**cellsPostWorksheetMerge**](docs/CellsApi.md#cellsPostWorksheetMerge) | **POST** /cells/{name}/worksheets/{sheetName}/cells/merge | Merge cells.
*CellsApi* | [**cellsPostWorksheetUnmerge**](docs/CellsApi.md#cellsPostWorksheetUnmerge) | **POST** /cells/{name}/worksheets/{sheetName}/cells/unmerge | Unmerge cells.
*CellsApi* | [**cellsPutInsertWorksheetColumns**](docs/CellsApi.md#cellsPutInsertWorksheetColumns) | **PUT** /cells/{name}/worksheets/{sheetName}/cells/columns/{columnIndex} | Insert worksheet columns.
*CellsApi* | [**cellsPutInsertWorksheetRow**](docs/CellsApi.md#cellsPutInsertWorksheetRow) | **PUT** /cells/{name}/worksheets/{sheetName}/cells/rows/{rowIndex} | Insert new worksheet row.
*CellsApi* | [**cellsPutInsertWorksheetRows**](docs/CellsApi.md#cellsPutInsertWorksheetRows) | **PUT** /cells/{name}/worksheets/{sheetName}/cells/rows | Insert several new worksheet rows.
*CellsAutoFilterApi* | [**cellsAutoFilterDeleteWorksheetDateFilter**](docs/CellsAutoFilterApi.md#cellsAutoFilterDeleteWorksheetDateFilter) | **DELETE** /cells/{name}/worksheets/{sheetName}/autoFilter/dateFilter | Removes a date filter.             
*CellsAutoFilterApi* | [**cellsAutoFilterDeleteWorksheetFilter**](docs/CellsAutoFilterApi.md#cellsAutoFilterDeleteWorksheetFilter) | **DELETE** /cells/{name}/worksheets/{sheetName}/autoFilter/filter | Delete a filter for a filter column.             
*CellsAutoFilterApi* | [**cellsAutoFilterGetWorksheetAutoFilter**](docs/CellsAutoFilterApi.md#cellsAutoFilterGetWorksheetAutoFilter) | **GET** /cells/{name}/worksheets/{sheetName}/autoFilter | Get Auto filter Description
*CellsAutoFilterApi* | [**cellsAutoFilterPostWorksheetAutoFilterRefresh**](docs/CellsAutoFilterApi.md#cellsAutoFilterPostWorksheetAutoFilterRefresh) | **POST** /cells/{name}/worksheets/{sheetName}/autoFilter/refresh | 
*CellsAutoFilterApi* | [**cellsAutoFilterPostWorksheetMatchBlanks**](docs/CellsAutoFilterApi.md#cellsAutoFilterPostWorksheetMatchBlanks) | **POST** /cells/{name}/worksheets/{sheetName}/autoFilter/matchBlanks | Match all blank cell in the list.
*CellsAutoFilterApi* | [**cellsAutoFilterPostWorksheetMatchNonBlanks**](docs/CellsAutoFilterApi.md#cellsAutoFilterPostWorksheetMatchNonBlanks) | **POST** /cells/{name}/worksheets/{sheetName}/autoFilter/matchNonBlanks | Match all not blank cell in the list.             
*CellsAutoFilterApi* | [**cellsAutoFilterPutWorksheetColorFilter**](docs/CellsAutoFilterApi.md#cellsAutoFilterPutWorksheetColorFilter) | **PUT** /cells/{name}/worksheets/{sheetName}/autoFilter/colorFilter | 
*CellsAutoFilterApi* | [**cellsAutoFilterPutWorksheetCustomFilter**](docs/CellsAutoFilterApi.md#cellsAutoFilterPutWorksheetCustomFilter) | **PUT** /cells/{name}/worksheets/{sheetName}/autoFilter/custom | Filters a list with a custom criteria.             
*CellsAutoFilterApi* | [**cellsAutoFilterPutWorksheetDateFilter**](docs/CellsAutoFilterApi.md#cellsAutoFilterPutWorksheetDateFilter) | **PUT** /cells/{name}/worksheets/{sheetName}/autoFilter/dateFilter | add date filter in worksheet 
*CellsAutoFilterApi* | [**cellsAutoFilterPutWorksheetDynamicFilter**](docs/CellsAutoFilterApi.md#cellsAutoFilterPutWorksheetDynamicFilter) | **PUT** /cells/{name}/worksheets/{sheetName}/autoFilter/dynamicFilter | 
*CellsAutoFilterApi* | [**cellsAutoFilterPutWorksheetFilter**](docs/CellsAutoFilterApi.md#cellsAutoFilterPutWorksheetFilter) | **PUT** /cells/{name}/worksheets/{sheetName}/autoFilter/filter | Adds a filter for a filter column.             
*CellsAutoFilterApi* | [**cellsAutoFilterPutWorksheetFilterTop10**](docs/CellsAutoFilterApi.md#cellsAutoFilterPutWorksheetFilterTop10) | **PUT** /cells/{name}/worksheets/{sheetName}/autoFilter/filterTop10 | Filter the top 10 item in the list
*CellsAutoFilterApi* | [**cellsAutoFilterPutWorksheetIconFilter**](docs/CellsAutoFilterApi.md#cellsAutoFilterPutWorksheetIconFilter) | **PUT** /cells/{name}/worksheets/{sheetName}/autoFilter/iconFilter | Adds an icon filter.
*CellsAutoshapesApi* | [**cellsAutoshapesGetWorksheetAutoshape**](docs/CellsAutoshapesApi.md#cellsAutoshapesGetWorksheetAutoshape) | **GET** /cells/{name}/worksheets/{sheetName}/autoshapes/{autoshapeNumber} | Get autoshape info.
*CellsAutoshapesApi* | [**cellsAutoshapesGetWorksheetAutoshapes**](docs/CellsAutoshapesApi.md#cellsAutoshapesGetWorksheetAutoshapes) | **GET** /cells/{name}/worksheets/{sheetName}/autoshapes | Get worksheet autoshapes info.
*CellsChartAreaApi* | [**cellsChartAreaGetChartArea**](docs/CellsChartAreaApi.md#cellsChartAreaGetChartArea) | **GET** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/chartArea | Get chart area info.
*CellsChartAreaApi* | [**cellsChartAreaGetChartAreaBorder**](docs/CellsChartAreaApi.md#cellsChartAreaGetChartAreaBorder) | **GET** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/chartArea/border | Get chart area border info.
*CellsChartAreaApi* | [**cellsChartAreaGetChartAreaFillFormat**](docs/CellsChartAreaApi.md#cellsChartAreaGetChartAreaFillFormat) | **GET** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/chartArea/fillFormat | Get chart area fill format info.
*CellsChartsApi* | [**cellsChartsDeleteWorksheetChartLegend**](docs/CellsChartsApi.md#cellsChartsDeleteWorksheetChartLegend) | **DELETE** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/legend | Hide legend in chart
*CellsChartsApi* | [**cellsChartsDeleteWorksheetChartTitle**](docs/CellsChartsApi.md#cellsChartsDeleteWorksheetChartTitle) | **DELETE** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/title | Hide title in chart
*CellsChartsApi* | [**cellsChartsDeleteWorksheetClearCharts**](docs/CellsChartsApi.md#cellsChartsDeleteWorksheetClearCharts) | **DELETE** /cells/{name}/worksheets/{sheetName}/charts | Clear the charts.
*CellsChartsApi* | [**cellsChartsDeleteWorksheetDeleteChart**](docs/CellsChartsApi.md#cellsChartsDeleteWorksheetDeleteChart) | **DELETE** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex} | Delete worksheet chart by index.
*CellsChartsApi* | [**cellsChartsGetWorksheetChart**](docs/CellsChartsApi.md#cellsChartsGetWorksheetChart) | **GET** /cells/{name}/worksheets/{sheetName}/charts/{chartNumber} | Get chart info.
*CellsChartsApi* | [**cellsChartsGetWorksheetChartLegend**](docs/CellsChartsApi.md#cellsChartsGetWorksheetChartLegend) | **GET** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/legend | Get chart legend
*CellsChartsApi* | [**cellsChartsGetWorksheetChartTitle**](docs/CellsChartsApi.md#cellsChartsGetWorksheetChartTitle) | **GET** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/title | Get chart title
*CellsChartsApi* | [**cellsChartsGetWorksheetCharts**](docs/CellsChartsApi.md#cellsChartsGetWorksheetCharts) | **GET** /cells/{name}/worksheets/{sheetName}/charts | Get worksheet charts info.
*CellsChartsApi* | [**cellsChartsPostWorksheetChart**](docs/CellsChartsApi.md#cellsChartsPostWorksheetChart) | **POST** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex} | Update chart propreties
*CellsChartsApi* | [**cellsChartsPostWorksheetChartLegend**](docs/CellsChartsApi.md#cellsChartsPostWorksheetChartLegend) | **POST** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/legend | Update chart legend
*CellsChartsApi* | [**cellsChartsPostWorksheetChartTitle**](docs/CellsChartsApi.md#cellsChartsPostWorksheetChartTitle) | **POST** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/title | Update chart title
*CellsChartsApi* | [**cellsChartsPutWorksheetAddChart**](docs/CellsChartsApi.md#cellsChartsPutWorksheetAddChart) | **PUT** /cells/{name}/worksheets/{sheetName}/charts | Add new chart to worksheet.
*CellsChartsApi* | [**cellsChartsPutWorksheetChartLegend**](docs/CellsChartsApi.md#cellsChartsPutWorksheetChartLegend) | **PUT** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/legend | Show legend in chart
*CellsChartsApi* | [**cellsChartsPutWorksheetChartTitle**](docs/CellsChartsApi.md#cellsChartsPutWorksheetChartTitle) | **PUT** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/title | Add chart title / Set chart title visible
*CellsConditionalFormattingsApi* | [**cellsConditionalFormattingsDeleteWorksheetConditionalFormatting**](docs/CellsConditionalFormattingsApi.md#cellsConditionalFormattingsDeleteWorksheetConditionalFormatting) | **DELETE** /cells/{name}/worksheets/{sheetName}/conditionalFormattings/{index} | Remove conditional formatting
*CellsConditionalFormattingsApi* | [**cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea**](docs/CellsConditionalFormattingsApi.md#cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea) | **DELETE** /cells/{name}/worksheets/{sheetName}/conditionalFormattings/area | Remove cell area from conditional formatting.
*CellsConditionalFormattingsApi* | [**cellsConditionalFormattingsDeleteWorksheetConditionalFormattings**](docs/CellsConditionalFormattingsApi.md#cellsConditionalFormattingsDeleteWorksheetConditionalFormattings) | **DELETE** /cells/{name}/worksheets/{sheetName}/conditionalFormattings | Clear all condition formattings
*CellsConditionalFormattingsApi* | [**cellsConditionalFormattingsGetWorksheetConditionalFormatting**](docs/CellsConditionalFormattingsApi.md#cellsConditionalFormattingsGetWorksheetConditionalFormatting) | **GET** /cells/{name}/worksheets/{sheetName}/conditionalFormattings/{index} | Get conditional formatting
*CellsConditionalFormattingsApi* | [**cellsConditionalFormattingsGetWorksheetConditionalFormattings**](docs/CellsConditionalFormattingsApi.md#cellsConditionalFormattingsGetWorksheetConditionalFormattings) | **GET** /cells/{name}/worksheets/{sheetName}/conditionalFormattings | Get conditional formattings 
*CellsConditionalFormattingsApi* | [**cellsConditionalFormattingsPutWorksheetConditionalFormatting**](docs/CellsConditionalFormattingsApi.md#cellsConditionalFormattingsPutWorksheetConditionalFormatting) | **PUT** /cells/{name}/worksheets/{sheetName}/conditionalFormattings | Add a condition formatting.
*CellsConditionalFormattingsApi* | [**cellsConditionalFormattingsPutWorksheetFormatCondition**](docs/CellsConditionalFormattingsApi.md#cellsConditionalFormattingsPutWorksheetFormatCondition) | **PUT** /cells/{name}/worksheets/{sheetName}/conditionalFormattings/{index} | Add a format condition.
*CellsConditionalFormattingsApi* | [**cellsConditionalFormattingsPutWorksheetFormatConditionArea**](docs/CellsConditionalFormattingsApi.md#cellsConditionalFormattingsPutWorksheetFormatConditionArea) | **PUT** /cells/{name}/worksheets/{sheetName}/conditionalFormattings/{index}/area | add a cell area for format condition             
*CellsConditionalFormattingsApi* | [**cellsConditionalFormattingsPutWorksheetFormatConditionCondition**](docs/CellsConditionalFormattingsApi.md#cellsConditionalFormattingsPutWorksheetFormatConditionCondition) | **PUT** /cells/{name}/worksheets/{sheetName}/conditionalFormattings/{index}/condition | Add a condition for format condition.
*CellsHypelinksApi* | [**cellsHypelinksDeleteWorksheetHyperlink**](docs/CellsHypelinksApi.md#cellsHypelinksDeleteWorksheetHyperlink) | **DELETE** /cells/{name}/worksheets/{sheetName}/hyperlinks/{hyperlinkIndex} | Delete worksheet hyperlink by index.
*CellsHypelinksApi* | [**cellsHypelinksDeleteWorksheetHyperlinks**](docs/CellsHypelinksApi.md#cellsHypelinksDeleteWorksheetHyperlinks) | **DELETE** /cells/{name}/worksheets/{sheetName}/hyperlinks | Delete all hyperlinks in worksheet.
*CellsHypelinksApi* | [**cellsHypelinksGetWorksheetHyperlink**](docs/CellsHypelinksApi.md#cellsHypelinksGetWorksheetHyperlink) | **GET** /cells/{name}/worksheets/{sheetName}/hyperlinks/{hyperlinkIndex} | Get worksheet hyperlink by index.
*CellsHypelinksApi* | [**cellsHypelinksGetWorksheetHyperlinks**](docs/CellsHypelinksApi.md#cellsHypelinksGetWorksheetHyperlinks) | **GET** /cells/{name}/worksheets/{sheetName}/hyperlinks | Get worksheet hyperlinks.
*CellsHypelinksApi* | [**cellsHypelinksPostWorksheetHyperlink**](docs/CellsHypelinksApi.md#cellsHypelinksPostWorksheetHyperlink) | **POST** /cells/{name}/worksheets/{sheetName}/hyperlinks/{hyperlinkIndex} | Update worksheet hyperlink by index.
*CellsHypelinksApi* | [**cellsHypelinksPutWorksheetHyperlink**](docs/CellsHypelinksApi.md#cellsHypelinksPutWorksheetHyperlink) | **PUT** /cells/{name}/worksheets/{sheetName}/hyperlinks | Add worksheet hyperlink.
*CellsListObjectsApi* | [**cellsListObjectsDeleteWorksheetListObject**](docs/CellsListObjectsApi.md#cellsListObjectsDeleteWorksheetListObject) | **DELETE** /cells/{name}/worksheets/{sheetName}/listobjects/{listObjectIndex} | Delete worksheet list object by index
*CellsListObjectsApi* | [**cellsListObjectsDeleteWorksheetListObjects**](docs/CellsListObjectsApi.md#cellsListObjectsDeleteWorksheetListObjects) | **DELETE** /cells/{name}/worksheets/{sheetName}/listobjects | Delete worksheet list objects
*CellsListObjectsApi* | [**cellsListObjectsGetWorksheetListObject**](docs/CellsListObjectsApi.md#cellsListObjectsGetWorksheetListObject) | **GET** /cells/{name}/worksheets/{sheetName}/listobjects/{listobjectindex} | Get worksheet list object info by index.
*CellsListObjectsApi* | [**cellsListObjectsGetWorksheetListObjects**](docs/CellsListObjectsApi.md#cellsListObjectsGetWorksheetListObjects) | **GET** /cells/{name}/worksheets/{sheetName}/listobjects | Get worksheet listobjects info.
*CellsListObjectsApi* | [**cellsListObjectsPostWorksheetListObject**](docs/CellsListObjectsApi.md#cellsListObjectsPostWorksheetListObject) | **POST** /cells/{name}/worksheets/{sheetName}/listobjects/{listObjectIndex} | Update  list object 
*CellsListObjectsApi* | [**cellsListObjectsPostWorksheetListObjectConvertToRange**](docs/CellsListObjectsApi.md#cellsListObjectsPostWorksheetListObjectConvertToRange) | **POST** /cells/{name}/worksheets/{sheetName}/listobjects/{listObjectIndex}/ConvertToRange | 
*CellsListObjectsApi* | [**cellsListObjectsPostWorksheetListObjectSortTable**](docs/CellsListObjectsApi.md#cellsListObjectsPostWorksheetListObjectSortTable) | **POST** /cells/{name}/worksheets/{sheetName}/listobjects/{listObjectIndex}/sort | 
*CellsListObjectsApi* | [**cellsListObjectsPostWorksheetListObjectSummarizeWithPivotTable**](docs/CellsListObjectsApi.md#cellsListObjectsPostWorksheetListObjectSummarizeWithPivotTable) | **POST** /cells/{name}/worksheets/{sheetName}/listobjects/{listObjectIndex}/SummarizeWithPivotTable | 
*CellsListObjectsApi* | [**cellsListObjectsPutWorksheetListObject**](docs/CellsListObjectsApi.md#cellsListObjectsPutWorksheetListObject) | **PUT** /cells/{name}/worksheets/{sheetName}/listobjects | Add a list object into worksheet.
*CellsOleObjectsApi* | [**cellsOleObjectsDeleteWorksheetOleObject**](docs/CellsOleObjectsApi.md#cellsOleObjectsDeleteWorksheetOleObject) | **DELETE** /cells/{name}/worksheets/{sheetName}/oleobjects/{oleObjectIndex} | Delete OLE object.
*CellsOleObjectsApi* | [**cellsOleObjectsDeleteWorksheetOleObjects**](docs/CellsOleObjectsApi.md#cellsOleObjectsDeleteWorksheetOleObjects) | **DELETE** /cells/{name}/worksheets/{sheetName}/oleobjects | Delete all OLE objects.
*CellsOleObjectsApi* | [**cellsOleObjectsGetWorksheetOleObject**](docs/CellsOleObjectsApi.md#cellsOleObjectsGetWorksheetOleObject) | **GET** /cells/{name}/worksheets/{sheetName}/oleobjects/{objectNumber} | Get OLE object info.
*CellsOleObjectsApi* | [**cellsOleObjectsGetWorksheetOleObjects**](docs/CellsOleObjectsApi.md#cellsOleObjectsGetWorksheetOleObjects) | **GET** /cells/{name}/worksheets/{sheetName}/oleobjects | Get worksheet OLE objects info.
*CellsOleObjectsApi* | [**cellsOleObjectsPostUpdateWorksheetOleObject**](docs/CellsOleObjectsApi.md#cellsOleObjectsPostUpdateWorksheetOleObject) | **POST** /cells/{name}/worksheets/{sheetName}/oleobjects/{oleObjectIndex} | Update OLE object.
*CellsOleObjectsApi* | [**cellsOleObjectsPutWorksheetOleObject**](docs/CellsOleObjectsApi.md#cellsOleObjectsPutWorksheetOleObject) | **PUT** /cells/{name}/worksheets/{sheetName}/oleobjects | Add OLE object
*CellsPageBreaksApi* | [**cellsPageBreaksDeleteHorizontalPageBreak**](docs/CellsPageBreaksApi.md#cellsPageBreaksDeleteHorizontalPageBreak) | **DELETE** /cells/{name}/worksheets/{sheetName}/horizontalpagebreaks/{index} | 
*CellsPageBreaksApi* | [**cellsPageBreaksDeleteHorizontalPageBreaks**](docs/CellsPageBreaksApi.md#cellsPageBreaksDeleteHorizontalPageBreaks) | **DELETE** /cells/{name}/worksheets/{sheetName}/horizontalpagebreaks | 
*CellsPageBreaksApi* | [**cellsPageBreaksDeleteVerticalPageBreak**](docs/CellsPageBreaksApi.md#cellsPageBreaksDeleteVerticalPageBreak) | **DELETE** /cells/{name}/worksheets/{sheetName}/verticalpagebreaks/{index} | 
*CellsPageBreaksApi* | [**cellsPageBreaksDeleteVerticalPageBreaks**](docs/CellsPageBreaksApi.md#cellsPageBreaksDeleteVerticalPageBreaks) | **DELETE** /cells/{name}/worksheets/{sheetName}/verticalpagebreaks | 
*CellsPageBreaksApi* | [**cellsPageBreaksGetHorizontalPageBreak**](docs/CellsPageBreaksApi.md#cellsPageBreaksGetHorizontalPageBreak) | **GET** /cells/{name}/worksheets/{sheetName}/horizontalpagebreaks/{index} | 
*CellsPageBreaksApi* | [**cellsPageBreaksGetHorizontalPageBreaks**](docs/CellsPageBreaksApi.md#cellsPageBreaksGetHorizontalPageBreaks) | **GET** /cells/{name}/worksheets/{sheetName}/horizontalpagebreaks | 
*CellsPageBreaksApi* | [**cellsPageBreaksGetVerticalPageBreak**](docs/CellsPageBreaksApi.md#cellsPageBreaksGetVerticalPageBreak) | **GET** /cells/{name}/worksheets/{sheetName}/verticalpagebreaks/{index} | 
*CellsPageBreaksApi* | [**cellsPageBreaksGetVerticalPageBreaks**](docs/CellsPageBreaksApi.md#cellsPageBreaksGetVerticalPageBreaks) | **GET** /cells/{name}/worksheets/{sheetName}/verticalpagebreaks | 
*CellsPageBreaksApi* | [**cellsPageBreaksPutHorizontalPageBreak**](docs/CellsPageBreaksApi.md#cellsPageBreaksPutHorizontalPageBreak) | **PUT** /cells/{name}/worksheets/{sheetName}/horizontalpagebreaks | 
*CellsPageBreaksApi* | [**cellsPageBreaksPutVerticalPageBreak**](docs/CellsPageBreaksApi.md#cellsPageBreaksPutVerticalPageBreak) | **PUT** /cells/{name}/worksheets/{sheetName}/verticalpagebreaks | 
*CellsPageSetupApi* | [**cellsPageSetupDeleteHeaderFooter**](docs/CellsPageSetupApi.md#cellsPageSetupDeleteHeaderFooter) | **DELETE** /cells/{name}/worksheets/{sheetName}/pagesetup/clearheaderfooter | clear header footer
*CellsPageSetupApi* | [**cellsPageSetupGetFooter**](docs/CellsPageSetupApi.md#cellsPageSetupGetFooter) | **GET** /cells/{name}/worksheets/{sheetName}/pagesetup/footer | get page footer information
*CellsPageSetupApi* | [**cellsPageSetupGetHeader**](docs/CellsPageSetupApi.md#cellsPageSetupGetHeader) | **GET** /cells/{name}/worksheets/{sheetName}/pagesetup/header | get page header information
*CellsPageSetupApi* | [**cellsPageSetupGetPageSetup**](docs/CellsPageSetupApi.md#cellsPageSetupGetPageSetup) | **GET** /cells/{name}/worksheets/{sheetName}/pagesetup | Get Page Setup information.             
*CellsPageSetupApi* | [**cellsPageSetupPostFooter**](docs/CellsPageSetupApi.md#cellsPageSetupPostFooter) | **POST** /cells/{name}/worksheets/{sheetName}/pagesetup/footer | update  page footer information 
*CellsPageSetupApi* | [**cellsPageSetupPostHeader**](docs/CellsPageSetupApi.md#cellsPageSetupPostHeader) | **POST** /cells/{name}/worksheets/{sheetName}/pagesetup/header | update  page header information 
*CellsPageSetupApi* | [**cellsPageSetupPostPageSetup**](docs/CellsPageSetupApi.md#cellsPageSetupPostPageSetup) | **POST** /cells/{name}/worksheets/{sheetName}/pagesetup | Update Page Setup information.
*CellsPicturesApi* | [**cellsPicturesDeleteWorksheetPicture**](docs/CellsPicturesApi.md#cellsPicturesDeleteWorksheetPicture) | **DELETE** /cells/{name}/worksheets/{sheetName}/pictures/{pictureIndex} | Delete a picture object in worksheet
*CellsPicturesApi* | [**cellsPicturesDeleteWorksheetPictures**](docs/CellsPicturesApi.md#cellsPicturesDeleteWorksheetPictures) | **DELETE** /cells/{name}/worksheets/{sheetName}/pictures | Delete all pictures in worksheet.
*CellsPicturesApi* | [**cellsPicturesGetWorksheetPicture**](docs/CellsPicturesApi.md#cellsPicturesGetWorksheetPicture) | **GET** /cells/{name}/worksheets/{sheetName}/pictures/{pictureNumber} | GRead worksheet picture by number.
*CellsPicturesApi* | [**cellsPicturesGetWorksheetPictures**](docs/CellsPicturesApi.md#cellsPicturesGetWorksheetPictures) | **GET** /cells/{name}/worksheets/{sheetName}/pictures | Read worksheet pictures.
*CellsPicturesApi* | [**cellsPicturesPostWorksheetPicture**](docs/CellsPicturesApi.md#cellsPicturesPostWorksheetPicture) | **POST** /cells/{name}/worksheets/{sheetName}/pictures/{pictureIndex} | Update worksheet picture by index.
*CellsPicturesApi* | [**cellsPicturesPutWorksheetAddPicture**](docs/CellsPicturesApi.md#cellsPicturesPutWorksheetAddPicture) | **PUT** /cells/{name}/worksheets/{sheetName}/pictures | Add a new worksheet picture.
*CellsPivotTablesApi* | [**cellsPivotTablesDeletePivotTableField**](docs/CellsPivotTablesApi.md#cellsPivotTablesDeletePivotTableField) | **DELETE** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotField | Delete pivot field into into pivot table
*CellsPivotTablesApi* | [**cellsPivotTablesDeleteWorksheetPivotTable**](docs/CellsPivotTablesApi.md#cellsPivotTablesDeleteWorksheetPivotTable) | **DELETE** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex} | Delete worksheet pivot table by index
*CellsPivotTablesApi* | [**cellsPivotTablesDeleteWorksheetPivotTableFilter**](docs/CellsPivotTablesApi.md#cellsPivotTablesDeleteWorksheetPivotTableFilter) | **DELETE** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotFilters/{fieldIndex} | delete  pivot filter for piovt table             
*CellsPivotTablesApi* | [**cellsPivotTablesDeleteWorksheetPivotTableFilters**](docs/CellsPivotTablesApi.md#cellsPivotTablesDeleteWorksheetPivotTableFilters) | **DELETE** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotFilters | delete all pivot filters for piovt table
*CellsPivotTablesApi* | [**cellsPivotTablesDeleteWorksheetPivotTables**](docs/CellsPivotTablesApi.md#cellsPivotTablesDeleteWorksheetPivotTables) | **DELETE** /cells/{name}/worksheets/{sheetName}/pivottables | Delete worksheet pivot tables
*CellsPivotTablesApi* | [**cellsPivotTablesGetPivotTableField**](docs/CellsPivotTablesApi.md#cellsPivotTablesGetPivotTableField) | **GET** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotField | Get pivot field into into pivot table
*CellsPivotTablesApi* | [**cellsPivotTablesGetWorksheetPivotTable**](docs/CellsPivotTablesApi.md#cellsPivotTablesGetWorksheetPivotTable) | **GET** /cells/{name}/worksheets/{sheetName}/pivottables/{pivottableIndex} | Get worksheet pivottable info by index.
*CellsPivotTablesApi* | [**cellsPivotTablesGetWorksheetPivotTableFilter**](docs/CellsPivotTablesApi.md#cellsPivotTablesGetWorksheetPivotTableFilter) | **GET** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotFilters/{filterIndex} | 
*CellsPivotTablesApi* | [**cellsPivotTablesGetWorksheetPivotTableFilters**](docs/CellsPivotTablesApi.md#cellsPivotTablesGetWorksheetPivotTableFilters) | **GET** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotFilters | 
*CellsPivotTablesApi* | [**cellsPivotTablesGetWorksheetPivotTables**](docs/CellsPivotTablesApi.md#cellsPivotTablesGetWorksheetPivotTables) | **GET** /cells/{name}/worksheets/{sheetName}/pivottables | Get worksheet pivottables info.
*CellsPivotTablesApi* | [**cellsPivotTablesPostPivotTableCellStyle**](docs/CellsPivotTablesApi.md#cellsPivotTablesPostPivotTableCellStyle) | **POST** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/Format | Update cell style for pivot table
*CellsPivotTablesApi* | [**cellsPivotTablesPostPivotTableFieldHideItem**](docs/CellsPivotTablesApi.md#cellsPivotTablesPostPivotTableFieldHideItem) | **POST** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotField/Hide | 
*CellsPivotTablesApi* | [**cellsPivotTablesPostPivotTableFieldMoveTo**](docs/CellsPivotTablesApi.md#cellsPivotTablesPostPivotTableFieldMoveTo) | **POST** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotField/Move | 
*CellsPivotTablesApi* | [**cellsPivotTablesPostPivotTableStyle**](docs/CellsPivotTablesApi.md#cellsPivotTablesPostPivotTableStyle) | **POST** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/FormatAll | Update style for pivot table
*CellsPivotTablesApi* | [**cellsPivotTablesPostWorksheetPivotTableCalculate**](docs/CellsPivotTablesApi.md#cellsPivotTablesPostWorksheetPivotTableCalculate) | **POST** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/Calculate | Calculates pivottable&#39;s data to cells.
*CellsPivotTablesApi* | [**cellsPivotTablesPostWorksheetPivotTableMove**](docs/CellsPivotTablesApi.md#cellsPivotTablesPostWorksheetPivotTableMove) | **POST** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/Move | 
*CellsPivotTablesApi* | [**cellsPivotTablesPutPivotTableField**](docs/CellsPivotTablesApi.md#cellsPivotTablesPutPivotTableField) | **PUT** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotField | Add pivot field into into pivot table
*CellsPivotTablesApi* | [**cellsPivotTablesPutWorksheetPivotTable**](docs/CellsPivotTablesApi.md#cellsPivotTablesPutWorksheetPivotTable) | **PUT** /cells/{name}/worksheets/{sheetName}/pivottables | Add a pivot table into worksheet.
*CellsPivotTablesApi* | [**cellsPivotTablesPutWorksheetPivotTableFilter**](docs/CellsPivotTablesApi.md#cellsPivotTablesPutWorksheetPivotTableFilter) | **PUT** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotFilters | Add pivot filter for piovt table index
*CellsPropertiesApi* | [**cellsPropertiesDeleteDocumentProperties**](docs/CellsPropertiesApi.md#cellsPropertiesDeleteDocumentProperties) | **DELETE** /cells/{name}/documentproperties | Delete all custom document properties and clean built-in ones.
*CellsPropertiesApi* | [**cellsPropertiesDeleteDocumentProperty**](docs/CellsPropertiesApi.md#cellsPropertiesDeleteDocumentProperty) | **DELETE** /cells/{name}/documentproperties/{propertyName} | Delete document property.
*CellsPropertiesApi* | [**cellsPropertiesGetDocumentProperties**](docs/CellsPropertiesApi.md#cellsPropertiesGetDocumentProperties) | **GET** /cells/{name}/documentproperties | Read document properties.
*CellsPropertiesApi* | [**cellsPropertiesGetDocumentProperty**](docs/CellsPropertiesApi.md#cellsPropertiesGetDocumentProperty) | **GET** /cells/{name}/documentproperties/{propertyName} | Read document property by name.
*CellsPropertiesApi* | [**cellsPropertiesPutDocumentProperty**](docs/CellsPropertiesApi.md#cellsPropertiesPutDocumentProperty) | **PUT** /cells/{name}/documentproperties/{propertyName} | Set/create document property.
*CellsRangesApi* | [**cellsRangesPostWorksheetCellsRangeColumnWidth**](docs/CellsRangesApi.md#cellsRangesPostWorksheetCellsRangeColumnWidth) | **POST** /cells/{name}/worksheets/{sheetName}/ranges/columnWidth | Set column width of range
*CellsRangesApi* | [**cellsRangesPostWorksheetCellsRangeMerge**](docs/CellsRangesApi.md#cellsRangesPostWorksheetCellsRangeMerge) | **POST** /cells/{name}/worksheets/{sheetName}/ranges/merge | Combines a range of cells into a single cell.              
*CellsRangesApi* | [**cellsRangesPostWorksheetCellsRangeMoveTo**](docs/CellsRangesApi.md#cellsRangesPostWorksheetCellsRangeMoveTo) | **POST** /cells/{name}/worksheets/{sheetName}/ranges/moveto | Move the current range to the dest range.             
*CellsRangesApi* | [**cellsRangesPostWorksheetCellsRangeOutlineBorder**](docs/CellsRangesApi.md#cellsRangesPostWorksheetCellsRangeOutlineBorder) | **POST** /cells/{name}/worksheets/{sheetName}/ranges/outlineBorder | Sets outline border around a range of cells.
*CellsRangesApi* | [**cellsRangesPostWorksheetCellsRangeRowHeight**](docs/CellsRangesApi.md#cellsRangesPostWorksheetCellsRangeRowHeight) | **POST** /cells/{name}/worksheets/{sheetName}/ranges/rowHeight | set row height of range
*CellsRangesApi* | [**cellsRangesPostWorksheetCellsRangeStyle**](docs/CellsRangesApi.md#cellsRangesPostWorksheetCellsRangeStyle) | **POST** /cells/{name}/worksheets/{sheetName}/ranges/style | Sets the style of the range.             
*CellsRangesApi* | [**cellsRangesPostWorksheetCellsRangeUnmerge**](docs/CellsRangesApi.md#cellsRangesPostWorksheetCellsRangeUnmerge) | **POST** /cells/{name}/worksheets/{sheetName}/ranges/unmerge | Unmerges merged cells of this range.             
*CellsRangesApi* | [**cellsRangesPostWorksheetCellsRangeValue**](docs/CellsRangesApi.md#cellsRangesPostWorksheetCellsRangeValue) | **POST** /cells/{name}/worksheets/{sheetName}/ranges/value | Puts a value into the range, if appropriate the value will be converted to other data type and cell&#39;s number format will be reset.             
*CellsRangesApi* | [**cellsRangesPostWorksheetCellsRanges**](docs/CellsRangesApi.md#cellsRangesPostWorksheetCellsRanges) | **POST** /cells/{name}/worksheets/{sheetName}/ranges | copy range in the worksheet
*CellsSaveAsApi* | [**cellsSaveAsPostDocumentSaveAs**](docs/CellsSaveAsApi.md#cellsSaveAsPostDocumentSaveAs) | **POST** /cells/{name}/SaveAs | Convert document and save result to storage.
*CellsShapesApi* | [**cellsShapesDeleteWorksheetShape**](docs/CellsShapesApi.md#cellsShapesDeleteWorksheetShape) | **DELETE** /cells/{name}/worksheets/{sheetName}/shapes/{shapeindex} | Delete a shape in worksheet
*CellsShapesApi* | [**cellsShapesDeleteWorksheetShapes**](docs/CellsShapesApi.md#cellsShapesDeleteWorksheetShapes) | **DELETE** /cells/{name}/worksheets/{sheetName}/shapes | delete all shapes in worksheet
*CellsShapesApi* | [**cellsShapesGetWorksheetShape**](docs/CellsShapesApi.md#cellsShapesGetWorksheetShape) | **GET** /cells/{name}/worksheets/{sheetName}/shapes/{shapeindex} | Get worksheet shape
*CellsShapesApi* | [**cellsShapesGetWorksheetShapes**](docs/CellsShapesApi.md#cellsShapesGetWorksheetShapes) | **GET** /cells/{name}/worksheets/{sheetName}/shapes | Get worksheet shapes 
*CellsShapesApi* | [**cellsShapesPostWorksheetShape**](docs/CellsShapesApi.md#cellsShapesPostWorksheetShape) | **POST** /cells/{name}/worksheets/{sheetName}/shapes/{shapeindex} | Update a shape in worksheet
*CellsShapesApi* | [**cellsShapesPutWorksheetShape**](docs/CellsShapesApi.md#cellsShapesPutWorksheetShape) | **PUT** /cells/{name}/worksheets/{sheetName}/shapes | Add shape in worksheet
*CellsTaskApi* | [**cellsTaskPostRunTask**](docs/CellsTaskApi.md#cellsTaskPostRunTask) | **POST** /cells/task/runtask | Run tasks  
*CellsWorkbookApi* | [**cellsWorkbookDeleteDecryptDocument**](docs/CellsWorkbookApi.md#cellsWorkbookDeleteDecryptDocument) | **DELETE** /cells/{name}/encryption | Decrypt document.
*CellsWorkbookApi* | [**cellsWorkbookDeleteDocumentUnprotectFromChanges**](docs/CellsWorkbookApi.md#cellsWorkbookDeleteDocumentUnprotectFromChanges) | **DELETE** /cells/{name}/writeProtection | Unprotect document from changes.
*CellsWorkbookApi* | [**cellsWorkbookDeleteUnprotectDocument**](docs/CellsWorkbookApi.md#cellsWorkbookDeleteUnprotectDocument) | **DELETE** /cells/{name}/protection | Unprotect document.
*CellsWorkbookApi* | [**cellsWorkbookGetWorkbook**](docs/CellsWorkbookApi.md#cellsWorkbookGetWorkbook) | **GET** /cells/{name} | Read workbook info or export.
*CellsWorkbookApi* | [**cellsWorkbookGetWorkbookDefaultStyle**](docs/CellsWorkbookApi.md#cellsWorkbookGetWorkbookDefaultStyle) | **GET** /cells/{name}/defaultstyle | Read workbook default style info.
*CellsWorkbookApi* | [**cellsWorkbookGetWorkbookName**](docs/CellsWorkbookApi.md#cellsWorkbookGetWorkbookName) | **GET** /cells/{name}/names/{nameName} | Read workbook&#39;s name.
*CellsWorkbookApi* | [**cellsWorkbookGetWorkbookNames**](docs/CellsWorkbookApi.md#cellsWorkbookGetWorkbookNames) | **GET** /cells/{name}/names | Read workbook&#39;s names.
*CellsWorkbookApi* | [**cellsWorkbookGetWorkbookSettings**](docs/CellsWorkbookApi.md#cellsWorkbookGetWorkbookSettings) | **GET** /cells/{name}/settings | Get Workbook Settings DTO
*CellsWorkbookApi* | [**cellsWorkbookGetWorkbookTextItems**](docs/CellsWorkbookApi.md#cellsWorkbookGetWorkbookTextItems) | **GET** /cells/{name}/textItems | Read workbook&#39;s text items.
*CellsWorkbookApi* | [**cellsWorkbookPostAutofitWorkbookRows**](docs/CellsWorkbookApi.md#cellsWorkbookPostAutofitWorkbookRows) | **POST** /cells/{name}/autofitrows | Autofit workbook rows.
*CellsWorkbookApi* | [**cellsWorkbookPostEncryptDocument**](docs/CellsWorkbookApi.md#cellsWorkbookPostEncryptDocument) | **POST** /cells/{name}/encryption | Encript document.
*CellsWorkbookApi* | [**cellsWorkbookPostImportData**](docs/CellsWorkbookApi.md#cellsWorkbookPostImportData) | **POST** /cells/{name}/importdata | 
*CellsWorkbookApi* | [**cellsWorkbookPostProtectDocument**](docs/CellsWorkbookApi.md#cellsWorkbookPostProtectDocument) | **POST** /cells/{name}/protection | Protect document.
*CellsWorkbookApi* | [**cellsWorkbookPostWorkbookCalculateFormula**](docs/CellsWorkbookApi.md#cellsWorkbookPostWorkbookCalculateFormula) | **POST** /cells/{name}/calculateformula | Calculate all formulas in workbook.
*CellsWorkbookApi* | [**cellsWorkbookPostWorkbookGetSmartMarkerResult**](docs/CellsWorkbookApi.md#cellsWorkbookPostWorkbookGetSmartMarkerResult) | **POST** /cells/{name}/smartmarker | Smart marker processing result.
*CellsWorkbookApi* | [**cellsWorkbookPostWorkbookSettings**](docs/CellsWorkbookApi.md#cellsWorkbookPostWorkbookSettings) | **POST** /cells/{name}/settings | Update Workbook setting 
*CellsWorkbookApi* | [**cellsWorkbookPostWorkbookSplit**](docs/CellsWorkbookApi.md#cellsWorkbookPostWorkbookSplit) | **POST** /cells/{name}/split | Split workbook.
*CellsWorkbookApi* | [**cellsWorkbookPostWorkbooksMerge**](docs/CellsWorkbookApi.md#cellsWorkbookPostWorkbooksMerge) | **POST** /cells/{name}/merge | Merge workbooks.
*CellsWorkbookApi* | [**cellsWorkbookPostWorkbooksTextReplace**](docs/CellsWorkbookApi.md#cellsWorkbookPostWorkbooksTextReplace) | **POST** /cells/{name}/replaceText | Replace text.
*CellsWorkbookApi* | [**cellsWorkbookPostWorkbooksTextSearch**](docs/CellsWorkbookApi.md#cellsWorkbookPostWorkbooksTextSearch) | **POST** /cells/{name}/findText | Search text.
*CellsWorkbookApi* | [**cellsWorkbookPutConvertWorkbook**](docs/CellsWorkbookApi.md#cellsWorkbookPutConvertWorkbook) | **PUT** /cells/convert | Convert workbook from request content to some format.
*CellsWorkbookApi* | [**cellsWorkbookPutDocumentProtectFromChanges**](docs/CellsWorkbookApi.md#cellsWorkbookPutDocumentProtectFromChanges) | **PUT** /cells/{name}/writeProtection | Protect document from changes.
*CellsWorkbookApi* | [**cellsWorkbookPutWorkbookCreate**](docs/CellsWorkbookApi.md#cellsWorkbookPutWorkbookCreate) | **PUT** /cells/{name} | Create new workbook using deferent methods.
*CellsWorksheetValidationsApi* | [**cellsWorksheetValidationsDeleteWorksheetValidation**](docs/CellsWorksheetValidationsApi.md#cellsWorksheetValidationsDeleteWorksheetValidation) | **DELETE** /cells/{name}/worksheets/{sheetName}/validations/{validationIndex} | Delete worksheet validation by index.
*CellsWorksheetValidationsApi* | [**cellsWorksheetValidationsGetWorksheetValidation**](docs/CellsWorksheetValidationsApi.md#cellsWorksheetValidationsGetWorksheetValidation) | **GET** /cells/{name}/worksheets/{sheetName}/validations/{validationIndex} | Get worksheet validation by index.
*CellsWorksheetValidationsApi* | [**cellsWorksheetValidationsGetWorksheetValidations**](docs/CellsWorksheetValidationsApi.md#cellsWorksheetValidationsGetWorksheetValidations) | **GET** /cells/{name}/worksheets/{sheetName}/validations | Get worksheet validations.
*CellsWorksheetValidationsApi* | [**cellsWorksheetValidationsPostWorksheetValidation**](docs/CellsWorksheetValidationsApi.md#cellsWorksheetValidationsPostWorksheetValidation) | **POST** /cells/{name}/worksheets/{sheetName}/validations/{validationIndex} | Update worksheet validation by index.
*CellsWorksheetValidationsApi* | [**cellsWorksheetValidationsPutWorksheetValidation**](docs/CellsWorksheetValidationsApi.md#cellsWorksheetValidationsPutWorksheetValidation) | **PUT** /cells/{name}/worksheets/{sheetName}/validations | Add worksheet validation at index.
*CellsWorksheetsApi* | [**cellsWorksheetsDeleteUnprotectWorksheet**](docs/CellsWorksheetsApi.md#cellsWorksheetsDeleteUnprotectWorksheet) | **DELETE** /cells/{name}/worksheets/{sheetName}/protection | Unprotect worksheet.
*CellsWorksheetsApi* | [**cellsWorksheetsDeleteWorksheet**](docs/CellsWorksheetsApi.md#cellsWorksheetsDeleteWorksheet) | **DELETE** /cells/{name}/worksheets/{sheetName} | Delete worksheet.
*CellsWorksheetsApi* | [**cellsWorksheetsDeleteWorksheetBackground**](docs/CellsWorksheetsApi.md#cellsWorksheetsDeleteWorksheetBackground) | **DELETE** /cells/{name}/worksheets/{sheetName}/background | Set worksheet background image.
*CellsWorksheetsApi* | [**cellsWorksheetsDeleteWorksheetComment**](docs/CellsWorksheetsApi.md#cellsWorksheetsDeleteWorksheetComment) | **DELETE** /cells/{name}/worksheets/{sheetName}/comments/{cellName} | Delete worksheet&#39;s cell comment.
*CellsWorksheetsApi* | [**cellsWorksheetsDeleteWorksheetComments**](docs/CellsWorksheetsApi.md#cellsWorksheetsDeleteWorksheetComments) | **DELETE** /cells/{name}/worksheets/{sheetName}/comments | Delete all comments for worksheet.
*CellsWorksheetsApi* | [**cellsWorksheetsDeleteWorksheetFreezePanes**](docs/CellsWorksheetsApi.md#cellsWorksheetsDeleteWorksheetFreezePanes) | **DELETE** /cells/{name}/worksheets/{sheetName}/freezepanes | Unfreeze panes
*CellsWorksheetsApi* | [**cellsWorksheetsGetNamedRanges**](docs/CellsWorksheetsApi.md#cellsWorksheetsGetNamedRanges) | **GET** /cells/{name}/worksheets/ranges | Read worksheets ranges info.
*CellsWorksheetsApi* | [**cellsWorksheetsGetWorksheet**](docs/CellsWorksheetsApi.md#cellsWorksheetsGetWorksheet) | **GET** /cells/{name}/worksheets/{sheetName} | Read worksheet info or export.
*CellsWorksheetsApi* | [**cellsWorksheetsGetWorksheetCalculateFormula**](docs/CellsWorksheetsApi.md#cellsWorksheetsGetWorksheetCalculateFormula) | **GET** /cells/{name}/worksheets/{sheetName}/formulaResult | Calculate formula value.
*CellsWorksheetsApi* | [**cellsWorksheetsGetWorksheetComment**](docs/CellsWorksheetsApi.md#cellsWorksheetsGetWorksheetComment) | **GET** /cells/{name}/worksheets/{sheetName}/comments/{cellName} | Get worksheet comment by cell name.
*CellsWorksheetsApi* | [**cellsWorksheetsGetWorksheetComments**](docs/CellsWorksheetsApi.md#cellsWorksheetsGetWorksheetComments) | **GET** /cells/{name}/worksheets/{sheetName}/comments | Get worksheet comments.
*CellsWorksheetsApi* | [**cellsWorksheetsGetWorksheetMergedCell**](docs/CellsWorksheetsApi.md#cellsWorksheetsGetWorksheetMergedCell) | **GET** /cells/{name}/worksheets/{sheetName}/mergedCells/{mergedCellIndex} | Get worksheet merged cell by its index.
*CellsWorksheetsApi* | [**cellsWorksheetsGetWorksheetMergedCells**](docs/CellsWorksheetsApi.md#cellsWorksheetsGetWorksheetMergedCells) | **GET** /cells/{name}/worksheets/{sheetName}/mergedCells | Get worksheet merged cells.
*CellsWorksheetsApi* | [**cellsWorksheetsGetWorksheetTextItems**](docs/CellsWorksheetsApi.md#cellsWorksheetsGetWorksheetTextItems) | **GET** /cells/{name}/worksheets/{sheetName}/textItems | Get worksheet text items.
*CellsWorksheetsApi* | [**cellsWorksheetsGetWorksheets**](docs/CellsWorksheetsApi.md#cellsWorksheetsGetWorksheets) | **GET** /cells/{name}/worksheets | Read worksheets info.
*CellsWorksheetsApi* | [**cellsWorksheetsPostAutofitWorksheetColumns**](docs/CellsWorksheetsApi.md#cellsWorksheetsPostAutofitWorksheetColumns) | **POST** /cells/{name}/worksheets/{sheetName}/autofitcolumns | 
*CellsWorksheetsApi* | [**cellsWorksheetsPostAutofitWorksheetRow**](docs/CellsWorksheetsApi.md#cellsWorksheetsPostAutofitWorksheetRow) | **POST** /cells/{name}/worksheets/{sheetName}/autofitrow | 
*CellsWorksheetsApi* | [**cellsWorksheetsPostAutofitWorksheetRows**](docs/CellsWorksheetsApi.md#cellsWorksheetsPostAutofitWorksheetRows) | **POST** /cells/{name}/worksheets/{sheetName}/autofitrows | Autofit worksheet rows.
*CellsWorksheetsApi* | [**cellsWorksheetsPostCopyWorksheet**](docs/CellsWorksheetsApi.md#cellsWorksheetsPostCopyWorksheet) | **POST** /cells/{name}/worksheets/{sheetName}/copy | 
*CellsWorksheetsApi* | [**cellsWorksheetsPostMoveWorksheet**](docs/CellsWorksheetsApi.md#cellsWorksheetsPostMoveWorksheet) | **POST** /cells/{name}/worksheets/{sheetName}/position | Move worksheet.
*CellsWorksheetsApi* | [**cellsWorksheetsPostRenameWorksheet**](docs/CellsWorksheetsApi.md#cellsWorksheetsPostRenameWorksheet) | **POST** /cells/{name}/worksheets/{sheetName}/rename | Rename worksheet
*CellsWorksheetsApi* | [**cellsWorksheetsPostUpdateWorksheetProperty**](docs/CellsWorksheetsApi.md#cellsWorksheetsPostUpdateWorksheetProperty) | **POST** /cells/{name}/worksheets/{sheetName} | Update worksheet property
*CellsWorksheetsApi* | [**cellsWorksheetsPostUpdateWorksheetZoom**](docs/CellsWorksheetsApi.md#cellsWorksheetsPostUpdateWorksheetZoom) | **POST** /cells/{name}/worksheets/{sheetName}/zoom | 
*CellsWorksheetsApi* | [**cellsWorksheetsPostWorksheetComment**](docs/CellsWorksheetsApi.md#cellsWorksheetsPostWorksheetComment) | **POST** /cells/{name}/worksheets/{sheetName}/comments/{cellName} | Update worksheet&#39;s cell comment.
*CellsWorksheetsApi* | [**cellsWorksheetsPostWorksheetRangeSort**](docs/CellsWorksheetsApi.md#cellsWorksheetsPostWorksheetRangeSort) | **POST** /cells/{name}/worksheets/{sheetName}/sort | Sort worksheet range.
*CellsWorksheetsApi* | [**cellsWorksheetsPostWorksheetTextSearch**](docs/CellsWorksheetsApi.md#cellsWorksheetsPostWorksheetTextSearch) | **POST** /cells/{name}/worksheets/{sheetName}/findText | Search text.
*CellsWorksheetsApi* | [**cellsWorksheetsPostWorsheetTextReplace**](docs/CellsWorksheetsApi.md#cellsWorksheetsPostWorsheetTextReplace) | **POST** /cells/{name}/worksheets/{sheetName}/replaceText | Replace text.
*CellsWorksheetsApi* | [**cellsWorksheetsPutAddNewWorksheet**](docs/CellsWorksheetsApi.md#cellsWorksheetsPutAddNewWorksheet) | **PUT** /cells/{name}/worksheets/{sheetName} | Add new worksheet.
*CellsWorksheetsApi* | [**cellsWorksheetsPutChangeVisibilityWorksheet**](docs/CellsWorksheetsApi.md#cellsWorksheetsPutChangeVisibilityWorksheet) | **PUT** /cells/{name}/worksheets/{sheetName}/visible | Change worksheet visibility.
*CellsWorksheetsApi* | [**cellsWorksheetsPutProtectWorksheet**](docs/CellsWorksheetsApi.md#cellsWorksheetsPutProtectWorksheet) | **PUT** /cells/{name}/worksheets/{sheetName}/protection | Protect worksheet.
*CellsWorksheetsApi* | [**cellsWorksheetsPutWorksheetBackground**](docs/CellsWorksheetsApi.md#cellsWorksheetsPutWorksheetBackground) | **PUT** /cells/{name}/worksheets/{sheetName}/background | Set worksheet background image.
*CellsWorksheetsApi* | [**cellsWorksheetsPutWorksheetComment**](docs/CellsWorksheetsApi.md#cellsWorksheetsPutWorksheetComment) | **PUT** /cells/{name}/worksheets/{sheetName}/comments/{cellName} | Add worksheet&#39;s cell comment.
*CellsWorksheetsApi* | [**cellsWorksheetsPutWorksheetFreezePanes**](docs/CellsWorksheetsApi.md#cellsWorksheetsPutWorksheetFreezePanes) | **PUT** /cells/{name}/worksheets/{sheetName}/freezepanes | Set freeze panes
*OAuthApi* | [**oAuthPost**](docs/OAuthApi.md#oAuthPost) | **POST** /oauth2/token | Get Access token


## Documentation for Models

 - [AboveAverage](docs/AboveAverage.md)
 - [AccessTokenResponse](docs/AccessTokenResponse.md)
 - [Area](docs/Area.md)
 - [AutoFitterOptions](docs/AutoFitterOptions.md)
 - [Border](docs/Border.md)
 - [CalculationOptions](docs/CalculationOptions.md)
 - [CellArea](docs/CellArea.md)
 - [CellValue](docs/CellValue.md)
 - [CellsColor](docs/CellsColor.md)
 - [Color](docs/Color.md)
 - [ColorFilter](docs/ColorFilter.md)
 - [ColorFilterRequest](docs/ColorFilterRequest.md)
 - [ColorScale](docs/ColorScale.md)
 - [ConditionalFormattingIcon](docs/ConditionalFormattingIcon.md)
 - [ConditionalFormattingValue](docs/ConditionalFormattingValue.md)
 - [CopyOptions](docs/CopyOptions.md)
 - [CreatePivotTableRequest](docs/CreatePivotTableRequest.md)
 - [CustomFilter](docs/CustomFilter.md)
 - [CustomParserConfig](docs/CustomParserConfig.md)
 - [DataBar](docs/DataBar.md)
 - [DataBarBorder](docs/DataBarBorder.md)
 - [DataSorter](docs/DataSorter.md)
 - [DynamicFilter](docs/DynamicFilter.md)
 - [FileSource](docs/FileSource.md)
 - [FillFormat](docs/FillFormat.md)
 - [FilterColumn](docs/FilterColumn.md)
 - [Font](docs/Font.md)
 - [FontSetting](docs/FontSetting.md)
 - [GradientFill](docs/GradientFill.md)
 - [GradientFillStop](docs/GradientFillStop.md)
 - [HorizontalPageBreak](docs/HorizontalPageBreak.md)
 - [IconFilter](docs/IconFilter.md)
 - [IconSet](docs/IconSet.md)
 - [ImportOption](docs/ImportOption.md)
 - [Line](docs/Line.md)
 - [Link](docs/Link.md)
 - [LinkElement](docs/LinkElement.md)
 - [ListColumn](docs/ListColumn.md)
 - [MultipleFilter](docs/MultipleFilter.md)
 - [MultipleFilters](docs/MultipleFilters.md)
 - [NegativeBarFormat](docs/NegativeBarFormat.md)
 - [OperateObject](docs/OperateObject.md)
 - [OperateObjectPosition](docs/OperateObjectPosition.md)
 - [OperateParameter](docs/OperateParameter.md)
 - [PageSection](docs/PageSection.md)
 - [PasswordRequest](docs/PasswordRequest.md)
 - [PasteOptions](docs/PasteOptions.md)
 - [PatternFill](docs/PatternFill.md)
 - [PicFormatOption](docs/PicFormatOption.md)
 - [PivotField](docs/PivotField.md)
 - [PivotFilter](docs/PivotFilter.md)
 - [PivotItem](docs/PivotItem.md)
 - [PivotTableFieldRequest](docs/PivotTableFieldRequest.md)
 - [ProtectSheetParameter](docs/ProtectSheetParameter.md)
 - [Range](docs/Range.md)
 - [RangeCopyRequest](docs/RangeCopyRequest.md)
 - [RangeSetOutlineBorderRequest](docs/RangeSetOutlineBorderRequest.md)
 - [RangeSetStyleRequest](docs/RangeSetStyleRequest.md)
 - [Ranges](docs/Ranges.md)
 - [ResultDestination](docs/ResultDestination.md)
 - [SaaSposeResponse](docs/SaaSposeResponse.md)
 - [SaveOptions](docs/SaveOptions.md)
 - [SaveResult](docs/SaveResult.md)
 - [ShadowEffect](docs/ShadowEffect.md)
 - [SingleValue](docs/SingleValue.md)
 - [SolidFill](docs/SolidFill.md)
 - [SortKey](docs/SortKey.md)
 - [SplitResult](docs/SplitResult.md)
 - [TaskData](docs/TaskData.md)
 - [TaskDescription](docs/TaskDescription.md)
 - [TaskParameter](docs/TaskParameter.md)
 - [TextureFill](docs/TextureFill.md)
 - [ThemeColor](docs/ThemeColor.md)
 - [TilePicOption](docs/TilePicOption.md)
 - [Top10](docs/Top10.md)
 - [Top10Filter](docs/Top10Filter.md)
 - [ValueType](docs/ValueType.md)
 - [VerticalPageBreak](docs/VerticalPageBreak.md)
 - [Workbook](docs/Workbook.md)
 - [WorkbookEncryptionRequest](docs/WorkbookEncryptionRequest.md)
 - [WorkbookProtectionRequest](docs/WorkbookProtectionRequest.md)
 - [WorkbookSettings](docs/WorkbookSettings.md)
 - [Worksheet](docs/Worksheet.md)
 - [WorksheetMovingRequest](docs/WorksheetMovingRequest.md)
 - [AutoFilter](docs/AutoFilter.md)
 - [AutoFilterResponse](docs/AutoFilterResponse.md)
 - [AutoShapes](docs/AutoShapes.md)
 - [AutoShapesResponse](docs/AutoShapesResponse.md)
 - [Cell](docs/Cell.md)
 - [CellResponse](docs/CellResponse.md)
 - [Cells](docs/Cells.md)
 - [CellsDocumentProperties](docs/CellsDocumentProperties.md)
 - [CellsDocumentPropertiesResponse](docs/CellsDocumentPropertiesResponse.md)
 - [CellsDocumentProperty](docs/CellsDocumentProperty.md)
 - [CellsDocumentPropertyResponse](docs/CellsDocumentPropertyResponse.md)
 - [CellsObjectOperateTaskParameter](docs/CellsObjectOperateTaskParameter.md)
 - [CellsResponse](docs/CellsResponse.md)
 - [Chart](docs/Chart.md)
 - [ChartAreaResponse](docs/ChartAreaResponse.md)
 - [ChartFrame](docs/ChartFrame.md)
 - [ChartOperateParameter](docs/ChartOperateParameter.md)
 - [Charts](docs/Charts.md)
 - [ChartsResponse](docs/ChartsResponse.md)
 - [Column](docs/Column.md)
 - [ColumnResponse](docs/ColumnResponse.md)
 - [Columns](docs/Columns.md)
 - [ColumnsResponse](docs/ColumnsResponse.md)
 - [Comment](docs/Comment.md)
 - [CommentResponse](docs/CommentResponse.md)
 - [Comments](docs/Comments.md)
 - [CommentsResponse](docs/CommentsResponse.md)
 - [ConditionalFormatting](docs/ConditionalFormatting.md)
 - [ConditionalFormattingResponse](docs/ConditionalFormattingResponse.md)
 - [ConditionalFormattings](docs/ConditionalFormattings.md)
 - [ConditionalFormattingsResponse](docs/ConditionalFormattingsResponse.md)
 - [ConvertTaskParameter](docs/ConvertTaskParameter.md)
 - [FillFormatResponse](docs/FillFormatResponse.md)
 - [FormatCondition](docs/FormatCondition.md)
 - [HorizontalPageBreakResponse](docs/HorizontalPageBreakResponse.md)
 - [HorizontalPageBreaks](docs/HorizontalPageBreaks.md)
 - [HorizontalPageBreaksResponse](docs/HorizontalPageBreaksResponse.md)
 - [Hyperlink](docs/Hyperlink.md)
 - [HyperlinkResponse](docs/HyperlinkResponse.md)
 - [Hyperlinks](docs/Hyperlinks.md)
 - [HyperlinksResponse](docs/HyperlinksResponse.md)
 - [ImportBatchDataOption](docs/ImportBatchDataOption.md)
 - [ImportCSVDataOption](docs/ImportCSVDataOption.md)
 - [ImportDataTaskParameter](docs/ImportDataTaskParameter.md)
 - [ImportDoubleArrayOption](docs/ImportDoubleArrayOption.md)
 - [ImportIntArrayOption](docs/ImportIntArrayOption.md)
 - [ImportStringArrayOption](docs/ImportStringArrayOption.md)
 - [LegendResponse](docs/LegendResponse.md)
 - [LineFormat](docs/LineFormat.md)
 - [LineResponse](docs/LineResponse.md)
 - [ListObject](docs/ListObject.md)
 - [ListObjectOperateParameter](docs/ListObjectOperateParameter.md)
 - [ListObjectResponse](docs/ListObjectResponse.md)
 - [ListObjects](docs/ListObjects.md)
 - [ListObjectsResponse](docs/ListObjectsResponse.md)
 - [MergedCell](docs/MergedCell.md)
 - [MergedCellResponse](docs/MergedCellResponse.md)
 - [MergedCells](docs/MergedCells.md)
 - [MergedCellsResponse](docs/MergedCellsResponse.md)
 - [Name](docs/Name.md)
 - [NameResponse](docs/NameResponse.md)
 - [Names](docs/Names.md)
 - [NamesResponse](docs/NamesResponse.md)
 - [OleObjectResponse](docs/OleObjectResponse.md)
 - [OleObjects](docs/OleObjects.md)
 - [OleObjectsResponse](docs/OleObjectsResponse.md)
 - [PageBreakOperateParameter](docs/PageBreakOperateParameter.md)
 - [PageSectionsResponse](docs/PageSectionsResponse.md)
 - [PageSetup](docs/PageSetup.md)
 - [PageSetupOperateParameter](docs/PageSetupOperateParameter.md)
 - [PageSetupResponse](docs/PageSetupResponse.md)
 - [PictureResponse](docs/PictureResponse.md)
 - [Pictures](docs/Pictures.md)
 - [PicturesResponse](docs/PicturesResponse.md)
 - [PivotFieldResponse](docs/PivotFieldResponse.md)
 - [PivotFilterResponse](docs/PivotFilterResponse.md)
 - [PivotFiltersResponse](docs/PivotFiltersResponse.md)
 - [PivotTable](docs/PivotTable.md)
 - [PivotTableOperateParameter](docs/PivotTableOperateParameter.md)
 - [PivotTableResponse](docs/PivotTableResponse.md)
 - [PivotTables](docs/PivotTables.md)
 - [PivotTablesResponse](docs/PivotTablesResponse.md)
 - [RangesResponse](docs/RangesResponse.md)
 - [Row](docs/Row.md)
 - [RowResponse](docs/RowResponse.md)
 - [Rows](docs/Rows.md)
 - [RowsResponse](docs/RowsResponse.md)
 - [SaveResponse](docs/SaveResponse.md)
 - [SaveResultTaskParameter](docs/SaveResultTaskParameter.md)
 - [Shape](docs/Shape.md)
 - [ShapeOperateParameter](docs/ShapeOperateParameter.md)
 - [ShapeResponse](docs/ShapeResponse.md)
 - [Shapes](docs/Shapes.md)
 - [ShapesResponse](docs/ShapesResponse.md)
 - [SingleValueResponse](docs/SingleValueResponse.md)
 - [SmartMarkerTaskParameter](docs/SmartMarkerTaskParameter.md)
 - [SplitResultDocument](docs/SplitResultDocument.md)
 - [SplitResultResponse](docs/SplitResultResponse.md)
 - [SplitWorkbookTaskParameter](docs/SplitWorkbookTaskParameter.md)
 - [Style](docs/Style.md)
 - [StyleResponse](docs/StyleResponse.md)
 - [TextItem](docs/TextItem.md)
 - [TextItems](docs/TextItems.md)
 - [TextItemsResponse](docs/TextItemsResponse.md)
 - [TextOptions](docs/TextOptions.md)
 - [TitleResponse](docs/TitleResponse.md)
 - [Validation](docs/Validation.md)
 - [ValidationResponse](docs/ValidationResponse.md)
 - [Validations](docs/Validations.md)
 - [ValidationsResponse](docs/ValidationsResponse.md)
 - [VerticalPageBreakResponse](docs/VerticalPageBreakResponse.md)
 - [VerticalPageBreaks](docs/VerticalPageBreaks.md)
 - [VerticalPageBreaksResponse](docs/VerticalPageBreaksResponse.md)
 - [WorkbookOperateParameter](docs/WorkbookOperateParameter.md)
 - [WorkbookReplaceResponse](docs/WorkbookReplaceResponse.md)
 - [WorkbookResponse](docs/WorkbookResponse.md)
 - [WorkbookSettingsOperateParameter](docs/WorkbookSettingsOperateParameter.md)
 - [WorkbookSettingsResponse](docs/WorkbookSettingsResponse.md)
 - [WorksheetReplaceResponse](docs/WorksheetReplaceResponse.md)
 - [WorksheetResponse](docs/WorksheetResponse.md)
 - [Worksheets](docs/Worksheets.md)
 - [WorksheetsResponse](docs/WorksheetsResponse.md)
 - [ChartArea](docs/ChartArea.md)
 - [Legend](docs/Legend.md)
 - [OleObject](docs/OleObject.md)
 - [Picture](docs/Picture.md)
 - [Title](docs/Title.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### appsid

- **Type**: API key
- **API key parameter name**: appsid
- **Location**: URL query string

### oauth

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: 
- **Scopes**: 
  - write:pets: modify pets in your account

### signature

- **Type**: API key
- **API key parameter name**: signature
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



