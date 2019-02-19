package com.aspose.cloud.cells.examples.formatting;


import com.aspose.cloud.cells.api.CellsConditionalFormattingsApi;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.examples.Utils;
import com.aspose.cloud.cells.model.ConditionalFormattingResponse;
import com.aspose.cloud.cells.model.ConditionalFormattingsResponse;
import com.aspose.cloud.cells.model.FormatCondition;
import com.aspose.cloud.cells.model.SaaSposeResponse;


public class ConditionalFormattingExample {

    private final CellsConditionalFormattingsApi api = new CellsConditionalFormattingsApi();

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
    
	
    public void cellsConditionalFormattingsDeleteWorksheetConditionalFormattingTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer index = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsConditionalFormattingsDeleteWorksheetConditionalFormatting(name, sheetName, index, folder,null);

        System.out.print(response.getCode());
    }

    public void cellsConditionalFormattingsDeleteWorksheetConditionalFormattingAreaTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer startRow = 1;
        Integer startColumn = 1;
        Integer totalRows = 4;
        Integer totalColumns = 6;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea(name, sheetName, startRow, startColumn, totalRows, totalColumns, folder,null);

        System.out.print(response.getCode());
    }
    

    public void cellsConditionalFormattingsDeleteWorksheetConditionalFormattingsTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsConditionalFormattingsDeleteWorksheetConditionalFormattings(name, sheetName, folder,null);

        System.out.print(response.getCode());
    }
    

    public void cellsConditionalFormattingsGetWorksheetConditionalFormattingTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer index = 0;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        ConditionalFormattingResponse response = api.cellsConditionalFormattingsGetWorksheetConditionalFormatting(name, sheetName, index, folder,null);

        System.out.print(response.getCode());
    }
    

    public void cellsConditionalFormattingsGetWorksheetConditionalFormattingsTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        ConditionalFormattingsResponse response = api.cellsConditionalFormattingsGetWorksheetConditionalFormattings(name, sheetName, folder,null);

        System.out.print(response.getCode());
    }
    

    public void cellsConditionalFormattingsPutWorksheetConditionalFormattingTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String cellArea = CELLAREA;
        FormatCondition formatcondition = new FormatCondition();
        formatcondition.setType( "CellValue");
        formatcondition.setOperator("Between");
        formatcondition.setFormula1("v1");
        formatcondition.setFormula2("v2");
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsConditionalFormattingsPutWorksheetConditionalFormatting(name, sheetName, cellArea, formatcondition, folder,null);

        System.out.print(response.getCode());
    }
    

    public void cellsConditionalFormattingsPutWorksheetFormatConditionTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer index = 0;
        String cellArea = CELLAREA;
        String type ="CellValue";
        String operatorType ="Between";
        String formula1 = "v1";
        String formula2 = "v2";	
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsConditionalFormattingsPutWorksheetFormatCondition(name, sheetName, index, cellArea, type, operatorType, formula1, formula2, folder,null);

        System.out.print(response.getCode());
    }
    

    public void cellsConditionalFormattingsPutWorksheetFormatConditionAreaTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer index = 0;
        String cellArea = CELLAREA;
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsConditionalFormattingsPutWorksheetFormatConditionArea(name, sheetName, index, cellArea, folder,null);

        System.out.print(response.getCode());
    }

    public void cellsConditionalFormattingsPutWorksheetFormatConditionConditionTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer index = 0;
        String type ="CellValue";
        String operatorType = "Between";
        String formula1 = "v1";
        String formula2 = "v2";
        String folder = TEMPFOLDER;
		api.setApiClient( Utils.Ready(folder, name));
        SaaSposeResponse response = api.cellsConditionalFormattingsPutWorksheetFormatConditionCondition(name, sheetName, index, type, operatorType, formula1, formula2, folder,null);

        System.out.print(response.getCode());
    }
    
}