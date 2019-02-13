package com.aspose.cloud.cells.examples.validation;


import java.util.ArrayList;

import com.aspose.cloud.cells.api.CellsWorksheetValidationsApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Utils;
import com.aspose.cloud.cells.model.CellArea;
import com.aspose.cloud.cells.model.Validation;
import com.aspose.cloud.cells.model.ValidationResponse;
import com.aspose.cloud.cells.model.ValidationsResponse;


public class CellsWorksheetValidationsExamples {

    private final CellsWorksheetValidationsApi api = new CellsWorksheetValidationsApi();

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
    
	
    

    public void cellsWorksheetValidationsDeleteWorkSheetValidationTest() throws ApiException {
       String name = MYDOC;
        String sheetName = SHEET1;
        Integer validationIndex = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( Utilss.Ready(folder, name));
        ValidationResponse response = api.cellsWorksheetValidationsDeleteWorksheetValidation(name, sheetName, validationIndex, folder,null);

		System.out.println(response.getCode());

    }
    
 
    public void cellsWorksheetValidationsGetWorkSheetValidationTest() throws ApiException {
      	String name = MYDOC;
        String sheetName = SHEET1;
        Integer validationIndex = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        ValidationResponse response = api.cellsWorksheetValidationsGetWorksheetValidation(name, sheetName, validationIndex, folder,null);

		System.out.println(response.getCode());

    }

    public void cellsWorksheetValidationsGetWorkSheetValidationsTest() throws ApiException {
       String name = MYDOC;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        ValidationsResponse response = api.cellsWorksheetValidationsGetWorksheetValidations(name, sheetName, folder,null);

		System.out.println(response.getCode());

    }
    

    public void cellsWorksheetValidationsPostWorkSheetValidationTest() throws ApiException {
       String name = BOOK1;
        String sheetName = SHEET1;
        Integer validationIndex = 0;
        Validation validation = new Validation();
        
        CellArea area = new CellArea();
        area.setStartRow(0);
        area.setEndRow(0);
        area.setStartColumn(0);
        area.setEndColumn(0);
        java.util.List<CellArea> areaList = new ArrayList<CellArea>();
        areaList.add(area);
        validation.setFormula1("=(OR(A1=\"Yes\",A1=\"No\"))");
        validation.setType("Custom");
        validation.setIgnoreBlank(true);
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        ValidationResponse response = api.cellsWorksheetValidationsPostWorksheetValidation(name, sheetName, validationIndex, validation, folder,null);
    }

    public void cellsWorksheetValidationsPutWorkSheetValidationTest() throws ApiException {
       String name = MYDOC;
        String sheetName = SHEET1;
        String range = RANGE;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        ValidationResponse response = api.cellsWorksheetValidationsPutWorksheetValidation(name, sheetName, range, folder,null);

		System.out.println(response.getCode());

    }
    
}