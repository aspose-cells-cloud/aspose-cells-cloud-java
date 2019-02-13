package com.aspose.cloud.cells.examples.hyperlinks;


import com.aspose.cloud.cells.api.CellsHypelinksApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Utils;
import com.aspose.cloud.cells.model.Hyperlink;
import com.aspose.cloud.cells.model.HyperlinkResponse;
import com.aspose.cloud.cells.model.HyperlinksResponse;
import com.aspose.cloud.cells.model.SaaSposeResponse;

/**
 * API tests for CellsHypelinksApi
 */

public class HyperLinksAPIExamples {

    private final CellsHypelinksApi api = new CellsHypelinksApi();

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
    
	
    

    public void cellsHypelinksDeleteWorkSheetHyperlinkTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer hyperlinkIndex = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsHypelinksDeleteWorksheetHyperlink(name, sheetName, hyperlinkIndex, folder,null);

         System.out.print(response.getCode());
    }
    

    public void cellsHypelinksDeleteWorkSheetHyperlinksTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsHypelinksDeleteWorksheetHyperlinks(name, sheetName, folder,null);

                System.out.print(response.getCode());
    }
    

    public void cellsHypelinksGetWorkSheetHyperlinkTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer hyperlinkIndex = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        HyperlinkResponse response = api.cellsHypelinksGetWorksheetHyperlink(name, sheetName, hyperlinkIndex, folder,null);
        System.out.print(response.getCode());
    }

    public void cellsHypelinksGetWorkSheetHyperlinksTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        HyperlinksResponse response = api.cellsHypelinksGetWorksheetHyperlinks(name, sheetName, folder,null);

        System.out.print(response.getCode());
    }
    

    public void cellsHypelinksPostWorkSheetHyperlinkTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer hyperlinkIndex = 0;
        Hyperlink hyperlink = new Hyperlink();
        hyperlink.setAddress( "http://www.aspose.com");
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        HyperlinkResponse response = api.cellsHypelinksPostWorksheetHyperlink(name, sheetName, hyperlinkIndex, hyperlink, folder,null);

        System.out.print(response.getCode());
    }
    

    public void cellsHypelinksPutWorkSheetHyperlinkTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer firstRow = 1;
        Integer firstColumn = 1;
        Integer totalRows = 2;
        Integer totalColumns = 3;
        String address = "http://wwww.aspose.com";
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        HyperlinkResponse response = api.cellsHypelinksPutWorksheetHyperlink(name, sheetName, firstRow, firstColumn, totalRows, totalColumns, address, folder,null);

         System.out.print(response.getCode());
    }
    
}
