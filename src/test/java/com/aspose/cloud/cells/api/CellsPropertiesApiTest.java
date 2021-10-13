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


import com.aspose.cloud.cells.model.CellsDocumentPropertiesResponse;
import com.aspose.cloud.cells.model.CellsDocumentProperty;
import com.aspose.cloud.cells.model.CellsDocumentPropertyResponse;
import com.aspose.cloud.cells.model.CellsCloudResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CellsPropertiesApi
 */

public class CellsPropertiesApiTest {

    private CellsApi api;

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
    
	
    public CellsPropertiesApiTest(){
    	try {
    		api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }  	
    /**
     * Delete all custom document properties and clean built-in ones.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPropertiesDeleteDocumentPropertiesTest() throws ApiException {
        String name = BOOK1;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPropertiesDeleteDocumentProperties(name, folder,null);

        // TODO: test validations
    }
    
    /**
     * Delete document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPropertiesDeleteDocumentPropertyTest() throws ApiException {
        String name = BOOK1;
        String propertyName = "Author";
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPropertiesDeleteDocumentProperty(name, propertyName, folder,null);

        // TODO: test validations
    }
    
    /**
     * Read document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPropertiesGetDocumentPropertiesTest() throws ApiException {
        String name = BOOK1;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsDocumentPropertiesResponse response = api.cellsPropertiesGetDocumentProperties(name, folder,null);

        // TODO: test validations
    }
    
    /**
     * Read document property by name.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPropertiesGetDocumentPropertyTest() throws ApiException {
        String name = BOOK1;
        String propertyName ="Author";
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsDocumentPropertyResponse response = api.cellsPropertiesGetDocumentProperty(name, propertyName, folder,null);

        // TODO: test validations
    }
    
    /**
     * Set/create document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPropertiesPutDocumentPropertyTest() throws ApiException {
        String name = BOOK1;
        String propertyName ="Name";
        CellsDocumentProperty property = new CellsDocumentProperty();
        property.setName("Name");
        property.setValue("Roy");
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPropertiesPutDocumentProperty(name, propertyName, property, folder,null);

        // TODO: test validations
    }
    
}
