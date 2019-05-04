package com.aspose.cloud.cells.examples.pagebreaks;


import com.aspose.cloud.cells.api.CellsPageBreaksApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Base;
import com.aspose.cloud.cells.model.HorizontalPageBreakResponse;
import com.aspose.cloud.cells.model.HorizontalPageBreaksResponse;
import com.aspose.cloud.cells.model.SaaSposeResponse;
import com.aspose.cloud.cells.model.VerticalPageBreakResponse;
import com.aspose.cloud.cells.model.VerticalPageBreaksResponse;



public class PageBreaksAPIExamples extends Base{

    private final CellsPageBreaksApi api = new CellsPageBreaksApi();

  
    
	
    

    public void cellsPageBreaksDeleteHorizontalPageBreakExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer index = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageBreaksDeleteHorizontalPageBreak(name, sheetName, index, folder,null);

       System.out.println(response.getCode());
    }
    
  
    public void cellsPageBreaksDeleteHorizontalPageBreaksExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer row = 1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageBreaksDeleteHorizontalPageBreaks(name, sheetName, row, folder,null);

       System.out.println(response.getCode());
    }
    

    public void cellsPageBreaksDeleteVerticalPageBreakExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer index = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageBreaksDeleteVerticalPageBreak(name, sheetName, index, folder,null);

       System.out.println(response.getCode());
    }
    

    public void cellsPageBreaksDeleteVerticalPageBreaksExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer column = 1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageBreaksDeleteVerticalPageBreaks(name, sheetName, column, folder,null);

       System.out.println(response.getCode());
    }
    

    public void cellsPageBreaksGetHorizontalPageBreakExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer index = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        HorizontalPageBreakResponse response = api.cellsPageBreaksGetHorizontalPageBreak(name, sheetName, index, folder,null);

       System.out.println(response.getCode());
    }
    

    public void cellsPageBreaksGetHorizontalPageBreaksExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        HorizontalPageBreaksResponse response = api.cellsPageBreaksGetHorizontalPageBreaks(name, sheetName, folder,null);

       System.out.println(response.getCode());
    }
    

    public void cellsPageBreaksGetVerticalPageBreakExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer index = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        VerticalPageBreakResponse response = api.cellsPageBreaksGetVerticalPageBreak(name, sheetName, index, folder,null);

       System.out.println(response.getCode());
    }

    public void cellsPageBreaksGetVerticalPageBreaksExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        VerticalPageBreaksResponse response = api.cellsPageBreaksGetVerticalPageBreaks(name, sheetName, folder,null);

       System.out.println(response.getCode());
    }
    

    public void cellsPageBreaksPutHorizontalPageBreakExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String cellname = CellName;
        Integer row = 1;
        Integer column = 1;
        Integer startColumn = 1;
        Integer endColumn = 1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageBreaksPutHorizontalPageBreak(name, sheetName, cellname, row, column, startColumn, endColumn, folder,null);

       System.out.println(response.getCode());
    }

    public void cellsPageBreaksPutVerticalPageBreakExample() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        String cellname = CellName;
        Integer column = 1;
        Integer row = 1;
        Integer startRow = 1;
        Integer endRow = 1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageBreaksPutVerticalPageBreak(name, sheetName, cellname, column, row, startRow, endRow, folder,null);

       System.out.println(response.getCode());
    }
    
}