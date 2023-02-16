/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PivotTablesControllerTests.java">
 *   Copyright (c) 2023 Aspose.Cells Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------
 */

package com.aspose.cloud.cells.api;

import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.aspose.cloud.cells.request.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.HashMap;
import junit.framework.Assert;


public class PivotTablesControllerTest {
    private String remoteFolder = "TestData/In";

    private  CellsApi api;
    public PivotTablesControllerTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void GetWorksheetPivotTablesTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetPivotTablesRequest request = new GetWorksheetPivotTablesRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        PivotTablesResponse response =  this.api.getWorksheetPivotTables(request);
    }


    @Test
    public void GetWorksheetPivotTableTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetPivotTableRequest request = new GetWorksheetPivotTableRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setPivottableIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        PivotTableResponse response =  this.api.getWorksheetPivotTable(request);
    }


    @Test
    public void GetPivotTableFieldTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetPivotTableFieldRequest request = new GetPivotTableFieldRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setPivotTableIndex(0);

        request.setPivotFieldIndex(0);

        request.setPivotFieldType("Row");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        PivotFieldResponse response =  this.api.getPivotTableField(request);
    }


    @Test
    public void GetWorksheetPivotTableFiltersTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetPivotTableFiltersRequest request = new GetWorksheetPivotTableFiltersRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet3");

        request.setPivotTableIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        PivotFiltersResponse response =  this.api.getWorksheetPivotTableFilters(request);
    }


    @Test
    public void GetWorksheetPivotTableFilterTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetPivotTableFilterRequest request = new GetWorksheetPivotTableFilterRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet3");

        request.setPivotTableIndex(0);

        request.setFilterIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        PivotFilterResponse response =  this.api.getWorksheetPivotTableFilter(request);
    }


    @Test
    public void PutWorksheetPivotTableTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorksheetPivotTableRequest request = new PutWorksheetPivotTableRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet3");

        request.setFolder(remoteFolder);

        request.setSourceData("=Sheet1!C6:E13");

        request.setDestCellName("C1");

        request.setTableName("TestPivot");

        request.setUseSameSource(true);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorksheetPivotTable(request);
    }


    @Test
    public void PutPivotTableFieldTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutPivotTableFieldRequest request = new PutPivotTableFieldRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setPivotTableIndex(0);

        request.setPivotFieldType("Row");

        PivotTableFieldRequest pivotTableFieldRequest = new PivotTableFieldRequest();
         
        ArrayList<Integer> pivotTableFieldRequestData = new ArrayList<Integer>();
        pivotTableFieldRequest.setData(pivotTableFieldRequestData);

        request.setPivotTableFieldRequest(pivotTableFieldRequest);

        request.setNeedReCalculate(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putPivotTableField(request);
    }


    @Test
    public void PutWorksheetPivotTableFilterTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorksheetPivotTableFilterRequest request = new PutWorksheetPivotTableFilterRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setPivotTableIndex(0);

        PivotFilter filter = new PivotFilter();
        filter.setFieldIndex(1);


        filter.setFilterType("Count");

        request.setFilter(filter);

        request.setNeedReCalculate(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorksheetPivotTableFilter(request);
    }


    @Test
    public void PostPivotTableFieldHideItemTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostPivotTableFieldHideItemRequest request = new PostPivotTableFieldHideItemRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setPivotTableIndex(0);

        request.setPivotFieldType("Row");

        request.setFieldIndex(0);

        request.setItemIndex(1);

        request.setIsHide(true);

        request.setNeedReCalculate(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postPivotTableFieldHideItem(request);
    }


    @Test
    public void PostPivotTableFieldMoveToTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostPivotTableFieldMoveToRequest request = new PostPivotTableFieldMoveToRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setPivotTableIndex(0);

        request.setFieldIndex(0);

        request.setFrom("Row");

        request.setTo("Column");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postPivotTableFieldMoveTo(request);
    }


    @Test
    public void PostPivotTableCellStyleTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostPivotTableCellStyleRequest request = new PostPivotTableCellStyleRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setPivotTableIndex(0);

        request.setColumn(1);

        request.setRow(1);

        Style style = new Style();
        Font font = new Font();
        font.setSize(16);

        style.setFont(font);

        request.setStyle(style);

        request.setNeedReCalculate(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postPivotTableCellStyle(request);
    }


    @Test
    public void PostPivotTableStyleTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostPivotTableStyleRequest request = new PostPivotTableStyleRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setPivotTableIndex(0);

        Style style = new Style();
        Font font = new Font();
        font.setSize(16);

        style.setFont(font);

        request.setStyle(style);

        request.setNeedReCalculate(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postPivotTableStyle(request);
    }


    @Test
    public void PostPivotTableUpdatePivotFieldsTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostPivotTableUpdatePivotFieldsRequest request = new PostPivotTableUpdatePivotFieldsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setPivotTableIndex(0);

        request.setPivotFieldType("Row");

        PivotField pivotField = new PivotField();
        pivotField.setShowCompact(true);

        request.setPivotField(pivotField);

        request.setNeedReCalculate(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postPivotTableUpdatePivotFields(request);
    }


    @Test
    public void PostPivotTableUpdatePivotFieldTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostPivotTableUpdatePivotFieldRequest request = new PostPivotTableUpdatePivotFieldRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setPivotTableIndex(0);

        request.setPivotFieldIndex(0);

        request.setPivotFieldType("Row");

        PivotField pivotField = new PivotField();
        pivotField.setShowCompact(true);

        request.setPivotField(pivotField);

        request.setNeedReCalculate(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postPivotTableUpdatePivotField(request);
    }


    @Test
    public void PostWorksheetPivotTableCalculateTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetPivotTableCalculateRequest request = new PostWorksheetPivotTableCalculateRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setPivotTableIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetPivotTableCalculate(request);
    }


    @Test
    public void PostWorksheetPivotTableMoveTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetPivotTableMoveRequest request = new PostWorksheetPivotTableMoveRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setPivotTableIndex(0);

        request.setRow(1);

        request.setColumn(1);

        request.setDestCellName("C10");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetPivotTableMove(request);
    }


    @Test
    public void DeleteWorksheetPivotTablesTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetPivotTablesRequest request = new DeleteWorksheetPivotTablesRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetPivotTables(request);
    }


    @Test
    public void DeleteWorksheetPivotTableTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetPivotTableRequest request = new DeleteWorksheetPivotTableRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setPivotTableIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetPivotTable(request);
    }


    @Test
    public void DeletePivotTableFieldTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeletePivotTableFieldRequest request = new DeletePivotTableFieldRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setPivotTableIndex(0);

        request.setPivotFieldType("Row");

        PivotTableFieldRequest pivotTableFieldRequest = new PivotTableFieldRequest();
         
        ArrayList<Integer> pivotTableFieldRequestData = new ArrayList<Integer>();
        pivotTableFieldRequest.setData(pivotTableFieldRequestData);

        request.setPivotTableFieldRequest(pivotTableFieldRequest);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deletePivotTableField(request);
    }


    @Test
    public void DeleteWorksheetPivotTableFiltersTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetPivotTableFiltersRequest request = new DeleteWorksheetPivotTableFiltersRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet3");

        request.setPivotTableIndex(0);

        request.setNeedReCalculate(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetPivotTableFilters(request);
    }


    @Test
    public void DeleteWorksheetPivotTableFilterTest() throws Exception {
        String localName = "TestCase.xlsx";
        String remoteName = "TestCase.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetPivotTableFilterRequest request = new DeleteWorksheetPivotTableFilterRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet4");

        request.setPivotTableIndex(0);

        request.setFieldIndex(0);

        request.setNeedReCalculate(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetPivotTableFilter(request);
    }


}
