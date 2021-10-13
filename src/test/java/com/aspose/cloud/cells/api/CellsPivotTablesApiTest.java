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
import com.aspose.cloud.cells.model.AutoFilter;
import com.aspose.cloud.cells.model.CreatePivotTableRequest;
import com.aspose.cloud.cells.model.FilterColumn;
import com.aspose.cloud.cells.model.Font;
import com.aspose.cloud.cells.model.PivotFieldResponse;
import com.aspose.cloud.cells.model.PivotFilter;
import com.aspose.cloud.cells.model.PivotFilterResponse;
import com.aspose.cloud.cells.model.PivotFiltersResponse;
import com.aspose.cloud.cells.model.PivotTableFieldRequest;
import com.aspose.cloud.cells.model.PivotTableResponse;
import com.aspose.cloud.cells.model.PivotTablesResponse;
import com.aspose.cloud.cells.model.CellsCloudResponse;
import com.aspose.cloud.cells.model.Style;
import com.aspose.cloud.cells.model.Top10Filter;

import org.junit.Test;
import org.junit.Ignore;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.Assert;

/**
 * API tests for CellsPivotTablesApi
 */

public class CellsPivotTablesApiTest {

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
    
    public CellsPivotTablesApiTest(){
    	try {
    		api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }  	
    
    /**
     * Delete pivot field into into pivot table
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPivotTablesDeletePivotTableFieldTest() throws ApiException {
        String name =PivTestFile;;
        String sheetName = SHEET4;
        Integer pivotTableIndex = 0;
        String pivotFieldType = "row";
        PivotTableFieldRequest request = new PivotTableFieldRequest();
        List<Integer> data = new ArrayList<Integer>();
        data.add(1);
        request.setData(data);
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPivotTablesDeletePivotTableField(name, sheetName, pivotTableIndex, pivotFieldType, request, folder,null);

        // TODO: test validations
    }
    
    /**
     * Delete worksheet pivot table by index
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPivotTablesDeleteWorksheetPivotTableTest() throws ApiException {
        String name =PivTestFile;;
        String sheetName = SHEET4;
        Integer pivotTableIndex = 0;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPivotTablesDeleteWorksheetPivotTable(name, sheetName, pivotTableIndex, folder,null);

        // TODO: test validations
    }
    
    
    /**
     * delete all pivot filters for piovt table
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPivotTablesDeleteWorksheetPivotTableFiltersTest() throws ApiException {
        String name =PivTestFile;;
        String sheetName = SHEET4;
        Integer pivotTableIndex = 0;
        Boolean needReCalculate = true;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPivotTablesDeleteWorksheetPivotTableFilters(name, sheetName, pivotTableIndex, needReCalculate, folder,null);

        // TODO: test validations
    }
    
    /**
     * Delete worksheet pivot tables
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPivotTablesDeleteWorksheetPivotTablesTest() throws ApiException {
        String name =PivTestFile;;
        String sheetName = SHEET4;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPivotTablesDeleteWorksheetPivotTables(name, sheetName, folder,null);

        // TODO: test validations
    }
    
    /**
     * Get pivot field into into pivot table
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPivotTablesGetPivotTableFieldTest() throws ApiException {
        String name =PivTestFile;;
        String sheetName = SHEET4;
        Integer pivotTableIndex = 0;
        Integer pivotFieldIndex = 0;
        String pivotFieldType = "Row";
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        PivotFieldResponse response = api.cellsPivotTablesGetPivotTableField(name, sheetName, pivotTableIndex, pivotFieldIndex, pivotFieldType, folder,null);

        // TODO: test validations
    }
    
    /**
     * Get worksheet pivottable info by index.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPivotTablesGetWorksheetPivotTableTest() throws ApiException {
        String name =PivTestFile;;
        String sheetName = SHEET4;
        Integer pivottableIndex = 0;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        PivotTableResponse response = api.cellsPivotTablesGetWorksheetPivotTable(name, sheetName, pivottableIndex, folder,null);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPivotTablesGetWorksheetPivotTableFilterTest() throws ApiException {
        String name =PivTestFile;;
        String sheetName = SHEET4;
        Integer pivotTableIndex = 0;
        Integer filterIndex = 0;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
		
        PivotFilter filter = new PivotFilter();
        filter.setFieldIndex(0);
        filter.setFilterType("Count");
        AutoFilter autoFilter = new AutoFilter();
        List<FilterColumn> listFC = new ArrayList<FilterColumn>();
        FilterColumn filterColumn = new FilterColumn();
        filterColumn.setFilterType( "Top10");
        filterColumn.setFieldIndex ( 0);
        Top10Filter top = new Top10Filter();
        top.setItems(1);
        top.setIsPercent(true);
        top.setIsTop(true);
        filterColumn.setTop10Filter(top);
        listFC.add(filterColumn);
        Boolean needReCalculate = true;

	    CellsCloudResponse response = api.cellsPivotTablesPutWorksheetPivotTableFilter(name, sheetName, pivotTableIndex, filter, needReCalculate, folder,null);
        PivotFilterResponse response1 = api.cellsPivotTablesGetWorksheetPivotTableFilter(name, sheetName, pivotTableIndex, filterIndex, folder,null);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPivotTablesGetWorksheetPivotTableFiltersTest() throws ApiException {
        String name =PivTestFile;;
        String sheetName = SHEET4;
        Integer pivotTableIndex = 0;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        PivotFiltersResponse response = api.cellsPivotTablesGetWorksheetPivotTableFilters(name, sheetName, pivotTableIndex, folder,null);

        // TODO: test validations
    }
    
    /**
     * Get worksheet pivottables info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPivotTablesGetWorksheetPivotTablesTest() throws ApiException {
        String name =PivTestFile;;
        String sheetName = SHEET4;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        PivotTablesResponse response = api.cellsPivotTablesGetWorksheetPivotTables(name, sheetName, folder,null);

        // TODO: test validations
    }
    
    /**
     * Update cell style for pivot table
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPivotTablesPostPivotTableCellStyleTest() throws ApiException {
        String name =PivTestFile;;
        String sheetName = SHEET4;
        Integer pivotTableIndex = 0;
        Integer column = 1;
        Integer row = 1;
        Style style = new Style();
        Font font = new Font();
        font.setSize(10);
        style.setFont(font);
        Boolean needReCalculate = true;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPivotTablesPostPivotTableCellStyle(name, sheetName, pivotTableIndex, column, row, style, needReCalculate, folder,null);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPivotTablesPostPivotTableFieldHideItemTest() throws ApiException {
        String name =PivTestFile;;
        String sheetName = SHEET4;
        Integer pivotTableIndex = 0;
        String pivotFieldType ="Row";
        Integer fieldIndex = 0;
        Integer itemIndex = 1;
        Boolean isHide = true;
        Boolean needReCalculate = true;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPivotTablesPostPivotTableFieldHideItem(name, sheetName, pivotTableIndex, pivotFieldType, fieldIndex, itemIndex, isHide, needReCalculate, folder,null);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPivotTablesPostPivotTableFieldMoveToTest() throws ApiException {
        String name =PivTestFile;;
        String sheetName = SHEET4;
        Integer pivotTableIndex = 0;
        Integer fieldIndex = 0;
        String from ="Row";
        String to = "Column";
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPivotTablesPostPivotTableFieldMoveTo(name, sheetName, pivotTableIndex, fieldIndex, from, to, folder,null);

        // TODO: test validations
    }
    
    /**
     * Update style for pivot table
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPivotTablesPostPivotTableStyleTest() throws ApiException {
        String name =PivTestFile;;
        String sheetName = SHEET4;
        Integer pivotTableIndex = 0;
        Style style = new Style();
        Font font = new Font();
        font.setSize(10);
        style.setFont(font);
        Boolean needReCalculate = true;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPivotTablesPostPivotTableStyle(name, sheetName, pivotTableIndex, style, needReCalculate, folder,null);

        // TODO: test validations
    }
    
    /**
     * Calculates pivottable&#39;s data to cells.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPivotTablesPostWorksheetPivotTableCalculateTest() throws ApiException {
        String name =PivTestFile;;
        String sheetName = SHEET4;
        Integer pivotTableIndex = 0;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPivotTablesPostWorksheetPivotTableCalculate(name, sheetName, pivotTableIndex, folder,null);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPivotTablesPostWorksheetPivotTableMoveTest() throws ApiException {
        String name =PivTestFile;;
        String sheetName = SHEET4;
        Integer pivotTableIndex = 0;
        Integer row = 1;
        Integer column = 1;
        String destCellName =  "C10";
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPivotTablesPostWorksheetPivotTableMove(name, sheetName, pivotTableIndex, row, column, destCellName, folder,null);

        // TODO: test validations
    }
    
    /**
     * Add pivot field into into pivot table
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPivotTablesPutPivotTableFieldTest() throws ApiException {
        String name =PivTestFile;;
        String sheetName = SHEET4;
        Integer pivotTableIndex = 0;
        String pivotFieldType = "Row";
        PivotTableFieldRequest request =  new PivotTableFieldRequest();
        List<Integer> data = new ArrayList<Integer>();
        data.add(1);
        request.setData(data);
        Boolean needReCalculate = null;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPivotTablesPutPivotTableField(name, sheetName, pivotTableIndex, pivotFieldType, request, needReCalculate, folder,null);

        // TODO: test validations
    }
    
    /**
     * Add a pivot table into worksheet.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPivotTablesPutWorksheetPivotTableTest() throws ApiException {
        String name =PivTestFile;
        String sheetName = SHEET4;       
        String folder = TEMPFOLDER;
        String sourceData = "Sheet1!C6:E13";
        String destCellName = "C1";
        String tableName = "TestPivot";
        Boolean useSameSource = true;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPivotTablesPutWorksheetPivotTable(name, sheetName, null, folder,null, sourceData, destCellName, tableName, useSameSource);

        // TODO: test validations
    }
    
    /**
     * Add pivot filter for piovt table index
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsPivotTablesPutAndDeleteWorksheetPivotTableFilterTest() throws ApiException {
        String name =PivTestFile;;
        String sheetName = SHEET4;
        Integer pivotTableIndex = 0;
        PivotFilter filter = new PivotFilter();
        filter.setFieldIndex(0);
        filter.setFilterType("Count");
        AutoFilter autoFilter = new AutoFilter();
        List<FilterColumn> listFC = new ArrayList<FilterColumn>();
        FilterColumn filterColumn = new FilterColumn();
        filterColumn.setFilterType( "Top10");
        filterColumn.setFieldIndex ( 0);
        Top10Filter top = new Top10Filter();
        top.setItems(1);
        top.setIsPercent(true);
        top.setIsTop(true);
        filterColumn.setTop10Filter(top);
        listFC.add(filterColumn);
        Boolean needReCalculate = true;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        CellsCloudResponse response = api.cellsPivotTablesPutWorksheetPivotTableFilter(name, sheetName, pivotTableIndex, filter, needReCalculate, folder,null);
        Assert.assertEquals("cellsPivotTablesPutWorksheetPivotTableFilterTest is OK.", "OK", response.getStatus());
        
        Integer fieldIndex = 0;
        CellsCloudResponse response1 = api.cellsPivotTablesDeleteWorksheetPivotTableFilter(name, sheetName, pivotTableIndex, fieldIndex, needReCalculate, folder,null);
        Assert.assertEquals("cellsPivotTablesPutWorksheetPivotTableFilterTest is OK.", "OK", response1.getStatus());
    }
    
}
