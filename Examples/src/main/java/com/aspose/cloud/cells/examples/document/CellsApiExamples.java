

package com.aspose.cloud.cells.examples.document;
import java.util.ArrayList;
import java.util.List;

import com.aspose.cloud.cells.api.CellsApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Utils;
import com.aspose.cloud.cells.model.CalculationOptions;
import com.aspose.cloud.cells.model.CellResponse;
import com.aspose.cloud.cells.model.CellsResponse;
import com.aspose.cloud.cells.model.ColumnResponse;
import com.aspose.cloud.cells.model.ColumnsResponse;
import com.aspose.cloud.cells.model.Font;
import com.aspose.cloud.cells.model.FontSetting;
import com.aspose.cloud.cells.model.RowResponse;
import com.aspose.cloud.cells.model.RowsResponse;
import com.aspose.cloud.cells.model.SaaSposeResponse;
import com.aspose.cloud.cells.model.Style;
import com.aspose.cloud.cells.model.StyleResponse;



/**
 * API Examples for CellsApi
 */

public class CellsApiExamples {

    private final CellsApi api = new CellsApi();

    private String BOOK1 = "Book1.xlsx";
    private String MYDOC = "myDocument.xlsx";
    private String PivExampleFile = "ExampleCase.xlsx";
    private String TEMPFOLDER = "Temp";
    private String SHEET1 = "Sheet1";
    private String SHEET2 = "Sheet2";
    private String SHEET3 = "Sheet3";
    private String SHEET4 = "Sheet4";
    private String SHEET5 = "Sheet5";
    private String SHEET6 = "Sheet6";
    private String SHEET7 = "Sheet7";
    private String SHEET8 = "Sheet8";
    private String CellName = "A1";
    private String RANGE = "A1:C10";
    private String CELLAREA = "A1:C10";
    
 
    
    
    public void cellsDeleteWorksheetColumnsExample() throws Exception {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer columnIndex = 1;
        Integer columns = 1;
        Boolean updateReference = true;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        ColumnsResponse response = api.cellsDeleteWorksheetColumns(name, sheetName, columnIndex, columns, updateReference, folder,null);

       
    }
    

    
    public void cellsDeleteWorksheetRowExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer rowIndex = 1;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsDeleteWorksheetRow(name, sheetName, rowIndex, folder,null);

       
    }
    
   
    
    public void cellsDeleteWorksheetRowsExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer startrow = 1;
        Integer totalRows = 2;
        Boolean updateReference = true;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsDeleteWorksheetRows(name, sheetName, startrow, totalRows, updateReference, folder,null);

        System.out.print(response.getCode());

    }
    

    
    public void cellsGetWorksheetCellExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String cellOrMethodName = "A1";
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        Object response = api.cellsGetWorksheetCell(name, sheetName, cellOrMethodName, folder,null);



    }
    

    
    public void cellsGetWorksheetCellStyleExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String cellName = "A1";
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        StyleResponse response = api.cellsGetWorksheetCellStyle(name, sheetName, cellName, folder,null);
        System.out.print(response.getCode());

       
    }
    
    /**
     * Get cells info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    
    public void cellsGetWorksheetCellsExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer offest = 1;
        Integer count = 10;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        CellsResponse response = api.cellsGetWorksheetCells(name, sheetName, offest, count, folder,null);
        System.out.print(response.getCode());

       
    }
    
  
    
    public void cellsGetWorksheetColumnExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer columnIndex = 1;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        ColumnResponse response = api.cellsGetWorksheetColumn(name, sheetName, columnIndex, folder,null);
        System.out.print(response.getCode());

       
    }
    

    
    public void cellsGetWorksheetColumnsExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        ColumnsResponse response = api.cellsGetWorksheetColumns(name, sheetName, folder,null);
        System.out.print(response.getCode());

        System.out.print(response.getCode());

    }
    

    
    public void cellsGetWorksheetRowExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer rowIndex = 1;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        RowResponse response = api.cellsGetWorksheetRow(name, sheetName, rowIndex, folder,null);
        System.out.print(response.getCode());

       
    }
    
    /**
     * Read worksheet rows info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    
    public void cellsGetWorksheetRowsExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        RowsResponse response = api.cellsGetWorksheetRows(name, sheetName, folder,null);
        System.out.print(response.getCode());

       
    }
    

    
    public void cellsPostCellCalculateExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String cellName = CellName;
        CalculationOptions options = new CalculationOptions();
        options.setRecursive(true);
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPostCellCalculate(name, sheetName, cellName, options, folder,null);
        System.out.print(response.getCode());

       
    }
    

    
    public void cellsPostCellCharactersExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET2;
        String cellName = "G8";
        List<FontSetting> options = new ArrayList<FontSetting>();
        Font font = new Font();
        font.setSize(10); 
        FontSetting fs1 = new FontSetting();
        fs1.setFont(font); 
        fs1.setLength(2);
        fs1.setStartIndex(0);
        options.add(fs1);
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPostCellCharacters(name, sheetName, cellName, options, folder,null);

        System.out.print(response.getCode());

    }
    

    
    public void cellsPostClearContentsExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String range = RANGE;
        Integer startRow = 1;
        Integer startColumn = 2;
        Integer endRow = 10;
        Integer endColumn = 7;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPostClearContents(name, sheetName, range, startRow, startColumn, endRow, endColumn, folder,null);
        System.out.print(response.getCode());

       
    }
    

    
    public void cellsPostClearFormatsExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String range = RANGE;
        Integer startRow = 1;
        Integer startColumn = 1;
        Integer endRow = 7;
        Integer endColumn = 6;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPostClearFormats(name, sheetName, range, startRow, startColumn, endRow, endColumn, folder,null);

        System.out.print(response.getCode());

    }

    public void cellsPostColumnStyleExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer columnIndex = 1;
        Style style = new Style();
        Font font = new  Font();
        font.setSize(10);
        style.setFont(font);
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPostColumnStyle(name, sheetName, columnIndex, style, folder,null);
        System.out.print(response.getCode());

       
    }
    

    
    public void cellsPostCopyCellIntoCellExample() throws ApiException {
        String name = BOOK1;
        String destCellName = "C1";
        String sheetName = SHEET1;
        String worksheet = SHEET2;
        String cellname = CellName;
        Integer row = 1;
        Integer column = 1;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPostCopyCellIntoCell(name, destCellName, sheetName, worksheet, cellname, row, column, folder,null);

        System.out.print(response.getCode());

    }
    

    
    public void cellsPostCopyWorksheetColumnsExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer sourceColumnIndex = 1;
        Integer destinationColumnIndex = 2;
        Integer columnNumber = 1;
        String worksheet = SHEET2;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPostCopyWorksheetColumns(name, sheetName, sourceColumnIndex, destinationColumnIndex, columnNumber, worksheet, folder,null);
        System.out.print(response.getCode());

       
    }
    

    
    public void cellsPostCopyWorksheetRowsExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer sourceRowIndex = 1;
        Integer destinationRowIndex = 1;
        Integer rowNumber = 1;
        String worksheet = SHEET2;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPostCopyWorksheetRows(name, sheetName, sourceRowIndex, destinationRowIndex, rowNumber, worksheet, folder,null);
        System.out.print(response.getCode());

       
    }
    

    
    public void cellsPostGroupWorksheetColumnsExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer firstIndex = 1;
        Integer lastIndex = 1;
        Boolean hide = true;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPostGroupWorksheetColumns(name, sheetName, firstIndex, lastIndex, hide, folder,null);
        System.out.print(response.getCode());

       
    }
    

    
    public void cellsPostGroupWorksheetRowsExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer firstIndex = 1;
        Integer lastIndex = 1;
        Boolean hide = true;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPostGroupWorksheetRows(name, sheetName, firstIndex, lastIndex, hide, folder,null);
        System.out.print(response.getCode());

       
    }
    

    
    public void cellsPostHideWorksheetColumnsExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer startColumn = 1;
        Integer totalColumns = 1;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPostHideWorksheetColumns(name, sheetName, startColumn, totalColumns, folder,null);

        System.out.print(response.getCode());

    }
    

    
    public void cellsPostHideWorksheetRowsExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer startrow = 1;
        Integer totalRows = 1;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPostHideWorksheetRows(name, sheetName, startrow, totalRows, folder,null);
        System.out.print(response.getCode());

       
    }
    

    
    public void cellsPostRowStyleExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer rowIndex = 1;
        Style style = new Style();
        Font font = new Font();
        font.setSize(10);
        style.setFont(font);
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPostRowStyle(name, sheetName, rowIndex, style, folder,null);

        System.out.print(response.getCode());

    }

    
    public void cellsPostSetCellHtmlStringExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String cellName = CellName;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        CellResponse response = api.cellsPostSetCellHtmlString(name, sheetName, cellName, folder,null);
        System.out.print(response.getCode());

       
    }
    

    
    public void cellsPostSetCellRangeValueExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String cellarea = CELLAREA;
        String value = "2017-10-1";
        String type = "Date";
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPostSetCellRangeValue(name, sheetName, cellarea, value, type, folder,null);
        System.out.print(response.getCode());

       
    }

    
    public void cellsPostSetWorksheetColumnWidthExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer columnIndex = 1;
        Double width = 10.0;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        ColumnResponse response = api.cellsPostSetWorksheetColumnWidth(name, sheetName, columnIndex, width, folder,null);
        System.out.print(response.getCode());

       
    }
    

    public void cellsPostUngroupWorksheetColumnsExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer firstIndex = 1;
        Integer lastIndex = 10;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPostUngroupWorksheetColumns(name, sheetName, firstIndex, lastIndex, folder,null);

       
    }
    

    public void cellsPostUngroupWorksheetRowsExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer firstIndex = 1;
        Integer lastIndex = 10;
        Boolean isAll = true;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPostUngroupWorksheetRows(name, sheetName, firstIndex, lastIndex, isAll, folder,null);

        System.out.print(response.getCode());

    }
    

    
    public void cellsPostUnhideWorksheetColumnsExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer startcolumn = 1;
        Integer totalColumns = 10;
        Double width = 10.0;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPostUnhideWorksheetColumns(name, sheetName, startcolumn, totalColumns, width, folder,null);

        System.out.print(response.getCode());

    }

    
    public void cellsPostUnhideWorksheetRowsExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer startrow = 1;
        Integer totalRows = 1;
        Double height = 10.0;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPostUnhideWorksheetRows(name, sheetName, startrow, totalRows, height, folder,null);

       
    }

    
    public void cellsPostUpdateWorksheetCellStyleExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String cellName = CellName;
        Style style = new Style();
        Font font = new Font();
        font.setSize(10);
        style.setFont(font);
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        StyleResponse response = api.cellsPostUpdateWorksheetCellStyle(name, sheetName, cellName, style, folder,null);
        System.out.print(response.getCode());

       
    }
    

    
    public void cellsPostUpdateWorksheetRangeStyleExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String range = RANGE;
        Style style = new Style();
        Font font = new Font();
        font.setSize(10);
        style.setFont(font);
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPostUpdateWorksheetRangeStyle(name, sheetName, range, style, folder,null);
        System.out.print(response.getCode());

       
    }
    

    
    public void cellsPostUpdateWorksheetRowExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer rowIndex = 1;
        Double height = 10.01;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        RowResponse response = api.cellsPostUpdateWorksheetRow(name, sheetName, rowIndex, height, folder,null);
        System.out.print(response.getCode());

       
    }
    

    
    public void cellsPostWorksheetCellSetValueExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String cellName = CellName;
        String value = "2018-08-28";
        String type = "Date";
        String formula = "=Now()";
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        CellResponse response = api.cellsPostWorksheetCellSetValue(name, sheetName, cellName, value, type, formula, folder,null);

        System.out.print(response.getCode());

    }
    

    
    public void cellsPostWorksheetMergeExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer startRow = 1;
        Integer startColumn = 1;
        Integer totalRows = 7;
        Integer totalColumns = 6;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPostWorksheetMerge(name, sheetName, startRow, startColumn, totalRows, totalColumns, folder,null);

        System.out.print(response.getCode());

    }
    

    
    public void cellsPostWorksheetUnmergeExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer startRow = 1;
        Integer startColumn = 1;
        Integer totalRows = 6;
        Integer totalColumns = 6;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPostWorksheetUnmerge(name, sheetName, startRow, startColumn, totalRows, totalColumns, folder,null);

        System.out.print(response.getCode());

    }
    

    
    public void cellsPutInsertWorksheetColumnsExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer columnIndex = 1;
        Integer columns = 2;
        Boolean updateReference = true;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        ColumnsResponse response = api.cellsPutInsertWorksheetColumns(name, sheetName, columnIndex, columns, updateReference, folder,null);
        System.out.print(response.getCode());
       
    }
    

    
    public void cellsPutInsertWorksheetRowExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer rowIndex = 1;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        RowResponse response = api.cellsPutInsertWorksheetRow(name, sheetName, rowIndex, folder,null);
        System.out.print(response.getCode());

    }
    

    
    public void cellsPutInsertWorksheetRowsExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer startrow = 1;
        Integer totalRows = 10;
        Boolean updateReference = true;
        String folder = TEMPFOLDER;
        api.setApiClient(Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPutInsertWorksheetRows(name, sheetName, startrow, totalRows, updateReference, folder,null);

    }
    
}