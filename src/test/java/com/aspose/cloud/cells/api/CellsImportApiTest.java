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
import com.aspose.cloud.cells.model.*;
import org.junit.Test;
import org.junit.Ignore;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Base64;

/**
 * API tests for CellsShapesApi
 */

public class CellsImportApiTest {

    private  LiteCellsApi api ;

    private String BOOK1 = "Book1.xlsx";
    private String MYDOC = "myDocument.xlsx";
    private String AssemblyTestXlsx = "assemblytest.xlsx";
    private String DataSourceXlsx = "datasource.xlsx";
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
    
    public CellsImportApiTest(){
    	try {
			 api = new LiteCellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }    
    
    /**
     * Delete a shape in worksheet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPostImportApiTest() throws ApiException {

        HashMap<String,File> fileMap = new HashMap<String,File>();
        fileMap.put(AssemblyTestXlsx ,CellsApiUtil.GetFileHolder(AssemblyTestXlsx) );
        fileMap.put(DataSourceXlsx ,CellsApiUtil.GetFileHolder(DataSourceXlsx) );
		ImportIntArrayOption data = new ImportIntArrayOption();
		data.setDestinationWorksheet(SHEET1);
		data.setFirstColumn(1);
		data.setFirstRow(3);
		data.setImportDataType("IntArray");
		data.setIsVertical(true);
		List<Integer> ld = new ArrayList<Integer>();
		ld.add(1);
		ld.add(2);
		ld.add(3);
		ld.add(4);
		data.setData(ld);
		FilesResult response = api.postImport(fileMap, data);
        
        // TODO: test validations
    }
    
    @Test
    public void cellsPostImportApiTest_ImportPictureOption() throws ApiException {

        HashMap<String,File> fileMap = new HashMap<String,File>();
        fileMap.put(AssemblyTestXlsx ,CellsApiUtil.GetFileHolder(AssemblyTestXlsx) );
        fileMap.put(DataSourceXlsx ,CellsApiUtil.GetFileHolder(DataSourceXlsx) );
		ImportPictureOption data = new ImportPictureOption();
		data.setDestinationWorksheet(SHEET1);
		data.setUpperLeftRow(1);
		data.setUpperLeftColumn(3);
		data.setLowerRightRow(10);
		data.setLowerRightColumn(13);        
		data.setImportDataType("Picture");
		data.setData( Base64.getEncoder().encodeToString(CellsApiUtil.GetFileData("WaterMark.png")));
		FilesResult response = api.postImport(fileMap, data);
        
        // TODO: test validations
    }
}
