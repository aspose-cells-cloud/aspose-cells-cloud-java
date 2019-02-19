package com.aspose.cloud.cells.examples.pagesetup;


import com.aspose.cloud.cells.api.CellsPageSetupApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Utils;
import com.aspose.cloud.cells.model.PageSectionsResponse;
import com.aspose.cloud.cells.model.PageSetup;
import com.aspose.cloud.cells.model.PageSetupResponse;
import com.aspose.cloud.cells.model.SaaSposeResponse;

/**
 * API tests for CellsPageSetupApi
 */

public class CellsPageSetupAPIExamples {

    private final CellsPageSetupApi api = new CellsPageSetupApi();

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
    
	
    

    public void cellsPageSetupDeleteHeaderFooterTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageSetupDeleteHeaderFooter(name, sheetName, folder,null);

        // TODO: test validations
    }
    

    public void cellsPageSetupGetFooterTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        PageSectionsResponse response = api.cellsPageSetupGetFooter(name, sheetName, folder,null);

        // TODO: test validations
    }
    

    public void cellsPageSetupGetHeaderTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        PageSectionsResponse response = api.cellsPageSetupGetHeader(name, sheetName, folder,null);

        // TODO: test validations
    }
    

    public void cellsPageSetupGetPageSetupTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        PageSetupResponse response = api.cellsPageSetupGetPageSetup(name, sheetName, folder,null);

        // TODO: test validations
    }
    

    public void cellsPageSetupPostFooterTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer section = 0;
        String script = "test";
        Boolean isFirstPage = true;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageSetupPostFooter(name, sheetName, section, script, isFirstPage, folder,null);

        // TODO: test validations
    }
    

    public void cellsPageSetupPostHeaderTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer section = 1;
        String script ="trst";
        Boolean isFirstPage = false;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageSetupPostHeader(name, sheetName, section, script, isFirstPage, folder,null);

        // TODO: test validations
    }
    

    public void cellsPageSetupPostPageSetupTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        PageSetup pageSetup =new PageSetup();
        pageSetup.setBlackAndWhite(true);
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageSetupPostPageSetup(name, sheetName, pageSetup, folder,null);

        // TODO: test validations
    }
    
}
