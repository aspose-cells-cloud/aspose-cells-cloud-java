package com.aspose.cloud.cells.examples.hyperlinks;


import com.aspose.cloud.cells.api.CellsHypelinksApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Base;
import com.aspose.cloud.cells.model.Hyperlink;
import com.aspose.cloud.cells.model.HyperlinkResponse;
import com.aspose.cloud.cells.model.HyperlinksResponse;
import com.aspose.cloud.cells.model.SaaSposeResponse;


public class HyperLinksAPIExamples extends Base{

    private final CellsHypelinksApi api = new CellsHypelinksApi();

  
	
    

    public void cellsHypelinksDeleteWorkSheetHyperlinkExamples() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer hyperlinkIndex = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsHypelinksDeleteWorksheetHyperlink(name, sheetName, hyperlinkIndex, folder,null);

         System.out.print(response.getCode());
    }
    

    public void cellsHypelinksDeleteWorkSheetHyperlinksExamples() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsHypelinksDeleteWorksheetHyperlinks(name, sheetName, folder,null);

                System.out.print(response.getCode());
    }
    

    public void cellsHypelinksGetWorkSheetHyperlinkExamples() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer hyperlinkIndex = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        HyperlinkResponse response = api.cellsHypelinksGetWorksheetHyperlink(name, sheetName, hyperlinkIndex, folder,null);
        System.out.print(response.getCode());
    }

    public void cellsHypelinksGetWorkSheetHyperlinksExamples() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        HyperlinksResponse response = api.cellsHypelinksGetWorksheetHyperlinks(name, sheetName, folder,null);

        System.out.print(response.getCode());
    }
    

    public void cellsHypelinksPostWorkSheetHyperlinkExamples() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer hyperlinkIndex = 0;
        Hyperlink hyperlink = new Hyperlink();
        hyperlink.setAddress( "http://www.aspose.com");
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        HyperlinkResponse response = api.cellsHypelinksPostWorksheetHyperlink(name, sheetName, hyperlinkIndex, hyperlink, folder,null);

        System.out.print(response.getCode());
    }
    

    public void cellsHypelinksPutWorkSheetHyperlinkExamples() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer firstRow = 1;
        Integer firstColumn = 1;
        Integer totalRows = 2;
        Integer totalColumns = 3;
        String address = "http://wwww.aspose.com";
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        HyperlinkResponse response = api.cellsHypelinksPutWorksheetHyperlink(name, sheetName, firstRow, firstColumn, totalRows, totalColumns, address, folder,null);

         System.out.print(response.getCode());
    }
    
}
