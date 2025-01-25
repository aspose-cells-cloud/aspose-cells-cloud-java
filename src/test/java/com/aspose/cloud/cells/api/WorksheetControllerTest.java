/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="WorksheetControllerTests.java">
 *   Copyright (c) 2025 Aspose.Cells Cloud
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


public class WorksheetControllerTest {
    private String remoteFolder = "TestData/In";

    private  CellsApi api;
    public WorksheetControllerTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void GetWorksheetsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetsRequest request = new GetWorksheetsRequest();
        request.setName(remoteName);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        WorksheetsResponse response =  this.api.getWorksheets(request);
    }


    @Test
    public void GetWorksheetWithFormatTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetWithFormatRequest request = new GetWorksheetWithFormatRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFormat("png");

        request.setPageIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        File response =  this.api.getWorksheetWithFormat(request);
    }


    @Test
    public void PutChangeVisibilityWorksheetTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutChangeVisibilityWorksheetRequest request = new PutChangeVisibilityWorksheetRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setIsVisible(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putChangeVisibilityWorksheet(request);
    }


    @Test
    public void PutActiveWorksheetTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutActiveWorksheetRequest request = new PutActiveWorksheetRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putActiveWorksheet(request);
    }


    @Test
    public void PutInsertNewWorksheetTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutInsertNewWorksheetRequest request = new PutInsertNewWorksheetRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setIndex(1);

        request.setSheettype("VB");

        request.setNewsheetname("VBASheet");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putInsertNewWorksheet(request);
    }


    @Test
    public void PutAddNewWorksheetTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutAddNewWorksheetRequest request = new PutAddNewWorksheetRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setPosition(0);

        request.setSheettype("VB");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putAddNewWorksheet(request);
    }


    @Test
    public void DeleteWorksheetTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetRequest request = new DeleteWorksheetRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheet(request);
    }


    @Test
    public void DeleteWorksheetsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetsRequest request = new DeleteWorksheetsRequest();
        request.setName(remoteName);

        MatchConditionRequest matchCondition = new MatchConditionRequest();
        matchCondition.setRegexPattern("{*}");

        request.setMatchCondition(matchCondition);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheets(request);
    }


    @Test
    public void PostMoveWorksheetTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostMoveWorksheetRequest request = new PostMoveWorksheetRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        WorksheetMovingRequest moving = new WorksheetMovingRequest();
        moving.setDestinationWorksheet("Sheet4");


        moving.setPosition("After");

        request.setMoving(moving);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postMoveWorksheet(request);
    }


    @Test
    public void PutProtectWorksheetTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutProtectWorksheetRequest request = new PutProtectWorksheetRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        ProtectSheetParameter protectParameter = new ProtectSheetParameter();
        protectParameter.setProtectionType("ALL");


        protectParameter.setPassword("123");

        request.setProtectParameter(protectParameter);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putProtectWorksheet(request);
    }


    @Test
    public void DeleteUnprotectWorksheetTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteUnprotectWorksheetRequest request = new DeleteUnprotectWorksheetRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        ProtectSheetParameter protectParameter = new ProtectSheetParameter();
        protectParameter.setProtectionType("ALL");


        protectParameter.setPassword("123");

        request.setProtectParameter(protectParameter);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteUnprotectWorksheet(request);
    }


    @Test
    public void GetWorksheetTextItemsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetTextItemsRequest request = new GetWorksheetTextItemsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        TextItemsResponse response =  this.api.getWorksheetTextItems(request);
    }


    @Test
    public void GetWorksheetCommentsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetCommentsRequest request = new GetWorksheetCommentsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CommentsResponse response =  this.api.getWorksheetComments(request);
    }


    @Test
    public void GetWorksheetCommentTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetCommentRequest request = new GetWorksheetCommentRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setCellName("B3");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CommentResponse response =  this.api.getWorksheetComment(request);
    }


    @Test
    public void PutWorksheetCommentTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorksheetCommentRequest request = new PutWorksheetCommentRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setCellName("C1");

        Comment comment = new Comment();
        comment.setAuthor("aspose cells developer");


        comment.setNote("aspose cells cloud api add comment.");

        request.setComment(comment);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CommentResponse response =  this.api.putWorksheetComment(request);
    }


    @Test
    public void PostWorksheetCommentTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetCommentRequest request = new PostWorksheetCommentRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setCellName("B3");

        Comment comment = new Comment();
        comment.setAuthor("aspose cells developer");


        comment.setNote("aspose cells cloud api update comment.");

        request.setComment(comment);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetComment(request);
    }


    @Test
    public void DeleteWorksheetCommentTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetCommentRequest request = new DeleteWorksheetCommentRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setCellName("B3");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetComment(request);
    }


    @Test
    public void DeleteWorksheetCommentsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetCommentsRequest request = new DeleteWorksheetCommentsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetComments(request);
    }


    @Test
    public void GetWorksheetMergedCellsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetMergedCellsRequest request = new GetWorksheetMergedCellsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        MergedCellsResponse response =  this.api.getWorksheetMergedCells(request);
    }


    @Test
    public void GetWorksheetMergedCellTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetMergedCellRequest request = new GetWorksheetMergedCellRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setMergedCellIndex(0);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        MergedCellResponse response =  this.api.getWorksheetMergedCell(request);
    }


    @Test
    public void GetWorksheetCalculateFormulaTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetCalculateFormulaRequest request = new GetWorksheetCalculateFormulaRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFormula("=NOW()");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        SingleValueResponse response =  this.api.getWorksheetCalculateFormula(request);
    }


    @Test
    public void PostWorksheetCalculateFormulaTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetCalculateFormulaRequest request = new PostWorksheetCalculateFormulaRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFormula("=NOW()");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        SingleValueResponse response =  this.api.postWorksheetCalculateFormula(request);
    }


    @Test
    public void PostWorksheetTextSearchTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetTextSearchRequest request = new PostWorksheetTextSearchRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setText("123");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        TextItemsResponse response =  this.api.postWorksheetTextSearch(request);
    }


    @Test
    public void PostWorksheetTextReplaceTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetTextReplaceRequest request = new PostWorksheetTextReplaceRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setOldValue("123");

        request.setNewValue("456");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        WorksheetReplaceResponse response =  this.api.postWorksheetTextReplace(request);
    }


    @Test
    public void PostWorksheetRangeSortTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetRangeSortRequest request = new PostWorksheetRangeSortRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setCellArea("A1:C10");

        DataSorter dataSorter = new DataSorter();
        dataSorter.setCaseSensitive(true);

        request.setDataSorter(dataSorter);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetRangeSort(request);
    }


    @Test
    public void PostAutofitWorksheetRowTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostAutofitWorksheetRowRequest request = new PostAutofitWorksheetRowRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setRowIndex(1);

        request.setFirstColumn(1);

        request.setLastColumn(8);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postAutofitWorksheetRow(request);
    }


    @Test
    public void PostAutofitWorksheetRowsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostAutofitWorksheetRowsRequest request = new PostAutofitWorksheetRowsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setStartRow(1);

        request.setEndRow(9);

        request.setOnlyAuto(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postAutofitWorksheetRows(request);
    }


    @Test
    public void PostAutofitWorksheetColumnsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostAutofitWorksheetColumnsRequest request = new PostAutofitWorksheetColumnsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setStartColumn(1);

        request.setEndColumn(9);

        request.setOnlyAuto(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postAutofitWorksheetColumns(request);
    }


    @Test
    public void PutWorksheetBackgroundTest() throws Exception {
        String localName = "Book1.xlsx";
        String waterMarkPNG = "WaterMark.png";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
        CellsApiUtil.Upload(api,  remoteFolder + "/WaterMark.png" , waterMarkPNG , "");
       
        PutWorksheetBackgroundRequest request = new PutWorksheetBackgroundRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setPicPath(remoteFolder + "/WaterMark.png");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorksheetBackground(request);
    }


    @Test
    public void DeleteWorksheetBackgroundTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetBackgroundRequest request = new DeleteWorksheetBackgroundRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetBackground(request);
    }


    @Test
    public void PutWorksheetFreezePanesTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutWorksheetFreezePanesRequest request = new PutWorksheetFreezePanesRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setRow(1);

        request.setColumn(1);

        request.setFreezedRows(4);

        request.setFreezedColumns(5);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putWorksheetFreezePanes(request);
    }


    @Test
    public void DeleteWorksheetFreezePanesTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetFreezePanesRequest request = new DeleteWorksheetFreezePanesRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setRow(1);

        request.setColumn(1);

        request.setFreezedRows(4);

        request.setFreezedColumns(5);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetFreezePanes(request);
    }


    @Test
    public void PostCopyWorksheetTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostCopyWorksheetRequest request = new PostCopyWorksheetRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet15");

        request.setSourceSheet("Sheet6");

        CopyOptions options = new CopyOptions();
        options.setColumnCharacterWidth(true);

        request.setOptions(options);

        request.setSourceWorkbook("");

        request.setSourceFolder("");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postCopyWorksheet(request);
    }


    @Test
    public void PostRenameWorksheetTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostRenameWorksheetRequest request = new PostRenameWorksheetRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet5");

        request.setNewname("Sheet55");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postRenameWorksheet(request);
    }


    @Test
    public void PostUpdateWorksheetPropertyTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostUpdateWorksheetPropertyRequest request = new PostUpdateWorksheetPropertyRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet5");

        Worksheet sheet = new Worksheet();
        sheet.setName("sheet65");


        sheet.setIsGridlinesVisible(true);

        request.setSheet(sheet);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postUpdateWorksheetProperty(request);
    }


    @Test
    public void GetNamedRangesTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetNamedRangesRequest request = new GetNamedRangesRequest();
        request.setName(remoteName);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        RangesResponse response =  this.api.getNamedRanges(request);
    }


    @Test
    public void GetNamedRangeValueTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetNamedRangeValueRequest request = new GetNamedRangeValueRequest();
        request.setName(remoteName);

        request.setNamerange("Name_2");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        RangeValueResponse response =  this.api.getNamedRangeValue(request);
    }


    @Test
    public void PostUpdateWorksheetZoomTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostUpdateWorksheetZoomRequest request = new PostUpdateWorksheetZoomRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setValue(90);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postUpdateWorksheetZoom(request);
    }


    @Test
    public void GetWorksheetPageCountTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetPageCountRequest request = new GetWorksheetPageCountRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        Integer response =  this.api.getWorksheetPageCount(request);
    }


}
