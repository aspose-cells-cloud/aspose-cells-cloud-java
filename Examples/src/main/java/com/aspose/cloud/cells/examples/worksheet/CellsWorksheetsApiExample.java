package com.aspose.cloud.cells.examples.worksheet;
import java.io.File;

import com.aspose.cloud.cells.api.CellsWorksheetsApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Base;
import com.aspose.cloud.cells.model.AutoFitterOptions;
import com.aspose.cloud.cells.model.Comment;
import com.aspose.cloud.cells.model.CommentResponse;
import com.aspose.cloud.cells.model.CommentsResponse;
import com.aspose.cloud.cells.model.CopyOptions;
import com.aspose.cloud.cells.model.DataSorter;
import com.aspose.cloud.cells.model.MergedCellResponse;
import com.aspose.cloud.cells.model.MergedCellsResponse;
import com.aspose.cloud.cells.model.ProtectSheetParameter;
import com.aspose.cloud.cells.model.RangesResponse;
import com.aspose.cloud.cells.model.SaaSposeResponse;
import com.aspose.cloud.cells.model.SingleValueResponse;
import com.aspose.cloud.cells.model.TextItemsResponse;
import com.aspose.cloud.cells.model.Worksheet;
import com.aspose.cloud.cells.model.WorksheetMovingRequest;
import com.aspose.cloud.cells.model.WorksheetReplaceResponse;
import com.aspose.cloud.cells.model.WorksheetResponse;
import com.aspose.cloud.cells.model.WorksheetsResponse;


public class CellsWorksheetsApiExample extends Base{

    private final CellsWorksheetsApi api = new CellsWorksheetsApi();

    public void cellsWorksheetsDeleteUnprotectWorksheetExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        ProtectSheetParameter protectParameter = new ProtectSheetParameter();
        protectParameter.setProtectionType("All");
        protectParameter.setPassword("123456");
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        WorksheetResponse response = api.cellsWorksheetsDeleteUnprotectWorksheet(name, sheetName, protectParameter, folder,null);

        System.out.println(response);
    }
    

    public void cellsWorksheetsDeleteWorkSheetBackgroundExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorksheetsDeleteWorksheetBackground(name, sheetName, folder,null);

        System.out.println(response);
    }
    
    
    public void cellsWorksheetsDeleteWorkSheetCommentExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String cellName = "C1";
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorksheetsDeleteWorksheetComment(name, sheetName, cellName, folder,null);

        System.out.println(response);
    }
    

    public void cellsWorksheetsDeleteWorkSheetCommentsExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorksheetsDeleteWorksheetComments(name, sheetName, folder,null);

        System.out.println(response);
    }
    

    public void cellsWorksheetsDeleteWorksheetExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        WorksheetsResponse response = api.cellsWorksheetsDeleteWorksheet(name, sheetName, folder,null);

        System.out.println(response);
    }
    
   
    public void cellsWorksheetsDeleteWorksheetFreezePanesExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer row = 1;
        Integer column = 1;
        Integer freezedRows = 2;
        Integer freezedColumns = 2;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorksheetsDeleteWorksheetFreezePanes(name, sheetName, row, column, freezedRows, freezedColumns, folder,null);

        System.out.println(response);
    }
    
    
    public void cellsWorksheetsGetNamedRangesExample() throws ApiException {
       String name = BOOK1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        RangesResponse response = api.cellsWorksheetsGetNamedRanges(name, folder,null);

        System.out.println(response);
    }
    
    
    public void cellsWorksheetsGetWorkSheetExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer verticalResolution = 100;
        Integer horizontalResolution = 90;
        String format = "png";
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        File response = api.cellsWorksheetsGetWorksheet(name, sheetName, format,verticalResolution, horizontalResolution, folder,null);

       writeFileTo(response);
    }
    
   
    public void cellsWorksheetsGetWorkSheetCalculateFormulaExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String formula = "=NOW()";
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SingleValueResponse response = api.cellsWorksheetsGetWorksheetCalculateFormula(name, sheetName, formula, folder,null);

        System.out.println(response);
    }
    
   
    public void cellsWorksheetsGetWorkSheetCommentExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String cellName = "B3";
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        CommentResponse response = api.cellsWorksheetsGetWorksheetComment(name, sheetName, cellName, folder,null);

        System.out.println(response);
    }
    
    
    public void cellsWorksheetsGetWorkSheetCommentsExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        CommentsResponse response = api.cellsWorksheetsGetWorksheetComments(name, sheetName, folder,null);

        System.out.println(response);
    }
    
   
    public void cellsWorksheetsGetWorkSheetMergedCellExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer mergedCellIndex = 1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        MergedCellResponse response = api.cellsWorksheetsGetWorksheetMergedCell(name, sheetName, mergedCellIndex, folder,null);

        System.out.println(response);
    }
    
    
    public void cellsWorksheetsGetWorkSheetMergedCellsExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        MergedCellsResponse response = api.cellsWorksheetsGetWorksheetMergedCells(name, sheetName, folder,null);

        System.out.println(response);
    }
    
   
    public void cellsWorksheetsGetWorkSheetTextItemsExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        TextItemsResponse response = api.cellsWorksheetsGetWorksheetTextItems(name, sheetName, folder,null);

        System.out.println(response);
    }
    
    
    public void cellsWorksheetsGetWorkSheetsExample() throws ApiException {
       String name = BOOK1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        WorksheetsResponse response = api.cellsWorksheetsGetWorksheets(name, folder,null);

        System.out.println(response);
    }
    
  
    public void cellsWorksheetsPostAutofitWorksheetColumnsExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer firstColumn = 1;
        Integer lastColumn = 10;
        AutoFitterOptions autoFitterOptions = null;
        Integer firstRow = 1;
        Integer lastRow = 19;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorksheetsPostAutofitWorksheetColumns(name, sheetName, firstColumn, lastColumn, autoFitterOptions, firstRow, lastRow, folder,null);

        System.out.println(response);
    }
    
   
    public void cellsWorksheetsPostAutofitWorksheetRowExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer rowIndex = 1;
        Integer firstColumn = 1;
        Integer lastColumn = 10;
        AutoFitterOptions autoFitterOptions = new AutoFitterOptions();
        autoFitterOptions.setAutoFitMergedCells(true);
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorksheetsPostAutofitWorksheetRow(name, sheetName, rowIndex, firstColumn, lastColumn, autoFitterOptions, folder,null);

        System.out.println(response);
    }
    
    
    public void cellsWorksheetsPostAutofitWorksheetRowsExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        AutoFitterOptions autoFitterOptions =  new AutoFitterOptions();
        autoFitterOptions.setAutoFitMergedCells(true);
        Integer startRow = 1;
        Integer endRow = 10;
        Boolean onlyAuto = true;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorksheetsPostAutofitWorksheetRows(name, sheetName, autoFitterOptions, startRow, endRow, onlyAuto, folder,null);

        System.out.println(response);
    }
    
   
    public void cellsWorksheetsPostCopyWorksheetExample() throws ApiException {
        String name ="NewCopy.xlsx";
        String sheetName = SHEET5;
        String sourceSheet = SHEET6;
        CopyOptions options = new CopyOptions();
        options.setCopyNames(true);
        String sourceWorkbook = BOOK1;
        String sourceFolder = TEMPFOLDER;
        String folder = TEMPFOLDER;
        Base.Ready(sourceFolder, sourceWorkbook);
		api.setApiClient( Base.Ready(folder, name));
		Base.Ready(sourceFolder, sourceWorkbook);
        SaaSposeResponse response = api.cellsWorksheetsPostCopyWorksheet(name, sheetName, sourceSheet, options, sourceWorkbook, sourceFolder, folder,null);

        System.out.println(response);
    }
    
   
    public void cellsWorksheetsPostMoveWorksheetExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        WorksheetMovingRequest moving = new WorksheetMovingRequest();
        moving.setDestinationWorksheet(SHEET3);
        moving.setPosition("after");
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        WorksheetsResponse response = api.cellsWorksheetsPostMoveWorksheet(name, sheetName, moving, folder,null);

        System.out.println(response);
    }
    
  
    public void cellsWorksheetsPostRenameWorksheetExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String newname = "renameExample";
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorksheetsPostRenameWorksheet(name, sheetName, newname, folder,null);

        System.out.println(response);
    }
    
    
    public void cellsWorksheetsPostUpdateWorksheetPropertyExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Worksheet sheet = new Worksheet();
        sheet.setIsGridlinesVisible(true);
        sheet.setIndex(0);
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        WorksheetResponse response = api.cellsWorksheetsPostUpdateWorksheetProperty(name, sheetName, sheet, folder,null);

        System.out.println(response);
    }
    
   
    public void cellsWorksheetsPostUpdateWorksheetZoomExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer value = 1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorksheetsPostUpdateWorksheetZoom(name, sheetName, value, folder,null);

        System.out.println(response);
    }
    
    
    public void cellsWorksheetsPostWorkSheetCommentExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String cellName = "B3";
        Comment comment = new Comment();
        comment.setAuthor("Roy Wang");
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorksheetsPostWorksheetComment(name, sheetName, cellName, comment, folder,null);

        System.out.println(response);
    }
    
    
    public void cellsWorksheetsPostWorkSheetTextSearchExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String text ="123456";
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        TextItemsResponse response = api.cellsWorksheetsPostWorksheetTextSearch(name, sheetName, text, folder,null);

        System.out.println(response);
    }
    
   
    public void cellsWorksheetsPostWorksheetRangeSortExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String cellArea = CELLAREA;
        DataSorter dataSorter =new DataSorter();
        dataSorter.setCaseSensitive( true);
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorksheetsPostWorksheetRangeSort(name, sheetName, cellArea, dataSorter, folder,null);

        System.out.println(response);
    }
    
   
    public void cellsWorksheetsPostWorsheetTextReplaceExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String oldValue ="1234";
        String newValue = "56678";
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        WorksheetReplaceResponse response = api.cellsWorksheetsPostWorsheetTextReplace(name, sheetName, oldValue, newValue, folder,null);

        System.out.println(response);
    }
    
  
    public void cellsWorksheetsPutAddNewWorksheetExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer position = 1;
        String sheettype ="VB";
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        WorksheetsResponse response = api.cellsWorksheetsPutAddNewWorksheet(name, sheetName, position, sheettype, folder,null);

        System.out.println(response);
    }
    
    
    public void cellsWorksheetsPutChangeVisibilityWorksheetExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Boolean isVisible = true;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        WorksheetResponse response = api.cellsWorksheetsPutChangeVisibilityWorksheet(name, sheetName, isVisible, folder,null);

        System.out.println(response);
    }
    
   
    public void cellsWorksheetsPutProtectWorksheetExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        ProtectSheetParameter protectParameter =  new ProtectSheetParameter();
        protectParameter.setProtectionType("All");
        protectParameter.setPassword("123456");
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        WorksheetResponse response = api.cellsWorksheetsPutProtectWorksheet(name, sheetName, protectParameter, folder,null);

        System.out.println(response);
    }
    
    
   
    
   
    public void cellsWorksheetsPutWorkSheetCommentExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String cellName = "C1";
        Comment comment = new Comment ();
        comment.setAuthor ( "roy");
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        CommentResponse response = api.cellsWorksheetsPutWorksheetComment(name, sheetName, cellName, comment, folder,null);

        System.out.println(response);
    }
    
   
    public void cellsWorksheetsPutWorksheetFreezePanesExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer row = 1;
        Integer column = 1;
        Integer freezedRows = 4;
        Integer freezedColumns = 5;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsWorksheetsPutWorksheetFreezePanes(name, sheetName, row, column, freezedRows, freezedColumns, folder,null);

        System.out.println(response);
    }
    
}