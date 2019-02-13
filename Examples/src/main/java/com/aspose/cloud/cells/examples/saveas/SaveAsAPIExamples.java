package com.aspose.cloud.cells.examples.saveas;

import com.aspose.cloud.cells.api.CellsSaveAsApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Utils;
import com.aspose.cloud.cells.model.SaveOptions;
import com.aspose.cloud.cells.model.SaveResponse;

/**
 * API tests for CellsSaveAsApi
 */

public class SaveAsAPIExamples {

    private final CellsSaveAsApi api = new CellsSaveAsApi();

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
    
	
    

    public void cellsSaveAsPostDocumentSaveAsTest() throws ApiException {
        String name = BOOK1;
        SaveOptions saveOptions = null;
        String newfilename = "newbook.xlsx";
        Boolean isAutoFitRows = true;
        Boolean isAutoFitColumns = false;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        SaveResponse response = api.cellsSaveAsPostDocumentSaveAs(name, saveOptions, newfilename, isAutoFitRows, isAutoFitColumns, folder,null);

		System.out.println(response.getCode());
    }
    
}