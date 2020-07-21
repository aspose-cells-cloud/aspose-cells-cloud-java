/*
 * Web API Swagger specification
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.aspose.cloud.cells.api;
import com.aspose.cloud.cells.client.ApiClient;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.client.Configuration;


import com.aspose.cloud.cells.model.ConditionalFormattingResponse;
import com.aspose.cloud.cells.model.ConditionalFormattingsResponse;
import com.aspose.cloud.cells.model.FormatCondition;
import com.aspose.cloud.cells.model.CellsCloudResponse;

import org.junit.Test;
import org.junit.Ignore;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CellsConditionalFormattingsApi
 */

public class CellsConditionalFormattingsApiTest {

    private  CellsApi api ;

    private String BOOK1 = "Book1.xlsx";
    private String MYDOC = "myDocument.xlsx";
    private String PivTestFile = "TestCase.xlsx";
    private String TEMPFOLDER = "JavaTest";
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
    
	
    public CellsConditionalFormattingsApiTest(){
    	try {
			 api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret());
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    /**
     * Remove conditional formatting
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsConditionalFormattingsDeleteWorksheetConditionalFormattingTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer index = 0;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsConditionalFormattingsDeleteWorksheetConditionalFormatting(name, sheetName, index, folder,null);

        // TODO: test validations
    }
    
    /**
     * Remove cell area from conditional formatting.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsConditionalFormattingsDeleteWorksheetConditionalFormattingAreaTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer startRow = 1;
        Integer startColumn = 1;
        Integer totalRows = 4;
        Integer totalColumns = 6;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsConditionalFormattingsDeleteWorksheetConditionalFormattingArea(name, sheetName, startRow, startColumn, totalRows, totalColumns, folder,null);

        // TODO: test validations
    }
    
    /**
     * Clear all condition formattings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsConditionalFormattingsDeleteWorksheetConditionalFormattingsTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsConditionalFormattingsDeleteWorksheetConditionalFormattings(name, sheetName, folder,null);

        // TODO: test validations
    }
    
    /**
     * Get conditional formatting
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsConditionalFormattingsGetWorksheetConditionalFormattingTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer index = 0;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        ConditionalFormattingResponse response = api.cellsConditionalFormattingsGetWorksheetConditionalFormatting(name, sheetName, index, folder,null);

        // TODO: test validations
    }
    
    /**
     * Get conditional formattings 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsConditionalFormattingsGetWorksheetConditionalFormattingsTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        ConditionalFormattingsResponse response = api.cellsConditionalFormattingsGetWorksheetConditionalFormattings(name, sheetName, folder,null);

        // TODO: test validations
    }
    
    /**
     * Add a condition formatting.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
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
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsConditionalFormattingsPutWorksheetConditionalFormatting(name, sheetName, cellArea, formatcondition, folder,null);

        // TODO: test validations
    }
    
    /**
     * Add a format condition.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
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
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsConditionalFormattingsPutWorksheetFormatCondition(name, sheetName, index, cellArea, type, operatorType, formula1, formula2, folder,null);

        // TODO: test validations
    }
    
    /**
     * add a cell area for format condition             
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsConditionalFormattingsPutWorksheetFormatConditionAreaTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer index = 0;
        String cellArea = CELLAREA;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsConditionalFormattingsPutWorksheetFormatConditionArea(name, sheetName, index, cellArea, folder,null);

        // TODO: test validations
    }
    
    /**
     * Add a condition for format condition.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsConditionalFormattingsPutWorksheetFormatConditionConditionTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer index = 0;
        String type ="CellValue";
        String operatorType = "Between";
        String formula1 = "v1";
        String formula2 = "v2";
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsConditionalFormattingsPutWorksheetFormatConditionCondition(name, sheetName, index, type, operatorType, formula1, formula2, folder,null);

        // TODO: test validations
    }
    
}
