package com.aspose.cloud.cells.api;
import com.aspose.cloud.cells.client.ApiClient;
import com.aspose.cloud.cells.client.ApiException;
import com.aspose.cloud.cells.client.Configuration;


import com.aspose.cloud.cells.model.SparklineGroup;
import com.aspose.cloud.cells.model.SparklineGroupResponse;
import com.aspose.cloud.cells.model.SparklineGroups;
import com.aspose.cloud.cells.model.SparklineGroupsResponse;

import java.io.File;

import com.aspose.cloud.cells.model.Legend;
import com.aspose.cloud.cells.model.LegendResponse;
import com.aspose.cloud.cells.model.CellsCloudResponse;
import com.aspose.cloud.cells.model.Title;
import com.aspose.cloud.cells.model.TitleResponse;

import org.junit.Test;
import org.junit.Ignore;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.Assert;

/**
 * API tests for CellsChartsApi
 */

public class CellsSparklineGroupsApiTest {

    private  CellsApi api ;

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
    
    public CellsSparklineGroupsApiTest(){
    	try {
    		api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    /**
     * Hide legend in chart
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cellsSparklineGroupsApiGPPDTest() throws ApiException {
        String name = PivTestFile;
        String sheetName = SHEET1;
        Integer index = 0;
        String folder = TEMPFOLDER;
        CellsApiUtil.Upload(api, folder , name);
        SparklineGroupsResponse getsResponse = api.cellsSparklineGroupsGetWorksheetSparklineGroups(name, sheetName,  folder,null);
        Assert.assertEquals("cellsSparklineGroupsGetWorksheetSparklineGroups is OK.", "OK", getsResponse.getStatus());
        CellsCloudResponse putResponse = api.cellsSparklineGroupsPutWorksheetSparklineGroup(name, sheetName, "Line", "C6:E13", false, "G6:G13",folder, null);
        Assert.assertEquals("cellsSparklineGroupsPutWorksheetSparklineGroup is OK.", "OK", putResponse.getStatus());
        SparklineGroupResponse getResponse = api.cellsSparklineGroupsGetWorksheetSparklineGroup(name, sheetName, index, folder,null);
        Assert.assertEquals("cellsSparklineGroupsGetWorksheetSparklineGroup is OK.", "OK", getResponse.getStatus());
        SparklineGroup sparklineGroup = new SparklineGroup();
        sparklineGroup.setDisplayHidden(true);
        CellsCloudResponse postResponse = api.cellsSparklineGroupsPostWorksheetSparklineGroup(name, sheetName, index, sparklineGroup,folder,null);
        Assert.assertEquals("cellsSparklineGroupsPostWorksheetSparklineGroup is OK.", "OK", postResponse.getStatus());
        CellsCloudResponse delResponse = api.cellsSparklineGroupsDeleteWorksheetSparklineGroup(name, sheetName,index, folder,null);
        Assert.assertEquals("cellsSparklineGroupsPostWorksheetSparklineGroup is OK.", "OK", delResponse.getStatus());
        CellsCloudResponse delsResponse = api.cellsSparklineGroupsDeleteWorksheetSparklineGroups(name, sheetName, folder,null);
        Assert.assertEquals("cellsSparklineGroupsPostWorksheetSparklineGroup is OK.", "OK", delsResponse.getStatus());
        // TODO: test validations
    }
}