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


import com.aspose.cloud.cells.model.CalculationOptions;
import com.aspose.cloud.cells.model.CellResponse;
import com.aspose.cloud.cells.model.CellsObjectOperateTaskParameter;
import com.aspose.cloud.cells.model.CellsResponse;
import com.aspose.cloud.cells.model.ColumnResponse;
import com.aspose.cloud.cells.model.ColumnsResponse;
import com.aspose.cloud.cells.model.FileSource;
import com.aspose.cloud.cells.model.Font;

import java.io.File;

import com.aspose.cloud.cells.model.FontSetting;
import com.aspose.cloud.cells.model.OperateObject;
import com.aspose.cloud.cells.model.OperateObjectPosition;
import com.aspose.cloud.cells.model.ResultDestination;
import com.aspose.cloud.cells.model.RowResponse;
import com.aspose.cloud.cells.model.RowsResponse;
import com.aspose.cloud.cells.model.CellsCloudResponse;
import com.aspose.cloud.cells.model.SaveResultTaskParameter;
import com.aspose.cloud.cells.model.Style;
import com.aspose.cloud.cells.model.StyleResponse;
import com.aspose.cloud.cells.model.TaskData;
import com.aspose.cloud.cells.model.TaskDescription;
import com.aspose.cloud.cells.model.WorkbookSettings;
import com.aspose.cloud.cells.model.WorkbookSettingsOperateParameter;

import org.junit.Test;
import org.junit.Ignore;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.Assert;

/**
 * API tests for CellsApi
 */

public class CellsApiForV11Test {

    private  CellsApi api;

    private String BOOK1 = "Book1.xlsx";
    private String MYDOC = "myDocument.xlsx";
    private String PivTestFile = "TestCase.xlsx";
    private String TEMPFOLDER = "Temp";//"CellsTests";
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
    
 
    public CellsApiForV11Test(){
    	try {
			 api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),"v1.1");
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    /**
     * Delete worksheet columns.
     * @throws Exception 
     */
    @Test
    public void cellsDeleteWorksheetColumnsTest() throws Exception {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer columnIndex = 1;
        Integer columns = 1;
        Boolean updateReference = true;
        String folder = TEMPFOLDER;
        ColumnsResponse response = api.cellsDeleteWorksheetColumns(name, sheetName, columnIndex, columns, updateReference, folder,null);
    }
    
    /**
     * Delete worksheet row.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsDeleteWorksheetRowTest() throws ApiException {
        String name = BOOK1;
        String sheetName = SHEET1;
        Integer rowIndex = 1;
        String folder = TEMPFOLDER;
        CellsCloudResponse response = api.cellsDeleteWorksheetRow(name, sheetName, rowIndex, folder,null);
        Assert.assertEquals("cellsDeleteWorksheetRowTest is OK.", "OK", response.getStatus());
        // TODO: test validations
    }        
}
