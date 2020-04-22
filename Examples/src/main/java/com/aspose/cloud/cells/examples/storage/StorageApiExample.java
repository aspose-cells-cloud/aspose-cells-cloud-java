package com.aspose.cloud.cells.examples.storage;

import java.io.File;

import org.junit.Test;

import com.aspose.cloud.cells.api.CellsApi;
import com.aspose.cloud.cells.api.CellsApiUtil;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Utils;


public class StorageApiExample {
	private  CellsApi api;

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
    
    public StorageApiExample(){
    	try {
			 api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret());
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    @Test
    public void cellsUploadFileTestCases() throws ApiException {
    	File file = new File(Utils.GetSourcePath(BOOK1));
		try {
			api.uploadFile( BOOK1, file, null);
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
    }
}
