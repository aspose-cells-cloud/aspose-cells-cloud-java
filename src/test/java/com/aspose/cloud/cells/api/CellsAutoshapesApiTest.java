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


import com.aspose.cloud.cells.model.AutoShapesResponse;

import java.io.File;

import org.junit.Test;
import org.junit.Ignore;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CellsAutoshapesApi
 */

public class CellsAutoshapesApiTest {

    private CellsApi api ;

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
    
	
    public CellsAutoshapesApiTest(){
    	try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    /**
     * Get autoshape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsAutoshapesGetWorksheetAutoshapeTest() throws ApiException {
        if(CellsApiUtil.IsDockerTest()){
            return;
        }
        String name = MYDOC;
        String sheetName = SHEET2;
        Integer autoshapeNumber = 4;
        String format = "png";
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        File response = api.cellsAutoshapesGetWorksheetAutoshape(name, sheetName, autoshapeNumber, format,folder,null);

        // TODO: test validations
    }
    
    /**
     * Get worksheet autoshapes info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsAutoshapesGetWorksheetAutoshapesTest() throws ApiException {
        if(CellsApiUtil.IsDockerTest()){
            return;
        }
        String name = MYDOC;
        String sheetName = SHEET2;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        AutoShapesResponse response = api.cellsAutoshapesGetWorksheetAutoshapes(name, sheetName, folder,null);
        
        // TODO: test validations
    }
    
}
