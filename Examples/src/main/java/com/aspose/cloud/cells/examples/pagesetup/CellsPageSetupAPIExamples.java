package com.aspose.cloud.cells.examples.pagesetup;


import com.aspose.cloud.cells.api.CellsPageSetupApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Base;
import com.aspose.cloud.cells.model.PageSectionsResponse;
import com.aspose.cloud.cells.model.PageSetup;
import com.aspose.cloud.cells.model.PageSetupResponse;
import com.aspose.cloud.cells.model.SaaSposeResponse;

/**
 * API Examples for CellsPageSetupApi
 */

public class CellsPageSetupAPIExamples extends Base{

    private final CellsPageSetupApi api = new CellsPageSetupApi();

   
    

    public void cellsPageSetupDeleteHeaderFooterExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageSetupDeleteHeaderFooter(name, sheetName, folder,null);

        System.out.print(response);
    }
    

    public void cellsPageSetupGetFooterExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        PageSectionsResponse response = api.cellsPageSetupGetFooter(name, sheetName, folder,null);

        System.out.print(response);
    }
    

    public void cellsPageSetupGetHeaderExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        PageSectionsResponse response = api.cellsPageSetupGetHeader(name, sheetName, folder,null);

        System.out.print(response);
    }
    

    public void cellsPageSetupGetPageSetupExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        PageSetupResponse response = api.cellsPageSetupGetPageSetup(name, sheetName, folder,null);

        System.out.print(response);
    }
    

    public void cellsPageSetupPostFooterExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer section = 0;
        String script = "Example";
        Boolean isFirstPage = true;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageSetupPostFooter(name, sheetName, section, script, isFirstPage, folder,null);

        System.out.print(response);
    }
    

    public void cellsPageSetupPostHeaderExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer section = 1;
        String script ="trst";
        Boolean isFirstPage = false;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageSetupPostHeader(name, sheetName, section, script, isFirstPage, folder,null);

        System.out.print(response);
    }
    

    public void cellsPageSetupPostPageSetupExample() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        PageSetup pageSetup =new PageSetup();
        pageSetup.setBlackAndWhite(true);
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        SaaSposeResponse response = api.cellsPageSetupPostPageSetup(name, sheetName, pageSetup, folder,null);

        System.out.print(response);
    }
    
}
