/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ListObjectsControllerTests.java">
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


public class ListObjectsControllerTest {
    private String remoteFolder = "TestData/In";

    private  CellsApi api;
    public ListObjectsControllerTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void GetWorksheetListObjectsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetListObjectsRequest request = new GetWorksheetListObjectsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet7");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        ListObjectsResponse response =  this.api.getWorksheetListObjects(request);
    }


    @Test
    public void GetWorksheetListObjectTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetListObjectRequest request = new GetWorksheetListObjectRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet7");

        request.setListobjectindex(0);

        request.setFormat("pdf");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        File response =  this.api.getWorksheetListObject(request);
    }


    @Test
    public void PutWorksheetListObjectTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorksheetListObjectRequest request = new PutWorksheetListObjectRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet7");

        request.setStartRow(1);

        request.setStartColumn(1);

        request.setEndRow(6);

        request.setEndColumn(6);

        request.setFolder(remoteFolder);

        request.setHasHeaders(true);

        request.setDisplayName("true");

        request.setShowTotals(false);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorksheetListObject(request);
    }


    @Test
    public void DeleteWorksheetListObjectsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetListObjectsRequest request = new DeleteWorksheetListObjectsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet7");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetListObjects(request);
    }


    @Test
    public void DeleteWorksheetListObjectTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetListObjectRequest request = new DeleteWorksheetListObjectRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet7");

        request.setListObjectIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetListObject(request);
    }


    @Test
    public void PostWorksheetListObjectTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetListObjectRequest request = new PostWorksheetListObjectRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet7");

        request.setListObjectIndex(0);

        ListObject listObject = new ListObject();
        listObject.setShowHeaderRow(true);

        request.setListObject(listObject);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetListObject(request);
    }


    @Test
    public void PostWorksheetListObjectConvertToRangeTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetListObjectConvertToRangeRequest request = new PostWorksheetListObjectConvertToRangeRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet7");

        request.setListObjectIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetListObjectConvertToRange(request);
    }


    @Test
    public void PostWorksheetListObjectSummarizeWithPivotTableTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetListObjectSummarizeWithPivotTableRequest request = new PostWorksheetListObjectSummarizeWithPivotTableRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet7");

        request.setListObjectIndex(0);

        request.setDestsheetName("Sheet2");

        CreatePivotTableRequest createPivotTableRequest = new CreatePivotTableRequest();
        createPivotTableRequest.setDestCellName("C1");


        createPivotTableRequest.setName("testp");


        createPivotTableRequest.setSourceData("=Sheet2!A1:E8");


        createPivotTableRequest.setUseSameSource(true);

         
        ArrayList<Integer> createPivotTableRequestPivotFieldColumns = new ArrayList<Integer>();
        createPivotTableRequest.setPivotFieldColumns(createPivotTableRequestPivotFieldColumns);

         
        ArrayList<Integer> createPivotTableRequestPivotFieldData = new ArrayList<Integer>();
        createPivotTableRequest.setPivotFieldData(createPivotTableRequestPivotFieldData);

         
        ArrayList<Integer> createPivotTableRequestPivotFieldRows = new ArrayList<Integer>();
        createPivotTableRequest.setPivotFieldRows(createPivotTableRequestPivotFieldRows);

        request.setCreatePivotTableRequest(createPivotTableRequest);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetListObjectSummarizeWithPivotTable(request);
    }


    @Test
    public void PostWorksheetListObjectSortTableTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetListObjectSortTableRequest request = new PostWorksheetListObjectSortTableRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet7");

        request.setListObjectIndex(0);

        DataSorter dataSorter = new DataSorter();
        dataSorter.setCaseSensitive(true);

        request.setDataSorter(dataSorter);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetListObjectSortTable(request);
    }


    @Test
    public void PostWorksheetListColumnTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetListColumnRequest request = new PostWorksheetListColumnRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet7");

        request.setListObjectIndex(0);

        request.setColumnIndex(0);

        ListColumn listColumn = new ListColumn();
        listColumn.setName("test cloumn");

        request.setListColumn(listColumn);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetListColumn(request);
    }


    @Test
    public void PostWorksheetListColumnsTotalTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetListColumnsTotalRequest request = new PostWorksheetListColumnsTotalRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet7");

        request.setListObjectIndex(0);
         
        ArrayList<TableTotalRequest> tableTotalRequests = new ArrayList<TableTotalRequest>();
        TableTotalRequest tableTotalRequest = new TableTotalRequest();
        tableTotalRequest.setListColumnIndex(1);


        tableTotalRequest.setTotalsCalculation("Average");

        tableTotalRequests.add(tableTotalRequest);

        request.setTableTotalRequests(tableTotalRequests);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetListColumnsTotal(request);
    }

    

    @Test
    public void PostWorksheetListObjectRemoveDuplicatesTest() throws Exception {
        String localName = "TestTables.xlsx";
        String remoteName = "TestTables.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetListObjectRemoveDuplicatesRequest request = new PostWorksheetListObjectRemoveDuplicatesRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet2");

        request.setListObjectIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetListObjectRemoveDuplicates(request);
    }


    @Test
    public void PostWorksheetListObjectInsertSlicerTest() throws Exception {
        String localName = "TestTables.xlsx";
        String remoteName = "TestTables.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetListObjectInsertSlicerRequest request = new PostWorksheetListObjectInsertSlicerRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setListObjectIndex(0);

        request.setColumnIndex(2);

        request.setDestCellName("j9");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetListObjectInsertSlicer(request);
    }

}
