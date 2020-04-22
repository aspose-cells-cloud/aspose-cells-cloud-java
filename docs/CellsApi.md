# CellsApi

All URIs are relative to *https://api.aspose.cloud/v3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cellsAutoFilterDeleteWorksheetDateFilter**](CellsApi.md#cellsAutoFilterDeleteWorksheetDateFilter) | **DELETE** /cells/{name}/worksheets/{sheetName}/autoFilter/dateFilter | Removes a date filter.             
[**cellsAutoFilterDeleteWorksheetFilter**](CellsApi.md#cellsAutoFilterDeleteWorksheetFilter) | **DELETE** /cells/{name}/worksheets/{sheetName}/autoFilter/filter | Delete a filter for a filter column.             
[**cellsAutoFilterGetWorksheetAutoFilter**](CellsApi.md#cellsAutoFilterGetWorksheetAutoFilter) | **GET** /cells/{name}/worksheets/{sheetName}/autoFilter | Get Auto filter Description
[**cellsAutoFilterPostWorksheetAutoFilterRefresh**](CellsApi.md#cellsAutoFilterPostWorksheetAutoFilterRefresh) | **POST** /cells/{name}/worksheets/{sheetName}/autoFilter/refresh | 
[**cellsAutoFilterPostWorksheetMatchBlanks**](CellsApi.md#cellsAutoFilterPostWorksheetMatchBlanks) | **POST** /cells/{name}/worksheets/{sheetName}/autoFilter/matchBlanks | Match all blank cell in the list.
[**cellsAutoFilterPostWorksheetMatchNonBlanks**](CellsApi.md#cellsAutoFilterPostWorksheetMatchNonBlanks) | **POST** /cells/{name}/worksheets/{sheetName}/autoFilter/matchNonBlanks | Match all not blank cell in the list.             
[**cellsAutoFilterPutWorksheetColorFilter**](CellsApi.md#cellsAutoFilterPutWorksheetColorFilter) | **PUT** /cells/{name}/worksheets/{sheetName}/autoFilter/colorFilter | 
[**cellsAutoFilterPutWorksheetCustomFilter**](CellsApi.md#cellsAutoFilterPutWorksheetCustomFilter) | **PUT** /cells/{name}/worksheets/{sheetName}/autoFilter/custom | Filters a list with a custom criteria.             
[**cellsAutoFilterPutWorksheetDateFilter**](CellsApi.md#cellsAutoFilterPutWorksheetDateFilter) | **PUT** /cells/{name}/worksheets/{sheetName}/autoFilter/dateFilter | add date filter in worksheet 
[**cellsAutoFilterPutWorksheetDynamicFilter**](CellsApi.md#cellsAutoFilterPutWorksheetDynamicFilter) | **PUT** /cells/{name}/worksheets/{sheetName}/autoFilter/dynamicFilter | 
[**cellsAutoFilterPutWorksheetFilter**](CellsApi.md#cellsAutoFilterPutWorksheetFilter) | **PUT** /cells/{name}/worksheets/{sheetName}/autoFilter/filter | Adds a filter for a filter column.             
[**cellsAutoFilterPutWorksheetFilterTop10**](CellsApi.md#cellsAutoFilterPutWorksheetFilterTop10) | **PUT** /cells/{name}/worksheets/{sheetName}/autoFilter/filterTop10 | Filter the top 10 item in the list
[**cellsAutoFilterPutWorksheetIconFilter**](CellsApi.md#cellsAutoFilterPutWorksheetIconFilter) | **PUT** /cells/{name}/worksheets/{sheetName}/autoFilter/iconFilter | Adds an icon filter.
[**cellsAutoshapesGetWorksheetAutoshape**](CellsApi.md#cellsAutoshapesGetWorksheetAutoshape) | **GET** /cells/{name}/worksheets/{sheetName}/autoshapes/{autoshapeNumber} | Get autoshape info.
[**cellsAutoshapesGetWorksheetAutoshapes**](CellsApi.md#cellsAutoshapesGetWorksheetAutoshapes) | **GET** /cells/{name}/worksheets/{sheetName}/autoshapes | Get worksheet autoshapes info.
[**cellsChartAreaGetChartArea**](CellsApi.md#cellsChartAreaGetChartArea) | **GET** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/chartArea | Get chart area info.
[**cellsChartAreaGetChartAreaBorder**](CellsApi.md#cellsChartAreaGetChartAreaBorder) | **GET** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/chartArea/border | Get chart area border info.
[**cellsChartAreaGetChartAreaFillFormat**](CellsApi.md#cellsChartAreaGetChartAreaFillFormat) | **GET** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/chartArea/fillFormat | Get chart area fill format info.
[**cellsChartsDeleteWorksheetChartLegend**](CellsApi.md#cellsChartsDeleteWorksheetChartLegend) | **DELETE** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/legend | Hide legend in chart
[**cellsChartsDeleteWorksheetChartTitle**](CellsApi.md#cellsChartsDeleteWorksheetChartTitle) | **DELETE** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/title | Hide title in chart
[**cellsChartsDeleteWorksheetClearCharts**](CellsApi.md#cellsChartsDeleteWorksheetClearCharts) | **DELETE** /cells/{name}/worksheets/{sheetName}/charts | Clear the charts.
[**cellsChartsDeleteWorksheetDeleteChart**](CellsApi.md#cellsChartsDeleteWorksheetDeleteChart) | **DELETE** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex} | Delete worksheet chart by index.
[**cellsChartsGetWorksheetChart**](CellsApi.md#cellsChartsGetWorksheetChart) | **GET** /cells/{name}/worksheets/{sheetName}/charts/{chartNumber} | Get chart info.
[**cellsChartsGetWorksheetChartLegend**](CellsApi.md#cellsChartsGetWorksheetChartLegend) | **GET** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/legend | Get chart legend
[**cellsChartsGetWorksheetChartTitle**](CellsApi.md#cellsChartsGetWorksheetChartTitle) | **GET** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/title | Get chart title
[**cellsChartsGetWorksheetCharts**](CellsApi.md#cellsChartsGetWorksheetCharts) | **GET** /cells/{name}/worksheets/{sheetName}/charts | Get worksheet charts info.
[**cellsChartsPostWorksheetChart**](CellsApi.md#cellsChartsPostWorksheetChart) | **POST** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex} | Update chart propreties
[**cellsChartsPostWorksheetChartLegend**](CellsApi.md#cellsChartsPostWorksheetChartLegend) | **POST** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/legend | Update chart legend
[**cellsChartsPostWorksheetChartTitle**](CellsApi.md#cellsChartsPostWorksheetChartTitle) | **POST** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/title | Update chart title
[**cellsChartsPutWorksheetAddChart**](CellsApi.md#cellsChartsPutWorksheetAddChart) | **PUT** /cells/{name}/worksheets/{sheetName}/charts | Add new chart to worksheet.
[**cellsChartsPutWorksheetChartLegend**](CellsApi.md#cellsChartsPutWorksheetChartLegend) | **PUT** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/legend | Show legend in chart
[**cellsChartsPutWorksheetChartTitle**](CellsApi.md#cellsChartsPutWorksheetChartTitle) | **PUT** /cells/{name}/worksheets/{sheetName}/charts/{chartIndex}/title | Add chart title / Set chart title visible
[**cellsConditionalFormattingsDeleteWorksheetConditionalFormatting**](CellsApi.md#cellsConditionalFormattingsDeleteWorksheetConditionalFormatting) | **DELETE** /cells/{name}/worksheets/{sheetName}/conditionalFormattings/{index} | Remove conditional formatting
[**cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea**](CellsApi.md#cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea) | **DELETE** /cells/{name}/worksheets/{sheetName}/conditionalFormattings/area | Remove cell area from conditional formatting.
[**cellsConditionalFormattingsDeleteWorksheetConditionalFormattings**](CellsApi.md#cellsConditionalFormattingsDeleteWorksheetConditionalFormattings) | **DELETE** /cells/{name}/worksheets/{sheetName}/conditionalFormattings | Clear all condition formattings
[**cellsConditionalFormattingsGetWorksheetConditionalFormatting**](CellsApi.md#cellsConditionalFormattingsGetWorksheetConditionalFormatting) | **GET** /cells/{name}/worksheets/{sheetName}/conditionalFormattings/{index} | Get conditional formatting
[**cellsConditionalFormattingsGetWorksheetConditionalFormattings**](CellsApi.md#cellsConditionalFormattingsGetWorksheetConditionalFormattings) | **GET** /cells/{name}/worksheets/{sheetName}/conditionalFormattings | Get conditional formattings 
[**cellsConditionalFormattingsPutWorksheetConditionalFormatting**](CellsApi.md#cellsConditionalFormattingsPutWorksheetConditionalFormatting) | **PUT** /cells/{name}/worksheets/{sheetName}/conditionalFormattings | Add a condition formatting.
[**cellsConditionalFormattingsPutWorksheetFormatCondition**](CellsApi.md#cellsConditionalFormattingsPutWorksheetFormatCondition) | **PUT** /cells/{name}/worksheets/{sheetName}/conditionalFormattings/{index} | Add a format condition.
[**cellsConditionalFormattingsPutWorksheetFormatConditionArea**](CellsApi.md#cellsConditionalFormattingsPutWorksheetFormatConditionArea) | **PUT** /cells/{name}/worksheets/{sheetName}/conditionalFormattings/{index}/area | add a cell area for format condition             
[**cellsConditionalFormattingsPutWorksheetFormatConditionCondition**](CellsApi.md#cellsConditionalFormattingsPutWorksheetFormatConditionCondition) | **PUT** /cells/{name}/worksheets/{sheetName}/conditionalFormattings/{index}/condition | Add a condition for format condition.
[**cellsDeleteWorksheetColumns**](CellsApi.md#cellsDeleteWorksheetColumns) | **DELETE** /cells/{name}/worksheets/{sheetName}/cells/columns/{columnIndex} | Delete worksheet columns.
[**cellsDeleteWorksheetRow**](CellsApi.md#cellsDeleteWorksheetRow) | **DELETE** /cells/{name}/worksheets/{sheetName}/cells/rows/{rowIndex} | Delete worksheet row.
[**cellsDeleteWorksheetRows**](CellsApi.md#cellsDeleteWorksheetRows) | **DELETE** /cells/{name}/worksheets/{sheetName}/cells/rows | Delete several worksheet rows.
[**cellsGetCellHtmlString**](CellsApi.md#cellsGetCellHtmlString) | **GET** /cells/{name}/worksheets/{sheetName}/cells/{cellName}/htmlstring | Read cell data by cell&#39;s name.
[**cellsGetWorksheetCell**](CellsApi.md#cellsGetWorksheetCell) | **GET** /cells/{name}/worksheets/{sheetName}/cells/{cellOrMethodName} | Read cell data by cell&#39;s name.
[**cellsGetWorksheetCellStyle**](CellsApi.md#cellsGetWorksheetCellStyle) | **GET** /cells/{name}/worksheets/{sheetName}/cells/{cellName}/style | Read cell&#39;s style info.
[**cellsGetWorksheetCells**](CellsApi.md#cellsGetWorksheetCells) | **GET** /cells/{name}/worksheets/{sheetName}/cells | Get cells info.
[**cellsGetWorksheetColumn**](CellsApi.md#cellsGetWorksheetColumn) | **GET** /cells/{name}/worksheets/{sheetName}/cells/columns/{columnIndex} | Read worksheet column data by column&#39;s index.
[**cellsGetWorksheetColumns**](CellsApi.md#cellsGetWorksheetColumns) | **GET** /cells/{name}/worksheets/{sheetName}/cells/columns | Read worksheet columns info.
[**cellsGetWorksheetRow**](CellsApi.md#cellsGetWorksheetRow) | **GET** /cells/{name}/worksheets/{sheetName}/cells/rows/{rowIndex} | Read worksheet row data by row&#39;s index.
[**cellsGetWorksheetRows**](CellsApi.md#cellsGetWorksheetRows) | **GET** /cells/{name}/worksheets/{sheetName}/cells/rows | Read worksheet rows info.
[**cellsHypelinksDeleteWorksheetHyperlink**](CellsApi.md#cellsHypelinksDeleteWorksheetHyperlink) | **DELETE** /cells/{name}/worksheets/{sheetName}/hyperlinks/{hyperlinkIndex} | Delete worksheet hyperlink by index.
[**cellsHypelinksDeleteWorksheetHyperlinks**](CellsApi.md#cellsHypelinksDeleteWorksheetHyperlinks) | **DELETE** /cells/{name}/worksheets/{sheetName}/hyperlinks | Delete all hyperlinks in worksheet.
[**cellsHypelinksGetWorksheetHyperlink**](CellsApi.md#cellsHypelinksGetWorksheetHyperlink) | **GET** /cells/{name}/worksheets/{sheetName}/hyperlinks/{hyperlinkIndex} | Get worksheet hyperlink by index.
[**cellsHypelinksGetWorksheetHyperlinks**](CellsApi.md#cellsHypelinksGetWorksheetHyperlinks) | **GET** /cells/{name}/worksheets/{sheetName}/hyperlinks | Get worksheet hyperlinks.
[**cellsHypelinksPostWorksheetHyperlink**](CellsApi.md#cellsHypelinksPostWorksheetHyperlink) | **POST** /cells/{name}/worksheets/{sheetName}/hyperlinks/{hyperlinkIndex} | Update worksheet hyperlink by index.
[**cellsHypelinksPutWorksheetHyperlink**](CellsApi.md#cellsHypelinksPutWorksheetHyperlink) | **PUT** /cells/{name}/worksheets/{sheetName}/hyperlinks | Add worksheet hyperlink.
[**cellsListObjectsDeleteWorksheetListObject**](CellsApi.md#cellsListObjectsDeleteWorksheetListObject) | **DELETE** /cells/{name}/worksheets/{sheetName}/listobjects/{listObjectIndex} | Delete worksheet list object by index
[**cellsListObjectsDeleteWorksheetListObjects**](CellsApi.md#cellsListObjectsDeleteWorksheetListObjects) | **DELETE** /cells/{name}/worksheets/{sheetName}/listobjects | Delete worksheet list objects
[**cellsListObjectsGetWorksheetListObject**](CellsApi.md#cellsListObjectsGetWorksheetListObject) | **GET** /cells/{name}/worksheets/{sheetName}/listobjects/{listobjectindex} | Get worksheet list object info by index.
[**cellsListObjectsGetWorksheetListObjects**](CellsApi.md#cellsListObjectsGetWorksheetListObjects) | **GET** /cells/{name}/worksheets/{sheetName}/listobjects | Get worksheet listobjects info.
[**cellsListObjectsPostWorksheetListObject**](CellsApi.md#cellsListObjectsPostWorksheetListObject) | **POST** /cells/{name}/worksheets/{sheetName}/listobjects/{listObjectIndex} | Update  list object 
[**cellsListObjectsPostWorksheetListObjectConvertToRange**](CellsApi.md#cellsListObjectsPostWorksheetListObjectConvertToRange) | **POST** /cells/{name}/worksheets/{sheetName}/listobjects/{listObjectIndex}/ConvertToRange | 
[**cellsListObjectsPostWorksheetListObjectSortTable**](CellsApi.md#cellsListObjectsPostWorksheetListObjectSortTable) | **POST** /cells/{name}/worksheets/{sheetName}/listobjects/{listObjectIndex}/sort | 
[**cellsListObjectsPostWorksheetListObjectSummarizeWithPivotTable**](CellsApi.md#cellsListObjectsPostWorksheetListObjectSummarizeWithPivotTable) | **POST** /cells/{name}/worksheets/{sheetName}/listobjects/{listObjectIndex}/SummarizeWithPivotTable | 
[**cellsListObjectsPutWorksheetListObject**](CellsApi.md#cellsListObjectsPutWorksheetListObject) | **PUT** /cells/{name}/worksheets/{sheetName}/listobjects | Add a list object into worksheet.
[**cellsOleObjectsDeleteWorksheetOleObject**](CellsApi.md#cellsOleObjectsDeleteWorksheetOleObject) | **DELETE** /cells/{name}/worksheets/{sheetName}/oleobjects/{oleObjectIndex} | Delete OLE object.
[**cellsOleObjectsDeleteWorksheetOleObjects**](CellsApi.md#cellsOleObjectsDeleteWorksheetOleObjects) | **DELETE** /cells/{name}/worksheets/{sheetName}/oleobjects | Delete all OLE objects.
[**cellsOleObjectsGetWorksheetOleObject**](CellsApi.md#cellsOleObjectsGetWorksheetOleObject) | **GET** /cells/{name}/worksheets/{sheetName}/oleobjects/{objectNumber} | Get OLE object info.
[**cellsOleObjectsGetWorksheetOleObjects**](CellsApi.md#cellsOleObjectsGetWorksheetOleObjects) | **GET** /cells/{name}/worksheets/{sheetName}/oleobjects | Get worksheet OLE objects info.
[**cellsOleObjectsPostUpdateWorksheetOleObject**](CellsApi.md#cellsOleObjectsPostUpdateWorksheetOleObject) | **POST** /cells/{name}/worksheets/{sheetName}/oleobjects/{oleObjectIndex} | Update OLE object.
[**cellsOleObjectsPutWorksheetOleObject**](CellsApi.md#cellsOleObjectsPutWorksheetOleObject) | **PUT** /cells/{name}/worksheets/{sheetName}/oleobjects | Add OLE object
[**cellsPageBreaksDeleteHorizontalPageBreak**](CellsApi.md#cellsPageBreaksDeleteHorizontalPageBreak) | **DELETE** /cells/{name}/worksheets/{sheetName}/horizontalpagebreaks/{index} | 
[**cellsPageBreaksDeleteHorizontalPageBreaks**](CellsApi.md#cellsPageBreaksDeleteHorizontalPageBreaks) | **DELETE** /cells/{name}/worksheets/{sheetName}/horizontalpagebreaks | 
[**cellsPageBreaksDeleteVerticalPageBreak**](CellsApi.md#cellsPageBreaksDeleteVerticalPageBreak) | **DELETE** /cells/{name}/worksheets/{sheetName}/verticalpagebreaks/{index} | 
[**cellsPageBreaksDeleteVerticalPageBreaks**](CellsApi.md#cellsPageBreaksDeleteVerticalPageBreaks) | **DELETE** /cells/{name}/worksheets/{sheetName}/verticalpagebreaks | 
[**cellsPageBreaksGetHorizontalPageBreak**](CellsApi.md#cellsPageBreaksGetHorizontalPageBreak) | **GET** /cells/{name}/worksheets/{sheetName}/horizontalpagebreaks/{index} | 
[**cellsPageBreaksGetHorizontalPageBreaks**](CellsApi.md#cellsPageBreaksGetHorizontalPageBreaks) | **GET** /cells/{name}/worksheets/{sheetName}/horizontalpagebreaks | 
[**cellsPageBreaksGetVerticalPageBreak**](CellsApi.md#cellsPageBreaksGetVerticalPageBreak) | **GET** /cells/{name}/worksheets/{sheetName}/verticalpagebreaks/{index} | 
[**cellsPageBreaksGetVerticalPageBreaks**](CellsApi.md#cellsPageBreaksGetVerticalPageBreaks) | **GET** /cells/{name}/worksheets/{sheetName}/verticalpagebreaks | 
[**cellsPageBreaksPutHorizontalPageBreak**](CellsApi.md#cellsPageBreaksPutHorizontalPageBreak) | **PUT** /cells/{name}/worksheets/{sheetName}/horizontalpagebreaks | 
[**cellsPageBreaksPutVerticalPageBreak**](CellsApi.md#cellsPageBreaksPutVerticalPageBreak) | **PUT** /cells/{name}/worksheets/{sheetName}/verticalpagebreaks | 
[**cellsPageSetupDeleteHeaderFooter**](CellsApi.md#cellsPageSetupDeleteHeaderFooter) | **DELETE** /cells/{name}/worksheets/{sheetName}/pagesetup/clearheaderfooter | clear header footer
[**cellsPageSetupGetFooter**](CellsApi.md#cellsPageSetupGetFooter) | **GET** /cells/{name}/worksheets/{sheetName}/pagesetup/footer | get page footer information
[**cellsPageSetupGetHeader**](CellsApi.md#cellsPageSetupGetHeader) | **GET** /cells/{name}/worksheets/{sheetName}/pagesetup/header | get page header information
[**cellsPageSetupGetPageSetup**](CellsApi.md#cellsPageSetupGetPageSetup) | **GET** /cells/{name}/worksheets/{sheetName}/pagesetup | Get Page Setup information.             
[**cellsPageSetupPostFooter**](CellsApi.md#cellsPageSetupPostFooter) | **POST** /cells/{name}/worksheets/{sheetName}/pagesetup/footer | update  page footer information 
[**cellsPageSetupPostHeader**](CellsApi.md#cellsPageSetupPostHeader) | **POST** /cells/{name}/worksheets/{sheetName}/pagesetup/header | update  page header information 
[**cellsPageSetupPostPageSetup**](CellsApi.md#cellsPageSetupPostPageSetup) | **POST** /cells/{name}/worksheets/{sheetName}/pagesetup | Update Page Setup information.
[**cellsPicturesDeleteWorksheetPicture**](CellsApi.md#cellsPicturesDeleteWorksheetPicture) | **DELETE** /cells/{name}/worksheets/{sheetName}/pictures/{pictureIndex} | Delete a picture object in worksheet
[**cellsPicturesDeleteWorksheetPictures**](CellsApi.md#cellsPicturesDeleteWorksheetPictures) | **DELETE** /cells/{name}/worksheets/{sheetName}/pictures | Delete all pictures in worksheet.
[**cellsPicturesGetWorksheetPicture**](CellsApi.md#cellsPicturesGetWorksheetPicture) | **GET** /cells/{name}/worksheets/{sheetName}/pictures/{pictureIndex} | GRead worksheet picture by number.
[**cellsPicturesGetWorksheetPictures**](CellsApi.md#cellsPicturesGetWorksheetPictures) | **GET** /cells/{name}/worksheets/{sheetName}/pictures | Read worksheet pictures.
[**cellsPicturesPostWorksheetPicture**](CellsApi.md#cellsPicturesPostWorksheetPicture) | **POST** /cells/{name}/worksheets/{sheetName}/pictures/{pictureIndex} | Update worksheet picture by index.
[**cellsPicturesPutWorksheetAddPicture**](CellsApi.md#cellsPicturesPutWorksheetAddPicture) | **PUT** /cells/{name}/worksheets/{sheetName}/pictures | Add a new worksheet picture.
[**cellsPivotTablesDeletePivotTableField**](CellsApi.md#cellsPivotTablesDeletePivotTableField) | **DELETE** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotField | Delete pivot field into into pivot table
[**cellsPivotTablesDeleteWorksheetPivotTable**](CellsApi.md#cellsPivotTablesDeleteWorksheetPivotTable) | **DELETE** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex} | Delete worksheet pivot table by index
[**cellsPivotTablesDeleteWorksheetPivotTableFilter**](CellsApi.md#cellsPivotTablesDeleteWorksheetPivotTableFilter) | **DELETE** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotFilters/{fieldIndex} | delete  pivot filter for piovt table             
[**cellsPivotTablesDeleteWorksheetPivotTableFilters**](CellsApi.md#cellsPivotTablesDeleteWorksheetPivotTableFilters) | **DELETE** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotFilters | delete all pivot filters for piovt table
[**cellsPivotTablesDeleteWorksheetPivotTables**](CellsApi.md#cellsPivotTablesDeleteWorksheetPivotTables) | **DELETE** /cells/{name}/worksheets/{sheetName}/pivottables | Delete worksheet pivot tables
[**cellsPivotTablesGetPivotTableField**](CellsApi.md#cellsPivotTablesGetPivotTableField) | **GET** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotField | Get pivot field into into pivot table
[**cellsPivotTablesGetWorksheetPivotTable**](CellsApi.md#cellsPivotTablesGetWorksheetPivotTable) | **GET** /cells/{name}/worksheets/{sheetName}/pivottables/{pivottableIndex} | Get worksheet pivottable info by index.
[**cellsPivotTablesGetWorksheetPivotTableFilter**](CellsApi.md#cellsPivotTablesGetWorksheetPivotTableFilter) | **GET** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotFilters/{filterIndex} | 
[**cellsPivotTablesGetWorksheetPivotTableFilters**](CellsApi.md#cellsPivotTablesGetWorksheetPivotTableFilters) | **GET** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotFilters | 
[**cellsPivotTablesGetWorksheetPivotTables**](CellsApi.md#cellsPivotTablesGetWorksheetPivotTables) | **GET** /cells/{name}/worksheets/{sheetName}/pivottables | Get worksheet pivottables info.
[**cellsPivotTablesPostPivotTableCellStyle**](CellsApi.md#cellsPivotTablesPostPivotTableCellStyle) | **POST** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/Format | Update cell style for pivot table
[**cellsPivotTablesPostPivotTableFieldHideItem**](CellsApi.md#cellsPivotTablesPostPivotTableFieldHideItem) | **POST** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotField/Hide | 
[**cellsPivotTablesPostPivotTableFieldMoveTo**](CellsApi.md#cellsPivotTablesPostPivotTableFieldMoveTo) | **POST** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotField/Move | 
[**cellsPivotTablesPostPivotTableStyle**](CellsApi.md#cellsPivotTablesPostPivotTableStyle) | **POST** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/FormatAll | Update style for pivot table
[**cellsPivotTablesPostWorksheetPivotTableCalculate**](CellsApi.md#cellsPivotTablesPostWorksheetPivotTableCalculate) | **POST** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/Calculate | Calculates pivottable&#39;s data to cells.
[**cellsPivotTablesPostWorksheetPivotTableMove**](CellsApi.md#cellsPivotTablesPostWorksheetPivotTableMove) | **POST** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/Move | 
[**cellsPivotTablesPutPivotTableField**](CellsApi.md#cellsPivotTablesPutPivotTableField) | **PUT** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotField | Add pivot field into into pivot table
[**cellsPivotTablesPutWorksheetPivotTable**](CellsApi.md#cellsPivotTablesPutWorksheetPivotTable) | **PUT** /cells/{name}/worksheets/{sheetName}/pivottables | Add a pivot table into worksheet.
[**cellsPivotTablesPutWorksheetPivotTableFilter**](CellsApi.md#cellsPivotTablesPutWorksheetPivotTableFilter) | **PUT** /cells/{name}/worksheets/{sheetName}/pivottables/{pivotTableIndex}/PivotFilters | Add pivot filter for piovt table index
[**cellsPostCellCalculate**](CellsApi.md#cellsPostCellCalculate) | **POST** /cells/{name}/worksheets/{sheetName}/cells/{cellName}/calculate | Cell calculate formula
[**cellsPostCellCharacters**](CellsApi.md#cellsPostCellCharacters) | **POST** /cells/{name}/worksheets/{sheetName}/cells/{cellName}/characters | Set cell characters 
[**cellsPostClearContents**](CellsApi.md#cellsPostClearContents) | **POST** /cells/{name}/worksheets/{sheetName}/cells/clearcontents | Clear cells contents.
[**cellsPostClearFormats**](CellsApi.md#cellsPostClearFormats) | **POST** /cells/{name}/worksheets/{sheetName}/cells/clearformats | Clear cells contents.
[**cellsPostColumnStyle**](CellsApi.md#cellsPostColumnStyle) | **POST** /cells/{name}/worksheets/{sheetName}/cells/columns/{columnIndex}/style | Set column style
[**cellsPostCopyCellIntoCell**](CellsApi.md#cellsPostCopyCellIntoCell) | **POST** /cells/{name}/worksheets/{sheetName}/cells/{destCellName}/copy | Copy cell into cell
[**cellsPostCopyWorksheetColumns**](CellsApi.md#cellsPostCopyWorksheetColumns) | **POST** /cells/{name}/worksheets/{sheetName}/cells/columns/copy | Copy worksheet columns.
[**cellsPostCopyWorksheetRows**](CellsApi.md#cellsPostCopyWorksheetRows) | **POST** /cells/{name}/worksheets/{sheetName}/cells/rows/copy | Copy worksheet rows.
[**cellsPostGroupWorksheetColumns**](CellsApi.md#cellsPostGroupWorksheetColumns) | **POST** /cells/{name}/worksheets/{sheetName}/cells/columns/group | Group worksheet columns.
[**cellsPostGroupWorksheetRows**](CellsApi.md#cellsPostGroupWorksheetRows) | **POST** /cells/{name}/worksheets/{sheetName}/cells/rows/group | Group worksheet rows.
[**cellsPostHideWorksheetColumns**](CellsApi.md#cellsPostHideWorksheetColumns) | **POST** /cells/{name}/worksheets/{sheetName}/cells/columns/hide | Hide worksheet columns.
[**cellsPostHideWorksheetRows**](CellsApi.md#cellsPostHideWorksheetRows) | **POST** /cells/{name}/worksheets/{sheetName}/cells/rows/hide | Hide worksheet rows.
[**cellsPostRowStyle**](CellsApi.md#cellsPostRowStyle) | **POST** /cells/{name}/worksheets/{sheetName}/cells/rows/{rowIndex}/style | Set row style.
[**cellsPostSetCellHtmlString**](CellsApi.md#cellsPostSetCellHtmlString) | **POST** /cells/{name}/worksheets/{sheetName}/cells/{cellName}/htmlstring | Set htmlstring value into cell
[**cellsPostSetCellRangeValue**](CellsApi.md#cellsPostSetCellRangeValue) | **POST** /cells/{name}/worksheets/{sheetName}/cells | Set cell range value 
[**cellsPostSetWorksheetColumnWidth**](CellsApi.md#cellsPostSetWorksheetColumnWidth) | **POST** /cells/{name}/worksheets/{sheetName}/cells/columns/{columnIndex} | Set worksheet column width.
[**cellsPostUngroupWorksheetColumns**](CellsApi.md#cellsPostUngroupWorksheetColumns) | **POST** /cells/{name}/worksheets/{sheetName}/cells/columns/ungroup | Ungroup worksheet columns.
[**cellsPostUngroupWorksheetRows**](CellsApi.md#cellsPostUngroupWorksheetRows) | **POST** /cells/{name}/worksheets/{sheetName}/cells/rows/ungroup | Ungroup worksheet rows.
[**cellsPostUnhideWorksheetColumns**](CellsApi.md#cellsPostUnhideWorksheetColumns) | **POST** /cells/{name}/worksheets/{sheetName}/cells/columns/unhide | Unhide worksheet columns.
[**cellsPostUnhideWorksheetRows**](CellsApi.md#cellsPostUnhideWorksheetRows) | **POST** /cells/{name}/worksheets/{sheetName}/cells/rows/unhide | Unhide worksheet rows.
[**cellsPostUpdateWorksheetCellStyle**](CellsApi.md#cellsPostUpdateWorksheetCellStyle) | **POST** /cells/{name}/worksheets/{sheetName}/cells/{cellName}/style | Update cell&#39;s style.
[**cellsPostUpdateWorksheetRangeStyle**](CellsApi.md#cellsPostUpdateWorksheetRangeStyle) | **POST** /cells/{name}/worksheets/{sheetName}/cells/style | Update cell&#39;s range style.
[**cellsPostUpdateWorksheetRow**](CellsApi.md#cellsPostUpdateWorksheetRow) | **POST** /cells/{name}/worksheets/{sheetName}/cells/rows/{rowIndex} | Update worksheet row.
[**cellsPostWorksheetCellSetValue**](CellsApi.md#cellsPostWorksheetCellSetValue) | **POST** /cells/{name}/worksheets/{sheetName}/cells/{cellName} | Set cell value.
[**cellsPostWorksheetMerge**](CellsApi.md#cellsPostWorksheetMerge) | **POST** /cells/{name}/worksheets/{sheetName}/cells/merge | Merge cells.
[**cellsPostWorksheetUnmerge**](CellsApi.md#cellsPostWorksheetUnmerge) | **POST** /cells/{name}/worksheets/{sheetName}/cells/unmerge | Unmerge cells.
[**cellsPropertiesDeleteDocumentProperties**](CellsApi.md#cellsPropertiesDeleteDocumentProperties) | **DELETE** /cells/{name}/documentproperties | Delete all custom document properties and clean built-in ones.
[**cellsPropertiesDeleteDocumentProperty**](CellsApi.md#cellsPropertiesDeleteDocumentProperty) | **DELETE** /cells/{name}/documentproperties/{propertyName} | Delete document property.
[**cellsPropertiesGetDocumentProperties**](CellsApi.md#cellsPropertiesGetDocumentProperties) | **GET** /cells/{name}/documentproperties | Read document properties.
[**cellsPropertiesGetDocumentProperty**](CellsApi.md#cellsPropertiesGetDocumentProperty) | **GET** /cells/{name}/documentproperties/{propertyName} | Read document property by name.
[**cellsPropertiesPutDocumentProperty**](CellsApi.md#cellsPropertiesPutDocumentProperty) | **PUT** /cells/{name}/documentproperties/{propertyName} | Set/create document property.
[**cellsPutInsertWorksheetColumns**](CellsApi.md#cellsPutInsertWorksheetColumns) | **PUT** /cells/{name}/worksheets/{sheetName}/cells/columns/{columnIndex} | Insert worksheet columns.
[**cellsPutInsertWorksheetRow**](CellsApi.md#cellsPutInsertWorksheetRow) | **PUT** /cells/{name}/worksheets/{sheetName}/cells/rows/{rowIndex} | Insert new worksheet row.
[**cellsPutInsertWorksheetRows**](CellsApi.md#cellsPutInsertWorksheetRows) | **PUT** /cells/{name}/worksheets/{sheetName}/cells/rows | Insert several new worksheet rows.
[**cellsRangesGetWorksheetCellsRangeValue**](CellsApi.md#cellsRangesGetWorksheetCellsRangeValue) | **GET** /cells/{name}/worksheets/{sheetName}/ranges/value | Get cells list in a range by range name or row column indexes  
[**cellsRangesPostWorksheetCellsRangeColumnWidth**](CellsApi.md#cellsRangesPostWorksheetCellsRangeColumnWidth) | **POST** /cells/{name}/worksheets/{sheetName}/ranges/columnWidth | Set column width of range
[**cellsRangesPostWorksheetCellsRangeMerge**](CellsApi.md#cellsRangesPostWorksheetCellsRangeMerge) | **POST** /cells/{name}/worksheets/{sheetName}/ranges/merge | Combines a range of cells into a single cell.              
[**cellsRangesPostWorksheetCellsRangeMoveTo**](CellsApi.md#cellsRangesPostWorksheetCellsRangeMoveTo) | **POST** /cells/{name}/worksheets/{sheetName}/ranges/moveto | Move the current range to the dest range.             
[**cellsRangesPostWorksheetCellsRangeOutlineBorder**](CellsApi.md#cellsRangesPostWorksheetCellsRangeOutlineBorder) | **POST** /cells/{name}/worksheets/{sheetName}/ranges/outlineBorder | Sets outline border around a range of cells.
[**cellsRangesPostWorksheetCellsRangeRowHeight**](CellsApi.md#cellsRangesPostWorksheetCellsRangeRowHeight) | **POST** /cells/{name}/worksheets/{sheetName}/ranges/rowHeight | set row height of range
[**cellsRangesPostWorksheetCellsRangeStyle**](CellsApi.md#cellsRangesPostWorksheetCellsRangeStyle) | **POST** /cells/{name}/worksheets/{sheetName}/ranges/style | Sets the style of the range.             
[**cellsRangesPostWorksheetCellsRangeUnmerge**](CellsApi.md#cellsRangesPostWorksheetCellsRangeUnmerge) | **POST** /cells/{name}/worksheets/{sheetName}/ranges/unmerge | Unmerges merged cells of this range.             
[**cellsRangesPostWorksheetCellsRangeValue**](CellsApi.md#cellsRangesPostWorksheetCellsRangeValue) | **POST** /cells/{name}/worksheets/{sheetName}/ranges/value | Puts a value into the range, if appropriate the value will be converted to other data type and cell&#39;s number format will be reset.             
[**cellsRangesPostWorksheetCellsRanges**](CellsApi.md#cellsRangesPostWorksheetCellsRanges) | **POST** /cells/{name}/worksheets/{sheetName}/ranges | copy range in the worksheet
[**cellsSaveAsPostDocumentSaveAs**](CellsApi.md#cellsSaveAsPostDocumentSaveAs) | **POST** /cells/{name}/SaveAs | Convert document and save result to storage.
[**cellsShapesDeleteWorksheetShape**](CellsApi.md#cellsShapesDeleteWorksheetShape) | **DELETE** /cells/{name}/worksheets/{sheetName}/shapes/{shapeindex} | Delete a shape in worksheet
[**cellsShapesDeleteWorksheetShapes**](CellsApi.md#cellsShapesDeleteWorksheetShapes) | **DELETE** /cells/{name}/worksheets/{sheetName}/shapes | delete all shapes in worksheet
[**cellsShapesGetWorksheetShape**](CellsApi.md#cellsShapesGetWorksheetShape) | **GET** /cells/{name}/worksheets/{sheetName}/shapes/{shapeindex} | Get worksheet shape
[**cellsShapesGetWorksheetShapes**](CellsApi.md#cellsShapesGetWorksheetShapes) | **GET** /cells/{name}/worksheets/{sheetName}/shapes | Get worksheet shapes 
[**cellsShapesPostWorksheetShape**](CellsApi.md#cellsShapesPostWorksheetShape) | **POST** /cells/{name}/worksheets/{sheetName}/shapes/{shapeindex} | Update a shape in worksheet
[**cellsShapesPutWorksheetShape**](CellsApi.md#cellsShapesPutWorksheetShape) | **PUT** /cells/{name}/worksheets/{sheetName}/shapes | Add shape in worksheet
[**cellsTaskPostRunTask**](CellsApi.md#cellsTaskPostRunTask) | **POST** /cells/task/runtask | Run tasks  
[**cellsWorkbookDeleteDecryptDocument**](CellsApi.md#cellsWorkbookDeleteDecryptDocument) | **DELETE** /cells/{name}/encryption | Decrypt document.
[**cellsWorkbookDeleteDocumentUnprotectFromChanges**](CellsApi.md#cellsWorkbookDeleteDocumentUnprotectFromChanges) | **DELETE** /cells/{name}/writeProtection | Unprotect document from changes.
[**cellsWorkbookDeleteUnprotectDocument**](CellsApi.md#cellsWorkbookDeleteUnprotectDocument) | **DELETE** /cells/{name}/protection | Unprotect document.
[**cellsWorkbookDeleteWorkbookBackground**](CellsApi.md#cellsWorkbookDeleteWorkbookBackground) | **DELETE** /cells/{name}/background | Set worksheet background image.
[**cellsWorkbookDeleteWorkbookName**](CellsApi.md#cellsWorkbookDeleteWorkbookName) | **DELETE** /cells/{name}/names/{nameName} | Clean workbook&#39;s names.
[**cellsWorkbookDeleteWorkbookNames**](CellsApi.md#cellsWorkbookDeleteWorkbookNames) | **DELETE** /cells/{name}/names | Clean workbook&#39;s names.
[**cellsWorkbookGetWorkbook**](CellsApi.md#cellsWorkbookGetWorkbook) | **GET** /cells/{name} | Read workbook info or export.
[**cellsWorkbookGetWorkbookDefaultStyle**](CellsApi.md#cellsWorkbookGetWorkbookDefaultStyle) | **GET** /cells/{name}/defaultstyle | Read workbook default style info.
[**cellsWorkbookGetWorkbookName**](CellsApi.md#cellsWorkbookGetWorkbookName) | **GET** /cells/{name}/names/{nameName} | Read workbook&#39;s name.
[**cellsWorkbookGetWorkbookNameValue**](CellsApi.md#cellsWorkbookGetWorkbookNameValue) | **GET** /cells/{name}/names/{nameName}/value | Get workbook&#39;s name value.
[**cellsWorkbookGetWorkbookNames**](CellsApi.md#cellsWorkbookGetWorkbookNames) | **GET** /cells/{name}/names | Read workbook&#39;s names.
[**cellsWorkbookGetWorkbookSettings**](CellsApi.md#cellsWorkbookGetWorkbookSettings) | **GET** /cells/{name}/settings | Get Workbook Settings DTO
[**cellsWorkbookGetWorkbookTextItems**](CellsApi.md#cellsWorkbookGetWorkbookTextItems) | **GET** /cells/{name}/textItems | Read workbook&#39;s text items.
[**cellsWorkbookPostAutofitWorkbookRows**](CellsApi.md#cellsWorkbookPostAutofitWorkbookRows) | **POST** /cells/{name}/autofitrows | Autofit workbook rows.
[**cellsWorkbookPostEncryptDocument**](CellsApi.md#cellsWorkbookPostEncryptDocument) | **POST** /cells/{name}/encryption | Encript document.
[**cellsWorkbookPostImportData**](CellsApi.md#cellsWorkbookPostImportData) | **POST** /cells/{name}/importdata | 
[**cellsWorkbookPostProtectDocument**](CellsApi.md#cellsWorkbookPostProtectDocument) | **POST** /cells/{name}/protection | Protect document.
[**cellsWorkbookPostWorkbookCalculateFormula**](CellsApi.md#cellsWorkbookPostWorkbookCalculateFormula) | **POST** /cells/{name}/calculateformula | Calculate all formulas in workbook.
[**cellsWorkbookPostWorkbookGetSmartMarkerResult**](CellsApi.md#cellsWorkbookPostWorkbookGetSmartMarkerResult) | **POST** /cells/{name}/smartmarker | Smart marker processing result.
[**cellsWorkbookPostWorkbookSettings**](CellsApi.md#cellsWorkbookPostWorkbookSettings) | **POST** /cells/{name}/settings | Update Workbook setting 
[**cellsWorkbookPostWorkbookSplit**](CellsApi.md#cellsWorkbookPostWorkbookSplit) | **POST** /cells/{name}/split | Split workbook.
[**cellsWorkbookPostWorkbooksMerge**](CellsApi.md#cellsWorkbookPostWorkbooksMerge) | **POST** /cells/{name}/merge | Merge workbooks.
[**cellsWorkbookPostWorkbooksTextReplace**](CellsApi.md#cellsWorkbookPostWorkbooksTextReplace) | **POST** /cells/{name}/replaceText | Replace text.
[**cellsWorkbookPostWorkbooksTextSearch**](CellsApi.md#cellsWorkbookPostWorkbooksTextSearch) | **POST** /cells/{name}/findText | Search text.
[**cellsWorkbookPutConvertWorkbook**](CellsApi.md#cellsWorkbookPutConvertWorkbook) | **PUT** /cells/convert | Convert workbook from request content to some format.
[**cellsWorkbookPutDocumentProtectFromChanges**](CellsApi.md#cellsWorkbookPutDocumentProtectFromChanges) | **PUT** /cells/{name}/writeProtection | Protect document from changes.
[**cellsWorkbookPutWorkbookBackground**](CellsApi.md#cellsWorkbookPutWorkbookBackground) | **PUT** /cells/{name}/background | Set workbook background image.
[**cellsWorkbookPutWorkbookCreate**](CellsApi.md#cellsWorkbookPutWorkbookCreate) | **PUT** /cells/{name} | Create new workbook using deferent methods.
[**cellsWorksheetValidationsDeleteWorksheetValidation**](CellsApi.md#cellsWorksheetValidationsDeleteWorksheetValidation) | **DELETE** /cells/{name}/worksheets/{sheetName}/validations/{validationIndex} | Delete worksheet validation by index.
[**cellsWorksheetValidationsDeleteWorksheetValidations**](CellsApi.md#cellsWorksheetValidationsDeleteWorksheetValidations) | **DELETE** /cells/{name}/worksheets/{sheetName}/validations | Clear all validation in worksheet.
[**cellsWorksheetValidationsGetWorksheetValidation**](CellsApi.md#cellsWorksheetValidationsGetWorksheetValidation) | **GET** /cells/{name}/worksheets/{sheetName}/validations/{validationIndex} | Get worksheet validation by index.
[**cellsWorksheetValidationsGetWorksheetValidations**](CellsApi.md#cellsWorksheetValidationsGetWorksheetValidations) | **GET** /cells/{name}/worksheets/{sheetName}/validations | Get worksheet validations.
[**cellsWorksheetValidationsPostWorksheetValidation**](CellsApi.md#cellsWorksheetValidationsPostWorksheetValidation) | **POST** /cells/{name}/worksheets/{sheetName}/validations/{validationIndex} | Update worksheet validation by index.
[**cellsWorksheetValidationsPutWorksheetValidation**](CellsApi.md#cellsWorksheetValidationsPutWorksheetValidation) | **PUT** /cells/{name}/worksheets/{sheetName}/validations | Add worksheet validation at index.
[**cellsWorksheetsDeleteUnprotectWorksheet**](CellsApi.md#cellsWorksheetsDeleteUnprotectWorksheet) | **DELETE** /cells/{name}/worksheets/{sheetName}/protection | Unprotect worksheet.
[**cellsWorksheetsDeleteWorksheet**](CellsApi.md#cellsWorksheetsDeleteWorksheet) | **DELETE** /cells/{name}/worksheets/{sheetName} | Delete worksheet.
[**cellsWorksheetsDeleteWorksheetBackground**](CellsApi.md#cellsWorksheetsDeleteWorksheetBackground) | **DELETE** /cells/{name}/worksheets/{sheetName}/background | Set worksheet background image.
[**cellsWorksheetsDeleteWorksheetComment**](CellsApi.md#cellsWorksheetsDeleteWorksheetComment) | **DELETE** /cells/{name}/worksheets/{sheetName}/comments/{cellName} | Delete worksheet&#39;s cell comment.
[**cellsWorksheetsDeleteWorksheetComments**](CellsApi.md#cellsWorksheetsDeleteWorksheetComments) | **DELETE** /cells/{name}/worksheets/{sheetName}/comments | Delete all comments for worksheet.
[**cellsWorksheetsDeleteWorksheetFreezePanes**](CellsApi.md#cellsWorksheetsDeleteWorksheetFreezePanes) | **DELETE** /cells/{name}/worksheets/{sheetName}/freezepanes | Unfreeze panes
[**cellsWorksheetsGetNamedRanges**](CellsApi.md#cellsWorksheetsGetNamedRanges) | **GET** /cells/{name}/worksheets/ranges | Read worksheets ranges info.
[**cellsWorksheetsGetWorksheet**](CellsApi.md#cellsWorksheetsGetWorksheet) | **GET** /cells/{name}/worksheets/{sheetName} | Read worksheet info or export.
[**cellsWorksheetsGetWorksheetCalculateFormula**](CellsApi.md#cellsWorksheetsGetWorksheetCalculateFormula) | **GET** /cells/{name}/worksheets/{sheetName}/formulaResult | Calculate formula value.
[**cellsWorksheetsGetWorksheetComment**](CellsApi.md#cellsWorksheetsGetWorksheetComment) | **GET** /cells/{name}/worksheets/{sheetName}/comments/{cellName} | Get worksheet comment by cell name.
[**cellsWorksheetsGetWorksheetComments**](CellsApi.md#cellsWorksheetsGetWorksheetComments) | **GET** /cells/{name}/worksheets/{sheetName}/comments | Get worksheet comments.
[**cellsWorksheetsGetWorksheetMergedCell**](CellsApi.md#cellsWorksheetsGetWorksheetMergedCell) | **GET** /cells/{name}/worksheets/{sheetName}/mergedCells/{mergedCellIndex} | Get worksheet merged cell by its index.
[**cellsWorksheetsGetWorksheetMergedCells**](CellsApi.md#cellsWorksheetsGetWorksheetMergedCells) | **GET** /cells/{name}/worksheets/{sheetName}/mergedCells | Get worksheet merged cells.
[**cellsWorksheetsGetWorksheetTextItems**](CellsApi.md#cellsWorksheetsGetWorksheetTextItems) | **GET** /cells/{name}/worksheets/{sheetName}/textItems | Get worksheet text items.
[**cellsWorksheetsGetWorksheets**](CellsApi.md#cellsWorksheetsGetWorksheets) | **GET** /cells/{name}/worksheets | Read worksheets info.
[**cellsWorksheetsPostAutofitWorksheetColumns**](CellsApi.md#cellsWorksheetsPostAutofitWorksheetColumns) | **POST** /cells/{name}/worksheets/{sheetName}/autofitcolumns | 
[**cellsWorksheetsPostAutofitWorksheetRow**](CellsApi.md#cellsWorksheetsPostAutofitWorksheetRow) | **POST** /cells/{name}/worksheets/{sheetName}/autofitrow | 
[**cellsWorksheetsPostAutofitWorksheetRows**](CellsApi.md#cellsWorksheetsPostAutofitWorksheetRows) | **POST** /cells/{name}/worksheets/{sheetName}/autofitrows | Autofit worksheet rows.
[**cellsWorksheetsPostCopyWorksheet**](CellsApi.md#cellsWorksheetsPostCopyWorksheet) | **POST** /cells/{name}/worksheets/{sheetName}/copy | 
[**cellsWorksheetsPostMoveWorksheet**](CellsApi.md#cellsWorksheetsPostMoveWorksheet) | **POST** /cells/{name}/worksheets/{sheetName}/position | Move worksheet.
[**cellsWorksheetsPostRenameWorksheet**](CellsApi.md#cellsWorksheetsPostRenameWorksheet) | **POST** /cells/{name}/worksheets/{sheetName}/rename | Rename worksheet
[**cellsWorksheetsPostUpdateWorksheetProperty**](CellsApi.md#cellsWorksheetsPostUpdateWorksheetProperty) | **POST** /cells/{name}/worksheets/{sheetName} | Update worksheet property
[**cellsWorksheetsPostUpdateWorksheetZoom**](CellsApi.md#cellsWorksheetsPostUpdateWorksheetZoom) | **POST** /cells/{name}/worksheets/{sheetName}/zoom | 
[**cellsWorksheetsPostWorksheetComment**](CellsApi.md#cellsWorksheetsPostWorksheetComment) | **POST** /cells/{name}/worksheets/{sheetName}/comments/{cellName} | Update worksheet&#39;s cell comment.
[**cellsWorksheetsPostWorksheetRangeSort**](CellsApi.md#cellsWorksheetsPostWorksheetRangeSort) | **POST** /cells/{name}/worksheets/{sheetName}/sort | Sort worksheet range.
[**cellsWorksheetsPostWorksheetTextSearch**](CellsApi.md#cellsWorksheetsPostWorksheetTextSearch) | **POST** /cells/{name}/worksheets/{sheetName}/findText | Search text.
[**cellsWorksheetsPostWorsheetTextReplace**](CellsApi.md#cellsWorksheetsPostWorsheetTextReplace) | **POST** /cells/{name}/worksheets/{sheetName}/replaceText | Replace text.
[**cellsWorksheetsPutAddNewWorksheet**](CellsApi.md#cellsWorksheetsPutAddNewWorksheet) | **PUT** /cells/{name}/worksheets/{sheetName} | Add new worksheet.
[**cellsWorksheetsPutChangeVisibilityWorksheet**](CellsApi.md#cellsWorksheetsPutChangeVisibilityWorksheet) | **PUT** /cells/{name}/worksheets/{sheetName}/visible | Change worksheet visibility.
[**cellsWorksheetsPutProtectWorksheet**](CellsApi.md#cellsWorksheetsPutProtectWorksheet) | **PUT** /cells/{name}/worksheets/{sheetName}/protection | Protect worksheet.
[**cellsWorksheetsPutWorksheetBackground**](CellsApi.md#cellsWorksheetsPutWorksheetBackground) | **PUT** /cells/{name}/worksheets/{sheetName}/background | Set worksheet background image.
[**cellsWorksheetsPutWorksheetComment**](CellsApi.md#cellsWorksheetsPutWorksheetComment) | **PUT** /cells/{name}/worksheets/{sheetName}/comments/{cellName} | Add worksheet&#39;s cell comment.
[**cellsWorksheetsPutWorksheetFreezePanes**](CellsApi.md#cellsWorksheetsPutWorksheetFreezePanes) | **PUT** /cells/{name}/worksheets/{sheetName}/freezepanes | Set freeze panes
[**copyFile**](CellsApi.md#copyFile) | **PUT** /cells/storage/file/copy/{srcPath} | Copy file
[**copyFolder**](CellsApi.md#copyFolder) | **PUT** /cells/storage/folder/copy/{srcPath} | Copy folder
[**createFolder**](CellsApi.md#createFolder) | **PUT** /cells/storage/folder/{path} | Create the folder
[**deleteFile**](CellsApi.md#deleteFile) | **DELETE** /cells/storage/file/{path} | Delete file
[**deleteFolder**](CellsApi.md#deleteFolder) | **DELETE** /cells/storage/folder/{path} | Delete folder
[**downloadFile**](CellsApi.md#downloadFile) | **GET** /cells/storage/file/{path} | Download file
[**getDiscUsage**](CellsApi.md#getDiscUsage) | **GET** /cells/storage/disc | Get disc usage
[**getFileVersions**](CellsApi.md#getFileVersions) | **GET** /cells/storage/version/{path} | Get file versions
[**getFilesList**](CellsApi.md#getFilesList) | **GET** /cells/storage/folder/{path} | Get all files and folders within a folder
[**moveFile**](CellsApi.md#moveFile) | **PUT** /cells/storage/file/move/{srcPath} | Move file
[**moveFolder**](CellsApi.md#moveFolder) | **PUT** /cells/storage/folder/move/{srcPath} | Move folder
[**oAuthPost**](CellsApi.md#oAuthPost) | **POST** /connect/token | Get Access token
[**objectExists**](CellsApi.md#objectExists) | **GET** /cells/storage/exist/{path} | Check if file or folder exists
[**storageExists**](CellsApi.md#storageExists) | **GET** /cells/storage/{storageName}/exist | Check if storage exists
[**uploadFile**](CellsApi.md#uploadFile) | **PUT** /cells/storage/file/{path} | Upload file


<a name="cellsAutoFilterDeleteWorksheetDateFilter"></a>
# **cellsAutoFilterDeleteWorksheetDateFilter**
> CellsCloudResponse cellsAutoFilterDeleteWorksheetDateFilter(name, sheetName, fieldIndex, dateTimeGroupingType, year, month, day, hour, minute, second, folder, storage)

Removes a date filter.             

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer fieldIndex = 56; // Integer | 
String dateTimeGroupingType = "dateTimeGroupingType_example"; // String | 
Integer year = 0; // Integer | 
Integer month = 0; // Integer | 
Integer day = 0; // Integer | 
Integer hour = 0; // Integer | 
Integer minute = 0; // Integer | 
Integer second = 0; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsAutoFilterDeleteWorksheetDateFilter(name, sheetName, fieldIndex, dateTimeGroupingType, year, month, day, hour, minute, second, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsAutoFilterDeleteWorksheetDateFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **fieldIndex** | **Integer**|  |
 **dateTimeGroupingType** | **String**|  |
 **year** | **Integer**|  | [optional] [default to 0]
 **month** | **Integer**|  | [optional] [default to 0]
 **day** | **Integer**|  | [optional] [default to 0]
 **hour** | **Integer**|  | [optional] [default to 0]
 **minute** | **Integer**|  | [optional] [default to 0]
 **second** | **Integer**|  | [optional] [default to 0]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoFilterDeleteWorksheetFilter"></a>
# **cellsAutoFilterDeleteWorksheetFilter**
> CellsCloudResponse cellsAutoFilterDeleteWorksheetFilter(name, sheetName, fieldIndex, criteria, folder, storage)

Delete a filter for a filter column.             

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer fieldIndex = 56; // Integer | 
String criteria = "criteria_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsAutoFilterDeleteWorksheetFilter(name, sheetName, fieldIndex, criteria, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsAutoFilterDeleteWorksheetFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **fieldIndex** | **Integer**|  |
 **criteria** | **String**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoFilterGetWorksheetAutoFilter"></a>
# **cellsAutoFilterGetWorksheetAutoFilter**
> AutoFilterResponse cellsAutoFilterGetWorksheetAutoFilter(name, sheetName, folder, storage)

Get Auto filter Description

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    AutoFilterResponse result = apiInstance.cellsAutoFilterGetWorksheetAutoFilter(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsAutoFilterGetWorksheetAutoFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**AutoFilterResponse**](AutoFilterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoFilterPostWorksheetAutoFilterRefresh"></a>
# **cellsAutoFilterPostWorksheetAutoFilterRefresh**
> CellsCloudResponse cellsAutoFilterPostWorksheetAutoFilterRefresh(name, sheetName, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsAutoFilterPostWorksheetAutoFilterRefresh(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsAutoFilterPostWorksheetAutoFilterRefresh");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoFilterPostWorksheetMatchBlanks"></a>
# **cellsAutoFilterPostWorksheetMatchBlanks**
> CellsCloudResponse cellsAutoFilterPostWorksheetMatchBlanks(name, sheetName, fieldIndex, folder, storage)

Match all blank cell in the list.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer fieldIndex = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsAutoFilterPostWorksheetMatchBlanks(name, sheetName, fieldIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsAutoFilterPostWorksheetMatchBlanks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **fieldIndex** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoFilterPostWorksheetMatchNonBlanks"></a>
# **cellsAutoFilterPostWorksheetMatchNonBlanks**
> CellsCloudResponse cellsAutoFilterPostWorksheetMatchNonBlanks(name, sheetName, fieldIndex, folder, storage)

Match all not blank cell in the list.             

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer fieldIndex = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsAutoFilterPostWorksheetMatchNonBlanks(name, sheetName, fieldIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsAutoFilterPostWorksheetMatchNonBlanks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **fieldIndex** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoFilterPutWorksheetColorFilter"></a>
# **cellsAutoFilterPutWorksheetColorFilter**
> CellsCloudResponse cellsAutoFilterPutWorksheetColorFilter(name, sheetName, range, fieldIndex, colorFilter, matchBlanks, refresh, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String range = "range_example"; // String | 
Integer fieldIndex = 56; // Integer | 
ColorFilterRequest colorFilter = new ColorFilterRequest(); // ColorFilterRequest | 
Boolean matchBlanks = true; // Boolean | 
Boolean refresh = true; // Boolean | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsAutoFilterPutWorksheetColorFilter(name, sheetName, range, fieldIndex, colorFilter, matchBlanks, refresh, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsAutoFilterPutWorksheetColorFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **range** | **String**|  |
 **fieldIndex** | **Integer**|  |
 **colorFilter** | [**ColorFilterRequest**](ColorFilterRequest.md)|  | [optional]
 **matchBlanks** | **Boolean**|  | [optional]
 **refresh** | **Boolean**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoFilterPutWorksheetCustomFilter"></a>
# **cellsAutoFilterPutWorksheetCustomFilter**
> CellsCloudResponse cellsAutoFilterPutWorksheetCustomFilter(name, sheetName, range, fieldIndex, operatorType1, criteria1, isAnd, operatorType2, criteria2, matchBlanks, refresh, folder, storage)

Filters a list with a custom criteria.             

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String range = "range_example"; // String | 
Integer fieldIndex = 56; // Integer | 
String operatorType1 = "operatorType1_example"; // String | 
String criteria1 = "criteria1_example"; // String | 
Boolean isAnd = true; // Boolean | 
String operatorType2 = "operatorType2_example"; // String | 
String criteria2 = "criteria2_example"; // String | 
Boolean matchBlanks = true; // Boolean | 
Boolean refresh = true; // Boolean | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsAutoFilterPutWorksheetCustomFilter(name, sheetName, range, fieldIndex, operatorType1, criteria1, isAnd, operatorType2, criteria2, matchBlanks, refresh, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsAutoFilterPutWorksheetCustomFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **range** | **String**|  |
 **fieldIndex** | **Integer**|  |
 **operatorType1** | **String**|  |
 **criteria1** | **String**|  |
 **isAnd** | **Boolean**|  | [optional]
 **operatorType2** | **String**|  | [optional]
 **criteria2** | **String**|  | [optional]
 **matchBlanks** | **Boolean**|  | [optional]
 **refresh** | **Boolean**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoFilterPutWorksheetDateFilter"></a>
# **cellsAutoFilterPutWorksheetDateFilter**
> CellsCloudResponse cellsAutoFilterPutWorksheetDateFilter(name, sheetName, range, fieldIndex, dateTimeGroupingType, year, month, day, hour, minute, second, matchBlanks, refresh, folder, storage)

add date filter in worksheet 

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String range = "range_example"; // String | 
Integer fieldIndex = 56; // Integer | 
String dateTimeGroupingType = "dateTimeGroupingType_example"; // String | 
Integer year = 0; // Integer | 
Integer month = 0; // Integer | 
Integer day = 0; // Integer | 
Integer hour = 0; // Integer | 
Integer minute = 0; // Integer | 
Integer second = 0; // Integer | 
Boolean matchBlanks = true; // Boolean | 
Boolean refresh = true; // Boolean | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsAutoFilterPutWorksheetDateFilter(name, sheetName, range, fieldIndex, dateTimeGroupingType, year, month, day, hour, minute, second, matchBlanks, refresh, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsAutoFilterPutWorksheetDateFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **range** | **String**|  |
 **fieldIndex** | **Integer**|  |
 **dateTimeGroupingType** | **String**|  |
 **year** | **Integer**|  | [optional] [default to 0]
 **month** | **Integer**|  | [optional] [default to 0]
 **day** | **Integer**|  | [optional] [default to 0]
 **hour** | **Integer**|  | [optional] [default to 0]
 **minute** | **Integer**|  | [optional] [default to 0]
 **second** | **Integer**|  | [optional] [default to 0]
 **matchBlanks** | **Boolean**|  | [optional]
 **refresh** | **Boolean**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoFilterPutWorksheetDynamicFilter"></a>
# **cellsAutoFilterPutWorksheetDynamicFilter**
> CellsCloudResponse cellsAutoFilterPutWorksheetDynamicFilter(name, sheetName, range, fieldIndex, dynamicFilterType, matchBlanks, refresh, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String range = "range_example"; // String | 
Integer fieldIndex = 56; // Integer | 
String dynamicFilterType = "dynamicFilterType_example"; // String | 
Boolean matchBlanks = true; // Boolean | 
Boolean refresh = true; // Boolean | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsAutoFilterPutWorksheetDynamicFilter(name, sheetName, range, fieldIndex, dynamicFilterType, matchBlanks, refresh, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsAutoFilterPutWorksheetDynamicFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **range** | **String**|  |
 **fieldIndex** | **Integer**|  |
 **dynamicFilterType** | **String**|  |
 **matchBlanks** | **Boolean**|  | [optional]
 **refresh** | **Boolean**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoFilterPutWorksheetFilter"></a>
# **cellsAutoFilterPutWorksheetFilter**
> CellsCloudResponse cellsAutoFilterPutWorksheetFilter(name, sheetName, range, fieldIndex, criteria, matchBlanks, refresh, folder, storage)

Adds a filter for a filter column.             

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String range = "range_example"; // String | 
Integer fieldIndex = 56; // Integer | 
String criteria = "criteria_example"; // String | 
Boolean matchBlanks = true; // Boolean | 
Boolean refresh = true; // Boolean | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsAutoFilterPutWorksheetFilter(name, sheetName, range, fieldIndex, criteria, matchBlanks, refresh, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsAutoFilterPutWorksheetFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **range** | **String**|  |
 **fieldIndex** | **Integer**|  |
 **criteria** | **String**|  |
 **matchBlanks** | **Boolean**|  | [optional]
 **refresh** | **Boolean**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoFilterPutWorksheetFilterTop10"></a>
# **cellsAutoFilterPutWorksheetFilterTop10**
> CellsCloudResponse cellsAutoFilterPutWorksheetFilterTop10(name, sheetName, range, fieldIndex, isTop, isPercent, itemCount, matchBlanks, refresh, folder, storage)

Filter the top 10 item in the list

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String range = "range_example"; // String | 
Integer fieldIndex = 56; // Integer | 
Boolean isTop = true; // Boolean | 
Boolean isPercent = true; // Boolean | 
Integer itemCount = 56; // Integer | 
Boolean matchBlanks = true; // Boolean | 
Boolean refresh = true; // Boolean | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsAutoFilterPutWorksheetFilterTop10(name, sheetName, range, fieldIndex, isTop, isPercent, itemCount, matchBlanks, refresh, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsAutoFilterPutWorksheetFilterTop10");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **range** | **String**|  |
 **fieldIndex** | **Integer**|  |
 **isTop** | **Boolean**|  |
 **isPercent** | **Boolean**|  |
 **itemCount** | **Integer**|  |
 **matchBlanks** | **Boolean**|  | [optional]
 **refresh** | **Boolean**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoFilterPutWorksheetIconFilter"></a>
# **cellsAutoFilterPutWorksheetIconFilter**
> CellsCloudResponse cellsAutoFilterPutWorksheetIconFilter(name, sheetName, range, fieldIndex, iconSetType, iconId, matchBlanks, refresh, folder, storage)

Adds an icon filter.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String range = "range_example"; // String | 
Integer fieldIndex = 56; // Integer | 
String iconSetType = "iconSetType_example"; // String | 
Integer iconId = 56; // Integer | 
Boolean matchBlanks = true; // Boolean | 
Boolean refresh = true; // Boolean | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsAutoFilterPutWorksheetIconFilter(name, sheetName, range, fieldIndex, iconSetType, iconId, matchBlanks, refresh, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsAutoFilterPutWorksheetIconFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **range** | **String**|  |
 **fieldIndex** | **Integer**|  |
 **iconSetType** | **String**|  |
 **iconId** | **Integer**|  |
 **matchBlanks** | **Boolean**|  | [optional]
 **refresh** | **Boolean**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoshapesGetWorksheetAutoshape"></a>
# **cellsAutoshapesGetWorksheetAutoshape**
> File cellsAutoshapesGetWorksheetAutoshape(name, sheetName, autoshapeNumber, format, folder, storage)

Get autoshape info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer autoshapeNumber = 56; // Integer | The autoshape number.
String format = "format_example"; // String | Exported format.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    File result = apiInstance.cellsAutoshapesGetWorksheetAutoshape(name, sheetName, autoshapeNumber, format, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsAutoshapesGetWorksheetAutoshape");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **autoshapeNumber** | **Integer**| The autoshape number. |
 **format** | **String**| Exported format. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsAutoshapesGetWorksheetAutoshapes"></a>
# **cellsAutoshapesGetWorksheetAutoshapes**
> AutoShapesResponse cellsAutoshapesGetWorksheetAutoshapes(name, sheetName, folder, storage)

Get worksheet autoshapes info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    AutoShapesResponse result = apiInstance.cellsAutoshapesGetWorksheetAutoshapes(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsAutoshapesGetWorksheetAutoshapes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**AutoShapesResponse**](AutoShapesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartAreaGetChartArea"></a>
# **cellsChartAreaGetChartArea**
> ChartAreaResponse cellsChartAreaGetChartArea(name, sheetName, chartIndex, folder, storage)

Get chart area info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartIndex = 56; // Integer | The chart index.
String folder = "folder_example"; // String | Workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    ChartAreaResponse result = apiInstance.cellsChartAreaGetChartArea(name, sheetName, chartIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsChartAreaGetChartArea");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **chartIndex** | **Integer**| The chart index. |
 **folder** | **String**| Workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**ChartAreaResponse**](ChartAreaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartAreaGetChartAreaBorder"></a>
# **cellsChartAreaGetChartAreaBorder**
> LineResponse cellsChartAreaGetChartAreaBorder(name, sheetName, chartIndex, folder, storage)

Get chart area border info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartIndex = 56; // Integer | The chart index.
String folder = "folder_example"; // String | Workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    LineResponse result = apiInstance.cellsChartAreaGetChartAreaBorder(name, sheetName, chartIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsChartAreaGetChartAreaBorder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **chartIndex** | **Integer**| The chart index. |
 **folder** | **String**| Workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**LineResponse**](LineResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartAreaGetChartAreaFillFormat"></a>
# **cellsChartAreaGetChartAreaFillFormat**
> FillFormatResponse cellsChartAreaGetChartAreaFillFormat(name, sheetName, chartIndex, folder, storage)

Get chart area fill format info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartIndex = 56; // Integer | The chart index.
String folder = "folder_example"; // String | Workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    FillFormatResponse result = apiInstance.cellsChartAreaGetChartAreaFillFormat(name, sheetName, chartIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsChartAreaGetChartAreaFillFormat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **chartIndex** | **Integer**| The chart index. |
 **folder** | **String**| Workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**FillFormatResponse**](FillFormatResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsDeleteWorksheetChartLegend"></a>
# **cellsChartsDeleteWorksheetChartLegend**
> CellsCloudResponse cellsChartsDeleteWorksheetChartLegend(name, sheetName, chartIndex, folder, storage)

Hide legend in chart

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartIndex = 56; // Integer | The chart index.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsChartsDeleteWorksheetChartLegend(name, sheetName, chartIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsChartsDeleteWorksheetChartLegend");
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
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsDeleteWorksheetChartTitle"></a>
# **cellsChartsDeleteWorksheetChartTitle**
> CellsCloudResponse cellsChartsDeleteWorksheetChartTitle(name, sheetName, chartIndex, folder, storage)

Hide title in chart

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartIndex = 56; // Integer | The chart index.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsChartsDeleteWorksheetChartTitle(name, sheetName, chartIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsChartsDeleteWorksheetChartTitle");
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
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsDeleteWorksheetClearCharts"></a>
# **cellsChartsDeleteWorksheetClearCharts**
> CellsCloudResponse cellsChartsDeleteWorksheetClearCharts(name, sheetName, folder, storage)

Clear the charts.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsChartsDeleteWorksheetClearCharts(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsChartsDeleteWorksheetClearCharts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsDeleteWorksheetDeleteChart"></a>
# **cellsChartsDeleteWorksheetDeleteChart**
> ChartsResponse cellsChartsDeleteWorksheetDeleteChart(name, sheetName, chartIndex, folder, storage)

Delete worksheet chart by index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartIndex = 56; // Integer | The chart index.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    ChartsResponse result = apiInstance.cellsChartsDeleteWorksheetDeleteChart(name, sheetName, chartIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsChartsDeleteWorksheetDeleteChart");
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
 **storage** | **String**| storage name. | [optional]

### Return type

[**ChartsResponse**](ChartsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsGetWorksheetChart"></a>
# **cellsChartsGetWorksheetChart**
> File cellsChartsGetWorksheetChart(name, sheetName, chartNumber, format, folder, storage)

Get chart info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartNumber = 56; // Integer | The chart number.
String format = "format_example"; // String | The exported file format.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    File result = apiInstance.cellsChartsGetWorksheetChart(name, sheetName, chartNumber, format, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsChartsGetWorksheetChart");
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
 **storage** | **String**| storage name. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsGetWorksheetChartLegend"></a>
# **cellsChartsGetWorksheetChartLegend**
> LegendResponse cellsChartsGetWorksheetChartLegend(name, sheetName, chartIndex, folder, storage)

Get chart legend

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartIndex = 56; // Integer | The chart index.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    LegendResponse result = apiInstance.cellsChartsGetWorksheetChartLegend(name, sheetName, chartIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsChartsGetWorksheetChartLegend");
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
 **storage** | **String**| storage name. | [optional]

### Return type

[**LegendResponse**](LegendResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsGetWorksheetChartTitle"></a>
# **cellsChartsGetWorksheetChartTitle**
> TitleResponse cellsChartsGetWorksheetChartTitle(name, sheetName, chartIndex, folder, storage)

Get chart title

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartIndex = 56; // Integer | The chart index.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    TitleResponse result = apiInstance.cellsChartsGetWorksheetChartTitle(name, sheetName, chartIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsChartsGetWorksheetChartTitle");
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
 **storage** | **String**| storage name. | [optional]

### Return type

[**TitleResponse**](TitleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsGetWorksheetCharts"></a>
# **cellsChartsGetWorksheetCharts**
> ChartsResponse cellsChartsGetWorksheetCharts(name, sheetName, folder, storage)

Get worksheet charts info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    ChartsResponse result = apiInstance.cellsChartsGetWorksheetCharts(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsChartsGetWorksheetCharts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**ChartsResponse**](ChartsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsPostWorksheetChart"></a>
# **cellsChartsPostWorksheetChart**
> CellsCloudResponse cellsChartsPostWorksheetChart(name, sheetName, chartIndex, chart, folder, storage)

Update chart propreties

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer chartIndex = 56; // Integer | 
Chart chart = new Chart(); // Chart | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsChartsPostWorksheetChart(name, sheetName, chartIndex, chart, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsChartsPostWorksheetChart");
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
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsPostWorksheetChartLegend"></a>
# **cellsChartsPostWorksheetChartLegend**
> LegendResponse cellsChartsPostWorksheetChartLegend(name, sheetName, chartIndex, legend, folder, storage)

Update chart legend

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartIndex = 56; // Integer | The chart index.
Legend legend = new Legend(); // Legend | 
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    LegendResponse result = apiInstance.cellsChartsPostWorksheetChartLegend(name, sheetName, chartIndex, legend, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsChartsPostWorksheetChartLegend");
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
 **storage** | **String**| storage name. | [optional]

### Return type

[**LegendResponse**](LegendResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsPostWorksheetChartTitle"></a>
# **cellsChartsPostWorksheetChartTitle**
> TitleResponse cellsChartsPostWorksheetChartTitle(name, sheetName, chartIndex, title, folder, storage)

Update chart title

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartIndex = 56; // Integer | The chart index.
Title title = new Title(); // Title | Chart title
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    TitleResponse result = apiInstance.cellsChartsPostWorksheetChartTitle(name, sheetName, chartIndex, title, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsChartsPostWorksheetChartTitle");
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
 **storage** | **String**| storage name. | [optional]

### Return type

[**TitleResponse**](TitleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsPutWorksheetAddChart"></a>
# **cellsChartsPutWorksheetAddChart**
> ChartsResponse cellsChartsPutWorksheetAddChart(name, sheetName, chartType, upperLeftRow, upperLeftColumn, lowerRightRow, lowerRightColumn, area, isVertical, categoryData, isAutoGetSerialName, title, folder, storage)

Add new chart to worksheet.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
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
String storage = "storage_example"; // String | storage name.
try {
    ChartsResponse result = apiInstance.cellsChartsPutWorksheetAddChart(name, sheetName, chartType, upperLeftRow, upperLeftColumn, lowerRightRow, lowerRightColumn, area, isVertical, categoryData, isAutoGetSerialName, title, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsChartsPutWorksheetAddChart");
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
 **storage** | **String**| storage name. | [optional]

### Return type

[**ChartsResponse**](ChartsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsPutWorksheetChartLegend"></a>
# **cellsChartsPutWorksheetChartLegend**
> CellsCloudResponse cellsChartsPutWorksheetChartLegend(name, sheetName, chartIndex, folder, storage)

Show legend in chart

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartIndex = 56; // Integer | The chart index.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsChartsPutWorksheetChartLegend(name, sheetName, chartIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsChartsPutWorksheetChartLegend");
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
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsChartsPutWorksheetChartTitle"></a>
# **cellsChartsPutWorksheetChartTitle**
> TitleResponse cellsChartsPutWorksheetChartTitle(name, sheetName, chartIndex, title, folder, storage)

Add chart title / Set chart title visible

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer chartIndex = 56; // Integer | The chart index.
Title title = new Title(); // Title | Chart title.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    TitleResponse result = apiInstance.cellsChartsPutWorksheetChartTitle(name, sheetName, chartIndex, title, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsChartsPutWorksheetChartTitle");
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
 **storage** | **String**| storage name. | [optional]

### Return type

[**TitleResponse**](TitleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsConditionalFormattingsDeleteWorksheetConditionalFormatting"></a>
# **cellsConditionalFormattingsDeleteWorksheetConditionalFormatting**
> CellsCloudResponse cellsConditionalFormattingsDeleteWorksheetConditionalFormatting(name, sheetName, index, folder, storage)

Remove conditional formatting

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer index = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsConditionalFormattingsDeleteWorksheetConditionalFormatting(name, sheetName, index, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsConditionalFormattingsDeleteWorksheetConditionalFormatting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **index** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea"></a>
# **cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea**
> CellsCloudResponse cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea(name, sheetName, startRow, startColumn, totalRows, totalColumns, folder, storage)

Remove cell area from conditional formatting.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer startRow = 56; // Integer | 
Integer startColumn = 56; // Integer | 
Integer totalRows = 56; // Integer | 
Integer totalColumns = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea(name, sheetName, startRow, startColumn, totalRows, totalColumns, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **startRow** | **Integer**|  |
 **startColumn** | **Integer**|  |
 **totalRows** | **Integer**|  |
 **totalColumns** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsConditionalFormattingsDeleteWorksheetConditionalFormattings"></a>
# **cellsConditionalFormattingsDeleteWorksheetConditionalFormattings**
> CellsCloudResponse cellsConditionalFormattingsDeleteWorksheetConditionalFormattings(name, sheetName, folder, storage)

Clear all condition formattings

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsConditionalFormattingsDeleteWorksheetConditionalFormattings(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsConditionalFormattingsDeleteWorksheetConditionalFormattings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsConditionalFormattingsGetWorksheetConditionalFormatting"></a>
# **cellsConditionalFormattingsGetWorksheetConditionalFormatting**
> ConditionalFormattingResponse cellsConditionalFormattingsGetWorksheetConditionalFormatting(name, sheetName, index, folder, storage)

Get conditional formatting

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer index = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    ConditionalFormattingResponse result = apiInstance.cellsConditionalFormattingsGetWorksheetConditionalFormatting(name, sheetName, index, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsConditionalFormattingsGetWorksheetConditionalFormatting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **index** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**ConditionalFormattingResponse**](ConditionalFormattingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsConditionalFormattingsGetWorksheetConditionalFormattings"></a>
# **cellsConditionalFormattingsGetWorksheetConditionalFormattings**
> ConditionalFormattingsResponse cellsConditionalFormattingsGetWorksheetConditionalFormattings(name, sheetName, folder, storage)

Get conditional formattings 

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    ConditionalFormattingsResponse result = apiInstance.cellsConditionalFormattingsGetWorksheetConditionalFormattings(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsConditionalFormattingsGetWorksheetConditionalFormattings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**ConditionalFormattingsResponse**](ConditionalFormattingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsConditionalFormattingsPutWorksheetConditionalFormatting"></a>
# **cellsConditionalFormattingsPutWorksheetConditionalFormatting**
> CellsCloudResponse cellsConditionalFormattingsPutWorksheetConditionalFormatting(name, sheetName, cellArea, formatCondition, folder, storage)

Add a condition formatting.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String cellArea = "cellArea_example"; // String | 
FormatCondition formatCondition = new FormatCondition(); // FormatCondition | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsConditionalFormattingsPutWorksheetConditionalFormatting(name, sheetName, cellArea, formatCondition, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsConditionalFormattingsPutWorksheetConditionalFormatting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **cellArea** | **String**|  |
 **formatCondition** | [**FormatCondition**](FormatCondition.md)|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsConditionalFormattingsPutWorksheetFormatCondition"></a>
# **cellsConditionalFormattingsPutWorksheetFormatCondition**
> CellsCloudResponse cellsConditionalFormattingsPutWorksheetFormatCondition(name, sheetName, index, cellArea, type, operatorType, formula1, formula2, folder, storage)

Add a format condition.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer index = 56; // Integer | 
String cellArea = "cellArea_example"; // String | 
String type = "type_example"; // String | 
String operatorType = "operatorType_example"; // String | 
String formula1 = "formula1_example"; // String | 
String formula2 = "formula2_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsConditionalFormattingsPutWorksheetFormatCondition(name, sheetName, index, cellArea, type, operatorType, formula1, formula2, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsConditionalFormattingsPutWorksheetFormatCondition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **index** | **Integer**|  |
 **cellArea** | **String**|  |
 **type** | **String**|  |
 **operatorType** | **String**|  |
 **formula1** | **String**|  |
 **formula2** | **String**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsConditionalFormattingsPutWorksheetFormatConditionArea"></a>
# **cellsConditionalFormattingsPutWorksheetFormatConditionArea**
> CellsCloudResponse cellsConditionalFormattingsPutWorksheetFormatConditionArea(name, sheetName, index, cellArea, folder, storage)

add a cell area for format condition             

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer index = 56; // Integer | 
String cellArea = "cellArea_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsConditionalFormattingsPutWorksheetFormatConditionArea(name, sheetName, index, cellArea, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsConditionalFormattingsPutWorksheetFormatConditionArea");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **index** | **Integer**|  |
 **cellArea** | **String**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsConditionalFormattingsPutWorksheetFormatConditionCondition"></a>
# **cellsConditionalFormattingsPutWorksheetFormatConditionCondition**
> CellsCloudResponse cellsConditionalFormattingsPutWorksheetFormatConditionCondition(name, sheetName, index, type, operatorType, formula1, formula2, folder, storage)

Add a condition for format condition.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer index = 56; // Integer | 
String type = "type_example"; // String | 
String operatorType = "operatorType_example"; // String | 
String formula1 = "formula1_example"; // String | 
String formula2 = "formula2_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsConditionalFormattingsPutWorksheetFormatConditionCondition(name, sheetName, index, type, operatorType, formula1, formula2, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsConditionalFormattingsPutWorksheetFormatConditionCondition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **index** | **Integer**|  |
 **type** | **String**|  |
 **operatorType** | **String**|  |
 **formula1** | **String**|  |
 **formula2** | **String**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsDeleteWorksheetColumns"></a>
# **cellsDeleteWorksheetColumns**
> ColumnsResponse cellsDeleteWorksheetColumns(name, sheetName, columnIndex, columns, updateReference, folder, storage)

Delete worksheet columns.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer columnIndex = 56; // Integer | The column index.
Integer columns = 56; // Integer | The columns.
Boolean updateReference = true; // Boolean | The update reference.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    ColumnsResponse result = apiInstance.cellsDeleteWorksheetColumns(name, sheetName, columnIndex, columns, updateReference, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsDeleteWorksheetColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **columnIndex** | **Integer**| The column index. |
 **columns** | **Integer**| The columns. |
 **updateReference** | **Boolean**| The update reference. |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**ColumnsResponse**](ColumnsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsDeleteWorksheetRow"></a>
# **cellsDeleteWorksheetRow**
> CellsCloudResponse cellsDeleteWorksheetRow(name, sheetName, rowIndex, folder, storage)

Delete worksheet row.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet bame.
Integer rowIndex = 56; // Integer | The row index.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsDeleteWorksheetRow(name, sheetName, rowIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsDeleteWorksheetRow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet bame. |
 **rowIndex** | **Integer**| The row index. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsDeleteWorksheetRows"></a>
# **cellsDeleteWorksheetRows**
> CellsCloudResponse cellsDeleteWorksheetRows(name, sheetName, startrow, totalRows, updateReference, folder, storage)

Delete several worksheet rows.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet bame.
Integer startrow = 56; // Integer | The begin row index to be operated.
Integer totalRows = 1; // Integer | Number of rows to be operated.
Boolean updateReference = true; // Boolean | Indicates if update references in other worksheets.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsDeleteWorksheetRows(name, sheetName, startrow, totalRows, updateReference, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsDeleteWorksheetRows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet bame. |
 **startrow** | **Integer**| The begin row index to be operated. |
 **totalRows** | **Integer**| Number of rows to be operated. | [optional] [default to 1]
 **updateReference** | **Boolean**| Indicates if update references in other worksheets. | [optional] [default to true]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsGetCellHtmlString"></a>
# **cellsGetCellHtmlString**
> Object cellsGetCellHtmlString(name, sheetName, cellName, folder, storage)

Read cell data by cell&#39;s name.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String cellName = "cellName_example"; // String | The cell's  name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    Object result = apiInstance.cellsGetCellHtmlString(name, sheetName, cellName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsGetCellHtmlString");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **cellName** | **String**| The cell&#39;s  name. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsGetWorksheetCell"></a>
# **cellsGetWorksheetCell**
> Object cellsGetWorksheetCell(name, sheetName, cellOrMethodName, folder, storage)

Read cell data by cell&#39;s name.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String cellOrMethodName = "cellOrMethodName_example"; // String | The cell's or method name. (Method name like firstcell, endcell etc.)
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    Object result = apiInstance.cellsGetWorksheetCell(name, sheetName, cellOrMethodName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsGetWorksheetCell");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **cellOrMethodName** | **String**| The cell&#39;s or method name. (Method name like firstcell, endcell etc.) |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsGetWorksheetCellStyle"></a>
# **cellsGetWorksheetCellStyle**
> StyleResponse cellsGetWorksheetCellStyle(name, sheetName, cellName, folder, storage)

Read cell&#39;s style info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String cellName = "cellName_example"; // String | Cell's name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    StyleResponse result = apiInstance.cellsGetWorksheetCellStyle(name, sheetName, cellName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsGetWorksheetCellStyle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **cellName** | **String**| Cell&#39;s name. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**StyleResponse**](StyleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsGetWorksheetCells"></a>
# **cellsGetWorksheetCells**
> CellsResponse cellsGetWorksheetCells(name, sheetName, offest, count, folder, storage)

Get cells info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer offest = 0; // Integer | Begginig offset.
Integer count = 0; // Integer | Maximum amount of cells in the response.
String folder = "folder_example"; // String | Document's folder name.
String storage = "storage_example"; // String | storage name.
try {
    CellsResponse result = apiInstance.cellsGetWorksheetCells(name, sheetName, offest, count, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsGetWorksheetCells");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **offest** | **Integer**| Begginig offset. | [optional] [default to 0]
 **count** | **Integer**| Maximum amount of cells in the response. | [optional] [default to 0]
 **folder** | **String**| Document&#39;s folder name. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsResponse**](CellsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsGetWorksheetColumn"></a>
# **cellsGetWorksheetColumn**
> ColumnResponse cellsGetWorksheetColumn(name, sheetName, columnIndex, folder, storage)

Read worksheet column data by column&#39;s index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer columnIndex = 56; // Integer | The column index.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    ColumnResponse result = apiInstance.cellsGetWorksheetColumn(name, sheetName, columnIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsGetWorksheetColumn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **columnIndex** | **Integer**| The column index. |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**ColumnResponse**](ColumnResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsGetWorksheetColumns"></a>
# **cellsGetWorksheetColumns**
> ColumnsResponse cellsGetWorksheetColumns(name, sheetName, folder, storage)

Read worksheet columns info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | The workdook folder.
String storage = "storage_example"; // String | storage name.
try {
    ColumnsResponse result = apiInstance.cellsGetWorksheetColumns(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsGetWorksheetColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **folder** | **String**| The workdook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**ColumnsResponse**](ColumnsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsGetWorksheetRow"></a>
# **cellsGetWorksheetRow**
> RowResponse cellsGetWorksheetRow(name, sheetName, rowIndex, folder, storage)

Read worksheet row data by row&#39;s index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer rowIndex = 56; // Integer | The row index.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    RowResponse result = apiInstance.cellsGetWorksheetRow(name, sheetName, rowIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsGetWorksheetRow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **rowIndex** | **Integer**| The row index. |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**RowResponse**](RowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsGetWorksheetRows"></a>
# **cellsGetWorksheetRows**
> RowsResponse cellsGetWorksheetRows(name, sheetName, folder, storage)

Read worksheet rows info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | The workdook folder.
String storage = "storage_example"; // String | storage name.
try {
    RowsResponse result = apiInstance.cellsGetWorksheetRows(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsGetWorksheetRows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **folder** | **String**| The workdook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**RowsResponse**](RowsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsHypelinksDeleteWorksheetHyperlink"></a>
# **cellsHypelinksDeleteWorksheetHyperlink**
> CellsCloudResponse cellsHypelinksDeleteWorksheetHyperlink(name, sheetName, hyperlinkIndex, folder, storage)

Delete worksheet hyperlink by index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer hyperlinkIndex = 56; // Integer | The hyperlink's index.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsHypelinksDeleteWorksheetHyperlink(name, sheetName, hyperlinkIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsHypelinksDeleteWorksheetHyperlink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **hyperlinkIndex** | **Integer**| The hyperlink&#39;s index. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsHypelinksDeleteWorksheetHyperlinks"></a>
# **cellsHypelinksDeleteWorksheetHyperlinks**
> CellsCloudResponse cellsHypelinksDeleteWorksheetHyperlinks(name, sheetName, folder, storage)

Delete all hyperlinks in worksheet.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsHypelinksDeleteWorksheetHyperlinks(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsHypelinksDeleteWorksheetHyperlinks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsHypelinksGetWorksheetHyperlink"></a>
# **cellsHypelinksGetWorksheetHyperlink**
> HyperlinkResponse cellsHypelinksGetWorksheetHyperlink(name, sheetName, hyperlinkIndex, folder, storage)

Get worksheet hyperlink by index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer hyperlinkIndex = 56; // Integer | The hyperlink's index.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    HyperlinkResponse result = apiInstance.cellsHypelinksGetWorksheetHyperlink(name, sheetName, hyperlinkIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsHypelinksGetWorksheetHyperlink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **hyperlinkIndex** | **Integer**| The hyperlink&#39;s index. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**HyperlinkResponse**](HyperlinkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsHypelinksGetWorksheetHyperlinks"></a>
# **cellsHypelinksGetWorksheetHyperlinks**
> HyperlinksResponse cellsHypelinksGetWorksheetHyperlinks(name, sheetName, folder, storage)

Get worksheet hyperlinks.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    HyperlinksResponse result = apiInstance.cellsHypelinksGetWorksheetHyperlinks(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsHypelinksGetWorksheetHyperlinks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**HyperlinksResponse**](HyperlinksResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsHypelinksPostWorksheetHyperlink"></a>
# **cellsHypelinksPostWorksheetHyperlink**
> HyperlinkResponse cellsHypelinksPostWorksheetHyperlink(name, sheetName, hyperlinkIndex, hyperlink, folder, storage)

Update worksheet hyperlink by index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer hyperlinkIndex = 56; // Integer | The hyperlink's index.
Hyperlink hyperlink = new Hyperlink(); // Hyperlink | Hyperlink object
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    HyperlinkResponse result = apiInstance.cellsHypelinksPostWorksheetHyperlink(name, sheetName, hyperlinkIndex, hyperlink, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsHypelinksPostWorksheetHyperlink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **hyperlinkIndex** | **Integer**| The hyperlink&#39;s index. |
 **hyperlink** | [**Hyperlink**](Hyperlink.md)| Hyperlink object | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**HyperlinkResponse**](HyperlinkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsHypelinksPutWorksheetHyperlink"></a>
# **cellsHypelinksPutWorksheetHyperlink**
> HyperlinkResponse cellsHypelinksPutWorksheetHyperlink(name, sheetName, firstRow, firstColumn, totalRows, totalColumns, address, folder, storage)

Add worksheet hyperlink.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer firstRow = 56; // Integer | 
Integer firstColumn = 56; // Integer | 
Integer totalRows = 56; // Integer | 
Integer totalColumns = 56; // Integer | 
String address = "address_example"; // String | 
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    HyperlinkResponse result = apiInstance.cellsHypelinksPutWorksheetHyperlink(name, sheetName, firstRow, firstColumn, totalRows, totalColumns, address, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsHypelinksPutWorksheetHyperlink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **firstRow** | **Integer**|  |
 **firstColumn** | **Integer**|  |
 **totalRows** | **Integer**|  |
 **totalColumns** | **Integer**|  |
 **address** | **String**|  |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**HyperlinkResponse**](HyperlinkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsListObjectsDeleteWorksheetListObject"></a>
# **cellsListObjectsDeleteWorksheetListObject**
> CellsCloudResponse cellsListObjectsDeleteWorksheetListObject(name, sheetName, listObjectIndex, folder, storage)

Delete worksheet list object by index

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer listObjectIndex = 56; // Integer | List object index
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsListObjectsDeleteWorksheetListObject(name, sheetName, listObjectIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsListObjectsDeleteWorksheetListObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **listObjectIndex** | **Integer**| List object index |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsListObjectsDeleteWorksheetListObjects"></a>
# **cellsListObjectsDeleteWorksheetListObjects**
> CellsCloudResponse cellsListObjectsDeleteWorksheetListObjects(name, sheetName, folder, storage)

Delete worksheet list objects

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsListObjectsDeleteWorksheetListObjects(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsListObjectsDeleteWorksheetListObjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsListObjectsGetWorksheetListObject"></a>
# **cellsListObjectsGetWorksheetListObject**
> ListObjectResponse cellsListObjectsGetWorksheetListObject(name, sheetName, listobjectindex, folder, storage)

Get worksheet list object info by index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer listobjectindex = 56; // Integer | list object index.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    ListObjectResponse result = apiInstance.cellsListObjectsGetWorksheetListObject(name, sheetName, listobjectindex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsListObjectsGetWorksheetListObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **listobjectindex** | **Integer**| list object index. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**ListObjectResponse**](ListObjectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsListObjectsGetWorksheetListObjects"></a>
# **cellsListObjectsGetWorksheetListObjects**
> ListObjectsResponse cellsListObjectsGetWorksheetListObjects(name, sheetName, folder, storage)

Get worksheet listobjects info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    ListObjectsResponse result = apiInstance.cellsListObjectsGetWorksheetListObjects(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsListObjectsGetWorksheetListObjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**ListObjectsResponse**](ListObjectsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsListObjectsPostWorksheetListObject"></a>
# **cellsListObjectsPostWorksheetListObject**
> CellsCloudResponse cellsListObjectsPostWorksheetListObject(name, sheetName, listObjectIndex, listObject, folder, storage)

Update  list object 

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer listObjectIndex = 56; // Integer | list Object index
ListObject listObject = new ListObject(); // ListObject | listObject dto in request body.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsListObjectsPostWorksheetListObject(name, sheetName, listObjectIndex, listObject, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsListObjectsPostWorksheetListObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **listObjectIndex** | **Integer**| list Object index |
 **listObject** | [**ListObject**](ListObject.md)| listObject dto in request body. | [optional]
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsListObjectsPostWorksheetListObjectConvertToRange"></a>
# **cellsListObjectsPostWorksheetListObjectConvertToRange**
> CellsCloudResponse cellsListObjectsPostWorksheetListObjectConvertToRange(name, sheetName, listObjectIndex, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer listObjectIndex = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsListObjectsPostWorksheetListObjectConvertToRange(name, sheetName, listObjectIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsListObjectsPostWorksheetListObjectConvertToRange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **listObjectIndex** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsListObjectsPostWorksheetListObjectSortTable"></a>
# **cellsListObjectsPostWorksheetListObjectSortTable**
> CellsCloudResponse cellsListObjectsPostWorksheetListObjectSortTable(name, sheetName, listObjectIndex, dataSorter, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer listObjectIndex = 56; // Integer | 
DataSorter dataSorter = new DataSorter(); // DataSorter | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsListObjectsPostWorksheetListObjectSortTable(name, sheetName, listObjectIndex, dataSorter, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsListObjectsPostWorksheetListObjectSortTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **listObjectIndex** | **Integer**|  |
 **dataSorter** | [**DataSorter**](DataSorter.md)|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsListObjectsPostWorksheetListObjectSummarizeWithPivotTable"></a>
# **cellsListObjectsPostWorksheetListObjectSummarizeWithPivotTable**
> CellsCloudResponse cellsListObjectsPostWorksheetListObjectSummarizeWithPivotTable(name, sheetName, listObjectIndex, destsheetName, request, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer listObjectIndex = 56; // Integer | 
String destsheetName = "destsheetName_example"; // String | 
CreatePivotTableRequest request = new CreatePivotTableRequest(); // CreatePivotTableRequest | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsListObjectsPostWorksheetListObjectSummarizeWithPivotTable(name, sheetName, listObjectIndex, destsheetName, request, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsListObjectsPostWorksheetListObjectSummarizeWithPivotTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **listObjectIndex** | **Integer**|  |
 **destsheetName** | **String**|  |
 **request** | [**CreatePivotTableRequest**](CreatePivotTableRequest.md)|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsListObjectsPutWorksheetListObject"></a>
# **cellsListObjectsPutWorksheetListObject**
> ListObjectResponse cellsListObjectsPutWorksheetListObject(name, sheetName, startRow, startColumn, endRow, endColumn, hasHeaders, listObject, folder, storage)

Add a list object into worksheet.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer startRow = 56; // Integer | The start row of the list range.
Integer startColumn = 56; // Integer | The start row of the list range.
Integer endRow = 56; // Integer | The start row of the list range.
Integer endColumn = 56; // Integer | The start row of the list range.
Boolean hasHeaders = true; // Boolean | Whether the range has headers.
ListObject listObject = new ListObject(); // ListObject | List Object
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    ListObjectResponse result = apiInstance.cellsListObjectsPutWorksheetListObject(name, sheetName, startRow, startColumn, endRow, endColumn, hasHeaders, listObject, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsListObjectsPutWorksheetListObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **startRow** | **Integer**| The start row of the list range. |
 **startColumn** | **Integer**| The start row of the list range. |
 **endRow** | **Integer**| The start row of the list range. |
 **endColumn** | **Integer**| The start row of the list range. |
 **hasHeaders** | **Boolean**| Whether the range has headers. | [optional] [default to true]
 **listObject** | [**ListObject**](ListObject.md)| List Object | [optional]
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**ListObjectResponse**](ListObjectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsOleObjectsDeleteWorksheetOleObject"></a>
# **cellsOleObjectsDeleteWorksheetOleObject**
> CellsCloudResponse cellsOleObjectsDeleteWorksheetOleObject(name, sheetName, oleObjectIndex, folder, storage)

Delete OLE object.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worsheet name.
Integer oleObjectIndex = 56; // Integer | Ole object index
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsOleObjectsDeleteWorksheetOleObject(name, sheetName, oleObjectIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsOleObjectsDeleteWorksheetOleObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worsheet name. |
 **oleObjectIndex** | **Integer**| Ole object index |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsOleObjectsDeleteWorksheetOleObjects"></a>
# **cellsOleObjectsDeleteWorksheetOleObjects**
> CellsCloudResponse cellsOleObjectsDeleteWorksheetOleObjects(name, sheetName, folder, storage)

Delete all OLE objects.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worsheet name.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsOleObjectsDeleteWorksheetOleObjects(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsOleObjectsDeleteWorksheetOleObjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worsheet name. |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsOleObjectsGetWorksheetOleObject"></a>
# **cellsOleObjectsGetWorksheetOleObject**
> File cellsOleObjectsGetWorksheetOleObject(name, sheetName, objectNumber, format, folder, storage)

Get OLE object info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer objectNumber = 56; // Integer | The object number.
String format = "format_example"; // String | The exported object format.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    File result = apiInstance.cellsOleObjectsGetWorksheetOleObject(name, sheetName, objectNumber, format, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsOleObjectsGetWorksheetOleObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **objectNumber** | **Integer**| The object number. |
 **format** | **String**| The exported object format. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsOleObjectsGetWorksheetOleObjects"></a>
# **cellsOleObjectsGetWorksheetOleObjects**
> OleObjectsResponse cellsOleObjectsGetWorksheetOleObjects(name, sheetName, folder, storage)

Get worksheet OLE objects info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    OleObjectsResponse result = apiInstance.cellsOleObjectsGetWorksheetOleObjects(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsOleObjectsGetWorksheetOleObjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**OleObjectsResponse**](OleObjectsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsOleObjectsPostUpdateWorksheetOleObject"></a>
# **cellsOleObjectsPostUpdateWorksheetOleObject**
> CellsCloudResponse cellsOleObjectsPostUpdateWorksheetOleObject(name, sheetName, oleObjectIndex, ole, folder, storage)

Update OLE object.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worsheet name.
Integer oleObjectIndex = 56; // Integer | Ole object index
OleObject ole = new OleObject(); // OleObject | Ole Object
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsOleObjectsPostUpdateWorksheetOleObject(name, sheetName, oleObjectIndex, ole, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsOleObjectsPostUpdateWorksheetOleObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worsheet name. |
 **oleObjectIndex** | **Integer**| Ole object index |
 **ole** | [**OleObject**](OleObject.md)| Ole Object | [optional]
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsOleObjectsPutWorksheetOleObject"></a>
# **cellsOleObjectsPutWorksheetOleObject**
> OleObjectResponse cellsOleObjectsPutWorksheetOleObject(name, sheetName, oleObject, upperLeftRow, upperLeftColumn, height, width, oleFile, imageFile, folder, storage)

Add OLE object

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worsheet name.
OleObject oleObject = new OleObject(); // OleObject | Ole Object
Integer upperLeftRow = 0; // Integer | Upper left row index
Integer upperLeftColumn = 0; // Integer | Upper left column index
Integer height = 0; // Integer | Height of oleObject, in unit of pixel
Integer width = 0; // Integer | Width of oleObject, in unit of pixel
String oleFile = "oleFile_example"; // String | OLE filename
String imageFile = "imageFile_example"; // String | Image filename
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    OleObjectResponse result = apiInstance.cellsOleObjectsPutWorksheetOleObject(name, sheetName, oleObject, upperLeftRow, upperLeftColumn, height, width, oleFile, imageFile, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsOleObjectsPutWorksheetOleObject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worsheet name. |
 **oleObject** | [**OleObject**](OleObject.md)| Ole Object | [optional]
 **upperLeftRow** | **Integer**| Upper left row index | [optional] [default to 0]
 **upperLeftColumn** | **Integer**| Upper left column index | [optional] [default to 0]
 **height** | **Integer**| Height of oleObject, in unit of pixel | [optional] [default to 0]
 **width** | **Integer**| Width of oleObject, in unit of pixel | [optional] [default to 0]
 **oleFile** | **String**| OLE filename | [optional]
 **imageFile** | **String**| Image filename | [optional]
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**OleObjectResponse**](OleObjectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageBreaksDeleteHorizontalPageBreak"></a>
# **cellsPageBreaksDeleteHorizontalPageBreak**
> CellsCloudResponse cellsPageBreaksDeleteHorizontalPageBreak(name, sheetName, index, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer index = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPageBreaksDeleteHorizontalPageBreak(name, sheetName, index, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPageBreaksDeleteHorizontalPageBreak");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **index** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageBreaksDeleteHorizontalPageBreaks"></a>
# **cellsPageBreaksDeleteHorizontalPageBreaks**
> CellsCloudResponse cellsPageBreaksDeleteHorizontalPageBreaks(name, sheetName, row, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer row = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPageBreaksDeleteHorizontalPageBreaks(name, sheetName, row, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPageBreaksDeleteHorizontalPageBreaks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **row** | **Integer**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageBreaksDeleteVerticalPageBreak"></a>
# **cellsPageBreaksDeleteVerticalPageBreak**
> CellsCloudResponse cellsPageBreaksDeleteVerticalPageBreak(name, sheetName, index, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer index = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPageBreaksDeleteVerticalPageBreak(name, sheetName, index, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPageBreaksDeleteVerticalPageBreak");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **index** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageBreaksDeleteVerticalPageBreaks"></a>
# **cellsPageBreaksDeleteVerticalPageBreaks**
> CellsCloudResponse cellsPageBreaksDeleteVerticalPageBreaks(name, sheetName, column, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer column = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPageBreaksDeleteVerticalPageBreaks(name, sheetName, column, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPageBreaksDeleteVerticalPageBreaks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **column** | **Integer**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageBreaksGetHorizontalPageBreak"></a>
# **cellsPageBreaksGetHorizontalPageBreak**
> HorizontalPageBreakResponse cellsPageBreaksGetHorizontalPageBreak(name, sheetName, index, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer index = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    HorizontalPageBreakResponse result = apiInstance.cellsPageBreaksGetHorizontalPageBreak(name, sheetName, index, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPageBreaksGetHorizontalPageBreak");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **index** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**HorizontalPageBreakResponse**](HorizontalPageBreakResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageBreaksGetHorizontalPageBreaks"></a>
# **cellsPageBreaksGetHorizontalPageBreaks**
> HorizontalPageBreaksResponse cellsPageBreaksGetHorizontalPageBreaks(name, sheetName, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    HorizontalPageBreaksResponse result = apiInstance.cellsPageBreaksGetHorizontalPageBreaks(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPageBreaksGetHorizontalPageBreaks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**HorizontalPageBreaksResponse**](HorizontalPageBreaksResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageBreaksGetVerticalPageBreak"></a>
# **cellsPageBreaksGetVerticalPageBreak**
> VerticalPageBreakResponse cellsPageBreaksGetVerticalPageBreak(name, sheetName, index, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer index = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    VerticalPageBreakResponse result = apiInstance.cellsPageBreaksGetVerticalPageBreak(name, sheetName, index, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPageBreaksGetVerticalPageBreak");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **index** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**VerticalPageBreakResponse**](VerticalPageBreakResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageBreaksGetVerticalPageBreaks"></a>
# **cellsPageBreaksGetVerticalPageBreaks**
> VerticalPageBreaksResponse cellsPageBreaksGetVerticalPageBreaks(name, sheetName, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    VerticalPageBreaksResponse result = apiInstance.cellsPageBreaksGetVerticalPageBreaks(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPageBreaksGetVerticalPageBreaks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**VerticalPageBreaksResponse**](VerticalPageBreaksResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageBreaksPutHorizontalPageBreak"></a>
# **cellsPageBreaksPutHorizontalPageBreak**
> CellsCloudResponse cellsPageBreaksPutHorizontalPageBreak(name, sheetName, cellname, row, column, startColumn, endColumn, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String cellname = "cellname_example"; // String | 
Integer row = 56; // Integer | 
Integer column = 56; // Integer | 
Integer startColumn = 56; // Integer | 
Integer endColumn = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPageBreaksPutHorizontalPageBreak(name, sheetName, cellname, row, column, startColumn, endColumn, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPageBreaksPutHorizontalPageBreak");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **cellname** | **String**|  | [optional]
 **row** | **Integer**|  | [optional]
 **column** | **Integer**|  | [optional]
 **startColumn** | **Integer**|  | [optional]
 **endColumn** | **Integer**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageBreaksPutVerticalPageBreak"></a>
# **cellsPageBreaksPutVerticalPageBreak**
> CellsCloudResponse cellsPageBreaksPutVerticalPageBreak(name, sheetName, cellname, column, row, startRow, endRow, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String cellname = "cellname_example"; // String | 
Integer column = 56; // Integer | 
Integer row = 56; // Integer | 
Integer startRow = 56; // Integer | 
Integer endRow = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPageBreaksPutVerticalPageBreak(name, sheetName, cellname, column, row, startRow, endRow, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPageBreaksPutVerticalPageBreak");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **cellname** | **String**|  | [optional]
 **column** | **Integer**|  | [optional]
 **row** | **Integer**|  | [optional]
 **startRow** | **Integer**|  | [optional]
 **endRow** | **Integer**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageSetupDeleteHeaderFooter"></a>
# **cellsPageSetupDeleteHeaderFooter**
> CellsCloudResponse cellsPageSetupDeleteHeaderFooter(name, sheetName, folder, storage)

clear header footer

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPageSetupDeleteHeaderFooter(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPageSetupDeleteHeaderFooter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageSetupGetFooter"></a>
# **cellsPageSetupGetFooter**
> PageSectionsResponse cellsPageSetupGetFooter(name, sheetName, folder, storage)

get page footer information

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    PageSectionsResponse result = apiInstance.cellsPageSetupGetFooter(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPageSetupGetFooter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**PageSectionsResponse**](PageSectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageSetupGetHeader"></a>
# **cellsPageSetupGetHeader**
> PageSectionsResponse cellsPageSetupGetHeader(name, sheetName, folder, storage)

get page header information

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    PageSectionsResponse result = apiInstance.cellsPageSetupGetHeader(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPageSetupGetHeader");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**PageSectionsResponse**](PageSectionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageSetupGetPageSetup"></a>
# **cellsPageSetupGetPageSetup**
> PageSetupResponse cellsPageSetupGetPageSetup(name, sheetName, folder, storage)

Get Page Setup information.             

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    PageSetupResponse result = apiInstance.cellsPageSetupGetPageSetup(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPageSetupGetPageSetup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**PageSetupResponse**](PageSetupResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageSetupPostFooter"></a>
# **cellsPageSetupPostFooter**
> CellsCloudResponse cellsPageSetupPostFooter(name, sheetName, section, script, isFirstPage, folder, storage)

update  page footer information 

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer section = 56; // Integer | 
String script = "script_example"; // String | 
Boolean isFirstPage = true; // Boolean | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPageSetupPostFooter(name, sheetName, section, script, isFirstPage, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPageSetupPostFooter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **section** | **Integer**|  |
 **script** | **String**|  |
 **isFirstPage** | **Boolean**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageSetupPostHeader"></a>
# **cellsPageSetupPostHeader**
> CellsCloudResponse cellsPageSetupPostHeader(name, sheetName, section, script, isFirstPage, folder, storage)

update  page header information 

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer section = 56; // Integer | 
String script = "script_example"; // String | 
Boolean isFirstPage = true; // Boolean | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPageSetupPostHeader(name, sheetName, section, script, isFirstPage, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPageSetupPostHeader");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **section** | **Integer**|  |
 **script** | **String**|  |
 **isFirstPage** | **Boolean**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPageSetupPostPageSetup"></a>
# **cellsPageSetupPostPageSetup**
> CellsCloudResponse cellsPageSetupPostPageSetup(name, sheetName, pageSetup, folder, storage)

Update Page Setup information.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
PageSetup pageSetup = new PageSetup(); // PageSetup | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPageSetupPostPageSetup(name, sheetName, pageSetup, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPageSetupPostPageSetup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **pageSetup** | [**PageSetup**](PageSetup.md)|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPicturesDeleteWorksheetPicture"></a>
# **cellsPicturesDeleteWorksheetPicture**
> CellsCloudResponse cellsPicturesDeleteWorksheetPicture(name, sheetName, pictureIndex, folder, storage)

Delete a picture object in worksheet

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worsheet name.
Integer pictureIndex = 56; // Integer | Picture index
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPicturesDeleteWorksheetPicture(name, sheetName, pictureIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPicturesDeleteWorksheetPicture");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worsheet name. |
 **pictureIndex** | **Integer**| Picture index |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPicturesDeleteWorksheetPictures"></a>
# **cellsPicturesDeleteWorksheetPictures**
> CellsCloudResponse cellsPicturesDeleteWorksheetPictures(name, sheetName, folder, storage)

Delete all pictures in worksheet.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPicturesDeleteWorksheetPictures(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPicturesDeleteWorksheetPictures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPicturesGetWorksheetPicture"></a>
# **cellsPicturesGetWorksheetPicture**
> File cellsPicturesGetWorksheetPicture(name, sheetName, pictureIndex, format, folder, storage)

GRead worksheet picture by number.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer pictureIndex = 56; // Integer | The picture index.
String format = "format_example"; // String | The exported object format.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    File result = apiInstance.cellsPicturesGetWorksheetPicture(name, sheetName, pictureIndex, format, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPicturesGetWorksheetPicture");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **pictureIndex** | **Integer**| The picture index. |
 **format** | **String**| The exported object format. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPicturesGetWorksheetPictures"></a>
# **cellsPicturesGetWorksheetPictures**
> PicturesResponse cellsPicturesGetWorksheetPictures(name, sheetName, folder, storage)

Read worksheet pictures.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    PicturesResponse result = apiInstance.cellsPicturesGetWorksheetPictures(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPicturesGetWorksheetPictures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**PicturesResponse**](PicturesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPicturesPostWorksheetPicture"></a>
# **cellsPicturesPostWorksheetPicture**
> PictureResponse cellsPicturesPostWorksheetPicture(name, sheetName, pictureIndex, picture, folder, storage)

Update worksheet picture by index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer pictureIndex = 56; // Integer | The picture's index.
Picture picture = new Picture(); // Picture | Picture object
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    PictureResponse result = apiInstance.cellsPicturesPostWorksheetPicture(name, sheetName, pictureIndex, picture, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPicturesPostWorksheetPicture");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **pictureIndex** | **Integer**| The picture&#39;s index. |
 **picture** | [**Picture**](Picture.md)| Picture object | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**PictureResponse**](PictureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPicturesPutWorksheetAddPicture"></a>
# **cellsPicturesPutWorksheetAddPicture**
> PicturesResponse cellsPicturesPutWorksheetAddPicture(name, sheetName, picture, upperLeftRow, upperLeftColumn, lowerRightRow, lowerRightColumn, picturePath, folder, storage)

Add a new worksheet picture.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worsheet name.
Picture picture = new Picture(); // Picture | Pictute object
Integer upperLeftRow = 0; // Integer | The image upper left row.
Integer upperLeftColumn = 0; // Integer | The image upper left column.
Integer lowerRightRow = 0; // Integer | The image low right row.
Integer lowerRightColumn = 0; // Integer | The image low right column.
String picturePath = "picturePath_example"; // String | The picture path, if not provided the picture data is inspected in the request body.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    PicturesResponse result = apiInstance.cellsPicturesPutWorksheetAddPicture(name, sheetName, picture, upperLeftRow, upperLeftColumn, lowerRightRow, lowerRightColumn, picturePath, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPicturesPutWorksheetAddPicture");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worsheet name. |
 **picture** | [**Picture**](Picture.md)| Pictute object | [optional]
 **upperLeftRow** | **Integer**| The image upper left row. | [optional] [default to 0]
 **upperLeftColumn** | **Integer**| The image upper left column. | [optional] [default to 0]
 **lowerRightRow** | **Integer**| The image low right row. | [optional] [default to 0]
 **lowerRightColumn** | **Integer**| The image low right column. | [optional] [default to 0]
 **picturePath** | **String**| The picture path, if not provided the picture data is inspected in the request body. | [optional]
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**PicturesResponse**](PicturesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesDeletePivotTableField"></a>
# **cellsPivotTablesDeletePivotTableField**
> CellsCloudResponse cellsPivotTablesDeletePivotTableField(name, sheetName, pivotTableIndex, pivotFieldType, request, folder, storage)

Delete pivot field into into pivot table

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer pivotTableIndex = 56; // Integer | Pivot table index
String pivotFieldType = "pivotFieldType_example"; // String | The fields area type.
PivotTableFieldRequest request = new PivotTableFieldRequest(); // PivotTableFieldRequest | Dto that conrains field indexes
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPivotTablesDeletePivotTableField(name, sheetName, pivotTableIndex, pivotFieldType, request, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPivotTablesDeletePivotTableField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **pivotTableIndex** | **Integer**| Pivot table index |
 **pivotFieldType** | **String**| The fields area type. |
 **request** | [**PivotTableFieldRequest**](PivotTableFieldRequest.md)| Dto that conrains field indexes | [optional]
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesDeleteWorksheetPivotTable"></a>
# **cellsPivotTablesDeleteWorksheetPivotTable**
> CellsCloudResponse cellsPivotTablesDeleteWorksheetPivotTable(name, sheetName, pivotTableIndex, folder, storage)

Delete worksheet pivot table by index

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer pivotTableIndex = 56; // Integer | Pivot table index
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPivotTablesDeleteWorksheetPivotTable(name, sheetName, pivotTableIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPivotTablesDeleteWorksheetPivotTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **pivotTableIndex** | **Integer**| Pivot table index |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesDeleteWorksheetPivotTableFilter"></a>
# **cellsPivotTablesDeleteWorksheetPivotTableFilter**
> CellsCloudResponse cellsPivotTablesDeleteWorksheetPivotTableFilter(name, sheetName, pivotTableIndex, fieldIndex, needReCalculate, folder, storage)

delete  pivot filter for piovt table             

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer pivotTableIndex = 56; // Integer | 
Integer fieldIndex = 56; // Integer | 
Boolean needReCalculate = false; // Boolean | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPivotTablesDeleteWorksheetPivotTableFilter(name, sheetName, pivotTableIndex, fieldIndex, needReCalculate, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPivotTablesDeleteWorksheetPivotTableFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **pivotTableIndex** | **Integer**|  |
 **fieldIndex** | **Integer**|  |
 **needReCalculate** | **Boolean**|  | [optional] [default to false]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesDeleteWorksheetPivotTableFilters"></a>
# **cellsPivotTablesDeleteWorksheetPivotTableFilters**
> CellsCloudResponse cellsPivotTablesDeleteWorksheetPivotTableFilters(name, sheetName, pivotTableIndex, needReCalculate, folder, storage)

delete all pivot filters for piovt table

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer pivotTableIndex = 56; // Integer | 
Boolean needReCalculate = false; // Boolean | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPivotTablesDeleteWorksheetPivotTableFilters(name, sheetName, pivotTableIndex, needReCalculate, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPivotTablesDeleteWorksheetPivotTableFilters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **pivotTableIndex** | **Integer**|  |
 **needReCalculate** | **Boolean**|  | [optional] [default to false]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesDeleteWorksheetPivotTables"></a>
# **cellsPivotTablesDeleteWorksheetPivotTables**
> CellsCloudResponse cellsPivotTablesDeleteWorksheetPivotTables(name, sheetName, folder, storage)

Delete worksheet pivot tables

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPivotTablesDeleteWorksheetPivotTables(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPivotTablesDeleteWorksheetPivotTables");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesGetPivotTableField"></a>
# **cellsPivotTablesGetPivotTableField**
> PivotFieldResponse cellsPivotTablesGetPivotTableField(name, sheetName, pivotTableIndex, pivotFieldIndex, pivotFieldType, folder, storage)

Get pivot field into into pivot table

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer pivotTableIndex = 56; // Integer | Pivot table index
Integer pivotFieldIndex = 56; // Integer | The field index in the base fields.
String pivotFieldType = "pivotFieldType_example"; // String | The fields area type.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    PivotFieldResponse result = apiInstance.cellsPivotTablesGetPivotTableField(name, sheetName, pivotTableIndex, pivotFieldIndex, pivotFieldType, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPivotTablesGetPivotTableField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **pivotTableIndex** | **Integer**| Pivot table index |
 **pivotFieldIndex** | **Integer**| The field index in the base fields. |
 **pivotFieldType** | **String**| The fields area type. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**PivotFieldResponse**](PivotFieldResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesGetWorksheetPivotTable"></a>
# **cellsPivotTablesGetWorksheetPivotTable**
> PivotTableResponse cellsPivotTablesGetWorksheetPivotTable(name, sheetName, pivottableIndex, folder, storage)

Get worksheet pivottable info by index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer pivottableIndex = 56; // Integer | 
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    PivotTableResponse result = apiInstance.cellsPivotTablesGetWorksheetPivotTable(name, sheetName, pivottableIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPivotTablesGetWorksheetPivotTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **pivottableIndex** | **Integer**|  |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**PivotTableResponse**](PivotTableResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesGetWorksheetPivotTableFilter"></a>
# **cellsPivotTablesGetWorksheetPivotTableFilter**
> PivotFilterResponse cellsPivotTablesGetWorksheetPivotTableFilter(name, sheetName, pivotTableIndex, filterIndex, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer pivotTableIndex = 56; // Integer | 
Integer filterIndex = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    PivotFilterResponse result = apiInstance.cellsPivotTablesGetWorksheetPivotTableFilter(name, sheetName, pivotTableIndex, filterIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPivotTablesGetWorksheetPivotTableFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **pivotTableIndex** | **Integer**|  |
 **filterIndex** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**PivotFilterResponse**](PivotFilterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesGetWorksheetPivotTableFilters"></a>
# **cellsPivotTablesGetWorksheetPivotTableFilters**
> PivotFiltersResponse cellsPivotTablesGetWorksheetPivotTableFilters(name, sheetName, pivotTableIndex, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer pivotTableIndex = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    PivotFiltersResponse result = apiInstance.cellsPivotTablesGetWorksheetPivotTableFilters(name, sheetName, pivotTableIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPivotTablesGetWorksheetPivotTableFilters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **pivotTableIndex** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**PivotFiltersResponse**](PivotFiltersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesGetWorksheetPivotTables"></a>
# **cellsPivotTablesGetWorksheetPivotTables**
> PivotTablesResponse cellsPivotTablesGetWorksheetPivotTables(name, sheetName, folder, storage)

Get worksheet pivottables info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    PivotTablesResponse result = apiInstance.cellsPivotTablesGetWorksheetPivotTables(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPivotTablesGetWorksheetPivotTables");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**PivotTablesResponse**](PivotTablesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesPostPivotTableCellStyle"></a>
# **cellsPivotTablesPostPivotTableCellStyle**
> CellsCloudResponse cellsPivotTablesPostPivotTableCellStyle(name, sheetName, pivotTableIndex, column, row, style, needReCalculate, folder, storage)

Update cell style for pivot table

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer pivotTableIndex = 56; // Integer | Pivot table index
Integer column = 56; // Integer | 
Integer row = 56; // Integer | 
Style style = new Style(); // Style | Style dto in request body.
Boolean needReCalculate = false; // Boolean | 
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPivotTablesPostPivotTableCellStyle(name, sheetName, pivotTableIndex, column, row, style, needReCalculate, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPivotTablesPostPivotTableCellStyle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **pivotTableIndex** | **Integer**| Pivot table index |
 **column** | **Integer**|  |
 **row** | **Integer**|  |
 **style** | [**Style**](Style.md)| Style dto in request body. | [optional]
 **needReCalculate** | **Boolean**|  | [optional] [default to false]
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesPostPivotTableFieldHideItem"></a>
# **cellsPivotTablesPostPivotTableFieldHideItem**
> CellsCloudResponse cellsPivotTablesPostPivotTableFieldHideItem(name, sheetName, pivotTableIndex, pivotFieldType, fieldIndex, itemIndex, isHide, needReCalculate, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer pivotTableIndex = 56; // Integer | 
String pivotFieldType = "pivotFieldType_example"; // String | 
Integer fieldIndex = 56; // Integer | 
Integer itemIndex = 56; // Integer | 
Boolean isHide = true; // Boolean | 
Boolean needReCalculate = false; // Boolean | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPivotTablesPostPivotTableFieldHideItem(name, sheetName, pivotTableIndex, pivotFieldType, fieldIndex, itemIndex, isHide, needReCalculate, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPivotTablesPostPivotTableFieldHideItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **pivotTableIndex** | **Integer**|  |
 **pivotFieldType** | **String**|  |
 **fieldIndex** | **Integer**|  |
 **itemIndex** | **Integer**|  |
 **isHide** | **Boolean**|  |
 **needReCalculate** | **Boolean**|  | [optional] [default to false]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesPostPivotTableFieldMoveTo"></a>
# **cellsPivotTablesPostPivotTableFieldMoveTo**
> CellsCloudResponse cellsPivotTablesPostPivotTableFieldMoveTo(name, sheetName, pivotTableIndex, fieldIndex, from, to, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer pivotTableIndex = 56; // Integer | 
Integer fieldIndex = 56; // Integer | 
String from = "from_example"; // String | 
String to = "to_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPivotTablesPostPivotTableFieldMoveTo(name, sheetName, pivotTableIndex, fieldIndex, from, to, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPivotTablesPostPivotTableFieldMoveTo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **pivotTableIndex** | **Integer**|  |
 **fieldIndex** | **Integer**|  |
 **from** | **String**|  |
 **to** | **String**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesPostPivotTableStyle"></a>
# **cellsPivotTablesPostPivotTableStyle**
> CellsCloudResponse cellsPivotTablesPostPivotTableStyle(name, sheetName, pivotTableIndex, style, needReCalculate, folder, storage)

Update style for pivot table

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer pivotTableIndex = 56; // Integer | Pivot table index
Style style = new Style(); // Style | Style dto in request body.
Boolean needReCalculate = false; // Boolean | 
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPivotTablesPostPivotTableStyle(name, sheetName, pivotTableIndex, style, needReCalculate, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPivotTablesPostPivotTableStyle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **pivotTableIndex** | **Integer**| Pivot table index |
 **style** | [**Style**](Style.md)| Style dto in request body. | [optional]
 **needReCalculate** | **Boolean**|  | [optional] [default to false]
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesPostWorksheetPivotTableCalculate"></a>
# **cellsPivotTablesPostWorksheetPivotTableCalculate**
> CellsCloudResponse cellsPivotTablesPostWorksheetPivotTableCalculate(name, sheetName, pivotTableIndex, folder, storage)

Calculates pivottable&#39;s data to cells.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer pivotTableIndex = 56; // Integer | Pivot table index
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPivotTablesPostWorksheetPivotTableCalculate(name, sheetName, pivotTableIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPivotTablesPostWorksheetPivotTableCalculate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **pivotTableIndex** | **Integer**| Pivot table index |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesPostWorksheetPivotTableMove"></a>
# **cellsPivotTablesPostWorksheetPivotTableMove**
> CellsCloudResponse cellsPivotTablesPostWorksheetPivotTableMove(name, sheetName, pivotTableIndex, row, column, destCellName, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer pivotTableIndex = 56; // Integer | 
Integer row = 56; // Integer | 
Integer column = 56; // Integer | 
String destCellName = "destCellName_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPivotTablesPostWorksheetPivotTableMove(name, sheetName, pivotTableIndex, row, column, destCellName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPivotTablesPostWorksheetPivotTableMove");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **pivotTableIndex** | **Integer**|  |
 **row** | **Integer**|  | [optional]
 **column** | **Integer**|  | [optional]
 **destCellName** | **String**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesPutPivotTableField"></a>
# **cellsPivotTablesPutPivotTableField**
> CellsCloudResponse cellsPivotTablesPutPivotTableField(name, sheetName, pivotTableIndex, pivotFieldType, request, needReCalculate, folder, storage)

Add pivot field into into pivot table

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer pivotTableIndex = 56; // Integer | Pivot table index
String pivotFieldType = "pivotFieldType_example"; // String | The fields area type.
PivotTableFieldRequest request = new PivotTableFieldRequest(); // PivotTableFieldRequest | Dto that conrains field indexes
Boolean needReCalculate = false; // Boolean | 
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPivotTablesPutPivotTableField(name, sheetName, pivotTableIndex, pivotFieldType, request, needReCalculate, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPivotTablesPutPivotTableField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **pivotTableIndex** | **Integer**| Pivot table index |
 **pivotFieldType** | **String**| The fields area type. |
 **request** | [**PivotTableFieldRequest**](PivotTableFieldRequest.md)| Dto that conrains field indexes | [optional]
 **needReCalculate** | **Boolean**|  | [optional] [default to false]
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesPutWorksheetPivotTable"></a>
# **cellsPivotTablesPutWorksheetPivotTable**
> PivotTableResponse cellsPivotTablesPutWorksheetPivotTable(name, sheetName, request, folder, storage, sourceData, destCellName, tableName, useSameSource)

Add a pivot table into worksheet.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
CreatePivotTableRequest request = new CreatePivotTableRequest(); // CreatePivotTableRequest | CreatePivotTableRequest dto in request body.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
String sourceData = "sourceData_example"; // String | The data for the new PivotTable cache.
String destCellName = "destCellName_example"; // String | The cell in the upper-left corner of the PivotTable report's destination range.
String tableName = "tableName_example"; // String | The name of the new PivotTable report.
Boolean useSameSource = true; // Boolean | Indicates whether using same data source when another existing pivot table has used this data source. If the property is true, it will save memory.
try {
    PivotTableResponse result = apiInstance.cellsPivotTablesPutWorksheetPivotTable(name, sheetName, request, folder, storage, sourceData, destCellName, tableName, useSameSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPivotTablesPutWorksheetPivotTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **request** | [**CreatePivotTableRequest**](CreatePivotTableRequest.md)| CreatePivotTableRequest dto in request body. | [optional]
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]
 **sourceData** | **String**| The data for the new PivotTable cache. | [optional]
 **destCellName** | **String**| The cell in the upper-left corner of the PivotTable report&#39;s destination range. | [optional]
 **tableName** | **String**| The name of the new PivotTable report. | [optional]
 **useSameSource** | **Boolean**| Indicates whether using same data source when another existing pivot table has used this data source. If the property is true, it will save memory. | [optional]

### Return type

[**PivotTableResponse**](PivotTableResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPivotTablesPutWorksheetPivotTableFilter"></a>
# **cellsPivotTablesPutWorksheetPivotTableFilter**
> CellsCloudResponse cellsPivotTablesPutWorksheetPivotTableFilter(name, sheetName, pivotTableIndex, filter, needReCalculate, folder, storage)

Add pivot filter for piovt table index

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer pivotTableIndex = 56; // Integer | 
PivotFilter filter = new PivotFilter(); // PivotFilter | 
Boolean needReCalculate = false; // Boolean | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPivotTablesPutWorksheetPivotTableFilter(name, sheetName, pivotTableIndex, filter, needReCalculate, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPivotTablesPutWorksheetPivotTableFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **pivotTableIndex** | **Integer**|  |
 **filter** | [**PivotFilter**](PivotFilter.md)|  | [optional]
 **needReCalculate** | **Boolean**|  | [optional] [default to false]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostCellCalculate"></a>
# **cellsPostCellCalculate**
> CellsCloudResponse cellsPostCellCalculate(name, sheetName, cellName, options, folder, storage)

Cell calculate formula

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String cellName = "cellName_example"; // String | 
CalculationOptions options = new CalculationOptions(); // CalculationOptions | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPostCellCalculate(name, sheetName, cellName, options, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostCellCalculate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **cellName** | **String**|  |
 **options** | [**CalculationOptions**](CalculationOptions.md)|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostCellCharacters"></a>
# **cellsPostCellCharacters**
> CellsCloudResponse cellsPostCellCharacters(name, sheetName, cellName, options, folder, storage)

Set cell characters 

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String cellName = "cellName_example"; // String | 
List<FontSetting> options = Arrays.asList(new FontSetting()); // List<FontSetting> | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPostCellCharacters(name, sheetName, cellName, options, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostCellCharacters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **cellName** | **String**|  |
 **options** | [**List&lt;FontSetting&gt;**](FontSetting.md)|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostClearContents"></a>
# **cellsPostClearContents**
> CellsCloudResponse cellsPostClearContents(name, sheetName, range, startRow, startColumn, endRow, endColumn, folder, storage)

Clear cells contents.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String range = "range_example"; // String | The range.
Integer startRow = 56; // Integer | The start row.
Integer startColumn = 56; // Integer | The start column.
Integer endRow = 56; // Integer | The end row.
Integer endColumn = 56; // Integer | The end column.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPostClearContents(name, sheetName, range, startRow, startColumn, endRow, endColumn, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostClearContents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **range** | **String**| The range. | [optional]
 **startRow** | **Integer**| The start row. | [optional]
 **startColumn** | **Integer**| The start column. | [optional]
 **endRow** | **Integer**| The end row. | [optional]
 **endColumn** | **Integer**| The end column. | [optional]
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostClearFormats"></a>
# **cellsPostClearFormats**
> CellsCloudResponse cellsPostClearFormats(name, sheetName, range, startRow, startColumn, endRow, endColumn, folder, storage)

Clear cells contents.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String range = "range_example"; // String | The range.
Integer startRow = 56; // Integer | The start row.
Integer startColumn = 56; // Integer | The start column.
Integer endRow = 56; // Integer | The end row.
Integer endColumn = 56; // Integer | The end column.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPostClearFormats(name, sheetName, range, startRow, startColumn, endRow, endColumn, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostClearFormats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **range** | **String**| The range. | [optional]
 **startRow** | **Integer**| The start row. | [optional]
 **startColumn** | **Integer**| The start column. | [optional]
 **endRow** | **Integer**| The end row. | [optional]
 **endColumn** | **Integer**| The end column. | [optional]
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostColumnStyle"></a>
# **cellsPostColumnStyle**
> CellsCloudResponse cellsPostColumnStyle(name, sheetName, columnIndex, style, folder, storage)

Set column style

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer columnIndex = 56; // Integer | The column index.
Style style = new Style(); // Style | Style dto
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPostColumnStyle(name, sheetName, columnIndex, style, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostColumnStyle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **columnIndex** | **Integer**| The column index. |
 **style** | [**Style**](Style.md)| Style dto | [optional]
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostCopyCellIntoCell"></a>
# **cellsPostCopyCellIntoCell**
> CellsCloudResponse cellsPostCopyCellIntoCell(name, destCellName, sheetName, worksheet, cellname, row, column, folder, storage)

Copy cell into cell

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String destCellName = "destCellName_example"; // String | Destination cell name
String sheetName = "sheetName_example"; // String | Destination worksheet name.
String worksheet = "worksheet_example"; // String | Source worksheet name.
String cellname = "cellname_example"; // String | Source cell name
Integer row = 56; // Integer | Source row
Integer column = 56; // Integer | Source column
String folder = "folder_example"; // String | Folder name
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPostCopyCellIntoCell(name, destCellName, sheetName, worksheet, cellname, row, column, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostCopyCellIntoCell");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **destCellName** | **String**| Destination cell name |
 **sheetName** | **String**| Destination worksheet name. |
 **worksheet** | **String**| Source worksheet name. |
 **cellname** | **String**| Source cell name | [optional]
 **row** | **Integer**| Source row | [optional]
 **column** | **Integer**| Source column | [optional]
 **folder** | **String**| Folder name | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostCopyWorksheetColumns"></a>
# **cellsPostCopyWorksheetColumns**
> CellsCloudResponse cellsPostCopyWorksheetColumns(name, sheetName, sourceColumnIndex, destinationColumnIndex, columnNumber, worksheet, folder, storage)

Copy worksheet columns.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer sourceColumnIndex = 56; // Integer | Source column index
Integer destinationColumnIndex = 56; // Integer | Destination column index
Integer columnNumber = 56; // Integer | The copied column number
String worksheet = ""; // String | The Worksheet
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPostCopyWorksheetColumns(name, sheetName, sourceColumnIndex, destinationColumnIndex, columnNumber, worksheet, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostCopyWorksheetColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **sourceColumnIndex** | **Integer**| Source column index |
 **destinationColumnIndex** | **Integer**| Destination column index |
 **columnNumber** | **Integer**| The copied column number |
 **worksheet** | **String**| The Worksheet | [optional] [default to ]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostCopyWorksheetRows"></a>
# **cellsPostCopyWorksheetRows**
> CellsCloudResponse cellsPostCopyWorksheetRows(name, sheetName, sourceRowIndex, destinationRowIndex, rowNumber, worksheet, folder, storage)

Copy worksheet rows.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer sourceRowIndex = 56; // Integer | Source row index
Integer destinationRowIndex = 56; // Integer | Destination row index
Integer rowNumber = 56; // Integer | The copied row number
String worksheet = "worksheet_example"; // String | worksheet
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPostCopyWorksheetRows(name, sheetName, sourceRowIndex, destinationRowIndex, rowNumber, worksheet, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostCopyWorksheetRows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **sourceRowIndex** | **Integer**| Source row index |
 **destinationRowIndex** | **Integer**| Destination row index |
 **rowNumber** | **Integer**| The copied row number |
 **worksheet** | **String**| worksheet | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostGroupWorksheetColumns"></a>
# **cellsPostGroupWorksheetColumns**
> CellsCloudResponse cellsPostGroupWorksheetColumns(name, sheetName, firstIndex, lastIndex, hide, folder, storage)

Group worksheet columns.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer firstIndex = 56; // Integer | The first column index to be operated.
Integer lastIndex = 56; // Integer | The last column index to be operated.
Boolean hide = true; // Boolean | columns visible state
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPostGroupWorksheetColumns(name, sheetName, firstIndex, lastIndex, hide, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostGroupWorksheetColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **firstIndex** | **Integer**| The first column index to be operated. |
 **lastIndex** | **Integer**| The last column index to be operated. |
 **hide** | **Boolean**| columns visible state | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostGroupWorksheetRows"></a>
# **cellsPostGroupWorksheetRows**
> CellsCloudResponse cellsPostGroupWorksheetRows(name, sheetName, firstIndex, lastIndex, hide, folder, storage)

Group worksheet rows.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer firstIndex = 56; // Integer | The first row index to be operated.
Integer lastIndex = 56; // Integer | The last row index to be operated.
Boolean hide = true; // Boolean | rows visible state
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPostGroupWorksheetRows(name, sheetName, firstIndex, lastIndex, hide, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostGroupWorksheetRows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **firstIndex** | **Integer**| The first row index to be operated. |
 **lastIndex** | **Integer**| The last row index to be operated. |
 **hide** | **Boolean**| rows visible state | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostHideWorksheetColumns"></a>
# **cellsPostHideWorksheetColumns**
> CellsCloudResponse cellsPostHideWorksheetColumns(name, sheetName, startColumn, totalColumns, folder, storage)

Hide worksheet columns.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer startColumn = 56; // Integer | The begin column index to be operated.
Integer totalColumns = 56; // Integer | Number of columns to be operated.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPostHideWorksheetColumns(name, sheetName, startColumn, totalColumns, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostHideWorksheetColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **startColumn** | **Integer**| The begin column index to be operated. |
 **totalColumns** | **Integer**| Number of columns to be operated. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostHideWorksheetRows"></a>
# **cellsPostHideWorksheetRows**
> CellsCloudResponse cellsPostHideWorksheetRows(name, sheetName, startrow, totalRows, folder, storage)

Hide worksheet rows.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer startrow = 56; // Integer | The begin row index to be operated.
Integer totalRows = 56; // Integer | Number of rows to be operated.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPostHideWorksheetRows(name, sheetName, startrow, totalRows, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostHideWorksheetRows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **startrow** | **Integer**| The begin row index to be operated. |
 **totalRows** | **Integer**| Number of rows to be operated. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostRowStyle"></a>
# **cellsPostRowStyle**
> CellsCloudResponse cellsPostRowStyle(name, sheetName, rowIndex, style, folder, storage)

Set row style.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer rowIndex = 56; // Integer | The row index.
Style style = new Style(); // Style | Style dto
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPostRowStyle(name, sheetName, rowIndex, style, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostRowStyle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **rowIndex** | **Integer**| The row index. |
 **style** | [**Style**](Style.md)| Style dto | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostSetCellHtmlString"></a>
# **cellsPostSetCellHtmlString**
> CellResponse cellsPostSetCellHtmlString(name, sheetName, cellName, htmlString, folder, storage)

Set htmlstring value into cell

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String cellName = "cellName_example"; // String | The cell name.
byte[] htmlString = BINARY_DATA_HERE; // byte[] | 
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellResponse result = apiInstance.cellsPostSetCellHtmlString(name, sheetName, cellName, htmlString, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostSetCellHtmlString");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **cellName** | **String**| The cell name. |
 **htmlString** | **byte[]**|  |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellResponse**](CellResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostSetCellRangeValue"></a>
# **cellsPostSetCellRangeValue**
> CellsCloudResponse cellsPostSetCellRangeValue(name, sheetName, cellarea, value, type, folder, storage)

Set cell range value 

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String cellarea = "cellarea_example"; // String | Cell area (like \"A1:C2\")
String value = "value_example"; // String | Range value
String type = "type_example"; // String | Value data type (like \"int\")
String folder = "folder_example"; // String | Folder name
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPostSetCellRangeValue(name, sheetName, cellarea, value, type, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostSetCellRangeValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **cellarea** | **String**| Cell area (like \&quot;A1:C2\&quot;) |
 **value** | **String**| Range value |
 **type** | **String**| Value data type (like \&quot;int\&quot;) |
 **folder** | **String**| Folder name | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostSetWorksheetColumnWidth"></a>
# **cellsPostSetWorksheetColumnWidth**
> ColumnResponse cellsPostSetWorksheetColumnWidth(name, sheetName, columnIndex, width, folder, storage)

Set worksheet column width.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer columnIndex = 56; // Integer | The column index.
Double width = 3.4D; // Double | The width.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    ColumnResponse result = apiInstance.cellsPostSetWorksheetColumnWidth(name, sheetName, columnIndex, width, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostSetWorksheetColumnWidth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **columnIndex** | **Integer**| The column index. |
 **width** | **Double**| The width. |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**ColumnResponse**](ColumnResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostUngroupWorksheetColumns"></a>
# **cellsPostUngroupWorksheetColumns**
> CellsCloudResponse cellsPostUngroupWorksheetColumns(name, sheetName, firstIndex, lastIndex, folder, storage)

Ungroup worksheet columns.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer firstIndex = 56; // Integer | The first column index to be operated.
Integer lastIndex = 56; // Integer | The last column index to be operated.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPostUngroupWorksheetColumns(name, sheetName, firstIndex, lastIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostUngroupWorksheetColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **firstIndex** | **Integer**| The first column index to be operated. |
 **lastIndex** | **Integer**| The last column index to be operated. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostUngroupWorksheetRows"></a>
# **cellsPostUngroupWorksheetRows**
> CellsCloudResponse cellsPostUngroupWorksheetRows(name, sheetName, firstIndex, lastIndex, isAll, folder, storage)

Ungroup worksheet rows.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer firstIndex = 56; // Integer | The first row index to be operated.
Integer lastIndex = 56; // Integer | The last row index to be operated.
Boolean isAll = true; // Boolean | Is all row to be operated
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPostUngroupWorksheetRows(name, sheetName, firstIndex, lastIndex, isAll, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostUngroupWorksheetRows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **firstIndex** | **Integer**| The first row index to be operated. |
 **lastIndex** | **Integer**| The last row index to be operated. |
 **isAll** | **Boolean**| Is all row to be operated | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostUnhideWorksheetColumns"></a>
# **cellsPostUnhideWorksheetColumns**
> CellsCloudResponse cellsPostUnhideWorksheetColumns(name, sheetName, startcolumn, totalColumns, width, folder, storage)

Unhide worksheet columns.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer startcolumn = 56; // Integer | The begin column index to be operated.
Integer totalColumns = 56; // Integer | Number of columns to be operated.
Double width = 3.4D; // Double | The new column width.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPostUnhideWorksheetColumns(name, sheetName, startcolumn, totalColumns, width, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostUnhideWorksheetColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **startcolumn** | **Integer**| The begin column index to be operated. |
 **totalColumns** | **Integer**| Number of columns to be operated. |
 **width** | **Double**| The new column width. | [optional] [default to 50.0]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostUnhideWorksheetRows"></a>
# **cellsPostUnhideWorksheetRows**
> CellsCloudResponse cellsPostUnhideWorksheetRows(name, sheetName, startrow, totalRows, height, folder, storage)

Unhide worksheet rows.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer startrow = 56; // Integer | The begin row index to be operated.
Integer totalRows = 56; // Integer | Number of rows to be operated.
Double height = 3.4D; // Double | The new row height.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPostUnhideWorksheetRows(name, sheetName, startrow, totalRows, height, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostUnhideWorksheetRows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **startrow** | **Integer**| The begin row index to be operated. |
 **totalRows** | **Integer**| Number of rows to be operated. |
 **height** | **Double**| The new row height. | [optional] [default to 15.0]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostUpdateWorksheetCellStyle"></a>
# **cellsPostUpdateWorksheetCellStyle**
> StyleResponse cellsPostUpdateWorksheetCellStyle(name, sheetName, cellName, style, folder, storage)

Update cell&#39;s style.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String cellName = "cellName_example"; // String | The cell name.
Style style = new Style(); // Style | with update style settings.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    StyleResponse result = apiInstance.cellsPostUpdateWorksheetCellStyle(name, sheetName, cellName, style, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostUpdateWorksheetCellStyle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **cellName** | **String**| The cell name. |
 **style** | [**Style**](Style.md)| with update style settings. | [optional]
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**StyleResponse**](StyleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostUpdateWorksheetRangeStyle"></a>
# **cellsPostUpdateWorksheetRangeStyle**
> CellsCloudResponse cellsPostUpdateWorksheetRangeStyle(name, sheetName, range, style, folder, storage)

Update cell&#39;s range style.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String range = "range_example"; // String | The range.
Style style = new Style(); // Style | with update style settings.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPostUpdateWorksheetRangeStyle(name, sheetName, range, style, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostUpdateWorksheetRangeStyle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| Worksheet name. |
 **range** | **String**| The range. |
 **style** | [**Style**](Style.md)| with update style settings. | [optional]
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostUpdateWorksheetRow"></a>
# **cellsPostUpdateWorksheetRow**
> RowResponse cellsPostUpdateWorksheetRow(name, sheetName, rowIndex, height, folder, storage)

Update worksheet row.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer rowIndex = 56; // Integer | The row index.
Double height = 3.4D; // Double | The new row height.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    RowResponse result = apiInstance.cellsPostUpdateWorksheetRow(name, sheetName, rowIndex, height, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostUpdateWorksheetRow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **rowIndex** | **Integer**| The row index. |
 **height** | **Double**| The new row height. | [optional] [default to 0.0]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**RowResponse**](RowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostWorksheetCellSetValue"></a>
# **cellsPostWorksheetCellSetValue**
> CellResponse cellsPostWorksheetCellSetValue(name, sheetName, cellName, value, type, formula, folder, storage)

Set cell value.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String cellName = "cellName_example"; // String | The cell name.
String value = "value_example"; // String | The cell value.
String type = "type_example"; // String | The value type.
String formula = "formula_example"; // String | Formula for cell
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellResponse result = apiInstance.cellsPostWorksheetCellSetValue(name, sheetName, cellName, value, type, formula, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostWorksheetCellSetValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **sheetName** | **String**| The worksheet name. |
 **cellName** | **String**| The cell name. |
 **value** | **String**| The cell value. | [optional]
 **type** | **String**| The value type. | [optional]
 **formula** | **String**| Formula for cell | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellResponse**](CellResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostWorksheetMerge"></a>
# **cellsPostWorksheetMerge**
> CellsCloudResponse cellsPostWorksheetMerge(name, sheetName, startRow, startColumn, totalRows, totalColumns, folder, storage)

Merge cells.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer startRow = 56; // Integer | The start row.
Integer startColumn = 56; // Integer | The start column.
Integer totalRows = 56; // Integer | The total rows
Integer totalColumns = 56; // Integer | The total columns.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPostWorksheetMerge(name, sheetName, startRow, startColumn, totalRows, totalColumns, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostWorksheetMerge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **startRow** | **Integer**| The start row. |
 **startColumn** | **Integer**| The start column. |
 **totalRows** | **Integer**| The total rows |
 **totalColumns** | **Integer**| The total columns. |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPostWorksheetUnmerge"></a>
# **cellsPostWorksheetUnmerge**
> CellsCloudResponse cellsPostWorksheetUnmerge(name, sheetName, startRow, startColumn, totalRows, totalColumns, folder, storage)

Unmerge cells.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer startRow = 56; // Integer | The start row.
Integer startColumn = 56; // Integer | The start column.
Integer totalRows = 56; // Integer | The total rows
Integer totalColumns = 56; // Integer | The total columns.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPostWorksheetUnmerge(name, sheetName, startRow, startColumn, totalRows, totalColumns, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPostWorksheetUnmerge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **startRow** | **Integer**| The start row. |
 **startColumn** | **Integer**| The start column. |
 **totalRows** | **Integer**| The total rows |
 **totalColumns** | **Integer**| The total columns. |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPropertiesDeleteDocumentProperties"></a>
# **cellsPropertiesDeleteDocumentProperties**
> CellsDocumentPropertiesResponse cellsPropertiesDeleteDocumentProperties(name, folder, storage)

Delete all custom document properties and clean built-in ones.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsDocumentPropertiesResponse result = apiInstance.cellsPropertiesDeleteDocumentProperties(name, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPropertiesDeleteDocumentProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsDocumentPropertiesResponse**](CellsDocumentPropertiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPropertiesDeleteDocumentProperty"></a>
# **cellsPropertiesDeleteDocumentProperty**
> CellsDocumentPropertiesResponse cellsPropertiesDeleteDocumentProperty(name, propertyName, folder, storage)

Delete document property.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The document name.
String propertyName = "propertyName_example"; // String | The property name.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsDocumentPropertiesResponse result = apiInstance.cellsPropertiesDeleteDocumentProperty(name, propertyName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPropertiesDeleteDocumentProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **propertyName** | **String**| The property name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsDocumentPropertiesResponse**](CellsDocumentPropertiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPropertiesGetDocumentProperties"></a>
# **cellsPropertiesGetDocumentProperties**
> CellsDocumentPropertiesResponse cellsPropertiesGetDocumentProperties(name, folder, storage)

Read document properties.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsDocumentPropertiesResponse result = apiInstance.cellsPropertiesGetDocumentProperties(name, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPropertiesGetDocumentProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsDocumentPropertiesResponse**](CellsDocumentPropertiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPropertiesGetDocumentProperty"></a>
# **cellsPropertiesGetDocumentProperty**
> CellsDocumentPropertyResponse cellsPropertiesGetDocumentProperty(name, propertyName, folder, storage)

Read document property by name.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The document name.
String propertyName = "propertyName_example"; // String | The property name.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsDocumentPropertyResponse result = apiInstance.cellsPropertiesGetDocumentProperty(name, propertyName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPropertiesGetDocumentProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **propertyName** | **String**| The property name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsDocumentPropertyResponse**](CellsDocumentPropertyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPropertiesPutDocumentProperty"></a>
# **cellsPropertiesPutDocumentProperty**
> CellsDocumentPropertyResponse cellsPropertiesPutDocumentProperty(name, propertyName, property, folder, storage)

Set/create document property.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The document name.
String propertyName = "propertyName_example"; // String | The property name.
CellsDocumentProperty property = new CellsDocumentProperty(); // CellsDocumentProperty | with new property value.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsDocumentPropertyResponse result = apiInstance.cellsPropertiesPutDocumentProperty(name, propertyName, property, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPropertiesPutDocumentProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **propertyName** | **String**| The property name. |
 **property** | [**CellsDocumentProperty**](CellsDocumentProperty.md)| with new property value. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsDocumentPropertyResponse**](CellsDocumentPropertyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPutInsertWorksheetColumns"></a>
# **cellsPutInsertWorksheetColumns**
> ColumnsResponse cellsPutInsertWorksheetColumns(name, sheetName, columnIndex, columns, updateReference, folder, storage)

Insert worksheet columns.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer columnIndex = 56; // Integer | The column index.
Integer columns = 56; // Integer | The columns.
Boolean updateReference = true; // Boolean | The update reference.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    ColumnsResponse result = apiInstance.cellsPutInsertWorksheetColumns(name, sheetName, columnIndex, columns, updateReference, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPutInsertWorksheetColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **columnIndex** | **Integer**| The column index. |
 **columns** | **Integer**| The columns. |
 **updateReference** | **Boolean**| The update reference. | [optional] [default to true]
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**ColumnsResponse**](ColumnsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPutInsertWorksheetRow"></a>
# **cellsPutInsertWorksheetRow**
> RowResponse cellsPutInsertWorksheetRow(name, sheetName, rowIndex, folder, storage)

Insert new worksheet row.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer rowIndex = 56; // Integer | The new row index.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    RowResponse result = apiInstance.cellsPutInsertWorksheetRow(name, sheetName, rowIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPutInsertWorksheetRow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **rowIndex** | **Integer**| The new row index. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**RowResponse**](RowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsPutInsertWorksheetRows"></a>
# **cellsPutInsertWorksheetRows**
> CellsCloudResponse cellsPutInsertWorksheetRows(name, sheetName, startrow, totalRows, updateReference, folder, storage)

Insert several new worksheet rows.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
Integer startrow = 56; // Integer | The begin row index to be operated.
Integer totalRows = 1; // Integer | Number of rows to be operated.
Boolean updateReference = true; // Boolean | Indicates if update references in other worksheets.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsPutInsertWorksheetRows(name, sheetName, startrow, totalRows, updateReference, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsPutInsertWorksheetRows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **startrow** | **Integer**| The begin row index to be operated. |
 **totalRows** | **Integer**| Number of rows to be operated. | [optional] [default to 1]
 **updateReference** | **Boolean**| Indicates if update references in other worksheets. | [optional] [default to true]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsRangesGetWorksheetCellsRangeValue"></a>
# **cellsRangesGetWorksheetCellsRangeValue**
> RangeValueResponse cellsRangesGetWorksheetCellsRangeValue(name, sheetName, namerange, firstRow, firstColumn, rowCount, columnCount, folder, storage)

Get cells list in a range by range name or row column indexes  

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | workbook name
String sheetName = "sheetName_example"; // String | worksheet name
String namerange = "namerange_example"; // String | range name, for example: 'A1:B2' or 'range_name1'
Integer firstRow = 56; // Integer | the first row of the range
Integer firstColumn = 56; // Integer | the first column of the range
Integer rowCount = 56; // Integer | the count of rows in the range
Integer columnCount = 56; // Integer | the count of columns in the range
String folder = "folder_example"; // String | Workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    RangeValueResponse result = apiInstance.cellsRangesGetWorksheetCellsRangeValue(name, sheetName, namerange, firstRow, firstColumn, rowCount, columnCount, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsRangesGetWorksheetCellsRangeValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| workbook name |
 **sheetName** | **String**| worksheet name |
 **namerange** | **String**| range name, for example: &#39;A1:B2&#39; or &#39;range_name1&#39; | [optional]
 **firstRow** | **Integer**| the first row of the range | [optional]
 **firstColumn** | **Integer**| the first column of the range | [optional]
 **rowCount** | **Integer**| the count of rows in the range | [optional]
 **columnCount** | **Integer**| the count of columns in the range | [optional]
 **folder** | **String**| Workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**RangeValueResponse**](RangeValueResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsRangesPostWorksheetCellsRangeColumnWidth"></a>
# **cellsRangesPostWorksheetCellsRangeColumnWidth**
> CellsCloudResponse cellsRangesPostWorksheetCellsRangeColumnWidth(name, sheetName, value, range, folder, storage)

Set column width of range

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Double value = 3.4D; // Double | 
Range range = new Range(); // Range | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsRangesPostWorksheetCellsRangeColumnWidth(name, sheetName, value, range, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsRangesPostWorksheetCellsRangeColumnWidth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **value** | **Double**|  |
 **range** | [**Range**](Range.md)|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsRangesPostWorksheetCellsRangeMerge"></a>
# **cellsRangesPostWorksheetCellsRangeMerge**
> CellsCloudResponse cellsRangesPostWorksheetCellsRangeMerge(name, sheetName, range, folder, storage)

Combines a range of cells into a single cell.              

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | workbook name
String sheetName = "sheetName_example"; // String | worksheet name
Range range = new Range(); // Range | range in worksheet 
String folder = "folder_example"; // String | Workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsRangesPostWorksheetCellsRangeMerge(name, sheetName, range, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsRangesPostWorksheetCellsRangeMerge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| workbook name |
 **sheetName** | **String**| worksheet name |
 **range** | [**Range**](Range.md)| range in worksheet  | [optional]
 **folder** | **String**| Workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsRangesPostWorksheetCellsRangeMoveTo"></a>
# **cellsRangesPostWorksheetCellsRangeMoveTo**
> CellsCloudResponse cellsRangesPostWorksheetCellsRangeMoveTo(name, sheetName, destRow, destColumn, range, folder, storage)

Move the current range to the dest range.             

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | workbook name
String sheetName = "sheetName_example"; // String | worksheet name
Integer destRow = 56; // Integer | The start row of the dest range.
Integer destColumn = 56; // Integer | The start column of the dest range.
Range range = new Range(); // Range | range in worksheet 
String folder = "folder_example"; // String | Workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsRangesPostWorksheetCellsRangeMoveTo(name, sheetName, destRow, destColumn, range, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsRangesPostWorksheetCellsRangeMoveTo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| workbook name |
 **sheetName** | **String**| worksheet name |
 **destRow** | **Integer**| The start row of the dest range. |
 **destColumn** | **Integer**| The start column of the dest range. |
 **range** | [**Range**](Range.md)| range in worksheet  | [optional]
 **folder** | **String**| Workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsRangesPostWorksheetCellsRangeOutlineBorder"></a>
# **cellsRangesPostWorksheetCellsRangeOutlineBorder**
> CellsCloudResponse cellsRangesPostWorksheetCellsRangeOutlineBorder(name, sheetName, rangeOperate, folder, storage)

Sets outline border around a range of cells.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | workbook name
String sheetName = "sheetName_example"; // String | worksheet name
RangeSetOutlineBorderRequest rangeOperate = new RangeSetOutlineBorderRequest(); // RangeSetOutlineBorderRequest | Range Set OutlineBorder Request 
String folder = "folder_example"; // String | Workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsRangesPostWorksheetCellsRangeOutlineBorder(name, sheetName, rangeOperate, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsRangesPostWorksheetCellsRangeOutlineBorder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| workbook name |
 **sheetName** | **String**| worksheet name |
 **rangeOperate** | [**RangeSetOutlineBorderRequest**](RangeSetOutlineBorderRequest.md)| Range Set OutlineBorder Request  | [optional]
 **folder** | **String**| Workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsRangesPostWorksheetCellsRangeRowHeight"></a>
# **cellsRangesPostWorksheetCellsRangeRowHeight**
> CellsCloudResponse cellsRangesPostWorksheetCellsRangeRowHeight(name, sheetName, value, range, folder, storage)

set row height of range

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Double value = 3.4D; // Double | 
Range range = new Range(); // Range | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsRangesPostWorksheetCellsRangeRowHeight(name, sheetName, value, range, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsRangesPostWorksheetCellsRangeRowHeight");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **value** | **Double**|  |
 **range** | [**Range**](Range.md)|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsRangesPostWorksheetCellsRangeStyle"></a>
# **cellsRangesPostWorksheetCellsRangeStyle**
> CellsCloudResponse cellsRangesPostWorksheetCellsRangeStyle(name, sheetName, rangeOperate, folder, storage)

Sets the style of the range.             

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | workbook name
String sheetName = "sheetName_example"; // String | worksheet name
RangeSetStyleRequest rangeOperate = new RangeSetStyleRequest(); // RangeSetStyleRequest | Range Set Style Request 
String folder = "folder_example"; // String | Workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsRangesPostWorksheetCellsRangeStyle(name, sheetName, rangeOperate, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsRangesPostWorksheetCellsRangeStyle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| workbook name |
 **sheetName** | **String**| worksheet name |
 **rangeOperate** | [**RangeSetStyleRequest**](RangeSetStyleRequest.md)| Range Set Style Request  | [optional]
 **folder** | **String**| Workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsRangesPostWorksheetCellsRangeUnmerge"></a>
# **cellsRangesPostWorksheetCellsRangeUnmerge**
> CellsCloudResponse cellsRangesPostWorksheetCellsRangeUnmerge(name, sheetName, range, folder, storage)

Unmerges merged cells of this range.             

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | workbook name
String sheetName = "sheetName_example"; // String | worksheet name
Range range = new Range(); // Range | range in worksheet 
String folder = "folder_example"; // String | Workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsRangesPostWorksheetCellsRangeUnmerge(name, sheetName, range, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsRangesPostWorksheetCellsRangeUnmerge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| workbook name |
 **sheetName** | **String**| worksheet name |
 **range** | [**Range**](Range.md)| range in worksheet  | [optional]
 **folder** | **String**| Workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsRangesPostWorksheetCellsRangeValue"></a>
# **cellsRangesPostWorksheetCellsRangeValue**
> CellsCloudResponse cellsRangesPostWorksheetCellsRangeValue(name, sheetName, value, range, isConverted, setStyle, folder, storage)

Puts a value into the range, if appropriate the value will be converted to other data type and cell&#39;s number format will be reset.             

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | workbook name
String sheetName = "sheetName_example"; // String | worksheet name
String value = "value_example"; // String | Input value
Range range = new Range(); // Range | range in worksheet 
Boolean isConverted = false; // Boolean | True: converted to other data type if appropriate.
Boolean setStyle = false; // Boolean | True: set the number format to cell's style when converting to other data type
String folder = "folder_example"; // String | Workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsRangesPostWorksheetCellsRangeValue(name, sheetName, value, range, isConverted, setStyle, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsRangesPostWorksheetCellsRangeValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| workbook name |
 **sheetName** | **String**| worksheet name |
 **value** | **String**| Input value |
 **range** | [**Range**](Range.md)| range in worksheet  | [optional]
 **isConverted** | **Boolean**| True: converted to other data type if appropriate. | [optional] [default to false]
 **setStyle** | **Boolean**| True: set the number format to cell&#39;s style when converting to other data type | [optional] [default to false]
 **folder** | **String**| Workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsRangesPostWorksheetCellsRanges"></a>
# **cellsRangesPostWorksheetCellsRanges**
> CellsCloudResponse cellsRangesPostWorksheetCellsRanges(name, sheetName, rangeOperate, folder, storage)

copy range in the worksheet

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | workbook name
String sheetName = "sheetName_example"; // String | worksheet name
RangeCopyRequest rangeOperate = new RangeCopyRequest(); // RangeCopyRequest | copydata,copystyle,copyto,copyvalue
String folder = "folder_example"; // String | Workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsRangesPostWorksheetCellsRanges(name, sheetName, rangeOperate, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsRangesPostWorksheetCellsRanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| workbook name |
 **sheetName** | **String**| worksheet name |
 **rangeOperate** | [**RangeCopyRequest**](RangeCopyRequest.md)| copydata,copystyle,copyto,copyvalue | [optional]
 **folder** | **String**| Workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsSaveAsPostDocumentSaveAs"></a>
# **cellsSaveAsPostDocumentSaveAs**
> SaveResponse cellsSaveAsPostDocumentSaveAs(name, saveOptions, newfilename, isAutoFitRows, isAutoFitColumns, folder, storage)

Convert document and save result to storage.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The document name.
SaveOptions saveOptions = new SaveOptions(); // SaveOptions | Save options.
String newfilename = "newfilename_example"; // String | The new file name.
Boolean isAutoFitRows = false; // Boolean | Autofit rows.
Boolean isAutoFitColumns = false; // Boolean | Autofit columns.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    SaveResponse result = apiInstance.cellsSaveAsPostDocumentSaveAs(name, saveOptions, newfilename, isAutoFitRows, isAutoFitColumns, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsSaveAsPostDocumentSaveAs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **saveOptions** | [**SaveOptions**](SaveOptions.md)| Save options. | [optional]
 **newfilename** | **String**| The new file name. | [optional]
 **isAutoFitRows** | **Boolean**| Autofit rows. | [optional] [default to false]
 **isAutoFitColumns** | **Boolean**| Autofit columns. | [optional] [default to false]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaveResponse**](SaveResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsShapesDeleteWorksheetShape"></a>
# **cellsShapesDeleteWorksheetShape**
> CellsCloudResponse cellsShapesDeleteWorksheetShape(name, sheetName, shapeindex, folder, storage)

Delete a shape in worksheet

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | document name.
String sheetName = "sheetName_example"; // String | worksheet name.
Integer shapeindex = 56; // Integer | shape index in worksheet shapes.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsShapesDeleteWorksheetShape(name, sheetName, shapeindex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsShapesDeleteWorksheetShape");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| document name. |
 **sheetName** | **String**| worksheet name. |
 **shapeindex** | **Integer**| shape index in worksheet shapes. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsShapesDeleteWorksheetShapes"></a>
# **cellsShapesDeleteWorksheetShapes**
> CellsCloudResponse cellsShapesDeleteWorksheetShapes(name, sheetName, folder, storage)

delete all shapes in worksheet

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | document name.
String sheetName = "sheetName_example"; // String | worksheet name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsShapesDeleteWorksheetShapes(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsShapesDeleteWorksheetShapes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| document name. |
 **sheetName** | **String**| worksheet name. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsShapesGetWorksheetShape"></a>
# **cellsShapesGetWorksheetShape**
> ShapeResponse cellsShapesGetWorksheetShape(name, sheetName, shapeindex, folder, storage)

Get worksheet shape

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | document name.
String sheetName = "sheetName_example"; // String | worksheet name.
Integer shapeindex = 56; // Integer | shape index in worksheet shapes.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    ShapeResponse result = apiInstance.cellsShapesGetWorksheetShape(name, sheetName, shapeindex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsShapesGetWorksheetShape");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| document name. |
 **sheetName** | **String**| worksheet name. |
 **shapeindex** | **Integer**| shape index in worksheet shapes. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**ShapeResponse**](ShapeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsShapesGetWorksheetShapes"></a>
# **cellsShapesGetWorksheetShapes**
> ShapesResponse cellsShapesGetWorksheetShapes(name, sheetName, folder, storage)

Get worksheet shapes 

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | document name.
String sheetName = "sheetName_example"; // String | worksheet name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    ShapesResponse result = apiInstance.cellsShapesGetWorksheetShapes(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsShapesGetWorksheetShapes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| document name. |
 **sheetName** | **String**| worksheet name. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**ShapesResponse**](ShapesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsShapesPostWorksheetShape"></a>
# **cellsShapesPostWorksheetShape**
> CellsCloudResponse cellsShapesPostWorksheetShape(name, sheetName, shapeindex, dto, folder, storage)

Update a shape in worksheet

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | document name.
String sheetName = "sheetName_example"; // String | worksheet name.
Integer shapeindex = 56; // Integer | shape index in worksheet shapes.
Shape dto = new Shape(); // Shape | 
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsShapesPostWorksheetShape(name, sheetName, shapeindex, dto, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsShapesPostWorksheetShape");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| document name. |
 **sheetName** | **String**| worksheet name. |
 **shapeindex** | **Integer**| shape index in worksheet shapes. |
 **dto** | [**Shape**](Shape.md)|  | [optional]
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsShapesPutWorksheetShape"></a>
# **cellsShapesPutWorksheetShape**
> ShapeResponse cellsShapesPutWorksheetShape(name, sheetName, drawingType, upperLeftRow, upperLeftColumn, top, left, width, height, folder, storage)

Add shape in worksheet

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | document name.
String sheetName = "sheetName_example"; // String | worksheet name.
String drawingType = "drawingType_example"; // String | shape object type
Integer upperLeftRow = 56; // Integer | Upper left row index.
Integer upperLeftColumn = 56; // Integer | Upper left column index.
Integer top = 56; // Integer | Represents the vertical offset of Spinner from its left row, in unit of pixel.
Integer left = 56; // Integer | Represents the horizontal offset of Spinner from its left column, in unit of pixel.
Integer width = 56; // Integer | Represents the height of Spinner, in unit of pixel.
Integer height = 56; // Integer | Represents the width of Spinner, in unit of pixel.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    ShapeResponse result = apiInstance.cellsShapesPutWorksheetShape(name, sheetName, drawingType, upperLeftRow, upperLeftColumn, top, left, width, height, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsShapesPutWorksheetShape");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| document name. |
 **sheetName** | **String**| worksheet name. |
 **drawingType** | **String**| shape object type |
 **upperLeftRow** | **Integer**| Upper left row index. |
 **upperLeftColumn** | **Integer**| Upper left column index. |
 **top** | **Integer**| Represents the vertical offset of Spinner from its left row, in unit of pixel. |
 **left** | **Integer**| Represents the horizontal offset of Spinner from its left column, in unit of pixel. |
 **width** | **Integer**| Represents the height of Spinner, in unit of pixel. |
 **height** | **Integer**| Represents the width of Spinner, in unit of pixel. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**ShapeResponse**](ShapeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsTaskPostRunTask"></a>
# **cellsTaskPostRunTask**
> Object cellsTaskPostRunTask(taskData)

Run tasks  

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
TaskData taskData = new TaskData(); // TaskData | 
try {
    Object result = apiInstance.cellsTaskPostRunTask(taskData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsTaskPostRunTask");
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

<a name="cellsWorkbookDeleteDecryptDocument"></a>
# **cellsWorkbookDeleteDecryptDocument**
> CellsCloudResponse cellsWorkbookDeleteDecryptDocument(name, encryption, folder, storage)

Decrypt document.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The document name.
WorkbookEncryptionRequest encryption = new WorkbookEncryptionRequest(); // WorkbookEncryptionRequest | Encryption settings, only password can be specified.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorkbookDeleteDecryptDocument(name, encryption, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookDeleteDecryptDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **encryption** | [**WorkbookEncryptionRequest**](WorkbookEncryptionRequest.md)| Encryption settings, only password can be specified. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookDeleteDocumentUnprotectFromChanges"></a>
# **cellsWorkbookDeleteDocumentUnprotectFromChanges**
> CellsCloudResponse cellsWorkbookDeleteDocumentUnprotectFromChanges(name, folder, storage)

Unprotect document from changes.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorkbookDeleteDocumentUnprotectFromChanges(name, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookDeleteDocumentUnprotectFromChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookDeleteUnprotectDocument"></a>
# **cellsWorkbookDeleteUnprotectDocument**
> CellsCloudResponse cellsWorkbookDeleteUnprotectDocument(name, protection, folder, storage)

Unprotect document.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The document name.
WorkbookProtectionRequest protection = new WorkbookProtectionRequest(); // WorkbookProtectionRequest | Protection settings, only password can be specified.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorkbookDeleteUnprotectDocument(name, protection, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookDeleteUnprotectDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **protection** | [**WorkbookProtectionRequest**](WorkbookProtectionRequest.md)| Protection settings, only password can be specified. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookDeleteWorkbookBackground"></a>
# **cellsWorkbookDeleteWorkbookBackground**
> CellsCloudResponse cellsWorkbookDeleteWorkbookBackground(name, folder, storage)

Set worksheet background image.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorkbookDeleteWorkbookBackground(name, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookDeleteWorkbookBackground");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookDeleteWorkbookName"></a>
# **cellsWorkbookDeleteWorkbookName**
> CellsCloudResponse cellsWorkbookDeleteWorkbookName(name, nameName, folder, storage)

Clean workbook&#39;s names.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String nameName = "nameName_example"; // String | The name.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorkbookDeleteWorkbookName(name, nameName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookDeleteWorkbookName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **nameName** | **String**| The name. |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookDeleteWorkbookNames"></a>
# **cellsWorkbookDeleteWorkbookNames**
> CellsCloudResponse cellsWorkbookDeleteWorkbookNames(name, folder, storage)

Clean workbook&#39;s names.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorkbookDeleteWorkbookNames(name, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookDeleteWorkbookNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookGetWorkbook"></a>
# **cellsWorkbookGetWorkbook**
> File cellsWorkbookGetWorkbook(name, password, format, isAutoFit, onlySaveTable, folder, storage, outPath)

Read workbook info or export.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The document name.
String password = "password_example"; // String | The document password.
String format = "format_example"; // String | The exported file format.
Boolean isAutoFit = false; // Boolean | Set document rows to be autofit.
Boolean onlySaveTable = false; // Boolean | Only save table data.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
String outPath = "outPath_example"; // String | The document output folder.
try {
    File result = apiInstance.cellsWorkbookGetWorkbook(name, password, format, isAutoFit, onlySaveTable, folder, storage, outPath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookGetWorkbook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **password** | **String**| The document password. | [optional]
 **format** | **String**| The exported file format. | [optional]
 **isAutoFit** | **Boolean**| Set document rows to be autofit. | [optional] [default to false]
 **onlySaveTable** | **Boolean**| Only save table data. | [optional] [default to false]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]
 **outPath** | **String**| The document output folder. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookGetWorkbookDefaultStyle"></a>
# **cellsWorkbookGetWorkbookDefaultStyle**
> StyleResponse cellsWorkbookGetWorkbookDefaultStyle(name, folder, storage)

Read workbook default style info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String folder = "folder_example"; // String | The document's folder.
String storage = "storage_example"; // String | storage name.
try {
    StyleResponse result = apiInstance.cellsWorkbookGetWorkbookDefaultStyle(name, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookGetWorkbookDefaultStyle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **folder** | **String**| The document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**StyleResponse**](StyleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookGetWorkbookName"></a>
# **cellsWorkbookGetWorkbookName**
> NameResponse cellsWorkbookGetWorkbookName(name, nameName, folder, storage)

Read workbook&#39;s name.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String nameName = "nameName_example"; // String | The name.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    NameResponse result = apiInstance.cellsWorkbookGetWorkbookName(name, nameName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookGetWorkbookName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **nameName** | **String**| The name. |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**NameResponse**](NameResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookGetWorkbookNameValue"></a>
# **cellsWorkbookGetWorkbookNameValue**
> RangeValueResponse cellsWorkbookGetWorkbookNameValue(name, nameName, folder, storage)

Get workbook&#39;s name value.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String nameName = "nameName_example"; // String | The name.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    RangeValueResponse result = apiInstance.cellsWorkbookGetWorkbookNameValue(name, nameName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookGetWorkbookNameValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **nameName** | **String**| The name. |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**RangeValueResponse**](RangeValueResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookGetWorkbookNames"></a>
# **cellsWorkbookGetWorkbookNames**
> NamesResponse cellsWorkbookGetWorkbookNames(name, folder, storage)

Read workbook&#39;s names.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    NamesResponse result = apiInstance.cellsWorkbookGetWorkbookNames(name, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookGetWorkbookNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**NamesResponse**](NamesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookGetWorkbookSettings"></a>
# **cellsWorkbookGetWorkbookSettings**
> WorkbookSettingsResponse cellsWorkbookGetWorkbookSettings(name, folder, storage)

Get Workbook Settings DTO

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    WorkbookSettingsResponse result = apiInstance.cellsWorkbookGetWorkbookSettings(name, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookGetWorkbookSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorkbookSettingsResponse**](WorkbookSettingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookGetWorkbookTextItems"></a>
# **cellsWorkbookGetWorkbookTextItems**
> TextItemsResponse cellsWorkbookGetWorkbookTextItems(name, folder, storage)

Read workbook&#39;s text items.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    TextItemsResponse result = apiInstance.cellsWorkbookGetWorkbookTextItems(name, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookGetWorkbookTextItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**TextItemsResponse**](TextItemsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPostAutofitWorkbookRows"></a>
# **cellsWorkbookPostAutofitWorkbookRows**
> CellsCloudResponse cellsWorkbookPostAutofitWorkbookRows(name, autoFitterOptions, startRow, endRow, onlyAuto, folder, storage)

Autofit workbook rows.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
AutoFitterOptions autoFitterOptions = new AutoFitterOptions(); // AutoFitterOptions | Auto Fitter Options.
Integer startRow = 56; // Integer | Start row.
Integer endRow = 56; // Integer | End row.
Boolean onlyAuto = false; // Boolean | Only auto.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorkbookPostAutofitWorkbookRows(name, autoFitterOptions, startRow, endRow, onlyAuto, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookPostAutofitWorkbookRows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **autoFitterOptions** | [**AutoFitterOptions**](AutoFitterOptions.md)| Auto Fitter Options. | [optional]
 **startRow** | **Integer**| Start row. | [optional]
 **endRow** | **Integer**| End row. | [optional]
 **onlyAuto** | **Boolean**| Only auto. | [optional] [default to false]
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPostEncryptDocument"></a>
# **cellsWorkbookPostEncryptDocument**
> CellsCloudResponse cellsWorkbookPostEncryptDocument(name, encryption, folder, storage)

Encript document.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The document name.
WorkbookEncryptionRequest encryption = new WorkbookEncryptionRequest(); // WorkbookEncryptionRequest | Encryption parameters.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorkbookPostEncryptDocument(name, encryption, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookPostEncryptDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **encryption** | [**WorkbookEncryptionRequest**](WorkbookEncryptionRequest.md)| Encryption parameters. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPostImportData"></a>
# **cellsWorkbookPostImportData**
> CellsCloudResponse cellsWorkbookPostImportData(name, importData, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
ImportOption importData = new ImportOption(); // ImportOption | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorkbookPostImportData(name, importData, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookPostImportData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **importData** | [**ImportOption**](ImportOption.md)|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPostProtectDocument"></a>
# **cellsWorkbookPostProtectDocument**
> CellsCloudResponse cellsWorkbookPostProtectDocument(name, protection, folder, storage)

Protect document.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The document name.
WorkbookProtectionRequest protection = new WorkbookProtectionRequest(); // WorkbookProtectionRequest | The protection settings.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorkbookPostProtectDocument(name, protection, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookPostProtectDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **protection** | [**WorkbookProtectionRequest**](WorkbookProtectionRequest.md)| The protection settings. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPostWorkbookCalculateFormula"></a>
# **cellsWorkbookPostWorkbookCalculateFormula**
> CellsCloudResponse cellsWorkbookPostWorkbookCalculateFormula(name, options, ignoreError, folder, storage)

Calculate all formulas in workbook.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
CalculationOptions options = new CalculationOptions(); // CalculationOptions | Calculation Options.
Boolean ignoreError = true; // Boolean | ignore Error.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorkbookPostWorkbookCalculateFormula(name, options, ignoreError, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookPostWorkbookCalculateFormula");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **options** | [**CalculationOptions**](CalculationOptions.md)| Calculation Options. | [optional]
 **ignoreError** | **Boolean**| ignore Error. | [optional]
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPostWorkbookGetSmartMarkerResult"></a>
# **cellsWorkbookPostWorkbookGetSmartMarkerResult**
> File cellsWorkbookPostWorkbookGetSmartMarkerResult(name, xmlFile, folder, storage, outPath)

Smart marker processing result.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String xmlFile = "xmlFile_example"; // String | The xml file full path, if empty the data is read from request body.
String folder = "folder_example"; // String | The workbook folder full path.
String storage = "storage_example"; // String | storage name.
String outPath = "outPath_example"; // String | Path to save result
try {
    File result = apiInstance.cellsWorkbookPostWorkbookGetSmartMarkerResult(name, xmlFile, folder, storage, outPath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookPostWorkbookGetSmartMarkerResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **xmlFile** | **String**| The xml file full path, if empty the data is read from request body. | [optional]
 **folder** | **String**| The workbook folder full path. | [optional]
 **storage** | **String**| storage name. | [optional]
 **outPath** | **String**| Path to save result | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPostWorkbookSettings"></a>
# **cellsWorkbookPostWorkbookSettings**
> CellsCloudResponse cellsWorkbookPostWorkbookSettings(name, settings, folder, storage)

Update Workbook setting 

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
WorkbookSettings settings = new WorkbookSettings(); // WorkbookSettings | Workbook Setting DTO
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorkbookPostWorkbookSettings(name, settings, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookPostWorkbookSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **settings** | [**WorkbookSettings**](WorkbookSettings.md)| Workbook Setting DTO | [optional]
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPostWorkbookSplit"></a>
# **cellsWorkbookPostWorkbookSplit**
> SplitResultResponse cellsWorkbookPostWorkbookSplit(name, format, from, to, horizontalResolution, verticalResolution, folder, outFolder, storage)

Split workbook.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String format = "format_example"; // String | Split format.
Integer from = 0; // Integer | Start worksheet index.
Integer to = 0; // Integer | End worksheet index.
Integer horizontalResolution = 0; // Integer | Image horizontal resolution.
Integer verticalResolution = 0; // Integer | Image vertical resolution.
String folder = "folder_example"; // String | The workbook folder.
String outFolder = "outFolder_example"; // String | out Folder.
String storage = "storage_example"; // String | storage name.
try {
    SplitResultResponse result = apiInstance.cellsWorkbookPostWorkbookSplit(name, format, from, to, horizontalResolution, verticalResolution, folder, outFolder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookPostWorkbookSplit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **format** | **String**| Split format. | [optional]
 **from** | **Integer**| Start worksheet index. | [optional] [default to 0]
 **to** | **Integer**| End worksheet index. | [optional] [default to 0]
 **horizontalResolution** | **Integer**| Image horizontal resolution. | [optional] [default to 0]
 **verticalResolution** | **Integer**| Image vertical resolution. | [optional] [default to 0]
 **folder** | **String**| The workbook folder. | [optional]
 **outFolder** | **String**| out Folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SplitResultResponse**](SplitResultResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPostWorkbooksMerge"></a>
# **cellsWorkbookPostWorkbooksMerge**
> WorkbookResponse cellsWorkbookPostWorkbooksMerge(name, mergeWith, folder, storage)

Merge workbooks.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String mergeWith = "mergeWith_example"; // String | The workbook to merge with.
String folder = "folder_example"; // String | Source workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    WorkbookResponse result = apiInstance.cellsWorkbookPostWorkbooksMerge(name, mergeWith, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookPostWorkbooksMerge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **mergeWith** | **String**| The workbook to merge with. |
 **folder** | **String**| Source workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorkbookResponse**](WorkbookResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPostWorkbooksTextReplace"></a>
# **cellsWorkbookPostWorkbooksTextReplace**
> WorkbookReplaceResponse cellsWorkbookPostWorkbooksTextReplace(name, oldValue, newValue, folder, storage)

Replace text.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String oldValue = "oldValue_example"; // String | The old value.
String newValue = "newValue_example"; // String | The new value.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    WorkbookReplaceResponse result = apiInstance.cellsWorkbookPostWorkbooksTextReplace(name, oldValue, newValue, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookPostWorkbooksTextReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **oldValue** | **String**| The old value. |
 **newValue** | **String**| The new value. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorkbookReplaceResponse**](WorkbookReplaceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPostWorkbooksTextSearch"></a>
# **cellsWorkbookPostWorkbooksTextSearch**
> TextItemsResponse cellsWorkbookPostWorkbooksTextSearch(name, text, folder, storage)

Search text.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String text = "text_example"; // String | Text sample.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    TextItemsResponse result = apiInstance.cellsWorkbookPostWorkbooksTextSearch(name, text, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookPostWorkbooksTextSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **text** | **String**| Text sample. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**TextItemsResponse**](TextItemsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPutConvertWorkbook"></a>
# **cellsWorkbookPutConvertWorkbook**
> File cellsWorkbookPutConvertWorkbook(workbook, format, password, outPath)

Convert workbook from request content to some format.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
File workbook = new File("/path/to/file.txt"); // File | 
String format = "format_example"; // String | The format to convert.
String password = "password_example"; // String | The workbook password.
String outPath = "outPath_example"; // String | Path to save result
try {
    File result = apiInstance.cellsWorkbookPutConvertWorkbook(workbook, format, password, outPath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookPutConvertWorkbook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workbook** | **File**|  |
 **format** | **String**| The format to convert. | [optional]
 **password** | **String**| The workbook password. | [optional]
 **outPath** | **String**| Path to save result | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPutDocumentProtectFromChanges"></a>
# **cellsWorkbookPutDocumentProtectFromChanges**
> CellsCloudResponse cellsWorkbookPutDocumentProtectFromChanges(name, password, folder, storage)

Protect document from changes.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
PasswordRequest password = new PasswordRequest(); // PasswordRequest | Modification password.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorkbookPutDocumentProtectFromChanges(name, password, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookPutDocumentProtectFromChanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **password** | [**PasswordRequest**](PasswordRequest.md)| Modification password. | [optional]
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPutWorkbookBackground"></a>
# **cellsWorkbookPutWorkbookBackground**
> CellsCloudResponse cellsWorkbookPutWorkbookBackground(name, png, folder, storage)

Set workbook background image.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
byte[] png = BINARY_DATA_HERE; // byte[] | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorkbookPutWorkbookBackground(name, png, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookPutWorkbookBackground");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **png** | **byte[]**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorkbookPutWorkbookCreate"></a>
# **cellsWorkbookPutWorkbookCreate**
> WorkbookResponse cellsWorkbookPutWorkbookCreate(name, templateFile, dataFile, isWriteOver, folder, storage)

Create new workbook using deferent methods.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The new document name.
String templateFile = "templateFile_example"; // String | The template file, if the data not provided default workbook is created.
String dataFile = "dataFile_example"; // String | Smart marker data file, if the data not provided the request content is checked for the data.
Boolean isWriteOver = true; // Boolean | write over file.
String folder = "folder_example"; // String | The new document folder.
String storage = "storage_example"; // String | storage name.
try {
    WorkbookResponse result = apiInstance.cellsWorkbookPutWorkbookCreate(name, templateFile, dataFile, isWriteOver, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorkbookPutWorkbookCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The new document name. |
 **templateFile** | **String**| The template file, if the data not provided default workbook is created. | [optional]
 **dataFile** | **String**| Smart marker data file, if the data not provided the request content is checked for the data. | [optional]
 **isWriteOver** | **Boolean**| write over file. | [optional]
 **folder** | **String**| The new document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorkbookResponse**](WorkbookResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetValidationsDeleteWorksheetValidation"></a>
# **cellsWorksheetValidationsDeleteWorksheetValidation**
> ValidationResponse cellsWorksheetValidationsDeleteWorksheetValidation(name, sheetName, validationIndex, folder, storage)

Delete worksheet validation by index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer validationIndex = 56; // Integer | The validation index.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    ValidationResponse result = apiInstance.cellsWorksheetValidationsDeleteWorksheetValidation(name, sheetName, validationIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetValidationsDeleteWorksheetValidation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **validationIndex** | **Integer**| The validation index. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**ValidationResponse**](ValidationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetValidationsDeleteWorksheetValidations"></a>
# **cellsWorksheetValidationsDeleteWorksheetValidations**
> CellsCloudResponse cellsWorksheetValidationsDeleteWorksheetValidations(name, sheetName, folder, storage)

Clear all validation in worksheet.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorksheetValidationsDeleteWorksheetValidations(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetValidationsDeleteWorksheetValidations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetValidationsGetWorksheetValidation"></a>
# **cellsWorksheetValidationsGetWorksheetValidation**
> ValidationResponse cellsWorksheetValidationsGetWorksheetValidation(name, sheetName, validationIndex, folder, storage)

Get worksheet validation by index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer validationIndex = 56; // Integer | The validation index.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    ValidationResponse result = apiInstance.cellsWorksheetValidationsGetWorksheetValidation(name, sheetName, validationIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetValidationsGetWorksheetValidation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **validationIndex** | **Integer**| The validation index. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**ValidationResponse**](ValidationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetValidationsGetWorksheetValidations"></a>
# **cellsWorksheetValidationsGetWorksheetValidations**
> ValidationsResponse cellsWorksheetValidationsGetWorksheetValidations(name, sheetName, folder, storage)

Get worksheet validations.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String folder = "folder_example"; // String | Document folder.
String storage = "storage_example"; // String | storage name.
try {
    ValidationsResponse result = apiInstance.cellsWorksheetValidationsGetWorksheetValidations(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetValidationsGetWorksheetValidations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **folder** | **String**| Document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**ValidationsResponse**](ValidationsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetValidationsPostWorksheetValidation"></a>
# **cellsWorksheetValidationsPostWorksheetValidation**
> ValidationResponse cellsWorksheetValidationsPostWorksheetValidation(name, sheetName, validationIndex, validation, folder, storage)

Update worksheet validation by index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer validationIndex = 56; // Integer | The validation index.
Validation validation = new Validation(); // Validation | 
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    ValidationResponse result = apiInstance.cellsWorksheetValidationsPostWorksheetValidation(name, sheetName, validationIndex, validation, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetValidationsPostWorksheetValidation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **validationIndex** | **Integer**| The validation index. |
 **validation** | [**Validation**](Validation.md)|  | [optional]
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**ValidationResponse**](ValidationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetValidationsPutWorksheetValidation"></a>
# **cellsWorksheetValidationsPutWorksheetValidation**
> ValidationResponse cellsWorksheetValidationsPutWorksheetValidation(name, sheetName, range, validation, folder, storage)

Add worksheet validation at index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String range = "range_example"; // String | Specified cells area
Validation validation = new Validation(); // Validation | validation
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    ValidationResponse result = apiInstance.cellsWorksheetValidationsPutWorksheetValidation(name, sheetName, range, validation, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetValidationsPutWorksheetValidation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **range** | **String**| Specified cells area | [optional]
 **validation** | [**Validation**](Validation.md)| validation | [optional]
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**ValidationResponse**](ValidationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsDeleteUnprotectWorksheet"></a>
# **cellsWorksheetsDeleteUnprotectWorksheet**
> WorksheetResponse cellsWorksheetsDeleteUnprotectWorksheet(name, sheetName, protectParameter, folder, storage)

Unprotect worksheet.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
ProtectSheetParameter protectParameter = new ProtectSheetParameter(); // ProtectSheetParameter | with protection settings. Only password is used here.
String folder = "folder_example"; // String | Document folder.
String storage = "storage_example"; // String | storage name.
try {
    WorksheetResponse result = apiInstance.cellsWorksheetsDeleteUnprotectWorksheet(name, sheetName, protectParameter, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsDeleteUnprotectWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **protectParameter** | [**ProtectSheetParameter**](ProtectSheetParameter.md)| with protection settings. Only password is used here. | [optional]
 **folder** | **String**| Document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorksheetResponse**](WorksheetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsDeleteWorksheet"></a>
# **cellsWorksheetsDeleteWorksheet**
> WorksheetsResponse cellsWorksheetsDeleteWorksheet(name, sheetName, folder, storage)

Delete worksheet.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    WorksheetsResponse result = apiInstance.cellsWorksheetsDeleteWorksheet(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsDeleteWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorksheetsResponse**](WorksheetsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsDeleteWorksheetBackground"></a>
# **cellsWorksheetsDeleteWorksheetBackground**
> CellsCloudResponse cellsWorksheetsDeleteWorksheetBackground(name, sheetName, folder, storage)

Set worksheet background image.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorksheetsDeleteWorksheetBackground(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsDeleteWorksheetBackground");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsDeleteWorksheetComment"></a>
# **cellsWorksheetsDeleteWorksheetComment**
> CellsCloudResponse cellsWorksheetsDeleteWorksheetComment(name, sheetName, cellName, folder, storage)

Delete worksheet&#39;s cell comment.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String cellName = "cellName_example"; // String | The cell name
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorksheetsDeleteWorksheetComment(name, sheetName, cellName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsDeleteWorksheetComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **sheetName** | **String**| The worksheet name. |
 **cellName** | **String**| The cell name |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsDeleteWorksheetComments"></a>
# **cellsWorksheetsDeleteWorksheetComments**
> CellsCloudResponse cellsWorksheetsDeleteWorksheetComments(name, sheetName, folder, storage)

Delete all comments for worksheet.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorksheetsDeleteWorksheetComments(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsDeleteWorksheetComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsDeleteWorksheetFreezePanes"></a>
# **cellsWorksheetsDeleteWorksheetFreezePanes**
> CellsCloudResponse cellsWorksheetsDeleteWorksheetFreezePanes(name, sheetName, row, column, freezedRows, freezedColumns, folder, storage)

Unfreeze panes

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer row = 56; // Integer | 
Integer column = 56; // Integer | 
Integer freezedRows = 56; // Integer | 
Integer freezedColumns = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorksheetsDeleteWorksheetFreezePanes(name, sheetName, row, column, freezedRows, freezedColumns, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsDeleteWorksheetFreezePanes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **row** | **Integer**|  |
 **column** | **Integer**|  |
 **freezedRows** | **Integer**|  |
 **freezedColumns** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsGetNamedRanges"></a>
# **cellsWorksheetsGetNamedRanges**
> RangesResponse cellsWorksheetsGetNamedRanges(name, folder, storage)

Read worksheets ranges info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String folder = "folder_example"; // String | Document folder.
String storage = "storage_example"; // String | storage name.
try {
    RangesResponse result = apiInstance.cellsWorksheetsGetNamedRanges(name, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsGetNamedRanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **folder** | **String**| Document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**RangesResponse**](RangesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsGetWorksheet"></a>
# **cellsWorksheetsGetWorksheet**
> File cellsWorksheetsGetWorksheet(name, sheetName, format, verticalResolution, horizontalResolution, area, pageIndex, folder, storage)

Read worksheet info or export.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String format = "format_example"; // String | The exported file format.
Integer verticalResolution = 0; // Integer | Image vertical resolution.
Integer horizontalResolution = 0; // Integer | Image horizontal resolution.
String area = "area_example"; // String | Exported area.
Integer pageIndex = 56; // Integer | Exported page index.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    File result = apiInstance.cellsWorksheetsGetWorksheet(name, sheetName, format, verticalResolution, horizontalResolution, area, pageIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsGetWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **sheetName** | **String**| The worksheet name. |
 **format** | **String**| The exported file format. | [optional]
 **verticalResolution** | **Integer**| Image vertical resolution. | [optional] [default to 0]
 **horizontalResolution** | **Integer**| Image horizontal resolution. | [optional] [default to 0]
 **area** | **String**| Exported area. | [optional]
 **pageIndex** | **Integer**| Exported page index. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsGetWorksheetCalculateFormula"></a>
# **cellsWorksheetsGetWorksheetCalculateFormula**
> SingleValueResponse cellsWorksheetsGetWorksheetCalculateFormula(name, sheetName, formula, folder, storage)

Calculate formula value.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String formula = "formula_example"; // String | The formula.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    SingleValueResponse result = apiInstance.cellsWorksheetsGetWorksheetCalculateFormula(name, sheetName, formula, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsGetWorksheetCalculateFormula");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **formula** | **String**| The formula. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SingleValueResponse**](SingleValueResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsGetWorksheetComment"></a>
# **cellsWorksheetsGetWorksheetComment**
> CommentResponse cellsWorksheetsGetWorksheetComment(name, sheetName, cellName, folder, storage)

Get worksheet comment by cell name.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String cellName = "cellName_example"; // String | The cell name
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CommentResponse result = apiInstance.cellsWorksheetsGetWorksheetComment(name, sheetName, cellName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsGetWorksheetComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **sheetName** | **String**| The worksheet name. |
 **cellName** | **String**| The cell name |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CommentResponse**](CommentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsGetWorksheetComments"></a>
# **cellsWorksheetsGetWorksheetComments**
> CommentsResponse cellsWorksheetsGetWorksheetComments(name, sheetName, folder, storage)

Get worksheet comments.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CommentsResponse result = apiInstance.cellsWorksheetsGetWorksheetComments(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsGetWorksheetComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CommentsResponse**](CommentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsGetWorksheetMergedCell"></a>
# **cellsWorksheetsGetWorksheetMergedCell**
> MergedCellResponse cellsWorksheetsGetWorksheetMergedCell(name, sheetName, mergedCellIndex, folder, storage)

Get worksheet merged cell by its index.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Integer mergedCellIndex = 56; // Integer | Merged cell index.
String folder = "folder_example"; // String | Document folder.
String storage = "storage_example"; // String | storage name.
try {
    MergedCellResponse result = apiInstance.cellsWorksheetsGetWorksheetMergedCell(name, sheetName, mergedCellIndex, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsGetWorksheetMergedCell");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **mergedCellIndex** | **Integer**| Merged cell index. |
 **folder** | **String**| Document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**MergedCellResponse**](MergedCellResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsGetWorksheetMergedCells"></a>
# **cellsWorksheetsGetWorksheetMergedCells**
> MergedCellsResponse cellsWorksheetsGetWorksheetMergedCells(name, sheetName, folder, storage)

Get worksheet merged cells.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The workseet name.
String folder = "folder_example"; // String | Document folder.
String storage = "storage_example"; // String | storage name.
try {
    MergedCellsResponse result = apiInstance.cellsWorksheetsGetWorksheetMergedCells(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsGetWorksheetMergedCells");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The workseet name. |
 **folder** | **String**| Document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**MergedCellsResponse**](MergedCellsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsGetWorksheetTextItems"></a>
# **cellsWorksheetsGetWorksheetTextItems**
> TextItemsResponse cellsWorksheetsGetWorksheetTextItems(name, sheetName, folder, storage)

Get worksheet text items.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String folder = "folder_example"; // String | The workbook's folder.
String storage = "storage_example"; // String | storage name.
try {
    TextItemsResponse result = apiInstance.cellsWorksheetsGetWorksheetTextItems(name, sheetName, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsGetWorksheetTextItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **folder** | **String**| The workbook&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**TextItemsResponse**](TextItemsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsGetWorksheets"></a>
# **cellsWorksheetsGetWorksheets**
> WorksheetsResponse cellsWorksheetsGetWorksheets(name, folder, storage)

Read worksheets info.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String folder = "folder_example"; // String | Document folder.
String storage = "storage_example"; // String | storage name.
try {
    WorksheetsResponse result = apiInstance.cellsWorksheetsGetWorksheets(name, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsGetWorksheets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **folder** | **String**| Document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorksheetsResponse**](WorksheetsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPostAutofitWorksheetColumns"></a>
# **cellsWorksheetsPostAutofitWorksheetColumns**
> CellsCloudResponse cellsWorksheetsPostAutofitWorksheetColumns(name, sheetName, firstColumn, lastColumn, autoFitterOptions, firstRow, lastRow, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer firstColumn = 56; // Integer | 
Integer lastColumn = 56; // Integer | 
AutoFitterOptions autoFitterOptions = new AutoFitterOptions(); // AutoFitterOptions | 
Integer firstRow = 56; // Integer | 
Integer lastRow = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorksheetsPostAutofitWorksheetColumns(name, sheetName, firstColumn, lastColumn, autoFitterOptions, firstRow, lastRow, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsPostAutofitWorksheetColumns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **firstColumn** | **Integer**|  |
 **lastColumn** | **Integer**|  |
 **autoFitterOptions** | [**AutoFitterOptions**](AutoFitterOptions.md)|  | [optional]
 **firstRow** | **Integer**|  | [optional]
 **lastRow** | **Integer**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPostAutofitWorksheetRow"></a>
# **cellsWorksheetsPostAutofitWorksheetRow**
> CellsCloudResponse cellsWorksheetsPostAutofitWorksheetRow(name, sheetName, rowIndex, firstColumn, lastColumn, autoFitterOptions, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer rowIndex = 56; // Integer | 
Integer firstColumn = 56; // Integer | 
Integer lastColumn = 56; // Integer | 
AutoFitterOptions autoFitterOptions = new AutoFitterOptions(); // AutoFitterOptions | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorksheetsPostAutofitWorksheetRow(name, sheetName, rowIndex, firstColumn, lastColumn, autoFitterOptions, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsPostAutofitWorksheetRow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **rowIndex** | **Integer**|  |
 **firstColumn** | **Integer**|  |
 **lastColumn** | **Integer**|  |
 **autoFitterOptions** | [**AutoFitterOptions**](AutoFitterOptions.md)|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPostAutofitWorksheetRows"></a>
# **cellsWorksheetsPostAutofitWorksheetRows**
> CellsCloudResponse cellsWorksheetsPostAutofitWorksheetRows(name, sheetName, autoFitterOptions, startRow, endRow, onlyAuto, folder, storage)

Autofit worksheet rows.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
AutoFitterOptions autoFitterOptions = new AutoFitterOptions(); // AutoFitterOptions | Auto Fitter Options.
Integer startRow = 56; // Integer | Start row.
Integer endRow = 56; // Integer | End row.
Boolean onlyAuto = false; // Boolean | Only auto.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorksheetsPostAutofitWorksheetRows(name, sheetName, autoFitterOptions, startRow, endRow, onlyAuto, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsPostAutofitWorksheetRows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **autoFitterOptions** | [**AutoFitterOptions**](AutoFitterOptions.md)| Auto Fitter Options. | [optional]
 **startRow** | **Integer**| Start row. | [optional]
 **endRow** | **Integer**| End row. | [optional]
 **onlyAuto** | **Boolean**| Only auto. | [optional] [default to false]
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPostCopyWorksheet"></a>
# **cellsWorksheetsPostCopyWorksheet**
> CellsCloudResponse cellsWorksheetsPostCopyWorksheet(name, sheetName, sourceSheet, options, sourceWorkbook, sourceFolder, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String sourceSheet = "sourceSheet_example"; // String | 
CopyOptions options = new CopyOptions(); // CopyOptions | 
String sourceWorkbook = "sourceWorkbook_example"; // String | 
String sourceFolder = "sourceFolder_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorksheetsPostCopyWorksheet(name, sheetName, sourceSheet, options, sourceWorkbook, sourceFolder, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsPostCopyWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **sourceSheet** | **String**|  |
 **options** | [**CopyOptions**](CopyOptions.md)|  | [optional]
 **sourceWorkbook** | **String**|  | [optional]
 **sourceFolder** | **String**|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPostMoveWorksheet"></a>
# **cellsWorksheetsPostMoveWorksheet**
> WorksheetsResponse cellsWorksheetsPostMoveWorksheet(name, sheetName, moving, folder, storage)

Move worksheet.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
WorksheetMovingRequest moving = new WorksheetMovingRequest(); // WorksheetMovingRequest | with moving parameters.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    WorksheetsResponse result = apiInstance.cellsWorksheetsPostMoveWorksheet(name, sheetName, moving, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsPostMoveWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **moving** | [**WorksheetMovingRequest**](WorksheetMovingRequest.md)| with moving parameters. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorksheetsResponse**](WorksheetsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPostRenameWorksheet"></a>
# **cellsWorksheetsPostRenameWorksheet**
> CellsCloudResponse cellsWorksheetsPostRenameWorksheet(name, sheetName, newname, folder, storage)

Rename worksheet

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
String newname = "newname_example"; // String | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorksheetsPostRenameWorksheet(name, sheetName, newname, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsPostRenameWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **newname** | **String**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPostUpdateWorksheetProperty"></a>
# **cellsWorksheetsPostUpdateWorksheetProperty**
> WorksheetResponse cellsWorksheetsPostUpdateWorksheetProperty(name, sheetName, sheet, folder, storage)

Update worksheet property

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Worksheet sheet = new Worksheet(); // Worksheet | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    WorksheetResponse result = apiInstance.cellsWorksheetsPostUpdateWorksheetProperty(name, sheetName, sheet, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsPostUpdateWorksheetProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **sheet** | [**Worksheet**](Worksheet.md)|  | [optional]
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorksheetResponse**](WorksheetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPostUpdateWorksheetZoom"></a>
# **cellsWorksheetsPostUpdateWorksheetZoom**
> CellsCloudResponse cellsWorksheetsPostUpdateWorksheetZoom(name, sheetName, value, folder, storage)



### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer value = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorksheetsPostUpdateWorksheetZoom(name, sheetName, value, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsPostUpdateWorksheetZoom");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **value** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPostWorksheetComment"></a>
# **cellsWorksheetsPostWorksheetComment**
> CellsCloudResponse cellsWorksheetsPostWorksheetComment(name, sheetName, cellName, comment, folder, storage)

Update worksheet&#39;s cell comment.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String cellName = "cellName_example"; // String | The cell name
Comment comment = new Comment(); // Comment | Comment object
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorksheetsPostWorksheetComment(name, sheetName, cellName, comment, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsPostWorksheetComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **sheetName** | **String**| The worksheet name. |
 **cellName** | **String**| The cell name |
 **comment** | [**Comment**](Comment.md)| Comment object | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPostWorksheetRangeSort"></a>
# **cellsWorksheetsPostWorksheetRangeSort**
> CellsCloudResponse cellsWorksheetsPostWorksheetRangeSort(name, sheetName, cellArea, dataSorter, folder, storage)

Sort worksheet range.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The workbook name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String cellArea = "cellArea_example"; // String | The range to sort.
DataSorter dataSorter = new DataSorter(); // DataSorter | with sorting settings.
String folder = "folder_example"; // String | The workbook folder.
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorksheetsPostWorksheetRangeSort(name, sheetName, cellArea, dataSorter, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsPostWorksheetRangeSort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The workbook name. |
 **sheetName** | **String**| The worksheet name. |
 **cellArea** | **String**| The range to sort. |
 **dataSorter** | [**DataSorter**](DataSorter.md)| with sorting settings. | [optional]
 **folder** | **String**| The workbook folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPostWorksheetTextSearch"></a>
# **cellsWorksheetsPostWorksheetTextSearch**
> TextItemsResponse cellsWorksheetsPostWorksheetTextSearch(name, sheetName, text, folder, storage)

Search text.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String text = "text_example"; // String | Text to search.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    TextItemsResponse result = apiInstance.cellsWorksheetsPostWorksheetTextSearch(name, sheetName, text, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsPostWorksheetTextSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **text** | **String**| Text to search. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**TextItemsResponse**](TextItemsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPostWorsheetTextReplace"></a>
# **cellsWorksheetsPostWorsheetTextReplace**
> WorksheetReplaceResponse cellsWorksheetsPostWorsheetTextReplace(name, sheetName, oldValue, newValue, folder, storage)

Replace text.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
String oldValue = "oldValue_example"; // String | The old text to replace.
String newValue = "newValue_example"; // String | The new text to replace by.
String folder = "folder_example"; // String | Document's folder.
String storage = "storage_example"; // String | storage name.
try {
    WorksheetReplaceResponse result = apiInstance.cellsWorksheetsPostWorsheetTextReplace(name, sheetName, oldValue, newValue, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsPostWorsheetTextReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **oldValue** | **String**| The old text to replace. |
 **newValue** | **String**| The new text to replace by. |
 **folder** | **String**| Document&#39;s folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorksheetReplaceResponse**](WorksheetReplaceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPutAddNewWorksheet"></a>
# **cellsWorksheetsPutAddNewWorksheet**
> WorksheetsResponse cellsWorksheetsPutAddNewWorksheet(name, sheetName, position, sheettype, folder, storage)

Add new worksheet.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The new sheet name.
Integer position = 56; // Integer | The new sheet position.
String sheettype = "sheettype_example"; // String | The new sheet type.
String folder = "folder_example"; // String | Document folder.
String storage = "storage_example"; // String | storage name.
try {
    WorksheetsResponse result = apiInstance.cellsWorksheetsPutAddNewWorksheet(name, sheetName, position, sheettype, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsPutAddNewWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The new sheet name. |
 **position** | **Integer**| The new sheet position. | [optional]
 **sheettype** | **String**| The new sheet type. | [optional]
 **folder** | **String**| Document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorksheetsResponse**](WorksheetsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPutChangeVisibilityWorksheet"></a>
# **cellsWorksheetsPutChangeVisibilityWorksheet**
> WorksheetResponse cellsWorksheetsPutChangeVisibilityWorksheet(name, sheetName, isVisible, folder, storage)

Change worksheet visibility.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | Worksheet name.
Boolean isVisible = true; // Boolean | New worksheet visibility value.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    WorksheetResponse result = apiInstance.cellsWorksheetsPutChangeVisibilityWorksheet(name, sheetName, isVisible, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsPutChangeVisibilityWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| Worksheet name. |
 **isVisible** | **Boolean**| New worksheet visibility value. |
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorksheetResponse**](WorksheetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPutProtectWorksheet"></a>
# **cellsWorksheetsPutProtectWorksheet**
> WorksheetResponse cellsWorksheetsPutProtectWorksheet(name, sheetName, protectParameter, folder, storage)

Protect worksheet.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | Document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
ProtectSheetParameter protectParameter = new ProtectSheetParameter(); // ProtectSheetParameter | with protection settings.
String folder = "folder_example"; // String | Document folder.
String storage = "storage_example"; // String | storage name.
try {
    WorksheetResponse result = apiInstance.cellsWorksheetsPutProtectWorksheet(name, sheetName, protectParameter, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsPutProtectWorksheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Document name. |
 **sheetName** | **String**| The worksheet name. |
 **protectParameter** | [**ProtectSheetParameter**](ProtectSheetParameter.md)| with protection settings. | [optional]
 **folder** | **String**| Document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**WorksheetResponse**](WorksheetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPutWorksheetBackground"></a>
# **cellsWorksheetsPutWorksheetBackground**
> CellsCloudResponse cellsWorksheetsPutWorksheetBackground(name, sheetName, png, folder, storage)

Set worksheet background image.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
byte[] png = BINARY_DATA_HERE; // byte[] | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorksheetsPutWorksheetBackground(name, sheetName, png, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsPutWorksheetBackground");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **png** | **byte[]**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPutWorksheetComment"></a>
# **cellsWorksheetsPutWorksheetComment**
> CommentResponse cellsWorksheetsPutWorksheetComment(name, sheetName, cellName, comment, folder, storage)

Add worksheet&#39;s cell comment.

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | The document name.
String sheetName = "sheetName_example"; // String | The worksheet name.
String cellName = "cellName_example"; // String | The cell name
Comment comment = new Comment(); // Comment | Comment object
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    CommentResponse result = apiInstance.cellsWorksheetsPutWorksheetComment(name, sheetName, cellName, comment, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsPutWorksheetComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **sheetName** | **String**| The worksheet name. |
 **cellName** | **String**| The cell name |
 **comment** | [**Comment**](Comment.md)| Comment object | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CommentResponse**](CommentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cellsWorksheetsPutWorksheetFreezePanes"></a>
# **cellsWorksheetsPutWorksheetFreezePanes**
> CellsCloudResponse cellsWorksheetsPutWorksheetFreezePanes(name, sheetName, row, column, freezedRows, freezedColumns, folder, storage)

Set freeze panes

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String name = "name_example"; // String | 
String sheetName = "sheetName_example"; // String | 
Integer row = 56; // Integer | 
Integer column = 56; // Integer | 
Integer freezedRows = 56; // Integer | 
Integer freezedColumns = 56; // Integer | 
String folder = "folder_example"; // String | 
String storage = "storage_example"; // String | storage name.
try {
    CellsCloudResponse result = apiInstance.cellsWorksheetsPutWorksheetFreezePanes(name, sheetName, row, column, freezedRows, freezedColumns, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#cellsWorksheetsPutWorksheetFreezePanes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **sheetName** | **String**|  |
 **row** | **Integer**|  |
 **column** | **Integer**|  |
 **freezedRows** | **Integer**|  |
 **freezedColumns** | **Integer**|  |
 **folder** | **String**|  | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**CellsCloudResponse**](CellsCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="copyFile"></a>
# **copyFile**
> copyFile(srcPath, destPath, srcStorageName, destStorageName, versionId)

Copy file

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String srcPath = "srcPath_example"; // String | Source file path e.g. '/folder/file.ext'
String destPath = "destPath_example"; // String | Destination file path
String srcStorageName = "srcStorageName_example"; // String | Source storage name
String destStorageName = "destStorageName_example"; // String | Destination storage name
String versionId = "versionId_example"; // String | File version ID to copy
try {
    apiInstance.copyFile(srcPath, destPath, srcStorageName, destStorageName, versionId);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#copyFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source file path e.g. &#39;/folder/file.ext&#39; |
 **destPath** | **String**| Destination file path |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]
 **versionId** | **String**| File version ID to copy | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="copyFolder"></a>
# **copyFolder**
> copyFolder(srcPath, destPath, srcStorageName, destStorageName)

Copy folder

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String srcPath = "srcPath_example"; // String | Source folder path e.g. '/src'
String destPath = "destPath_example"; // String | Destination folder path e.g. '/dst'
String srcStorageName = "srcStorageName_example"; // String | Source storage name
String destStorageName = "destStorageName_example"; // String | Destination storage name
try {
    apiInstance.copyFolder(srcPath, destPath, srcStorageName, destStorageName);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#copyFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source folder path e.g. &#39;/src&#39; |
 **destPath** | **String**| Destination folder path e.g. &#39;/dst&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createFolder"></a>
# **createFolder**
> createFolder(path, storageName)

Create the folder

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String path = "path_example"; // String | Folder path to create e.g. 'folder_1/folder_2/'
String storageName = "storageName_example"; // String | Storage name
try {
    apiInstance.createFolder(path, storageName);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#createFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path to create e.g. &#39;folder_1/folder_2/&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFile"></a>
# **deleteFile**
> deleteFile(path, storageName, versionId)

Delete file

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String path = "path_example"; // String | File path e.g. '/folder/file.ext'
String storageName = "storageName_example"; // String | Storage name
String versionId = "versionId_example"; // String | File version ID to delete
try {
    apiInstance.deleteFile(path, storageName, versionId);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#deleteFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID to delete | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFolder"></a>
# **deleteFolder**
> deleteFolder(path, storageName, recursive)

Delete folder

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String path = "path_example"; // String | Folder path e.g. '/folder'
String storageName = "storageName_example"; // String | Storage name
Boolean recursive = false; // Boolean | Enable to delete folders, subfolders and files
try {
    apiInstance.deleteFolder(path, storageName, recursive);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#deleteFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path e.g. &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]
 **recursive** | **Boolean**| Enable to delete folders, subfolders and files | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="downloadFile"></a>
# **downloadFile**
> File downloadFile(path, storageName, versionId)

Download file

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String path = "path_example"; // String | File path e.g. '/folder/file.ext'
String storageName = "storageName_example"; // String | Storage name
String versionId = "versionId_example"; // String | File version ID to download
try {
    File result = apiInstance.downloadFile(path, storageName, versionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#downloadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID to download | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getDiscUsage"></a>
# **getDiscUsage**
> DiscUsage getDiscUsage(storageName)

Get disc usage

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String storageName = "storageName_example"; // String | Storage name
try {
    DiscUsage result = apiInstance.getDiscUsage(storageName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#getDiscUsage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageName** | **String**| Storage name | [optional]

### Return type

[**DiscUsage**](DiscUsage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFileVersions"></a>
# **getFileVersions**
> FileVersions getFileVersions(path, storageName)

Get file versions

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String path = "path_example"; // String | File path e.g. '/file.ext'
String storageName = "storageName_example"; // String | Storage name
try {
    FileVersions result = apiInstance.getFileVersions(path, storageName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#getFileVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FileVersions**](FileVersions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFilesList"></a>
# **getFilesList**
> FilesList getFilesList(path, storageName)

Get all files and folders within a folder

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String path = "path_example"; // String | Folder path e.g. '/folder'
String storageName = "storageName_example"; // String | Storage name
try {
    FilesList result = apiInstance.getFilesList(path, storageName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#getFilesList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path e.g. &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FilesList**](FilesList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="moveFile"></a>
# **moveFile**
> moveFile(srcPath, destPath, srcStorageName, destStorageName, versionId)

Move file

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String srcPath = "srcPath_example"; // String | Source file path e.g. '/src.ext'
String destPath = "destPath_example"; // String | Destination file path e.g. '/dest.ext'
String srcStorageName = "srcStorageName_example"; // String | Source storage name
String destStorageName = "destStorageName_example"; // String | Destination storage name
String versionId = "versionId_example"; // String | File version ID to move
try {
    apiInstance.moveFile(srcPath, destPath, srcStorageName, destStorageName, versionId);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#moveFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source file path e.g. &#39;/src.ext&#39; |
 **destPath** | **String**| Destination file path e.g. &#39;/dest.ext&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]
 **versionId** | **String**| File version ID to move | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="moveFolder"></a>
# **moveFolder**
> moveFolder(srcPath, destPath, srcStorageName, destStorageName)

Move folder

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String srcPath = "srcPath_example"; // String | Folder path to move e.g. '/folder'
String destPath = "destPath_example"; // String | Destination folder path to move to e.g '/dst'
String srcStorageName = "srcStorageName_example"; // String | Source storage name
String destStorageName = "destStorageName_example"; // String | Destination storage name
try {
    apiInstance.moveFolder(srcPath, destPath, srcStorageName, destStorageName);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#moveFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Folder path to move e.g. &#39;/folder&#39; |
 **destPath** | **String**| Destination folder path to move to e.g &#39;/dst&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="oAuthPost"></a>
# **oAuthPost**
> AccessTokenResponse oAuthPost(grantType, clientId, clientSecret)

Get Access token

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String grantType = "grantType_example"; // String | Grant Type
String clientId = "clientId_example"; // String | App SID
String clientSecret = "clientSecret_example"; // String | App Key
try {
    AccessTokenResponse result = apiInstance.oAuthPost(grantType, clientId, clientSecret);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#oAuthPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | **String**| Grant Type |
 **clientId** | **String**| App SID |
 **clientSecret** | **String**| App Key |

### Return type

[**AccessTokenResponse**](AccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="objectExists"></a>
# **objectExists**
> ObjectExist objectExists(path, storageName, versionId)

Check if file or folder exists

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String path = "path_example"; // String | File or folder path e.g. '/file.ext' or '/folder'
String storageName = "storageName_example"; // String | Storage name
String versionId = "versionId_example"; // String | File version ID
try {
    ObjectExist result = apiInstance.objectExists(path, storageName, versionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#objectExists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File or folder path e.g. &#39;/file.ext&#39; or &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID | [optional]

### Return type

[**ObjectExist**](ObjectExist.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="storageExists"></a>
# **storageExists**
> StorageExist storageExists(storageName)

Check if storage exists

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String storageName = "storageName_example"; // String | Storage name
try {
    StorageExist result = apiInstance.storageExists(storageName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#storageExists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageName** | **String**| Storage name |

### Return type

[**StorageExist**](StorageExist.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadFile"></a>
# **uploadFile**
> FilesUploadResult uploadFile(path, file, storageName)

Upload file

### Example
```java
// Import classes:
//import com.aspose.cloud.cells.client.ApiException;
//import com.aspose.cloud.cells.api.CellsApi;


CellsApi apiInstance = new CellsApi();
String path = "path_example"; // String | Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext             If the content is multipart and path does not contains the file name it tries to get them from filename parameter             from Content-Disposition header.             
File file = new File("/path/to/file.txt"); // File | File to upload
String storageName = "storageName_example"; // String | Storage name
try {
    FilesUploadResult result = apiInstance.uploadFile(path, file, storageName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CellsApi#uploadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext             If the content is multipart and path does not contains the file name it tries to get them from filename parameter             from Content-Disposition header.              |
 **file** | **File**| File to upload |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FilesUploadResult**](FilesUploadResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

