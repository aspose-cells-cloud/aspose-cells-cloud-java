/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CellsControllerTests.java">
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


public class CellsControllerTest {
    private String remoteFolder = "TestData/In";

    private  CellsApi api;
    public CellsControllerTest(){
        try {
            api = new CellsApi(CellsApiUtil.GetClientId(),CellsApiUtil.GetClientSecret(),CellsApiUtil.GetAPIVersion(),CellsApiUtil.GetBaseUrl());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void PostClearContentsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostClearContentsRequest request = new PostClearContentsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setRange("A1:C10");

        request.setStartRow(1);

        request.setStartColumn(1);

        request.setEndRow(3);

        request.setEndColumn(3);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postClearContents(request);
    }


    @Test
    public void PostClearFormatsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostClearFormatsRequest request = new PostClearFormatsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setRange("A1:C10");

        request.setStartRow(1);

        request.setStartColumn(1);

        request.setEndRow(3);

        request.setEndColumn(3);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postClearFormats(request);
    }


    @Test
    public void PostUpdateWorksheetRangeStyleTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostUpdateWorksheetRangeStyleRequest request = new PostUpdateWorksheetRangeStyleRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setRange("A1:C10");

        Style style = new Style();
        Font font = new Font();
        font.setSize(16);

        style.setFont(font);

        request.setStyle(style);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postUpdateWorksheetRangeStyle(request);
    }


    @Test
    public void PostWorksheetMergeTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetMergeRequest request = new PostWorksheetMergeRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setStartRow(1);

        request.setStartColumn(1);

        request.setTotalRows(4);

        request.setTotalColumns(4);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetMerge(request);
    }


    @Test
    public void PostWorksheetUnmergeTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetUnmergeRequest request = new PostWorksheetUnmergeRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setStartRow(1);

        request.setStartColumn(1);

        request.setTotalRows(4);

        request.setTotalColumns(4);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postWorksheetUnmerge(request);
    }


    @Test
    public void GetWorksheetCellsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetCellsRequest request = new GetWorksheetCellsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setOffest(1);

        request.setCount(10);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsResponse response =  this.api.getWorksheetCells(request);
    }


    @Test
    public void GetWorksheetCellTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetCellRequest request = new GetWorksheetCellRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setCellOrMethodName("A1");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        String response =  this.api.getWorksheetCell(request);
    }


    @Test
    public void GetWorksheetCellStyleTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetCellStyleRequest request = new GetWorksheetCellStyleRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setCellName("A1");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        StyleResponse response =  this.api.getWorksheetCellStyle(request);
    }


    @Test
    public void PostWorksheetCellSetValueTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostWorksheetCellSetValueRequest request = new PostWorksheetCellSetValueRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setCellName("A1");

        request.setValue("1");

        request.setType("int");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellResponse response =  this.api.postWorksheetCellSetValue(request);
    }


    @Test
    public void PostUpdateWorksheetCellStyleTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostUpdateWorksheetCellStyleRequest request = new PostUpdateWorksheetCellStyleRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setCellName("A1");

        Style style = new Style();
        Font font = new Font();
        font.setSize(16);

        style.setFont(font);

        request.setStyle(style);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postUpdateWorksheetCellStyle(request);
    }


    @Test
    public void PostSetCellRangeValueTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostSetCellRangeValueRequest request = new PostSetCellRangeValueRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setCellarea("A1:C10");

        request.setValue("Test");

        request.setType("string");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postSetCellRangeValue(request);
    }


    @Test
    public void PostCopyCellIntoCellTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostCopyCellIntoCellRequest request = new PostCopyCellIntoCellRequest();
        request.setName(remoteName);

        request.setDestCellName("C1");

        request.setSheetName("Sheet1");

        request.setWorksheet("Sheet2");

        request.setCellname("A1");

        request.setRow(1);

        request.setColumn(1);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postCopyCellIntoCell(request);
    }


    @Test
    public void GetCellHtmlStringTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetCellHtmlStringRequest request = new GetCellHtmlStringRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setCellName("A1");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        String response =  this.api.getCellHtmlString(request);
    }


    @Test
    public void PostSetCellHtmlStringTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostSetCellHtmlStringRequest request = new PostSetCellHtmlStringRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setCellName("A1");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postSetCellHtmlString(request);
    }


    @Test
    public void PostCellCalculateTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostCellCalculateRequest request = new PostCellCalculateRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setCellName("A1");

        CalculationOptions options = new CalculationOptions();
        options.setRecursive(true);


        options.setIgnoreError(true);

        request.setOptions(options);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postCellCalculate(request);
    }


    @Test
    public void PostCellCharactersTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostCellCharactersRequest request = new PostCellCharactersRequest();
         
        ArrayList<FontSetting> options = new ArrayList<FontSetting>();
        FontSetting value = new FontSetting();
        value.setLength(5);


        value.setStartIndex(0);


        Font font = new Font();
        font.setIsBold(true);


        font.setSize(16);

        value.setFont(font);

        options.add(value);

        request.setOptions(options);

        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setCellName("E36");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postCellCharacters(request);
    }


    @Test
    public void GetWorksheetColumnsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetColumnsRequest request = new GetWorksheetColumnsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setOffset(1);

        request.setCount(10);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        ColumnsResponse response =  this.api.getWorksheetColumns(request);
    }


    @Test
    public void PostSetWorksheetColumnWidthTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostSetWorksheetColumnWidthRequest request = new PostSetWorksheetColumnWidthRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setColumnIndex(1);

        request.setWidth(10.9);

        request.setCount(10);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postSetWorksheetColumnWidth(request);
    }


    @Test
    public void GetWorksheetColumnTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetColumnRequest request = new GetWorksheetColumnRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setColumnIndex(1);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        ColumnResponse response =  this.api.getWorksheetColumn(request);
    }


    @Test
    public void PutInsertWorksheetColumnsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutInsertWorksheetColumnsRequest request = new PutInsertWorksheetColumnsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setColumnIndex(1);

        request.setColumns(10);

        request.setUpdateReference(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putInsertWorksheetColumns(request);
    }


    @Test
    public void DeleteWorksheetColumnsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetColumnsRequest request = new DeleteWorksheetColumnsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setColumnIndex(1);

        request.setColumns(10);

        request.setUpdateReference(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetColumns(request);
    }


    @Test
    public void PostHideWorksheetColumnsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostHideWorksheetColumnsRequest request = new PostHideWorksheetColumnsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setStartColumn(1);

        request.setTotalColumns(10);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postHideWorksheetColumns(request);
    }


    @Test
    public void PostUnhideWorksheetColumnsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostUnhideWorksheetColumnsRequest request = new PostUnhideWorksheetColumnsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setStartColumn(1);

        request.setTotalColumns(10);

        request.setWidth(10.9);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postUnhideWorksheetColumns(request);
    }


    @Test
    public void PostGroupWorksheetColumnsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostGroupWorksheetColumnsRequest request = new PostGroupWorksheetColumnsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFirstIndex(1);

        request.setLastIndex(9);

        request.setHide(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postGroupWorksheetColumns(request);
    }


    @Test
    public void PostUngroupWorksheetColumnsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostUngroupWorksheetColumnsRequest request = new PostUngroupWorksheetColumnsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFirstIndex(1);

        request.setLastIndex(9);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postUngroupWorksheetColumns(request);
    }


    @Test
    public void PostCopyWorksheetColumnsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostCopyWorksheetColumnsRequest request = new PostCopyWorksheetColumnsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setSourceColumnIndex(1);

        request.setDestinationColumnIndex(19);

        request.setColumnNumber(8);

        request.setWorksheet("Sheet2");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postCopyWorksheetColumns(request);
    }


    @Test
    public void PostColumnStyleTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostColumnStyleRequest request = new PostColumnStyleRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setColumnIndex(1);

        Style style = new Style();
        Font font = new Font();
        font.setSize(16);

        style.setFont(font);

        request.setStyle(style);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postColumnStyle(request);
    }


    @Test
    public void GetWorksheetRowsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetRowsRequest request = new GetWorksheetRowsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setOffset(1);

        request.setCount(10);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        RowsResponse response =  this.api.getWorksheetRows(request);
    }


    @Test
    public void GetWorksheetRowTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        GetWorksheetRowRequest request = new GetWorksheetRowRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setRowIndex(1);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        RowResponse response =  this.api.getWorksheetRow(request);
    }


    @Test
    public void DeleteWorksheetRowTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetRowRequest request = new DeleteWorksheetRowRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setRowIndex(1);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetRow(request);
    }


    @Test
    public void DeleteWorksheetRowsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        DeleteWorksheetRowsRequest request = new DeleteWorksheetRowsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setStartrow(1);

        request.setTotalRows(10);

        request.setUpdateReference(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.deleteWorksheetRows(request);
    }


    @Test
    public void PutInsertWorksheetRowsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutInsertWorksheetRowsRequest request = new PutInsertWorksheetRowsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setStartrow(1);

        request.setTotalRows(10);

        request.setUpdateReference(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putInsertWorksheetRows(request);
    }


    @Test
    public void PutInsertWorksheetRowTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PutInsertWorksheetRowRequest request = new PutInsertWorksheetRowRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setRowIndex(1);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.putInsertWorksheetRow(request);
    }


    @Test
    public void PostUpdateWorksheetRowTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostUpdateWorksheetRowRequest request = new PostUpdateWorksheetRowRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setRowIndex(1);

        request.setHeight(10.8);

        request.setCount(9);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postUpdateWorksheetRow(request);
    }


    @Test
    public void PostHideWorksheetRowsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostHideWorksheetRowsRequest request = new PostHideWorksheetRowsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setStartrow(1);

        request.setTotalRows(6);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postHideWorksheetRows(request);
    }


    @Test
    public void PostUnhideWorksheetRowsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostUnhideWorksheetRowsRequest request = new PostUnhideWorksheetRowsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setStartrow(1);

        request.setTotalRows(8);

        request.setHeight(10.9);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postUnhideWorksheetRows(request);
    }


    @Test
    public void PostGroupWorksheetRowsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostGroupWorksheetRowsRequest request = new PostGroupWorksheetRowsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFirstIndex(1);

        request.setLastIndex(9);

        request.setHide(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postGroupWorksheetRows(request);
    }


    @Test
    public void PostUngroupWorksheetRowsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostUngroupWorksheetRowsRequest request = new PostUngroupWorksheetRowsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setFirstIndex(1);

        request.setLastIndex(9);

        request.setIsAll(true);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postUngroupWorksheetRows(request);
    }


    @Test
    public void PostCopyWorksheetRowsTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostCopyWorksheetRowsRequest request = new PostCopyWorksheetRowsRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setSourceRowIndex(1);

        request.setDestinationRowIndex(12);

        request.setRowNumber(5);

        request.setWorksheet("Sheet2");

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postCopyWorksheetRows(request);
    }


    @Test
    public void PostRowStyleTest() throws Exception {
        String localName = "Book1.xlsx";
        String remoteName = "Book1.xlsx";

        CellsApiUtil.Upload(api,  remoteFolder + "/" + remoteName , localName , "");
       
        PostRowStyleRequest request = new PostRowStyleRequest();
        request.setName(remoteName);

        request.setSheetName("Sheet1");

        request.setRowIndex(1);

        Style style = new Style();
        Font font = new Font();
        font.setSize(16);

        style.setFont(font);

        request.setStyle(style);

        request.setFolder(remoteFolder);

        request.setStorageName("");

        CellsCloudResponse response =  this.api.postRowStyle(request);
    }


}
