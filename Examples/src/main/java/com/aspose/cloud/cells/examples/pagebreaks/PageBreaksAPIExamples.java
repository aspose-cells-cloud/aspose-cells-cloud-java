package com.aspose.cloud.cells.examples.pagebreaks;


import com.aspose.cloud.cells.api.CellsPageBreaksApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Utils;
import com.aspose.cloud.cells.model.HorizontalPageBreakResponse;
import com.aspose.cloud.cells.model.HorizontalPageBreaksResponse;
import com.aspose.cloud.cells.model.SaaSposeResponse;
import com.aspose.cloud.cells.model.VerticalPageBreakResponse;
import com.aspose.cloud.cells.model.VerticalPageBreaksResponse;



public class PageBreaksAPIExamples {

    private final CellsPageBreaksApi api = new CellsPageBreaksApi();

    private String BOOK1 = "Book1.xlsx";
    private String MYDOC = "myDocument.xlsx";
    private String PivTestFile = "TestCase.xlsx";
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
    
	
    

    public void cellsPageBreaksDeleteHorizontalPageBreakTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer index = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageBreaksDeleteHorizontalPageBreak(name, sheetName, index, folder,null);

       System.out.println(response.getCode());
    }
    
  
    public void cellsPageBreaksDeleteHorizontalPageBreaksTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer row = 1;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageBreaksDeleteHorizontalPageBreaks(name, sheetName, row, folder,null);

       System.out.println(response.getCode());
    }
    

    public void cellsPageBreaksDeleteVerticalPageBreakTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer index = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageBreaksDeleteVerticalPageBreak(name, sheetName, index, folder,null);

       System.out.println(response.getCode());
    }
    

    public void cellsPageBreaksDeleteVerticalPageBreaksTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer column = 1;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageBreaksDeleteVerticalPageBreaks(name, sheetName, column, folder,null);

       System.out.println(response.getCode());
    }
    

    public void cellsPageBreaksGetHorizontalPageBreakTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer index = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        HorizontalPageBreakResponse response = api.cellsPageBreaksGetHorizontalPageBreak(name, sheetName, index, folder,null);

       System.out.println(response.getCode());
    }
    

    public void cellsPageBreaksGetHorizontalPageBreaksTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        HorizontalPageBreaksResponse response = api.cellsPageBreaksGetHorizontalPageBreaks(name, sheetName, folder,null);

       System.out.println(response.getCode());
    }
    

    public void cellsPageBreaksGetVerticalPageBreakTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer index = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        VerticalPageBreakResponse response = api.cellsPageBreaksGetVerticalPageBreak(name, sheetName, index, folder,null);

       System.out.println(response.getCode());
    }

    public void cellsPageBreaksGetVerticalPageBreaksTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        VerticalPageBreaksResponse response = api.cellsPageBreaksGetVerticalPageBreaks(name, sheetName, folder,null);

       System.out.println(response.getCode());
    }
    

    public void cellsPageBreaksPutHorizontalPageBreakTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String cellname = CellName;
        Integer row = 1;
        Integer column = 1;
        Integer startColumn = 1;
        Integer endColumn = 1;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageBreaksPutHorizontalPageBreak(name, sheetName, cellname, row, column, startColumn, endColumn, folder,null);

       System.out.println(response.getCode());
    }

    public void cellsPageBreaksPutVerticalPageBreakTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String cellname = CellName;
        Integer column = 1;
        Integer row = 1;
        Integer startRow = 1;
        Integer endRow = 1;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageBreaksPutVerticalPageBreak(name, sheetName, cellname, column, row, startRow, endRow, folder,null);

       System.out.println(response.getCode());
    }
    
}