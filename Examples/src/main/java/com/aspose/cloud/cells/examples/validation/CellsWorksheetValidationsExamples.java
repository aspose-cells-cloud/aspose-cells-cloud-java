package com.aspose.cloud.cells.examples.validation;


import java.util.ArrayList;

import com.aspose.cloud.cells.api.CellsWorksheetValidationsApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Base;
import com.aspose.cloud.cells.model.CellArea;
import com.aspose.cloud.cells.model.Validation;
import com.aspose.cloud.cells.model.ValidationResponse;
import com.aspose.cloud.cells.model.ValidationsResponse;


public class CellsWorksheetValidationsExamples extends Base{

    private final CellsWorksheetValidationsApi api = new CellsWorksheetValidationsApi();



    public void cellsWorksheetValidationsDeleteWorkSheetValidationExample() throws ApiException {
       String name = MYDOC;
        String sheetName = SHEET1;
        Integer validationIndex = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        ValidationResponse response = api.cellsWorksheetValidationsDeleteWorksheetValidation(name, sheetName, validationIndex, folder,null);

		System.out.println(response.getCode());

    }
    
 
    public void cellsWorksheetValidationsGetWorkSheetValidationExample() throws ApiException {
      	String name = MYDOC;
        String sheetName = SHEET1;
        Integer validationIndex = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        ValidationResponse response = api.cellsWorksheetValidationsGetWorksheetValidation(name, sheetName, validationIndex, folder,null);

		System.out.println(response.getCode());

    }

    public void cellsWorksheetValidationsGetWorkSheetValidationsExample() throws ApiException {
       String name = MYDOC;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        ValidationsResponse response = api.cellsWorksheetValidationsGetWorksheetValidations(name, sheetName, folder,null);

		System.out.println(response.getCode());

    }
    

    public void cellsWorksheetValidationsPostWorkSheetValidationExample() throws ApiException {
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
		api.setApiClient( Base.Ready(folder, name));
        ValidationResponse response = api.cellsWorksheetValidationsPostWorksheetValidation(name, sheetName, validationIndex, validation, folder,null);
        System.out.print(response);
    }

    public void cellsWorksheetValidationsPutWorkSheetValidationExample() throws ApiException {
       String name = MYDOC;
        String sheetName = SHEET1;
        String range = RANGE;
        String folder = TEMPFOLDER;
		api.setApiClient( Base.Ready(folder, name));
        ValidationResponse response = api.cellsWorksheetValidationsPutWorksheetValidation(name, sheetName, range, folder,null);

		System.out.println(response);

    }
    
}